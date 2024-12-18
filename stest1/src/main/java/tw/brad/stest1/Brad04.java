package tw.brad.stest1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/brad04")
@RestController
public class Brad04 {

	@RequestMapping("/m1")
	public String m1(@RequestParam(required = false, defaultValue = "0") Integer x, 
			@RequestParam(required = false, defaultValue = "0") Integer y) {
		System.out.println("OK");
		int r = x + y;
		
		return String.format("%d + %d = %d", x, y, r);
	}
	
}
