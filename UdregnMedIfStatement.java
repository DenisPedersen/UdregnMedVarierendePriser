import java.util.*;
public class UdregnMedIfStatement {

    public static void main(String[] args) {
        int antal = 149;   //antal af units (tv, mus, whatever)

        double totalPris = 0;  //en variabel for prisen i alt

        if (antal <150) {
            totalPris =antal*2.5;  //hvis der sælges under 150 er prisen 2.5 pr stk

        }else if (antal < 300) {
            totalPris = 100* 2.5 + (antal - 100)*2; //hvis prisen er ounder 300 men over 150 er prisen rettet
        } else if (antal > 300) {
            totalPris = 100 * 2.5 + 200 * 2 + (antal -300)*3; //prisen er rettet igen

        }
        System.out.println("Prisen er nu i alt " + totalPris); //print prisen
    }
}
