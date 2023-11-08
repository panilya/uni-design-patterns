class PaymentSystem:
    def pay(self, payment_details):
        print(f"Processing payment: {payment_details}")

class HotelBookingSystem:
    def book_room(self, booking_details):
        print(f"Booking room: {booking_details}")

class PaymentSystemAdapter:
    def __init__(self, payment_system):
        self.payment_system = payment_system

    def pay_for_booking(self, payment_details, booking_details):
        self.payment_system.pay(payment_details)
        HotelBookingSystem().book_room(booking_details)

payment_system = PaymentSystem()
adapter = PaymentSystemAdapter(payment_system)
adapter.pay_for_booking("Visa - $200", "Room 101 - 2 nights")