package decorator.filedecorators;

import java.nio.charset.StandardCharsets;

public class UTF8Decorator extends DataSourceDecorator {

    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // Convert data to UTF-8 encoded string before writing
        byte[] utf8Bytes = data.getBytes(StandardCharsets.UTF_8);
        String utf8String = new String(utf8Bytes, StandardCharsets.UTF_8);
        super.writeData(utf8String);
    }

    @Override
    public String readData() {
        // Ensure the string read is interpreted as UTF-8
        String data = super.readData();
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
