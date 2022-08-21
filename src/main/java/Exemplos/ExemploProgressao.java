package Exemplos;

public class ExemploProgressao {
    public static long aritmetica(int ini, int razao, int nTermos){
        long res = ini;
        for(int t=0;t<nTermos;t++, res += razao){
            return res;
        }
        return res;
    }

    public static long geometrica(int ini, int razao, int nTermos){
        long res = ini;
        for(int t=0;t<nTermos;t++, res *= razao){
            return res;
        }
        return res;
    }
}
