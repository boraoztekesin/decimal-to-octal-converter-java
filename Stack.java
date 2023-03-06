import java.util.ArrayList;

public class Stack {
   int decimal;
    public Stack(int decimal){
this.decimal=decimal;
    }

    private ArrayList<Integer> nums= new ArrayList<Integer>();

    public int  Top() {
        return nums.get(nums.size() - 1);
    }
    public void calculate_octal(){
        if (decimal == 0) {
            Push(0);
        }
        while (decimal > 0) {
            int digit = decimal % 8;
            Push(digit);
            decimal = decimal / 8;
        }
    }

    public int Pop() {
        int top = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);

        return top;
    }
    public String toString() {
        String h = "";
        while (!isEmpty()) {
            h = h + Pop();
        }
        return h;
    }
    public void Push(int element) {
        nums.add(element);
    }
    public int Size() {
        return nums.size();
    }
    public boolean isEmpty() {
        return nums.isEmpty();
    }
    public boolean isFull() {
        return Size()>=20;
    }
}