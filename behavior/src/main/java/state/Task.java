package state;

import state.state.Completed;
import state.state.Ready;
import state.state.Running;
import state.state.State;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class Task {
    /**
     *
     */
    State state;

    public Task(State state) {
        this.state = state;
    }

    void changeState(State state) {
        this.state.out();
        this.state = state;
        state.into();
    }

    void fun() {
        state.fun();
    }

    void run() {
        fun();
        if (!(state instanceof Ready)) {
            throw new IllegalStateException("只能运行就绪的任务");
        }
        changeState(new Running());
        fun();
        changeState(new Completed());
        fun();
    }

    public static void main(String[] args) {
        new Task(new Ready()).run();
    }

}
