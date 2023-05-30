package in.ineuron.BatchUpdateUsingExcelSheet;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectExcel {

	// workbook.<sheetname> represents the table name
	private static final String EXCEL_FILE = "select * from  data1.student";

	public static List<Dao> Select() {
		
		//jdbc:Excel:///location where the file is present
		String url = "jdbc:Excel:///F:\\Java live Class Projects\\Assingn\\Question-13";
		List<Dao> list = new ArrayList();
		try (Connection connection = DriverManager.getConnection(url)) {
			try (PreparedStatement pstmt = connection.prepareStatement(EXCEL_FILE)) {
				try (ResultSet resultSet = pstmt.executeQuery()) {
					while (resultSet.next()) {
						System.out.println(
								resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
						Dao dao = new Dao();
					dao.setSid(resultSet.getInt(1));
					dao.setSname(resultSet.getString(2));
					dao.setSaddress(resultSet.getString(3));
					list.add(dao);
					}
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}

