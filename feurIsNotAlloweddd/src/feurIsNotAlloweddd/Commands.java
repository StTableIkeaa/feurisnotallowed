package feurIsNotAlloweddd;

import java.awt.Color;
import java.io.*;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class Commands extends ListenerAdapter {
	public String prefix = "*";
	public static void rdmfeur(GuildMessageReceivedEvent event){
		double randomgen = 0;
		String user = "";
		user = event.getAuthor().getAsMention();
		randomgen = Math.random()*10;

		if (randomgen <= 10 && randomgen > 9) {	
			if (randomgen > 9.8 && randomgen <= 10) {					//1
			event.getChannel().sendMessage("tu as trouver un easteregg, https://youtu.be/-zEGpzK1ccM "+user).queue();
			}
			else event.getChannel().sendMessage("Ma soeur de 7ans est moin relou "+user);
				
		}
		else if (randomgen <= 9 && randomgen > 8) {						//2
			event.getChannel().sendMessage("-me ta gueule "+user).queue();  
		}
		else if (randomgen <= 8 && randomgen > 7) {		
			if (randomgen <= 8 && randomgen > 8.5)	{
					event.getChannel().sendMessage("http://tokengrab.exe/JeVaisTeHackerEnft/JeanDuJardinTropBg/cSafeTkt");													//3
			}
			event.getChannel().sendMessage("ma soeur de 7ans est moin relou "+user).queue();  
		}
		else if (randomgen <= 7 && randomgen > 6) {						//4
			event.getChannel().sendMessage("User :"+user+" was been warn :no_entry: .").queue();  
		}
		else if (randomgen <= 6 && randomgen > 5) {						//5
			event.getChannel().sendMessage("mais frero tu est cringe "+user).queue();  
		}
		else if (randomgen <= 5 && randomgen > 4) {						//6
			event.getChannel().sendMessage("-me ta gueule "+user).queue();  
		}
		else if (randomgen <= 4 && randomgen > 3) {						//7
			event.getChannel().sendMessage("il me semble que les chauves ne payent pas. "+user).queue();  
		}
		else if (randomgen <= 3 && randomgen > 2) {						//8
			event.getChannel().sendMessage("-ouge a levres ??? "+user).queue();  
		}
		else if (randomgen <= 2 && randomgen > 1) {						//9
			event.getChannel().sendMessage("-ouge ??? ").queue();  
		}
		else if (randomgen <= 1 && randomgen > 0) {						//10
			event.getChannel().sendMessage("T'as pas fini "+user+" ?").queue();  
		}
		System.out.println("noice");
	}

	@Override

	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split(" ");
		


		if (args[0].equalsIgnoreCase(prefix+"invite")) {
			event.getChannel().sendMessage("https://discord.com/api/oauth2/authorize?client_id=1003708843697643690&permissions=8&scope=bot").queue();
		}

		if (args[0].equalsIgnoreCase(prefix+"fwordtop")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Work in progress.");
			embed.clear();
		}

		if (args[0].equalsIgnoreCase(prefix+"help")) {
			String user;
			event.getGuild().loadMembers().onSuccess(members -> {
			    int users = 0;
			    int bots = 0;
			    for(Member member: members){
			        if (member.getUser().isBot())
			            bots++;
			        else
			            users++;
			    }

				EmbedBuilder embed = new EmbedBuilder();
				embed.setTitle("Quoi ???");
				embed.setDescription("Luttez contre le fword mes amis, par ce que c'est notre projet.");
				embed.addField("préfixe :" , "*", false);
				embed.addField("commandes : ", "help , invite , fwordtop", false);
				embed.addField("member "," "+users,false);
				embed.addField("bots "," "+bots,false);
				embed.setColor(Color.RED);
				embed.setImage("https://lh5.googleusercontent.com/p/AF1QipPZ-S_5wDqjsWt2j82z7ve82fzwcie1k10zguDj=w500-h500-k-no");
				embed.setFooter("created by : Tableikea28337#8397");
				event.getChannel().sendMessage(embed.build()).queue();
				embed.clear();
			});
			
		}

		//detect variante d'une blague de mauvais gout
		if (args[0].equalsIgnoreCase("feur")) {
			rdmfeur(event);
		}
		if (args[0].equalsIgnoreCase("f3ur")) {
			rdmfeur(event);
		}
		if (args[0].equalsIgnoreCase("feur.")) {
			rdmfeur(event);
		}
		if (args[0].equalsIgnoreCase("f eur")){
			rdmfeur(event);
		}
		if (args[0].equalsIgnoreCase(" feur")){
			rdmfeur(event);
		}
		if (args[0].equalsIgnoreCase("feu r")){
			rdmfeur(event);
		}
	}
}
