package com.couchdoescode.tut.proxy;

import com.couchdoescode.tut.handlers.ItemHandler;

/**
 * Server side stuff
 * @author NE0V
 *
 */
public class CommonProxy implements IProxy{

	@Override
	public void preInit() {
		ItemHandler.init();
		ItemHandler.register();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
	}

	@Override
	public void postInit() {
		// TODO Auto-generated method stub
		
	}

}
