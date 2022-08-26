import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        int numero;
        ArrayList <Integer>vector=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Operaciones ope =new Operaciones();

        for (int a=0;a<5;a++){
            System.out.println("Ingrese los numeros de vector ");
            numero=Integer.parseInt(br.readLine());
            vector.add(numero);
        }

        ope.setVector(vector);
        ope.max();
        ope.min();
        ope.suma();
        System.out.println("El numero maximo del vector fue: "+ope.getMax()+
                "\nEl minimo: "+ope.getMin()+
                "\nY la suma fue de: "+ ope.getSuma());


    }

}