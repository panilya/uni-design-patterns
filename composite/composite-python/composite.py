from abc import ABC, abstractmethod

class Component(ABC):

    @abstractmethod
    def operation(self) -> str:
        pass

class Room(Component):
    def __init__(self, name: str) -> None:
        self._name = name

    def operation(self) -> str:
        return self._name

class Composite(Component):

    def __init__(self) -> None:
        self._children = []

    def add(self, component: Component) -> None:
        self._children.append(component)

    def remove(self, component: Component) -> None:
        self._children.remove(component)

    def operation(self) -> str:
        results = []
        for child in self._children:
            results.append(child.operation())
        return f"Branch({'+'.join(results)})"

class Hotel(Composite):
    def operation(self) -> str:
        results = super().operation()
        return f"Hotel: Rooms({results})"


if __name__ == "__main__":
    hotel = Hotel()

    room1 = Room("Room 101")
    room2 = Room("Room 102")
    room3 = Room("Room 103")

    hotel.add(room1)
    hotel.add(room2)
    hotel.add(room3)

    print(hotel.operation())