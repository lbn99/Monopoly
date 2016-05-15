import java.awt.Color;
import java.awt.Point;

public interface IPropertyCard
{
	//Constructor would have the parameters for "cost", "color", "rent", "position", "name", and possibly the size
	//SO I'M going to comment out all the set stuff that we might not need
	//it sets the name of the card
//	public void setName(String s);

	//it returns the name of the card
	public String getName();

	//it sets the cost of the card
//	public void setCost(Double d);

	//it returns the cost of the card
	public Double getCost();

	//it sets the boolean available to true or false accordingly
	public void setAvailable(boolean b);

	//it returns the status of available
	public boolean getAvailable();

	//it sets the rents using a list/staticArray 
//	public void setRent(int[] r);

	//it returns the list of the rents
	public int[] getRent();

	//it sets the color of the card
//	public void setColor(Color c);

	//it returns the color of the card
	public Color getColor();

	//it sets the position coordinate (lower left corner)
	public void setPosition(Point c);

	//it returns the cordinate 
	public Point getPosition();

	//it sets the Y-size of the card
//	public void setY(int y);

	//it sets the X-size of the card
//	public void setX(int x);

	//it returns the Y size of the card
	public int getY();

	//it returns the X size of the card
	public int getX();

	//Lyndon, I'm not sure what this is going to do, so change it if it's wrong
	public void setType(String s);

	//it returns the type of the card
	public String getType();

	//it sets the owner
	public void setOwner();

	//it returns the owner
	public String getOwner();
}