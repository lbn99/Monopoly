import java.awt.*;

public class PropertyCard implements IPropertyCard
{
	private String name;
	private int price;
	private Color color;
	private boolean available;
	private int rent;
	private Point point;
	private int x_size;
	private int y_size;
	private int[] house_rents;
	private String type;
	private String owner;
	public PropertyCard(String n, int p, Color c, boolean a, int r, Point x, int s_x, int s_y, int[] house_p, String t)
	{
		this.name = n;
		this.price = p;
		this.color = c;
		this.available = a;
		this.rent = r;
		this.point = x;
		this.x_size = s_x;
		this.y_size = s_y;
		this.house_rents = house_p;
		this.type = t;
		this.owner = "";
	}
	
	public String getName(){
		return this.name;
	}

	//it returns the cost of the card
	public int getCost(){
		return this.price;		
	}

	//it sets the boolean available to true or false accordingly
	public void setAvailable(boolean b){
		this.available = b;
	}

	//it returns the status of available
	public boolean getAvailable(){
		return this.available;
	}

	//it returns the list of the rents
	public int getRent(){
		return this.rent;
	}

	//it returns the color of the card
	public Color getColor(){
		return this.color;
	}

	//it returns the cordinate 
	public boolean checkInside(Point p)
	{
		int min_X = (int)(this.point.getX());
		int max_X = min_X + x_size;
//		if(this.point.getX())
		return true;
	}
		
	public Point getPoint()
	{
		return this.point;
	}

	//it returns the type of the card
	public String getType(){
		return this.type;
	}

	//it sets the owner
	public void setOwner(String s){
		this.owner = s;	
	}

	//it returns the owner
	public String getOwner(){
		return this.owner;
	}
	
}