package mainPlugin;

import java.util.logging.Logger;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import serverComunication.serverMain;

public class Main extends JavaPlugin implements Listener{
	public final Logger logger = Logger.getLogger("Minecraft");
	public String secondMessage = "Hola 2";
	
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " is Enable!");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " is Disable!");
	}
	
	@EventHandler
	public void onPlayerLogin(PlayerMoveEvent e) {
		Player player = e.getPlayer();
		
		serverMain.loginToServer(player);
	}
	
}//END Line