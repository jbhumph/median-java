public class MaxHeap {
    // Member variables of this class
    private int[] Heap;
    private int size;
    private int maxsize;
 
    // Initializing front as static with unity
    private static final int FRONT = 1;
 
    // Constructor of this class
    public GFG(int maxsize)
    {
 
        // This keyword refers to current object itself
        this.maxsize = maxsize;
        this.size = 0;
 
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }   
}
