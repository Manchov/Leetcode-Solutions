class MyQueue {
    protected int pos;
    protected int spos;
    protected int[] array = new int[100];

    public MyQueue() {
        pos = 0;
        spos = 0;
    }
    
    public void push(int x) {
        array[pos] = x;
        pos++;
    }
    
    public int pop() {
        return array[spos++];
    }
    
    public int peek() {
        return array[spos];
    }
    
    public boolean empty() {
        return (pos-spos==0) ? true:false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
