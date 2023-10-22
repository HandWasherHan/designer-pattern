package cor.impl;

import cor.DefaultHandlerContext;
import cor.Handler;
import cor.Request;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class MockHandler implements Handler {
    @Override
    public void handle(DefaultHandlerContext ctx, Request request) {
        System.out.println("noway");
    }
}
