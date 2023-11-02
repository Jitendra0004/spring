package com.jitendra.springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // non qualifies abd decapitalized
public class Samsung
{
	@Autowired
	@Qualifier("snapdragen")
	MobileProcessor cpu;
	
      public MobileProcessor getCpu() {
		return cpu;
	}
 	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
    	  System.out.println("Octa Core ,4 gb Ram, 12MP camera");
    	  cpu.process();
      }
}
