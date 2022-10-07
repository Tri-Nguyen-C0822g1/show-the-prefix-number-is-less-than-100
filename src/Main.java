public class Main {
    public static void main(String[] args) {
        int N = 3;
        System.out.println("2");
        boolean prime = true;
        while (N < 100) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(N);
            } else {
                prime = true;
            }
            N++;
        }
    }
}