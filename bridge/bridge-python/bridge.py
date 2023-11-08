from abc import ABC, abstractmethod

class PaymentSystem(ABC):
    @abstractmethod
    def process_payment(self, amount):
        pass

class Paypal(PaymentSystem):
    def process_payment(self, amount):
        print(f'Processing payment of {amount} through Paypal')

class CreditCard(PaymentSystem):
    def process_payment(self, amount):
        print(f'Processing payment of {amount} through Credit Card')

class Booking(ABC):
    def __init__(self, payment_system):
        self.payment_system = payment_system

    @abstractmethod
    def book(self, amount):
        pass

class HotelBooking(Booking):
    def book(self, amount):
        print(f'Booking hotel for {amount}')
        self.payment_system.process_payment(amount)


def client_code(booking: Booking, amount):
    booking.book(amount)


paypal = Paypal()
booking = HotelBooking(paypal)
client_code(booking, 200)

credit_card = CreditCard()
booking = HotelBooking(credit_card)
client_code(booking, 200)