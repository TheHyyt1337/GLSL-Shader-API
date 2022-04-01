package raptor.shaderApi;

import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

import java.io.IOException;

/* @author: HYYT -> HYYT#9228 */
public class ShaderMain {
    //INSTANCES.
    public static ShaderMain instance = new ShaderMain();
    private GLSLShader shader;
    //Init time.
    private long initTime = System.currentTimeMillis();
    /*
    Gets init time for shader.
     */
    public void shaderTime(){
        initTime = System.currentTimeMillis();
    }
    /*
    Initialize shader with locations.
    vertexShaderLocation passthrough.
    fragmentShaderLocation noise.
     */
    public void initShader(String vertexShaderLocation, String fragmentShaderLocation){
        try {
            this.shader = new GLSLShader(vertexShaderLocation, // -> "/passthrough.vsh"
                                         fragmentShaderLocation); // -> "/noise.fsh"
        } catch (IOException e) {
            throw new IllegalStateException("Failed to load shader", e);
        }
        initTime = System.currentTimeMillis();
    }
    /*
    Start the shader.
    parameters mouseX, mouseY not for change.
     */
    public void startShader(int width, int height, int mouseX, int mouseY, float time){
        GlStateManager.disableCull();
        shader.useShader(width, height, mouseX, mouseY, (System.currentTimeMillis() - initTime) / time);
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2f(-1f, -1f);
        GL11.glVertex2f(-1f, 1f);
        GL11.glVertex2f(1f, 1f);
        GL11.glVertex2f(1f, -1f);
        GL11.glEnd();
        GL20.glUseProgram(0);
    }
}