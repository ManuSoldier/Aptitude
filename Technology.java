class Technology{

	String names;
	int noOfTechnologies;
	String Scope;
	boolean placement;
	String parts;
	String technologyTrainer;
	int noOfTools;
	String toolName;
	String type;
	String founderOfTecnology;
	int establishedYear;
	String Location;

	
	
	
	Technology(String names, int noOfTechnologies, String Scope, boolean placement, String parts, String technologyTrainer, int noOfTools, String toolName,String type, String founderOfTecnology, int establishedYear, String Location)
	{
	this.names=names;
	this.noOfTechnologies=noOfTechnologies;
	this.Scope=Scope;
	this.placement=placement;
	this.parts=parts;
	this.technologyTrainer=technologyTrainer;
	this.noOfTools=noOfTools;
	this.toolName=toolName;
	this.type=type;
	this.founderOfTecnology=founderOfTecnology;
	this.establishedYear=establishedYear;
	this.Location=Location;

	
	}
	void displyInfo()
	{
		System.out.println("Strating  displyInfo in Technology");
		System.out.println("the technology name:"+names);
		System.out.println("no of technology:"+noOfTechnologies);
		System.out.println("the scope of the technology:"+Scope);
		System.out.println("about the placement:"+placement);
		System.out.println("about the placement:"+parts);
		System.out.println("technology trainer name:"+technologyTrainer);
		System.out.println("no of tools:"+noOfTools);
		System.out.println("tools name:"+toolName);
		System.out.println("which type technolgy:"+type);
		System.out.println("the founder of the technolgy:"+founderOfTecnology);
		System.out.println("establishment year of the technolgy:"+establishedYear);
		System.out.println("location of the technolgy:"+Location);
		System.out.println("ending  displyInfo in Technology");		
	}


}