import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

		@Override
		public void onEnable() {
		
			this.getCommand("crasher").setExecutor(new Command_Crash());
		}
	}