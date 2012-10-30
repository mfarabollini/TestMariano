/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationclient1;

import SK.gnome.morena.*;
import SK.gnome.twain.TwainManager;
import SK.gnome.twain.TwainSource;

public class HelloWorld
{ public static void main(String[] args) throws MorenaException
  { TwainSource source=TwainManager.getDefaultSource();
  //selectSource(null);

    System.err.println("Selected source is "+source);
    if (source!=null)
    { MorenaImage image=new MorenaImage(source);
      System.err.println("Size of acquired image is "
      	+image.getWidth()+" x "
      	+image.getHeight()+" x "
      	+image.getPixelSize());
    }
    Morena.close();
  }
}