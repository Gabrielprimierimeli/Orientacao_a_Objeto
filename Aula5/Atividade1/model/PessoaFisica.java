package OrientadoObjetos.Aula5.Atividade1.model;

import java.util.Date;

public class PessoaFisica extends Cliente {
    private long cpf;
    public PessoaFisica(String nome, String cargo, float salario, long cpf, Date nascimento) {
        super(nome, cargo, salario, nascimento);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void vizualizar() {
        super.vizualizar();
        System.out.println("CPF:"+getCpf());
        System.out.println("\n **********************************");

    }
}
