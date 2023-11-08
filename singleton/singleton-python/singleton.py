class Singleton:
    __instance = None

    @staticmethod
    def getInstance():
        if Singleton.__instance == None:
            Singleton()
        return Singleton.__instance

    def __init__(self):
        if Singleton.__instance != None:
            raise Exception("This is a singleton class!")
        else:
            Singleton.__instance = self

class HotelBookingSystem:
    hotel_booking_system = Singleton.getInstance()

    def __init__(self):
        self.hotel_list = []

    def add_hotel(self, hotel):
        self.hotel_list.append(hotel)

    def delete_hotel(self, hotel):
        self.hotel_list.remove(hotel)

    def list_hotels(self):
        return self.hotel_list

booking_system1 = HotelBookingSystem()
booking_system2 = HotelBookingSystem()

booking_system1.add_hotel("Hotel A")
booking_system1.add_hotel("Hotel B")
print(booking_system1.list_hotels())

booking_system2.delete_hotel("Hotel A")
print(booking_system2.list_hotels())