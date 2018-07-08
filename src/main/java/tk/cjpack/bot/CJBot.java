package tk.cjpack.bot;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;

import static tk.cjpack.bot.CJBot.*;

@Mod(modid = ID, name = NAME, version = VER, acceptedMinecraftVersions = MCVER, acceptableRemoteVersions = "*", serverSideOnly = true)
public class CJBot {

    public static final String ID = "cjbot";
    public static final String NAME = "CJBot";
    public static final String VER = "1.0.0";
    public static final String MCVER = "[1.12.2]";

    @Mod.Instance(ID)
    public static CJBot instance;
    //    public static JDA bot;
    public static Configuration cfg;

//    @Mod.EventHandler
//    public static void onEnable(FMLServerStartingEvent e) {
//        cfg = new Configuration(new File(e.getServer().getDataDirectory(), "cjbot.cfg"));
//        try {
//            bot = new JDABuilder(AccountType.BOT).setStatus(OnlineStatus.ONLINE).setGame(Game.of("Something special is happening soon, I don't know what yet though")).setAutoReconnect(true).addEventListener(new EventListener()).setToken(cfg.getCategory("bot").get("token").getString()).buildBlocking();
//        } catch (LoginException e1) {
//            e1.printStackTrace();
//        } catch (InterruptedException e1) {
//            e1.printStackTrace();
//        } catch (RateLimitedException e1) {
//            e1.printStackTrace();
//        }
//    }
//
//    @Mod.EventHandler
//    public static void onDisable(FMLServerStoppingEvent e) {
//        bot.getPresence().setStatus(OnlineStatus.OFFLINE);
//        bot.shutdownNow();
//    }

}
