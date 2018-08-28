import cs1.Keyboard;

//You are traveling to King's Island for the day.
//Everyone in the group has agreed to split the cost evenly.
//Write a program to determine the total cost of the trip and the cost per person.
//Assume that each ticket is $32.99


public class KingsIsland
{
	public static void main(String[] args)
	{
		int numPeople;
		double Pcost;
		double Fcost;
		double Tcost;
		double Percost;
		double costPP;
		//Declare variables for the number of people, parking cost, food cost, total cost, cost per person
		{
			System.out.print("Enter number of people: ");//Prompt for and read in the number of people in the group
			numPeople = Keyboard.readInt();

			System.out.print("Enter the cost of parking: $");
			Pcost = Keyboard.readDouble();

			System.out.print("Enter the cost of food: $");
			Fcost = Keyboard.readDouble();

			Tcost = Pcost+ numPeople*32.99 + Fcost;

			System.out.println();

			System.out.println("King's Island Cost Report");

			System.out.print("Total Cost: $");

			System.out.print(Tcost);

			costPP = Tcost/numPeople;

			System.out.print("\nCost per person: $");

			System.out.print(costPP);

			System.out.println();

		}

		//Prompt for and read in the cost of parking


		//Prompt for and read in the amount spent on food


		//Calculate the total expenses


		//Calculate the average per person


		//Display results


	}
}