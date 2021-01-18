package com.puttysoftware.gameshell.loaders;

import com.puttysoftware.audio.ogg.OggPlayer;

final class MusicCacheEntry {
    // Fields
    private final OggPlayer music;
    private final String name;

    // Constructor
    MusicCacheEntry(final OggPlayer newMusic, final String newName) {
        this.music = newMusic;
        this.name = newName;
    }

    // Methods
    OggPlayer getMusic() {
        return this.music;
    }

    String getName() {
        return this.name;
    }
}