import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Phone extends Event<String> {
    private String[] conditionArgs;

    public Phone(int schedule, EventType type, Handler handler, String[] conditionArgs) {
        super(schedule, type, handler);
        setConditionArgs(conditionArgs);
    }

    public void setConditionArgs(String[] conditionArgs) {
        this.conditionArgs = conditionArgs;
    }

    @Override
    public boolean condition() {
        try {
            for (String string : conditionArgs) {
                int timeOut = 5000;
                if (InetAddress.getByName(string).isReachable(timeOut)) {
                    return true;
                }
            }
        } catch (UnknownHostException unknownHostException) {
            return false;
        } catch (IOException ioException) {
            return false;
        }
        return false;
    }
}
