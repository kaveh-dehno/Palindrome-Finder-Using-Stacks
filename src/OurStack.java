
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author kaveh DEHNO
 *
 */
public final class OurStack<T> implements StackInterface<T>
{


  private boolean initialized = false;


  
  @SuppressWarnings("rawtypes")
  private Stack newStack;
  
  public OurStack()
  {
    newStack = new Stack<>();
    initialized = true;
  }

  
  
  /* (non-Javadoc)
   * @see StackInterface#push(java.lang.Object)
   */
  @SuppressWarnings("unchecked")
  public void push(T newEntry)
  {
    // TODO Auto-generated method stub
    checkInitialization();
    newStack.push(newEntry);

  }

  /* (non-Javadoc)
   * @see StackInterface#pop()
   */
  @SuppressWarnings("unchecked")
  public T pop()
  {
    // TODO Auto-generated method stub
    checkInitialization();
    if(isEmpty())
    {
      throw new EmptyStackException();
    }
    else
    {
        T oldEntry = (T) newStack.peek();
        newStack.pop();
        return oldEntry;
    }
  }

  /* (non-Javadoc)
   * @see StackInterface#peak()
   */
   
  public T peek()
  {
    // TODO Auto-generated method stub
    checkInitialization();
    if(isEmpty())
    {
      throw new EmptyStackException();
    }
    else
    { @SuppressWarnings("unchecked")
    T topEntry = (T) newStack.peek();
      return topEntry;
    }
  }

  /* (non-Javadoc)
   * @see StackInterface#isEmpty()
   */
  public boolean isEmpty()
  {
    // TODO Auto-generated method stub
    return newStack.empty();
  }

  /* (non-Javadoc)
   * @see StackInterface#clear()
   */
  public void clear()
  {
    // TODO Auto-generated method stub
    while (!isEmpty())
      newStack.pop();

  }
  private void checkInitialization()
  {
    if(!initialized)
      throw new SecurityException("Stack is not initialized " +
    "properly");
  }

}
