import java.util.Scanner;

public class UdregnMedInputFraScanner {
    public static void main(String[] args) {
        long antal; //opret en variabel kaldet "antal" af typen long (så brugeren kan taste meget lange numre)
        Scanner input = new Scanner(System.in); // lav en ny scanner kaldet "input"
        System.out.println("Hvor mange vil du købe? ");
        antal = input.nextLong(); //sæt antallet af "antal"-variablen til at komme fra input
        double pris = 0; //lav en variabel kaldet pris af typen double så der kan komme decimaler med.

        if (antal<100){
            pris = antal *2 ;

        } else if (antal<300){
            pris = 100 * 2 + (antal -100)*2 ;

        } else if (antal >300){
            pris = 100 * 2 + 200 * 2.5 + (antal -300) *3;
        }
        System.out.println("Pris i alt " + pris);
    }
}
