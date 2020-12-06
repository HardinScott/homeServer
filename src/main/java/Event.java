public abstract class Event {

    private int schedule;
    private EventType type;
    private Handler handler;

    public Event(int schedule, EventType type, Handler handler) {
        setSchedule(schedule);
        setType(type);
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public boolean Handle() {
        return this.handler.Handle();
    }

    public abstract boolean condition();

}
