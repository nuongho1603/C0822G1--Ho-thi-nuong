package giaithuat;

public class giaithuat {
    public static void main(String[] args) {
        System.out.println(solve(9,13));
    }
    public static int solve(int l, int r) {
        int count=0;
        for (int i = l; i <= r; i++) {
            CirclenumCG(i);
            if(CirclenumCG(i) == true){
                count++;
            }
        }

        return count;
    }

    public static boolean CirclenumCG(int num) {
        if (num > 0 & num < 10) {
            return true;
        }
        String string = String.valueOf(num);
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return true;
        }
        return false;
    }
}

