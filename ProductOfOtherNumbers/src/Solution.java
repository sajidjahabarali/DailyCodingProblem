import java.util.ArrayList;
import java.util.Scanner;

public class Solution{

    public static void main(String[] args){

        System.out.println("Type numbers for list. \nType f if finished.");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String input = scanner.nextLine();
        while(!input.equals("f")){
            try{
                numbers.add(Integer.parseInt(input));
                input = scanner.nextLine();
            }
            catch(NumberFormatException e){
                if(!input.equals("f")) {
                    System.out.println("Please type a number to add to the list or f to exit.");
                }
            }
        }

        ArrayList<Integer> productOfOtherNumbers = solve(numbers);
        System.out.println(productOfOtherNumbers);


    }

    private static ArrayList<Integer> solve(ArrayList<Integer> numbers) {

        ArrayList<Integer> productOfOtherNumbers = new ArrayList<Integer>();

        int currentProduct = 1;

        for(int i = 0; i<numbers.size(); i++){

            for(int j = 0; j<numbers.size(); j++){
                if(i!=j){
                    currentProduct*=numbers.get(j);
                }
            }
            productOfOtherNumbers.add(currentProduct);
            currentProduct=1;

        }

        return productOfOtherNumbers;
    }
}