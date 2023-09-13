
public class Rectangle {
	private float rectLength;
	private float rectWidth;
	private float rectPerimeter;
	private float rectArea;
	private float rectBreadth;
	public Rectangle(float rectLength, float rectWidth, float rectPerimeter, float rectArea, float rectBreadth) {
		
		this.rectLength = rectLength;
		this.rectWidth = rectWidth;
		this.rectPerimeter = rectPerimeter;
		this.rectArea = rectArea;
		this.rectBreadth = rectBreadth;
	}
	public float getRectLength() {
		return rectLength;
	}
	public void setRectLength(float rectLength) {
		this.rectLength = rectLength;
	}
	public float getRectWidth() {
		return rectWidth;
	}
	public void setRectWidth(float rectWidth) {
		this.rectWidth = rectWidth;
	}
	public float getRectPerimeter() {
		return rectPerimeter;
	}
	public void setRectPerimeter(float rectPerimeter) {
		this.rectPerimeter = rectPerimeter;
	}
	public float getRectArea() {
		return rectArea;
	}
	public void setRectArea(float rectArea) {
		this.rectArea = rectArea;
	}
	public float getRectBreadth() {
		return rectBreadth;
	}
	public void setRectBreadth(float rectBreadth) {
		this.rectBreadth = rectBreadth;
	}
	
	
}