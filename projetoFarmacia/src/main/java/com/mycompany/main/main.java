
package com.mycompany.main;

//Importando classes services
import com.mycompany.service.Farmacia;
import com.mycompany.service.Funcionario;
import com.mycompany.service.Vendedor;
import com.mycompany.service.Farmaceutico;

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

                        int vendas = Integer
                                .parseInt(JOptionPane.showInputDialog(null, "Digite o número de vendas: "));

                        // Instanciando Func. do tipo Farmecêutico
                        Funcionario addFuncionario = new Farmaceutico(NomeFarmacia, CNPJ, Endereco, Telefone, Site,
                                SalarioBase, Nome, CPF, "Farmacêutico", certificacao);

                    } else if (selectedFuncionario.equals("Vendedor")) {

                        JOptionPane.showMessageDialog(null,
                                "** Precisamos dos dados **\n\n[1] Nome\n[2] CPF\n[3] Tipo de Funcionario\n[4] Salario\n");
                        String Nome = JOptionPane.showInputDialog("Digite o nome: ");
                        String CPF = JOptionPane.showInputDialog("Digite o CPF: ");
                        int certificacao = 0;
                        int vendas = Integer
                                .parseInt(JOptionPane.showInputDialog(null, "Digite o número de vendas: "));

                        Funcionario addFuncionario = new Vendedor(NomeFarmacia, CNPJ, Endereco, Telefone, Site,
                                SalarioBase, Nome, CPF, "Vendedor", certificacao);
                    }
                }
            } else if (selectedValue.equals("Adicionar Produto mais vendido")) {

            } else if (selectedValue.equals("Adicionar Produto menor vendido")) {

            }

        }

    }

}
