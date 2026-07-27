package Collections;
import java.util.*;
enum Color{
	RED,YELLOW,BLUE;
}



public class learnenumSet {
	public static void main(String[] args) {
		System.out.println(Color.RED);
		
		EnumSet<Color> enumSet=EnumSet.allOf(Color.class);
	}

}
