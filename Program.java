package main;

import java.io.*;
import java.util.*;

public class Program {

	static ArrayList<Lumber> lumber = new ArrayList<Lumber>();		//Holds lumber cut from logs
	static ArrayList<Log> logs = new ArrayList<Log>();				//Holds logs to be cut
	static InventoryManager inv = new InventoryManager();			//Inventory Manager, handles inventory interactions
	static double valScrap;		//Value of scrap
	static double volScrap;		//Volume of Scrap
	static double weightLum;	//38lbs*ft^3 ft^3=(L*W*H)/12^3
	static int trucks;			//(int)Math.ceil(weightLum/10000)
	static double dist;			//Shipping distance
	static String dest;			//Shipping destination
	static double shipFee;		//Shipping fee = $/mile/truck
	static Date today;			//Date of order (today)

	public static void main(String[]args){

	}

	//Read the input log file
	public static void readLogFile(File file) throws FileNotFoundException{
		logs.clear();		//Wipes previous run
		Scanner scan = new Scanner(file);
		//get values from file
	}

	//Read the input lumber file
	public static void readLumberFile(File file) throws FileNotFoundException{
		lumber.clear();		//Wipes previous run
		Scanner scan = new Scanner(file);
		//get values from file
	}

	//Print report of outcome of cut
	public static void printCut(){
		//Print outcome of each log in table format
		//Print total summary of cut
	}

	//Read customer order file
	public static void fileOrder(File order) throws FileNotFoundException{
		Scanner scan = new Scanner(order);
		//get values from file
		//check inventory stock for order
		//remove present items from inventory
		//calculate shipping cost
		//print bill of sale
	}

	//Customer order through GUI
	public static void guiOrder(){
		//get values from gui
		//check inventory stock for order
		//remove present items from inventory
		//calculate shipping cost
		//print bill of sale
	}

	//Cut maximized value of logs into lumber
	public static void optimizedCut(){
		//do math to find best cut
		//cut logs into lumber
		//add lumber to inventory
	}

	//Calculate Shipping Costs
	public static double calcShipping(double fee){
		//Shipping distance for applicable locations
		switch(dest){
			case "Tifton": dist = 48.5; break;
			case "Nashville": dist = 28; break;
			case "Homerville": dist = 35.1; break;
			case "Pearson": dist = 43.9; break;
			case "Douglass": dist = 58.7; break;
			case "Waycross": dist = 61.9; break;
			case "Fargo": dist = 46.7; break;
			case "Lake City Monticello": dist = 62.2; break;
			case "Tallahassee": dist = 72.9; break;
			case "Thomasville": dist = 43; break;
			case "Jacksonville": dist = 121; break;
			default: dist = 0; break; //If none of the above, shipping is free
		}
		//Calculate number of trucks needed to ship lumber
		trucks = (int)Math.ceil(weightLum/10000);
		return fee*dist*trucks;
	}

	//Print bill of sale
	public static void printBos(){

	}
}
