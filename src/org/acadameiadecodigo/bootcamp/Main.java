package org.acadameiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {

    public static int visible = 0;
    public static void main(String[] args) throws InterruptedException {
        int slot1X = 30;
        int slot1Y = 100;
        int slot2X = 300;
        int slot2Y = 100;
        int slot3X = 600;
        int slot3Y = 100;


        Picture[] pics = new Picture[3];
        pics[0] = new Picture(slot1X,slot1Y,"./Pictures/FaustinoSmall.png");
        pics[1] = new Picture(slot2X,slot2Y,"./Pictures/FaustinoSmall.png");
        pics[2] = new Picture(slot3X,slot3Y,"./Pictures/FaustinoSmall.png");
        Rectangle rectangle1 = new Rectangle(0,0,800,400);
        Rectangle bgRectangle1 = new Rectangle(slot1X,slot1Y,150,200);
        Rectangle bgRectangle2 = new Rectangle(slot2X,slot2Y,150,200);
        Rectangle bgRectangle3 = new Rectangle(slot3X,slot3Y,150,200);
        bgRectangle1.setColor(Color.BLACK);
        bgRectangle2.setColor(Color.BLACK);
        bgRectangle3.setColor(Color.BLACK);
        rectangle1.setColor(Color.GRAY);
        rectangle1.fill();
        Text titleTxt = new Text(90,10,"WHACK'A'FAUSTINO!");
        titleTxt.setText("WHACK'A'FAUSTINO!");
        titleTxt.setColor(Color.BLACK);
        titleTxt.draw();

        Text infoTxt = new Text(250,30,"CHOOSE THE KEY TO HIT THE TARGET!");
        infoTxt.setText("CHOOSE THE KEY TO HIT THE TARGET!");
        infoTxt.setColor(Color.BLACK);
        infoTxt.draw();

        Text pointsTxt = new Text(300,50,"POINTS");
        pointsTxt.setColor(Color.BLACK);
        pointsTxt.draw();
        int points = 0;
        pointsTxt.setText("POINTS: "+ points+"!");

            KeyboardHandler keyBoardHandler = new GameKeyboardHandler(pics, pointsTxt);
            Keyboard keyboard = new Keyboard(keyBoardHandler);


            // TODO: 6/4/19 VOID() THIS SHIT!!
            KeyboardEvent q = new KeyboardEvent();
            q.setKey(KeyboardEvent.KEY_Q);
            q.setKeyboardEventType((KeyboardEventType.KEY_PRESSED));

            keyboard.addEventListener(q);


            KeyboardEvent w = new KeyboardEvent();
            w.setKey(KeyboardEvent.KEY_W);
            w.setKeyboardEventType((KeyboardEventType.KEY_PRESSED));

            keyboard.addEventListener(w);

            KeyboardEvent e = new KeyboardEvent();
            e.setKey(KeyboardEvent.KEY_E);
            e.setKeyboardEventType((KeyboardEventType.KEY_PRESSED));

            keyboard.addEventListener(e);



            bgRectangle1.fill();
            bgRectangle2.fill();
            bgRectangle3.fill();




            pics[0].draw();
            pics[1].draw();
            pics[2].draw();


        while(true){
            int rand = Utility.getRandomInt(2,0);

            switch (rand) {
                case 0:
                    pics[0].draw();
                    pics[1].delete();
                    pics[2].delete();
                    visible = 0;
                    break;
                case 1:
                    pics[0].delete();
                    pics[1].draw();
                    pics[2].delete();
                    visible = 1;
                    break;
                case 2:
                    pics[0].delete();
                    pics[1].delete();
                    pics[2].draw();
                    visible = 2;
                    break;

            }
            Thread.sleep(300);
        }



    }
}
