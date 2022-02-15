package lab4;

public class StackOfIntegers {

	private int[] elements;
	private int size;

	public StackOfIntegers() {
		this.size = -1;
		this.elements = new int[16];
	}

	public StackOfIntegers(int size) {
		this.elements = new int[size];
		this.size = -1;
	}

	public boolean isEmpty() {
		return this.size == -1;
	}

	public int peek() {
		return elements[this.size];
	}

	public void push(int value) {
		this.size++;
		elements[this.size] = value;
	}

	public int pop() {
		int poppedVal = elements[this.size];
		this.size--;
		return poppedVal;
	}

	public int getSize() {
		return this.size;
	}

}
