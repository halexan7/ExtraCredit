import java.util.*;

public class LeastRecentlyUsed {
    public static void main(String[] args){
        int count = 0;
        int capacity = 300;
        int pf = 0;
        ArrayList<Integer> addressSequence;
        System.out.println("Hello! Please enter five numbers " +
                "to represent your address sequence.");
        addressSequence = currentPages();
        pf = pageFaults(addressSequence, capacity, count);
        System.out.println("Your entries have created " + pf + " page faults.");
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

    public static int pageFaults(ArrayList<Integer> addressSequence, int capacity, int count){
        LinkedList<Integer> frames = new LinkedList<Integer>();
        int pageFaults = 0;

        //do loop to continue iterations until capacity is reached
        do {

            //for loop to loop through user entered address sequence
            for (int i = 0; i < addressSequence.size(); i++){

                //if statement to check if frames currently has address number
                if (frames.contains(addressSequence.get(i))){
                    count++;
                    continue;
                }

                //if statement to see if frames does not have address number
                if (!(frames.contains(addressSequence.get(i))) && frames.size() < 4){
                    frames.add(addressSequence.get(i));
                    pageFaults++;
                    count++;
                    continue;
                    }

                //if statement to see if frames does not have address number
                if (!(frames.contains(addressSequence.get(i))) && frames.size() == 4){
                    frames.removeFirst();
                    frames.add(addressSequence.get(i));
                    pageFaults++;
                    count++;
                    continue;
                }

                //if statement to check position within address sequence array
                //if at the end, start over
                if (i == addressSequence.size() - 1){
                    i = 0;
                }
            }
        } while (count < capacity);
        return pageFaults;
    }
}
