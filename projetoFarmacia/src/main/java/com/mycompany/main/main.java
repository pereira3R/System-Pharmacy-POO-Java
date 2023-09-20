
package com.mycompany.main;

//Importando classes services
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

        public static void cadastrarFuncionarios(ArrayList<Funcionario> funcionariosFarmacia) {
                Funcionario funcionarioAnthony = new Vendedor("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(66) 99233-7652", "www.farmaciaLav.com.br", 1300,
                                "Anthony Ricardo Rodrigues Rezende", "072.417.431-02", "Vendedor", 0);
                funcionariosFarmacia.add(funcionarioAnthony);
                Funcionario funcionarioLetizia = new Farmaceutico("LAV", "48. 048. 138/0001-79",
                                "Boa Esperança, Rua 8, N. 254", "(69) 98417-7172", "www.farmaciaLav.com.br", 1300,
                                "Letízia Manuella Serqueira Eugênio", "012.237.441-02", "Farmacêutico", 1);
                funcionariosFarmacia.add(funcionarioLetizia);
                Funcionario funcionarioVinicius = new Vendedor("LAV", "48. 048. 138/0001-79",
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

        public static ArrayList<Produtos> cadastrandoProdutos(ArrayList<Produtos> todosProdutos) {

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

        public static Produtos buscandoRemedio(ArrayList<Produtos> remedios, String nomeRemedio) {
                for (int i = 0; i < remedios.size(); i++) {
                        if (remedios.get(i).getNome().equals(nomeRemedio)) {
                                Produtos resultado = remedios.get(i);
                                return resultado;
                        }
                }
                return null;
        }

        public static Produtos buscandoNRemedio(ArrayList<Produtos> Nremedios, String nomeNRemedio) {
                for (int i = 0; i < Nremedios.size(); i++) {
                        if (Nremedios.get(i).getNome().equals(nomeNRemedio)) {
                                Produtos resultado = Nremedios.get(i);
                                return resultado;
                        }
                }
                return null;
        }

        public static String comprasAtualCliente(Cliente clienteNovo) {

                ArrayList<Produtos> produtosCliente = clienteNovo.getCompras();
                String listaStringProdutos = "";
                for (int i = 0; i < produtosCliente.size(); i++) {
                        listaStringProdutos += "-> " + produtosCliente.get(i).getNome() + "\n";
                }
                return listaStringProdutos;
        }

        public static void main(String[] args) {
                // Lista de Compras dos Clientes
                ArrayList<Produtos> compraCliente = new ArrayList<Produtos>();

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

                // Definindo Cliente + Informações
                Cliente clienteNovo = new Cliente("", "", "");

                // Apresentando os dados da Farmácia
                while (true) {
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

                                        clienteNovo.setCPF(cpfCliente);
                                        clienteNovo.setNome(nomeCliente);
                                        clienteNovo.setTelefone(telCliente);
                                }

                        } else if (selecionarOpcao.equals("Comprar")) {
                                while (true) {
                                        String[] opcaoCompra = { "Remédios", "Não Remédios" };
                                        String compraSelecionada = (String) JOptionPane.showInputDialog(
                                                        null,
                                                        "Escolha uma opção:",
                                                        "Menu Compras - LAV",
                                                        JOptionPane.QUESTION_MESSAGE,
                                                        null,
                                                        opcaoCompra,
                                                        opcaoCompra[0]);

                                        // Cadastrando Todos os Produtos - 10 Remédios & 10 N. Remédios
                                        produtosFarmacia = cadastrandoProdutos(produtosFarmacia);

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

                                                }

                                                clienteNovo.setCompras(produtoCliente);
                                                String comprasAtualCliente = comprasAtualCliente(clienteNovo);
                                                JOptionPane.showMessageDialog(null,
                                                                "** Seu carrinho **\n\n" + comprasAtualCliente);

                                        } else if (compraSelecionada.equals("Não Remédios")) {
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

                                                clienteNovo.setCompras(produtoCliente);
                                                String comprasAtualCliente = comprasAtualCliente(clienteNovo);
                                                JOptionPane.showMessageDialog(null,
                                                                "** Seu carrinho **\n\n" + comprasAtualCliente);

                                        }

                                        int resposta = JOptionPane.showConfirmDialog(null,
                                                        "Deseja continuar comprando ?",
                                                        "Confirmação",
                                                        JOptionPane.YES_NO_OPTION);

                                        if (resposta != JOptionPane.YES_OPTION) {
                                                break;
                                        }
                                }

                        } else if (selecionarOpcao.equals("Sair")) {
                                break;
                        }
                }
        }

}
