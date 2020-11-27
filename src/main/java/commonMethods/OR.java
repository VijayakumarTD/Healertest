package commonMethods;

public interface OR {


	 //Healer Registration
	 
	 public static String joinHealer ="Join as a Healer>(//li[@class='nav-item'])[2]";
	 public static String letStart ="Lets get started >//div[@class='login-panel']/h1";
	 public static String firstName="First Name>//input[@id='firstName']";
	 public static String lastName="Last Name>//input[@id='lastName']";
	 public static String emailAddress="Email Address>//input[@id='email']";
	 public static String passWord="Password>//input[@id='password']";
	 public static String confirmPassword="Confirm Password>//input[@id='confirmPassword']";
	 public static String iAccept=" I Accept>//span[@class='check']";
	 public static String signUp="Sign Up>//button[@type='submit']";
	 public static String thankYou ="Thank You>//span[text()='Thank You']";
	 public static String sentEmail="we have sent an email>//div[@class='email-body']/p[text()='We have sent an email to ']";
	 public static String verifyAccount="Verify Account>//button[text()='Verify Account']";
     public static String accountVerified ="Account has verified>//p[text()='Your account has been verified. ']";
     public static String loginVerified ="Login Button>(//p[text()='Your account has been verified. ']//following::a[text()='Login'])[1]";
	 public static String loginSubmit="Login>//button[@type='submit']";
	 
	 //Testmail locators
	 
	public static String mailId="Mail ID>//input[@placeholder ='Enter Public Mailinator Inbox']";
	public static String goButton="Go button>//button[@id ='go-to-public']";
	public static String accountConfirmation ="Confirm your account>//div[@class='table-responsive']//table//tbody//td//a[contains(text(),'Confirm Your Account - HealMaker.com')]";
	public static String emailVerify="Verify Email account>//html//body//div//table//tbody//tr//td//a[text()='Verify Now']";
	 
	 
	 
	//Healer service locators 
	public static String acceptWebsite ="accept>//button[text()='Accept']";
	
	public static String loginMain ="Login button>//li[@class='nav-item']//a[text()='Login']";
	public static String mainLocation="Main Location>//span[text()='“Main Location”']";
	public static String locationName="Location Name>//input[@id='name']";
	public static String address1Main ="Address 1>//input[@placeholder='Address1']";
	public static String autoSelect = "Address autoselect>(//div[@class='autocomplete-dropdown-container'])[1]";
	public static String address2Main ="Address 2>//input[@placeholder='Address2']";
	public static String countryDropDown="Country >(//select[@class='custom-select'])[1]";
	public static String stateDropDown="State>(//select[@class='custom-select'])[2]";
	public static String cityDropDown="City>(//select[@class='custom-select'])[3]";
	public static String india ="India >//option[text()='India']";
	public static String tamilNadu="TamilNadu>//option[text()='Tamil Nadu']";
	public static String chennai ="Chennai>//option[text()='Chennai']";
	public static String kanchipuram ="Kanchipuram>//option[text()='Kanchipuram']";
	public static String businessCheckBox="Business>(//span[text()='Business']//preceding::span[@class='bmd-radio'])[2]";
	public static String zipCode="Zip Code>//input[@id='zipcode']";
	
