package lgscourse.javacore.lesson07;

public class Main {

	public static void main(String[] args) {
		Su_27 su_27 = new Su_27(21.9f, 14.7f, 8000, 1400, "Blue");
		System.out.println(su_27);
		su_27.startEngines();
		try {
			Thread.sleep(500);
			su_27.takeoffAirplane();
			Thread.sleep(500);
			su_27.getPlaneControl().moveUp();
			Thread.sleep(500);
			su_27.getPlaneControl().moveLeft();
			Thread.sleep(500);
			su_27.getPlaneControl().moveDown();
			Thread.sleep(500);
			su_27.getPlaneControl().moveRight();
			Thread.sleep(500);
			su_27.stealthTechnology();
			Thread.sleep(500);
			su_27.nuclearStrike();
			Thread.sleep(500);
			su_27.turboAcceleration();
			Thread.sleep(500);
			su_27.getPlaneControl().moveLeft();
			Thread.sleep(500);
			su_27.getPlaneControl().moveUp();
			Thread.sleep(500);
			su_27.landingAirplane();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
