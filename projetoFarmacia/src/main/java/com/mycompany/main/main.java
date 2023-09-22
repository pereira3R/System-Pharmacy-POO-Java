
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
import java.lang.Math;

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
                                2500,
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
                        if (cpfBuscado.equals(CPF) && (clienteFarmacia.get(i).getNome() != "Desconhecido")) {
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
        public static String comprasAtualCliente(Cliente cliente) {
                ArrayList<Produtos> produtosCliente = cliente.getCompras();
                String listaStringProdutos = "";
                if (cliente.getContaCompras() == 0) {
                        for (int i = cliente.getContaCompras(); i < produtosCliente.size(); i++) {
                                listaStringProdutos += "-> " + produtosCliente.get(i).getNome() + "\n";
                        }
                } else {
                        for (int i = cliente.getContaCompras() + 1; i < produtosCliente.size(); i++) {
                                listaStringProdutos += "-> " + produtosCliente.get(i).getNome() + "\n";
                        }
                }
                return listaStringProdutos;
        }

        // Função para calcular e retornar a soma de todos os produtos que estão no
        // carrinho do cliente
        public static double calculandoTotalCarrinho(Cliente cliente) {
                ArrayList<Produtos> produtosCliente = cliente.getCompras();
                double valorTotal = 0;
                if (cliente.getContaCompras() == 0) {
                        for (int i = cliente.getContaCompras(); i < produtosCliente.size(); i++) {
                                valorTotal += produtosCliente.get(i).getPreco();
                        }
                } else {
                        for (int i = cliente.getContaCompras() + 1; i < produtosCliente.size(); i++) {
                                valorTotal += produtosCliente.get(i).getPreco();
                        }
                }
                return valorTotal;
        }

        // Calculando o salário do Vendedor
        public static void calculaSalarioFuncionario(Funcionario funcionario,
                        ArrayList<Funcionario> farmaciaFuncionarios,
                        Cliente cliente, int flag) {

                ArrayList<Produtos> todosProdutos = cliente.getCompras();
                int i;

                for (i = 0; i < farmaciaFuncionarios.size(); i++) {
                        if (funcionario.getCPF().equals(farmaciaFuncionarios.get(i).getCPF())) {
                                break;
                        }
                }

                if (flag == 0) {
                        for (int j = 0; j < todosProdutos.size(); j++) {
                                farmaciaFuncionarios.get(i).calcularSalarioPorProduto(todosProdutos.get(j));
                        }
                } else {
                        if (funcionario.getTipoFuncionario().equals("Farmacêutico")) {
                                for (int j = 0; j < todosProdutos.size(); j++) {
                                        if (((Remedio) todosProdutos.get(j)).getTipoRemedio().equals("Injetável")) {
                                                farmaciaFuncionarios.get(1)
                                                                .calcularSalarioPorProduto(todosProdutos.get(j));
                                        }
                                }
                        } else {
                                for (int j = 0; j < todosProdutos.size(); j++) {
                                        if (((Remedio) todosProdutos.get(j)).getTipoRemedio() != "Injetável") {
                                                farmaciaFuncionarios.get(i)
                                                                .calcularSalarioPorProduto(todosProdutos.get(j));
                                        }
                                }
                        }
                }
        }

        public static void inserirVendas(Funcionario atendente, ArrayList<Funcionario> farmaciaFuncionarios,
                        int vendas) {
                int i;
                for (i = 0; i < farmaciaFuncionarios.size(); i++) {
                        if (atendente.getNome().equals(farmaciaFuncionarios.get(i).getNome())) {
                                break;
                        }
                }
                if (farmaciaFuncionarios.get(i).getTipoFuncionario().equals("Vendedor")) {
                        ((Vendedor) farmaciaFuncionarios.get(i)).setVendas(vendas);
                } else if (farmaciaFuncionarios.get(i).getTipoFuncionario().equals("Farmacêutico")) {
                        ((Farmaceutico) farmaciaFuncionarios.get(i)).setVendas(vendas);
                }
        }

        // Arrumar Relatório
        public static String relatorioFinalDia(ArrayList<Cliente> clienteFarmacia,
                        ArrayList<Funcionario> Funcionarios, double valorDesconhecidos) {

                double lucro = 0;

                //////////////////////////// Relatório Funcionários //////////////

                String relatorio = "Relatório de Funcionários:\n\n";

                for (int i = 0; i < Funcionarios.size(); i++) {

                        relatorio = relatorio + "Nome do funcionário: " + Funcionarios.get(i).getNome() + "\n" +
                                        "Cargo: " + Funcionarios.get(i).getTipoFuncionario() + "\n";

                        if (Funcionarios.get(i).getTipoFuncionario().equals("Vendedor")) {
                                relatorio = relatorio + "Número de Vendas: "
                                                + ((Vendedor) Funcionarios.get(i)).getVendas() + "\n" +
                                                "Taxa de Comissão (%) por Produto: " + "10" + "\n" +
                                                "Taxa de Comissão por meta (%) sob Salário Base: " + "10" + "\n" +
                                                "Salário (R$): "
                                                + formatarNumeroComDuasCasasDecimais(Funcionarios.get(i).getSalario())
                                                + "\n";

                                lucro += ((Vendedor) Funcionarios.get(i)).getLucroEmpresa();

                        } else if (Funcionarios.get(i).getTipoFuncionario().equals("Farmacêutico")) {
                                relatorio = relatorio + "Número de Vendas: "
                                                + ((Farmaceutico) Funcionarios.get(i)).getVendas() + "\n" +
                                                "Taxa de Comissão (%) por Produto: " + "10" + "\n" +
                                                "Taxa de Comissão por meta (%) sob Salário Base: " + "10" + "\n" +
                                                "Salário (R$): "
                                                + formatarNumeroComDuasCasasDecimais(Funcionarios.get(i).getSalario())
                                                + "\n";

                                lucro += ((Farmaceutico) Funcionarios.get(i)).getLucroEmpresa();
                        }

                        relatorio = relatorio + "\n";
                }

                //////////////////////////// Relatório clientes ////////////////////////////////

                relatorio = relatorio + "\nRelatório de Clientes:\n\n";

                for (Cliente C : clienteFarmacia) {
                        ArrayList<Produtos> todasCompras = C.getCompras();
                        if (C.getNome() != "Desconhecido") {
                                relatorio = relatorio + "Nome: " + C.getNome() + "\n" + "CPF: " + C.getCPF() + "\n"
                                                + "Quantidade de compras: " + todasCompras.size() + "\n"
                                                + "Valor total de compras (R$): "
                                                + formatarNumeroComDuasCasasDecimais(C.getValorTotalCompra()) + "\n\n";
                        }
                }

                relatorio = relatorio + "Valor total de não cadastrados: "
                                + formatarNumeroComDuasCasasDecimais(valorDesconhecidos);

                //////////////////////////// Lucro Total Farmácia LAV //////////////////////////
                relatorio += "\n\nLucro Bruto Farmácia LAV:\n\nValor Total: R$ "
                                + formatarNumeroComDuasCasasDecimais(lucro) + "\n";
                return relatorio;
        }

        public static int Buscar(ArrayList<Cliente> clienteFarmacia, String CPF) {
                for (int i = 0; i < clienteFarmacia.size(); i++) {
                        if (clienteFarmacia.get(i).getCPF().equals(CPF)) {
                                return i;
                        }
                }
                return -1;
        }

        public static String formatarNumeroComDuasCasasDecimais(double numero) {
                DecimalFormat formato = new DecimalFormat("0.00");
                return formato.format(numero);
        }

        public static ArrayList<Cliente> limpandoListaDeCompra(ArrayList<Cliente> clienteFarmacia, int posicaoCliente) {
                // Limpando
                Cliente clienteAtualizado = new Cliente(clienteFarmacia.get(posicaoCliente).getNome(),
                                clienteFarmacia.get(posicaoCliente).getCPF(),
                                clienteFarmacia.get(posicaoCliente).getTelefone());

                clienteFarmacia.set(posicaoCliente, clienteAtualizado);
                return clienteFarmacia;
        }

        public static void main(String[] args) {

                // Criando a variavel que vai armazenar o valor
                double valorTotalDesconhecidos = 0;

                // Criando a flag para validacao de casos de mudanca de atendimento
                int flag = 0;

                // Paraa contar o número de clientes
                int contadorCliente = 0;

                // Lista para incluir Todos os produtos
                ArrayList<Produtos> produtosFarmacia = new ArrayList<Produtos>();

                ArrayList<Produtos> teste = new ArrayList<Produtos>();

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

                // Contando compras
                int contaComprasCliente = 0;

                // Armazenar a quantidade de compras efetuadas pelo cliente
                int contaCompras = 0;
                int contaFarmaceutico = 0;

                // Apresentando os dados da Farmácia
                while (true) {

                        // Atualizando o flag para 0 novamente, pois receberemos um novo cliente;
                        flag = 0;

                        // Instanciano uma var random, pois vamos preciÇsar para randomizar o
                        // atendimento
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
                                        clienteFarmacia.add(clienteNovo);
                                }

                        } else if (selecionarOpcao.equals("Comprar")) {

                                contaComprasCliente++;

                                // Selecionado em "Comprar"
                                String cpf = JOptionPane.showInputDialog("Passe o seu CPF:");
                                if (!verificandoCliente(clienteFarmacia, cpf)) {
                                        contaCompras = 0;
                                        contaFarmaceutico = 0;
                                }

                                atendente = farmaciaFuncionarios.get(random.nextInt(3));
                                JOptionPane.showMessageDialog(null,
                                                "Atendimento com:\n\n Nome: " + atendente.getNome()
                                                                + "\n Cargo: "
                                                                + atendente.getTipoFuncionario());
                                while (true) {

                                        // Mostrando as opções Remédio e não remédio
                                        if (Buscar(clienteFarmacia, cpf) == -1) {
                                                clienteNovo.setCPF(cpf);
                                                clienteNovo.setNome("Desconhecido");
                                                clienteFarmacia.add(clienteNovo);
                                        }

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
                                                                        auxAtendente = farmaciaFuncionarios.get(1);

                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "Vamos te encaminhar para a farmacêutica\npara realizar a aplicação do injetável\n\nFarmacêutica: "
                                                                                                        + auxAtendente.getNome());

                                                                        flag = 1;
                                                                }
                                                        }

                                                        if (atendente.getNome()
                                                                        .equals("Letízia Manuella Serqueira Eugênio")) {
                                                                contaFarmaceutico++;
                                                        } else {
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

                                                        clienteFarmacia.get(Buscar(clienteFarmacia, cpf))
                                                                        .setCompras(produtoCliente);
                                                        double valorTotal = calculandoTotalCarrinho(clienteFarmacia
                                                                        .get(Buscar(clienteFarmacia, cpf)));
                                                        String comprasAtualCliente = comprasAtualCliente(clienteFarmacia
                                                                        .get(Buscar(clienteFarmacia, cpf)));
                                                        JOptionPane.showMessageDialog(null,
                                                                        "** Seu carrinho **\nValor Total: "
                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                        valorTotal)
                                                                                        + "\n\n" + comprasAtualCliente);
                                                }

                                        } else if (compraSelecionada.equals("Outros")) {

                                                if (atendente.getNome().equals("Letízia Manuella Serqueira Eugênio")) {
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

                                                        clienteFarmacia.get(Buscar(clienteFarmacia, cpf))
                                                                        .setCompras(produtoCliente);
                                                        double valorTotal = calculandoTotalCarrinho(clienteFarmacia
                                                                        .get(Buscar(clienteFarmacia, cpf)));
                                                        String comprasAtualCliente = comprasAtualCliente(clienteFarmacia
                                                                        .get(Buscar(clienteFarmacia, cpf)));
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
                                                        String comprasAtualCliente = "";
                                                        if (Buscar(clienteFarmacia, cpf) != -1) {
                                                                comprasAtualCliente = comprasAtualCliente(
                                                                                clienteFarmacia.get(Buscar(
                                                                                                clienteFarmacia, cpf)));
                                                        } else {
                                                                comprasAtualCliente = comprasAtualCliente(clienteNovo);
                                                        }
                                                        int respostaFecharCarrinho = JOptionPane.showConfirmDialog(null,
                                                                        "** No seu carrinho tem: **\n\n"
                                                                                        + comprasAtualCliente
                                                                                        + "\n\n Deseja fechar o carrinho ?",
                                                                        "Confirmação",
                                                                        JOptionPane.YES_NO_OPTION);

                                                        if (respostaFecharCarrinho == JOptionPane.YES_OPTION) {
                                                                double valorTotal = calculandoTotalCarrinho(
                                                                                clienteFarmacia.get(Buscar(
                                                                                                clienteFarmacia, cpf)));
                                                                if (verificandoCliente(clienteFarmacia, cpf)) {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "Você tem Cadastro!!\n\nValor: R$"
                                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                                        valorTotal)
                                                                                                        + "\nValor 10% OFF: R$"
                                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                                        valorTotal * 0.9));
                                                                        clienteFarmacia.get(
                                                                                        Buscar(clienteFarmacia, cpf))
                                                                                        .setValorTotalCompra(valorTotal
                                                                                                        * 0.9);
                                                                        clienteFarmacia.get(
                                                                                        Buscar(clienteFarmacia, cpf))
                                                                                        .setContaCompras(
                                                                                                        contaComprasCliente);
                                                                        ;
                                                                } else {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "Você não tem Cadastro!!\n\nValor: R$"
                                                                                                        + formatarNumeroComDuasCasasDecimais(
                                                                                                                        valorTotal));
                                                                        valorTotalDesconhecidos += valorTotal;

                                                                        clienteFarmacia.get(
                                                                                        Buscar(clienteFarmacia, cpf))
                                                                                        .setContaCompras(
                                                                                                        contaComprasCliente);

                                                                }
                                                                clienteFarmacia.get(Buscar(clienteFarmacia, cpf))
                                                                                .setAtendidoPor(atendente);

                                                                if ((flag == 1) && (atendente
                                                                                .getTipoFuncionario() != "Farmacêutico")) {
                                                                        contaFarmaceutico++;
                                                                        contaCompras--;
                                                                        inserirVendas(auxAtendente,
                                                                                        farmaciaFuncionarios,
                                                                                        contaFarmaceutico);

                                                                        calculaSalarioFuncionario(auxAtendente,
                                                                                        farmaciaFuncionarios,
                                                                                        clienteFarmacia.get(
                                                                                                        Buscar(clienteFarmacia,
                                                                                                                        cpf)),
                                                                                        flag);
                                                                }
                                                                if (atendente.getTipoFuncionario()
                                                                                .equals("Vendedor")) {
                                                                        inserirVendas(atendente,
                                                                                        farmaciaFuncionarios,
                                                                                        contaCompras);
                                                                } else if (atendente.getTipoFuncionario()
                                                                                .equals("Farmacêutico")) {
                                                                        inserirVendas(atendente,
                                                                                        farmaciaFuncionarios,
                                                                                        contaFarmaceutico);
                                                                }
                                                                calculaSalarioFuncionario(atendente,
                                                                                farmaciaFuncionarios,
                                                                                clienteFarmacia.get(Buscar(
                                                                                                clienteFarmacia,
                                                                                                cpf)),
                                                                                flag);

                                                        } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "** Carrinho Fechado **");
                                                        }

                                                }
                                                break;
                                        }
                                }
                                // Contando os clientes ao longo do dia
                                contadorCliente++;

                        } else if (selecionarOpcao.equals("Sair")) {

                                // relatorio cliente
                                // relatorio funcionario

                                String relatorio = relatorioFinalDia(clienteFarmacia, farmaciaFuncionarios,
                                                valorTotalDesconhecidos);
                                JOptionPane.showMessageDialog(null, relatorio);
                                break;

                        }

                }
        }
}