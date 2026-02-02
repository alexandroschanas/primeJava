//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i<=100; i++){

                if(isPrime(i)){
                System.out.println("Is " + i + " a prime? => " + isPrime(i));
                }

        }

    }

    public static boolean isPrime(int prime){

    if(prime < 2){
        return false;
    }

    for(int divisor =2; divisor < prime; divisor++){

        if(prime % divisor == 0){
            return false;
        }


    }
    return true;

    }
}