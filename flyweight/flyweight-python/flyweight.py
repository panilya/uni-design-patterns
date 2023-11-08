class HotelRoom(object):
    _shared_state = {}

    def __init__(self, room_number, room_type):
        self._shared_state = self._shared_state.copy()
        self.room_number = room_number
        self.room_type = room_type

    def __str__(self):
        return f"Room Number: {self.room_number}, Room Type: {self.room_type}"


class RoomFactory:
    _room_dict = {}

    def get_room(self, room_number, room_type):
        key = (room_number, room_type)
        room = self._room_dict.get(key)
        if room is None:
            room = HotelRoom(room_number, room_type)
            self._room_dict[key] = room
        return room


if __name__ == "__main__":
    factory = RoomFactory()

    room1 = factory.get_room(101, "Single")
    room2 = factory.get_room(102, "Double")
    room3 = factory.get_room(101, "Single")

    print(room1)
    print(room2)
    print(room3)

    print(f"room1 and room3 are same? {room1 is room3}")