package com.kryger.whatcolorisit;

import ratpack.server.RatpackServer;

public class Main {
	public static void main(String... args) throws Exception {
		RatpackServer.start(server -> server.handlers(chain -> chain.get(
				ctx -> ctx.render("What Color Is It?")).get("api/:color",
				new ColorHandler())));
	}
}