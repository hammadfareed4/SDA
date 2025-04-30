package decorator.filedecorators;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nJane Doe,90000";

        DataSource fileDataSource = new FileDataSource("OutputDemo.txt");

        DataSource encoded = new CompressionDecorator(
                                new EncryptionDecorator(
                                new UTF8Decorator(fileDataSource)));

        encoded.writeData(salaryRecords);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);

        System.out.println("- Encoded File ---------");
        System.out.println(fileDataSource.readData());

        System.out.println("- Decoded Output -------");
        System.out.println(encoded.readData());
    }
}
