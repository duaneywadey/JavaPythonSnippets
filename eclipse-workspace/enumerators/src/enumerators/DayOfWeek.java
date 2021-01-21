package enumerators;
enum DayOfWeek {
	
		SUNDAY(11,5), MONDAY(9,9), TUESDAY(9,9), WEDNESDAY(9,9), THURSDAY(9,9), FRIDAY(9,9), SATURDAY(10,6);

	public static void main(String[] args) {
		DayOfWeek time = DayOfWeek.SUNDAY;
		System.out.println(time.startTime);
		System.out.println(time.endTime);
	}

	int startTime;
	int endTime;
	DayOfWeek(int startTime, int endTime){
		this.startTime = startTime;
		this.endTime = endTime;
		
	}
}
