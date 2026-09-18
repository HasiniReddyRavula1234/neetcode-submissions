class PrefixTree:
    
    def __init__(self):
        self.prefix = []
        
    def insert(self, word: str) -> None:
        self.prefix.append(word)


    def search(self, word: str) -> bool:
        if word in self.prefix:
            return True
        else:
            return False        

    def startsWith(self, prefix1: str) -> bool:
        for word in self.prefix:
            if word.startswith(prefix1):
                return True
        return False

        
        