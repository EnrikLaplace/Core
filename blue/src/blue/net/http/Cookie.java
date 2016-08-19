package blue.net.http;

public class Cookie {
	private String name;
	private String value;

	public Cookie(String name, String value){
		this.name = name;
		this.value = value;
	}
	
	public void set(String value){
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return name + "=" + value;
	}
}
