import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args) {
        Scanner cy = new Scanner(System.in);

        System.out.print("Enter blood type of patient: " );
        String inputBloodtype = cy.nextLine();

        System.out.print("Enter the Rhesus Factor (+ or -): ");
        String inputRHfactor = cy.nextLine();

        BloodData bd;
        if (inputBloodtype.isEmpty() || inputRHfactor.isEmpty()){
            
            bd = new BloodData();
        } else {

            bd = new BloodData(inputBloodtype, inputRHfactor);

        }
        bd.display();

    }  
}