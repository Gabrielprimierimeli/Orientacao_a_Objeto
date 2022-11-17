package OrientadoObjetos.Aula6;

public class Triatleta extends Pessoa implements Atleta, Ciclista, Corredor, Nadador {
    public Triatleta(String nome) {
        super(nome);
    }

    @Override
    public void aquecer() {
        System.out.println("aquecendo \n");
    }

    @Override
    public void Pedalar() {
        System.out.println("pedalando \n");

    }

    @Override
    public void correr() {
        System.out.println("correndo \n");

    }

    @Override
    public void nadar() {
        System.out.println("nadando \n");

    }
}
