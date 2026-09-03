import java.util.Scanner;
class Date{
	int day;
	int month;
	int year;
	String timezone;
	Scanner sc=new Scanner(System.in);
	Date(){
		this.day=this.month=this.year=0;
	}
	Date(int d,int m){
		this.day=d;
		this.month=m;
	}
	Date(int d,int m,int y){
		this.day=d;
		this.month=m;
		this.year=y;
	}
	void setDay(){
		System.out.print("\nEnter the day: ");
		int d=sc.nextInt();
		this.day=d;
	}
	void setMonth(){
		System.out.print("\nEnter the month: ");
                int m=sc.nextInt();
                this.month=m;
	}
	void setYear(){
		System.out.print("\nEnter the year: ");
                int y=sc.nextInt();
                this.year=y;
	}
	int getDay(){
		return this.day;
	}
	int getMonth(){
		return this.month;
	}
	int getYear(){
		return this.year;
	}
	void getDate(){
		System.out.printf("\nThe date is: %d/%d/%d",this.day,this.month,this.year);
	}
}
class TestDate{
	public static void main(String args[]){
	Date dt=new Date(3,9,2026);
	dt.getDate();
	dt.setDay();
	dt.setMonth();
	dt.setYear();
	dt.getDate();
	}
}
