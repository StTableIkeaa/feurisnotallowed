package feurIsNotAlloweddd;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.interactions.commands.Command;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

import javax.security.auth.login.LoginException;

public class BotStartup {
	
	public static void main(String[] args ) throws LoginException {
		String TOKEN = "MTAwMzcwODg0MzY5NzY0MzY5MA.GI54S3.J3RuHvqNQVRpG3bfOp3_zKW5eVlumgek8YWo-M";
		JDABuilder jda = JDABuilder.createDefault(TOKEN);
									
		jda.setActivity(Activity.playing("Quoi ?"));
		jda.enableIntents(GatewayIntent.GUILD_MEMBERS);
		jda.setMemberCachePolicy(MemberCachePolicy.ALL);
		jda.setStatus(OnlineStatus.ONLINE);
		jda.addEventListeners(new Commands());
		jda.build();
	}
}