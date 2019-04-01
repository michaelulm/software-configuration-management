package at.fhj.iit;

/**
 * Stack Implementation of <code>Stack</code> Interface.
 * supports String Values and can be initialized with a maximum number
 * of items.
 * 
 * @author Michael Ulm
 * @version 1.0
 * 
 * @see Stack
 */
public class StringStack implements Stack
{
	/**
	 * stores the string values of this stack
	 */
    private String[] elementData;
    
    /**
     * is the position counter of the top item
     */
    private int elementCount;
    
    
    /**
     * Constructor that initializes the stack with the given size.
     *
     * @param capacity	the size of the initialized stack. 
     * 					If the size is lower than 0,
     *  				the Constructor will throw an exception
     */
    public StringStack(int capacity)
    {
        if(capacity <= 0)
            throw new IllegalArgumentException("size <= 0");
     
        elementData = new String[capacity];
        elementCount = 0;
    }
    
    @Override
	public boolean isEmpty() 
    {
    	// if the array is empty returns true, otherwise their are elements and returns false
        return (elementCount == 0);
    }
    
    @Override
	public void push(String item)
    {
        if(elementCount == elementData.length)
            throw new IllegalStateException();
        
        // add element to array and increment the counter
        elementData[elementCount++] = item;
    }
    
    @Override
	public String pop()
    {
        if(elementCount == 0)
            throw new IllegalStateException();
        
        //returns the element and decrement the counter
        return elementData[--elementCount];
    }    
}
