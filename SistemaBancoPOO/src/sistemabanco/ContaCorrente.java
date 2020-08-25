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
public class ContaCorrente extends ContaBanco{
    private double saldoContaCorrente = 100;
    private String valorEscolha;

    public ContaCorrente(String agencia, String conta, String nome, String rg, String cpf, double saldo, double limite, boolean lock, String escolha){
        super(agencia, conta, nome, rg, cpf, saldo, limite, lock, escolha);
        this.saldoContaCorrente = saldoContaCorrente;
        
    }
    
    public ContaCorrente(){
    
    }
    
    public double getSaldoContaCorrente(){
        return this.saldoContaCorrente;
    
    }
    
    public void setSaldoContaCorrente(double saldoContaCorrente){
        this.saldoContaCorrente = saldoContaCorrente;
    
    }
    
    public String getValorEscolha(){
        System.out.println("\n                 Painel - Conta Corrente[teste]              ");
        System.out.println("                 =======================================");
        
        return this.valorEscolha;
        
    }
    
    public void menuAbrirMinhaConta(){
        System.out.println("Voce acabou de acessar a classe ContaCorrente"); //DEBUG
        setEscolha(getValorEscolha());
        setSaldo(getSaldoContaCorrente());
        super.menuAbrirMinhaConta();
        
        
    }

}
