import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimes {
    public void printPrimes(int x){
        int check;
        int count = 0;
        int number = 2;
        List<Integer> primeNumbers = new ArrayList<>();

        while(count != x){
            check = 0;
            for (int i = 2; i < number; i++){
                if(number % i == 0) {
                    check++;
                    break;
                }
            }
            if(check == 0){
                primeNumbers.add(number);
                count++;
            }
            number++;
        }

        for (int i = 0; i < primeNumbers.size(); i++){
            System.out.print(primeNumbers.get(i) + " ");
        }
    }

    @Test
    public void testPrintPrimes(){
        printPrimes(2);
        printPrimes(4);
    }
}
