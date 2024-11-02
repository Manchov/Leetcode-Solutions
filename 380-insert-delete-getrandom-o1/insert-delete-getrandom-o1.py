class RandomizedSet:

    def __init__(self):
        self.random_set = list()
        self.random_dict = dict()

    def insert(self, val: int) -> bool:
        if val not in self.random_dict:
            self.random_set.append(val)
            self.random_dict[val]=len(self.random_set)-1
            return True
        else:
            return False

    def remove(self, val: int) -> bool:
        if val not in self.random_dict:
            return False
        else:
            self.random_set[self.random_dict[val]],self.random_dict[self.random_set[-1]]=self.random_set[-1],self.random_dict[val]
            self.random_set.pop()
            del self.random_dict[val]
            return True

    def getRandom(self) -> int:
        return random.choice(self.random_set)


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()