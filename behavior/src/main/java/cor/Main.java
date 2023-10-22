package cor;

import cor.impl.Decoder;
import cor.impl.EndHandler;
import cor.impl.HelloAbstractHandlerCtx;
import cor.impl.MockHandler;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class Main {

    public static void main(String[] args) {
        Decoder handler = new Decoder();
        PipeLine pipeLine = new PipeLine(handler);
        pipeLine.add(new HelloAbstractHandlerCtx<>());
        pipeLine.add(new EndHandler());
        pipeLine.add(new MockHandler());
        pipeLine.fun("test");

        pipeLine.fun("test-2");
    }
}
