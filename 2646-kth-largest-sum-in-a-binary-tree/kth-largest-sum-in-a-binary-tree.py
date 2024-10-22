# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
def findThem(root, level):
    if root != None:
        # print(f"Inspecting {root.val} on level {level}")
        level_dict.setdefault(level, 0)
        level_dict[level] += root.val
        findThem(root.left, level+1)
        findThem(root.right, level+1)

class Solution:
    def kthLargestLevelSum(self, root: Optional[TreeNode], k: int) -> int:
        level = 1
        global level_dict
        level_dict = {}
        findThem(root, level)
        # print(level_dict)
        sorted_dict = sorted(level_dict.items(), key=lambda x: x[1], reverse=True)
        # print(sorted_dict)
        return sorted_dict[k-1][1] if k<=len(sorted_dict) else -1
