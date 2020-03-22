import commands.Calculate;
import events.CategoryCreate;
import events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
	
	public static void main(String[] args) throws Exception {
		
		JDA jda = new JDABuilder("NjkwNjYxOTc1OTIyOTY2NTMx.XnUwGA.uy1rNBz4n1Do6DQSjW9VvpnFVQQ").build();
		
		jda.addEventListener(new HelloEvent());
		
		jda.addEventListener(new CategoryCreate());
		
		jda.addEventListener(new Calculate());
		
	}

}
