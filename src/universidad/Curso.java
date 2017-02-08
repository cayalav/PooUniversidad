package universidad;

public class Curso {

    private int nrc;
    private Profesor profesor;

    public Curso(int nrc) {
        this.nrc = nrc;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == null) {
            this.profesor = profesor;
        }
    }

    public int getNrc() {
        return nrc;
    }

}
