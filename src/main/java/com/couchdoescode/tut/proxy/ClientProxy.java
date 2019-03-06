package com.couchdoescode.tut.proxy;

import com.couchdoescode.tut.handlers.ItemHandler;

/**
 * Client side stuff
 * @author NE0V
 *
 */
public class ClientProxy extends CommonProxy{

	public void init() {
		ItemHandler.registerRenders();
	 }
}
