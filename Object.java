
public class Object {

	double length;
	double width;
	double height;
	
	//Empty Constructor
	Object(){
		;
	}
	
	//Constructor with Parameters
	public Object(double l, double w, double h){
		
		length = l;
		width = w;
		height = h;
		
	}
	
	//Getter Method for Length
	public double getLength() {
		return length;
	}
	
	//Getter Method for Width
	public double getWidth() {
		return width;
	}
	
	//Getter Method for Height
	public double getHeight() {
		return height;
	}
	
	//Impromptu toString() method, feel free to improve
	public String getParameters() {
		
		String strLength = String.valueOf(length);
		String strWidth = String.valueOf(width);
		String strHeight = String.valueOf(height);
		
		return "Length: " + strLength + "\nWidth: " + strWidth + "\nHeight: " + strHeight;
	}
}
