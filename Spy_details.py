from datetime import datetime

class Spy:

    def __init__(self, name, salutation, age, rating):
        self.name = name
        self.salutation = salutation
        self.age = age
        self.rating = rating
        self.is_online = True
        self.chats = []
        self.current_status_message = None

#for an existing user
spy = Spy('Ritesh', 'Mr.', 20, 4.5)

# chat class
class ChatMessage:
    def __init__(self, name, message):
        self.name = name
        self.message = message
        self.time = datetime.now()






