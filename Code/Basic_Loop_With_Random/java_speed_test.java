public class java_speed_test {
    public static void main(String args[]) {
        double startTime = System.currentTimeMillis();
        int statementsCompleted = 0;

        while (System.currentTimeMillis() - startTime <= 1000) {
            Math.random();
            statementsCompleted++;
        }

        System.out.println(statementsCompleted);
    }
}
