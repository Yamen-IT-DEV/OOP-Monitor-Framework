package centerSystem;

public interface Monitorable {

public void checkStatus() throws DeviceCriticalException;
public void readData() throws DeviceCriticalException;
}
