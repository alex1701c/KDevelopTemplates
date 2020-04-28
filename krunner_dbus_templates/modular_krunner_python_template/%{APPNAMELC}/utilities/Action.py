class Action:
    """ The intention of this class is to make it easier to handle the matches, it is not essential"""
    id = ''
    text = ''
    icon = ''

    def to_tupel(self) -> ():
        return self.id, self.text, self.icon
