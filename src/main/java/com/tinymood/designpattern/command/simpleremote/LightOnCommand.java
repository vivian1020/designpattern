package com.tinymood.designpattern.command.simpleremote;

public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	/*
	 * 调用接收对象的on方法
	 */
	@Override
	public void execute() {
		light.on();
	}

}
