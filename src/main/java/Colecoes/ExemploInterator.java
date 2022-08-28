package Colecoes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ExemploInterator {
    public static String conteudo(Collection<?> colecao){
        Iterator<?> i = colecao.iterator();
        StringBuffer sb = new StringBuffer("[");
        if(i.hasNext()){
            sb.append("" + i.next());
        }
        sb.append("]");
        return sb.toString();
    }



    public static void main(String args[]){
        Collection<?> col = Arrays.asList(args);
        System.out.println(ExemploInterator.conteudo(col));
    }
}
