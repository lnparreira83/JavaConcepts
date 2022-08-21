package Exemplos;

public class ExemploThis {

    private double largura, altura;

    public ExemploThis(double largura, double altura) {
        this.setTamanho(largura,altura);
    }

    //metodos
    public void setTamanho(double largura, double altura) {
        if(largura>=0 && altura>=0){
            this.largura = largura;
            this.altura = altura;
        } else {
            throw new RuntimeException("Dimensões invalidas");
        }
    }

    public double getLargura(){
        return largura;
    }

    public double getAltura(){
        return altura;
    }

    @Override
    public String toString(){
        return "Retangulo[largura=" + largura + " , altura=" + altura + "]";
    }
}
