package Exemplos;

public class ExemploStrings {
    public static void main(String args[]){
        String info = "Java, Guia do Programador, 4 Edição";
        String[] partes = info.split(", ");
        System.out.println(partes[1]);
        for(String p: partes) if(p.charAt(0)=='4') System.out.println(p);

        StringBuilder palavra = new StringBuilder("");
        palavra.append("Batatinha");
        palavra.append(",");
        System.out.println(palavra);

        palavra.append("Arroz");
        System.out.println(palavra);
    }
}
