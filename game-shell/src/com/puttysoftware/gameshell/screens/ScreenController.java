package com.puttysoftware.gameshell.screens;

import java.awt.event.WindowListener;
import java.lang.ref.WeakReference;

public abstract class ScreenController implements WindowListener {
    // Fields
    private final ScreenModel model;
    private final ScreenView view;
    private boolean viewReady;

    // Constructors
    protected ScreenController(final ScreenModel theModel, final ScreenView theView) {
	super();
	this.model = theModel;
	this.view = theView;
	this.viewReady = false;
    }

    // Methods
    public final void showMainScreen() {
	if (!this.viewReady) {
	    this.view.setUpView(model, new WeakReference<>(this));
	    this.viewReady = true;
	}
	this.view.showMainScreen();
    }

    protected final void hideMainScreen() {
	if (!this.viewReady) {
	    this.view.setUpView(model, new WeakReference<>(this));
	    this.viewReady = true;
	}
	this.view.hideMainScreen();
    }
}
