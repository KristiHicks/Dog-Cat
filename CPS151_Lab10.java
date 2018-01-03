// CPS151_Lab10.java
// Kristi Hicks, hicksk2
import java.util.*;

public class CPS151_Lab10 {
	public static void main(String[] args){
		
	      ArrayList<Speakable> dogcatList = new ArrayList<>();
	      dogcatList.add(new Dog("Fred"));
	      dogcatList.add(new Cat("Wanda"));
	      for (Speakable s : dogcatList)
	      {
	         s.speak();
	      }
	}
}
/*
*
* Name: Kristi Hicks
* User Name: hicksk2
* Assignment: Lab Project 10
*
* Description:
*   This program creates a dog and a cat object. It then calls for them to speak.
*   
* Bug Report:
*   None.
*/