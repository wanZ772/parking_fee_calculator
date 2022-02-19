// coded by wanz
import java.util.*; //  library utk input
public class Main // class utama
{
    public static void calculate_parking_fee(int get_hour)  { // function utk kira parking fee
        double fee; // set variable utk data fee parking
        System.out.println("Parking your hours: " + get_hour);
        if (get_hour <= 3)  { // if else condition utk kira harga ikut jam
            fee = 4;
        }   else if (get_hour < 5 ) {
            fee = 6;
        }   else if (get_hour < 7)  {
            fee = 8.50;
        }   else    {
            fee = 25;
        }
        System.out.print("Your parking fee: " + String.format("%.2f", fee)); // output harga parking
    }
	public static void main(String[] args) { // function utama yg akan execute bila program run
	    Scanner get_data = new Scanner(System.in); // set get_data utk method utk dpt kn data
		System.out.println("Welcome to Parking Fee Calclator System");
		System.out.print("Enter parking hour(s): ");
		int hours = get_data.nextInt(); // dpt kn data (jam parking)
		calculate_parking_fee(hours); // panggil function utk kira harga parking. hours utk argument utk pass data dari function main ke function calculate_parking_fee
	} 
}
