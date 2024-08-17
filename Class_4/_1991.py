from sys import stdin

class Node:
    def __init__(self, value):
        self.left = None
        self.right = None
        self.value = value

class BinaryTree:
    def __init__(self):
        self.nodes = {}

    def add_node(self, value, left, right):
        if value not in self.nodes:
            self.nodes[value] = Node(value)
        node = self.nodes[value]

        if left != ".":
            if left not in self.nodes:
                self.nodes[left] = Node(left)
            node.left = self.nodes[left]

        if right != ".":
            if right not in self.nodes:
                self.nodes[right] = Node(right)
            node.right = self.nodes[right]

    def preorder(self, node):
        if node:
            print(node.value, end="")
            self.preorder(node.left)
            self.preorder(node.right)

    def inorder(self, node):
        if node:
            self.inorder(node.left)
            print(node.value, end="")
            self.inorder(node.right)

    def postorder(self, node):
        if node:
            self.postorder(node.left)
            self.postorder(node.right)
            print(node.value, end="")
        

input = stdin.readline

n = int(input())
tree = BinaryTree()

for _ in range(n):
    value, left, right = input().split()
    tree.add_node(value, left, right)

root = tree.nodes["A"]
tree.preorder(root)
print()
tree.inorder(root)
print()
tree.postorder(root)