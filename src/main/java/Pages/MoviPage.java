package Pages;

import core.BasePage;
import org.openqa.selenium.By;

public class MoviPage extends BasePage {

    public void selecionarTipoMovimentacao(String valor){
        selecionarCombo("tipo", valor);
    }
    public void setDataMovimentacao(String data){
        escrever("data_transacao", data);
    }
    public void setDataPagamento(String data){
        escrever("data_pagamento", data);
    }
    public void setDescricao(String texto){
        escrever("descricao", texto);
    }
    public void setInteressado(String texto){
        escrever("interessado", texto);
    }
    public void setValor(String valor){
        escrever("valor", valor);
    }
    public void selecionarConta(String valor){
        selecionarCombo("conta", valor);
    }
    public void clicarSituacao(){
        clicarCheck("status_pago");
    }
    public void salvar(){
        clicarBotao(By.xpath("//button[.='Salvar']"));
    }
    public String obterMensagemSucesso(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }
}
