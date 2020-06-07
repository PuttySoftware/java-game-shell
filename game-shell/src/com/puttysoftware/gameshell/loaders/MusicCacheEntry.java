package com.puttysoftware.gameshell.loaders;

import com.puttysoftware.audio.ogg.OggFactory;

final class MusicCacheEntry {
	// Fields
	private final OggFactory music;
	private final String name;

	// Constructor
	MusicCacheEntry(final OggFactory newMusic, final String newName) {
		this.music = newMusic;
		this.name = newName;
	}

	// Methods
	OggFactory getMusic() {
		return this.music;
	}

	String getName() {
		return this.name;
	}
}