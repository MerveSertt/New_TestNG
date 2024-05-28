package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
    @DataProvider
    public Object[][] sehirVerileri() {
        return new Object[][]{{"Ankara","IcAnadol","06"},
                {"Izmir","Ege","35"},
                {"Diyarbakır","Dogu","21"}};
    }
}
