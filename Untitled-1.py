class Rectangle:
    """
    A class that represents a rectangle and can be iterated over.
    The iteration returns the length, then the width.
    """
    def __init__(self, length: int, width: int):
        """
        Initializes a Rectangle instance with a given length and width.

        Args:
            length (int): The length of the rectangle.
            width (int): The width of the rectangle.
        """
        if not isinstance(length, int) or not isinstance(width, int):
            raise TypeError("Length and width must be integers.")
        self.length = length
        self.width = width
        self._index = 0

    def __iter__(self):
        """
        Returns the iterator object itself.
        """
        self._index = 0  # Reset the iteration state on each new iteration
        return self

    def __next__(self):
        """
        Returns the next value in the iteration, based on the required format.
        """
        if self._index == 0:
            self._index += 1
            return {'length': self.length}
        elif self._index == 1:
            self._index += 1
            return {'width': self.width}
        else:
            raise StopIteration

# --- Sample Program ---

# Create an instance of the Rectangle class
my_rectangle = Rectangle(length=10, width=5)

# Iterate over the rectangle instance using a for loop
print("Iterating over the rectangle:")
for dimension in my_rectangle:
    print(dimension)

# Demonstrate that a second iteration works correctly
print("\nIterating again over the same instance:")
for dimension in my_rectangle:
    print(dimension)

# Example with different values
another_rectangle = Rectangle(length=20, width=8)
print("\nIterating over another rectangle:")
for dimension in another_rectangle:
    print(dimension)