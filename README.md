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
![image](https://user-images.githubusercontent.com/100965140/161317507-f81c46c2-55d2-4dab-8d6a-943e9a54e7b3.png)
 }





