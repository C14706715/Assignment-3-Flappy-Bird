/*
    Assignment 3-Flappy Bird
    Jake Young 
    DT282 Year 2
*/
package game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Game
{
    //Final means it cant be changed
    public final static int width=800;
    public final static int height=600;
    //String to use as Game title
    private String gameName="Flappy Bird";
    
    //Java object which allows me to draw to a window
    private Canvas game= new Canvas();
    
    //instance of input class
    private Input input;
    
    //acts as storage for all update and render info
    private ArrayList <Updatable> updatables = new ArrayList<>();
    private ArrayList <Renderable> renderables = new ArrayList<>();        
    public void Start()
    {
        //initialise windows and jframe
        //game loop
        //while loop
        Dimension gameSize= new Dimension(Game.width, Game.height);
        //window that canvas sits inside of
        JFrame gameWindow= new JFrame(gameName);
        //when press X it makes sure game shuts down
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(gameSize);
        //means you cant resize window
        gameWindow.setResizable(false);
        //allows you to view the game
        gameWindow.setVisible(true);
        game.setSize(gameSize);
        game.setMaximumSize(gameSize);
        game.setMaximumSize(gameSize);
        game.setPreferredSize(gameSize);
        gameWindow.add(game);
        //This ensure game is centered in the screen
        gameWindow.setLocationRelativeTo(null);
        
        
        input = new Input();
        
        boolean running=true;
        while(running)
        {
          update();  
        }//game is finished
    }

    private void update()
    {
        for(Updatable u : updatables)
        {
            u.update(input);
        }
    }
    
    private void render(float interpolation)
    {
           for(Renderable r: renderables)   
           {
               r.render(g2d, interpolation);
           }
           
    }
    
}
















