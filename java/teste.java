import java.util.Scanner;

/**
 * teste
 */
public class teste {

    public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
	    double nota = s.nextDouble();
	    int falta = s.nextInt();
	    double renda = s.nextDouble();
	    
	    if((nota>=8.0 && falta<=10 && renda<2000.00)||(nota>=9.5 && falta==0)){
	        System.out.println("Pode receber bolsa");
	    }else{
	        System.out.println("Não pode receber bolsa");
	    }
	}
    
}