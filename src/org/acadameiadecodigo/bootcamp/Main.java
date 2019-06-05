package org.acadameiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {

    public static int visible = 0;
    public static int speed = 600;
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
        rectangle1.setColor(Color.DARK_GRAY);
        rectangle1.fill();


        Rectangle bgRectangle1 = new Rectangle(slot1X,slot1Y,150,164);
        Rectangle bgRectangle2 = new Rectangle(slot2X,slot2Y,150,164);
        Rectangle bgRectangle3 = new Rectangle(slot3X,slot3Y,150,164);
        bgRectangle1.setColor(Color.BLACK);
        bgRectangle2.setColor(Color.BLACK);
        bgRectangle3.setColor(Color.BLACK);
        bgRectangle1.fill();
        bgRectangle2.fill();
        bgRectangle3.fill();

        Text qTxt = new Text(100,280,"Q");
        qTxt.setColor(Color.WHITE);
        qTxt.draw();

        Text wTxt = new Text(370,280,"W");
        wTxt.setColor(Color.WHITE);
        wTxt.draw();

        Text eTxt = new Text(670,280,"E");
        eTxt.setColor(Color.WHITE);
        eTxt.draw();

        Text aTxt = new Text(30,350,"A - Speed DOWN");
        aTxt.setColor(Color.WHITE);
        aTxt.draw();

        Text dTxt = new Text(30,330,"D - Speed UP");
        dTxt.setColor(Color.WHITE);
        dTxt.draw();

        Text speedModeTxt = new Text(330,330,"");
        speedModeTxt.setColor(Color.WHITE);
        speedModeTxt.grow(90,30);
        speedModeTxt.draw();


        Text titleTxt = new Text(100,20,"WHACK'A'FAUSTINO!");
        titleTxt.setText("WHACK'A'FAUSTINO!");
        titleTxt.setColor(Color.WHITE);
        titleTxt.grow(90,30);
        titleTxt.draw();


        Text infoTxt = new Text(250,70,"CHOOSE THE KEY TO HIT THE TARGET!");
        infoTxt.setText("CHOOSE THE KEY TO HIT THE TARGET!");
        infoTxt.setColor(Color.WHITE);
        infoTxt.draw();

        Text pointsLabelTxt = new Text(650,10,"POINTS");
        pointsLabelTxt.setColor(Color.WHITE);
        pointsLabelTxt.draw();

        Text missPointsLabelTxt = new Text(550,10,"0 MISS!");
        missPointsLabelTxt.setColor(Color.WHITE);
        titleTxt.grow(60,15);
        missPointsLabelTxt.draw();


        Text pointsTxt = new Text(700,40,"0!");
        pointsTxt.setColor(Color.WHITE);
        pointsTxt.grow(60,30);
        pointsTxt.draw();

        int points = 0;



        KeyboardHandler keyBoardHandler = new GameKeyboardHandler(pics, pointsTxt, speedModeTxt, missPointsLabelTxt);
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

        KeyboardEvent a = new KeyboardEvent();
        a.setKey(KeyboardEvent.KEY_A);
        a.setKeyboardEventType((KeyboardEventType.KEY_PRESSED));

        keyboard.addEventListener(a);

        KeyboardEvent d = new KeyboardEvent();
        d.setKey(KeyboardEvent.KEY_D);
        d.setKeyboardEventType((KeyboardEventType.KEY_PRESSED));

        keyboard.addEventListener(d);


        for(int i=0; i<pics.length;i++)
        {
            pics[0].draw();
            pics[1].draw();
            pics[2].draw();
        }
        int checkerNum = -1;

        while(true){


            int rand = Utility.getRandomInt(2,0);
            if(checkerNum == rand)
            {
                rand = Utility.getRandomInt(2,0);
                continue;
            }
            switch (rand) {
                case 0:
                    pics[0].draw();
                    pics[1].delete();
                    pics[2].delete();
                    visible = 0;
                    checkerNum = 0;
                    break;
                case 1:
                    pics[0].delete();
                    pics[1].draw();
                    pics[2].delete();
                    visible = 1;
                    checkerNum = 1;
                    break;
                case 2:
                    pics[0].delete();
                    pics[1].delete();
                    pics[2].draw();
                    visible = 2;
                    checkerNum = 2;
                    break;

            }

            Thread.sleep(speed);        }



    }
}
