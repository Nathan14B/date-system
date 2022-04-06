package model.entities;

import model.exceptions.InvalidDateException;

public class Date {
	private byte day;
	private byte month;
	private short year;
	
	public Date(byte day, byte month, short year) {
		if (day < 1 || month < 1 || year < 1) {
			throw new InvalidDateException("Date values cannot be null or negative!");
		}
		
		if (month > 12) {
			throw new InvalidDateException("The month cannot be longer than twelve!");
		}
		
		if (month == 2 && day > 29) {
			throw new InvalidDateException("February can have no more than 29 days!");
		}
		
		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			throw new InvalidDateException("April, June, September and November can have no more than 30 days!");
		}
		
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
			throw new InvalidDateException("January, March, May, July, August, October and December cannot have more than 31 days!");
		}
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(int day, int month, int year) {
		if (day < 1 || month < 1 || year < 1) {
			throw new InvalidDateException("Date values cannot be null or negative!");
		}
		
		if (month > 12) {
			throw new InvalidDateException("The month cannot be longer than twelve!");
		}
		
		if (month == 2 && day > 29) {
			throw new InvalidDateException("February can have no more than 29 days!");
		}
		
		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			throw new InvalidDateException("April, June, September and November can have no more than 30 days!");
		}
		
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
			throw new InvalidDateException("January, March, May, July, August, October and December cannot have more than 31 days!");
		}
		
		this.day = (byte) day;
		this.month = (byte) month;
		this.year = (short) year;
	}
	
	public byte getDay() {
		return day;
	}
	
	public void setDay(byte day) {
		if (day < 1) {
			throw new InvalidDateException("The day cannot be null or negative!");
		}
		
		if (month == 2 && day > 29) {
			throw new InvalidDateException("February can have no more than 29 days!");
		}
		
		if (month == 4 || month == 6 || month == 9 || month == 11 && day > 30) {
			throw new InvalidDateException("April, June, September and November can have no more than 30 days!");
		}
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && day > 31) {
			throw new InvalidDateException("January, March, May, July, August, October and December cannot have more than 31 days!");
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
