package pixelmon.client.models.pokemon;

import pixelmon.client.models.PixelmonModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.SkeletonBiped;



public class ModelCharizard extends PixelmonModelBase
{
  //fields
    ModelRenderer Body;
  
  public ModelCharizard()
  {
    textureWidth = 256;
    textureHeight = 256;
    
	  Body = new ModelRenderer(this, "Body");
	  Body.setRotationPoint(0F, -3F, 0F);
      ModelRenderer body1 = new ModelRenderer(this, 2, 38);
      body1.addBox(-10F, -1F, -10F, 20, 19, 18);
      body1.setTextureSize(256, 256);
      body1.mirror = true;
      setRotation(body1, 0.0523599F, 0F, 0F);
      Body.addChild(body1);
      ModelRenderer body3 = new ModelRenderer(this, 76, 76);
      body3.addBox(-6F, -9F, -8.5F, 12, 5, 13);
      body3.setRotationPoint(0F, 0F, 2F);
      body3.setTextureSize(256, 256);
      body3.mirror = true;
      setRotation(body3, 0F, 0F, 0F);
      Body.addChild(body3);
      ModelRenderer body2 = new ModelRenderer(this, 60, 98);
      body2.addBox(-8.5F, -6F, -9F, 17, 15, 16);
      body2.setTextureSize(256, 256);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      Body.addChild(body2);
      
      ModelRenderer Neck = new ModelRenderer(this, "Neck");
	  Neck.setRotationPoint(0F, -10F, 2F);
      ModelRenderer neck3 = new ModelRenderer(this, 0, 0);
      neck3.addBox(-3F, -19F, -3.5F, 6, 10, 6);
      neck3.setTextureSize(256, 256);
      neck3.mirror = true;
      setRotation(neck3, 0.1396263F, 0F, 0F);
      Neck.addChild(neck3);
      ModelRenderer neck1 = new ModelRenderer(this, 0, 0);
      neck1.addBox(-3.5F, -5F, -5F, 7, 10, 8);
      neck1.setTextureSize(256, 256);
      neck1.mirror = true;
      setRotation(neck1, 0.0872665F, 0F, 0F);
      Neck.addChild(neck1);
      ModelRenderer neck2 = new ModelRenderer(this, 0, 0);
      neck2.addBox(-3F, -11F, -4.5F, 6, 10, 7);
      neck2.setTextureSize(256, 256);
      neck2.mirror = true;
      setRotation(neck2, 0.1047198F, 0F, 0F);
      Neck.addChild(neck2);
      Body.addChild(Neck);
      
	  ModelRenderer RightWing = new ModelRenderer(this, "RightWing");
	  RightWing.setRotationPoint(-5.5F, -7F, 7F);
      ModelRenderer rightwing21 = new ModelRenderer(this, 60, 0);
      rightwing21.addBox(-24.5F, 1F, 0.51F, 29, 32, 0);
      rightwing21.setTextureSize(256, 256);
      rightwing21.mirror = true;
      setRotation(rightwing21, 0F, 0, 0.9424778F);
      RightWing.addChild(rightwing21);
      ModelRenderer rightwing23 = new ModelRenderer(this, 13, 84);
      rightwing23.addBox(5.5F, 22F, 0.49F, 8, 2, 0);
      rightwing23.setTextureSize(256, 256);
      rightwing23.mirror = true;
      setRotation(rightwing23, 0F, 0, 1.815142F);
      RightWing.addChild(rightwing23);
      ModelRenderer rightwing22 = new ModelRenderer(this, 13, 84);
      rightwing22.addBox(5.5F, 25F, 0.49F, 8, 2, 0);
      rightwing22.setTextureSize(256, 256);
      rightwing22.mirror = true;
      setRotation(rightwing22, 0F, 0, 1.500983F);
      RightWing.addChild(rightwing22);
      ModelRenderer rightwing20 = new ModelRenderer(this, 0, 80);
      rightwing20.addBox(-24.5F, 1F, 0.5F, 29, 32, 0);
      rightwing20.setTextureSize(256, 256);
      rightwing20.mirror = true;
      setRotation(rightwing20, 0F, 0, 0.9424778F);
      RightWing.addChild(rightwing20);
      ModelRenderer rightwing19 = new ModelRenderer(this, 0, 0);
      rightwing19.addBox(-24F, -6.2F, 0F, 1, 4, 1);
      rightwing19.setTextureSize(256, 256);
      rightwing19.mirror = true;
      setRotation(rightwing19, 0F, 0, 0.8203047F);
      RightWing.addChild(rightwing19);
      ModelRenderer rightwing18 = new ModelRenderer(this, 0, 0);
      rightwing18.addBox(-22.7F, -9.2F, 0F, 1, 3, 1);
      rightwing18.setTextureSize(256, 256);
      rightwing18.mirror = true;
      setRotation(rightwing18, 0F, 0, 0.6457718F);
      RightWing.addChild(rightwing18);
      ModelRenderer rightwing17 = new ModelRenderer(this, 0, 0);
      rightwing17.addBox(-22.2F, -10.2F, -0.5F, 2, 3, 2);
      rightwing17.setTextureSize(256, 256);
      rightwing17.mirror = true;
      setRotation(rightwing17, 0F, 0, 0.4712389F);
      RightWing.addChild(rightwing17);
      ModelRenderer rightwing16 = new ModelRenderer(this, 0, 0);
      rightwing16.addBox(-21.1F, -11.5F, -0.5F, 3, 2, 2);
      rightwing16.setTextureSize(256, 256);
      rightwing16.mirror = true;
      setRotation(rightwing16, 0F, 0, 0.3141593F);
      RightWing.addChild(rightwing16);
      ModelRenderer rightwing15 = new ModelRenderer(this, 0, 0);
      rightwing15.addBox(-30.9F, 7.8F, -0.5F, 1, 5, 2);
      rightwing15.setTextureSize(256, 256);
      rightwing15.mirror = true;
      setRotation(rightwing15, 0F, 0, -0.3490659F);
      RightWing.addChild(rightwing15);
      ModelRenderer rightwing14 = new ModelRenderer(this, 0, 0);
      rightwing14.addBox(-27.6F, 4F, -0.5F, 1, 12, 2);
      rightwing14.setTextureSize(256, 256);
      rightwing14.mirror = true;
      setRotation(rightwing14, 0F, 0, -0.0698132F);
      RightWing.addChild(rightwing14);
      ModelRenderer rightwing13 = new ModelRenderer(this, 0, 0);
      rightwing13.addBox(-22.1F, 13F, -0.5F, 1, 4, 2);
      rightwing13.setTextureSize(256, 256);
      rightwing13.mirror = true;
      setRotation(rightwing13, 0F, 0, 0.4363323F);
      RightWing.addChild(rightwing13);
      ModelRenderer rightwing12 = new ModelRenderer(this, 0, 0);
      rightwing12.addBox(-23.9F, -1F, -0.5F, 1, 11, 2);
      rightwing12.setTextureSize(256, 256);
      rightwing12.mirror = true;
      setRotation(rightwing12, 0F, 0, 0.2792527F);
      RightWing.addChild(rightwing12);
      ModelRenderer rightwing11 = new ModelRenderer(this, 0, 0);
      rightwing11.addBox(-24.3F, -2F, -0.5F, 1, 11, 2);
      rightwing11.setTextureSize(256, 256);
      rightwing11.mirror = true;
      setRotation(rightwing11, 0F, 0, 0.2443461F);
      RightWing.addChild(rightwing11);
      ModelRenderer rightwing10 = new ModelRenderer(this, 0, 0);
      rightwing10.addBox(-23.7F, -5F, -0.5F, 2, 11, 2);
      rightwing10.setTextureSize(256, 256);
      rightwing10.mirror = true;
      setRotation(rightwing10, 0F, 0, 0.5759587F);
      RightWing.addChild(rightwing10);
      ModelRenderer rightwing9 = new ModelRenderer(this, 0, 0);
      rightwing9.addBox(-18.1F, -15.7F, -0.5F, 5, 2, 2);
      rightwing9.setTextureSize(256, 256);
      rightwing9.mirror = true;
      setRotation(rightwing9, 0F, 0, 0.0174533F);
      RightWing.addChild(rightwing9);
      ModelRenderer rightwing8 = new ModelRenderer(this, 0, 0);
      rightwing8.addBox(-18.1F, -15.2F, -0.5F, 4, 2, 2);
      rightwing8.setTextureSize(256, 256);
      rightwing8.mirror = true;
      setRotation(rightwing8, 0F, 0, 0.0872665F);
      RightWing.addChild(rightwing8);
      ModelRenderer rightwing7 = new ModelRenderer(this, 0, 0);
      rightwing7.addBox(-11.3F, -18.8F, -0.5F, 2, 12, 2);
      rightwing7.setTextureSize(256, 256);
      rightwing7.mirror = true;
      setRotation(rightwing7, 0F, 0, -0.2268928F);
      RightWing.addChild(rightwing7);
      ModelRenderer rightwing6 = new ModelRenderer(this, 0, 0);
      rightwing6.addBox(-11.5F, -18.2F, -0.5F, 2, 12, 2);
      rightwing6.setTextureSize(256, 256);
      rightwing6.mirror = true;
      setRotation(rightwing6, 0F, 0, -0.1919862F);
      RightWing.addChild(rightwing6);
      ModelRenderer rightwing5 = new ModelRenderer(this, 0, 0);
      rightwing5.addBox(-12.7F, 1.8F, -0.5F, 7, 2, 2);
      rightwing5.setTextureSize(256, 256);
      rightwing5.mirror = true;
      setRotation(rightwing5, 0F, 0, 0.6108652F);
      RightWing.addChild(rightwing5);
      ModelRenderer rightwing4 = new ModelRenderer(this, 0, 0);
      rightwing4.addBox(-6F, 0F, -0.5F, 1, 4, 2);
      rightwing4.setTextureSize(256, 256);
      rightwing4.mirror = true;
      setRotation(rightwing4, 0F, 0, 0.9773844F);
      RightWing.addChild(rightwing4);
      ModelRenderer rightwing3 = new ModelRenderer(this, 0, 0);
      rightwing3.addBox(-5.5F, 1F, -0.5F, 1, 4, 2);
      rightwing3.setTextureSize(256, 256);
      rightwing3.mirror = true;
      setRotation(rightwing3, 0F, 0, 0.9773844F);
      RightWing.addChild(rightwing3);
      ModelRenderer rightwing2 = new ModelRenderer(this, 0, 0);
      rightwing2.addBox(-7F, -1F, -0.5F, 1, 4, 2);
      rightwing2.setTextureSize(256, 256);
      rightwing2.mirror = true;
      setRotation(rightwing2, 0F, 0, 0.7679449F);
      RightWing.addChild(rightwing2);
      ModelRenderer rightwing = new ModelRenderer(this, 0, 0);
      rightwing.addBox(-7F, -1F, -1F, 10, 3, 3);
      rightwing.setTextureSize(256, 256);
      rightwing.mirror = true;
      setRotation(rightwing, 0F, 0, 1.047198F);
      RightWing.addChild(rightwing);
      Body.addChild(RightWing);
      
	  ModelRenderer LeftWing= new ModelRenderer(this, "LeftWing");
	  LeftWing.setRotationPoint(5.5F, -7F, 7F);
      ModelRenderer leftwing19 = new ModelRenderer(this, 0, 0);
      leftwing19.addBox(23F, -6.2F, 0F, 1, 4, 1);
      leftwing19.setTextureSize(256, 256);
      leftwing19.mirror = true;
      setRotation(leftwing19, 0F, 0, -0.8203047F);
      LeftWing.addChild(leftwing19);
      ModelRenderer leftwing20 = new ModelRenderer(this, 134, 15);
      leftwing20.addBox(-6.5F, 0.7F, 0.5F, 29, 32, 0);
      leftwing20.setTextureSize(256, 256);
      leftwing20.mirror = true;
      setRotation(leftwing20, 0F, 0, -0.9424778F);
      LeftWing.addChild(leftwing20);
      ModelRenderer leftwing23 = new ModelRenderer(this, 13, 84);
      leftwing23.addBox(-13.5F, 22F, 0.49F, 8, 2, 0);
      leftwing23.setTextureSize(256, 256);
      leftwing23.mirror = true;
      setRotation(leftwing23, 0F, 0, -1.815142F);
      LeftWing.addChild(leftwing23);
      ModelRenderer leftwing22 = new ModelRenderer(this, 13, 84);
      leftwing22.addBox(-13.5F, 25F, 0.49F, 8, 2, 0);
      leftwing22.setTextureSize(256, 256);
      leftwing22.mirror = true;
      setRotation(leftwing22, 0F, 0, -1.500983F);
      LeftWing.addChild(leftwing22);
      ModelRenderer leftwing21 = new ModelRenderer(this, 135, 58);
      leftwing21.addBox(-6.5F, 0.6F, 0.51F, 29, 32, 0);
      leftwing21.setTextureSize(256, 256);
      leftwing21.mirror = true;
      setRotation(leftwing21, 0F, 0, -0.9424778F);
      LeftWing.addChild(leftwing21);
      ModelRenderer leftwing18 = new ModelRenderer(this, 0, 0);
      leftwing18.addBox(21.7F, -9.2F, 0F, 1, 3, 1);
      leftwing18.setTextureSize(256, 256);
      leftwing18.mirror = true;
      setRotation(leftwing18, 0F, 0, -0.6457718F);
      LeftWing.addChild(leftwing18);
      ModelRenderer leftwing17 = new ModelRenderer(this, 0, 0);
      leftwing17.addBox(20.2F, -10.2F, -0.5F, 2, 3, 2);
      leftwing17.setTextureSize(256, 256);
      leftwing17.mirror = true;
      setRotation(leftwing17, 0F, 0, -0.4712389F);
      LeftWing.addChild(leftwing17);
      ModelRenderer leftwing16 = new ModelRenderer(this, 0, 0);
      leftwing16.addBox(18.1F, -11.5F, -0.5F, 3, 2, 2);
      leftwing16.setTextureSize(256, 256);
      leftwing16.mirror = true;
      setRotation(leftwing16, 0F, 0, -0.3141593F);
      LeftWing.addChild(leftwing16);
      ModelRenderer leftwing15 = new ModelRenderer(this, 0, 0);
      leftwing15.addBox(29.9F, 7.8F, -0.5F, 1, 5, 2);
      leftwing15.setTextureSize(256, 256);
      leftwing15.mirror = true;
      setRotation(leftwing15, 0F, 0, 0.3490659F);
      LeftWing.addChild(leftwing15);
      ModelRenderer leftwing14 = new ModelRenderer(this, 0, 0);
      leftwing14.addBox(26.6F, 4F, -0.5F, 1, 12, 2);
      leftwing14.setTextureSize(256, 256);
      leftwing14.mirror = true;
      setRotation(leftwing14, 0F, 0, 0.0698132F);
      LeftWing.addChild(leftwing14);
      ModelRenderer leftwing13 = new ModelRenderer(this, 0, 0);
      leftwing13.addBox(21.1F, 13F, -0.5F, 1, 4, 2);
      leftwing13.setTextureSize(256, 256);
      leftwing13.mirror = true;
      setRotation(leftwing13, 0F, 0, -0.4363323F);
      LeftWing.addChild(leftwing13);
      ModelRenderer leftwing12 = new ModelRenderer(this, 0, 0);
      leftwing12.addBox(22.9F, -1F, -0.5F, 1, 11, 2);
      leftwing12.setTextureSize(256, 256);
      leftwing12.mirror = true;
      setRotation(leftwing12, 0F, 0, -0.2792527F);
      LeftWing.addChild(leftwing12);
      ModelRenderer leftwing11 = new ModelRenderer(this, 0, 0);
      leftwing11.addBox(23.3F, -2F, -0.5F, 1, 11, 2);
      leftwing11.setTextureSize(256, 256);
      leftwing11.mirror = true;
      setRotation(leftwing11, 0F, 0, -0.2443461F);
      LeftWing.addChild(leftwing11);
      ModelRenderer leftwing10 = new ModelRenderer(this, 0, 0);
      leftwing10.addBox(21.7F, -5F, -0.5F, 2, 11, 2);
      leftwing10.setTextureSize(256, 256);
      leftwing10.mirror = true;
      setRotation(leftwing10, 0F, 0, -0.5759587F);
      LeftWing.addChild(leftwing10);
      ModelRenderer leftwing9 = new ModelRenderer(this, 0, 0);
      leftwing9.addBox(13.1F, -15.7F, -0.5F, 5, 2, 2);
      leftwing9.setTextureSize(256, 256);
      leftwing9.mirror = true;
      setRotation(leftwing9, 0F, 0, -0.0174533F);
      LeftWing.addChild(leftwing9);
      ModelRenderer leftwing8 = new ModelRenderer(this, 0, 0);
      leftwing8.addBox(14.1F, -15.2F, -0.5F, 4, 2, 2);
      leftwing8.setTextureSize(256, 256);
      leftwing8.mirror = true;
      setRotation(leftwing8, 0F, 0, -0.0872665F);
      LeftWing.addChild(leftwing8);
      ModelRenderer leftwing7 = new ModelRenderer(this, 0, 0);
      leftwing7.addBox(9.3F, -18.8F, -0.5F, 2, 12, 2);
      leftwing7.setTextureSize(256, 256);
      leftwing7.mirror = true;
      setRotation(leftwing7, 0F, 0, 0.2268928F);
      LeftWing.addChild(leftwing7);
      ModelRenderer leftwing6 = new ModelRenderer(this, 0, 0);
      leftwing6.addBox(9.5F, -18.2F, -0.5F, 2, 12, 2);
      leftwing6.setTextureSize(256, 256);
      leftwing6.mirror = true;
      setRotation(leftwing6, 0F, 0, 0.1919862F);
      LeftWing.addChild(leftwing6);
      ModelRenderer leftwing5 = new ModelRenderer(this, 0, 0);
      leftwing5.addBox(5.7F, 1.8F, -0.5F, 7, 2, 2);
      leftwing5.setTextureSize(256, 256);
      leftwing5.mirror = true;
      setRotation(leftwing5, 0F, 0, -0.6108652F);
      LeftWing.addChild(leftwing5);
      ModelRenderer leftwing4 = new ModelRenderer(this, 0, 0);
      leftwing4.addBox(5F, 0F, -0.5F, 1, 4, 2);
      leftwing4.setTextureSize(256, 256);
      leftwing4.mirror = true;
      setRotation(leftwing4, 0F, 0, -0.9773844F);
      LeftWing.addChild(leftwing4);
      ModelRenderer leftwing = new ModelRenderer(this, 0, 0);
      leftwing.addBox(-3F, -1F, -1F, 10, 3, 3);
      leftwing.setTextureSize(256, 256);
      leftwing.mirror = true;
      setRotation(leftwing, 0F, 0, -1.047198F);
      LeftWing.addChild(leftwing);
      ModelRenderer leftwing3 = new ModelRenderer(this, 0, 0);
      leftwing3.addBox(6F, -1F, -0.5F, 1, 4, 2);
      leftwing3.setTextureSize(256, 256);
      leftwing3.mirror = true;
      setRotation(leftwing3, 0F, 0, -0.7679449F);
      LeftWing.addChild(leftwing3);
      ModelRenderer leftwing2 = new ModelRenderer(this, 0, 0);
      leftwing2.addBox(4.5F, 1F, -0.5F, 1, 4, 2);
      leftwing2.setTextureSize(256, 256);
      leftwing2.mirror = true;
      setRotation(leftwing2, 0F, 0, -0.9773844F);
      LeftWing.addChild(leftwing2);
      Body.addChild(LeftWing);
      
      ModelRenderer Head = new ModelRenderer(this, "Head");
      Head.setRotationPoint(0F, -28.5F, -0.5F);
      ModelRenderer mouth = new ModelRenderer(this, 0, 0);
      mouth.addBox(-2F, 0.7F, -13F, 4, 1, 11);
      mouth.setTextureSize(256, 256);
      mouth.mirror = true;
      setRotation(mouth, 0.1919862F, 0F, 0F);
      Head.addChild(mouth);
      ModelRenderer mouth2 = new ModelRenderer(this, 0, 0);
      mouth2.addBox(-2F, -0.5F, -13F, 4, 1, 11);
      mouth2.setTextureSize(256, 256);
      mouth2.mirror = true;
      setRotation(mouth2, 0.296706F, 0F, 0F);
      Head.addChild(mouth2);
      ModelRenderer mouth3 = new ModelRenderer(this, 46, 6);
      mouth3.addBox(-1.2F, -2.7F, -14F, 4, 2, 3);
      mouth3.setTextureSize(256, 256);
      mouth3.mirror = true;
      setRotation(mouth3, 0.296706F, 0.0436332F, -0.1396263F);
      Head.addChild(mouth3);
      ModelRenderer mouth9 = new ModelRenderer(this, 40, 0);
      mouth9.addBox(-2.8F, -2.7F, -14F, 4, 2, 3);
      mouth9.setTextureSize(256, 256);
      mouth9.mirror = true;
      setRotation(mouth9, 0.296706F, -0.0436332F, 0.1396263F);
      Head.addChild(mouth9);
      ModelRenderer head4 = new ModelRenderer(this, 0, 0);
      head4.addBox(-4.2F, -3.6F, -6.4F, 3, 1, 1);
      head4.setTextureSize(256, 256);
      head4.mirror = true;
      setRotation(head4, 0.296706F, 0F, 0.2443461F);
      Head.addChild(head4);
      ModelRenderer head3 = new ModelRenderer(this, 0, 0);
      head3.addBox(1.2F, -3.6F, -6.4F, 3, 1, 1);
      head3.setTextureSize(256, 256);
      head3.mirror = true;
      setRotation(head3, 0.296706F, 0F, -0.2443461F);
      Head.addChild(head3);
      ModelRenderer head1 = new ModelRenderer(this, 0, 0);
      head1.addBox(-4F, -2F, -4F, 8, 5, 6);
      head1.setTextureSize(256, 256);
      head1.mirror = true;
      setRotation(head1, 0.296706F, 0F, 0F);
      Head.addChild(head1);
      ModelRenderer lefttooth = new ModelRenderer(this, 63, 79);
      lefttooth.addBox(2.1F, -9.5F, -9.3F, 0, 1, 1);
      lefttooth.setTextureSize(256, 256);
      lefttooth.mirror = true;
      setRotation(lefttooth, 1.047198F, 0F, 0F);
      Head.addChild(lefttooth);
      ModelRenderer head2 = new ModelRenderer(this, 0, 0);
      head2.addBox(-3.5F, -4F, -6F, 7, 5, 7);
      head2.setTextureSize(256, 256);
      head2.mirror = true;
      setRotation(head2, 0.296706F, 0F, 0F);
      Head.addChild(head2);
      ModelRenderer righttooth = new ModelRenderer(this, 63, 79);
      righttooth.addBox(-2.1F, -9.5F, -9.3F, 0, 1, 1);
      righttooth.setTextureSize(256, 256);
      righttooth.mirror = true;
      setRotation(righttooth, 1.047198F, 0F, 0F);
      Head.addChild(righttooth);
      ModelRenderer righteye = new ModelRenderer(this, 63, 79);
      righteye.addBox(-3.6F, -3.5F, -6.1F, 2, 1, 2);
      righteye.setTextureSize(256, 256);
      righteye.mirror = true;
      setRotation(righteye, 0.296706F, 0F, 0F);
      Head.addChild(righteye);
      ModelRenderer mouth7 = new ModelRenderer(this, 0, 0);
      mouth7.addBox(-3.5F, -2.5F, -13F, 4, 2, 11);
      mouth7.setTextureSize(256, 256);
      mouth7.mirror = true;
      setRotation(mouth7, 0.296706F, -0.0698132F, 0F);
      Head.addChild(mouth7);
      ModelRenderer mouth8 = new ModelRenderer(this, 0, 0);
      mouth8.addBox(-2.5F, -1.5F, -14F, 5, 1, 3);
      mouth8.setTextureSize(256, 256);
      mouth8.mirror = true;
      setRotation(mouth8, 0.296706F, 0F, 0F);
      Head.addChild(mouth8);
      ModelRenderer lefteye = new ModelRenderer(this, 64, 79);
      lefteye.addBox(1.6F, -3.5F, -6.1F, 2, 1, 2);
      lefteye.setTextureSize(256, 256);
      lefteye.mirror = true;
      setRotation(lefteye, 0.296706F, 0F, 0F);
      Head.addChild(lefteye);
      ModelRenderer leftear1 = new ModelRenderer(this, 0, 0);
      leftear1.addBox(2F, -4F, -1.5F, 2, 2, 7);
      leftear1.setTextureSize(256, 256);
      leftear1.mirror = true;
      setRotation(leftear1, 0.296706F, 0.1396263F, 0F);
      Head.addChild(leftear1);
      ModelRenderer mouth4 = new ModelRenderer(this, 0, 0);
      mouth4.addBox(-2F, 2F, -13F, 4, 1, 11);
      mouth4.setTextureSize(256, 256);
      mouth4.mirror = true;
      setRotation(mouth4, 0.1047198F, 0F, 0F);
      Head.addChild(mouth4);
      ModelRenderer mouth5 = new ModelRenderer(this, 0, 0);
      mouth5.addBox(-1.5F, -3.7F, -11F, 3, 2, 12);
      mouth5.setTextureSize(256, 256);
      mouth5.mirror = true;
      setRotation(mouth5, 0.3665191F, 0F, 0F);
      Head.addChild(mouth5);
      ModelRenderer rightrear1 = new ModelRenderer(this, 0, 0);
      rightrear1.addBox(-4F, -4F, -1.5F, 2, 2, 7);
      rightrear1.setTextureSize(256, 256);
      rightrear1.mirror = true;
      setRotation(rightrear1, 0.296706F, -0.1396263F, 0F);
      Head.addChild(rightrear1);
      ModelRenderer mouth6 = new ModelRenderer(this, 0, 0);
      mouth6.addBox(-0.5F, -2.5F, -13F, 4, 2, 11);
      mouth6.setTextureSize(256, 256);
      mouth6.mirror = true;
      setRotation(mouth6, 0.296706F, 0.0698132F, 0F);
      Head.addChild(mouth6);
      Body.addChild(Head);
      
	  ModelRenderer Tail = new ModelRenderer(this, "Tail");
      Tail.setRotationPoint(0F, 10F, 9.7F);
      ModelRenderer flame_tale = new ModelRenderer(this, 84, 32);
      flame_tale.addBox(0F, 36.9F, 6F, 0, 19, 21);
      flame_tale.setTextureSize(256, 256);
      flame_tale.mirror = true;
      setRotation(flame_tale, 1.448623F, 0F, 0F);
      Tail.addChild(flame_tale);
      ModelRenderer tail = new ModelRenderer(this, 0, 122);
      tail.addBox(-6F, -3F, -8F, 12, 13, 14);
      tail.setTextureSize(256, 256);
      tail.mirror = true;
      setRotation(tail, -0.3141593F, 0F, 0F);
      Tail.addChild(tail);
      ModelRenderer tail2 = new ModelRenderer(this, 0, 152);
      tail2.addBox(-5F, -2F, 4F, 10, 11, 13);
      tail2.setTextureSize(256, 256);
      tail2.mirror = true;
      setRotation(tail2, -0.2617994F, 0F, 0F);
      Tail.addChild(tail2);
      ModelRenderer tail3 = new ModelRenderer(this, 0, 179);
      tail3.addBox(-4.5F, 0.5F, 15F, 9, 10, 9);
      tail3.setTextureSize(256, 256);
      tail3.mirror = true;
      setRotation(tail3, -0.1570796F, 0F, 0F);
      Tail.addChild(tail3);
      ModelRenderer tail4 = new ModelRenderer(this, 0, 200);
      tail4.addBox(-3.5F, 3F, 21F, 7, 8, 7);
      tail4.setTextureSize(256, 256);
      tail4.mirror = true;
      setRotation(tail4, -0.122173F, 0F, 0F);
      Tail.addChild(tail4);
      ModelRenderer tail5 = new ModelRenderer(this, 0, 218);
      tail5.addBox(-3F, 3.5F, 26F, 6, 7, 6);
      tail5.setTextureSize(256, 256);
      tail5.mirror = true;
      setRotation(tail5, -0.122173F, 0F, 0F);
      Tail.addChild(tail5);
      ModelRenderer tail6 = new ModelRenderer(this, 0, 234);
      tail6.addBox(-2.5F, 4F, 29F, 5, 6, 8);
      tail6.setTextureSize(256, 256);
      tail6.mirror = true;
      setRotation(tail6, -0.122173F, 0F, 0F);
      Tail.addChild(tail6);
      ModelRenderer tail7 = new ModelRenderer(this, 59, 140);
      tail7.addBox(-2F, 8.5F, 32F, 4, 5, 7);
      tail7.setTextureSize(256, 256);
      tail7.mirror = true;
      setRotation(tail7, 0F, 0F, 0F);
      Tail.addChild(tail7);
      ModelRenderer tail8 = new ModelRenderer(this, 59, 155);
      tail8.addBox(-1.5F, 14F, 34F, 3, 4, 6);
      tail8.setTextureSize(256, 256);
      tail8.mirror = true;
      setRotation(tail8, 0.1396263F, 0F, 0F);
      Tail.addChild(tail8);
      ModelRenderer tail9 = new ModelRenderer(this, 59, 168);
      tail9.addBox(-1F, 30.5F, 25.5F, 2, 3, 7);
      tail9.setTextureSize(256, 256);
      tail9.mirror = true;
      setRotation(tail9, 0.6283185F, 0F, 0F);
      Tail.addChild(tail9);
      ModelRenderer tail10 = new ModelRenderer(this, 60, 182);
      tail10.addBox(-0.5F, 40.5F, 15F, 1, 2, 6);
      tail10.setTextureSize(256, 256);
      tail10.mirror = true;
      setRotation(tail10, 1.029744F, 0F, 0F);
      Tail.addChild(tail10);
      ModelRenderer tail111 = new ModelRenderer(this, 61, 195);
      tail111.addBox(-0.5F, 45.9F, 1F, 1, 1, 6);
      tail111.setTextureSize(256, 256);
      tail111.mirror = true;
      setRotation(tail111, 1.44862328F, 0F, 0F);
      Tail.addChild(tail111);
      Body.addChild(Tail);
      
	  ModelRenderer LeftArm = new ModelRenderer(this, "LeftArm");
	  LeftArm.setRotationPoint(6F, -8F, 1F);
      ModelRenderer lefthand6 = new ModelRenderer(this, 63, 79);
      lefthand6.addBox(3.6F, 21.5F, -0.1F, 0, 1, 1);
      lefthand6.setTextureSize(256, 256);
      lefthand6.mirror = true;
      setRotation(lefthand6, -0.3316126F, -0.1745329F, -0.3316126F);
      LeftArm.addChild(lefthand6);
      ModelRenderer lefthand7 = new ModelRenderer(this, 63, 79);
      lefthand7.addBox(3F, 21.2F, 3.3F, 0, 1, 1);
      lefthand7.setTextureSize(256, 256);
      lefthand7.mirror = true;
      setRotation(lefthand7, -0.3141593F, 0F, -0.3316126F);
      LeftArm.addChild(lefthand7);
      ModelRenderer lefthand5 = new ModelRenderer(this, 63, 79);
      lefthand5.addBox(3.7F, 21.2F, 2F, 0, 1, 1);
      lefthand5.setTextureSize(256, 256);
      lefthand5.mirror = true;
      setRotation(lefthand5, -0.296706F, 0.0698132F, -0.3316126F);
      LeftArm.addChild(lefthand5);
      ModelRenderer lefthand4 = new ModelRenderer(this, 0, 0);
      lefthand4.addBox(2.5F, 19.6F, 3.3F, 1, 2, 1);
      lefthand4.setTextureSize(256, 256);
      lefthand4.mirror = true;
      setRotation(lefthand4, -0.3141593F, 0F, -0.3316126F);
      LeftArm.addChild(lefthand4);
      ModelRenderer lefthand3 = new ModelRenderer(this, 0, 0);
      lefthand3.addBox(3.1F, 20F, -0.1F, 1, 2, 1);
      lefthand3.setTextureSize(256, 256);
      lefthand3.mirror = true;
      setRotation(lefthand3, -0.3316126F, -0.1745329F, -0.3316126F);
      LeftArm.addChild(lefthand3);
      ModelRenderer lefthand2 = new ModelRenderer(this, 0, 0);
      lefthand2.addBox(3.2F, 19.6F, 2F, 1, 2, 1);
      lefthand2.setTextureSize(256, 256);
      lefthand2.mirror = true;
      setRotation(lefthand2, -0.296706F, 0.0698132F, -0.3316126F);
      LeftArm.addChild(lefthand2);
      ModelRenderer lefthand = new ModelRenderer(this, 0, 0);
      lefthand.addBox(3F, 18.6F, 1.9F, 3, 2, 2);
      lefthand.setTextureSize(256, 256);
      lefthand.mirror = true;
      setRotation(lefthand, -0.3141593F, 0F, -0.3316126F);
      LeftArm.addChild(lefthand);
      ModelRenderer leftarm3 = new ModelRenderer(this, 0, 0);
      leftarm3.addBox(3.5F, 8.6F, 1.9F, 2, 10, 2);
      leftarm3.setTextureSize(256, 256);
      leftarm3.mirror = true;
      setRotation(leftarm3, -0.3141593F, 0F, -0.3316126F);
      LeftArm.addChild(leftarm3);
      ModelRenderer leftarm2 = new ModelRenderer(this, 0, 0);
      leftarm2.addBox(-0.5F, 1.6F, -1F, 2, 10, 2);
      leftarm2.setTextureSize(256, 256);
      leftarm2.mirror = true;
      setRotation(leftarm2, 0F, 0F, -0.7330383F);
      LeftArm.addChild(leftarm2);
      ModelRenderer leftarm = new ModelRenderer(this, 0, 0);
      leftarm.addBox(0F, -1F, -1.5F, 3, 3, 3);
      leftarm.setTextureSize(256, 256);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      LeftArm.addChild(leftarm);
      Body.addChild(LeftArm);
      
	  ModelRenderer RightArm = new ModelRenderer(this, "RightArm");
	  RightArm.setRotationPoint(-6F, -8F, 1F);
      ModelRenderer righthand7 = new ModelRenderer(this, 63, 79);
      righthand7.addBox(-3F, 21.2F, 3.3F, 0, 1, 1);
      righthand7.setTextureSize(256, 256);
      righthand7.mirror = true;
      setRotation(righthand7, -0.3141593F, 0F, 0.3316126F);
      RightArm.addChild(righthand7);
      ModelRenderer righthand6 = new ModelRenderer(this, 69, 79);
      righthand6.addBox(-4.6F, 21.6F, -0.1F, 0, 1, 1);
      righthand6.setTextureSize(256, 256);
      righthand6.mirror = true;
      setRotation(righthand6, -0.3316126F, 0.1745329F, 0.3316126F);
      RightArm.addChild(righthand6);
      ModelRenderer righthand5 = new ModelRenderer(this, 63, 79);
      righthand5.addBox(-3.7F, 21.2F, 2F, 0, 1, 1);
      righthand5.setTextureSize(256, 256);
      righthand5.mirror = true;
      setRotation(righthand5, -0.296706F, -0.0698132F, 0.3316126F);
      RightArm.addChild(righthand5);
      ModelRenderer righthand4 = new ModelRenderer(this, 0, 0);
      righthand4.addBox(-3.5F, 19.6F, 3.3F, 1, 2, 1);
      righthand4.setTextureSize(256, 256);
      righthand4.mirror = true;
      setRotation(righthand4, -0.3141593F, 0F, 0.3316126F);
      RightArm.addChild(righthand4);
      ModelRenderer righthand3 = new ModelRenderer(this, 0, 0);
      righthand3.addBox(-5.1F, 20F, -0.1F, 1, 2, 1);
      righthand3.setTextureSize(256, 256);
      righthand3.mirror = true;
      setRotation(righthand3, -0.3316126F, 0.1745329F, 0.3316126F);
      RightArm.addChild(righthand3);
      ModelRenderer righthand2 = new ModelRenderer(this, 0, 0);
      righthand2.addBox(-4.2F, 19.6F, 2F, 1, 2, 1);
      righthand2.setTextureSize(256, 256);
      righthand2.mirror = true;
      setRotation(righthand2, -0.296706F, -0.0698132F, 0.3316126F);
      RightArm.addChild(righthand2);
      ModelRenderer righthand1 = new ModelRenderer(this, 0, 0);
      righthand1.addBox(-6F, 18.6F, 1.9F, 3, 2, 2);
      righthand1.setTextureSize(256, 256);
      righthand1.mirror = true;
      setRotation(righthand1, -0.3141593F, 0F, 0.3316126F);
      RightArm.addChild(righthand1);
      ModelRenderer rightarm3 = new ModelRenderer(this, 0, 0);
      rightarm3.addBox(-5.5F, 8.6F, 1.9F, 2, 10, 2);
      rightarm3.setTextureSize(256, 256);
      rightarm3.mirror = true;
      setRotation(rightarm3, -0.3141593F, 0F, 0.3316126F);
      RightArm.addChild(rightarm3);
      ModelRenderer rightarm2 = new ModelRenderer(this, 0, 0);
      rightarm2.addBox(-1.5F, 1.6F, -1F, 2, 10, 2);
      rightarm2.setTextureSize(256, 256);
      rightarm2.mirror = true;
      setRotation(rightarm2, 0F, 0F, 0.7330383F);
      RightArm.addChild(rightarm2);
      ModelRenderer rightarm = new ModelRenderer(this, 0, 0);
      rightarm.addBox(-3F, -1F, -1.5F, 3, 3, 3);
      rightarm.setTextureSize(256, 256);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      RightArm.addChild(rightarm);
      Body.addChild(RightArm);
      
	  ModelRenderer LeftLeg = new ModelRenderer(this, "LeftLeg");
	  LeftLeg.setRotationPoint(10F, 16F, 0F);
      ModelRenderer leftleg15 = new ModelRenderer(this, 61, 79);
      leftleg15.addBox(4F, 8.5F, -11.5F, 1, 1, 6);
      leftleg15.setTextureSize(256, 256);
      leftleg15.mirror = true;
      setRotation(leftleg15, 0.1396263F, -0.7330383F, 0F);
      LeftLeg.addChild(leftleg15);
      ModelRenderer leftleg14 = new ModelRenderer(this, 61, 79);
      leftleg14.addBox(4F, 9.99F, -9.5F, 1, 1, 6);
      leftleg14.setTextureSize(256, 256);
      leftleg14.mirror = true;
      setRotation(leftleg14, 0F, -0.7330383F, 0F);
      LeftLeg.addChild(leftleg14);
      ModelRenderer leftleg13 = new ModelRenderer(this, 61, 79);
      leftleg13.addBox(2.5F, 8.5F, -11.5F, 1, 1, 6);
      leftleg13.setTextureSize(256, 256);
      leftleg13.mirror = true;
      setRotation(leftleg13, 0.1396263F, -0.5235988F, 0F);
      LeftLeg.addChild(leftleg13);
      ModelRenderer leftleg12 = new ModelRenderer(this, 61, 79);
      leftleg12.setTextureSize(256, 256);
      leftleg12.mirror = true;
      setRotation(leftleg12, 0F, -0.5235988F, 0F);
      LeftLeg.addChild(leftleg12);
      ModelRenderer leftleg11 = new ModelRenderer(this, 61, 79);
      leftleg11.addBox(1F, 8.5F, -10.5F, 1, 1, 6);
      leftleg11.setTextureSize(256, 256);
      leftleg11.mirror = true;
      setRotation(leftleg11, 0.1570796F, -0.2792527F, 0F);
      LeftLeg.addChild(leftleg11);
      ModelRenderer leftleg10 = new ModelRenderer(this, 61, 79);
      leftleg10.addBox(1F, 9.99F, -8.5F, 1, 1, 6);
      leftleg10.setTextureSize(256, 256);
      leftleg10.mirror = true;
      setRotation(leftleg10, 0F, -0.2792527F, 0F);
      LeftLeg.addChild(leftleg10);
      ModelRenderer leftleg9 = new ModelRenderer(this, 0, 0);
      leftleg9.addBox(0.5F, 6F, -8.5F, 6, 2, 8);
      leftleg9.setTextureSize(256, 256);
      leftleg9.mirror = true;
      setRotation(leftleg9, 0.4363323F, -0.4537856F, 0F);
      LeftLeg.addChild(leftleg9);
      ModelRenderer leftleg8 = new ModelRenderer(this, 0, 0);
      leftleg8.addBox(-4.5F, -11F, -4F, 8, 15, 8);
      leftleg8.setTextureSize(256, 256);
      leftleg8.mirror = true;
      setRotation(leftleg8, -0.418879F, -0.418879F, -0.8726646F);
      LeftLeg.addChild(leftleg8);
      ModelRenderer leftleg7 = new ModelRenderer(this, 0, 0);
      leftleg7.addBox(2F, 9F, -7.5F, 2, 2, 6);
      leftleg7.setTextureSize(256, 256);
      leftleg7.mirror = true;
      setRotation(leftleg7, 0F, -0.5235988F, 0F);
      LeftLeg.addChild(leftleg7);
      ModelRenderer leftleg6 = new ModelRenderer(this, 0, 0);
      leftleg6.addBox(3.5F, 9F, -7.5F, 2, 2, 6);
      leftleg6.setTextureSize(256, 256);
      leftleg6.mirror = true;
      setRotation(leftleg6, 0F, -0.7330383F, 0F);
      LeftLeg.addChild(leftleg6);
      ModelRenderer leftleg5 = new ModelRenderer(this, 0, 0);
      leftleg5.addBox(0.5F, 9F, -6.5F, 2, 2, 6);
      leftleg5.setTextureSize(256, 256);
      leftleg5.mirror = true;
      setRotation(leftleg5, 0F, -0.2792527F, 0F);
      LeftLeg.addChild(leftleg5);
      ModelRenderer leftleg4 = new ModelRenderer(this, 0, 0);
      leftleg4.addBox(0.5F, 8F, -2.5F, 6, 3, 7);
      leftleg4.setTextureSize(256, 256);
      leftleg4.mirror = true;
      setRotation(leftleg4, 0F, -0.5061455F, 0F);
      LeftLeg.addChild(leftleg4);
      ModelRenderer leftleg3 = new ModelRenderer(this, 0, 0);
      leftleg3.addBox(0F, 1F, -1.5F, 7, 9, 6);
      leftleg3.setTextureSize(256, 256);
      leftleg3.mirror = true;
      setRotation(leftleg3, 0F, -0.5061455F, 0F);
      LeftLeg.addChild(leftleg3);
      ModelRenderer leftleg2 = new ModelRenderer(this, 0, 0);
      leftleg2.addBox(-3F, -3F, -7F, 7, 7, 6);
      leftleg2.setTextureSize(256, 256);
      leftleg2.mirror = true;
      setRotation(leftleg2, 0.9250245F, -0.418879F, -0.4537856F);
      LeftLeg.addChild(leftleg2);
      ModelRenderer leftleg = new ModelRenderer(this, 0, 0);
      leftleg.addBox(-4F, -9F, -5F, 9, 16, 11);
      leftleg.setTextureSize(256, 256);
      leftleg.mirror = true;
      setRotation(leftleg, -0.418879F, -0.418879F, -0.6632251F);
      LeftLeg.addChild(leftleg);
      Body.addChild(LeftLeg);
      
	  ModelRenderer RightLeg = new ModelRenderer(this, "RightLeg");
	  RightLeg.setRotationPoint(-10F, 16F, 0F);
      ModelRenderer rightleg15 = new ModelRenderer(this, 61, 79);
      rightleg15.addBox(-5F, 8.5F, -11.5F, 1, 1, 6);
      rightleg15.setTextureSize(256, 256);
      rightleg15.mirror = true;
      setRotation(rightleg15, 0.1396263F, 0.7330383F, 0F);
      RightLeg.addChild(rightleg15);
      ModelRenderer rightleg14 = new ModelRenderer(this, 61, 79);
      rightleg14.addBox(-5F, 9.99F, -9.5F, 1, 1, 6);
      rightleg14.setTextureSize(256, 256);
      rightleg14.mirror = true;
      setRotation(rightleg14, 0F, 0.7330383F, 0F);
      RightLeg.addChild(rightleg14);
      ModelRenderer rightleg13 = new ModelRenderer(this, 61, 79);
      rightleg13.addBox(-3.5F, 8.5F, -11.5F, 1, 1, 6);
      rightleg13.setTextureSize(256, 256);
      rightleg13.mirror = true;
      setRotation(rightleg13, 0.1396263F, 0.5235988F, 0F);
      RightLeg.addChild(rightleg13);
      ModelRenderer rightleg12 = new ModelRenderer(this, 61, 79);
      rightleg12.addBox(-3.5F, 9.99F, -9.5F, 1, 1, 6);
      rightleg12.setTextureSize(256, 256);
      rightleg12.mirror = true;
      setRotation(rightleg12, 0F, 0.5235988F, 0F);
      RightLeg.addChild(rightleg12);
      ModelRenderer rightleg11 = new ModelRenderer(this, 61, 79);
      rightleg11.addBox(-2F, 8.5F, -10.5F, 1, 1, 6);
      rightleg11.setTextureSize(256, 256);
      rightleg11.mirror = true;
      setRotation(rightleg11, 0.1570796F, 0.2792527F, 0F);
      RightLeg.addChild(rightleg11);
      ModelRenderer rightleg10 = new ModelRenderer(this, 61, 79);
      rightleg10.addBox(-2F, 9.99F, -8.5F, 1, 1, 6);
      rightleg10.setTextureSize(256, 256);
      rightleg10.mirror = true;
      setRotation(rightleg10, 0F, 0.2792527F, 0F);
      RightLeg.addChild(rightleg10);
      ModelRenderer rightleg9 = new ModelRenderer(this, 0, 0);
      rightleg9.addBox(-6.5F, 6F, -8.5F, 6, 2, 8);
      rightleg9.setTextureSize(256, 256);
      rightleg9.mirror = true;
      setRotation(rightleg9, 0.4363323F, 0.4537856F, 0F);
      RightLeg.addChild(rightleg9);
      ModelRenderer rightleg8 = new ModelRenderer(this, 0, 0);
      rightleg8.addBox(-3.5F, -11F, -4F, 8, 15, 8);
      rightleg8.setTextureSize(256, 256);
      rightleg8.mirror = true;
      setRotation(rightleg8, -0.418879F, 0.418879F, 0.8726646F);
      RightLeg.addChild(rightleg8);
      ModelRenderer rightleg7 = new ModelRenderer(this, 0, 0);
      rightleg7.addBox(-4F, 9F, -7.5F, 2, 2, 6);
      rightleg7.setTextureSize(256, 256);
      rightleg7.mirror = true;
      setRotation(rightleg7, 0F, 0.5235988F, 0F);
      RightLeg.addChild(rightleg7);
      ModelRenderer rightleg6 = new ModelRenderer(this, 0, 0);
      rightleg6.addBox(-5.5F, 9F, -7.5F, 2, 2, 6);
      rightleg6.setTextureSize(256, 256);
      rightleg6.mirror = true;
      setRotation(rightleg6, 0F, 0.7330383F, 0F);
      RightLeg.addChild(rightleg6);
      ModelRenderer rightleg5 = new ModelRenderer(this, 0, 0);
      rightleg5.addBox(-2.5F, 9F, -6.5F, 2, 2, 6);
      rightleg5.setTextureSize(256, 256);
      rightleg5.mirror = true;
      setRotation(rightleg5, 0F, 0.2792527F, 0F);
      RightLeg.addChild(rightleg5);
      ModelRenderer rightleg4 = new ModelRenderer(this, 0, 0);
      rightleg4.addBox(-6.5F, 8F, -2.5F, 6, 3, 7);
      rightleg4.setTextureSize(256, 256);
      rightleg4.mirror = true;
      setRotation(rightleg4, 0F, 0.5061455F, 0F);
      RightLeg.addChild(rightleg4);
      ModelRenderer rightleg3 = new ModelRenderer(this, 0, 0);
      rightleg3.addBox(-7F, 1F, -1.5F, 7, 9, 6);
      rightleg3.setTextureSize(256, 256);
      rightleg3.mirror = true;
      setRotation(rightleg3, 0F, 0.5061455F, 0F);
      RightLeg.addChild(rightleg3);
      ModelRenderer rightleg2 = new ModelRenderer(this, 0, 0);
      rightleg2.addBox(-4F, -3F, -7F, 7, 7, 6);
      rightleg2.setTextureSize(256, 256);
      rightleg2.mirror = true;
      setRotation(rightleg2, 0.9250245F, 0.418879F, 0.4537856F);
      RightLeg.addChild(rightleg2);
      ModelRenderer rightleg = new ModelRenderer(this, 0, 0);
      rightleg.addBox(-5F, -9F, -5F, 9, 16, 11);
      rightleg.setTextureSize(256, 256);
      rightleg.mirror = true;
      setRotation(rightleg, -0.418879F, 0.418879F, 0.6632251F);
      RightLeg.addChild(rightleg);
      Body.addChild(RightLeg);
      
      
      ModuleHead headModule = new ModuleHead(Head);
      skeleton = new SkeletonBiped(Body, headModule, LeftArm, RightArm, LeftLeg, RightLeg);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
}
