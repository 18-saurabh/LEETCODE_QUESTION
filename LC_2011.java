public class LC_2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++x") || operations[i].equals("x++")) {
                x++;
            }
            // else if(operations[i]=="x++"){
            // x=+1;
            // }
            // else if(operations[i]=="--x"){
            // x=-1;
            // }
            else if (operations[i].equals("--x") || operations[i].equals("x--")) {
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] operations = { "++x", "x++" };
        System.out.println(finalValueAfterOperations(operations));
    }
}
