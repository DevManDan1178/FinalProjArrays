import java.util.Scanner;
import java.util.Arrays;
public class Average {
    //5 scores => 5 entries in data
    private int [] data = new int[5];
    private float mean = 0;

    public Average(){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Enter score (" + (i + 1) + "/5): ");
            data[i] = in.nextInt();
        }
        calculateMean();
        selectionSort();
    }

    public void calculateMean(){
        mean = 0;
        for (int i = 0; i < data.length; i++){
            mean += (float) data[i] /5;
        }
    }

    public void selectionSort(){
        Arrays.sort(data);
        int[] newData = new int[5];
        for (int i =0; i < 5; i++){
            newData[i] = data[4 - i];
        }
        data = newData;
    }

    public String toString(){
        String ts = "Order descending: ";
        for (int i = 0; i < data.length; i++) {
            ts += data[i] + " ";
        }
        ts += "| Mean: " + mean;
        return ts;
    }
}