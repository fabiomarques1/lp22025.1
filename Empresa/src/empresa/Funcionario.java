/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Funcionario {

    private long CPF;
    private String Nome;
    private float Salario;
    private Date Datadeadimissao;

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public Date getDatadeadimissao() {
        return Datadeadimissao;
    }

    public void setDatadeadimissao(Date Datadeadimissao) {
        this.Datadeadimissao = Datadeadimissao;
    }

}
