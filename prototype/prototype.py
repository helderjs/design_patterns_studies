import copy

class Prototype():
    def clone(self):
        raise NotImplementedError("The method was not implemented")

class SomePrototype(Prototype):
    
    def __init__(self, *args, **kwargs):
        self.attr1 = 1
        self.attr2 = 2

    def clone(self):
        return copy.deepcopy(self)


someInstance = SomeProtype()

someOtherInstance = someInstance.clone()
