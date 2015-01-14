class Observer():
	def update(self):
		raise NotImplementedError("The method was not implemented")


class Observable():
	def registerObserver(self, o):
		raise NotImplementedError("The method was not implemented")

	def removeObserver(self, o):
		raise NotImplementedError("The method was not implemented")

	def _notify(self):
		raise NotImplementedError("The method was not implemented")

	def observed(self, method):
		def decorator(*args, **kwargs):
			self._notify(*args, *kwargs)
			return method(*args, **kwargs)
		return decorator


class ObservableEvent():
	def __init__(self, data):
		self.data = data

	def getData(self):
		return self.data

	def setData(self, data):
		self.data = data


class Subject(Observable):
	def __init__(self):
		self.observers = {}

	def registerObserver(self, o):
		self.observers[o.id] = o

	def removeObserver(self, o):
		self.observers.pop(o.id, 0)

	def _notify(self, e):
		for o in self.observers.itervalues():
			o.update(ObservableEvent(e))

    @self.observed
	def someOperation(self, some_command):
		return 'executed ' + some_commad


class SomeObserver(Observer):
	def update(self, e):
		print(e.getData())

