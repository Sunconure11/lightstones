package paperdomo101.lightstones;

//R DZH SVIV
//HFMXLMFIV11
//HKRMLHZFIFH111
//MLGOVTZOGVMWVI
//OVHLERPP
//WZGFIZ
//GSILFTS GSVHV ORMVH R WL WVXIVV
//GSZG YB NVIVOB KFGGRMT NB MZNV RM
//NB RMUOFVMXV TILDH, ZMW GSFH, R YVXLNV RNNLIGZO
//XBYVIMVGRX DVY


//GL HLNV, R ZN YFG Z HSZWV
//YFG SVIV, R VCVIG KLDVI LEVI GSVN
//R NZWV Z XZHGOV SVIV LM GSRH SROO
//ZMW SZEV KFG NB UOZT RM GSV TILFMW
//GSRH RH NB MVD DLIOW


//HSLFOW GSV GIVHKZHHVIH LU GSV LOW DLIOW
//ZIIREV SVIV, YVZIRMT SLHGRORGRVH
//GSVB DROO YV NVG DRGS DIZGS

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import paperdomo101.lightstones.config.LightstonesConfig;
import paperdomo101.lightstones.registry.*;

public class Lightstones implements ModInitializer {

    public static final String MOD_ID = "lightstones";
    public static final ItemGroup LIGHTSTONES = FabricItemGroupBuilder.build(id("lightstones"), () -> new ItemStack(LightstonesItems.LIGHTSTONE));
    public static LightstonesConfig CONFIG;

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }

    @Override
    public void onInitialize() {

        AutoConfig.register(LightstonesConfig.class, GsonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(LightstonesConfig.class).getConfig();

        LightstonesBlocks.init();
        LightstonesItems.init();
        LightstonesBannerPatterns.init();
        LightstonesFeatures.init();
        LightstonesLoot.init();
        LightstonesSounds.init();
    }
}
