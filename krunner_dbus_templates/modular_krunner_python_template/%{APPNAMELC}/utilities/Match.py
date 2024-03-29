class Match:
    """The intention of this class is to make it easier to handle the matches, it is not essential"""

    data = ""
    text = ""
    icon = ""
    relevance = 0
    # NoMatch = 0, CompletionMatch = 10, PossibleMatch = 30, InformationalMatch = 50, HelperMatch = 70, ExactMatch = 100
    type = 100
    subtext = ""
    category = ""

    def to_tupel(self) -> ():
        properties = {}
        if self.subtext:
            properties["subtext"] = self.subtext
        if self.category:
            properties["category"] = self.category
        return self.data, self.text, self.icon, self.type, self.relevance, properties
