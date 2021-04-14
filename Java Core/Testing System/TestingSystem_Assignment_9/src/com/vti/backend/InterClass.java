package com.vti.backend;

import com.vti.entity.CPU;
import com.vti.entity.Car;
import com.vti.entity.Car.Engine;

/**
 * This class is .
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: Apr 11, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: Apr 11, 2021
 */
public class InterClass {

	public void question1() {

		CPU cpu = new CPU(1000);
		CPU.Ram ram = cpu.new Ram(16, "Thinkpad");
		CPU.Processor processor = cpu.new Processor(32, "Dell");

		System.out.println(ram.getClockSpeed());

		System.out.println(processor.getCache());
	}
	
	public void question2() {

		Car car = new Car("BMW", "i8");

		Car.Engine engine = car.new Engine();
		engine.setEngineType("A");

		car.setEngine(engine);

		car.printInfor();
	}


}
