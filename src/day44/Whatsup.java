package day44;

public class Whatsup {
private String toNumber;
private String message;
private boolean delivered;

public Whatsup() {
	
	System.out.println("No-args constructor");
}
public Whatsup(String toNumber,String message) {
	
	this();
	System.out.println(" 2 args constructor");
	this.message=message;
	this.toNumber=toNumber;
}
public Whatsup(String toNumber) {
	//toNumber, "unknown" 
		this(toNumber, "[]");
		
	System.out.println("1 arg constructor");
}
@Override
public String toString() {
	return "Whatsup [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
}
public String getToNumber() {
	return toNumber;
}
public void setToNumber(String toNumber) {
	this.toNumber = toNumber;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public boolean isDelivered() {
	return delivered;
}
public void setDelivered(boolean delivered) {
	this.delivered = delivered;
}


}
