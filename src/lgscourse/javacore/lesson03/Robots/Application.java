package lgscourse.javacore.lesson03.Robots;

public class Application {

	public static void main(String[] args) {
		Robot robot = new Robot();
		CoffeRobot coffeRobot = new CoffeRobot();
		RobotDancer robotDancer = new RobotDancer();
		RobotCoocker robotCoocker = new RobotCoocker();
		
		robot.work();
		coffeRobot.work();
		robotDancer.work();
		robotCoocker.work();
		
		Robot[] robots = new Robot[10];
		robots[0] = new Robot();
		robots[1] = new CoffeRobot();
		robots[2] = new RobotDancer();
		robots[3] = new RobotCoocker();
		robots[4] = new Robot();
		robots[5] = new CoffeRobot();
		robots[6] = new RobotDancer();
		robots[7] = new RobotCoocker();
		robots[8] = new Robot();
		robots[9] = new CoffeRobot();
		
		for (int i = 0; i < robots.length; i++) {
			robots[i].work();
		}
	}

}
