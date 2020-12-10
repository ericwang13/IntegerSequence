import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
    private int currentIndex;
    private int[] data;

    /*
     * Construct the sequence by copying values from the other array into the data
     * array
     */
    public ArraySequence(int[] other) {
        data = new int[other.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = other[i];
        }

        currentIndex = 0;
    }

    public ArraySequence(IntegerSequence otherseq) {
        data = new int[otherseq.length()];
        int i = 0;
        while (otherseq.hasNext()) {
            data[i] = otherseq.next();
            i++;
        }

        currentIndex = 0;
        otherseq.reset();
    }

    public void reset() {
        currentIndex = 0;
    }

    public int length() {
        return data.length;
    }

    public boolean hasNext() {
        return currentIndex < data.length;
    }

    // @throws NoSuchElementException
    public int next() {
        if (hasNext()) {
            currentIndex++;
            return data[currentIndex - 1];
        } else {
            throw new NoSuchElementException();
        }
    }
}