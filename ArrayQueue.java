import java.lang.reflect.Array;

public class ArrayQueue {
    private int[] array;
    private int count;

    public ArrayQueue() {
        array = new int[4];
        count = 0;
    }

    // Queue = add method. (Add to back of the line)
    public void queue(int value) {
        if (count == array.length) {
            throw new IllegalStateException();
        }

        array[count] = value;
        count++;
    }

    // Dequeue = remove method. (remove from the front of the line)

    public int dequeue() {
        checkEmpty();
        // variable to store int at front of array
        int popNum = array[0];
        count--;
        shiftArrayForward();

        return popNum;

    }

    // pre-condition, array is not full b/c array is not full.
    private void shiftArrayForward() {
        for (int i = 0; i < count; i++) {
            array[i] = array[i + 1];
        }

    }

    // peek
    public int peek() {
        checkEmpty();

        return array[0];
    }

    private void checkEmpty() {
        if (count == 0) {
            throw new IllegalStateException();
        }
    }

}
