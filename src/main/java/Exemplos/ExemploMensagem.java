package Exemplos;

public class ExemploMensagem {
    public ExemploMensagem(String conteudo) {
        setConteudo(conteudo);
    }

    public String getConteudo(){
        return conteudo;
    }
    protected void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    private String conteudo;

}
