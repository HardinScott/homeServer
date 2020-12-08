public class Main {
    public static void main(String[] args) {
        String[] ips = new String[]{"192.168.1.106", "192.168.1.107"};
        Handler wake = new WakeComputer();
        Event<String> test = new Phone(5, EventType.connection, wake, ips);
        System.out.println(test.condition());
    }
}
