
import java.util.Scanner;

public class bmiLaskin{

    public static void main(String[] args){

        Scanner lukija = new Scanner(System.in);

        System.out.println("Tämä on painoindeksilaskuri.");

        System.out.println("Kuinka pitkä olet senttimetreinä?");
        int pituus = Integer.valueOf(lukija.nextLine());

        System.out.println("Kuinka paljon painat kilogrammoina?");
        double paino = Double.valueOf(lukija.nextLine());

        double bmi = (paino  / (pituus * pituus) * 10000);

        System.out.println("Painoindeksisi on " + bmi);

        if(bmi < 18.5){
            System.out.println("Olet alipainoinen");
        }else if(bmi < 25 && bmi > 18.5){
            System.out.println("Olet normaalipainoinene");
        }else{
            System.out.println("Olet ylipainoinen");
        }

        lukija.close();
    }
}