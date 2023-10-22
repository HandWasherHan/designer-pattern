package cor;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class PipeLine {
    DefaultHandlerContext head;
    DefaultHandlerContext tail;

    public PipeLine(Handler handler) {
        DefaultHandlerContext head = new DefaultHandlerContext(handler);
        this.head = head;
        this.tail = head;
    }
    void add(Handler handler) {
        DefaultHandlerContext ctx = new DefaultHandlerContext(handler);
        tail.next = ctx;
        tail = ctx;
    }

    void fun(String msg) {
        head.handle(new Request(msg));
    }
}
