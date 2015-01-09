import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}
public boolean palindrome(String word)
{
  //your code here
  String delims = "[ .,?!']+";
  String[] tokens = word.split(delims);
  String trueSentence = "";
  for(int a = 0; a < tokens.length; a++)
  {
   trueSentence = trueSentence + tokens[a];
  }
  trueSentence = trueSentence.toLowerCase();
  // now have a string called trueSentence that can be reversed
  
  String rever = "";
  for(int a = 0; a < trueSentence.length(); a++)
  {
    rever = rever + trueSentence.substring(trueSentence.length()-a-1,trueSentence.length()-a); 
  }
  if(trueSentence.equals(rever))
  {return true;}
  else
  return false;

  //Character.isLetter()

}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
