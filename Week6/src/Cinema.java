
public class Cinema {
	
	final public boolean reserved = true;
	public Boolean seats[][];
	//array
	
	public Boolean isReserved(int row,int col)
	{
		//if row is less than 0 or row is greater than seats length, or column is 
		//less than 0 or column is greater than seat[0] length return null
		//bcuz out of range
	if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) 
	{
    return null;
    }
	
	return seats[row][col];
	}
	
    //------------------------------------------------
	public Cinema(Boolean[][] seats)
	{
	this.seats = seats;
	}
	
	public static void main(String[] args) {
		//setting boolean seat true or false
        Boolean[][] seats = new Boolean[][] {
            {false, false, false},
            {false, false, false},
            {false, false, false}
        };
        //printing value
        Cinema cinema = new Cinema(seats);
        Boolean value = cinema.isReserved(1, 1);
        System.out.println(value);

       
    }
}
