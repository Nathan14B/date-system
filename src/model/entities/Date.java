package model.entities;

import model.exceptions.InvalidDateException;

public class Date {
	private byte day;
	private byte month;
	private short year;
	
	public Date(byte day, byte month, short year) {
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12:
				if (day > 31) {
					throw new InvalidDateException("January, March, May, July, August, October and December cannot have more than 31 days!");
				}
			
			case 4, 6, 9, 11:
				if (day > 30) {
					throw new InvalidDateException("April, June, September and November can have no more than 30 days!");
				}
			    
			case 2:
				if (day > 29) {
					throw new InvalidDateException("February can have no more than 29 days!");
				}
				
			default:
				if (day < 1 || month < 1 || year < 1) {
					throw new InvalidDateException("Date values cannot be null or negative!");
				}
				
				if (month > 12) {
					throw new InvalidDateException("The month cannot be longer than twelve!");
				}	
		}
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(int day, int month, int year) {
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12:
				if (day > 31) {
					throw new InvalidDateException("January, March, May, July, August, October and December cannot have more than 31 days!");
				}
		
			case 4, 6, 9, 11:
				if (day > 30) {
					throw new InvalidDateException("April, June, September and November can have no more than 30 days!");
				}
		    
			case 2:
				if (day > 29) {
					throw new InvalidDateException("February can have no more than 29 days!");
				}
			
			default:
				if (day < 1 || month < 1 || year < 1) {
					throw new InvalidDateException("Date values cannot be null or negative!");
				}
			
				if (month > 12) {
					throw new InvalidDateException("The month cannot be longer than twelve!");
				}	
		}
		
		this.day = (byte) day;
		this.month = (byte) month;
		this.year = (short) year;
	}
	
	public byte getDay() {
		return day;
	}
	
	public void setDay(byte day) {
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12:
				if (day > 31) {
					throw new InvalidDateException("January, March, May, July, August, October and December cannot have more than 31 days!");
				}
		
			case 4, 6, 9, 11:
				if (day > 30) {
					throw new InvalidDateException("April, June, September and November can have no more than 30 days!");
				}
		    
			case 2:
				if (day > 29) {
					throw new InvalidDateException("February can have no more than 29 days!");
				}
			
			default:
				if (day < 1) {
					throw new InvalidDateException("The day cannot be less than one!");
				}	
	}
		
		this.day = day;
	}
	
	public byte getMonth() {
		return month;
	}
	
	public void setMonth(byte month) {
		if (month < 1) {
			throw new InvalidDateException("The month cannot be null or negative!");
		}
		
		if (month > 12) {
			throw new InvalidDateException("The month cannot be longer than twelve!");
		}
		
		this.month = month;
	}
	
	public short getYear() {
		return year;
	}
	
	public void setYear(short year) {
		if (year < 1) {
			throw new InvalidDateException("The year cannot be null or negative!");
		}
		
		this.year = year;
	}
	
	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}
