package OrientadoObjetos.Aula5.Atividade2;

import OrientadoObjetos.Aula5.Atividade2.model.FuncionarioPJ;

public class TesteFuncionario {
    public static void main(String[] args) {
        FuncionarioPJ funcionario1 = new FuncionarioPJ(
                "Jhon Constantine",
                "Exorcista",
                20000.00f,
                34512345678956l,
                "Padres Anônimos LTDA",
                201050,
                "Sagrada Trindade");
        FuncionarioPJ funcionario2 = new FuncionarioPJ(
                "Gabriel Vanhelsing",
                "Matador de Vampiro",
                40000.00f,
                44567398765437l,
                "Mata Chupa Sangue LTDA",
                239056,
                "Limpeza");
        funcionario1.vizualizar();;
        funcionario2.vizualizar();;
    }
}
