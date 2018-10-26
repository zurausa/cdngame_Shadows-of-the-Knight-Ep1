import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        int left = 0;
        int right = W;
        int top = 0;
        int bottom = H;

        // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

        String bombDir;
        // game loop
        while (true) {
        	bombDir = in.next();
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if(bombDir.contains("R")){
            	left = X0;
            	X0 = (int)Math.floor((left+right)/2);
            }else if(bombDir.contains("L")){
            	right = X0;
            	X0 = (int)Math.floor((left+right)/2);
            }
            if(bombDir.contains("U")){
            	bottom = Y0;
            	Y0 = (int)Math.floor((top+bottom)/2);
            }else if(bombDir.contains("D")){
            	top = Y0;
            	Y0 = (int)Math.floor((top+bottom)/2);
            }

            // the location of the next window Batman should jump to.
            System.out.println(X0 + " " + Y0);
        }
    }
}