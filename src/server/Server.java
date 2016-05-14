import java.util.*;
import java.awt.*;

public class Server
{
	LinkedList<IPropertyCard> propertyList;
	public static void main(String args[])
	{
		
	}
	public Server(){
	
	init();	
	}
	
	public void init(){
		propertyList = new LinkedList<IPropertyCard>();
		propertyList.add(new PropertyCard("Go",200,Color.WHITE, false, 0, new Point(435,435), 65,65, new int[0], "Other"));
		propertyList.add(new PropertyCard("Mediterranean Ave.",60,Color.PURPLE, true, 2, new Point(394,435), 41,65, new int[10,30,90,160,250], "Monopoly")); //purple 1
		propertyList.add(new PropertyCard("Community Chest",0,Color.WHITE, false, 0, new Point(353,435), 41,65, new int[0], "Other"));	//community chest
		propertyList.add(new PropertyCard("Baltic Ave."60,Color.PURPLE, true, 4, new Point(312,435), 41,65, new int[20,60,180,320,450], "Monopoly"));	//purple 2
		propertyList.add(new PropertyCard("Income Tax",-200,Color.WHITE, false, 0, new Point(271,435), 41,65, new int[0], "Other"));	//tax
		propertyList.add(new PropertyCard("Reading Railroad",200,Color.BLACK, true, 0, new Point(230,435), 41,65, new int[25,50,100,200], "Railroad"));	//railroad 1
		propertyList.add(new PropertyCard("Oriental Ave.",100,Color.CYAN , true , 6 , new Point(189,435), 41,65, new int[30,90,270,400,550], "Monopoly")); //cyan 1
		propertyList.add(new PropertyCard("Chance",0,Color.WHITE, false, 0, new Point(148,435), 65,65, new int[0], "Other")); //chance
		propertyList.add(new PropertyCard("Vermont Ave.",100,Color.CYAN, true, 6, new Point(107,435), 41,65, new int[30,90,270,400,500], "Monopoly")); //cyan 2
		propertyList.add(new PropertyCard("Connecticut Ave.",120,Color.CYAN, true, 8, new Point(66,435), 41,65, new int[40,100,300,450,600], "Monopoly")); //cyan 3
		propertyList.add(new PropertyCard("Jail",0,Color.WHITE, false, 0, new Point(0,435), 65,65, new int[0], "Jail")); 	//jail
		propertyList.add(new PropertyCard("St. Charles Place",140,Color.PINK, true, 10, new Point(0,394), 65,41, new int[50,150,450,625,750], "Monopoly"));	//pink 1
		propertyList.add(new PropertyCard("Electric Company",150,Color.WHITE, true, 0, new Point(0,353), 65,41, new int[0], "Utility"));	//electric company
		propertyList.add(new PropertyCard("States Ave.",140,Color.PINK, true, 10, new Point(0,312), 65,41, new int[50,150,450,625,750], "Monopoly"));	//pink 2
		propertyList.add(new PropertyCard("Virginia Ave.",160,Color.PINK, true, 12, new Point(0,271), 65,41, new int[60,180,500,700,900], "Monopoly"));	//pink 3
		propertyList.add(new PropertyCard("Pennsylvania Railroad",200,Color.BLACK, true, 0, new Point(0,230), 65,41, new int[25,50,100,200], "Railroad"));
		propertyList.add(new PropertyCard("St. James Place",180,Color.ORANGE, true, 14, new Point(0,189), 65,41, new int[70,200,550,750,950], "Monopoly"));
		propertyList.add(new PropertyCard("Community Chest",0,Color.WHITE, false, 0, new Point(0,148), 65,41, new int[0], "Other"));
		propertyList.add(new PropertyCard("Tennessee Ave.",180,Color.ORANGE, true, 14, new Point(0,107), 65,41, new int[70,200,550,750,950], "Monopoly"));
		propertyList.add(new PropertyCard("New York Ave.",200,Color.ORANGE, true, 16, new Point(0,66), 65,41, new int[80,220,600,800,1000], "Monopoly"));
		propertyList.add(new PropertyCard("Free Parking",0,Color.WHITE, false, 0, new Point(0,0), 65,65, new int[0], "Other"));
	}
	
}
