class Placements{

	String CompanyNames;
	long pinCodeOfCompany;
	String referdInstitution;
	boolean quality;
	String basedLanguage;
	String type;
	int noOfPlacement;
	double packages;
	String agreement;
	String documenteSubmited;
	int interviewRounds;
	String role;
	
	
	
	
	Placements(String CompanyNames, long pinCodeOfCompany, String referdInstitution, boolean quality, String basedLanguage, String type, int noOfPlacement, double packages, String agreement, String documenteSubmited, int interviewRounds, String role)
	{
	this.CompanyNames=CompanyNames;
	this.pinCodeOfCompany=pinCodeOfCompany;
	this.referdInstitution=referdInstitution;
	this.quality=quality;
	this.basedLanguage=basedLanguage;
	this.type=type;
	this.noOfPlacement=noOfPlacement;
	this.packages=packages;
	this.agreement=agreement;
	this.documenteSubmited=documenteSubmited;
	this.interviewRounds=interviewRounds;
	this.role=role;
	
	}
	void displyInfo()
	{
		System.out.println("Strating  displyInfo in Technology");
		System.out.println("the name of company placed:"+CompanyNames);
		System.out.println("pin code of the company:"+pinCodeOfCompany);
		System.out.println("the referd intitution:"+referdInstitution);
		System.out.println("qality of the placement:"+quality);
		System.out.println("based on which language placed:"+basedLanguage);
		System.out.println("type of placemnet:"+type);
		System.out.println("no of placement:"+noOfPlacement);
		System.out.println("package of the placemented company:"+packages);
		System.out.println("no of years agreemented:"+agreement);
		System.out.println("documente Submited for placement:"+documenteSubmited);
		System.out.println("interview Rounds in the placement:"+interviewRounds);
		System.out.println("role of the placement:"+role);
		System.out.println("ending  displyInfo in Technology");	





			
	}


}