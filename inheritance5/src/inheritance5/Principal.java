package inheritance5;

public class Principal {

	Captain captain = new Captain();
	Driver driver = new Driver();
	Pilot pilot = new Pilot();
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.setData();
		principal.getData();
	}
	
	
	
	
	public void setData() {
	
		captain.setLicense(4431111);
		captain.setName("Josh");
		
		driver.setName("John");
		driver.setCnh(4478545);
		
		pilot.setName("Leonard");
		pilot.setLicense(7747474);
		
	}
	public void getData() {
		System.out.println(captain.getLicense() + " " + captain.getName());
		System.out.println(pilot.getLicense() + " " + pilot.getName());
		System.out.println(driver.getCnh() + " " + driver.getName());
	}
	
}
