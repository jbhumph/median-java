public class MinHeap {
    
    private int[] Heap;
    private int size;
    private int maxsize;
 
    // Initializing front as static with unity
    private static final int FRONT = 1;
 
    public MinHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
 
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    // return position of selected node's parent
    private int parent(int pos) {
        return pos / 2;
    }

    // return position of selected node's left child
    private int leftChild(int pos) {
        return (2 * pos);
    }

    // return position of selected node's right child
    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    // return true if selected node is leaf
    private boolean isLeaf(int pos) {
        if (pos > (size / 2)) {
            return true;
        }
        return false;
    }

    // swap two nodes of the heap
    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    // heapify the node at pos
    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    // insert a node into the heap
    public void insert(int element) {
        Heap[++size] = element;
        int current = size;

        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // remove and return the minimum element from the heap
    public int remove() {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
        return popped;
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

}
