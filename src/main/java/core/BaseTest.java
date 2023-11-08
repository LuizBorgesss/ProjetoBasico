package core;

import static core.DriverFactory.killDriver;

import Pages.LoginPage;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    private LoginPage page = new LoginPage();
    @Before
    public void inicializa(){
        page.acessarTelaInicial();
        page.setEmail("luizin@brgs");
        page.setSenha("1234");
        page.entrar();
    }

    @After
    public void finaliza(){
            killDriver();
        }
}

