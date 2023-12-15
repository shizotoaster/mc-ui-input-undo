package thecsdev.uiinputundo.client.forge.event;


import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

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
