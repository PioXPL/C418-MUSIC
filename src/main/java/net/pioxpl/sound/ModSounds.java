package net.pioxpl.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.pioxpl.c418music.MusicC418;

public class ModSounds {

    // Rejestracja dźwięku (tutaj "bar_brawl")
    public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");

    private static SoundEvent registerSoundEvent(String name) {
        // Tworzymy identyfikator na podstawie MOD_ID i nazwy dźwięku
        Identifier id = Identifier.of(MusicC418.MOD_ID, name);

        // Rejestracja dźwięku w rejestrze
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        // Logowanie, żeby wiedzieć, kiedy dźwięki zostały zarejestrowane
        MusicC418.LOGGER.info("Registering Sounds for " + MusicC418.MOD_ID);
    }
}
