class WallClock {
	String time;
	void setTime(String t) {
		time = t;
	}

	String getTime() {
		return time;
	}
}

class WallClockTestDrive {
	public static void main(String  [] args) {
		WallClock c = new WallClock();
		c.setTime("12:45");
		String tod =c.getTime();
		System.out.println("time : "+ tod);
	}
}
