from abc import ABCMeta, abstractmethod

class AbstractFactory(metaclass=ABCMeta):
    @abstractmethod
    def create_hotel(self):
        pass

    @abstractmethod
    def create_booking(self):
        pass


class HotelFactory(AbstractFactory):
    def create_hotel(self):
        return Hotel()

    def create_booking(self):
        return Booking()


class Hotel:
    def __init__(self):
        print("Hotel created")

    def reserve_room(self):
        print("Room reserved")


class Booking:
    def __init__(self):
        print("Booking created")

    def confirm_booking(self):
        print("Booking confirmed")


class HotelBookingSystem:
    def __init__(self):
        self.factory = None

    def set_factory(self, factory):
        self.factory = factory

    def reserve_room(self):
        hotel = self.factory.create_hotel()
        hotel.reserve_room()

    def confirm_booking(self):
        booking = self.factory.create_booking()
        booking.confirm_booking()


if __name__ == "__main__":
    system = HotelBookingSystem()
    factory = HotelFactory()
    system.set_factory(factory)
    system.reserve_room()
    system.confirm_booking()