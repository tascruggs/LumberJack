package main;

import java.util.ArrayList;

public class InventoryManager {

	ArrayList<Lumber> inv;		//Inventory; Lumber with specific dimensions are held with their quantities
	double scrap;

	//Constructor
	public InventoryManager(){
		this.inv = new ArrayList<Lumber>();
		this.scrap = 0.0;
	}

	//Compare lumber to see if they match dimensions.
	public boolean compLumber(Lumber a, Lumber b){
		if(a.width == b.width && a.height == b.height && a.length == b.length)
			return true;
		else
			return false;
	}

	//Add lumber to inventory
	public void addInv(ArrayList<Lumber> lumber){
		boolean match = false;
		if(inv.isEmpty()){	//If inv is empty, add all lumber to inv
			for(int i = 0; i < lumber.size(); i++){
				inv.add(lumber.get(i));
			}
		}
			//compare lumber to inv, if dimensions match, add quantity to inv
			for(int i = 0; i < lumber.size(); i++){
				for(int j = 0; j < inv.size(); j++){
					match = false;
					if(compLumber(lumber.get(i), inv.get(j))){
						inv.get(j).quantity += lumber.get(i).quantity;
						match = true;
						break;
					}
					if(!match)	//lumber dimensions not found in inv, add to inv
						inv.add(lumber.get(i));
				}
			}
	}

	//Remove lumber in inventory
	public void delInv(ArrayList<Lumber> lumber){
		boolean match = false;
		if(inv.isEmpty()){	//If inv is empty, return error message.
			System.out.println("Error: The inventory is currently empty.");
		}
			//compare lumber to inv, if dimensions match, add quantity to inv
			for(int i = 0; i < lumber.size(); i++){
				for(int j = 0; j < inv.size(); j++){
					match = false;
					if(compLumber(lumber.get(i), inv.get(j))){
						if(inv.get(j).quantity < lumber.get(i).quantity){
							System.out.println("Error: Amount in inventory: "+inv.get(j).quantity+"\nRequested amount: "+lumber.get(i).quantity);
						}
						else{
							inv.get(j).quantity -= lumber.get(i).quantity;
						}
						match = true;
						break;
					}
					if(!match)	//lumber dimensions not found in inv
						System.out.println("Error: Item not found in inventory.");
				}
			}
	}

	//Check inventory stock for customer order
	public void checkInv(){

	}

	//Get/set scrap
	public double getScrap(){return scrap;}
	public void setScrap(double s){scrap = s;}

	//Print master inventory report
	public void printReport(){

	}

}
