public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize; 

    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;

        Heap = new int[this.maxsize];
    }

    // return position of selected node's parent
    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    // return position of selected node's left child
    private int leftChild(int pos) {
        return (2 * pos) + 1;
    }

    // return position of selected node's right child
    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    // return true if selected node is leaf
    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
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
    private void maxHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]) {
                if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }

    // insert a node into the heap
    public void insert(int element) {
        Heap[size] = element;
        int current = size;

        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    // remove and return the maximum element from the heap
    public int remove() {
        int popped = Heap[0];
        Heap[0] = Heap[size--];
        maxHeapify(0);
        return popped;
    }

    public int peek() {
        return Heap[0];
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i + 1] + " RIGHT CHILD : " + Heap[2 * i + 2]);
            System.out.println();
        }
    }

}
