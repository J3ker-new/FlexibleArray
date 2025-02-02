package FlexibleArray;

class FlexibleArray {
    private int[] arr;

    // Constructor initializes an empty array
    public FlexibleArray() {
        this.arr = new int[0];
    }

    // Get the element at the specified index
    int get(int index) {
        return this.arr[index];
    }

    // Set the element at the specified index to the given value
    void set(int index, int value) {
        this.arr[index] = value;
    }

    // Get the size of the array
    int size() {
        return this.arr.length;
    }

    // Add a new element to the end of the array
    void add(int value) {
        int[] newArr = new int[this.arr.length + 1];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = this.arr[i];
        }
        newArr[this.arr.length] = value;
        this.arr = newArr;
    }

    // Remove the element at the specified index
    void remove(int index) {
        int[] newArr = new int[this.arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = this.arr[i];
        }
        for (int i = index; i < this.arr.length - 1; i++) {
            newArr[i] = this.arr[i + 1];
        }
        this.arr = newArr;
    }
}