class BasicRoomBooking:
    def __init__(self):
        self._cost = 100
        self._description = "Basic room booking"
    
    def get_cost(self):
        return self._cost

    def get_description(self):
        return self._description


class RoomBookingDecorator:
    def __init__(self, room_booking):
        self._room_booking = room_booking

    def get_cost(self):
        return self._room_booking.get_cost()

    def get_description(self):
        return self._room_booking.get_description()


class BreakfastDecorator(RoomBookingDecorator):
    def __init__(self, room_booking):
        super().__init__(room_booking)
        self._cost = 20
        self._description = " + breakfast"

    def get_cost(self):
        return self._room_booking.get_cost() + self._cost

    def get_description(self):
        return self._room_booking.get_description() + self._description


class AdditionalBedDecorator(RoomBookingDecorator):
    def __init__(self, room_booking):
        super().__init__(room_booking)
        self._cost = 30
        self._description = " + additional bed"

    def get_cost(self):
        return self._room_booking.get_cost() + self._cost

    def get_description(self):
        return self._room_booking.get_description() + self._description


booking = BasicRoomBooking()
print(booking.get_description() + ": $" + str(booking.get_cost()))

booking = BreakfastDecorator(booking)
print(booking.get_description() + ": $" + str(booking.get_cost()))

booking = AdditionalBedDecorator(booking)
print(booking.get_description() + ": $" + str(booking.get_cost()))