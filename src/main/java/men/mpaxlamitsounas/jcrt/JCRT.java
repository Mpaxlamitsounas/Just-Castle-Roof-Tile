package men.mpaxlamitsounas.jcrt;

import men.mpaxlamitsounas.jcrt.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = JCRT.MODID, name = JCRT.NAME, version = JCRT.VERSION)
public class JCRT {
    public static final String MODID = "jcrt";
    public static final String NAME = "Just Castle Roof Tile";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide = "men.mpaxlamitsounas.jcrt.proxy.ClientProxy",
            serverSide = "men.mpaxlamitsounas.jcrt.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JCRT instance;

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }
}
