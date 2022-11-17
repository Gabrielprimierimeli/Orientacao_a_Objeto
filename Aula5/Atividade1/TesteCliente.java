package OrientadoObjetos.Aula5.Atividade1;

import OrientadoObjetos.Aula5.Atividade1.model.PessoaFisica;

import java.util.Date;

public class TesteCliente {
    public static void main(String[] args) {
        PessoaFisica cliente1 = new PessoaFisica(
                "Marcos",
                "Mecânico",
                8000.0f,
                89634565434l,
                new Date(20/12/1990));
        PessoaFisica cliente2 = new PessoaFisica(
                "João Cleber",
                "Farmaceutico",
                7000.00f,
                45623487956l,
                new Date(20/12/1990));
        cliente1.vizualizar();
        cliente2.vizualizar();


    }
}
