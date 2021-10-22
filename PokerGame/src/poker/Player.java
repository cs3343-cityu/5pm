package poker;

public class Player {
	private String firstname;
	private String midName;
	private String lastName;
	private String gender;
	private int age;
	private String iD;
	private int skillLevel;
	private String address1;
	private String address2;
	private String city;
	private String country;
	private int whatsApp;

	public Player(String firstname, String midName, String lastName, String gender, int age, String iD, int skillLevel,
			String address1, String address2, String city, String country, int whatsApp) {
		this.firstname = firstname;
		this.midName = midName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.iD = iD;
		this.skillLevel = skillLevel;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.country = country;
		this.whatsApp = whatsApp;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getWhatsApp() {
		return whatsApp;
	}

	public void setWhatsApp(int whatsApp) {
		this.whatsApp = whatsApp;
	}
}