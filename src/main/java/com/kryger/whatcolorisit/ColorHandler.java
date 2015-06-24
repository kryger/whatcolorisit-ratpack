package com.kryger.whatcolorisit;

import ratpack.handling.Context;
import ratpack.handling.Handler;

public class ColorHandler implements Handler {
	private ColourServiceImpl service = new ColourServiceImpl();

	@Override
	public void handle(Context ctx) throws Exception {
		String colorIn = ctx.getPathTokens().get("color");
		ColorResult out = service.getSimilarColor(colorIn);
		String colorName = out.getResult().getName();
		ctx.render(colorName);
	}

}
