package OrientadoObjetos.Aula5.Atividade6;

import OrientadoObjetos.Aula5.Atividade6.model.CursoEad;

public class TesteCurso {
    public static void main(String[] args) {
        CursoEad java = new CursoEad(
                "Java Fullstack",
                "Fullstack",
                2000.00f,
                234567,
                "Rafael",
                "Zoom");
        CursoEad react = new CursoEad(
                "React estilo shinob",
                "Front-end",
                2000.00f,
                234568,
                "Yuri",
                "Meet");
        java.vizualizar();
        react.vizualizar();
    }
}
