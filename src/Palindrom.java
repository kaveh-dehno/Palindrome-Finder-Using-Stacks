

/**A program to test whether an expression is a palindrom.
 * @author kaveh DEHNO
 *
 */

import java.util.Scanner;
import java.util.Stack;
  
public class Palindrom
{

  private static Scanner keyboard;
  /**
   * @param args
   */
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    System.out.println("This is a program to test whether a sentence, word or phrase is a palindrom");
    
    System.out.println("\n\nPlease enter an expression: ");
    keyboard = new Scanner(System.in);  //gets the input from the user
    String to_be_checked = keyboard.nextLine();
    System.out.print("\n\nThe entered expression is: " + to_be_checked);
    

      String lower = to_be_checked.toLowerCase(); //sends the expression for verification pf palindrom
      if (!palindrom(lower))
      {
        System.out.println("\n\nThis expression is NOT a palindrom.");
      }
      else
        System.out.println("\n\nThis expression is a palindrom.");
  }
  
  private static boolean palindrom(String expression)
  {
    int numberOfCharacters = expression.length(); //gets the lenght of the expression
    int index = 0;
    char nextCharacter = ' ';
    StackInterface<Character> actualSentenceStack = new OurStack<>();   //creates a stack to hold the actual expression
    StackInterface<Character> reversedSentenceStack = new OurStack<>(); //creates a stack to hold the reversed expression
    StackInterface<Character> tempStack = new OurStack<>(); //creates a stack to hold the temporaray expression
    int numberOfOnlyCharacters = 0;
    int indexReversed = 0;
    char temp = ' ';
    
    System.out.print("\n\nThe actual stack contains: ");
    
    while (index < numberOfCharacters)
    {
      nextCharacter = expression.charAt(index);
      if(Character.isDigit(nextCharacter))
        throw new IllegalStateException("A palindron can not contain a number.");
      else
      {
        switch(nextCharacter)
        {
          case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g': case 'h': case 'i':
          case 'j': case 'k': case 'l': case 'm': case 'n': case 'o': case 'p': case 'q': case 'r':
          case 's': case 't': case 'u': case 'v': case 'w': case 'x': case 'y': case 'z':
            
            actualSentenceStack.push(nextCharacter);
            tempStack.push(nextCharacter);
            numberOfOnlyCharacters++;
            System.out.print(nextCharacter);
            break;
            
          default:
          break;
        }
      }
      index++;
    }
    System.out.print("\nThe reversed stack contains: ");
    while(indexReversed < numberOfOnlyCharacters)
    {
      temp = tempStack.pop();
      System.out.print(temp);
      reversedSentenceStack.push(temp);
      indexReversed++;
    }
    
    int indexCompare = 0;
    char temp1 = ' ';
    char temp2 = ' ';
    boolean result = true;
    
    while(indexCompare < numberOfOnlyCharacters)
    {
      temp1 = actualSentenceStack.pop();
      temp2 = reversedSentenceStack.pop();
      
      if(temp1 != temp2)
      {
        result = false;
        return result;
      }
      indexCompare++;
    }
    
    return result;
//    compare(actualSentenceStack, reversedSentenceStack, numberOfOnlyCharacters);
    
/*    
    while (index < numberOfCharacters)
    {
      nextCharacter = expression.charAt(index);
      
      switch(nextCharacter)
      {
        case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g': case 'h': case 'i':
        case 'j': case 'k': case 'l': case 'm': case 'n': case 'o': case 'p': case 'q': case 'r':
        case 's': case 't': case 'u': case 'v': case 'w': case 'x': case 'y': case 'z':
          
 //         sentenceStack.push(nextCharacter);
          numberOfOnlyCharacters++;
          break;
          
        default:
        break;
      }
      
      index++;
    }
    
    
    System.out.println(numberOfOnlyCharacters);
    if (isEven(numberOfOnlyCharacters))
    {
      System.out.println("This sentence is not a palindrom.");
      return false;
    }
    else
    {
      
      StackInterface<String> sentenceSack = new OurStack<>();
      while(index != theMiddleOfString(numberOfCharacters))
      {
//        sentenceStack.push
      }
      return true;
    }*/
    
  }
  
  private static boolean isEven(int characters)
  {

    
    while(characters > 0)
    {
      characters = characters / 2;
      System.out.print(characters);
    }
    
    if(characters == 0)
      return true;
    else
      return false;
  }
  
  private static int theMiddleOfString(int characters)
  {
    int result = 0;
    
    result = (characters - 1) / 2;
    return result;
  }
  
  private boolean compare(Stack stack1, Stack stack2, int index)
  {
    int indexCompare = 0;
    char temp1 = ' ';
    char temp2 = ' ';
    boolean result = true;
    
    while(indexCompare <= index)
    {
      temp1 = (char) stack1.pop();
      temp2 = (char) stack2.pop();
      
      if(temp1 != temp2)
      {
        result = false;
        return result;
      }
      
    }
    
    return result;
  }
}