	public static String saveAndContinue ="Save & Continue>//button[text()='Save & Continue']";
    public static String locationCheckbox ="Check Display my location>//div[@class='checkbox']//span[@class='checkbox-decorator']/span";
    public static String describeLocation ="Describe Location>//textarea[@id='locationDescription']";
    public static String pictureLocation1="Picture Location 1>(//div[@class='upload-btn-wrapper'])[1]";
    public static String pictureLocation2="Picture Location 1>(//div[@class='upload-btn-wrapper'])[2]";
    public static String crop ="Crop>//button[contains(text(),'Crop')]";
    public static String back ="back>//button[text()='Back']";
	public static String serviceCategory="Service Category>//select[@id='exampleSelect1']";
    public static String yoga ="Yoga>//option[text()='Yoga']";
	public static String yogaClass="Yoga Class>(//i[@class='fa fa-angle-right'])[1]";
	public static String personalYoga="Personal Yoga Session>(//i[@class='fa fa-angle-right'])[2]";
	public static String yogaTherapy="Yoga Therapy>(//i[@class='fa fa-angle-right'])[3]";
	
	
	public static String select ="Select>//button[text()='Select ']";
	
	
	//Verify and description
   public static String yogaClassDescription="Yoga class description>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Yoga Class']//following::td//a//span)[1]";
   public static String serviceDescribe="Service describe>//span//textarea[@id='description']";
   public static String selectLanguage ="Select Language>(//div[@class=' css-yk16xz-control']//div)[1]";
   public static String selectEnglish = "Select english>(//span[@class='bmd-form-group is-focused']//input)[1]";
   public static String selectL ="Select English>//div[@class=' css-2613qy-menu'][text()='English']";
   public static String servicePhoto1 ="Service photo 1>(//div[@class='upload-btn-wrapper'])[1]";
   public static String servicePhoto2 ="Service photo 2>(//div[@class='upload-btn-wrapper'])[2]";
   public static String servicePhoto3 ="Service photo 3>(//div[@class='upload-btn-wrapper'])[3]";
   public static String qualification ="qualification>//textarea[@id='qualification']";
   public static String level1="level of Expertise>//select[@id='levelOfExpertise']";
   public static String  threeYears="Expert, 3+ years of experience>//select[@id='levelOfExpertise']//option[@value='2']";
   public static String  yogaExpert="Expert, 3+ years of experience>//select[@id='levelOfExpertise']//option[@value='2']";
   public static String  yogaNotCertified="Not certified, but have some experience>//select[@id='levelOfExpertise']//option[@value='0']";
   public static String  yogaMaster="Master, 15+ years of experience>//select[@id='levelOfExpertise']//option[@value='1']";
   public static String  yogaCertified="Certified, 1+ years of experience>//select[@id='levelOfExpertise']//option[@value='3']";

   
   
   
   //pricing
	public static String pricing ="Pricing>//strong[text()=' | Pricing']";
	public static String serviceDuration="Duration of service>//select[@class=' custom-select ']";
	public static String value30="Select 30>//select[@class=' custom-select ']//option[@value='1']";
	public static String value45="Select 45>//select[@class=' custom-select ']//option[@value='2']";
	public static String value50="Select 50>//select[@class=' custom-select ']//option[@value='3']";
	public static String value60="Select 60>//select[@class=' custom-select ']//option[@value='4']";
	public static String value90="Select 90>//select[@class=' custom-select ']//option[@value='5']";
	public static String value120="Select 120>//select[@class=' custom-select ']//option[@value='6']";
	
	public static String perClientPrice="Per client price>//input[@placeholder='Enter price per client']";
	public static String maximumRegister="Maximum Register>//input[@placeholder='Maximum #']";
	public static String moderateCancellation="moderate>(//p[text()='Moderate']//preceding::span[@class='bmd-radio'])[2]";
	public static String moderateRetreat ="Moderate>(//p[text()='Moderate']//preceding::span[@class='bmd-radio'])[4]";
	public static String days="Days >//div//label[text()=' Days']";
	public static String allCheckbox="All checkbox>(//input[@id='7']//following::span[@class='check'])[1]";
	public static String selectTime="select Time >(//select[@class='custom-select'])[4]";
	public static String selectPM =">(//select[@class='custom-select'])[4]//option[@value='PM']";
	public static String fromDate="From Date>(//div[@class='right-inner-addon date datepicker'])[1]";
	public static String todayDate="Todays date>//table[@class='ui-datepicker-calendar']//tbody//tr//td[contains(@class,'ui-datepicker-today')]";
	public static String toDate="To Date>(//div[@class='right-inner-addon date datepicker'])[2]";
	public static String nextMonth="Next month>//a[@data-handler='next']";
	public static String dateSelection="Date Selection>//table[@class='ui-datepicker-calendar']//tbody//tr[5]//td//a[text()='31']";
	public static String yogaComplete =" Yoga Complete>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Yoga Class']//following::td//a[text()='Complete'])[1]";
	
	
	
