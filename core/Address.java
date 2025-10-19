package core;

public class Address {
	//Constants
	public static final String CITYNAME = "No CityName";
	public static final String DISTRICTNAME = "No DistrictName";
	public static final String STREETNAME = "No StreetName";
	
	public String getCityName() {
		return cityName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Address() {
		this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
	}
	
	//Danh sach thuoc tinh
	private String cityName;
	private String districtName;
	private String streetName;
	public Address(String cityName, String districtName, String streetName) {
		
		this.cityName = cityName;
		this.districtName = districtName;
		this.streetName = streetName;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", districtName=" + districtName + ", streetName=" + streetName + "]";
	}

	
}
