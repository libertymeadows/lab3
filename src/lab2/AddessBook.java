package lab2;

import java.util.ArrayList;

public class AddessBook {
	
	private ArrayList<BuddyInfo> buddyInfo;
	
	AddessBook()
	{
		buddyInfo = new ArrayList<BuddyInfo>();
	}
		
	public void addBuddy(BuddyInfo aBud) {
		if(aBud != null)
		{
			buddyInfo.add(aBud);
		}
	}
	
	public void removeBuddy(int index) {
		if(index >= 0 && index < buddyInfo.size())
		{
			buddyInfo.remove(index);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
			
	}
}
