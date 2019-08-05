import java.util.Scanner;
/**
 * Calculadora de eficiancia de combustible de MPG a LPK.
 *
 * @author (GINinja)
 * @version (06282019)
 */
public class EficienciaCombustible
{


    public static void main(String[] args)
   { Scanner scan = new Scanner( System.in );
       System.out.println("Ingrese el valor en MPG");
       double LPK = scan.nextInt();
       double conversion = 0.4251;
       double result = (LPK * conversion);
       
       System.out.println("Answer ="+ result);

      

    }
}