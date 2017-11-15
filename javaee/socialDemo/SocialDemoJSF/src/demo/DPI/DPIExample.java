package demo.DPI;

public class DPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DPIExample dpi = new DPIExample();
		
		dpi.testDPI();
	}
	
	
	/*@Inject
	private UserService userService;*/
	
	public void testDPI() {
		User user = new User();
		UserService userService = new UserService(user);
		
		userService.login();
		
		userService.logout();
		
	}
}
