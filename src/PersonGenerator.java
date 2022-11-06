import  java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner pipe = new Scanner(System.in);

        int count = 0;

        while (true) {
            if (count == 0) {
                String data = "";
                data = SafeInput.getNonZeroLenString(pipe, "Enter data: ");
                list.add(data);
                count++;
            }//end if
            else if (count == 1) {
                boolean YN = SafeInput.getYNConfirm(pipe, "Do you have more data to enter? ");
                if (YN) {
                    String data = "";
                    data = SafeInput.getNonZeroLenString(pipe, "Enter data: ");
                    list.add(data);
                }//end if
                else if (!YN) {
                    System.out.println("\n");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }//end elseif
                    break;
                }//end elseif
            }//end while

        }//end outer while
    }//end main
}
