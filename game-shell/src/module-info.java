/**
 * 
 */
/**
 * @author ericahnell
 *
 */
module com.puttysoftware.gameshell {
    requires transitive java.desktop;
    requires transitive com.puttysoftware.audio.ogg;
    requires transitive com.puttysoftware.audio.wav;
    requires transitive com.puttysoftware.diane;
    requires transitive com.puttysoftware.images;
    requires transitive com.puttysoftware.polytable;
    requires transitive com.puttysoftware.storage;
    requires transitive com.puttysoftware.xio;

    exports com.puttysoftware.gameshell;
    exports com.puttysoftware.gameshell.dialogs;
    exports com.puttysoftware.gameshell.loaders;
    exports com.puttysoftware.gameshell.screens;
}