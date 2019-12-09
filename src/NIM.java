import java.util.ArrayList;
import java.util.Scanner;

public class NIM {
    public static void main(String[] args) {
        int turn = 0, select, divide;
        boolean turnStatus = true;
        String valueString = "511";
        ArrayList<Node> nodes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        nodes.add(new Node(nodes.size(), Integer.parseInt(valueString), 0.5));
        nodes.add(new Node(nodes.size(), Integer.parseInt(valueString), 0.5));

        System.out.println(nodes.size());

        while(checkValue(valueString) && turnStatus) {
            System.out.print("Jumlah korek awal: ");
            printValueString(valueString);

            System.out.println("\nPilih korek yang ingin dipisah: ");
            select = scan.nextInt();

            System.out.println("Masukkan jumlah pembagi terbesar: ");
            divide = scan.nextInt();
            if(divide > select){
                System.out.println("Maaf, nilai pembagi terlalu besar");
                divide = 0;
            }
            divideStick(valueString, select, divide);

            turnStatus = false;
        }
    }

    private static boolean checkValue(String valueString) {
        int[] valueInt = new int[valueString.length()];

        for (int i=0; i<valueString.length(); i++){
            valueInt[i] = Integer.parseInt(String.valueOf(valueString.charAt(i)));
        }

        for (int value : valueInt) {
            if (value % 2 >= 1) {
                return true;
            }
        }

        return false;
    }

    private static void printValueString(String valueString) {
        int[] valueInt = new int[valueString.length()];

        for (int i=0; i<valueString.length(); i++){
            valueInt[i] = Integer.parseInt(String.valueOf(valueString.charAt(i)));
            System.out.print(valueInt[i] + " ");
        }
    }

    private static void divideStick(String valueString, int select, int divide) {
        int[] valueInt = new int[valueString.length()];

        if(divide != 0){
            for (int i=0; i<valueString.length(); i++){
                valueInt[i] = Integer.parseInt(String.valueOf(valueString.charAt(i)));
                System.out.print(valueInt[i] + " ");
            }
        }
    }

    public void greedy() {
        int vHighS;
        int select;
    }
}
