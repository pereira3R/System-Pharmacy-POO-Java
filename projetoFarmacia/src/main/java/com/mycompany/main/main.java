
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

    public static void main(String[] args) {

        // Lista para incluir os funcionários da Farmácia
        ArrayList<Funcionario> farmaciaFuncionarios = new ArrayList<Funcionario>();
        int ContOpa = 0;
        JOptionPane.showMessageDialog(null,
                "** Bem-Vindo a Rede Farmacêutica ANPOLO **\n\n Vamos fazer o seu cadastro já !!");
        JOptionPane.showMessageDialog(null,
                "** Lista de Todos os Dados **\n\n[1] Nome\n[2] CNPJ\n[3] Telefone\n[4] Endereço\n[5] Site\n\nAdicione um por vez...");

        // Coletando informações sobre a Farmacia

        String NomeFarmacia = JOptionPane.showInputDialog("Passe o Nome: ");
        String CNPJ = JOptionPane.showInputDialog("Passe o CNPJ\nSeguindo o padrão: XX. XXX. XXX/0001-XX\n\n");
        String Telefone = JOptionPane.showInputDialog("Passe o Telefone: \nSeguindo o padrão: (DD) XXXX-YYYY\n\n");
        String Endereco = JOptionPane.showInputDialog("Passe o Endereço: ");
        String Site = JOptionPane.showInputDialog("Passe o Site: ");
        double SalarioBase = Double.parseDouble((JOptionPane.showInputDialog("Passe o Salário Base: ")));

        JOptionPane.showMessageDialog(null, "** ANPOLO **\n\nDesejamos saber mais sobre a sua empresa !!\n");
        JOptionPane.showMessageDialog(null,
                "Informações Extras\n\n[1] N. de Empregados\n[2] Produto que mais vende\n[3] Produto que menos vende\n");

        Object[] itens = { "Adicionar Empregados", "Adicionar Produto mais vendido",
                "Adicionar Produto menor vendido" };
        Object selectedValue = JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Opção",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                itens, // Você pode passar o array de itens aqui, mas não é usado diretamente
                itens[0] // Valor padrão selecionado
        );

        while (true) {
            if (selectedValue.equals("Adicionar Empregados")) {
                int qtdaFuncionarios = Integer
                        .parseInt(JOptionPane.showInputDialog("Digite o número de funcionários:"));
                for (int i = 0; i < qtdaFuncionarios; i++) {
                    Object[] tipoFuncionario = { "Farmacêutico", "Vendedor" };
                    Object selectedFuncionario = JOptionPane.showInputDialog(null,
                            "Escolha uma opção", "Opção", JOptionPane.INFORMATION_MESSAGE, null, tipoFuncionario,
                            tipoFuncionario[0]);
                    if (selectedFuncionario.equals("Farmacêutico")) {
                        JOptionPane.showMessageDialog(null,
                                "** Precisamos dos dados **\n\n[1] Nome\n[2] CPF\n[3] Tipo de Funcionario\n[4] Certificado\n[5] Salário\n");
                        String Nome = JOptionPane.showInputDialog("Digite o nome: ");
                        String CPF = JOptionPane.showInputDialog("Digite o CPF: ");
                        int certificacao = JOptionPane.showConfirmDialog(null, "Possui certificado ?", "Confirmação",
                                JOptionPane.YES_NO_OPTION);

                        if (certificacao == JOptionPane.YES_OPTION) {
                            continue;
                        } else if (certificacao == JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null,
                                    "Farmacêutico tem que possuir certificação !!\n\nEmpresa Desaprovada");
                            break;
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

        public static void main(String[] args) {

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

                                                } else if (selecionaOpcaoCliente.equals("Nome")) {

                                                } else if (selecionaOpcaoCliente.equals("Telefone")) {

                                                }
                                        } else {
                                                continue;
                                        }

                                        Cliente novoCliente = new Cliente(nomeCliente, cpfCliente, Telefone);
                                        clienteFarmacia.add(novoCliente);
                                }

                        } else if (selecionarOpcao.equals("Comprar")) {

                        } else if (selecionarOpcao.equals("Sair")) {
                                break;
                        }
                }
        }

}
