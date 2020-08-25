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
public class ContaBlack extends ContaBanco{
    private double saldoContaBlack = 500;
    private String valorEscolha;
    
    public ContaBlack(String agencia, String conta, String nome, String rg, String cpf, double saldo, double limite, boolean lock, String escolha){
        super(agencia, conta, nome, rg, cpf, saldo, limite, lock, escolha);
        this.saldoContaBlack = saldoContaBlack;
        
    }
    
    public ContaBlack(){
    
    }
    
    public double getSaldoContaBlack(){
        return this.saldoContaBlack;
    
    }
    
    public void setSaldoContaBlack(double saldoContaBlack){
        this.saldoContaBlack = saldoContaBlack;
    
    }
    
    public String getValorEscolha(){
        System.out.println("\n                 Painel - Conta Black                 ");
        System.out.println("                 =======================================");
        
        return this.valorEscolha;
        
    }
    
    public void menuAbrirMinhaConta(){
        System.out.println("Voce acabou de acessar a classe ContaBlack"); //DEBUG
        setEscolha(getValorEscolha());
        setSaldo(getSaldoContaBlack());
        super.menuAbrirMinhaConta();
    }
    
}
