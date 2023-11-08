class HotelBookingInterface:
    def book_room(self, room_type: str):
        pass

class HotelBookingSystem(HotelBookingInterface):
    def __init__(self):
        self._availability = {"Single": 5, "Double": 3, "Deluxe": 2}

    def book_room(self, room_type: str):
        if self._availability[room_type] > 0:
            self._availability[room_type] -= 1
            print(f"{room_type} room booked successfully.")
        else:
            print(f"No {room_type} rooms available.")

class HotelBookingProxy(HotelBookingInterface):
    def __init__(self):
        self._hotel_booking = None

    def book_room(self, room_type: str):
        if not self._hotel_booking:
            self._hotel_booking = HotelBookingSystem()
        self._hotel_booking.book_room(room_type)

proxy = HotelBookingProxy()
proxy.book_room("Single")
proxy.book_room("Double")
proxy.book_room("Deluxe")
proxy.book_room("Single")
proxy.book_room("Single")
proxy.book_room("Single")