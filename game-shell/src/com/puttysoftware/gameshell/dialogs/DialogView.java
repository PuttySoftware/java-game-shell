package com.puttysoftware.gameshell.dialogs;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.lang.ref.WeakReference;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

final class DialogView {
    // Fields
    private final JFrame aboutFrame;

    // Constructors
    DialogView() {
	super();
	this.aboutFrame = new JFrame();
    }

    // Methods
    void showAboutDialog() {
	this.aboutFrame.setVisible(true);
    }

    void hideAboutDialog() {
	this.aboutFrame.setVisible(false);
    }

    void setUpGUI(final DialogModel model, final WeakReference<DialogController> controllerRef) {
	this.aboutFrame.setTitle(model.getTitle());
	this.aboutFrame.setIconImage(model.getSystemIcon());
	final Container aboutPane = new Container();
	final Container textPane = new Container();
	final Container buttonPane = new Container();
	final Container logoPane = new Container();
	final JButton aboutOK = new JButton(model.getActionButtonText());
	final JLabel miniLabel = new JLabel("", model.getMainImage(), SwingConstants.LEFT);
	miniLabel.setLabelFor(null);
	aboutOK.setDefaultCapable(true);
	this.aboutFrame.getRootPane().setDefaultButton(aboutOK);
	this.aboutFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	aboutPane.setLayout(new BorderLayout());
	logoPane.setLayout(new FlowLayout());
	logoPane.add(miniLabel);
	textPane.setLayout(new GridLayout(model.getMessageCount(), 1));
	Iterable<String> messages = model.getMessages();
	for (String message : messages) {
	    textPane.add(new JLabel(message));
	}
	buttonPane.setLayout(new FlowLayout());
	buttonPane.add(aboutOK);
	aboutPane.add(logoPane, BorderLayout.WEST);
	aboutPane.add(textPane, BorderLayout.CENTER);
	aboutPane.add(buttonPane, BorderLayout.SOUTH);
	this.aboutFrame.setResizable(false);
	aboutOK.addActionListener(controllerRef.get());
	this.aboutFrame.setContentPane(aboutPane);
	this.aboutFrame.pack();
    }
}
