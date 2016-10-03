package main;

public class Log{

	double width;
	double height;
	double length;
	double volume;

	public Log(double w, double h, double l){
		width = w;
		height = h;
		length = l;
		volume = width*height*length;
	}
}