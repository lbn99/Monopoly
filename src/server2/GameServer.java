import java.net.*;
import java.util.*;
import java.io.*;

public class GameServer implements Runnable, IServer
{
	private int port; 
	private int id;
	private boolean running;
	private Queue<IPlayer> playerList;
	
	public static void main(String[] args)
	{
		GameServer server = new GameServer(99);
		Thread t = new Thread(server);
		t.start();
		try{
		System.out.println("GameServer started\n" + 
			"Connected to: " + InetAddress.getLocalHost() + " and port 99");
		}
		catch(Exception e) { e.printStackTrace(); }
	}
    public GameServer(int port) 
    {
    	this.port = port;
    	running = true;
    	id = 0;
    	playerList = new Queue<IPlayer>();
    	init();
    	
    }
    
    public IClient[] getClients()
    {
    	return (IPlayer[])playerList.toArray(new IPlayer[]{});
    }
    
    public void broadcast(String data)
    {
    	for(IPlayer c : playerList)
    		c.send(data);
    }
    
    public void remove(IPlayer c)
    {
    	for(int i = 0; i < playerList.size(); i++)
    		if(playerList.get(i).getId() == c.getId()){
    			playerList.remove(i);
    			break;
    		}
    	System.out.println(c.getHandle() + " has disconnected");
    }
    
    public void run()
    {
    	Random rand = new Random();
    	try{
    		ServerSocket listener = new ServerSocket(port);
    		while(running){
    			Socket playerSocket = listener.accept();
    			IPlayer player = new ServerSidePlayer(nextID(), this, palyerSocket);
    			playerList.add(player);
    			this.addListeners(player);
    			System.out.println(player.getHandle() + " connected");
    		}
    	}
    	catch(Exception e){ e.printStackTrace(); }
    }
    
    public void stop()
    {
    	running = false;
    }
    public int nextID(){
    	 return id++; 
   	}
   	
   	public void init(){
   		//the initialization code goes here -- property cards
   	}
   	public void addListeners(IPlayer p){
   		p.addNetworkListener(new BuyCommand());
   	}
}