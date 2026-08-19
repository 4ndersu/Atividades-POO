package atividade4poo;

public class Main {
    public static void main(String[] args) {
         
        //QUESTÃO 1: Conta Correntee Poupanca
        //Declara um objeto da classe ContaCorrente que herda Conta
        ContaCorrente conta1 = new ContaCorrente(1000); //Letra a)
        System.out.println("-----CONTA CORRENTE-----");
        conta1.VerSaldo(); //Letra b)
        conta1.Depositar(100); //Letra c)
        conta1.VerSaldo(); //Letra d)
        conta1.Depositar(400); //Letra e)
        conta1.VerSaldo(); //Letra f)
        conta1.Sacar(200); //Letra g)
        conta1.VerSaldo(); //Letra h)
        System.out.println(); 

        //Declara um objeto da classe ContaPoupanca que herda Conta
        ContaPoupanca conta2 = new ContaPoupanca(5000); //Letra i)
        System.out.println("-----CONTA POUPANCA-----");
        conta2.VerSaldo(); //Letra j)
        conta2.Depositar(1000); //Letra k)
        conta2.VerSaldo(); //Letra l)
        conta2.VerSaldoJuros(1); //Letra m) e n)
        
        //QUESTÃO 2: Conta Tesouro Direto
        ContaPoupanca[] conta3 = new ContaPoupanca[10]; //a) instancia um objeto ContaPoupanca como um array de 10 posicoes
        
        conta3[0]= new ContaTesouroDireto(10000); //b) instacia um objeto TesouroDireto e o coloca na primeira posição com o saldo de 10000
        conta3[1]= new ContaPoupanca(10000); //c) instacia um objeto Poupanca e o coloca na segunda posição com o saldo de 10000
        
        conta3[0].VerSaldo(); //d) acessa e imprime o valor do saldo na posição 1
        conta3[1].VerSaldo(); //e) acessa e imprime o valor do saldo na posição 2
        
        conta3[0].Depositar(500); //f) deposita 500 reais na conta tesour direto, o que não é possivel pois o valor minimo é acima de 1000 reais
        conta3[0].VerSaldo(); //g) mostra o saldo da conta tesouro direto sem alteraações já que o deposito não foi possivel
        
        conta3[1].Depositar(500); //h) deposita 500 reais na conta poupanca, que funciona pois n tem restricao no seu metodo de deposito
        conta3[1].VerSaldo(); //i) mostra o novo valor do saldo da posição 2 apos o deposito
        
        conta3[0].VerSaldoJuros(1); //j) e k) aplica os juros mensais de 1% a conta tesouro direto com o metodo sobrescrito
        conta3[1].VerSaldoJuros(1); //l) e m) aplica os juros mensais de 0,5% a conta poupanca com o metodo sobrescrito
        

        //QUESTÃO 3: Pilha de caixas
        //Instancia uma pilha e sua altura maxima
        PilhaDeCaixas pilha = new PilhaDeCaixas(3.0);

        //Instancia caixas para a pilha 
        Caixa caixa1 = new Caixa("C1", "Roupas", 5, 1);
        Caixa caixa2 = new Caixa("C2", "Livros", 4, 1.2);
        CaixaFragil caixaFragil = new CaixaFragil("C3", "Vidros", 2, 0.5, 6); //Caixa fragil que suporta até 6kg acima

        //Empilha as caixas
        System.out.println("Empilhando caixa frágil");
        pilha.EmpilharCaixa(caixaFragil);

        System.out.println("Empilhando caixa 1");
        pilha.EmpilharCaixa(caixa1);

        System.out.println("Empilhando caixa 2\n");
        pilha.EmpilharCaixa(caixa2); //Pode falhar se ultrapassar peso sobre a frágil
        
        //Exibe o estado atual da pilha, com seu respectivo peso e altura final
        pilha.ExibirPilha(); 
        System.out.printf("Altura atual da pilha: %.2f metros%n", pilha.calcularAlturaAtual());
        System.out.printf("Peso atual da pilha: %.2f kg%n", pilha.calcularPesoAtual());
        System.out.println();
        
        //Desempilha uma caixa
        pilha.DesempilharCaixa(); //Remove e mostra a caixa que está no topo
        System.out.println();

        //Exibie as caixas restantes na pilha após o desempilhamento
        pilha.ExibirPilha();
        System.out.printf("\nAltura atual da pilha: %.2f m%n", pilha.calcularAlturaAtual());
        System.out.printf("Peso atual da pilha: %.2f kg%n", pilha.calcularPesoAtual());

        //Desempilha outra caixa
        System.out.println();
        pilha.DesempilharCaixa();
        System.out.println();

        //Exibe as caixas restantes na pilha após o desempilhamento
        pilha.ExibirPilha();
        System.out.printf("\nAltura final da pilha: %.2f m%n", pilha.calcularAlturaAtual());
        System.out.printf("Peso atual da pilha: %.2f kg%n", pilha.calcularPesoAtual());   
        
        
    }
}
