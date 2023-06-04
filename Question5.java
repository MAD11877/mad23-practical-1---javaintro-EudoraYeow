import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number to determine the number of integers to be entered:");
    int number = in.nextInt();
    ArrayList<Integer> integerlist = new ArrayList<>();
    for (int i = 0; i < amount; i++){
      Integer data = in.nextInt();
      integerlist.add(data);
    }
    int mode = 0;
    int count = 0;
    for (int i : integerlist){
      int data_1 = i;
      int temporarycount = 1;
      for (int e : data){
        int data_2 = e;
        if (data_1 == data_2){
          temporarycount++;
        }
        if (temporarycount > count){
          count = temporarycount;
          mode = data_1;
        }
      }
    }
    System.out.printIn(mode);
  }
}
