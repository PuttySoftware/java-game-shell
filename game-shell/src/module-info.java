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
    exports com.puttysoftware.gameshell;
    exports com.puttysoftware.gameshell.dialogs;
    exports com.puttysoftware.gameshell.screens;
}