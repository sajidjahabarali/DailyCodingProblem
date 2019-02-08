import java.util.Scanner;
import java.util.ArrayList;
public class Solution{
    public static void main(String[] args){
        System.out.println("Type numbers for list. \nType f if finished.");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<Integer>();
        String input = scanner.nextLine();
        while(!input.equals("f")){
            try{
                ints.add(Integer.parseInt(input));
                input = scanner.nextLine();
            }
            catch(NumberFormatException e){
                if(!input.equals("f")) {
                    System.out.println("Please type a number to add to the list or f to exit.");
                }
            }
        }

        System.out.println("Please type the desired sum:");
        int sum = 0;
        boolean entered = false;
        while(!entered) {
            try {
                sum = scanner.nextInt();
                entered = true;
            } catch (NumberFormatException e) {
                System.out.println("Please type a number.");
            }
        }

        boolean result = checkSum(ints, sum);
        System.out.println(result);
    }

    public static boolean checkSum(ArrayList<Integer> ints, int sum) {

        for(int i = 0; i<ints.size(); i++){
            for(int j = i+1; j<ints.size(); j++){
                if((ints.get(i)+ints.get(j))==sum){
                  return true;
                }
            }
        }

        return false;
    }
}