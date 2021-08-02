import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpresaTest {
    @Test
    public void deveRetornarFiliaisDaEmpresa(){
        Empresa empresa = new Empresa("Empresa X");
        Filial jf = new Filial("JotaEfe");
        Endereco endJF1 = new Endereco("Rua Halfeld, 31", "Do lado da prefeitura");
        Endereco endJF2 = new Endereco("Av. Itamar Franco, 855", "Em frente jesuitas");
        jf.addConteudo(endJF1);
        jf.addConteudo(endJF2);

        Filial bh = new Filial("Belorizontina");
        Endereco endBH1 = new Endereco("Av Brasil, 580", "Ao lado dos correios, predio branco");
        Endereco endBH2 = new Endereco("Rua Goias, 18", "Predio vermelho ao lado do cartorio");
        bh.addConteudo(endBH1);
        bh.addConteudo(endBH2);

        Filial central = new Filial("Central");
        central.addConteudo(jf);
        central.addConteudo(bh);

        Assertions.assertEquals("Filial: Central\n" +
                "Filial: JotaEfe\n" +
                "Endereco:Rua Halfeld, 31\n" +
                "Observação: Do lado da prefeitura\n" +
                "Endereco:Av. Itamar Franco, 855\n" +
                "Observação: Em frente jesuitas\n" +
                "Filial: Belorizontina\n" +
                "Endereco:Av Brasil, 580\n" +
                "Observação: Ao lado dos correios, predio branco\n" +
                "Endereco:Rua Goias, 18\n" +
                "Observação: Predio vermelho ao lado do cartorio\n", central.getConteudo());
    }

}
