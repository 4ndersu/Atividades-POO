package atividade3poo;

public class Main {
    public static void main(String[] args) {
        
        //QUESTAO 1: CARRO
        
        //Instancia um objeto da classe carro e inicializa seus atributos
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 85, 5);
        
        //Acelera e freia o carro em 10 unidades, mostrando sua velocidade atual em cada operação
        carro1.exibirDetalhes();
        carro1.acelerar(10);

        carro1.exibirDetalhes();
        carro1.frear(10);
        carro1.exibirDetalhes();

        System.out.println("EXEMPLO COM OUTRO OBJETO CARRO QUE A VELOCIDADE FICA MENOR QUE 0 SE CHAMAR A FUNÇÂO FREIO.\n");
        Carro carro2 = new Carro("Ford", "Mustang", 2021, 5, 1);
        carro2.exibirDetalhes();
        carro2.frear(10);

        //QUESÃO 2: CARRO
        //Instanciando carro com marca e modelo null e ano abaixo do permitido
        Carro carro3 = new Carro(null, null, 1880, 0, 1);
        carro3.exibirDetalhes();
 

        //QUESTÃO 3: BIBLIOTECA
        //Instancia um objeto da classe Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        //Instancia dois objetos da classe livro
        Livro livro1 = new Livro("Orgulho e Preconceito", "Jane Austen", 1813);
        Livro livro2 = new Livro("Ainda Estou Aqui", "Marcelo Rubens Paiva" ,2015);

        //Adiciona os dois livros para a biblioteca e chama a lista de livros da Biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.ListarLivros();

        //QUESTÂO 4: MARCHA

        //Instanciando um objeto carro com uma velociada e marcha válida para ser trocada, e exibindo seus detalhes
        Carro carro4 = new Carro("Ford", "Ranger", 2017, 41, 2);
        carro4.exibirDetalhes();
        carro4.trocarMarcha(3);

        System.out.println("\nOutro objeto Carro com velocidadae invalida para trocar de marcha\n ");
        //Instanciando um objeto carro com uma velociada e marcha inválida para ser trocada, e exibindo seus detalhes
        Carro carro5 = new Carro("Chevrolet", "Onix", 2022, 40, 1); 
        carro5.exibirDetalhes();
        carro5.trocarMarcha(3);
        //QUESTÂO 5: PESSOA
        //Instancia um objeto da classe Pessoa com seus atributos validos
        Pessoa pessoa1 = new Pessoa("Anderson", 17, 1.71f);
        pessoa1.StatusPessoa();
        System.out.println("Segundo objeto pessoa com seus atributos invalidos(idade: -5 e altura: -1,56)");
        //Instancia um objeto da classe Pessoa com seus atributos validos, onde seusa atributos não são imprimidos
        Pessoa pessoa2 = new Pessoa("Julia", -5, -1.56f);
        pessoa2.StatusPessoa();

        //QUESTÃO 6: CONVERSOR DE TEMPERATURA

        //Instancia um objeto da classe ConversorTemperatura
        ConversorTemperatura conversor = new ConversorTemperatura(12, 55, 74);
    
        System.out.println("-----CONVERSOR-----");
        System.out.println("\nKelvin->Celsius e Celsius->Kelvin");
        conversor.KelvinPCel(conversor.getKelvin());
        conversor.CelsiusPKel(conversor.getCelsius());
    
        System.out.println("\nFarenheint->Celsius e Celsius->Farenheint");
        conversor.FarenPCel(conversor.getFarenheit());
        conversor.CelsiusPFar(conversor.getCelsius());
    
        System.out.println("\nFenheint->Kelvin e Kelvin->Farenheint");
        conversor.FarenPKel(conversor.getFarenheit());
        conversor.KelPFaren(conversor.getKelvin());
        
        /* 
        //Instancia um array de objetos da clase aluno
        Aluno[] aluno = new Aluno[3];
        //Chama a função de armazenar os alunos na memoria
        Aluno.ArmazenarAlunos(aluno);
        
        //Define as notas de cada aluno no seu respectivo indice
        aluno[0].setNota(5);
        aluno[1].setNota(3);
        aluno[2].setNota(7);

        for(int i=0; i<aluno.length;i++){
            System.out.println("Nota do aluno " + (i+1) + ":" + aluno[i].getNota());
        }

        //Chama a função de calcular a media dos 3 alunos
        Aluno.CalcularMedia(aluno);
        */

        //QUESTÃO 8: CONTA CORRENTE
        //Instancia um objeto da classe ContaCorrente
        ContaCorrente conta1 = new ContaCorrente(1234, 200, 20);
    
        //Exibe a conta e faz um saque e um deposido valido
        conta1.ExibirConta();
        conta1.Sacar(210);
        conta1.ExibirConta();
        conta1.Depositar(50);
        conta1.ExibirConta();

        //Instancia outro objeto da classe ContaCorrente
        ContaCorrente conta2 = new ContaCorrente(9999, 150, 50);

        System.out.println("\nSegundo objeto conta corrrente com um saque maior que o limite(250 reais)\n");
        //Exibe a conta e faz um saque invalido
        conta2.ExibirConta();
        conta2.Sacar(250);
        conta2.ExibirConta();
    
    

        //QUESTÃO 9: PRODUTO E LOJA
    
        //Instancia um produto da classe Produto e uma loja da classe Loja
        Produto leite = new Produto("leite", 25, 15);
        Loja loja = new Loja();
    
