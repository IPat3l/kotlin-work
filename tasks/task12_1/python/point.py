# Task 12.1: Point class

from math import sqrt
class Point:
    def __init__(self, initx, inity):
        self.x = initx
        self.y = inity

    def __str__(self):
        return f"({self.x},{self.y})"

    def distance(self):
        return sqrt(self.x**2 + self.y**2)

    def distanceTo(self, q):
        return sqrt((q.x - self.x)**2 + (q.y - self.y)**2)