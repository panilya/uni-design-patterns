import copy

class Hotel:
    def __init__(self, name, location, rooms):
        self.name = name
        self.location = location
        self.rooms = rooms

    def __str__(self):
        return f"{self.name} at {self.location} with {self.rooms} rooms"

    def clone(self):
        return copy.deepcopy(self)


class BookingPrototype:
    def __init__(self, prototype=None):
        self._prototype = prototype

    def register_hotel(self, name, prototype):
        self._prototype[name] = prototype

    def unregister_hotel(self, name):
        del self._prototype[name]

    def clone(self, name):
        return self._prototype[name].clone()


if __name__ == "__main__":
    book_proto = BookingPrototype()

    holiday_inn = Hotel("Holiday Inn", "New York", 50)
    book_proto.register_hotel("Holiday Inn", holiday_inn)

    marriott = Hotel("Marriott", "Los Angeles", 100)
    book_proto.register_hotel("Marriott", marriott)

    cloned_hotel_1 = book_proto.clone("Holiday Inn")
    cloned_hotel_2 = book_proto.clone("Marriott")

    print(cloned_hotel_1)
    print(cloned_hotel_2)