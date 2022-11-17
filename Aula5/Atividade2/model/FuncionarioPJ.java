package OrientadoObjetos.Aula5.Atividade2.model;

public class FuncionarioPJ extends Funcionario{
    private long cnpj;
    private String nomeFantasia;

    public FuncionarioPJ(String nome, String cargo, float salario,long cnpj,String nomeFantasia, int matricula, String departamento) {
        super(nome, cargo, salario, matricula, departamento);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;

    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void vizualizar() {
        super.vizualizar();
        System.out.println("Cnpj: "+getCnpj());
        System.out.println("Nome Fantasia: "+getNomeFantasia());
        System.out.println("\n **********************************");

    }
}
