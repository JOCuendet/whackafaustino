package org.acadameiadecodigo.bootcamp;


import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameKeyboardHandler implements KeyboardHandler {

    private final Picture[] picture;
    private Text gText;
    private final Text missedTxt;
    private  Text txt;
    private  int points;

    private int missedPoints;


    public GameKeyboardHandler(Picture[] picture, Text txt,Text gText, Text missedTxt) {
        this.picture = picture;
        this.points = 0;
        this.txt = txt;
        this.missedTxt = missedTxt;
        this.gText = gText;


    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int key = keyboardEvent.getKey();

            switch (key){
                case KeyboardEvent.KEY_Q:
                  if (Main.visible == 0 )
                  {
                      points++;
                      txt.setText(points+"!");
                      txt.draw();
                  }else{
                      missedPoints++;
                      missedTxt.setText(missedPoints+" MISS!");
                  }

                    break;
                case KeyboardEvent.KEY_W:

                    if (Main.visible == 1)
                    {
                        points++;
                        txt.setText(points+"!");
                        txt.draw();
                    }else{
                        missedPoints++;
                        missedTxt.setText(missedPoints+" MISS!");
                    }
                    break;
                case KeyboardEvent.KEY_E:

                    if (Main.visible == 2 )
                    {
                        points++;
                        txt.setText(points+"!");
                        txt.draw();
                    }else{
                        missedPoints++;
                        missedTxt.setText(missedPoints+" MISS!");
                    }
                    break;
                case KeyboardEvent.KEY_A:
                    Main.speed+=100;
                    if(Main.speed > 600)
                        Main.speed = 600;
                    if(Main.speed >=600){
                        gText.setText("NOOB MODE!");
                    } else{
                        gText.setText("");
                    }
                    break;
                case KeyboardEvent.KEY_D:
                    Main.speed-=100;
                    if(Main.speed <=100)
                        Main.speed=100;
                    if(Main.speed <=100){
                        gText.setText("GOD MODE!");
                    } else{
                        gText.setText("");
                    }
                    break;


            }


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
