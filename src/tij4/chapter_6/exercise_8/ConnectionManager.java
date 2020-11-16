package tij4.chapter_6.exercise_8;

public class ConnectionManager {
    private static int count = 0;

    private ConnectionManager(int count) {
        String name = String.valueOf(count);
    }

    public static ConnectionManager getInstance() {
        ConnectionManager instance;
        if(count < 3) {
            count += 1;
            instance = new ConnectionManager(count);
        } else {
            return null;
        }
        return instance;
    }
}
