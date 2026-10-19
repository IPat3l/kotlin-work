# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
from point import Point

def main():
    p = Point(3, 4)
    q = Point(5, -2)

    print(p)
    print(p.distance())

    print(p.distanceTo(q))

main()