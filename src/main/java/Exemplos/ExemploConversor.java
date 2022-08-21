package Exemplos;

public class ExemploConversor {
    protected double kProp;
    protected double kLin;

    public ExemploConversor(double kProp, double kLin) {
        this.kProp = kProp;
        this.kLin = kLin;
    }

    public double getkProp() {
        return kProp;
    }

    public double getkLin() {
        return kLin;
    }

    public double converter(double valor){
        return valor * kProp + kLin;
    }

    @Override
    public String toString() {
        return "Exemplos.ExemploConversor[" +
                "kProp=" + kProp +
                ", kLin=" + kLin +
                ']';
    }

}
