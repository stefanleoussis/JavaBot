package events;

import net.dv8tion.jda.api.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CategoryCreate extends ListenerAdapter {

		
	public void onCategoryCreate(CategoryCreateEvent e) {
			
			e.getGuild().getDefaultChannel().sendMessage("Someone just created a Category").queue();
		
		}
}
