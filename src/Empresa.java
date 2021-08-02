public class Empresa{
    private Conteudo filiais;
    private String nome;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getUnidades() {
        if (filiais == null){
            throw new NullPointerException("Empresa sem filiais físicas");
        }
        return this.getNome()+":\n"+this.filiais.getConteudo();
    }

    public void setUnidades(Conteudo filiais) {
        this.filiais = filiais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
