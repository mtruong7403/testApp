 package testApp;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.*;
 
import javax.security.auth.login.*;
 
public class testApp {
 
	public static JDABuilder builder;
 
 
	public static void main(String[] args) throws LoginException {
	
		builder = JDABuilder.createDefault("ODQ4NDk2MDQ1NDAyMDk1NjU2.YLNdhQ.e_k1jLx_Ax-7muA9YWudWFCXQz0");
 
 
		builder.setActivity(Activity.playing("Running tests"));
 
 
		builder.build();
 
 
 
	}
 
}