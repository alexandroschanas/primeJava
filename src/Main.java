//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    System.out.println(numbers());


    }

    public static boolean numbers(){

        int numbersFound = 0;

        for(int i=0; numbersFound<5 && i<1000; i++){

            if(i % 3 == 0 && i % 5 == 0){

                System.out.println("Number => " + i);
                numbersFound++;
            }

        }

        System.out.println("The sum of numbers is => " +numbersFound);

        return true;

    }

}