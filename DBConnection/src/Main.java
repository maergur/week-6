import java.sql.*;
public class Main {
    public static final String url = "jdbc:postgresql://localhost:5432/PatikaDB";
    public static final String user = "postgres";
    public static final String password = "******";

    public static void main(String[] args) {

        String createTable = "CREATE TABLE IF NOT EXISTS Employees ("
                + "id SERIAL PRIMARY KEY,"
                + "name VARCHAR(50) UNIQUE NOT NULL,"
                + "position VARCHAR(50) UNIQUE NOT NULL,"
                + "salary VARCHAR(50) UNIQUE NOT NULL)";;
        String[][] userData = {
                {"James Bond", "Muhasebeci", "50,000 TL"},
                {"Indiana Jones", "Manav", "100,000 TL"},
                {"Batman", "Müdür", "500,000,000 TL"},
                {"Superman", "Futbolcu", "123,123 TL"},
                {"Recep İvedik", "Marangoz", "505,000 TL"}
        };
        String insertDataSQL = "INSERT INTO Employees (name, position, salary) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            // Tabloyu oluşturmak için parametereleri giriyoruz.


            try (PreparedStatement preparedStatement = connection.prepareStatement(createTable)) {

                // SQL komutu ile tabloyu oluşturuyoruz.

                preparedStatement.execute();
                System.out.println("Emloyees tablosu başarıyla oluşturuldu.");
            }
            try (PreparedStatement preparedStatement_2 = connection.prepareStatement(insertDataSQL)) {

                // SQL komutu ile tabloyu oluşturuyoruz.

                for (String[] data : userData) {
                    preparedStatement_2.setString(1, data[0]); // name
                    preparedStatement_2.setString(2, data[1]); // position
                    preparedStatement_2.setString(3, data[2]); // salary

                    // SQL sorgusunu execute et
                    preparedStatement_2.execute();

                }

                System.out.println("Emloyees verileri başarıyla girildi.");
            }

        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}