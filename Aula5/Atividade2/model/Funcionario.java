package OrientadoObjetos.Aula5.Atividade2.model;

public class Funcionario {
    private  String nome;
    private  String cargo;
    private  float salario;
    private  int matricula;
    private  String departamento;

    public Funcionario(String nome, String cargo, float salario, int matricula, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void vizualizar (){
        System.out.println("Nome:"+getNome());
        System.out.println("Cargo :"+getCargo());
        System.out.println("Salario:"+getSalario());
        System.out.println("Matricula:"+getMatricula());
        System.out.println("Departamento:"+getDepartamento());
    }
}
