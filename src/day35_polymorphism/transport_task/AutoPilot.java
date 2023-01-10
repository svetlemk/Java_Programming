package day35_polymorphism.transport_task;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;

    void selfDrive();
}
/*
3. Create a sub interface of AutoPark named AutoPilot:

				abstract methods:
						autoPilot()
 */