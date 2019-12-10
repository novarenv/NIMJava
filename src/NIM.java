import java.util.ArrayList;
import java.util.Scanner;

public class NIM {
    public static void main(String[] args) {
        int turn = 0, select, divide;
        boolean checkSelect, checkConstraint;
        String valueString = "511";
        ArrayList<Node> nodes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        nodes.add(new Node(nodes.size(), valueString));

        while(checkValue(valueString)) {
            System.out.print("Jumlah korek awal: ");
            printValueString(valueString);

            System.out.println("\nPilih korek yang ingin dipisah: ");
            select = scan.nextInt();

            if(select == 2 || select == 1) {
                System.out.println("Maaf, korek tidak dapat dibagi");
                continue;
            }

            checkSelect = checkSelect(valueString, select);

            if (checkSelect) {
                System.out.println("Masukkan jumlah pembagi terbesar: ");
                divide = scan.nextInt();
                if (divide > select) {
                    System.out.println("Maaf, nilai pembagi terlalu besar");
                    divide = 0;
                }
                valueString = divideStick(valueString, select, divide);
            }

            checkConstraint = checkConstraint(valueString);

            if (!checkConstraint){
                break;
            }

            ++turn;
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

    private static boolean checkSelect(String valueString, int select) {
        int[] valueInt = new int[valueString.length()];
        boolean checkSelect = false;

        for (int i=0; i<valueString.length(); i++){
            valueInt[i] = Integer.parseInt(String.valueOf(valueString.charAt(i)));

            if (valueInt[i] == select){
                checkSelect = true;
            }
        }

        if (!checkSelect){
            System.out.println("Nilai yang dipilih tidak ada");
            return false;
        }

        return true;
    }

    private static boolean checkConstraint(String valueString){
        int[] valueInt = new int[valueString.length()];
        int checkConstraint = 0;

        for (int i=0; i<valueString.length(); i++){
            valueInt[i] = Integer.parseInt(String.valueOf(valueString.charAt(i)));

            if (valueInt[i] == 2 || valueInt[i] == 1){
                ++checkConstraint;
            }
        }

        if (checkConstraint == valueInt.length){
            System.out.println("Anda kalah! Coba lagi ya! Semangatt!!");
            return false;
        }

        return true;
    }

    private static String divideStick(String valueString, int select, int divide) {
        int[] valueInt = new int[valueString.length()];
        int divideResult;
        String result;

        if(divide != 0){
            for (int i=0; i<valueString.length(); i++){
                valueInt[i] = Integer.parseInt(String.valueOf(valueString.charAt(i)));
            }
        }

        divideResult = select-divide;

        result = divide + Integer.toString(divideResult);

        for (int value: valueInt) {
            if (value != select) {
                result = result + value;
            }
        }

        System.out.println("\nHasil bagi: " + result);

        return result;
    }

    public void greedy() {
        int vHighS;
        int select;
    }
}
