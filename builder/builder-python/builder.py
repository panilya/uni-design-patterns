class RoomBooking:
    def __init__(self):
        self.room_type = None
        self.meal_plan = None
        self.additional_facilities = []

    def __str__(self):
        return f"Room Type: {self.room_type}, Meal Plan: {self.meal_plan}, Additional Facilities: {self.additional_facilities}"


class RoomBookingBuilder:
    def __init__(self):
        self.room_booking = RoomBooking()

    def add_room_type(self, room_type):
        self.room_booking.room_type = room_type
        return self

    def add_meal_plan(self, meal_plan):
        self.room_booking.meal_plan = meal_plan
        return self

    def add_additional_facility(self, facility):
        self.room_booking.additional_facilities.append(facility)
        return self

    def build(self):
        return self.room_booking


class HotelBookingEngine:
    @staticmethod
    def create_booking(room_type, meal_plan, facilities):
        builder = RoomBookingBuilder()
        builder.add_room_type(room_type).add_meal_plan(meal_plan)
        for facility in facilities:
            builder.add_additional_facility(facility)
        return builder.build()


def main():
    booking_engine = HotelBookingEngine()
    booking = booking_engine.create_booking("Deluxe", "Breakfast", ["WiFi", "Swimming Pool"])
    print(booking)


if __name__ == "__main__":
    main()