import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Created by rcurtis on 1/27/14.
 */
public class Main
{
    public static void main(String[] args)
    {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.useGL20 = true;
        config.width = 1280;
        config.height = 800;
        new LwjglApplication(new VideoSample(), config);
    }
}
