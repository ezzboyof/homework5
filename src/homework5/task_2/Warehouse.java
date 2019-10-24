package homework5.task_2;

public class Warehouse {
    private final String[] array = new String[4];

    public Warehouse() {
        array[0] = "shovel";
        array[1] = "rake";
        array[2] = "bucket";
        array[3] = "Earth";
    }

    public void next(int next) {
        if (next == array.length - 1) {
            System.out.println("sled element: " + array[0].toString());
        } else {
            System.out.println("sled element: " + array[next].toString());
        }
    }

    public void getArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" element massiva: " + array[i].toString());
        }
    }
}
