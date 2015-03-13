import javax.swing.JOptionPane;

public class MyBotMain {
    
    public static void main(String[] args) throws Exception {
        
    	
        // Now start our bot up.
        MyBot bot = new MyBot();
        
        // Enable debugging output.
        bot.setVerbose(true);
   
        bot.connect("irc.rizon.net");
        bot.joinChannel("#qwertynobles","123");
        bot.setAdm("orc");
        JOptionPane.showMessageDialog(null, "Feche a janela para desconectar o BOT.");
        if (!(JOptionPane.CLOSED_OPTION == 0)) {
        	bot.quitServer();
        	System.exit(0);
        }
       
        
    }
    
    
}