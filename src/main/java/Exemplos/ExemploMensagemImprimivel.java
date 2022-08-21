package Exemplos;

public class ExemploMensagemImprimivel extends ExemploMensagem implements ExemploInterface{

    public ExemploMensagemImprimivel(String conteudo) {
        super(conteudo);
    }

    @Override
    public void imprimir() {
        imprimirNoConsole();
    }

    @Override
    public void imprimirNoConsole() {
        System.out.println(ExemploInterface.INICIO);
        System.out.println(getConteudo());
        System.out.println(ExemploInterface.FIM);
    }
}
