package app.interfaces;

import app.model.Song;
import javax.microedition.lcdui.Displayable;

public interface MainObserver {

  Displayable go(Displayable var1);

  Displayable goBack();

  void handle(Song var1);

  Displayable replaceCurrent(Displayable var1);

  Displayable getCurrentDisplayable();
}
