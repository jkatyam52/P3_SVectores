import java.util.ArrayList;

public abstract class Estadisticas {
    protected ArrayList<Integer> vector=new ArrayList<>();

    public void setVector(ArrayList<Integer> vector) {
        this.vector = vector;
    }

    public abstract void min();
    public abstract void max();
    public abstract void suma();
}
