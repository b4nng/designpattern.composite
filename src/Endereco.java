public class Endereco extends Conteudo{

    private String observacao;

    public Endereco(String descricao, String observacao) {
        super(descricao);
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String getConteudo() {
        return "Endereco:"+this.getDescricao()+"\n"
                +"Observação: "+this.getObservacao()+"\n";
    }
}