	//Personal yoga sesssion
	
	
	
	public static String personalYogaSession ="Personal Yoga Description>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Personal Yoga Session']//following::td//a//span)[1]";
	public static String enterPrice ="Enter Price>//input[@id='priceInput']";
	public static String priceAdd="Price add>//a[text()='Add']";
	public static String personalComplete =" Personal Yoga Complete>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Personal Yoga Session']//following::td//a[text()='Complete'])[1]";
			
	
	//Yoga therapy
	
	
	public static String yogaTherapyDescr ="Yoga Therapy Description>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Yoga Therapy']//following::td//a//span)[1]";
	public static String YogaTherapyComplete ="Yoga Therapy Complete>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Yoga Therapy']//following::td//a[text()='Complete'])[1]";
	
	// Add retreat
	
	public static String addRetreat ="Add retreat>(//li//a[text()='+ Add retreat or training services'])[1]";
	public static String addRetreat2 ="Add retreat>(//li//a[text()='+ Add retreat or training services'])[2]";
	public static String retreatName="Retreat Name>(//span[@class='bmd-form-group']/input)[1]";
	public static String retreatCheckbox="Retreat Checkbox>//input[@value='retreat']//following::span[@class='bmd-radio']";
	public static String retreatCategory="Retreat Category>(//select[@class='custom-select'])[1]";
	public static String yogaTraining="Yoga and Yoga Training>(//select[@class='custom-select'])[1]//option[@value='5']";
	public static String retreatDescribe ="Describe retreat service>(//span[@class='bmd-form-group']//textarea[@class='form-control custom-form'])[1]";
	public static String qualificationTab ="Qualification Retreat>//strong[text()='| Your qualification to provide this training or retreat']";
	public static String describeYourself="Describe yourself>(//span[@class='bmd-form-group']//textarea[@class='form-control custom-form'])[1]";
	public static String retreatStart ="Retreat Start Date>(//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']//following::td)[1]";
	public static String retreatEnd1 ="Retreat End Date>(//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']//following::td)[1]";
	public static String retreatEnd2="Retreat End Date>//table[@class='ui-datepicker-calendar']//tbody//tr[1]//td[7]";
	public static String addAgenda = "Add Day Agenda>//a[text()='Add Day Agenda']";	
	public static String timeAgenda ="day1>(//tbody//tr//td//input[@class='form-control custom-form p-0'])[1]";
	public static String activityAgenda ="Activity>(//tbody//tr[1]//td//input[@class='form-control custom-form p-0'])[2]";
	public static String whereAgenda ="Where>(//tbody//tr[1]//td//input[@class='form-control custom-form p-0'])[3]";
	public static String plusAgenda ="Plus>(//i[@class='fa fa-plus-circle'])[1]";
	public static String numberPeople="Number of People>(//label[contains(text(),'Number of people required for training ')]//following::span//input)[1]";
	public static String maximumNumber="Maximum number of Guest>(//label[contains(text(),'Maximum number of Guest')]//following::span//input)[1]";
	public static String optional="Optional>(//span[@class='bmd-radio'])[2]";
	public static String addPackage="Add Package>//button[text()=' Add  package']";
	public static String packageName="Package Name>//input[@id='packageName']";
	public static String packageFeature="Package Feature>//span//textarea[@placeholder='what is included in this package?']";
	public static String onePersonPrice="one Person Registration>//input[@name='one_person_price']";
	public static String savepackage="Save Package>//button[text()='Save package']";
	public static String certificaiton = "Certification>//select[@class='custom-select width-60']";
	public static String yes ="Yes>//select[@class='custom-select width-60']//option[text()='Yes']";
	
