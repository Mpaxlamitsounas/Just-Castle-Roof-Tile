package men.mpaxlamitsounas.jcrt;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import men.mpaxlamitsounas.jcrt.blocks.CastleRoofTile;

public class ModBlocks {

    @GameRegistry.ObjectHolder("jcrt:castle_roof_tile")
    public static CastleRoofTile castleRoofTile;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        castleRoofTile.initModel();
    }
}
