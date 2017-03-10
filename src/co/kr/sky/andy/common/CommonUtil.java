package co.kr.sky.andy.common;

public class CommonUtil {
	private static CommonUtil _instance;
	
	public int height;
	public int width;

	static {
		_instance = new CommonUtil();
		try {								 
			_instance.height = 	   		0;
			_instance.width = 	   		0;

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static CommonUtil getInstance() {
		return _instance;
	}

	
}
