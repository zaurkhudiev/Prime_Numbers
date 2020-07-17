import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        int k;
        int i;
        int j;
        int count;                                                           //initializing of variable
        int sum = 0;
        int N = 0;
        int z = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Orkhan, you can enter any numbers between 1 and 1000: ");
        k = scanner.nextInt();                                               // to take  input (k)

        for (i = 1; i <= z; i++) {                           //actually, this condition equals to true but I initialized max_value
            count = 0;
            for (j = 2; j <= i / 2; j++) {                                   //it finds prime numbers
                if (i % j == 0) {                                            //if number divides any number then it is counted with count++
                    count++;
                }
            }

            if (count == 0 && i != 1) {                                      //if count is zero then it shows us it is prime number
                N = N + 1;                                                   //N is the number of prime numbers
                sum = sum + i;                                               //it adds prime numbers
                if (sum % k == 0) {                                          //if k divides sum of prime numbers then break
                    break;
                }
            }

        }
        System.out.println(N);
        //System.out.println(sum);
    }
}