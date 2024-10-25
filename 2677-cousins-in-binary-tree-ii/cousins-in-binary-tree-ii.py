# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.level = {}
        self.lvlnum = 0

    def cycle(self, root: Optional[TreeNode]):
        if not root:
            return
        else:
            self.lvlnum += 1
            self.level.setdefault(self.lvlnum, 0)
            self.level[self.lvlnum] += root.val
            if root.left is not None:
                self.cycle(root.left)
            if root.right is not None:
                self.cycle(root.right)
            self.lvlnum -= 1

    def cycleSum(self, root: Optional[TreeNode]):
        if not root:
            return 
        else:
            self.lvlnum += 1
            if self.lvlnum < 3:
                root.val = 0
            if root.left is not None and root.right is not None:
                root.left.val = root.right.val = self.level[self.lvlnum+1] - (root.left.val + root.right.val)
                self.cycleSum(root.left)
                self.cycleSum(root.right)
            elif root.right is not None:
                root.right.val = self.level[self.lvlnum+1] - root.right.val
                self.cycleSum(root.right)
            elif root.left is not None:

                root.left.val = self.level[self.lvlnum+1] - root.left.val
                self.cycleSum(root.left)
            self.lvlnum -= 1

    def replaceValueInTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        self.cycle(root)
        self.lvlnum=0
        self.cycleSum(root)
        return root
