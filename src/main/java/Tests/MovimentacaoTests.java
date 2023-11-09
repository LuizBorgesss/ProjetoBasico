package Tests;

import Pages.ContasPage;
import Pages.MenuPage;
import Pages.MoviPage;
import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class MovimentacaoTests extends BaseTest {
    MenuPage menuPage = new MenuPage();
    MoviPage moviPage = new MoviPage();

    @Test
    public void inserirMovimentacaoTest(){
        menuPage.acessarTelaMovimentacao();

        moviPage.selecionarTipoMovimentacao("Receita");
        moviPage.setDataMovimentacao("26/01/2024");
        moviPage.setDataPagamento("05/01/2024");
        moviPage.setDescricao("Dinheiro para investimentos");
        moviPage.setInteressado("Luiz Eduardo");
        moviPage.setValor("R$30000,00");
        moviPage.selecionarConta("Conta2");
        moviPage.clicarSituacao();
        moviPage.salvar();

        Assert.assertEquals("Movimentação adicionada com sucesso!", moviPage.obterMensagemSucesso());
    }
}
