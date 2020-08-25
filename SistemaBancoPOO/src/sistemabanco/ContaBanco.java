/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class ContaBanco extends SistemaBanco{
    private String agencia /*= "3128"*/; //ATRIBUTO
    private String conta /*= "13826-4"*/; //ATRIBUTO
    private String nome /*= "Kevin Alec Neri Lazzarotto"*/; //ATRIBUTO
    private String rg /*= "38.397.575-1"*/; //ATRIBUTO
    private String cpf /*= "422.441.358-29"*/; //ATRIBUTO
    //DADOS CONTA
    private double saldo /*= 2100.00*/;
    private double limite = 4200.00;
    //TRAVA
    private boolean lock = false;
    //ESCOLHA TIPOS DE CONTAS
    private String escolha; 

    public ContaBanco(String agencia, String conta, String nome, String rg, String cpf, double saldo, double limite, boolean lock, String escolha) {
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        //DADOS CONTA
        this.saldo = saldo;
        this.limite = limite;
        //TRAVA
        this.lock = lock;
        //ESCOLHA TIPOS DE CONTAS
        this.escolha = escolha;
    }

    public ContaBanco(){ //Apartir dele que se e possivel referenciar o objetos
  
    }

    public String getAgencia() { //METODO
        return "Sua agencia e: " +agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
        
    }

    public String getConta() { //METODO
        return "Sua conta e: " +conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNome() { //METODO
        return "Seja Bem-Vindo " +nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return "RG: " +rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() { //METODO
        return "CPF: " +cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //DADOS CONTA
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    //TRAVA
    public boolean getLock(){
        return lock;
        
    }
    
    public void setLock(boolean lock){
        this.lock = lock;
    
    }
    
    //ESCOLHA
    public void setEscolha(String escolha){
        this.escolha = escolha;
        
    }
    
    public String getEscolha(){
        return this.escolha;
    
    }
    
    /*CALCULO CONTAS BANCOS*/
    
    public void saque(double valor_saque){
        if(valor_saque < 0){
            System.out.println("Transacao BLOQUEADA, o valor digitado R$" +valor_saque+ " nao e permitido");

        }else if(valor_saque > saldo){
            this.saldo = this.saldo - valor_saque;
            System.out.println("                  |     Voce acabou de sacar: R$" + valor_saque + " seu saldo atual e: R$" +saldo);
            System.out.println("                  |     ATENCAO voce esta utlizando seu limite de credito");

        }else{
            this.saldo = this.saldo - valor_saque;
            System.out.println("                  |     Voce acabou de sacar: R$" +valor_saque+ " seu saldo atual e: R$" +saldo);

        }
        
    }
    
    public void deposito(double valor_deposito){
        if(valor_deposito > 0){
            this.saldo= saldo+valor_deposito;
            System.out.println("                  |     Voce acabou de depositar: R$" +valor_deposito+ "seu saldo atual e R$" +saldo);
            
        }else{
            System.out.println("                  |     Valor de deposito invalido");
        }
        
    }
    
    /*===================*/
    
    public void paginaInicial(){
        System.out.println("Ola, Seja Bem-Vindo ao seu Banco Virtual, o que deseja fazer hoje?");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n                 =================================");
        System.out.println("                  |     1 - Abrir minha conta   |");
        System.out.println("                  |     2 - Acessar minha conta |");
        System.out.println("                 =================================");   
    
    }
    
    public void dadosConta(){        
        System.out.println("\n                 Painel - Dados da Conta              ");
        System.out.println("                 =======================================");
        System.out.println("                  |     Sua agencia é: "+agencia        );
        System.out.println("                  |     O numero de sua conta é: "+conta);
        System.out.println("                  |     Seja Bem-Vindo: "+nome          );
        System.out.println("                  |     Seu RG é: "+rg                  );
        System.out.println("                  |     Seu CPF é: "+cpf                );
        System.out.println("                 =======================================");
        
    }
    
    public void tiposConta(){
        System.out.println("\n                 Painel - Abrir minha Conta     ");
        System.out.println("                 =================================");
        System.out.println("                  |     1 - Conta Corrente      |");
        System.out.println("                  |     2 - Conta Poupança      |");
        System.out.println("                  |     3 - Conta Black         |");
        System.out.println("                  |     0 - Voltar              |");
        System.out.println("                 ================================="); 
    
    }
    
    public void menuConta(){ 
        System.out.println("\n                 Painel - Acessar minha Conta   ");
        System.out.println("                 =================================");
        System.out.println("                  |     1 - Informar extrato    |");
        System.out.println("                  |     2 - Sacar um valor      |");
        System.out.println("                  |     3 - Depositar um valor  |");
        System.out.println("                  |     4 - Dados Conta         |");
        System.out.println("                  |     0 - Voltar              |");
        System.out.println("                 =================================");

    }
    
    public void menuInicial(){ //MENU INICIAL
        int eInicial;
            do{
                paginaInicial();
                System.out.print("\n          Opção: ");

                Scanner escolhaInicial = new Scanner(System.in);
                eInicial = escolhaInicial.nextInt();

                switch(eInicial){
                    case 1:
                        menuPerfilConta();
                        
                        break;

                    case 2:
                        if(getLock() == false){
                            System.out.println("OPS, voce nao esta cadastrado em nosso banco.");
                            break;
                        }else{
                        menuAcessarMinhaConta();

                        break;
                        }//CONDICAO LOCK

                    default:
                        System.out.println("                  Sinto muito mas essa opção e invalida \n");
                        break;

                    }

                }while (eInicial != 0 || eInicial <= 2);
    
    }
    
    public void menuPerfilConta(){ //ESCOLHAS DE PERFIL DE CONTA
        int oConta;
            do{
                Scanner opcaoConta = new Scanner(System.in);

                tiposConta();
                System.out.print("\n          Opção: ");

                oConta = opcaoConta.nextInt();
                
                switch(oConta){
                    case 1:
                    System.out.println("\n                 Painel - Conta Corrente              ");
                    System.out.println("                 =======================================");
                    
                    ContaCorrente cc = new ContaCorrente();
                    cc.menuAbrirMinhaConta(); //ANCORAMENTO CLASSE CONTA CORRENTE

                    break;

                case 2:
                    System.out.println("\n                 Painel - Conta Poupança              ");
                    System.out.println("                 =======================================");
                    
                    ContaPoupanca cp = new ContaPoupanca();
                    cp.menuAbrirMinhaConta(); //ANCORAMENTO CLASSE CONTA POUPANCA
                    
                    break;

                case 3:
                    System.out.println("\n                 Painel - Conta Black                 ");
                    System.out.println("                 =======================================");
                    
                    ContaBlack cb = new ContaBlack();
                    cb.menuAbrirMinhaConta(); //ANCORAMENTO CLASSE CONTA BLACK
                    
                    break;

                case 0:
                    System.out.println("                  Voltar ");
                    break;

                default:
                    System.out.println("                  |     Sinto muito mas essa opção e invalida");
                    break;
                }

            }while (oConta != 0);
            
    }
    
    public void menuAbrirMinhaConta(){ //ATRIBUICAO DO VALOR DA CONTA E ANCORAMENTO COM OS MENUS
        setLock(true); //DESTRAVAR MENU INICIAL OPI. 2
        
        //ATRIBUICAO DE VALOR E TIPO DA CONTA 
        getEscolha();
        getSaldo();

        //VALOR CONTA CORRENTE 
        cadastroConta();
        menuAcessarMinhaConta();
    
    }
    
    public void cadastroConta(){ //CADASTRO CONTA
        Scanner entradaNomeUsuario = new Scanner(System.in);
        Scanner entradaStrings = new Scanner(System.in);

        System.out.print("                  |     Sua agencia é: "          );
        setAgencia(entradaStrings.next()); 

        System.out.print("                  |     O numero de sua conta é: ");
        setConta(entradaStrings.next());

        System.out.print("                  |     Nome Completo: "          );
        setNome(entradaNomeUsuario.nextLine()); 

        System.out.print("                  |     RG: "                     );
        setRg(entradaStrings.next());

        System.out.print("                  |     CPF: "                    );
        setCpf(entradaStrings.next());
    }
    
    public void menuAcessarMinhaConta(){ //OPI. 2 MENU INICIAL
        int cExistente;
            do {
                //VALOR EM REAIS CONTA 

                menuConta();
                System.out.print("\n          Opção: ");
                Scanner contaExixtente = new Scanner(System.in);
                cExistente = contaExixtente.nextInt();

                    switch(cExistente){
                        case 1:
                            System.out.println("\n                 Painel - Informar extrato            ");
                            System.out.println("                 =======================================");

                            System.out.println("                  |     Seu saldo atual e: R$" +getSaldo()); //ATUALIZA COM O VALOR ATUALIZADO
                            System.out.println("\n");

                            break;

                        case 2:
                            System.out.println("\n                 Painel - Sacar um valor              ");
                            System.out.println("                 =======================================");

                            System.out.println("                  |     Seu saldo atual e: R$" +getSaldo());
                            System.out.println("                  |     Seu limite e de: R$" +getLimite());

                            System.out.print("                  Digite o valor a ser sacado: ");
                            Scanner valorSaque = new Scanner(System.in);
                            saque(valorSaque.nextDouble());

                            break;

                        case 3:
                            System.out.println("\n                 Painel - Depositar um valor          ");
                            System.out.println("                 =======================================");

                            System.out.println("                  |     Seu saldo atual e: R$" +getSaldo());
                            System.out.println("                  |     Seu limite e de: R$" +getLimite());

                            System.out.print("                  Digite o valor a ser depositado: ");
                            Scanner valorDeposito = new Scanner(System.in);
                            deposito(valorDeposito.nextDouble());

                            break;

                        case 4:
                            dadosConta();

                            break;

                        case 0:
                            System.out.println("                  Voltar \n");
                            menuInicial();
                            break;

                        default:
                        System.out.print("                  Sinto muito mas essa opção e invalida \n");

                            break;
                    }

            }while (cExistente != 0);
    
    }
    
}
