from abc import ABC, abstractmethod


class HotelBooking(ABC):
    @abstractmethod
    def book(self):
        pass


class DeluxeRoomBooking(HotelBooking):
    def book(self):
        return "Deluxe Room has been booked."


class SuiteRoomBooking(HotelBooking):
    def book(self):
        return "Suite Room has been booked."


class HotelFactory(ABC):
    @abstractmethod
    def create_booking(self):
        pass


class DeluxeRoomFactory(HotelFactory):
    def create_booking(self):
        return DeluxeRoomBooking()


class SuiteRoomFactory(HotelFactory):
    def create_booking(self):
        return SuiteRoomBooking()


class HotelBookingClient:
    def __init__(self, factory):
        self.factory = factory

    def book_room(self):
        booking = self.factory.create_booking()
        result = booking.book()
        return result


deluxe_factory = DeluxeRoomFactory()
client = HotelBookingClient(deluxe_factory)
print(client.book_room())

suite_factory = SuiteRoomFactory()
client = HotelBookingClient(suite_factory)
print(client.book_room())