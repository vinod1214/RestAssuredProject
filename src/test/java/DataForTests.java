import org.testng.annotations.DataProvider;

public class DataForTests {

	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost() {
//		Object [][] data = new Object[2][3];
//		data[0][0] = "deepthi";
//		data[0][1] = "gopal";
//		data[0][2] = 3;
//		
//		data[1][0] = "munirathnam";
//		data[1][1] = "singiri";
//		data[1][2] = 4;
//		return data;
		return new Object[][] {
			{"kumuda","srikanth",4},
			{"deviprasad","rath",4}
		};
	}
	
	@DataProvider(name = "DataToDelete")
	public Object[] dataToDelete() {
		return new Object[] {
				5,6,7,8
		};
	}
	
}
