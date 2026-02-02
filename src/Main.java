//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 6;
        int primeNumbersFound = 0;

        for(int i = start; i<=end; i++){

                if(isPrime(i)){

                System.out.println("Is " + i + " a prime? => " + isPrime(i));

                primeNumbersFound++;

                if(primeNumbersFound == 3){
                    break;
                }

                }

        }

    System.out.println("Total prime numbers found between " + start + " to " +  end  + " are => " + primeNumbersFound );

    }




    public static boolean isPrime(int prime){
    int primeNumbersFound = 0;

    if(prime < 2){
        return false;
    }

    for(int divisor =2; divisor < prime; divisor++){

        if(prime % divisor == 0){
            return false;
        }


    }

    primeNumbersFound++;
    return true;

    }
}