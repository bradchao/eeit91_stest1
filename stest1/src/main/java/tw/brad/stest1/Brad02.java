package tw.brad.stest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brad02 {

	@Autowired
	private Bike brad1;
	
	@Autowired
	private Bike brad2;
	
	public Brad02() {
		System.out.println("Brad02()");
	}
	
	@RequestMapping("/brad021")
	public String brad021() {
		brad1.upSpeed();
		brad2.upSpeed();
		return null;
	}
	
}
