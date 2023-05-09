package day15;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "firstDataProvider")
    public static Object[][] testDataDummy() {
        Object[][] arr = new Object[3][2];
        arr[0][0] = "200000";
        arr[0][1] = "10";
        arr[1][0] = "300000";
        arr[1][1] = "10";
        arr[2][0] = "400000";
        arr[2][1] = "10";


        return arr;
    }
}
