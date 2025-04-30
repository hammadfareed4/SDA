package decorator.filedecorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
