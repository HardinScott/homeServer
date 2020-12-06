public abstract class Event {

    private int schedule;
    private EventType type;

    public Event(int schedule, EventType type){
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

    public abstract boolean condition();

}
