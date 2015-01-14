interface Observer {
	public void update(ObservableEvent e);
}


interface Observable {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	protected void notify(Event e);
}


interface ObservableEvent {
	public Object getData();
}


class Subject implements Observable {
	protected Vector observers;
	public Subject() {
		observers = new Vector<Observer>();
	}

	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}

	protected void notify(ObservableEvent e) {
		for(o : this.observers) {
			o.update(e)
		}
	}

	public void someOperation(String some_command) {
		this.notify(new SomeStringyEvent(some_command));
	}
}


class SomeObserver implements Observer {
	public void update(ObservableEvent e) {
		system.out.println(e.getData());
	}

}


class SomeStringyEvent implements ObservableEvent {
	String data;
	public SomeStringyEvent(String data) {
		this.setData(data);
	}

	public setData(String data) {
		this.data = data;
	}

	public getData() {
		return this.data;
	}
}