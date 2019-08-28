package com.collabera.commandpattern;

public class TurnTVOn implements Command{

	ElectronicDevice theDevice;
	public TurnTVOn(ElectronicDevice newDevice) {
		theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		theDevice.on();
	}

	public void undo() {
		theDevice.off();
	}
}
