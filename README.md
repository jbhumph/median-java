# Median Finder
Java implementation of a median finder using heap data structures for CS 240

## Author:
John Humphrey

## Contents:

- [Author](#author)
- [Contents](#contents)
- [Overview](#overview)
- [Instructions](#instructions)
- [About](#about)
- [Attributions](#attributions)


## Overview:
This application allows the user to continuously enter numbers and the program will update the median of all numbers entered.


## Instructions:
Simply complile and run `Main.java` directly from your terminal or IDE of choice.


## About
This program was meant to be a simple exploration of heap data structures. I wrote out `MinHeap` and `MaxHeap` data structures for this project. There is also a `Finder.java` class that balances the two heap structures and finds the median number between them both. The process for finding the median is simple and can be seen below:

```
public double findMedian() {
        if (leftHeap.size() == rightHeap.size()) {
            return (leftHeap.peek() + rightHeap.peek()) / 2.0;
        } else if (leftHeap.size() > rightHeap.size()) {
            return leftHeap.peek();
        } else {
            return rightHeap.peek();
        }
    }
```

According to a bit of documentation I was reading, we could just use Java's provided PriorityQueue data structure. However, this doesn't exist as a tree like structure or as a true Heap, so I implemented it in this way.


## Attributions
I based both data structures off of some generic examples from Geeks4Geeks. They were then modified to suit my purposes here. 

- [GeeksforGeeks : Min-Heap](https://www.geeksforgeeks.org/min-heap-in-java/)
- [GeeksforGeeks : Max-Heap](https://www.geeksforgeeks.org/max-heap-in-java/)


