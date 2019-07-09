import org.springframework.beans.factory.annotation.Autowired;

public class Samsung 
{
	@Autowired
	MobileProcessor cpu;
	
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}



	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}



	public void config()
	{
		System.out.println("This is OctaCore, 8gb ram,24MP camera");
		cpu.process();
		
	}

}
