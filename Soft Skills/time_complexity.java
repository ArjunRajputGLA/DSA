public class time_complexity {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken by the loop: "+(end-start)+"ms");
    }
} 