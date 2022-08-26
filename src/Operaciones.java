public class Operaciones extends Estadisticas {
    private int max=0, suma, min=0;


    public int getSuma() {
        return suma;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void suma() {
        for (int a = 0; a < vector.size(); a++) {
            suma += vector.get(a);
        }
    }

    @Override
    public void min() {
        min=max;
        for (int b = 0; b < vector.size(); b++) {
            if (vector.get(b) < min) {
                min = vector.get(b);
            }
        }
    }

    @Override
    public void max() {
        for (int b = 0; b < vector.size(); b++) {
            if (vector.get(b) > max) {
                max = vector.get(b);
            }
        }

    }
}