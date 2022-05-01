package genericPacage;
/**
 * Om
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyfileReader  {
	public String getPropertyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream(FrameConstants.Propertyfile_Path);
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty(key);
		
		
	}

}
