package com.puttysoftware.gameshell.loaders;

import com.puttysoftware.audio.wav.WAVFactory;

final class SoundCacheEntry {
    // Fields
    private final WAVFactory sound;
    private final String name;

    // Constructor
    SoundCacheEntry(final WAVFactory newSound, final String newName) {
	this.sound = newSound;
	this.name = newName;
    }

    // Methods
    WAVFactory getSound() {
	return this.sound;
    }

    String getName() {
	return this.name;
    }
}