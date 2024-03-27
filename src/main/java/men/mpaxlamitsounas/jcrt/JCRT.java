package men.mpaxlamitsounas.jcrt;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import men.mpaxlamitsounas.jcrt.proxy.CommonProxy;

@Mod(modid = Tags.MODID, name = Tags.MODNAME, version = Tags.VERSION)
public class JCRT {

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
