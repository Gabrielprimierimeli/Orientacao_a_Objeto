package OrientadoObjetos.Aula5.Atividade6.model;

public class CursoEad extends Curso {
        private String plataforma;


    public CursoEad(String nome, String categoria, float valor, int matricula, String professor,String plataforma) {
        super(nome, categoria, valor, matricula, professor);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void vizualizar() {
        super.vizualizar();
        System.out.println("Plataforma : "+getPlataforma());
        System.out.println("\n **********************************");

    }
}
