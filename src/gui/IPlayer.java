public interface IPlayer
{
	//This player would have a constructor that will take "name" for input
	//also inti propertyList in the const.

	//this would add the property to the list
	public void add(IPropertyCard p);

	//this returns the list of the IPropCard that the player has
	public IPropertyCard[] getCards();

	//this removes certain card from the list 
	public IPropertyCard remove(IPropertyCard p);

	//this transacts money in or out of the account and returns the new amount
	public Double transact(Double d);

	//this returns the current amount of money
	public Double getMoney();

	//this keeps track whehter it's this player's turn
	public void setTurn(boolean b);

	//this returns if it's his turn
	public boolean getTurn();

	//this lets palyer buy and it adds to the list
	public void buy(IPropertyCard p);

	//each player would have a IPiece which would repesent each player on the board and will have the same position
}