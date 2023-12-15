package thecsdev.uiinputundo.client.forge.event;

import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static thecsdev.uiinputundo.client.UIInputUndoCommon.*;


@Mod.EventBusSubscriber(modid = ModID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventHandler {
    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(KeyUndo);
        event.register(KeyRedo);

        event.register(KeyManipReverseText);
        event.register(KeyManipReverseWords);
        event.register(KeyManipAllUppercase);
        event.register(KeyManipAllLowercase);
        event.register(KeyManipCapitalWords);
    }
}
