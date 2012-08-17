// Date: 7/31/2012 8:41:19 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;


public class ModelShellder extends ModelBase
{
  //fields
    ModelRenderer Piece1;
    ModelRenderer BottomShell1;
    ModelRenderer BottomShell2;
    ModelRenderer BottomShell3;
    ModelRenderer BottomShell4;
    ModelRenderer BottomShell5;
    ModelRenderer Tongue;
    ModelRenderer TopShell1;
    ModelRenderer TopShell2;
    ModelRenderer TopShell3;
    ModelRenderer TopShell4;
    ModelRenderer TopShell5;
    ModelRenderer Head;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
  
  public ModelShellder()
  {
    textureWidth = 64;
    textureHeight = 32;
    setTextureOffset("Piece1.DELETE", 0, 0);
    
    Piece1 = new ModelRenderer(this, "Piece1");
    Piece1.setRotationPoint(0F, 0F, 0F);
    setRotation(Piece1, 0F, 0F, 0F);
    Piece1.mirror = true;
      BottomShell1 = new ModelRenderer(this, 0, 25);
      BottomShell1.addBox(0F, 0F, -6F, 5, 1, 6);
      BottomShell1.setRotationPoint(-2.5F, 22F, 4F);
      BottomShell1.setTextureSize(64, 32);
      BottomShell1.mirror = true;
      setRotation(BottomShell1, 0.0698132F, 0F, 0F);
      BottomShell2 = new ModelRenderer(this, 23, 25);
      BottomShell2.addBox(0F, 0F, -6F, 1, 1, 6);
      BottomShell2.setRotationPoint(-3.5F, 21F, 4F);
      BottomShell2.setTextureSize(64, 32);
      BottomShell2.mirror = true;
      setRotation(BottomShell2, 0.0698132F, 0F, 0F);
      BottomShell3 = new ModelRenderer(this, 23, 25);
      BottomShell3.addBox(0F, 0F, -6F, 1, 1, 6);
      BottomShell3.setRotationPoint(2.5F, 21F, 4F);
      BottomShell3.setTextureSize(64, 32);
      BottomShell3.mirror = true;
      setRotation(BottomShell3, 0.0698132F, 0F, 0F);
      BottomShell4 = new ModelRenderer(this, 23, 20);
      BottomShell4.addBox(0F, 0F, 0F, 1, 2, 1);
      BottomShell4.setRotationPoint(1.8F, 22.4F, -0.4F);
      BottomShell4.setTextureSize(64, 32);
      BottomShell4.mirror = true;
      setRotation(BottomShell4, 0F, 0F, -0.2443461F);
      BottomShell5 = new ModelRenderer(this, 23, 20);
      BottomShell5.addBox(-1F, 0F, 0F, 1, 2, 1);
      BottomShell5.setRotationPoint(-1.8F, 22.4F, -0.5F);
      BottomShell5.setTextureSize(64, 32);
      BottomShell5.mirror = true;
      setRotation(BottomShell5, 0F, 0F, 0.2443461F);
      TopShell1 = new ModelRenderer(this, 0, 18);
      TopShell1.addBox(0F, 0F, -6F, 5, 1, 6);
      TopShell1.setRotationPoint(-2.5F, 20F, 4F);
      TopShell1.setTextureSize(64, 32);
      TopShell1.mirror = true;
      setRotation(TopShell1, -0.2792527F, 0F, 0F);
      TopShell2 = new ModelRenderer(this, 23, 25);
      TopShell2.addBox(0F, 0F, -6F, 1, 1, 6);
      TopShell2.setRotationPoint(-3.5F, 21F, 4F);
      TopShell2.setTextureSize(64, 32);
      TopShell2.mirror = true;
      setRotation(TopShell2, -0.2792527F, 0F, 0F);
      TopShell3 = new ModelRenderer(this, 23, 25);
      TopShell3.addBox(0F, 0F, -6F, 1, 1, 6);
      TopShell3.setRotationPoint(2.5F, 21F, 4F);
      TopShell3.setTextureSize(64, 32);
      TopShell3.mirror = true;
      setRotation(TopShell3, -0.2792527F, 0F, 0F);
      Tongue = new ModelRenderer(this, 30, 0);
      Tongue.addBox(0F, 0F, 1F, 2, 0, 4);
      Tongue.setRotationPoint(-1F, 22.6F, -5F);
      Tongue.setTextureSize(64, 32);
      Tongue.mirror = true;
      setRotation(Tongue, 0.122173F, 0F, 0F);
      TopShell4 = new ModelRenderer(this, 23, 20);
      TopShell4.addBox(0F, 0F, 0F, 1, 2, 1);
      TopShell4.setRotationPoint(2.5F, 18F, 0F);
      TopShell4.setTextureSize(64, 32);
      TopShell4.mirror = true;
      setRotation(TopShell4, 0F, -0.1919862F, 0.2443461F);
      TopShell5 = new ModelRenderer(this, 23, 20);
      TopShell5.addBox(-1F, 0F, 0F, 1, 2, 1);
      TopShell5.setRotationPoint(-2.5F, 18F, 0F);
      TopShell5.setTextureSize(64, 32);
      TopShell5.mirror = true;
      setRotation(TopShell5, 0F, 0.1919862F, -0.2443461F);
      Head = new ModelRenderer(this, 50, 0);
      Head.addBox(0F, 0F, 0F, 4, 3, 3);
      Head.setRotationPoint(-2F, 19.6F, -1F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, -0.1047198F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 0, 0);
      Tail1.addBox(0F, 0F, 0F, 5, 1, 4);
      Tail1.setRotationPoint(-2.5F, 22.3F, 3.3F);
      Tail1.setTextureSize(64, 32);
      Tail1.mirror = true;
      setRotation(Tail1, 0.8203047F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 0, 5);
      Tail2.addBox(0F, 0F, 0F, 5, 1, 4);
      Tail2.setRotationPoint(-2.5F, 20F, 4F);
      Tail2.setTextureSize(64, 32);
      Tail2.mirror = true;
      setRotation(Tail2, -0.837758F, 0F, 0F);
      Piece1.addChild(BottomShell1);
      Piece1.addChild(BottomShell2);
      Piece1.addChild(BottomShell3);
      Piece1.addChild(BottomShell4);
      Piece1.addChild(BottomShell5);
      Piece1.addChild(TopShell1);
      Piece1.addChild(TopShell2);
      Piece1.addChild(TopShell3);
      Piece1.addChild(TopShell4);
      Piece1.addChild(TopShell5);
      Piece1.addChild(Tongue);
      Piece1.addChild(Head);
      Piece1.addChild(Tail1);
      Piece1.addChild(Tail2);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Piece1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
    Piece1.rotateAngleY = MathHelper.cos(1.2F*f)*.4F*f1;
  }

}