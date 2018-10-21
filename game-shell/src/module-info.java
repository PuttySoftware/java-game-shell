/**
 * 
 */
/**
 * @author ericahnell
 *
 */
module com.puttysoftware.gameshell {
    requires transitive java.desktop;
    requires transitive com.puttysoftware.desktop;
    requires transitive com.puttysoftware.audio.ogg;
    requires transitive com.puttysoftware.audio.wav;
    exports com.puttysoftware.gameshell;
    exports com.puttysoftware.gameshell.dialogs;
    exports com.puttysoftware.gameshell.loaders;
    exports com.puttysoftware.gameshell.screens;
}