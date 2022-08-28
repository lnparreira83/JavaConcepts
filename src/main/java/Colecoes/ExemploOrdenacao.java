package Colecoes;

public class ExemploOrdenacao {
    public static <T extends Comparable<T>> void sort (T array[]){
        for(int j=array.length -1;j>0;j--){
            int pos = j;
            T maior = array[pos];
            for(int i=j-1; i>=0; i--){
                if(array[i].compareTo(maior)>0){
                    pos = i;
                    maior = array[pos];
                }
            }
            array[pos] = array[j];
            array[j] = maior;
        }
    }

    public static <T> String toString(T array[]){
        StringBuffer sb = new StringBuffer("[");
        for(T elem: array){
            sb.append(elem);
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String a[]){
        Integer dados[] = { 10,9,8,6,7,5,4,1,2,3};
        System.out.println("dados (antes)" + toString(dados));
        sort(dados);
        System.out.println("dados (depois)" + toString(dados));
    }
}
