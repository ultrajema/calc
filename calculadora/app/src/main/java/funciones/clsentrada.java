package funciones;

public class clsentrada {

    public int[] llenararreglo (int elementos){
        int i;
        int [] v;
        v = new int [elementos];

        for(i=0; i<elementos;i++){

            v[i]++;
        }
        return v;

    }
}
