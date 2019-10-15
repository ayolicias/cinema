package bookings;

import java.util.Objects;

public class CinemaBooking {
//    int row;
//    int seat;

  public boolean isSeatBooked(int row, int seat){
      String[][] arr = new String[9][8];

      if (arr[row][seat].equals("x")){

          return true;
      }

      else{
          return false;
      }
    }

    public boolean bookSea(int row, int seat){
      String[][] arr = new String[9][8];
      if (arr[row][seat].equals("#")){
          return true;
      }
      else {
          return false;
      }
    }

    public static void main(String[] args) {
        String booked;
        String noneBooked;
        System.out.println();
    }
}
