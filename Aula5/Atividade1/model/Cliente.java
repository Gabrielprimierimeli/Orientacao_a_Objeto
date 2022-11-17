package OrientadoObjetos.Aula5.Atividade1.model;

import java.util.Date;

public class Cliente {
    private String nome;
    private String Cargo;
    private float Salario;
    private Date nascimento;

    public Cliente(String nome, String cargo, float salario, Date nascimento) {
        this.nome = nome;
        Cargo = cargo;
        Salario = salario;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public void vizualizar (){
        System.out.println("Nome : "+getNome());
        System.out.println("Cargo : "+getCargo());
        System.out.println("Salario : "+getSalario());
        System.out.println("Nascimento : "+getNascimento());
    }
}
