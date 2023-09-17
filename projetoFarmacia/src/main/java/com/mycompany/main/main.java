
package com.mycompany.main;

//Importando classes
import com.mycompany.service.Farmacia;
import com.mycompany.service.Funcionario;
import com.mycompany.service.Vendedor;
import com.mycompany.service.Farmaceutico;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Funcionario> farmaciaFuncionarios = new ArrayList<Funcionario>();
        JOptionPane.showMessageDialog(null,
                "** Bem-Vindo a Rede Farmacêutica ANPOLO **\n\n Vamos fazer o seu cadastro já !!");
        JOptionPane.showMessageDialog(null,
                "** Lista de Todos os Dados **\n\n[1] Nome\n[2] CNPJ\n[3] Telefone\n[4] Endereço\n[5] Site\n\nAdicione um por vez...");

        // Coletando informações sobre a Farmacia

        String name = JOptionPane.showInputDialog("Passe o Nome: ");
        String CNPJ = JOptionPane.showInputDialog("Passe o CNPJ\nSeguindo o padrão: XX. XXX. XXX/0001-XX\n\n");
        String Telefone = JOptionPane.showInputDialog("Passe o Telefone: \nSeguindo o padrão: (DD) XXXX-YYYY\n\n");
        String Endereço = JOptionPane.showInputDialog("Passe o Endereço: ");
        String Site = JOptionPane.showInputDialog("Passe o Site: ");

        // Tipo farmacia instanciado como funcionario
        Farmacia farmaciaCliente = new Funcionario();

        // Introduzindo Dados da Farmacia
        farmaciaCliente.setName(name);
        farmaciaCliente.setCNPJ(CNPJ);
        farmaciaCliente.setTelefone(Telefone);
        farmaciaCliente.setEndereco(Endereço);
        farmaciaCliente.setSite(Site);

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

                    } else if (selectedFuncionario.equals("Vendedor")) {

                    }
                }
            } else if (selectedValue.equals("Adicionar Produto mais vendido")) {

            } else if (selectedValue.equals("Adicionar Produto menor vendido")) {

            }

        }

    }

}
