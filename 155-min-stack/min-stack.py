from queue import LifoQueue



class MinStack:

    def __init__(self):
        self.queue = LifoQueue()
        self.minimum = LifoQueue()

    def push(self, val: int) -> None:
        self.queue.put(val)
        if self.minimum.empty():
            self.minimum.put(val)
        else:
            last = self.peekMin()
            newmin = min(last, val)
            self.minimum.put(newmin)

    def pop(self) -> None:
        if not self.queue.empty():
            self.queue.get()
            self.minimum.get()

    def top(self) -> int:
        return self.peek()

    def getMin(self) -> int:
        return self.peekMin()

    def peek(self) -> int:
        if not self.queue.empty():
            peeked = self.queue.get()
            self.queue.put(peeked)
            return peeked
        else:
            return None

    def peekMin(self) -> int:
        if not self.minimum.empty():
            peeked = self.minimum.get()
            self.minimum.put(peeked)
            return peeked
        else:
            return None



# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()