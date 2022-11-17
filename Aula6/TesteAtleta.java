package OrientadoObjetos.Aula6;

public class TesteAtleta {
    public static void main(String[] args) {
        Triatleta tri = new Triatleta("jonas");
        System.out.println(tri.getNome());
        tri.aquecer();
        tri.correr();
        tri.nadar();
        tri.Pedalar();

    }
}
