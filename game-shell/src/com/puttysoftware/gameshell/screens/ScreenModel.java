package com.puttysoftware.gameshell.screens;

import java.awt.Image;

public final class ScreenModel {
    // Fields
    private final String title;
    private final Image systemIcon;

    // Constructors
    public ScreenModel(final String screenTitle, final Image screenSystemIcon) {
	super();
	this.title = screenTitle;
	this.systemIcon = screenSystemIcon;
    }

    // Methods
    public final String getTitle() {
	return this.title;
    }

    public final Image getSystemIcon() {
	return this.systemIcon;
    }
}
