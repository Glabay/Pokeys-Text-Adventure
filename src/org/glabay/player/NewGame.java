package org.glabay.player;

import java.io.File;

/**
 *
 * @author Michael Glabay
 * @since Oct 28, 2014
 */
public class NewGame {

    File file = new File("C:/GlabTech/pta/accounts/");
    
    public NewGame() {
        if (!file.exists()) {
            file.mkdir();
        }
        createNewSave();
        
    }
    
    private void createNewSave() {
        
    }
}
