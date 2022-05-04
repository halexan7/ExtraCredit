import java.util.*;

public class LeastRecentlyUsed {
    public static void main(String[] args){
        int capacity = 300;
        ArrayList<Integer> addressSequence;
        System.out.println("Hello! Please enter five numbers " +
                "to represent your address sequence.");
        addressSequence = currentPages();
        System.out.println(addressSequence);



    }

    public static ArrayList<Integer> currentPages(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < 5; i++ ) {
            int number = i + 1;

            switch (number){
                case 1: System.out.println("Please enter your 1st number: ");
                sequence.add(input.nextInt());
                break;
                case 2: System.out.println("Please enter your 2nd number: ");
                sequence.add(input.nextInt());
                break;
                case 3: System.out.println("Please enter your 3rd number: ");
                sequence.add(input.nextInt());
                break;
                case 4: System.out.println("Please enter your 4th number: ");
                sequence.add(input.nextInt());
                break;
                case 5: System.out.println("Please enter your 5th number: ");
                sequence.add(input.nextInt());
                break;
            }
        }
        return sequence;
    }

    public static int pageFaults(ArrayList<Integer> addressSequence, int capacity, ){

    }
}
