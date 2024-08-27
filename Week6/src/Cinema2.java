public class Cinema {
    private boolean[][] seats;

    public Cinema(boolean[][] seats) {
        this.seats = seats;
    }

    public Boolean isReserved(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
            return null;
        }
        return seats[row][col];
    }
}
