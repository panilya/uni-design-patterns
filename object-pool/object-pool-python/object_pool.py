import threading
import random

class HotelRoom(object):
    def __init__(self, room_number):
        self._room_number = room_number

    def __str__(self):
        return f'Room #{self._room_number}'

class HotelRoomPool(object):
    def __init__(self):
        self._available_rooms = set()
        self._in_use_rooms = set()

    def acquire(self):
        if len(self._available_rooms) == 0:
            room = HotelRoom(len(self._in_use_rooms) + 1)
        else:
            room = self._available_rooms.pop()

        self._in_use_rooms.add(room)
        return room

    def release(self, room):
        self._in_use_rooms.remove(room)
        self._available_rooms.add(room)

class BookingThread(threading.Thread):
    def __init__(self, room_pool):
        super().__init__()
        self._room_pool = room_pool

    def run(self):
        room = self._room_pool.acquire()
        print(f'{self.name} acquired {room}')
        threading.Event().wait(random.uniform(1, 3))
        print(f'{self.name} released {room}')
        self._room_pool.release(room)

def main():
    room_pool = HotelRoomPool()

    for _ in range(10):
        BookingThread(room_pool).start()

if __name__ == "__main__":
    main()