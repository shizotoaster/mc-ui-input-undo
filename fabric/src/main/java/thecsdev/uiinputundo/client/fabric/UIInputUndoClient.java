package thecsdev.uiinputundo.client.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

import static thecsdev.uiinputundo.client.UIInputUndoCommon.*;

public class UIInputUndoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyBindingHelper.registerKeyBinding(KeyUndo);
        KeyBindingHelper.registerKeyBinding(KeyRedo);

        KeyBindingHelper.registerKeyBinding(KeyManipReverseText);
        KeyBindingHelper.registerKeyBinding(KeyManipReverseWords);
        KeyBindingHelper.registerKeyBinding(KeyManipAllUppercase);
        KeyBindingHelper.registerKeyBinding(KeyManipAllLowercase);
        KeyBindingHelper.registerKeyBinding(KeyManipCapitalWords);
    }
}
