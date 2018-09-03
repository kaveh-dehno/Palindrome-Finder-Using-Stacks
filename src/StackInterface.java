
/**
 * @author kaveh dehno
 *
 */
public interface StackInterface<T>
{
  /** Adds a new entry to the top of the stack
   * @param newEntry is the object to be added to the stack
   */
  public void push(T newEntry);
  
  /** remove the most recent added item of the stack
   * @return the removed item from stack
   * @throws exception if the stack is empty
   */
  public T pop();
  
  /** Retrieves the top most item of the stack
   * @return the top most added item of stack without removing it
   * @throws exceptions if the stack is empty
   */
  public T peek();
  
  /** checks weather the stack is empty
   * @return true if the stack is empty
   */
  public boolean isEmpty();
  
  /** clears the stack completely
   */
  public void clear();
}
