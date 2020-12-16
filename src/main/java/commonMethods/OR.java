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
	
	
   public static String serviceName ="Be specific your name>//span[@class='bmd-form-group']//input[@id='name']";
   public static String yogaClassDescription="Yoga class description>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Yoga Class']//following::td//a//span[text()=' Need Description'])[1]";
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
	public static String value150="Select 150>//select[@class=' custom-select ']//option[@value='7']";
	
	
	public static String perClientPrice="Per client price>//input[@placeholder='Enter price per client']";
	public static String maximumRegister="Maximum Register>//input[@placeholder='Maximum #']";
	public static String strictCancellation ="Strict>(//p[text()='Strict']//preceding::span[@class='bmd-radio'])[1]";
	public static String moderateCancellation="Moderate>(//p[text()='Moderate']//preceding::span[@class='bmd-radio'])[2]";
	public static String relaxedCancellation="Relaxed>(//p[text()='Relaxed']//preceding::span[@class='bmd-radio'])[3]";
	public static String strictRetreat ="Strict>(//p[text()='Strict']//preceding::span[@class='bmd-radio'])[3]";
	public static String moderateRetreat ="Moderate>(//p[text()='Moderate']//preceding::span[@class='bmd-radio'])[4]";
	public static String relaxedRetreat="Relaxed>(//p[text()='Relaxed']//preceding::span[@class='bmd-radio'])[5]";
	public static String days="Days >//div//label[text()=' Days']";
	public static String allCheckbox="All checkbox>(//input[@id='7']//following::span[@class='check'])[1]";
	
	//Hours selections
	
	public static String fromHours="select Hours >(//select[@class='custom-select'])[1]";
	public static String toHours="select Hours >(//select[@class='custom-select'])[3]";
	
	
	public static String selectHours = "From Hour>(//select[@class='custom-select'])[1]//option[@value='5']";
	public static String toSelectHours = "To Hour>(//select[@class='custom-select'])[3]//option[@value='5']";
	
	
	
	public static String fromMins="select Minutes >(//select[@class='custom-select BR-0'])[1]";
	public static String toMins="select Minutes >(//select[@class='custom-select BR-0'])[2]";
	
	
	public static String selectMins = "From Mins > (//select[@class='custom-select BR-0'])[1]//option[@value='00']";
	public static String toselectMins = "To Mins > (//select[@class='custom-select BR-0'])[2]//option[@value='30']";
	
	
	public static String fromTime="select Time AM/PM >(//select[@class='custom-select'])[2]";
	public static String toTime="select Time AM/PM >(//select[@class='custom-select'])[4]";
	
	public static String selectPm = "Select PM>(//select[@class='custom-select'])[2]//option[@value='PM']";
	public static String toPM = "Select PM>(//select[@class='custom-select'])[4]//option[@value='PM']";
	
	
	public static String selectPM =">(//select[@class='custom-select'])[4]//option[@value='PM']";
	public static String fromDate="From Date>(//div[@class='right-inner-addon date datepicker'])[1]";
	public static String fromInput ="From Start Date>(//div[@class='right-inner-addon date datepicker'])[1]//span//input";
	public static String todayDate="Todays date>(//table[@class='ui-datepicker-calendar']//tbody//tr//td[contains(@class,'ui-datepicker-today')]//following::a)[1]";
	public static String toDate="To Date>(//div[@class='right-inner-addon date datepicker'])[2]";
	public static String toInput ="To End Date>(//div[@class='right-inner-addon date datepicker'])[1]//span//input";
	public static String nextMonth="Next month>//a[@data-handler='next']";
	public static String dateSelection="Date Selection>//table[@class='ui-datepicker-calendar']//tbody//tr[5]//td//a[text()='31']";
	public static String yogaComplete =" Yoga Complete>((//div[@class='table-responsive']//tbody)[1]//tr//td[text()='Yoga']//following::td//a[text()='Complete'])[1]";
	
	public static String nextDay ="Next day>(//table[@class='ui-datepicker-calendar']//tbody//tr//a[@class='ui-state-default'])[1]";
	
	public static String notPresentDate ="next date>(//table[@class='ui-datepicker-calendar']//tbody//tr//td[contains(@class,'ui-datepicker-today')]//following::td//a)[1]";
	
	//Personal yoga sesssion
	
	
	
	public static String personalYogaSession ="Personal Yoga Description>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Personal Yoga Session']//following::td//a//span[text()=' Need Description'])[1]";
	public static String enterPrice ="Enter Price>//input[@id='priceInput']";
	public static String priceAdd="Price add>//a[text()='Add']";
	public static String personalComplete =" Personal Yoga Complete>((//div[@class='table-responsive']//tbody)[1]//tr//td[text()='Yoga']//following::td//a[text()='Complete'])[2]";
			
	
	//Yoga therapy
	
	
	public static String yogaTherapyDescr ="Yoga Therapy Description>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Yoga Therapy']//following::td//a//span[text()=' Need Description'])[1]";
	public static String YogaTherapyComplete ="Yoga Therapy Complete>((//div[@class='table-responsive']//tbody)[1]//tr//td[text()='Yoga']//following::td//a[text()='Complete'])[3]";
	
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
	public static String Urdvartana ="Urdvartana>(//i[@class='fa fa-angle-right'])[2]";
	public static String JanuVasti="Januvasti>(//i[@class='fa fa-angle-right'])[3]";
	
	
	//Abhyanga
	
	public static String abhyangaService ="Abhyanga Service>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Abhyanga']//following::td//a//span[text()=' Need Description'])[1]";
	public static String  abhyangaExpert="Expert, 5+ years of experience>//select[@id='levelOfExpertise']//option[@value='2']";
	public static String  abhyangaMaster="Master, 10+ years of experience>//select[@id='levelOfExpertise']//option[@value='1']";
	public static String  abhyangaCertified="Certified, 1+ years of experience>//select[@id='levelOfExpertise']//option[@value='3']";
	public static String  abhyangaNotCertified="Not certified, but have some experience>//select[@id='levelOfExpertise']//option[@value='0']";
	public static String abhyangaComplete ="Abhyanga Complete>((//div[@class='table-responsive']//tbody)[2]//tr//td[text()='Ayurveda']//following::td//a[text()='Complete'])[1]";

	
	//Urdvartana
	
	 public static String urdvartanaService ="Urdvartana Service>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Urdvartana']//following::td//a//span[text()=' Need Description'])[1]";
	 public static String urdvartanaComplete ="Uradvartana Complete>((//div[@class='table-responsive']//tbody)[2]//tr//td[text()='Ayurveda']//following::td//a[text()='Complete'])[2]";
	
	
	
	
	//Janu vasti
	 
	 public static String JanuVastiService ="Janu vasti Service>(//div[@class='table-responsive']//table//tbody//tr//td//a[text()='Janu vasti']//following::td//a//span[text()=' Need Description'])[1]";
	 public static String januVastiComplete ="Janu Vasti Complete>((//div[@class='table-responsive']//tbody)[2]//tr//td[text()='Ayurveda']//following::td//a[text()='Complete'])[3]";

	 //Healer Logout 
	 
	 public static String settings="Settings>//a[text()='Settings']";
	 public static String logOut ="logout>//a[text()='Logout']";
	 
	 
	 //active 
	 
	 public static String yogaClassActive ="Yoga Class Active>((//div[@class='table-responsive']//tbody)[1]//tr//td[text()='Yoga']//following::td[2]//div[@class='toggleWrapper']//label//span[1])[1]";
	 public static String personalYogaActive ="Persona yoga Session Active>((//div[@class='table-responsive']//tbody)[1]//tr//td[text()='Yoga']//following::td[2]//div[@class='toggleWrapper']//label//span[1])[2]";
	 public static String yogaTherapyActive ="Yoga Therapy Active>((//div[@class='table-responsive']//tbody)[1]//tr//td[text()='Yoga']//following::td[2]//div[@class='toggleWrapper']//label//span[1])[3]";
	 public static String abhyangaActive ="Abhyanga Active>((//div[@class='table-responsive']//tbody)[2]//tr//td[text()='Ayurveda']//following::td[2]//div[@class='toggleWrapper']//label//span)[1]";
	 public static String urdvartanaActive ="Urdvartana Active>((//div[@class='table-responsive']//tbody)[2]//tr//td[text()='Ayurveda']//following::td[2]//div[@class='toggleWrapper']//label//span)[2]";
	 public static String januVastiActive = "Januvasti Active>((//div[@class='table-responsive']//tbody)[2]//tr//td[text()='Ayurveda']//following::td[2]//div[@class='toggleWrapper']//label//span)[3]";
	 
	
	//add location 
		
	public static String addLocation ="Add location>//div[@class='plus-image-holder mb-100']";
		
	//Admin locators
	
		
	public static String adminEmailID="Admin emailID>(//input[@id='email'])[1]";
	public static String adminLogIn="Log In>(//button[@type='submit'])[1]";
	public static String usersTab ="Users>//span[text()='Users']";
	public static String pendingHealers="Pending Healers>//li//a[text()='Pending Healers']";
	public static String userSearch="User search>//input[@type='text'][@placeholder='Search...']";
	public static String idVerify="Id verify>(//i[@class='fa fa-id-card text-success'])[1]";
	public static String idNotVerified ="Id Verify>//i[@class='fa fa-id-card text-danger']";
	public static String verifyMatch ="Verify Match>(//div[@class='col-md-12 text-center']//button)[1]";
	public static String okButton="OK>//button[text()='OK']";
	public static String closeButton="Close button>(//button[text()='Close'])[1]";
	public static String userProfile="User Profile>//li[@class='nav-item dropdown']//img[@alt='user']";
	public static String adminLogout="admin Logout>//a[text()=' Logout']";

	
	
	//Customer Locators
	
	
	
	
	
	 public static String iHealerLogo="iHealer>//div[@class='container']//a[@class='navbar-brand']";
	 public static String noBooking="No booking found>//p[text()='No Booking found!']";
	 public static String healerLocation="Healer's Location>(//div[@class='row']//div[@class='col-4 col-xs-12 col-sm-4'])[2]";
	 public static String setLocation ="Set Location>//div//button[text()='SET LOCATION']";
	 public static String mapLocation = "Set Healer Location>//div[@class='modal-body']//div[@id='map']//div//input";
	 public static String whatService="Select a Service>//div[@class='header-title']//h3[text()='What']//following::div[@class='where-tab-sec']";
	
	 
	 public static String sendWhat ="Service Name >//input[@placeholder='Find or Select a Service']";
	 
	 public static String whatYoga ="Yoga Service>//div[@id='myDropdown']//div[contains(@class,'banner-content')]//small[text()='Yoga']";
	 public static String whatAyurveda ="Ayurveda Service>//div[@id='myDropdown']//div[contains(@class,'banner-content')]//small[text()='Ayurveda']";
	 
	 public static String todayCheck ="Today Checkbox>(//span[@class='checkbox-decorator']//span)[1]";
	 public static String searchNow="Search Now>//div[@class='banner-btn']";
	 public static String chooseService="Choose a service>//select[@class='custom-select mt-2']";
	 public static String min30="30 Minutes>//div[@class='swiper-wrapper']//div//b[text()='30']";	
	
	 public static String serviceYoga="Yoga Class>//option[text()='Yoga Class']";
	 public static String servicePersonal="Personal yoga session>//option[text()='Personal Yoga Session']";
	 public static String serviceTherapy="Yoga Therapy>//option[text()='Yoga Therapy']";
	 
	 
	 public static String serviceAbhyanga = "Yoga Class>//option[text()='Abhyanga']";
	 
	 public static String serviceUrdvartana ="Urdvartana>//option[text()='Urdvartana']";
	 
	 public static String serviceJanuvasti ="Janu vasti>//option[text()='Janu vasti']";
	 
	 
	 
	 
	 
	 public static String searchButton="Search>//button[@type='button'][text()='SEARCH']";
	 public static String availableHealers ="Available Healers>//div[@class='box-title']";
	
	 public static String timeButton ="Time>(//div[@class='swiper-wrapper']//a[@class='swiper-slide slot-item swiper-slide-active'])[1]";
	 public static String aboutSession="About your Session>//div//label[text()='About your session']//following::div[1]";
	 public static String serviceMyself="Service is for myself>//option[text()='Service is for myself']";
	 public static String savedguests="Saved guests>//option[text()='Saved guests']";
	 public static String serviceGuest="Service is for guest>//option[text()='Service is for guest']";
	 public static String noteToProvide ="Notes to Provide>//label[text()='Notes to Provider:']";
	 public static String providerNotes="Notes to provider>//span[@class='bmd-form-group']//textarea";
	 public static String paymentTab="Payment >//div[@class='payment-panel']//strong[text()=' | Payment']";
	 public static String finalPayment="Final payment>//ul[@class='final-pay']//span[@class='booking-amount']";
	 public static String cardInformation ="Card information>//div[@class='payment-panel']//strong[text()=' | Card Information']";
	 public static String cardName="Card Name>//span[@class='bmd-form-group']//input[@name='full-name']";
	 public static String cardNumber="Card Number>//span[@class='bmd-form-group']//input[@id='card-number']";
	 public static String selectMonth="Select month>//span[@class='bmd-form-group']//input[@name='expiryMonth']";
	 public static String month="Enter Month>//input[@name='expiryMonth']";
	 public static String selectYear="Year>//span[@class='bmd-form-group']//input[@placeholder='YY']";
	 public static String Year="Enter Year>//input[@placeholder='YY']";
	

	 public static String selectCVC="CVC>//span[@class='bmd-form-group']//input[@name='cvc']";
	 public static String enterCVC="Enter CVC>//input[@name='cvc']";
	 public static String saveCardDetails="Save Card>//input[@id='saveCard']//following::span[@class='check']";
	 public static String selectSavedCard ="Select a saved card>(//select[@class='custom-select'])[2]";
	 
	 public static String visaSaved ="saved Card>//option[text()='Concert Visa']";
	 
	 public static String confirmBooking="Confirm Booking>//div//a[text()='Confirm Booking']";
	 public static String saveCardName ="Card Name Remember>//div[@class='custom-form-group']//label[contains(text(),'Name your card')]//following::input";
	
	 public static String thankBooking="Thank you for the booking>//div[@class='about-client']//strong[contains(text(),'Thank you ')]";
	 public static String bookingId="Booking id>//div[@class='about-client']//p//b";
	 
	 
	 
	 //Yoga class 1 get text
	 
	 public static String checkYogaName ="Yoga Name verificaiton>//div[@class='mb-4 search-service-list m-1']//h3";
	 
	 
	 
	 public static String availableToday ="Available Today>//div[@class='box-title']//h3[text()='Available Today']";
	 public static String viewAllButton="View All>//div[@class='box-title']//h3[text()='Available Today']//following::div//div//a[text()='View all']";
	 public static String selectCategory="Select Category>//select[@class='custom-select ml-2']";
	 
	 
	 
	 
	 
	 public static String retreatLocation="Retreat Location>(//div[@class='row']//div[@class='col-4 col-xs-12 col-sm-4'])[3]";
	 public static String retreatMapLocation = "Set Retreat Location>//div[@class='modal-body']//div[@id='map']//div//input";
	 
	 
	 
	 public static String yogaAndTraining="Yoga and Yoga Training>//div[@id='myDropdown']//div[contains(@class,'banner-content')]//small[text()='Yoga and Yoga Training']";
	 public static String dateCustomer ="Customer Date option>//span[@class='bmd-form-group']//input";
	 
	 public static String retreatDateSelection="Retreat Date selection>//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']//following::td[1]";
	 public static String holisticCheckbox ="Holistic or Therapeutic Retreat>(//span[text()='Holistic or Therapeutic Retreat']//preceding::span[@class='bmd-radio'])[2]";
	 public static String userAccount ="User Name>(//div[@class='media-body ']//h4)[1]";
	 public static String scrollServices="Services>//div[@class='box-title']";
	 public static String serviceRetreat ="Retreat Service>//a[text()='Test Retreat Service one']//following::div//button[text()='Book']";
	 public static String viewPackages="View Packages>//div//a[text()='View Packages']";
	 public static String bookPackages="Book this Packages>//button[text()='Book this Package']";
	 public static String continueButton ="Continue Button>//button[text()='Continue']";
	 
	 public static String guestTextbox="Guest Textbox>(//label[text()='Guest Name']//following::input)[1]";
	 public static String locationDrop="Location Dropdown>//select[@class='custom-select ml-2']";
	 public static String ayurvedaDrop="Ayurveda service>//select[@class='custom-select ml-2']//option[3]";
	 public static String selectJanuvasti="Januvasti Service>((//h4[@class='font-pink'])[3]//following::div//button[text()='Book'])[1]";
	
	 public static String continueBooking ="Continue Booking>//a[@id='continueBooking']";
	 public static String proceedPayment="Proceed to Payment>//a[text()='Proceed to Payment']";
	 public static String guestSelection="guest selection>//select[@class='custom-select ']";
	 
	 public static String bookingsHeader="Bookings>//a[text()='Bookings']";
	public static String currentBooking1 ="Current Bookings 1>(//div[@class='booking-list-box'])[1]";
	public static String currentBooking2 ="Current Bookings 2>(//div[@class='booking-list-box'])[2]";
	public static String currentBooking3 ="Current Bookings 3>(//div[@class='booking-list-box'])[3]";
	 
	public static String cancelButton="Cancel button>(//div[@class='btn-oneline']//a[2])[1]";
	public static String cancellationReason ="Cancellation Reason>(//label[text()='Cancellation Reason']//following::select)[1]";
	public static String cancellationReasons ="Cancellation Reasons>(//label[text()='Cancellation Reasons']//following::select)[1]";
	
	 
	 public static String otherCancellation="Other>(//label[text()='Cancellation Reason']//following::select)[1]//option[text()='Other']";
	 public static String cancellation1="I can't make this date and time>//option[contains(text(),'make this date and time')]";
	 public static String describeSituation="Describe your situation>(//label[text()='Describe your situation']//following-sibling::span[@class='bmd-form-group']/textarea[@class='form-control custom-form'])[2]";

	 public static String describeSituation1 ="Describe your situation>(//span[@class='bmd-form-group is-filled']/textarea[@class='form-control custom-form'])";
	 public static String policyType="Policy Type>(//span[text()='Policy:']//following::span)[1]";
	 
	 
	 
	 
	 
			 
			 
			 
	public static String paidAmount="Paid>(//span[text()='Paid:']//following::span)[1]";
	public static String refundPerAmount="Refund Percentage>(//span[text()='Refund Percentage:']//following::span)[1]";
	public static String refundAmount="Refund>(//span[text()=' Refund:']//following::span)[1]";
	public static String cancelBookCan="Cancel booking>//a[text()='Cancel Booking']";
	
	public static String closePopup ="Popup close>(//div[@class='modal-content'])[4]//button[@class='close']//span[@aria-hidden='true']";
	
	
	
	public static String cancelYogaClass ="Cancel Yoga Class>(//h5[text()='Check Yoga Class Service']//following::a[2])[1]";
	public static String receiptYoga ="Yoga class Receipt>(//h5[text()='Check Yoga Class Service'])[1]";
	
	public static String cancelUrdavartana = "Cancel Urdavartana>(//h5[text()='Check Urdvartana Service flow']//following::a[2])[1]";
	public static String cancelJanuVasti = "Cancel JanuVasti>(//h5[text()='Check Januvasti Service Flow']//following::a[2])[1]";
	
	
	public static String receiptRefund="Refund amount>//span[text()='Refund']//following::span[1]";
	public static String notificationtab="Notifications>//ul[@class='menu-tabs']//div[@class='banner-content']//small[text()='Notifications']";
			 
			 
			 
	public static String yogaViewall="Yoga class view Details>(//div[text()='You have received a new booking for Check Yoga Class Service']//following::u[text()='View Detail'])[1]";
	public static String verifyCancel="Verify Cancelled>//a[text()='Cancelled']";
	public static String backButton ="Back>//a[text()=' back']";
	
	
	public static String personalDetails="Personal yoga view details>(//div[text()='You have received a new booking for Check Personal Yoga Service']//following::u[text()='View Detail'])[1]";
	public static String changeTime ="Change Time>//a[text()='Change time']";
	public static String changeTimePop="Change Time Popup>//a[text()='Change Time']";
	public static String alertTIme=" Verify alert pop time>//div[@class='alert alert-info']";
	
	
	
	public static String HealerRequest="Healer Request notification>(//div[contains(text(),'The healer has requested to change time ')]//following::u[text()='View Detail'])[1]";
	public static String rejectCancel="Reject and Cancel booking>//button[text()='Reject and Cancel Booking']";
	public static String yesPopup="Yes Popup>(//button[text()='Yes'])[2]";
    public static String retreatCancel="Retreat Cancel>(//h5[text()='Test Retreat Service one']//following::a[3])[1]";
	public static String pastBooking="Past Booking>//strong[text()=' | Past Bookings']";
    public static String abhyangaviewDetail="Abhyanga view detail>(//div[text()='You have received a new booking for Check Abhyanga Service flow']//following::u[text()='View Detail'])[1]";
	public static String healerCancel="Cancel>//a[text()='Cancel']";

    public static String urdavartanaviewDetail="Urdvartana view detail>(//div[text()='You have received a new booking for Check Urdvartana Service flow']//following::u[text()='View Detail'])[1]";

	
	
	public static String acceptChanges="Accept Changes>//button[text()='Accept Change']";
	public static String totalAmount="Total Amount>(//span[text()='Total Payment:']//following::span)[1]";
	
	public static String requestRefund="Refund>//a[text()='Refund']";
	public static String requestOption="Request option>(//div[@class='custom-form-group']//select)[1]";
    public static String unableAppoint="I was unable to make the appointment>//option[text()='I was unable to make the appointment']";
	public static String provideDetails="Provide more details>//label[text()='Provide more details']//following::textarea[1]";
    public static String refundRequest ="Request Refund>//a[text()='REQUEST REFUND']";
	public static String requestedRefund="Refund Requested>//span[text()='Refund Requested']";
	public static String dashBoard ="Dashboard>//a[text()='Dashboard']";
			// public static String =">";
				// public static String =">";
				// public static String =">";
				// public static String =">";
				// public static String =">";
				// public static String =">";
				// public static String =">";
				// public static String =">";
				 
	 

}