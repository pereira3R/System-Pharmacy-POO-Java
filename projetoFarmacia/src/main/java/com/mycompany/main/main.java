
package com.mycompany.main;

//Importando classes services
import com.mycompany.service.Farmacia;
import com.mycompany.service.Funcionario;
import com.mycompany.service.Vendedor;
import com.mycompany.service.Farmaceutico;
import com.mycompany.service.Cliente;

//Importando classes products 
import com.mycompany.products.Produtos;
import com.mycompany.products.Remedio;
import com.mycompany.products.NRemedio;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class main {

        public void start() {
                ArrayList<Produtos> produtosRede = new ArrayList<Produtos>();
        }

        public static void cadastrarFuncionarios(ArrayList<Funcionario> funcionariosFarmacia) {
                Funcionario funcionarioAnthony = new Farmaceutico("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(66) 99233-7652", "www.farmaciaLav.com.br", 1300,
                                "Anthony Ricardo Rodrigues Rezende", "072.417.431-02", "Vendedor", 0);
                funcionariosFarmacia.add(funcionarioAnthony);
                Funcionario funcionarioLetizia = new Farmaceutico("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(69) 98417-7172", "www.farmaciaLav.com.br", 1300,
                                "Letízia Manuella Serqueira Eugênio", "012.237.441-02", "Farmacêutico", 1);
                funcionariosFarmacia.add(funcionarioLetizia);
                Funcionario funcionarioVinicius = new Farmaceutico("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(66) 99233-7652", "www.farmaciaLav.com.br", 1300,
                                "Vinicius Padilha Vieira", "022.407.431-24", "Vendedor", 0);
                funcionariosFarmacia.add(funcionarioVinicius);
        }

        public static boolean verificandoCliente(ArrayList<Cliente> clienteFarmacia, String CPF) {

                for (int i = 0; i < clienteFarmacia.size(); i++) {
                        if (clienteFarmacia.get(i).getCPF().equals(CPF)) {
                                return true;
                        }
                }
                return false;
        }

        public static void cadastrandoProdutos(ArrayList<Produtos> todosProdutos) {

        }

        public static Remedio buscandoRemedio(ArrayList<Remedio> remedios, String nomeRemedio) {
                for (int i = 0; i < remedios.size(); i++) {
                        if (remedios.get(i).getNome().equals(nomeRemedio)) {
                                return remedios.get(i);
                        }
                }
                return null;
        }

        public static NRemedio buscandoNRemedio(ArrayList<NRemedio> Nremedios, String nomeRemedio) {
                for (int i = 0; i < Nremedios.size(); i++) {
                        if (Nremedios.get(i).getNome().equals(nomeRemedio)) {
                                return Nremedios.get(i);
                        }
                }
                return null;
        }

        public static void main(String[] args) {

                // Lista para incluir Todos os produtos
                ArrayList<Produtos> produtosFarmacia = new ArrayList<Produtos>();

                // Lista para incluir todos os clientes atendidos na farmácia
                ArrayList<Cliente> clienteFarmacia = new ArrayList<Cliente>();

                // Lista para incluir os funcionários da Farmácia
                ArrayList<Funcionario> farmaciaFuncionarios = new ArrayList<Funcionario>();
                cadastrarFuncionarios(farmaciaFuncionarios);

                // Coletando informações sobre a Farmacia

                String NomeFarmacia = "LAV";
                String CNPJ = "48. 048. 138/0001-79";
                String Telefone = "(66) 99233-7652";
                String Endereco = "Boa Esperança, Rua 8, N. 254";
                String Site = "www.farmaciaLav.com.br";
                double SalarioBase = 1300;

                // Apresentando os dados da Farmácia
                while (true) {
                        JOptionPane.showMessageDialog(null,
                                        "** Informações sobre a Farmácia LAV **\n\n[1] Nome: " + NomeFarmacia
                                                        + "\n[2] CNPJ: "
                                                        + CNPJ + "\n[3] Telefone: " + Telefone + "\n[4] Endereço: "
                                                        + Endereco
                                                        + "\n[5] Site: " + Site + "\n\n [ FARMÁCIA ABERTA ]");

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

                                if (verificandoCliente(clienteFarmacia, cpfCliente)) {
                                        JOptionPane.showMessageDialog(null, "Bem-vindo novamente !!");
                                } else {
                                        String nomeCliente = JOptionPane.showInputDialog("Digite o seu Nome: ");
                                        String telCliente = JOptionPane.showInputDialog("Digite o seu Telefone: ");

                                        // Instanciando um Novo Cliente
                                        JOptionPane.showMessageDialog(null,
                                                        "** Informações Passadas **\n\nCPF: " + cpfCliente + "\nNome: "
                                                                        + nomeCliente + "\nTelefone: " + telCliente);

                                        int resposta = JOptionPane.showConfirmDialog(null,
                                                        "Você deseja alterar os dados ?",
                                                        "Confirmação", JOptionPane.YES_NO_OPTION);
                                        if (resposta == JOptionPane.YES_OPTION) {
                                                Object[] opcaoCliente = { "CPF", "Nome", "Telefone" };

                                                Object selecionaOpcaoCliente = JOptionPane.showInputDialog(
                                                                null,
                                                                "** Alteração de Dados **",
                                                                "Opção",
                                                                JOptionPane.INFORMATION_MESSAGE,
                                                                null,
                                                                opcaoCliente, // Você pode passar o array de itens aqui,
                                                                              // mas não
                                                                              // é usado diretamente
                                                                null // Valor padrão selecionado
                                                );
                                                if (selecionaOpcaoCliente.equals("CPF")) {
                                                        cpfCliente = JOptionPane.showInputDialog("Digite o seu CPF: ");

                                                } else if (selecionaOpcaoCliente.equals("Nome")) {
                                                        nomeCliente = JOptionPane
                                                                        .showInputDialog("Digite o seu Nome: ");

                                                } else if (selecionaOpcaoCliente.equals("Telefone")) {
                                                        telCliente = JOptionPane
                                                                        .showInputDialog("Digite o seu Telefone: ");

                                                }
                                        } else {
                                                continue;
                                        }

                                        Cliente novoCliente = new Cliente(nomeCliente, cpfCliente, Telefone);
                                        clienteFarmacia.add(novoCliente);
                                }

                        } else if (selecionarOpcao.equals("Comprar")) {

                                String[] opcaoCompra = { "Remédios", "Não Remédios" };
                                String compraSelecionada = (String) JOptionPane.showInputDialog(
                                                null,
                                                "Escolha uma opção:",
                                                "Menu Compras - LAV",
                                                JOptionPane.QUESTION_MESSAGE,
                                                null,
                                                opcaoCompra,
                                                opcaoCompra[0]);

                                cadastrandoProdutos(produtosFarmacia);

                                if (compraSelecionada.equals("Remédios")) {
                                        ArrayList<Remedio> listaRemedios = new ArrayList<Remedio>();
                                        String[] nomesRemedios = {};
                                        for (int i = 0; i < produtosFarmacia.size(); i++) {
                                                if (produtosFarmacia.get(i).getTipo().equals("Remédio")) {
                                                        listaRemedios.add(((Remedio) produtosFarmacia.get(i)));
                                                        nomesRemedios[i] = produtosFarmacia.get(i).getNome();
                                                }
                                        }
                                        while (true) {

                                                String compraRemedio = (String) JOptionPane.showInputDialog(
                                                                null,
                                                                "Escolha uma opção:",
                                                                "Menu Compras - LAV",
                                                                JOptionPane.QUESTION_MESSAGE,
                                                                null,
                                                                nomesRemedios,
                                                                nomesRemedios[0]);

                                                if (compraRemedio != null) {
                                                        Remedio produtoCliente = buscandoRemedio(listaRemedios,
                                                                        compraRemedio);
                                                        boolean receita = produtoCliente.getReceitaRemedio();
                                                        if (receita) {

                                                                int resposta = JOptionPane.showConfirmDialog(null,
                                                                                "Você possui Receita ?",
                                                                                "Confirmação",
                                                                                JOptionPane.YES_NO_OPTION);
                                                                if (resposta == 1) {
                                                                        continue;
                                                                } else {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                        "Para comprar esse remédio,\n você precisa de receita");
                                                                }
                                                        } else {
                                                        }
                                                }
                                        }

                                } else if (compraSelecionada.equals("Não Remédios")) {

                                        ArrayList<NRemedio> listaNRemedios = new ArrayList<NRemedio>();
                                        Object[] nomesNRemedios = {};
                                        for (int i = 0; i < produtosFarmacia.size(); i++) {
                                                if (produtosFarmacia.get(i).getTipo().equals("Não Remédio")) {
                                                        listaNRemedios.add(((NRemedio) produtosFarmacia.get(i)));
                                                        nomesNRemedios[i] = produtosFarmacia.get(i);
                                                }
                                        }
                                        while (true) {

                                                String compraNRemedio = (String) JOptionPane.showInputDialog(
                                                                null,
                                                                "Escolha uma opção:",
                                                                "Menu Compras - LAV",
                                                                JOptionPane.QUESTION_MESSAGE,
                                                                null,
                                                                nomesNRemedios,
                                                                nomesNRemedios[0]);

                                                if (compraNRemedio != null) {
                                                        NRemedio produtoCliente = buscandoNRemedio(listaNRemedios,
                                                                        compraNRemedio);

                                                        int resposta = JOptionPane.showConfirmDialog(null,
                                                                        "Deseja comprar mais produtos ?",
                                                                        "Confirmação",
                                                                        JOptionPane.YES_NO_OPTION);
                                                        if (resposta == 1) {
                                                                continue;
                                                        } else {
                                                                break;
                                                        }

                                                }

                                        }
                                }

                        } else if (selecionarOpcao.equals("Sair")) {
                                break;
                        }
                }
        }

}
