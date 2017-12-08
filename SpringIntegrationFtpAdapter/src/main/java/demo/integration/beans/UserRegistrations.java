package demo.integration.beans;

public class UserRegistrations {
	
	private String firstName;
	
	private String lastName;
	
	private String city;
	
	private String address;
	
	
	
	private String phoneNumber;
	
	private String fax;
	
	private String url;
	
	private String state;
	
	private String company;
	
	private String zip;
	
	private String county;

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public UserRegistrations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserRegistrations [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", fax=" + fax + ", url=" + url + ", state=" + state
				+ ", company=" + company + ", zip=" + zip + ", county=" + county + "]";
	}

	
	
	
	
	

}
