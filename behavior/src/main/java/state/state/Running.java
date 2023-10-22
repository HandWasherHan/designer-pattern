package state.state;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class Running implements State{
    public void into() {
        System.out.println("into running");
    }

    public void out() {
        System.out.println("out running");
    }

    public void fun() {
        System.out.println("doing running job");
    }
}
