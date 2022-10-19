package vehicles;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Manufacturer: " + Vehicle.MAKE);
		System.out.println("Number of vehicles manufactured: " + Vehicle.numvehicle);

		Vehicle vehicle1= new Vehicle("Vision");
		System.out.println(vehicle1);

		Vehicle vehicle2= new Vehicle("Edict");
		System.out.println(vehicle2);

		vehicle2.setModel("Seer");
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		
		Vehicle.Engine vehicle3= new Vehicle.Engine("Fortune");
		System.out.println("vehicle number" + vehicle3.getChassisNo()+ " is a"
				+ vehicle3.getModel()+" model and has an engine capacity of"
				+ vehicle3.getCapacity()+"cc");

		System.out.println("Number of vehicles manufactured: " + Vehicle.numvehicle);

		}
		
}
