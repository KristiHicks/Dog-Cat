/**
 * CPS 151, Section 02
 * 
 * Fall 2016
 * 
 * Lab Project 10
 * 
 * Dog object class
 * 
 * @author
 * Kristi Hicks, hicksk2
 */
public class Dog implements Speakable
{
   private String name;

   public Dog(String name)
   {
      this.name = name;
   }

   public void speak()
   {
     System.out.println("Woof! Woof!");
   }

   @Override
   public String toString()
   {
      return "Dog:  " + name;
   }
} // end class Dog
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
