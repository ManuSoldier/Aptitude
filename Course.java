class Course{

	String name;
	int Duration;
	String Ide;
	String Location;
	String Trainer;
	String Hr;
	int noOfStudent;
	
	Course(String name, int Duration, String Ide, String Location, String Trainer, String Hr, int noOfStudent)
	{
	this.name=name;
	this.Duration=Duration;
	this.Ide=Ide;
	this.Location=Location;
	this.Trainer=Trainer;
	this.Hr=Hr;
	this.noOfStudent=noOfStudent;
	
	}
	void displyInfo()
	{
		System.out.println("Strating  displyInfo in Course");
		System.out.println("the course name:"+name);
		System.out.println("no of Duration:"+Duration);
		System.out.println("name of the ide:"+Ide);
		System.out.println("location of the course:"+Location);
		System.out.println("trainer name:"+Trainer);
		System.out.println("Hr name:"+Hr);
		System.out.println("no of studnet studying course:"+noOfStudent);
		System.out.println("ending  displyInfo in Course");		
	}


}