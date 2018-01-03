/**
 * CPS 151, Section 02
 * 
 * Fall 2016
 * 
 * Lab Project 10
 * 
 * Cat object class
 * 
 * @author
 * Kristi Hicks, hicksk2
 */
public class Cat implements Speakable
{
   private String name;

   public Cat(String name)
   {
      this.name = name;
   }

   public void speak()
   {
     System.out.println("Meow! Meow!");
   }

   @Override
   public String toString()
   {
      return "Cat:  " + name;
   }
} // end class Cat
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

