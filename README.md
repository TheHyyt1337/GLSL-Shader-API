# GLSL-Shader-API
Smart glsl api

IMPORTANT!!!
Example for use api.
write this in GuiMainMenu class:  
public GuiMainMenu(){
ShaderMain.instance.initShader("/passthrough.vsh", "/assets/minecraft/shaders/program/noise.fsh");
}

And at the end of the method initGui
EXAMPLE
public void initGui(){
if (!this.example) {
example();
}
ShaderMain.instance.shaderTime();
}

at the very beginning of the method drawScreen write:
 ShaderMain.instance.startShader(this.width, this.height, mouseX, mouseY, time); //you can change all parameters, but not mouseX, mouseY.
 EXAMPLE
     public void drawScreen(int mouseX, int mouseY, float partialTicks) {
 ShaderMain.instance.startShader(this.width, this.height, mouseX, mouseY, 1000f);
 }





