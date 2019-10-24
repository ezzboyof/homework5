package homework5.task_1;

public interface Computer {

    default void On() {
        System.out.println("On");
    }

    default void Off() {
        System.out.println("Off");
    }

    default void reset() {
        System.out.println("Reset");
    }
}