        //Mostra o status do produto, vende duas vezes, mostra o estoqeu atual e o total de vendas
        leite.ExibirProduto();
        loja.RegistarVenda(leite);
        loja.RegistarVenda(leite);
        leite.ExibirProduto();
        loja.ConsultarVendas(leite);
         
        //QUESTÃO 10: DESCONTO


    System.out.println("Pedido acima de 500 reais (desconto de 20%)");
    Pedido pedido1 = new Pedido();
    pedido1.setPedido(600);
    Pedido.DescontarPedido(pedido1);

    System.out.println("Pedido entre R$ 200 e R$ 500 (desconto de 10%)");
    Pedido pedido2 = new Pedido();
    pedido2.setPedido(350);
    Pedido.DescontarPedido(pedido2);

    System.out.println("Pedido abaixo de R$ 200 (desconto de 5%)");
    Pedido pedido3 = new Pedido();
    pedido3.setPedido(120);
    Pedido.DescontarPedido(pedido3);
 
        //Instancia um array de objetos da loja online
        System.out.println("Loja online com 3 pedidos: \n");
        Pedido[] loja2 = new Pedido[3];
        //Inicializa o array para não dar nullpoint
        Pedido.ArmazenarPedidos(loja2);
        //Declara o preço do pedido nos indices
        loja2[0].setPedido(350);
        loja2[1].setPedido(500);
        loja2[2].setPedido(100);
        //Desconta e imprime o valor com desconto
        Pedido.DescontarPedido(loja2);
        

        //QUESTÃO 11(e questão 7): ALUNO
        //Instancia um array de objetos da clase aluno
        Aluno[] aluno = new Aluno[3];
        //Chama a função de armazenar os alunos na memoria
        Aluno.ArmazenarAlunos(aluno);
                
        //Define as notas de cada aluno no seu respectivo indice
        aluno[0].setNome("Anderson Vicente");
        aluno[0].setNotaFinal(5);
        
        aluno[1].setNome("Gustavo Rufino");
        aluno[1].setNotaFinal(3);

        aluno[2].setNome("Julio Henrique");
        aluno[2].setNotaFinal(7);
        
        for(int i=0; i<aluno.length;i++){
            System.err.println("Nome do Aluno: " + aluno[i].getNome());
            System.out.println("Nota do aluno " + (i+1) + ":" + aluno[i].getNotaFinal());
            System.out.println();
        }

        //Chama a função de calcular a media dos 3 alunos
        Aluno.CalcularMedia(aluno);
        
        //QUESTÃO 13: CARRO NOVO E ANTIGO
        //Instanciando um objeto da classe Carro com ano anterior e posterior a 2020
        Carro carroAntigo = new Carro("Mustang GT", "Ford", 2018, 140, 5);
        Carro carroNovo = new Carro("Renegade", "Jeep", 2023, 88, 5);

        //Imprimindo atributos e mostrando se carro é recente ou não
        System.out.println("Objeto 1 carro com ano menor que 2020");
        carroAntigo.ExibirCarro();
        System.out.println("Objeto 2 carro com ano maior que 2020");
        carroNovo.ExibirCarro();

        //QUESTÃO 14: CONTA BANCARIA
        //Instanciando suas contas da classe ContaBacaria
        ContaBancaria conta4 = new ContaBancaria("João Paulo", 500);
        ContaBancaria conta5 = new ContaBancaria("Pedro Almeida", 200);

        //Conta 1 faz as operações normalmente já que foram depositados e sacados valalores validos
        System.out.println("Manipulacoes com a Conta 1\n");
        conta4.DetalharConta();
        conta4.Depositar(200);
        conta5.Sacar(250);
        conta4.DetalharConta();

        System.out.println();
        System.out.println("Manipulacoes com a Conta 2\n");
        //Conta 2 apenas deposita corretamente, mas não saca por ser um valor maior, deixando o mesmo saldo de depois do saque
        conta5.DetalharConta();
        conta5.Depositar(50);
        conta5.DetalharConta();
        conta5.Sacar(400);
        conta5.DetalharConta();

    
        //Instancia um array de objetos da classe Item
        Item[] inventario = new Item[3];
    
        //Chama o metodo para armazenar o Array
        Item.ArmazenarInventario(inventario);
    
        //Define os atibutos do item 1
        inventario[0].setNome("Roupas");
        inventario[0].setCodigo("123");
        inventario[0].setQuantidade(15);
        System.out.println("Quantidade atual: " + inventario[0].getQuantidade());
        inventario[0].setPrecoUnitario(2);
        inventario[0].AtualizarEstoque(3);
        inventario[0].ExibirItem();
        //Define os atibutos do item 2
        inventario[1].setNome("Carnes");
        inventario[1].setCodigo("345");
        inventario[1].setQuantidade(50);
        System.out.println("Quantidade atual: " + inventario[1].getQuantidade());
        inventario[1].setPrecoUnitario(5);
        inventario[1].AtualizarEstoque(10);
        inventario[1].ExibirItem();

        //Define os atibutos do item 3
        inventario[2].setNome("Celular");
        inventario[2].setCodigo("567");
        inventario[2].setQuantidade(100);
        System.out.println("Quantidade atual: " + inventario[2].getQuantidade());
        inventario[2].setPrecoUnitario(2);
        inventario[2].AtualizarEstoque(10);
        inventario[2].ExibirItem();
    
        //Calcula o peço total do inventario considerando a atualização de itens
        Item.CalcularInventario(inventario);

    }   
}
