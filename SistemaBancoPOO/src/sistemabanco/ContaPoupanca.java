/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;

/**
 *
 * @author kevin
 */
public class ContaPoupanca extends ContaBanco{
    private double saldoContaPoupanca = 0;
    private String valorEscolha;
    
    public ContaPoupanca(String agencia, String conta, String nome, String rg, String cpf, double saldo, double limite, boolean lock, String escolha){
        super(agencia, conta, nome, rg, cpf, saldo, limite, lock, escolha);
        this.saldoContaPoupanca = saldoContaPoupanca;
        
    }
    
    public ContaPoupanca(){
    
    }
    
    public double getSaldoContaPoupanca(){
        return this.saldoContaPoupanca;
    
    }
    
    public void setSaldoContaPoupanca(double saldoContaPoupanca){
        this.saldoContaPoupanca = saldoContaPoupanca;
    
    }
    
    public String getValorEscolha(){
        System.out.println("\n                 Painel - Conta Poupança              ");
        System.out.println("                 =======================================");
        
        return this.valorEscolha;
        
    }
    
    public void menuAbrirMinhaConta(){
        System.out.println("Voce acabou de acessar a classe ContaPoupanca"); //DEBUG
        setEscolha(getValorEscolha());
        setSaldo(getSaldoContaPoupanca());
        super.menuAbrirMinhaConta();
    }
}
