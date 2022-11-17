package OrientadoObjetos.Aula5.Atividade6.model;

public class Curso {
    private  String nome;
    private  String categoria;
    private  float Valor;
    private  int matricula;
    private  String professor;

    public Curso(String nome, String categoria, float valor, int matricula, String professor) {
        this.nome = nome;
        this.categoria = categoria;
        this.Valor = valor;
        this.matricula = matricula;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float valor) {
        this.Valor = valor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public void vizualizar (){
        System.out.println("Nome:"+getNome());
        System.out.println("Cargo :"+ getCategoria());
        System.out.println("Salario:"+ getValor());
        System.out.println("Matricula:"+getMatricula());
        System.out.println("Departamento:"+ getProfessor());
    }

}
