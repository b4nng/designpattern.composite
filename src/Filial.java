import java.util.ArrayList;
import java.util.List;

public class Filial extends Conteudo{

    private List<Conteudo> enderecos;

    public Filial(String descricao) {
        super(descricao);
        this.enderecos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo) { this.enderecos.add(conteudo); }

    @Override
    public String getConteudo() {
        String conteudo = "";
        conteudo = "Filial: "+this.getDescricao()+"\n";
        for(Conteudo endereco : this.enderecos){
            conteudo += endereco.getConteudo();
        }
        return conteudo;
    }
}