	public static String firstRetreatComplete ="Retreat Complete>(//div[@class='table-responsive']//table//tbody//tr//td[text()='Yoga and Yoga Training']//following::td//a[text()='Complete'])[1]";
	public static String secondRetreatComplete ="Retreat Complete>((//div[@class='table-responsive']//table//tbody//tr//td[text()='Yoga and Yoga Training'])[2]//following::td//a[text()='Complete'])[1]";

	
	
	//Second Location
	
	public static String secondLocation ="Add another location>//div[@class='table-sec']//a[contains(text(),'Do you have another location ')]";
	public static String otherLocation="Other Location>//span[text()='“Other Location”']";
	public static String homeCheckBox="Home>(//span[text()='Home']//preceding::span[@class='bmd-radio'])[1]";
	public static String ayurveda ="Ayurveda>//option[text()='Ayurveda']";
	public static String abhyanga="Abhyanga>(//i[@class='fa fa-angle-right'])[1]";
	public static String JanuVasti="Januvasti>(//i[@class='fa fa-angle-right'])[3]";
	
	
	//Abhyanga
	
	public static String abhyangaService ="Abhyanga Service>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Abhyanga']//following::td//a//span)[1]";
	public static String  abhyangaExpert="Expert, 5+ years of experience>//select[@id='levelOfExpertise']//option[@value='2']";
	public static String  abhyangaMaster="Master, 10+ years of experience>//select[@id='levelOfExpertise']//option[@value='1']";
	public static String  abhyangaCertified="Certified, 1+ years of experience>//select[@id='levelOfExpertise']//option[@value='3']";
	public static String  abhyangaNotCertified="Not certified, but have some experience>//select[@id='levelOfExpertise']//option[@value='0']";
	public static String abhyangaComplete ="Abhyanga Complete>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Abhyanga']//following::td//a[text()='Complete'])[1]";

	
	//Janu vasti
	 
	 public static String JanuVastiService ="Janu vasti Service>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Janu vasti']//following::td//a//span)[1]";
	 public static String januVastiComplete ="Janu Vasti Complete>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Janu vasti']//following::td//a[text()='Complete'])[1]";

	 //Healer Logout 
	 
	 public static String settings="Settings>//a[text()='Settings']";
	 public static String logOut ="logout>//a[text()='Logout']";
	 
	 
	 //active 
	 
	 public static String yogaClassActive ="Yoga Class Active>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Yoga Class']//following::td//div//label//span[@class='toggle__handler'])[1]";
	 public static String personalYogaActive ="Persona yoga Session Active>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Personal Yoga Session']//following::td//div//label//span[@class='toggle__handler'])[1]";
	 public static String yogaTherapyActive ="Yoga Therapy Active>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Yoga Therapy']//following::td//div//label//span[@class='toggle__handler'])[1]";
	 public static String abhyangaActive ="Abhyanga Active>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Abhyanga']//following::td//div//label//span[@class='toggle__handler'])[1]";
	 public static String januVastiActive = "Januvasti Active>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Janu vasti']//following::td//div//label//span[@class='toggle__handler'])";
	 
	
	//add location 
		
	public static String addLocation ="Add location>//div[@class='plus-image-holder mb-100']";
		
	//Admin locators
	
		
	public static String adminEmailID="Admin emailID>(//input[@id='email'])[1]";
	public static String adminLogIn="Log In>(//button[@type='submit'])[1]";
	public static String usersTab ="Users>//span[text()='Users']";
	public static String pendingHealers="Pending Healers>//li//a[text()='Pending Healers']";
	public static String userSearch="User search>//input[@type='text'][@placeholder='Search...']";
	public static String idVerify="Id verify>(//i[@data-toggle='modal'])[1]";
	public static String verifyMatch ="Verify Match>(//div[@class='col-md-12 text-center']//button)[1]";
	public static String okButton="OK>//button[text()='OK']";
	public static String closeButton="Close button>(//button[text()='Close'])[1]";
	public static String userProfile="User Profile>//li[@class='nav-item dropdown']//img[@alt='user']";
	public static String adminLogout="admin Logout>//a[text()=' Logout']";

	
	
	
	
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";	
	
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	// public static String =">";
	 
	 
	 

}