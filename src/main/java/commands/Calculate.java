package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class Calculate extends ListenerAdapter{

	@Override 
	public void onGuildMessageReceived(GuildMessageReceivedEvent e){

	if(e.getMessage().getContentRaw().equalsIgnoreCase("!calculate")) {
		e.getChannel().sendMessage("This is a Calculation Command").queue();
	}

			
	}
}
