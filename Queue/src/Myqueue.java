public class Myqueue {
    private String[] elements;
    private int size;
    private int numberOfElements;
    //private int frontElement;
    //private int rearElement;

    public Myqueue(int size) {
        elements = new String[size];

        this.size = size;
        numberOfElements = 0;
    }
    public boolean isEmpty() {

        return numberOfElements == 0;
    }

    public void size() {
        this.size = elements.length;
    }
    public void enqueue(String value) {
        elements[numberOfElements] = value;
        numberOfElements++;
    }
    public void dequeue(String value) {
       elements[numberOfElements] = value;
        numberOfElements++;
    }
    public int getNumberOfElements() {
        return numberOfElements;
    }

    public int getSize() {
        return size;
    }
}
