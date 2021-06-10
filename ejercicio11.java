import java.util.Scanner;
import java.util.Random;
public class ejercicio11
{
    static Scanner entrada = new Scanner(System.in);
    static Random ran = new Random();
    public static void main(String args[])
    {
        int contadorSegundaDecena = 0;
        int contadorNumerosImpares = 0;
        int contadorPromedio = 0;
        int promedioAuxiliar = 0;
        int cantidadIteraciones = 1;
        int numeroMod = 0;
        int numeroMayor = 0;
        int numeroAux = 0;
        System.out.println("Se mostraran en pantalla 10 numeros aleatorios generados entre el rango (0,36)");
        while(cantidadIteraciones <= 10)
        {
            int alNumero = ran.nextInt(36);
            System.out.println("El numero generado fue: "+alNumero);
            numeroMod = (alNumero % 2);
            numeroAux = (alNumero/2);
            if((numeroMod == 0) && (alNumero != 0))
            {
                promedioAuxiliar = (promedioAuxiliar+alNumero);
                contadorPromedio = (contadorPromedio+1);
            }
            if((numeroAux != 0) && (numeroMod != 0))
            {
                contadorNumerosImpares = (contadorNumerosImpares+1);
            }
            if((alNumero >= 13) && (alNumero <= 24))
            {
                contadorSegundaDecena = (contadorSegundaDecena+1);
            }
            if(alNumero > numeroMayor)
            {
                numeroMayor = alNumero;
            }
            cantidadIteraciones++;
        }
        int promedioRealPares = (promedioAuxiliar/contadorPromedio);
        System.out.println("");
        System.out.println("La cantidad de numeros impares fue: "+contadorNumerosImpares);
        System.out.println("");
        System.out.println("El promedio de los numeros pares sin contar los ceros fue: "+promedioRealPares);
        System.out.println("");
        System.out.println("La cantidad de numeros que se encuentran entre la 2 decena (13-24) fue: "+contadorSegundaDecena);
        System.out.println("");
        System.out.println("El numero mas grande generado fue: "+numeroMayor);
    }
}