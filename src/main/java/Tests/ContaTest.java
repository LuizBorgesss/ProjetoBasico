package Tests;

import Pages.ContasPage;
import Pages.MenuPage;
import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;


public class ContaTest extends BaseTest {
    ContasPage contasPage = new ContasPage();
    MenuPage menuPage = new MenuPage();

    @Test
    public void testInserirConta(){
        menuPage.acessarTelaInserirConta();

        contasPage.setNome("Conta1");
        contasPage.salvar();

        Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
    }

    @Test
    public void testAlterarConta(){
        menuPage.acessarTelaAlterarConta();

        contasPage.editarConta();
        contasPage.setNome("Conta2");
        contasPage.salvar();

        Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
    }

}
