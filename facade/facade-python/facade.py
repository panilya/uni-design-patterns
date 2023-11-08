class RoomBooking:
    def book_room(self, room_type):
        return f"Room of type '{room_type}' has been booked."

class Payment:
    def make_payment(self, payment_type):
        return f"Payment made with '{payment_type}'."

class CustomerDetails:
    def get_customer_details(self, name, contact):
        return f"Customer details: Name - {name}, Contact - {contact}."

class HotelBookingSystem:
    def __init__(self):
        self.room_booking = RoomBooking()
        self.payment = Payment()
        self.customer_details = CustomerDetails()

    def book_hotel(self, name, contact, room_type, payment_type):
        details = self.customer_details.get_customer_details(name, contact)
        room = self.room_booking.book_room(room_type)
        payment = self.payment.make_payment(payment_type)
        print(details)
        print(room)
        print(payment)


def main():
    hotel_booking_system = HotelBookingSystem()
    hotel_booking_system.book_hotel("John Doe", "1234567890", "Deluxe", "Credit Card")


if __name__ == "__main__":
    main()