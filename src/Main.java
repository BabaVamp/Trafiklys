//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // variables
        String time = "";
        String Traffic = "";
        String Area = "";
        String Emergency = "";


        // bruger inputs
        System.out.println("indtast tid på dagen (dag/aften/nat)");

        time = input.next();

        System.out.println("indtast trafikmægde (høj/lav)");

        Traffic = input.next();

        System.out.println("indtast områdets type (bolig/erhverv/blandet");

        Area = input.next();

        System.out.println("er der en nødsituation? (true/flase)");

        Emergency = input.next();


        // if statement til trafiklys
        if (time.equals("dag") && Traffic.equals("lav") || Emergency.equals("ja")){
            System.out.println("grønt");
        }else if (time.equals("aften") || (time.equals("nat")) && Traffic.equals("lav")) {
            System.out.println("gult");
        } else {
            System.out.println("rødt");
        }

        // if statement til adgang
        if (Area.equals("erhverv") || (Area.equals("blandet")) && (Traffic.equals("lav"))) {
            System.out.println("grønt");
        }else if (Emergency.equals("ja")){

        }
        else{
            System.out.println("rødt");
        }

    }

}

