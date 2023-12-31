package Pages;

import core.BasePage;
import core.DriverFactory;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public void acessarTelaInicial(){
        DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/login");
    }
    public void setEmail(String email){
        escrever("email", email);
    }
    public void setSenha(String senha){
        escrever("senha", senha);
    }

    public void entrar(){
        clicarBotao(By.xpath("//button[.='Entrar']"));
    }
}
