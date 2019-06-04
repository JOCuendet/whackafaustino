package org.acadameiadecodigo.bootcamp;


import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameKeyboardHandler implements KeyboardHandler {

    private final Picture[] picture;
    private  Text txt;
    private  int points;


    public GameKeyboardHandler(Picture[] picture, Text txt) {
        this.picture = picture;
        this.points = 0;
        this.txt = txt;
        //this.visible = visible;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int key = keyboardEvent.getKey();

            switch (key){
                case KeyboardEvent.KEY_Q:


                  if (Main.visible == 0 )
                  {
                      points++;
                      txt.setText(points+"");
                      txt.draw();
                  }


                    break;
                case KeyboardEvent.KEY_W:

                    if (Main.visible == 1)
                    {
                        points++;
                        txt.setText(points+"");
                        txt.draw();
                    }

                    break;
                case KeyboardEvent.KEY_E:

                    if (Main.visible == 2 )
                    {
                        points++;
                        txt.setText(points+"");
                        txt.draw();
                    }

                    break;

            }


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
