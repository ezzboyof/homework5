package homework5.task_1;

public class ComputerMain implements Computer {

    @Override
    public void On()
    {
        System.out.println("On");
    }

    @Override
    public void Off (){
        System.out.println("Off");
    }

    @Override
    public void reset(){
        System.out.println("Reset");
    }
}
