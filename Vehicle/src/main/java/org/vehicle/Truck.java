package org.vehicle;

public class Truck extends MotorVehicle{

	private int capacity;
	
	public Truck(Engine engine, Transmision transmision, Tire tire, Wheel wheel, int capacity) {
		this.setEngine(engine);
		this.setTransmition(transmision);
		this.setTire(tire);
		this.setWheel(wheel);
		this.setCapacity(capacity);
	}
	
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void backward() {
		// TODO Auto-generated method stub
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
