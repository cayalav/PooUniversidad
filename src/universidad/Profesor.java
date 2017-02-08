package universidad;

import java.util.ArrayList;

public class Profesor {

    int id;
    String nombre;
    ArrayList<Curso> cursos;

    public Profesor(int id) {
        this.id = id;
        cursos = new ArrayList();
    }

    public boolean agregarCurso(Curso curso) {
        if (cursos.size() < 10) {
            cursos.add(curso);

        }
        return false;
    }

}
