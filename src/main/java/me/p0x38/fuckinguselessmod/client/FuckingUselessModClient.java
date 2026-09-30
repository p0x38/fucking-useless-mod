package me.p0x38.fuckinguselessmod.client;

import me.p0x38.fuckinguselessmod.ChatTransformer;
import me.p0x38.fuckinguselessmod.ConfigManager;
import me.p0x38.fuckinguselessmod.presets.PresetRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;

public class FuckingUselessModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        PresetRegistry.loadExternal();
        ConfigManager.load();

        ClientSendMessageEvents.MODIFY_CHAT.register(
                ChatTransformer::transform
        );
    }
}
