package cor;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class DefaultHandlerContext {
    DefaultHandlerContext next;
    Handler handler;

    public DefaultHandlerContext(Handler handler) {
        this.handler = handler;
    }

    final void handle(Request request) {
        handler.handle(this, request);
    }

    public void fireRequest(Request request) {
        System.out.println(next.handler.getClass());
        next.handle(request);
    }



}
