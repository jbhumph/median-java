public class Finder {
    private MaxHeap leftHeap;
    private MinHeap rightHeap;

    public Finder() {
        leftHeap = new MaxHeap(100);
        rightHeap = new MinHeap(100);
    }

    public void add(int num) {
        if (leftHeap.size() == 0 || num < leftHeap.peek()) {
            leftHeap.insert(num);
        } else {
            rightHeap.insert(num);
        }

        if (leftHeap.size() - rightHeap.size() > 1) {
            rightHeap.insert(leftHeap.remove());
        } else if (rightHeap.size() - leftHeap.size() > 1) {
            leftHeap.insert(rightHeap.remove());
        }
    }

    public double findMedian() {
        if (leftHeap.size() == rightHeap.size()) {
            return (leftHeap.peek() + rightHeap.peek()) / 2.0;
        } else if (leftHeap.size() > rightHeap.size()) {
            return leftHeap.peek();
        } else {
            return rightHeap.peek();
        }
    }
}
