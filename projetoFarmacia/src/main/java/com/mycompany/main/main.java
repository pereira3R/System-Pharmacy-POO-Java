
package com.mycompany.main;

//Importando classes services
import com.mycompany.service.Funcionario;
import com.mycompany.service.Vendedor;
import com.mycompany.service.Farmaceutico;
import com.mycompany.service.Cliente;
import com.mycompany.products.NRemedio;
//Importando classes products 
import com.mycompany.products.Produtos;
import com.mycompany.products.Remedio;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class main {

        // Método para cadastrar os funcionários únicos da Farmácia LAV
        public static void cadastrarFuncionarios(ArrayList<Funcionario> funcionariosFarmacia, double SalarioBase) {
                Funcionario funcionarioAnthony = new Vendedor("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(66) 99233-7652", "www.farmaciaLav.com.br",
                                SalarioBase,
                                "Anthony Ricardo Rodrigues Rezende", "072.417.431-02", "Vendedor", 0);
                funcionariosFarmacia.add(funcionarioAnthony);
                Funcionario funcionarioLetizia = new Farmaceutico("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(69) 98417-7172", "www.farmaciaLav.com.br",
                                SalarioBase,
                                "Letízia Manuella Serqueira Eugênio", "012.237.441-02", "Farmacêutico", 1);
                funcionariosFarmacia.add(funcionarioLetizia);
                Funcionario funcionarioVinicius = new Vendedor("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(66) 99233-7652", "www.farmaciaLav.com.br",
                                SalarioBase,
                                "Vinicius Padilha Vieira", "022.407.431-24", "Vendedor", 0);
                funcionariosFarmacia.add(funcionarioVinicius);
        }

        // Funcao que busca reconhecer se há algum cpf já registrado retornando true, se
        // verdadeiro e false se o contrário
        public static boolean verificandoCliente(ArrayList<Cliente> clienteFarmacia, String CPF) {

                for (int i = 0; i < clienteFarmacia.size(); i++) {
                        String cpfBuscado = clienteFarmacia.get(i).getCPF();
                        if (cpfBuscado.equals(CPF)) {
                                return true;
                        }
                }
                return false;
        }

        // Método feito para adicionar todos os produtos do estoque da Farmácia LAV
        public static ArrayList<Produtos> cadastrandoProdutos(ArrayList<Produtos> todosProdutos) {

                // Todos os produtos da Farmácia que se classificam como Remédios

                Produtos addProduto = new NRemedio("Fralda Supreme Care P", 49.90, "Outros", "Huggies",
                                "Kimberly-Clark", "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Sabonete Líquido Relaxante Hora Do Sono", 26.99, "Outros", "Johnson's",
                                "Johnson & Johnson Industrial Ltda.", "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Fio Dental Johnson's Reach Essencial Sabor Menta", 12.19, "Outros",
                                "Johnson's", "Johnson & Johnson", "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Absorvente Externo Noturno Plus Noite e Dia Suave 32un", 26.72, "Outros",
                                "Sempre Livre", "Johnson & Johnson Industrial Ltda.", "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Gatorade Frutas Cítricas Isotônico com 500ml", 9.25, "Outros", "Gatorade",
                                "X3 Brasil Soluções", "Bebidas");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Sorvete Kibon Cremosíssimo Napolitano 1,5 Litro", 29.90, "Outros", "Kibon",
                                "Kibon", "Alimentos");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Escova de dente portátil para viagem", 3.99, "Outros", "Needs", "Needs",
                                "Higiene");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Protetor Solar Facial Sun Fresh Derm Care FPS 70 Pele Mista a Oleosa", 52.59,
                                "Outros", "Neutrogena", "Johnson & Johnson", "Cosméticos");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Hidratante Facial Vita C 50g", 27.99, "Outros", "Needs", "Needs",
                                "Cosméticos");
                todosProdutos.add(addProduto);
                addProduto = new NRemedio("Desodorante Rexona Men Antibacterial Aerossol Antitranspirante 150ml", 16.49,
                                "Outros", "Rexona", "Rexona", "Higiene");
                todosProdutos.add(addProduto);

                // Todos os produtos da Farmácia que se classificam como N. Remédios
                addProduto = new Remedio("“Benzetacil”", 17.99, "Remédio", "Schering-Plough", true, "Injetável", 4,
                                "Schering-Plough",
                                "Antibióticos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Dipirona", 5.99, "Remédio", "EMS S/A", false, "Comprimidos", 10, "EMS S/A",
                                "Analgésicos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Neosoro", 6.29, "Remédio", "Neo Química", false, "Solução Gotas", 30,
                                "Neo Química", "Descongestionantes");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Rivotril", 27.01, "Remédio", "Roche", true, "Comprimidos", 30, "Roche",
                                "Ansiolíticos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Torsilax", 17.69, "Remédio", "Neo Química", false, "Comprimidos", 30,
                                "Neo Química", "Analgésicos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Isotretinoína", 82.75, "Remédio", "Eurofarma", true, "Cápsulas", 30,
                                "Eurofarma", "Antiacne");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Ivermectina", 18.69, "Remédio", "Germad", false, "Comprimidos", 4, "EMS S/A",
                                "Antiparasitários");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Sal de Fruta", 4.48, "Remédio", "GSK", false, "Em pó", 10, "GSK-Matriz",
                                "Antiácidos");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Ciclo 21", 6.38, "Remédio", "União Química", false, "Comprimidos", 21,
                                "União Química", "Anticoncepcionais");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Ácido Mefenâmico", 7.61, "Remédio", "Medley", false, "Comprimidos", 12,
                                "Medley", "Anti-inflamatórios");
                todosProdutos.add(addProduto);
                addProduto = new Remedio("Resfenol", 11.35, "Remédio", "Kleyhertz", false, "Cápsulas", 10, "Kleyhertz",
                                "Antigripais");
                return todosProdutos;
        }

        // Funcao para buscar e retornar um produto do tipo Remedio na lista do produtos
        // Remédios
        public static Produtos buscandoRemedio(ArrayList<Produtos> remedios, String nomeRemedio) {
                for (int i = 0; i < remedios.size(); i++) {
                        if (remedios.get(i).getNome().equals(nomeRemedio)) {
                                Produtos resultado = remedios.get(i);
                                return resultado;
                        }
                }
                return null;
        }

        // Funcao para buscar e retornar um produto do tipo N. Remedio na lista dos
        // produtos N. Remedios
        public static Produtos buscandoNRemedio(ArrayList<Produtos> Nremedios, String nomeNRemedio) {
                for (int i = 0; i < Nremedios.size(); i++) {
                        if (Nremedios.get(i).getNome().equals(nomeNRemedio)) {
                                Produtos resultado = Nremedios.get(i);
                                return resultado;
                        }
                }
                return null;
        }

        // Funcao para concatenar e retornar a String com os nomes de todos os produtos
        // selecionados para comprar pelo cliente
        public static String comprasAtualCliente(Cliente clienteNovo) {

                ArrayList<Produtos> produtosCliente = clienteNovo.getCompras();
                String listaStringProdutos = "";
                for (int i = 0; i < produtosCliente.size(); i++) {
                        listaStringProdutos += "-> " + produtosCliente.get(i).getNome() + "\n";
                }
                return listaStringProdutos;
        }

        // Função para calcular e retornar a soma de todos os produtos que estão no
        // carrinho do cliente
        public static double calculandoTotalCarrinho(Cliente cliente) {
                ArrayList<Produtos> produtosCliente = cliente.getCompras();
                double valorTotal = 0;
                for (int i = 0; i < produtosCliente.size(); i++) {
                        valorTotal += produtosCliente.get(i).getPreco();
                }
                return valorTotal;
        }

        // Calculando o salário do Vendedor
        public static void calculaSalarioFuncionario(Funcionario funcionario,
                        ArrayList<Funcionario> farmaciaFuncionarios,
                        Cliente cliente, int flag) {
                ArrayList<Produtos> todosProdutos = cliente.getCompras();
                if (flag == 0) {
                        int i;
                        for (i = 0; i < farmaciaFuncionarios.size(); i++) {
                                if (funcionario.getCPF().equals(farmaciaFuncionarios.get(i).getCPF())) {
                                        break;
                                }
                        }
                        for (int j = 0; j < todosProdutos.size(); j++) {
                                farmaciaFuncionarios.get(i).setSalario(todosProdutos.get(j).getPreco());
                        }
                } else {
                        int i;
                        for (i = 0; i < farmaciaFuncionarios.size(); i++) {
                                if (funcionario.getCPF().equals(farmaciaFuncionarios.get(i).getCPF())) {
                                        break;
                                }
                        }

                        for (int j = 0; j < todosProdutos.size(); j++) {
                                if (((Remedio) todosProdutos.get(j)).getTipoRemedio().equals("Injetável")) {
                                        farmaciaFuncionarios.get(1).setSalario(todosProdutos.get(j).getPreco());
                                } else {
                                        farmaciaFuncionarios.get(i).setSalario(todosProdutos.get(j).getPreco());
                                }
                        }
                }
        }

        // Arrumar Relatório
        public static String relatorioFinalDia() {
                String relatorio = "";
                return relatorio;
        }

        public static String formatarNumeroComDuasCasasDecimais(double numero) {
                DecimalFormat formato = new DecimalFormat("0.00");
                return formato.format(numero);
        }

        public static void main(String[] args) {

                // Criando a flag para validacao de casos de mudanca de atendimento
                int flag = 0;

                // Paraa contar o número de clientes
                int contadorCliente = 0;

                // Lista para incluir Todos os produtos
                ArrayList<Produtos> produtosFarmacia = new ArrayList<Produtos>();

                // Lista para incluir todos os clientes atendidos na farmácia
                ArrayList<Cliente> clienteFarmacia = new ArrayList<Cliente>();

                // Coletando informações sobre a Farmacia

                String NomeFarmacia = "LAV";
                String CNPJ = "48. 048. 138/0001-79";
                String Telefone = "(66) 99233-7652";
                String Endereco = "Boa Esperança, Rua 8, N. 254";
                String Site = "www.farmacialav.com.br";
                double SalarioBase = 1300;

                // Lista para incluir os funcionários da Farmácia
                ArrayList<Funcionario> farmaciaFuncionarios = new ArrayList<Funcionario>();
                cadastrarFuncionarios(farmaciaFuncionarios, SalarioBase);

                // Cadastrando Todos os Produtos - 10 Remédios & 10 N. Remédios
                produtosFarmacia = cadastrandoProdutos(produtosFarmacia);

                // Apresentando os dados da Farmácia
                while (true) {
                        // Atualizando o flag para 0 novamente, pois receberemos um novo cliente;
                        flag = 0;

                        // Armazenar a quantidade de compras efetuadas pelo cliente
                        int contaCompras = 0;
                        int contaFarmaceutico = 0;

                        // Instanciano uma var random, pois vamos precisar para randomizar o atendimento
                        // do cliente, de acordo com os funcionários fixos
                        Random random = new Random();
                        Funcionario auxAtendente = null;
                        Funcionario atendente = null;

                        // Instanciando Cliente + Definição e Informações
                        Cliente clienteNovo = new Cliente("", "", "");
                        JOptionPane.showMessageDialog(null,
                                        "** Informações sobre a Farmácia LAV **\n\n Nome: " + NomeFarmacia
                                                        + "\n CNPJ: "
                                                        + CNPJ + "\n Telefone: " + Telefone + "\n Endereço: "
                                                        + Endereco
                                                        + "\n Site: " + Site + "\n\n [ FARMÁCIA ABERTA ]");

                        JOptionPane.showMessageDialog(null,
                                        "[AVISO] Para garantir desconto de 10% realize o seu cadastro");
                        Object[] opcao = { "Cadastrar", "Comprar", "Sair" };

                        Object selecionarOpcao = JOptionPane.showInputDialog(
                                        null,
                                        "** Menu LAV **",
                                        "Opção",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null,
                                        opcao, // Você pode passar o array de itens aqui, mas não é usado diretamente
                                        null // Valor padrão selecionado
                        );

                        // Apresentando as Informções que os Clientes devem inserir
                        if (selecionarOpcao.equals("Cadastrar")) {

                                // Cadastrando os Clientes
                                JOptionPane.showMessageDialog(null,
                                                "** Bem-Vindo ** \n\n Precisamos de algumas Informações \n\n CPF:\n Nome:\n Telefone:");
                                String cpfCliente = JOptionPane.showInputDialog("Digite o seu CPF: ");

                                // Verificando se o cpf do cliente atual já foi cadastrado
                                if (verificandoCliente(clienteFarmacia, cpfCliente)) {
                                        JOptionPane.showMessageDialog(null, "Bem-vindo novamente !!");
                                } else {
                                        String nomeCliente = JOptionPane.showInputDialog("Digite o seu Nome: ");
                                        String telCliente = JOptionPane.showInputDialog("Digite o seu Telefone: ");

                                        JOptionPane.showMessageDialog(null,
                                                        "** Informações Passadas **\n\nCPF: " + cpfCliente + "\nNome: "
                                                                        + nomeCliente + "\nTelefone: " + telCliente);

                                        int resposta = JOptionPane.showConfirmDialog(null,
                                                        "Você deseja alterar os dados ?",
                                                        "Confirmação", JOptionPane.YES_NO_OPTION);
                                        if (resposta == JOptionPane.YES_OPTION) {
                                                Object[] opcaoCliente = { "CPF", "Nome", "Telefone", "Tudo" };

                                                // Perguntando se o Cliente deseja alterar algo
                                                Object selecionaOpcaoCliente = JOptionPane.showInputDialog(
                                                                null,
                                                                "** Alteração de Dados **",
                                                                "Opção",
                                                                JOptionPane.INFORMATION_MESSAGE,
                                                                null,
                                                                opcaoCliente,
                                                                null

                                                );
                                                if (selecionaOpcaoCliente.equals("CPF")) {
                                                        cpfCliente = JOptionPane.showInputDialog("Digite o seu CPF: ");

                                                } else if (selecionaOpcaoCliente.equals("Nome")) {
                                                        nomeCliente = JOptionPane
                                                                        .showInputDialog("Digite o seu Nome: ");

                                                } else if (selecionaOpcaoCliente.equals("Telefone")) {
                                                        telCliente = JOptionPane
                                                                        .showInputDialog("Digite o seu Telefone: ");

                                                } else if (selecionaOpcaoCliente.equals("Tudo")) {

                                                        cpfCliente = JOptionPane.showInputDialog("Digite o seu CPF: ");

                                                        nomeCliente = JOptionPane
                                                                        .showInputDialog("Digite o seu Nome: ");
                                                        telCliente = JOptionPane
                                                                        .showInputDialog("Digite o seu Telefone: ");

                                                }

                                        }

                                        // Inserindo todos as informações na classe cliente instanciado como clienteNovo
                                        clienteNovo.setCPF(cpfCliente);
                                        clienteNovo.setNome(nomeCliente);
                                        clienteNovo.setTelefone(telCliente);
                                        clienteNovo.setAtendidoPor(atendente);
                                        clienteFarmacia.add(clienteNovo);
                                        contadorCliente++;
                                }

                        } else if (selecionarOpcao.equals("Comprar")) {

                                // Selecionado em "Comprar"
                                while (true) {
                                        // Mostrando as opções Remédio e não remédio
                                        String[] opcaoCompra = { "Remédios", "Outros" };
                                        String compraSelecionada = (String) JOptionPane.showInputDialog(
                                                        null,
                                                        "Escolha uma opção:",
                                                        "Menu Compras - LAV",
                                                        JOptionPane.QUESTION_MESSAGE,
                                                        null,
                                                        opcaoCompra,
                                                        opcaoCompra[0]);

                                        if (compraSelecionada.equals("Remédios")) {

                                                atendente = farmaciaFuncionarios.get(
                                                                random.nextInt(3));
                                                JOptionPane.showMessageDialog(null,
                                                                "Atendimento com:\n\n Nome: " + atendente.getNome()
                                                                                + "\n Cargo: "
                                                                                + atendente.getTipoFuncionario());

                                                ArrayList<Produtos> listaRemedios = new ArrayList<Produtos>();
                                                int countRemedios = 0;
                                                for (int i = 0; i < produtosFarmacia.size(); i++) {
                                                        if (produtosFarmacia.get(i).getTipo().equals("Remédio")) {
                                                                listaRemedios.add(((Remedio) produtosFarmacia.get(i)));
                                                                countRemedios++;
                                                        }
                                                }

                                                Object[] nomesRemedios = new Object[countRemedios];

                                                for (int i = 0; i < countRemedios; i++) {
                                                        nomesRemedios[i] = ((Remedio) listaRemedios.get(i))
                                                                        .getNomeRemedio();
                                                }

                                                Produtos produtoCliente = null;
                                                String compraRemedio = (String) JOptionPane.showInputDialog(
                                                                null,
                                                                "Escolha uma opção:",
                                                                "Menu Compras - LAV",
                                                                JOptionPane.QUESTION_MESSAGE,
                                                                null,
                                                                nomesRemedios,
                                                                nomesRemedios[0]);

                                                if (compraRemedio != "") {
                                                        produtoCliente = buscandoRemedio(listaRemedios,
                                                                        (String) compraRemedio);
                                                        boolean receita = ((Remedio) produtoCliente)
                                                                        .getReceitaRemedio();
                                                        if (receita) {

                                                                int resposta = JOptionPane.showConfirmDialog(null,
                                                                                "Você possui Receita ?",
                                                                                "Confirmação",
                                                                                JOptionPane.YES_NO_OPTION);
                                                                if (resposta != JOptionPane.YES_OPTION) {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "Para comprar esse remédio,\n você precisa de receita");
                                                                        break;
                                                                }
                                                        }

                                                        if (((Remedio) produtoCliente).getTipoRemedio()
                                                                        .equals("Injetável")) {
                                                                if (atendente.getTipoFuncionario()
                                                                                .equals("Vendedor")) {
                                                                        auxAtendente = atendente;
                                                                        atendente = farmaciaFuncionarios.get(1);
                                                                        clienteNovo.setAtendidoPor(atendente);
                                                                        clienteFarmacia.set(contadorCliente,
                                                                                        clienteNovo);
                                                                        JOptionPane.showConfirmDialog(null,
                                                                                        "Vamos te encaminhar para a farmacêutica\npara realizar a aplicação do injetável\n\nFarmacêutica: "
                                                                                                        + atendente.getNome());
                                                                        contaFarmaceutico++;
                                                                        flag = 1;
                                                                }
                                                        } else if (flag == 0) {
                                                                contaCompras++;
                                                        }

                                                }

                                                int respostaClienteProduto = JOptionPane.showConfirmDialog(null,
                                                                "Deseja colocar no carrinho ?\n\nNome: "
                                                                                + produtoCliente.getNome() +
                                                                                "\nMarca: "
                                                                                + produtoCliente.getMarca()
                                                                                + "\nPreço: "
                                                                                + produtoCliente.getPreco()
                                                                                + "\n",

                                                                "Sobre o Produto",
                                                                JOptionPane.YES_NO_OPTION);
                                                if (respostaClienteProduto == JOptionPane.YES_OPTION) {

                                                        clienteNovo.setCompras(produtoCliente);
                                                        double valorTotal = calculandoTotalCarrinho(clienteNovo);
                                                        String comprasAtualCliente = comprasAtualCliente(clienteNovo);
                                                        JOptionPane.showMessageDialog(null,
                                                                        "** Seu carrinho **\nValor Total: "
                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                        valorTotal)
                                                                                        + "\n\n" + comprasAtualCliente);
                                                }

                                        } else if (compraSelecionada.equals("Outros")) {

                                                if (flag == 1) {
                                                        contaFarmaceutico++;
                                                } else {
                                                        contaCompras++;
                                                }

                                                ArrayList<Produtos> listaNRemedios = new ArrayList<Produtos>();
                                                int countNRemedios = 0;
                                                for (int i = 0; i < produtosFarmacia.size(); i++) {
                                                        if (produtosFarmacia.get(i).getTipo().equals("Outros")) {
                                                                listaNRemedios.add(
                                                                                ((NRemedio) produtosFarmacia.get(i)));
                                                                countNRemedios++;
                                                        }
                                                }

                                                Object[] nomesNRemedios = new Object[countNRemedios];

                                                for (int i = 0; i < countNRemedios; i++) {
                                                        nomesNRemedios[i] = ((NRemedio) listaNRemedios.get(i))
                                                                        .getNomeProduto();
                                                }

                                                Produtos produtoCliente = null;
                                                String compraNRemedio = (String) JOptionPane.showInputDialog(
                                                                null,
                                                                "Escolha uma opção:",
                                                                "Menu Compras - LAV",
                                                                JOptionPane.QUESTION_MESSAGE,
                                                                null,
                                                                nomesNRemedios,
                                                                nomesNRemedios[0]);

                                                if (compraNRemedio != "") {

                                                        produtoCliente = buscandoNRemedio(listaNRemedios,
                                                                        (String) compraNRemedio);

                                                }

                                                int respostaClienteProduto = JOptionPane.showConfirmDialog(null,
                                                                "Deseja colocar no carrinho ?\n\nNome: "
                                                                                + produtoCliente.getNome() +
                                                                                "\nMarca: "
                                                                                + produtoCliente.getMarca()
                                                                                + "\nPreço: "
                                                                                + produtoCliente.getPreco()
                                                                                + "\n",

                                                                "Sobre o Produto",
                                                                JOptionPane.YES_NO_OPTION);
                                                if (respostaClienteProduto == JOptionPane.YES_OPTION) {

                                                        clienteNovo.setCompras(produtoCliente);
                                                        double valorTotal = calculandoTotalCarrinho(clienteNovo);
                                                        String comprasAtualCliente = comprasAtualCliente(clienteNovo);
                                                        JOptionPane.showMessageDialog(null,
                                                                        "** Seu carrinho **\nValor Total: "
                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                        valorTotal)
                                                                                        + "\n\n" + comprasAtualCliente);
                                                }

                                        }

                                        int resposta = JOptionPane.showConfirmDialog(null,
                                                        "Deseja continuar comprando ?",
                                                        "Confirmação",
                                                        JOptionPane.YES_NO_OPTION);

                                        if (resposta != JOptionPane.YES_OPTION) {

                                                if (clienteNovo.getCompras() != null) {

                                                        String comprasAtualCliente = comprasAtualCliente(clienteNovo);
                                                        String cpf = JOptionPane.showInputDialog(
                                                                        "Antes de ir para o carrinho\npasse o seu cpf:");
                                                        int respostaFecharCarrinho = JOptionPane.showConfirmDialog(null,
                                                                        "** No seu carrinho tem: **\n\n"
                                                                                        + comprasAtualCliente
                                                                                        + "\n\n Deseja fechar o carrinho ?",
                                                                        "Confirmação",
                                                                        JOptionPane.YES_NO_OPTION);

                                                        if (respostaFecharCarrinho == JOptionPane.YES_OPTION) {
                                                                double valorTotal = calculandoTotalCarrinho(
                                                                                clienteNovo);
                                                                if (verificandoCliente(clienteFarmacia, cpf)) {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "Você tem Cadastro!!\n\nValor: R$"
                                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                                        valorTotal)
                                                                                                        + "\nValor 10% OFF: R$"
                                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                                        valorTotal * 0.9));
                                                                } else {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "Você não tem Cadastro!!\n\nValor: R$"
                                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                                        valorTotal));
                                                                }

                                                                if (auxAtendente == null) {
                                                                        if (atendente.getTipoFuncionario()
                                                                                        .equals("Vendedor")) {
                                                                                ((Vendedor) atendente).setVendas(
                                                                                                contaCompras);
                                                                        } else if (atendente.getTipoFuncionario()
                                                                                        .equals("Farmaceutico")) {
                                                                                ((Farmaceutico) atendente).setVendas(
                                                                                                contaCompras);
                                                                        }
                                                                        calculaSalarioFuncionario(atendente,
                                                                                        farmaciaFuncionarios,
                                                                                        clienteNovo, flag);
                                                                } else {
                                                                        if (auxAtendente.getTipoFuncionario()
                                                                                        .equals("Vendedor")) {
                                                                                calculaSalarioFuncionario(auxAtendente,
                                                                                                farmaciaFuncionarios,
                                                                                                clienteNovo, flag);
                                                                                ((Vendedor) atendente).setVendas(
                                                                                                contaCompras);
                                                                        } else if (atendente.getTipoFuncionario()
                                                                                        .equals("Farmacêutico")) {
                                                                                calculaSalarioFuncionario(atendente,
                                                                                                farmaciaFuncionarios,
                                                                                                clienteNovo, flag);
                                                                                ((Farmaceutico) atendente).setVendas(
                                                                                                contaFarmaceutico);
                                                                        }
                                                                }

                                                        } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "** Carrinho Fechado **");
                                                        }

                                                }
                                                break;
                                        }
                                }

                        } else if (selecionarOpcao.equals("Sair")) {
                                break;

                        }

                        if (contadorCliente == 11) {
                                break;
                        }
                        // relatorio cliente
                        // relatorio funcionario
                }
        }
}