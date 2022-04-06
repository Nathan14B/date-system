package model.entities;

public class Date {
	private byte day;
	private byte month;
	private short year;
	
	public Date(byte day, byte month, short year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(int day, int month, int year) {
		this.day = (byte) day;
		this.month = (byte) month;
		this.year = (short) year;
	}
	
	public byte getDay() {
		return day;
	}
	
	public void setDay(byte day) {
		this.day = day;
	}
	
	public byte getMonth() {
		return month;
	}
	
	public void setMonth(byte month) {
		this.month = month;
	}
	
	public short getYear() {
		return year;
	}
	
	public void setYear(short year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}
