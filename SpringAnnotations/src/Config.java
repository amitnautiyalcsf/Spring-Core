import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config 
{
	@Bean
	public Samsung getPhone()
	{
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getCPU()
	{
		return new SnapDragon();
	
		
	}

}
