package com.puttysoftware.gameshell;

import javax.swing.JPanel;

public abstract class MenuManagerShell {
    // Fields
    protected final JPanel menuContainer;

    // Constructors
    public MenuManagerShell() {
        this.menuContainer = new JPanel();
    }

    // Methods
    public final JPanel getMenuContainer() {
        return this.menuContainer;
    }

    public abstract void populateMenus();

    public abstract void updateMenuItemState(final boolean loaded,
            final boolean dirty);
}
