import javax.swing.JFrame;

public class GameFrame {
    public static void main(String[] args) {
        JFrame game = new JFrame();
        game.setTitle("Brick Breaker");
        game.setResizable(false);
        game.setVisible(true);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setBounds(400,100,GameLogic.frameWidth,GameLogic.frameHeight);
    }
}
