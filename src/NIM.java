import java.util.ArrayList;

public class NIM {
    public static void main(String[] args) {
        int turn = 0, move;
        boolean turnStatus = true;
        String valueString = "7";
        ArrayList<Node> nodes = new ArrayList<>();

        nodes.add(new Node(nodes.size(), Integer.parseInt(valueString), 0.5));
        nodes.add(new Node(nodes.size(), Integer.parseInt(valueString), 0.5));

        System.out.println(nodes.size());

        while(checkValue(valueString) && turnStatus) {
            System.out.print("Jumlah korek awal: " + valueString);
            System.out.println();
            System.out.println(valueString);

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

    public void greedy() {
        int vHighS;
        int select;
    }
}
