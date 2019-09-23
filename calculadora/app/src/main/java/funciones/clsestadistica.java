package funciones;

public class clsestadistica {
    private int [] arreglo;

    public clsestadistica(int []arreglolleno){
        arreglo = arreglolleno;
    }



    public double desviacion(){
        double prom, sum =0; int i, n = arreglo.length;
        prom = promedio();

        for (i = 0; i<n; i++){

            sum +=  Math.pow(arreglo[i]-prom , 2);
        }
        return Math.sqrt( sum / (double)n);
    }



    public double promedio(){
        double prom = 0.0;
        for ( int i = 0; i < arreglo.length; i++){
            prom+=arreglo[i];
        }
        return prom/(double)arreglo.length;
    }


    public int[] burbuja (int ord){


        int i,j,n= arreglo.length, aux=0;
        for(i=0; i <n-1; i++){

            for(j=i+1; j <n;j++){
                if(ord ==0){
                    if(arreglo [i]>arreglo[j]){
                        aux = arreglo[j];
                        arreglo [j] = arreglo[i];
                        arreglo[i] = aux;
                    }
                }else if(ord ==1){
                    if(arreglo[i]<arreglo[j]){
                        aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }//if ord =1
            }//if ord=0
        }
        return arreglo;
    }


    public static void despliegacontenido(int []arr){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr [i] + " ");
        }
        System.out.println("");
    }

    public double mediana(){
        int pos = 0, n = arreglo.length;
        double temp = 0, temp0=0;
        arreglo = burbuja(0);

        temp = n/2;
        if(n % 2 ==0){
            pos = (int)temp;
            temp0 = (double)(arreglo [pos]/arreglo [pos+1]);
        }
        if(n%2==1){
            pos = (int)(temp+ 0.5);
            temp0=(double)(arreglo[pos]);
        }
        return temp0;
    }

    public int rango(){
        arreglo=burbuja(1);
        return arreglo [arreglo.length-1]- arreglo[0];
    }

    public int moda(){
        int i, j, moda = 0, n = arreglo.length, frec;
        int frecTemp, frecModa = 0, moda1=-1;

        arreglo = burbuja(0);
        for(i =0; i <n; i++){
            frecTemp =1;
            for(j = i+1; j <n; j++){
                if(arreglo[i] == arreglo[j]){
                    frecTemp++;
                }
                if(frecTemp > frecModa){
                    frecModa = frecTemp;
                    moda1 = arreglo[i];
                }
            }

        }
        return moda1;
    }

    public void reportavector(){
        for(int i =0; i <arreglo.length; i++)
        {
            System.out.print(arreglo [i]+" ");
        }

    }
}
