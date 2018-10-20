package com.puttysoftware.gameshell.dialogs;

import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;

public abstract class DialogController implements ActionListener {
    // Fields
    private final DialogModel model;
    private DialogView view;

    // Constructors
    protected DialogController(final DialogModel aboutModel) {
	super();
	this.model = aboutModel;
    }

    // Methods
    private void checkView() {
	if (this.view == null) {
	    this.view = new DialogView();
	    this.view.setUpGUI(this.model, new WeakReference<>(this));
	}
    }

    public final void showAboutDialog() {
	this.checkView();
	this.view.showAboutDialog();
    }

    protected final void hideAboutDialog() {
	this.checkView();
	this.view.hideAboutDialog();
    }
}
