/**
 * 
 */
package fr.epita.geometry.shapes;

/**
 * @author tbrou
 *
 */
public class Square implements Shape { //implements Shape 는 Shape의 methods를 강제한다.

	private double side;
	/* (non-Javadoc)
	 * @see fr.epita.geometry.shapes.Shape#calculateArea()
	 */
	public double getSide(){
		return side;
	}
	public void setSide(double side){
		this.side=side;
	}
	public Square(double side){
		this.side=side;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	/* (non-Javadoc)
	 * @see fr.epita.geometry.shapes.Shape#calculatePerimeter()
	 */
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

}
