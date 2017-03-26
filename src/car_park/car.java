
package car_park;

public class car {

	
	private String license_plateNumber;

	private String province;
	private String time_checkin;
	private String time_checkout;
	private int hour;
	public String getLicense_plateNumber() {
		return license_plateNumber;
	}
	public void setLicense_plateNumber(String license_plateNumber) {
		this.license_plateNumber = license_plateNumber;
	}private int price;
	
	
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getTime_checkin() {
		return time_checkin;
	}
	public void setTime_checkin(String time_checkin) {
		this.time_checkin = time_checkin;
	}
	public String getTime_checkout() {
		return time_checkout;
	}
	public void setTime_checkout(String time_checkout) {
		this.time_checkout = time_checkout;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
