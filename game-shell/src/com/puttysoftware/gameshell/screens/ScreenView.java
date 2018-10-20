package com.puttysoftware.gameshell.screens;

import java.lang.ref.WeakReference;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class ScreenView {
    // Fields
    protected final JFrame theFrame;

    // Constructors
    protected ScreenView() {
	super();
	this.theFrame = new JFrame();
    }

    // Methods
    final void showMainScreen() {
	this.theFrame.setVisible(true);
    }

    final void hideMainScreen() {
	this.theFrame.setVisible(false);
    }

    final void setUpView(final ScreenModel model, final WeakReference<ScreenController> controllerRef) {
	this.theFrame.setTitle(model.getTitle());
	this.theFrame.setIconImage(model.getSystemIcon());
	final JPanel thePanel = this.populateMainPanel(model);
	this.theFrame.setResizable(false);
	this.theFrame.addWindowListener(controllerRef.get());
	this.theFrame.setContentPane(thePanel);
	this.theFrame.pack();
    }

    protected abstract JPanel populateMainPanel(final ScreenModel model);
}
