package com.puttysoftware.gameshell.loaders;

import java.net.URL;

import com.puttysoftware.audio.ogg.OggPlayer;

public final class MusicLoader {
    // Fields
    private String loadPath;
    private Class<?> loadBase;
    private MusicCache musicCache;

    // Constructors
    public MusicLoader(final String path, final Class<?> base) {
        this.loadPath = path;
        this.loadBase = base;
        this.musicCache = new MusicCache();
    }

    public OggPlayer getLoopedMusic(final String name) {
        // Try and get it from the cache
        final OggPlayer cachedMusic = this.musicCache.getCachedMusic(name);
        if (cachedMusic != null) {
            // Cache hit
            return cachedMusic;
        } else {
            // Cache miss
            final URL url = this.loadBase.getResource(this.loadPath + name);
            return OggPlayer.loadLoopedResource(url);
        }
    }
    
    public OggPlayer getOneShotMusic(final String name) {
        // Try and get it from the cache
        final OggPlayer cachedMusic = this.musicCache.getCachedMusic(name);
        if (cachedMusic != null) {
            // Cache hit
            return cachedMusic;
        } else {
            // Cache miss
            final URL url = this.loadBase.getResource(this.loadPath + name);
            return OggPlayer.loadOneShotResource(url);
        }
    }

    public static int getGraphicSize() {
        return 64;
    }
}
