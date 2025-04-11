/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package empresa;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Empresa {

    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>();
        SimpleDateFormat formatodata = new SimpleDateFormat("dd/mm/YYYY");
        while (true) {
            long CPF = Long.parseLong(JOptionPane.showInputDialog("informe o CPF, digite 0 para sair :"));
            if (CPF == 0) {
                break;
            }
            String Nome = JOptionPane.showInputDialog("informe o nome :");
            float Salario = Float.parseFloat(JOptionPane.showInputDialog("informe o salario :"));
            Date Datadeadmissao = null;
            while (true) {
                try {
                    Datadeadmissao = formatodata.parse(JOptionPane.showInputDialog("informe a data de admissao :"));
                    break;
                } catch (ParseException ex) {
                    System.out.println("Data inválida");
                    Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            Funcionario f = new Funcionario();
            f.setCPF(CPF);
            f.setNome(Nome);
            f.setSalario(Salario);
            f.setDatadeadimissao(Datadeadmissao);
            lista.add(f);

        }
        if (!lista.isEmpty()) {
            float soma = 0;
            NumberFormat formatoBrasil = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            for (Funcionario f : lista) {
                String CPF = String.format("%011d", f.getCPF());
                System.out.println("CPF: " + String.format("%s.%s.%s-%s",
                        CPF.substring(0, 3),
                        CPF.substring(3, 6),
                        CPF.substring(6, 9),
                        CPF.substring(9, 11)));
                System.out.println("Nome: " + f.getNome());
                
                System.out.println("Salario: " + formatoBrasil.format(f.getSalario()));
                System.out.println("Data de adimissao: " + formatodata.format(f.getDatadeadimissao()));
                System.out.println("");
                soma = soma + f.getSalario();
            }
            System.out.println("Qtde de funcionários: " + lista.size());
            System.out.println("Média Salarial " + formatoBrasil.format(soma / lista.size()));
        }
        System.out.println("Fim do programa");
    }
}
