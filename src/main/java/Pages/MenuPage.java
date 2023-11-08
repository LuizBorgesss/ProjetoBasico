package Pages;
import core.BasePage;

public class MenuPage extends BasePage{
    public void acessarTelaInserirConta(){
        clicarLink("Contas");
        clicarLink("Adicionar");
    }

    public void acessarTelaAlterarConta(){
        clicarLink("Contas");
        clicarLink("Listar");
    }
}
