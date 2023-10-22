package state.state;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class Completed implements State{
    public void into() {
        System.out.println("into complete");
    }

    public void out() {
        System.out.println("out complete");
    }

    public void fun() {
        System.out.println("doing complete job");
    }
}
