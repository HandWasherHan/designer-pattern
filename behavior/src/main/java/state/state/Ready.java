package state.state;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class Ready implements State{

    public void into() {
        System.out.println("into ready");
    }

    public void out() {
        System.out.println("out ready");
    }

    public void fun() {
        System.out.println("doing ready job");
    }
}
