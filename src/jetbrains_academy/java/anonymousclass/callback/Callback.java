package jetbrains_academy.java.anonymousclass.callback;

public interface Callback {
    void onStarted();

    void onStopped(String cause);

    void onFinished(int code);
}
