package testApp;



import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;


public class testApp{
   public static JDA jda;
   public static JDABuilder builder;

    public static void main(String[] args) throws LoginException{
        jda = JDABuilder.createDefault("ODQ4NDk2MDQ1NDAyMDk1NjU2.YLNdhQ.sGTmG5IRqXB_Ng0ewNVXnB_QDFI").build();
     
        

        
    }
} 