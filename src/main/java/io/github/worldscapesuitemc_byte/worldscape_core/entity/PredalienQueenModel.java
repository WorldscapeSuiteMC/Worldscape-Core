package io.github.worldscapesuitemc_byte.worldscape_core.entity;// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import io.github.worldscapesuitemc_byte.worldscape_core.WorldscapeCore;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;

public class PredalienQueenModel extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath(WorldscapeCore.MODID, "predalien_queen"), "main");
	private final ModelPart root;
	private final ModelPart gWaist;
	private final ModelPart gTail1;
	private final ModelPart gTail2;
	private final ModelPart gTail3;
	private final ModelPart gTail4;
	private final ModelPart gTail5;
	private final ModelPart gTail6;
	private final ModelPart gTail7;
	private final ModelPart gTail8;
	private final ModelPart gTail9;
	private final ModelPart gTail10;
	private final ModelPart gTail11;
	private final ModelPart gTailBlade;
	private final ModelPart gLeftLeg;
	private final ModelPart gLeftShin;
	private final ModelPart gLeftAnkle;
	private final ModelPart gLeftFoot;
	private final ModelPart gLeftMiddleToe;
	private final ModelPart gLeftMiddleToe2;
	private final ModelPart gLeftMiddleToe3;
	private final ModelPart gLeftRingToe;
	private final ModelPart gdRightIndexToe;
	private final ModelPart gRightLeg;
	private final ModelPart gRightShin;
	private final ModelPart gRightAnkle;
	private final ModelPart gRightFoot;
	private final ModelPart gRightMiddleToe;
	private final ModelPart gRightMiddleToe2;
	private final ModelPart gRightMiddleToe3;
	private final ModelPart gRightRingToe;
	private final ModelPart gdLeftIndexToe;
	private final ModelPart gLowerBody;
	private final ModelPart gUpperBody;
	private final ModelPart gNeck;
	private final ModelPart gNeckEnd;
	private final ModelPart gHead;
	private final ModelPart gFace;
	private final ModelPart gDome;
	private final ModelPart gLeftUpperMandibleBase;
	private final ModelPart gLeftUpperMandible;
	private final ModelPart gRightTopTusk3;
	private final ModelPart gRightUpperMandibleBase;
	private final ModelPart gRightUpperMandible;
	private final ModelPart gLeftTopTusk3;
	private final ModelPart gBottomJawBase;
	private final ModelPart gRightBottomMandible;
	private final ModelPart gRightBottomShieldTusk;
	private final ModelPart gRightBottomMandibleEnd;
	private final ModelPart gRightBottomTusk;
	private final ModelPart gLeftBottomMandible;
	private final ModelPart gLeftBottomShieldTusk;
	private final ModelPart gLeftBottomMandibleEnd;
	private final ModelPart gLeftBottomTusk;
	private final ModelPart gBottomJaw;
	private final ModelPart gCrest;
	private final ModelPart gUpperCrest;
	private final ModelPart gLeftUpperCrest;
	private final ModelPart gRightUpperCrest;
	private final ModelPart gLeftLowerCrest;
	private final ModelPart gLeftDreads2;
	private final ModelPart gLeftDreadBase4;
	private final ModelPart gLeftDreadMiddle4;
	private final ModelPart gLeftDreadLower4;
	private final ModelPart gLeftDreadEnd4;
	private final ModelPart gLeftDreadBase5;
	private final ModelPart gLeftDreadMiddle5;
	private final ModelPart gLeftDreadLower5;
	private final ModelPart gLeftDreadEnd5;
	private final ModelPart gLeftDreadBase6;
	private final ModelPart gLeftDreadMiddle6;
	private final ModelPart gLeftDreadLower6;
	private final ModelPart gLeftDreadEnd6;
	private final ModelPart gRightLowerCrest;
	private final ModelPart gRightDreads2;
	private final ModelPart gRightDreadBase4;
	private final ModelPart gRightDreadMiddle4;
	private final ModelPart gRightDreadLower4;
	private final ModelPart gRightDreadEnd4;
	private final ModelPart gRightDreadBase5;
	private final ModelPart gRightDreadMiddle5;
	private final ModelPart gRightDreadLower5;
	private final ModelPart gRightDreadEnd5;
	private final ModelPart gRightDreadBase6;
	private final ModelPart gRightDreadMiddle6;
	private final ModelPart gRightDreadLower6;
	private final ModelPart gRightDreadEnd6;
	private final ModelPart gExtendedMouthAngle;
	private final ModelPart gExtendedMouth;
	private final ModelPart gCenterCrest;
	private final ModelPart gLeftUndersideDreads;
	private final ModelPart gLeftDreadBase7;
	private final ModelPart gLeftDreadMiddle7;
	private final ModelPart gLeftDreadLower7;
	private final ModelPart gLeftDreadEnd7;
	private final ModelPart gLeftDreadBase8;
	private final ModelPart gLeftDreadMiddle8;
	private final ModelPart gLeftDreadLower8;
	private final ModelPart gLeftDreadEnd8;
	private final ModelPart gLeftDreadBase9;
	private final ModelPart gLeftDreadMiddle9;
	private final ModelPart gLeftDreadLower9;
	private final ModelPart gLeftDreadEnd9;
	private final ModelPart gLeftDreadBase10;
	private final ModelPart gLeftDreadMiddle10;
	private final ModelPart gLeftDreadLower10;
	private final ModelPart gLeftDreadEnd10;
	private final ModelPart gLeftDreadBase11;
	private final ModelPart gLeftDreadMiddle11;
	private final ModelPart gLeftDreadLower11;
	private final ModelPart gLeftDreadEnd11;
	private final ModelPart gLeftDreadBase12;
	private final ModelPart gLeftDreadMiddle12;
	private final ModelPart gLeftDreadLower12;
	private final ModelPart gLeftDreadEnd12;
	private final ModelPart gLeftDreadBase13;
	private final ModelPart gLeftDreadMiddle13;
	private final ModelPart gLeftDreadLower13;
	private final ModelPart gLeftDreadEnd13;
	private final ModelPart gRightUndersideDreads;
	private final ModelPart gRightDreadBase7;
	private final ModelPart gRightDreadMiddle7;
	private final ModelPart gRightDreadLower7;
	private final ModelPart gRightDreadEnd7;
	private final ModelPart gRightDreadBase8;
	private final ModelPart gRightDreadMiddle8;
	private final ModelPart gRightDreadLower8;
	private final ModelPart gRightDreadEnd8;
	private final ModelPart gRightDreadBase9;
	private final ModelPart gRightDreadMiddle9;
	private final ModelPart gRightDreadLower9;
	private final ModelPart gRightDreadEnd9;
	private final ModelPart gRightDreadBase10;
	private final ModelPart gRightDreadMiddle10;
	private final ModelPart gRightDreadLower10;
	private final ModelPart gRightDreadEnd10;
	private final ModelPart gRightDreadBase11;
	private final ModelPart gRightDreadMiddle11;
	private final ModelPart gRightDreadLower11;
	private final ModelPart gRightDreadEnd11;
	private final ModelPart gRightDreadBase12;
	private final ModelPart gRightDreadMiddle12;
	private final ModelPart gRightDreadLower12;
	private final ModelPart gRightDreadEnd12;
	private final ModelPart gRightDreadBase13;
	private final ModelPart gRightDreadMiddle13;
	private final ModelPart gRightDreadLower13;
	private final ModelPart gRightDreadEnd13;
	private final ModelPart gLeftShoulder;
	private final ModelPart gLeftBicep;
	private final ModelPart gLeftFobackm;
	private final ModelPart gLeftHand;
	private final ModelPart gLeftThumb;
	private final ModelPart gLeftThumbMid;
	private final ModelPart gLeftThumbTip;
	private final ModelPart gLeftPrimeFingers;
	private final ModelPart gLeftIndexFinger;
	private final ModelPart gLeftIndexMid;
	private final ModelPart gLeftIndexClaw;
	private final ModelPart gLeftIndexFinger2;
	private final ModelPart gLeftIndexMid2;
	private final ModelPart gLeftIndexClaw2;
	private final ModelPart gSecondaryFingers3;
	private final ModelPart gLeftSecondRingFinger;
	private final ModelPart gSecondRingMid3;
	private final ModelPart gSecondRingClaw3;
	private final ModelPart gLeftPinkyFinger;
	private final ModelPart gLeftPinkyMid;
	private final ModelPart gLeftPinkyClaw;
	private final ModelPart gRightShoulder;
	private final ModelPart gLeftBicep2;
	private final ModelPart gLeftFobackm4;
	private final ModelPart gLeftHand4;
	private final ModelPart gLeftThumb4;
	private final ModelPart gLeftThumbMid4;
	private final ModelPart gLeftThumbTip4;
	private final ModelPart gLeftPrimeFingers4;
	private final ModelPart gLeftIndexFinger7;
	private final ModelPart gLeftIndexMid7;
	private final ModelPart gLeftIndexClaw7;
	private final ModelPart gLeftIndexFinger8;
	private final ModelPart gLeftIndexMid8;
	private final ModelPart gLeftIndexClaw8;
	private final ModelPart gSecondaryFingers7;
	private final ModelPart gLeftSecondRingFinger4;
	private final ModelPart gSecondRingMid7;
	private final ModelPart gSecondRingClaw7;
	private final ModelPart gLeftPinkyFinger4;
	private final ModelPart gLeftPinkyMid4;
	private final ModelPart gLeftPinkyClaw4;
	private final ModelPart gChest;
	private final ModelPart gLeftTittyShoulder;
	private final ModelPart gLeftTittyBicep;
	private final ModelPart gLeftTittyForearm;
	private final ModelPart gLeftTittyHand;
	private final ModelPart gLeftTittyThumb;
	private final ModelPart gLeftTittyThumbEnd;
	private final ModelPart gLeftTittyIndex;
	private final ModelPart gLeftTittyIndexEnd;
	private final ModelPart gLeftTittyRing;
	private final ModelPart gLeftTittyRingEnd;
	private final ModelPart gRightTittyShoulder;
	private final ModelPart gRightTittyBicep;
	private final ModelPart gRightTittyForearm;
	private final ModelPart gRightTittyHand;
	private final ModelPart gRightTittyThumb;
	private final ModelPart gRightTittyThumbEnd;
	private final ModelPart gRightTittyIndex;
	private final ModelPart gRightTittyIndexEnd;
	private final ModelPart gRightTittyRing;
	private final ModelPart gRightTittyRingEnd;
	private final ModelPart gLeftSpines;
	private final ModelPart gLeftUpperSpine;
	private final ModelPart gLeftMiddleSpine2;
	private final ModelPart gLeftLowerSpine;
	private final ModelPart gRightSpines;
	private final ModelPart gRightUpperSpine;
	private final ModelPart gRightMiddleSpine2;
	private final ModelPart gRightLowerSpine;
	private final ModelPart root2;
	private final ModelPart bone;
	private final ModelPart gSack1;
	private final ModelPart gSack2;
	private final ModelPart gSack3;
	private final ModelPart gSack4;
	private final ModelPart gSack5;
	private final ModelPart bone2;
	private final ModelPart gSack6;
	private final ModelPart gSack7;
	private final ModelPart gSack8;

	public PredalienQueenModel(ModelPart root) {
        super(root);
        this.root = root.getChild("root");
		this.gWaist = this.root.getChild("gWaist");
		this.gTail1 = this.gWaist.getChild("gTail1");
		this.gTail2 = this.gTail1.getChild("gTail2");
		this.gTail3 = this.gTail2.getChild("gTail3");
		this.gTail4 = this.gTail3.getChild("gTail4");
		this.gTail5 = this.gTail4.getChild("gTail5");
		this.gTail6 = this.gTail5.getChild("gTail6");
		this.gTail7 = this.gTail6.getChild("gTail7");
		this.gTail8 = this.gTail7.getChild("gTail8");
		this.gTail9 = this.gTail8.getChild("gTail9");
		this.gTail10 = this.gTail9.getChild("gTail10");
		this.gTail11 = this.gTail10.getChild("gTail11");
		this.gTailBlade = this.gTail11.getChild("gTailBlade");
		this.gLeftLeg = this.gWaist.getChild("gLeftLeg");
		this.gLeftShin = this.gLeftLeg.getChild("gLeftShin");
		this.gLeftAnkle = this.gLeftShin.getChild("gLeftAnkle");
		this.gLeftFoot = this.gLeftAnkle.getChild("gLeftFoot");
		this.gLeftMiddleToe = this.gLeftFoot.getChild("gLeftMiddleToe");
		this.gLeftMiddleToe2 = this.gLeftFoot.getChild("gLeftMiddleToe2");
		this.gLeftMiddleToe3 = this.gLeftFoot.getChild("gLeftMiddleToe3");
		this.gLeftRingToe = this.gLeftFoot.getChild("gLeftRingToe");
		this.gdRightIndexToe = this.gLeftFoot.getChild("gdRightIndexToe");
		this.gRightLeg = this.gWaist.getChild("gRightLeg");
		this.gRightShin = this.gRightLeg.getChild("gRightShin");
		this.gRightAnkle = this.gRightShin.getChild("gRightAnkle");
		this.gRightFoot = this.gRightAnkle.getChild("gRightFoot");
		this.gRightMiddleToe = this.gRightFoot.getChild("gRightMiddleToe");
		this.gRightMiddleToe2 = this.gRightFoot.getChild("gRightMiddleToe2");
		this.gRightMiddleToe3 = this.gRightFoot.getChild("gRightMiddleToe3");
		this.gRightRingToe = this.gRightFoot.getChild("gRightRingToe");
		this.gdLeftIndexToe = this.gRightFoot.getChild("gdLeftIndexToe");
		this.gLowerBody = this.gWaist.getChild("gLowerBody");
		this.gUpperBody = this.gLowerBody.getChild("gUpperBody");
		this.gNeck = this.gUpperBody.getChild("gNeck");
		this.gNeckEnd = this.gNeck.getChild("gNeckEnd");
		this.gHead = this.gNeckEnd.getChild("gHead");
		this.gFace = this.gHead.getChild("gFace");
		this.gDome = this.gFace.getChild("gDome");
		this.gLeftUpperMandibleBase = this.gDome.getChild("gLeftUpperMandibleBase");
		this.gLeftUpperMandible = this.gLeftUpperMandibleBase.getChild("gLeftUpperMandible");
		this.gRightTopTusk3 = this.gLeftUpperMandible.getChild("gRightTopTusk3");
		this.gRightUpperMandibleBase = this.gDome.getChild("gRightUpperMandibleBase");
		this.gRightUpperMandible = this.gRightUpperMandibleBase.getChild("gRightUpperMandible");
		this.gLeftTopTusk3 = this.gRightUpperMandible.getChild("gLeftTopTusk3");
		this.gBottomJawBase = this.gFace.getChild("gBottomJawBase");
		this.gRightBottomMandible = this.gBottomJawBase.getChild("gRightBottomMandible");
		this.gRightBottomShieldTusk = this.gRightBottomMandible.getChild("gRightBottomShieldTusk");
		this.gRightBottomMandibleEnd = this.gRightBottomMandible.getChild("gRightBottomMandibleEnd");
		this.gRightBottomTusk = this.gRightBottomMandibleEnd.getChild("gRightBottomTusk");
		this.gLeftBottomMandible = this.gBottomJawBase.getChild("gLeftBottomMandible");
		this.gLeftBottomShieldTusk = this.gLeftBottomMandible.getChild("gLeftBottomShieldTusk");
		this.gLeftBottomMandibleEnd = this.gLeftBottomMandible.getChild("gLeftBottomMandibleEnd");
		this.gLeftBottomTusk = this.gLeftBottomMandibleEnd.getChild("gLeftBottomTusk");
		this.gBottomJaw = this.gBottomJawBase.getChild("gBottomJaw");
		this.gCrest = this.gHead.getChild("gCrest");
		this.gUpperCrest = this.gCrest.getChild("gUpperCrest");
		this.gLeftUpperCrest = this.gUpperCrest.getChild("gLeftUpperCrest");
		this.gRightUpperCrest = this.gUpperCrest.getChild("gRightUpperCrest");
		this.gLeftLowerCrest = this.gCrest.getChild("gLeftLowerCrest");
		this.gLeftDreads2 = this.gLeftLowerCrest.getChild("gLeftDreads2");
		this.gLeftDreadBase4 = this.gLeftDreads2.getChild("gLeftDreadBase4");
		this.gLeftDreadMiddle4 = this.gLeftDreadBase4.getChild("gLeftDreadMiddle4");
		this.gLeftDreadLower4 = this.gLeftDreadMiddle4.getChild("gLeftDreadLower4");
		this.gLeftDreadEnd4 = this.gLeftDreadLower4.getChild("gLeftDreadEnd4");
		this.gLeftDreadBase5 = this.gLeftDreads2.getChild("gLeftDreadBase5");
		this.gLeftDreadMiddle5 = this.gLeftDreadBase5.getChild("gLeftDreadMiddle5");
		this.gLeftDreadLower5 = this.gLeftDreadMiddle5.getChild("gLeftDreadLower5");
		this.gLeftDreadEnd5 = this.gLeftDreadLower5.getChild("gLeftDreadEnd5");
		this.gLeftDreadBase6 = this.gLeftDreads2.getChild("gLeftDreadBase6");
		this.gLeftDreadMiddle6 = this.gLeftDreadBase6.getChild("gLeftDreadMiddle6");
		this.gLeftDreadLower6 = this.gLeftDreadMiddle6.getChild("gLeftDreadLower6");
		this.gLeftDreadEnd6 = this.gLeftDreadLower6.getChild("gLeftDreadEnd6");
		this.gRightLowerCrest = this.gCrest.getChild("gRightLowerCrest");
		this.gRightDreads2 = this.gRightLowerCrest.getChild("gRightDreads2");
		this.gRightDreadBase4 = this.gRightDreads2.getChild("gRightDreadBase4");
		this.gRightDreadMiddle4 = this.gRightDreadBase4.getChild("gRightDreadMiddle4");
		this.gRightDreadLower4 = this.gRightDreadMiddle4.getChild("gRightDreadLower4");
		this.gRightDreadEnd4 = this.gRightDreadLower4.getChild("gRightDreadEnd4");
		this.gRightDreadBase5 = this.gRightDreads2.getChild("gRightDreadBase5");
		this.gRightDreadMiddle5 = this.gRightDreadBase5.getChild("gRightDreadMiddle5");
		this.gRightDreadLower5 = this.gRightDreadMiddle5.getChild("gRightDreadLower5");
		this.gRightDreadEnd5 = this.gRightDreadLower5.getChild("gRightDreadEnd5");
		this.gRightDreadBase6 = this.gRightDreads2.getChild("gRightDreadBase6");
		this.gRightDreadMiddle6 = this.gRightDreadBase6.getChild("gRightDreadMiddle6");
		this.gRightDreadLower6 = this.gRightDreadMiddle6.getChild("gRightDreadLower6");
		this.gRightDreadEnd6 = this.gRightDreadLower6.getChild("gRightDreadEnd6");
		this.gExtendedMouthAngle = this.gHead.getChild("gExtendedMouthAngle");
		this.gExtendedMouth = this.gExtendedMouthAngle.getChild("gExtendedMouth");
		this.gCenterCrest = this.gHead.getChild("gCenterCrest");
		this.gLeftUndersideDreads = this.gCenterCrest.getChild("gLeftUndersideDreads");
		this.gLeftDreadBase7 = this.gLeftUndersideDreads.getChild("gLeftDreadBase7");
		this.gLeftDreadMiddle7 = this.gLeftDreadBase7.getChild("gLeftDreadMiddle7");
		this.gLeftDreadLower7 = this.gLeftDreadMiddle7.getChild("gLeftDreadLower7");
		this.gLeftDreadEnd7 = this.gLeftDreadLower7.getChild("gLeftDreadEnd7");
		this.gLeftDreadBase8 = this.gLeftUndersideDreads.getChild("gLeftDreadBase8");
		this.gLeftDreadMiddle8 = this.gLeftDreadBase8.getChild("gLeftDreadMiddle8");
		this.gLeftDreadLower8 = this.gLeftDreadMiddle8.getChild("gLeftDreadLower8");
		this.gLeftDreadEnd8 = this.gLeftDreadLower8.getChild("gLeftDreadEnd8");
		this.gLeftDreadBase9 = this.gLeftUndersideDreads.getChild("gLeftDreadBase9");
		this.gLeftDreadMiddle9 = this.gLeftDreadBase9.getChild("gLeftDreadMiddle9");
		this.gLeftDreadLower9 = this.gLeftDreadMiddle9.getChild("gLeftDreadLower9");
		this.gLeftDreadEnd9 = this.gLeftDreadLower9.getChild("gLeftDreadEnd9");
		this.gLeftDreadBase10 = this.gLeftUndersideDreads.getChild("gLeftDreadBase10");
		this.gLeftDreadMiddle10 = this.gLeftDreadBase10.getChild("gLeftDreadMiddle10");
		this.gLeftDreadLower10 = this.gLeftDreadMiddle10.getChild("gLeftDreadLower10");
		this.gLeftDreadEnd10 = this.gLeftDreadLower10.getChild("gLeftDreadEnd10");
		this.gLeftDreadBase11 = this.gLeftUndersideDreads.getChild("gLeftDreadBase11");
		this.gLeftDreadMiddle11 = this.gLeftDreadBase11.getChild("gLeftDreadMiddle11");
		this.gLeftDreadLower11 = this.gLeftDreadMiddle11.getChild("gLeftDreadLower11");
		this.gLeftDreadEnd11 = this.gLeftDreadLower11.getChild("gLeftDreadEnd11");
		this.gLeftDreadBase12 = this.gLeftUndersideDreads.getChild("gLeftDreadBase12");
		this.gLeftDreadMiddle12 = this.gLeftDreadBase12.getChild("gLeftDreadMiddle12");
		this.gLeftDreadLower12 = this.gLeftDreadMiddle12.getChild("gLeftDreadLower12");
		this.gLeftDreadEnd12 = this.gLeftDreadLower12.getChild("gLeftDreadEnd12");
		this.gLeftDreadBase13 = this.gLeftUndersideDreads.getChild("gLeftDreadBase13");
		this.gLeftDreadMiddle13 = this.gLeftDreadBase13.getChild("gLeftDreadMiddle13");
		this.gLeftDreadLower13 = this.gLeftDreadMiddle13.getChild("gLeftDreadLower13");
		this.gLeftDreadEnd13 = this.gLeftDreadLower13.getChild("gLeftDreadEnd13");
		this.gRightUndersideDreads = this.gCenterCrest.getChild("gRightUndersideDreads");
		this.gRightDreadBase7 = this.gRightUndersideDreads.getChild("gRightDreadBase7");
		this.gRightDreadMiddle7 = this.gRightDreadBase7.getChild("gRightDreadMiddle7");
		this.gRightDreadLower7 = this.gRightDreadMiddle7.getChild("gRightDreadLower7");
		this.gRightDreadEnd7 = this.gRightDreadLower7.getChild("gRightDreadEnd7");
		this.gRightDreadBase8 = this.gRightUndersideDreads.getChild("gRightDreadBase8");
		this.gRightDreadMiddle8 = this.gRightDreadBase8.getChild("gRightDreadMiddle8");
		this.gRightDreadLower8 = this.gRightDreadMiddle8.getChild("gRightDreadLower8");
		this.gRightDreadEnd8 = this.gRightDreadLower8.getChild("gRightDreadEnd8");
		this.gRightDreadBase9 = this.gRightUndersideDreads.getChild("gRightDreadBase9");
		this.gRightDreadMiddle9 = this.gRightDreadBase9.getChild("gRightDreadMiddle9");
		this.gRightDreadLower9 = this.gRightDreadMiddle9.getChild("gRightDreadLower9");
		this.gRightDreadEnd9 = this.gRightDreadLower9.getChild("gRightDreadEnd9");
		this.gRightDreadBase10 = this.gRightUndersideDreads.getChild("gRightDreadBase10");
		this.gRightDreadMiddle10 = this.gRightDreadBase10.getChild("gRightDreadMiddle10");
		this.gRightDreadLower10 = this.gRightDreadMiddle10.getChild("gRightDreadLower10");
		this.gRightDreadEnd10 = this.gRightDreadLower10.getChild("gRightDreadEnd10");
		this.gRightDreadBase11 = this.gRightUndersideDreads.getChild("gRightDreadBase11");
		this.gRightDreadMiddle11 = this.gRightDreadBase11.getChild("gRightDreadMiddle11");
		this.gRightDreadLower11 = this.gRightDreadMiddle11.getChild("gRightDreadLower11");
		this.gRightDreadEnd11 = this.gRightDreadLower11.getChild("gRightDreadEnd11");
		this.gRightDreadBase12 = this.gRightUndersideDreads.getChild("gRightDreadBase12");
		this.gRightDreadMiddle12 = this.gRightDreadBase12.getChild("gRightDreadMiddle12");
		this.gRightDreadLower12 = this.gRightDreadMiddle12.getChild("gRightDreadLower12");
		this.gRightDreadEnd12 = this.gRightDreadLower12.getChild("gRightDreadEnd12");
		this.gRightDreadBase13 = this.gRightUndersideDreads.getChild("gRightDreadBase13");
		this.gRightDreadMiddle13 = this.gRightDreadBase13.getChild("gRightDreadMiddle13");
		this.gRightDreadLower13 = this.gRightDreadMiddle13.getChild("gRightDreadLower13");
		this.gRightDreadEnd13 = this.gRightDreadLower13.getChild("gRightDreadEnd13");
		this.gLeftShoulder = this.gUpperBody.getChild("gLeftShoulder");
		this.gLeftBicep = this.gLeftShoulder.getChild("gLeftBicep");
		this.gLeftFobackm = this.gLeftBicep.getChild("gLeftFobackm");
		this.gLeftHand = this.gLeftFobackm.getChild("gLeftHand");
		this.gLeftThumb = this.gLeftHand.getChild("gLeftThumb");
		this.gLeftThumbMid = this.gLeftThumb.getChild("gLeftThumbMid");
		this.gLeftThumbTip = this.gLeftThumbMid.getChild("gLeftThumbTip");
		this.gLeftPrimeFingers = this.gLeftHand.getChild("gLeftPrimeFingers");
		this.gLeftIndexFinger = this.gLeftPrimeFingers.getChild("gLeftIndexFinger");
		this.gLeftIndexMid = this.gLeftIndexFinger.getChild("gLeftIndexMid");
		this.gLeftIndexClaw = this.gLeftIndexMid.getChild("gLeftIndexClaw");
		this.gLeftIndexFinger2 = this.gLeftPrimeFingers.getChild("gLeftIndexFinger2");
		this.gLeftIndexMid2 = this.gLeftIndexFinger2.getChild("gLeftIndexMid2");
		this.gLeftIndexClaw2 = this.gLeftIndexMid2.getChild("gLeftIndexClaw2");
		this.gSecondaryFingers3 = this.gLeftHand.getChild("gSecondaryFingers3");
		this.gLeftSecondRingFinger = this.gSecondaryFingers3.getChild("gLeftSecondRingFinger");
		this.gSecondRingMid3 = this.gLeftSecondRingFinger.getChild("gSecondRingMid3");
		this.gSecondRingClaw3 = this.gSecondRingMid3.getChild("gSecondRingClaw3");
		this.gLeftPinkyFinger = this.gSecondaryFingers3.getChild("gLeftPinkyFinger");
		this.gLeftPinkyMid = this.gLeftPinkyFinger.getChild("gLeftPinkyMid");
		this.gLeftPinkyClaw = this.gLeftPinkyMid.getChild("gLeftPinkyClaw");
		this.gRightShoulder = this.gUpperBody.getChild("gRightShoulder");
		this.gLeftBicep2 = this.gRightShoulder.getChild("gLeftBicep2");
		this.gLeftFobackm4 = this.gLeftBicep2.getChild("gLeftFobackm4");
		this.gLeftHand4 = this.gLeftFobackm4.getChild("gLeftHand4");
		this.gLeftThumb4 = this.gLeftHand4.getChild("gLeftThumb4");
		this.gLeftThumbMid4 = this.gLeftThumb4.getChild("gLeftThumbMid4");
		this.gLeftThumbTip4 = this.gLeftThumbMid4.getChild("gLeftThumbTip4");
		this.gLeftPrimeFingers4 = this.gLeftHand4.getChild("gLeftPrimeFingers4");
		this.gLeftIndexFinger7 = this.gLeftPrimeFingers4.getChild("gLeftIndexFinger7");
		this.gLeftIndexMid7 = this.gLeftIndexFinger7.getChild("gLeftIndexMid7");
		this.gLeftIndexClaw7 = this.gLeftIndexMid7.getChild("gLeftIndexClaw7");
		this.gLeftIndexFinger8 = this.gLeftPrimeFingers4.getChild("gLeftIndexFinger8");
		this.gLeftIndexMid8 = this.gLeftIndexFinger8.getChild("gLeftIndexMid8");
		this.gLeftIndexClaw8 = this.gLeftIndexMid8.getChild("gLeftIndexClaw8");
		this.gSecondaryFingers7 = this.gLeftHand4.getChild("gSecondaryFingers7");
		this.gLeftSecondRingFinger4 = this.gSecondaryFingers7.getChild("gLeftSecondRingFinger4");
		this.gSecondRingMid7 = this.gLeftSecondRingFinger4.getChild("gSecondRingMid7");
		this.gSecondRingClaw7 = this.gSecondRingMid7.getChild("gSecondRingClaw7");
		this.gLeftPinkyFinger4 = this.gSecondaryFingers7.getChild("gLeftPinkyFinger4");
		this.gLeftPinkyMid4 = this.gLeftPinkyFinger4.getChild("gLeftPinkyMid4");
		this.gLeftPinkyClaw4 = this.gLeftPinkyMid4.getChild("gLeftPinkyClaw4");
		this.gChest = this.gUpperBody.getChild("gChest");
		this.gLeftTittyShoulder = this.gChest.getChild("gLeftTittyShoulder");
		this.gLeftTittyBicep = this.gLeftTittyShoulder.getChild("gLeftTittyBicep");
		this.gLeftTittyForearm = this.gLeftTittyBicep.getChild("gLeftTittyForearm");
		this.gLeftTittyHand = this.gLeftTittyForearm.getChild("gLeftTittyHand");
		this.gLeftTittyThumb = this.gLeftTittyHand.getChild("gLeftTittyThumb");
		this.gLeftTittyThumbEnd = this.gLeftTittyThumb.getChild("gLeftTittyThumbEnd");
		this.gLeftTittyIndex = this.gLeftTittyHand.getChild("gLeftTittyIndex");
		this.gLeftTittyIndexEnd = this.gLeftTittyIndex.getChild("gLeftTittyIndexEnd");
		this.gLeftTittyRing = this.gLeftTittyHand.getChild("gLeftTittyRing");
		this.gLeftTittyRingEnd = this.gLeftTittyRing.getChild("gLeftTittyRingEnd");
		this.gRightTittyShoulder = this.gChest.getChild("gRightTittyShoulder");
		this.gRightTittyBicep = this.gRightTittyShoulder.getChild("gRightTittyBicep");
		this.gRightTittyForearm = this.gRightTittyBicep.getChild("gRightTittyForearm");
		this.gRightTittyHand = this.gRightTittyForearm.getChild("gRightTittyHand");
		this.gRightTittyThumb = this.gRightTittyHand.getChild("gRightTittyThumb");
		this.gRightTittyThumbEnd = this.gRightTittyThumb.getChild("gRightTittyThumbEnd");
		this.gRightTittyIndex = this.gRightTittyHand.getChild("gRightTittyIndex");
		this.gRightTittyIndexEnd = this.gRightTittyIndex.getChild("gRightTittyIndexEnd");
		this.gRightTittyRing = this.gRightTittyHand.getChild("gRightTittyRing");
		this.gRightTittyRingEnd = this.gRightTittyRing.getChild("gRightTittyRingEnd");
		this.gLeftSpines = this.gChest.getChild("gLeftSpines");
		this.gLeftUpperSpine = this.gLeftSpines.getChild("gLeftUpperSpine");
		this.gLeftMiddleSpine2 = this.gLeftSpines.getChild("gLeftMiddleSpine2");
		this.gLeftLowerSpine = this.gLeftSpines.getChild("gLeftLowerSpine");
		this.gRightSpines = this.gChest.getChild("gRightSpines");
		this.gRightUpperSpine = this.gRightSpines.getChild("gRightUpperSpine");
		this.gRightMiddleSpine2 = this.gRightSpines.getChild("gRightMiddleSpine2");
		this.gRightLowerSpine = this.gRightSpines.getChild("gRightLowerSpine");
		this.root2 = root.getChild("root2");
		this.bone = this.root2.getChild("bone");
		this.gSack1 = this.bone.getChild("gSack1");
		this.gSack2 = this.gSack1.getChild("gSack2");
		this.gSack3 = this.gSack2.getChild("gSack3");
		this.gSack4 = this.gSack3.getChild("gSack4");
		this.gSack5 = this.gSack4.getChild("gSack5");
		this.bone2 = this.gSack5.getChild("bone2");
		this.gSack6 = this.bone2.getChild("gSack6");
		this.gSack7 = this.gSack6.getChild("gSack7");
		this.gSack8 = this.gSack7.getChild("gSack8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 12.25F, -7.0F));

		PartDefinition gWaist = root.addOrReplaceChild("gWaist", CubeListBuilder.create().texOffs(249, 198).addBox(-6.5F, -4.9634F, -0.7327F, 13.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -43.05F, 2.5F));

		PartDefinition gTail1 = gWaist.addOrReplaceChild("gTail1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6182F, 9.0408F));

		PartDefinition abdomenspikes_r1 = gTail1.addOrReplaceChild("abdomenspikes_r1", CubeListBuilder.create().texOffs(155, 74).mirror().addBox(0.0F, -6.5F, 4.75F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3281F, 9.7F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition abdomenspikes_r2 = gTail1.addOrReplaceChild("abdomenspikes_r2", CubeListBuilder.create().texOffs(155, 74).mirror().addBox(0.0F, -6.5F, 4.75F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5781F, 9.7F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition abdomenspikes_r3 = gTail1.addOrReplaceChild("abdomenspikes_r3", CubeListBuilder.create().texOffs(155, 74).addBox(0.0F, -6.5F, 0.75F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.3281F, 9.7F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r4 = gTail1.addOrReplaceChild("abdomenspikes_r4", CubeListBuilder.create().texOffs(155, 74).mirror().addBox(0.0F, -6.5F, 4.75F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5781F, 9.7F, 1.5708F, 0.0F, 0.0F));

		PartDefinition tail_r1 = gTail1.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(257, 283).addBox(-2.2071F, -2.2071F, -4.5F, 5.0F, 5.0F, 15.0F, new CubeDeformation(1.45F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail2 = gTail1.addOrReplaceChild("gTail2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 14.35F));

		PartDefinition abdomenspikes_r5 = gTail2.addOrReplaceChild("abdomenspikes_r5", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 3.75F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5781F, 3.35F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition abdomenspikes_r6 = gTail2.addOrReplaceChild("abdomenspikes_r6", CubeListBuilder.create().texOffs(155, 78).addBox(0.0F, 6.5F, -0.25F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.3281F, -4.65F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r7 = gTail2.addOrReplaceChild("abdomenspikes_r7", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 3.75F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5781F, 3.35F, 1.5708F, 0.0F, 0.0F));

		PartDefinition abdomenspikes_r8 = gTail2.addOrReplaceChild("abdomenspikes_r8", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 3.75F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3281F, 3.35F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition tail_r2 = gTail2.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(259, 306).addBox(-2.2071F, -2.2071F, -25.275F, 5.0F, 5.0F, 13.0F, new CubeDeformation(0.9F)), PartPose.offsetAndRotation(0.0F, 0.0F, 24.775F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail3 = gTail2.addOrReplaceChild("gTail3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 12.0F));

		PartDefinition abdomenspikes_r9 = gTail3.addOrReplaceChild("abdomenspikes_r9", CubeListBuilder.create().texOffs(155, 78).addBox(0.0F, 18.25F, -0.75F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.3281F, -16.65F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r10 = gTail3.addOrReplaceChild("abdomenspikes_r10", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 2.75F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5781F, 3.1F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition abdomenspikes_r11 = gTail3.addOrReplaceChild("abdomenspikes_r11", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 3.25F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5781F, 3.1F, 1.5708F, 0.0F, 0.0F));

		PartDefinition abdomenspikes_r12 = gTail3.addOrReplaceChild("abdomenspikes_r12", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 3.25F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3281F, 3.1F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition tail_r3 = gTail3.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(259, 306).addBox(-2.2071F, -2.2071F, -25.275F, 5.0F, 5.0F, 13.0F, new CubeDeformation(0.45F)), PartPose.offsetAndRotation(0.0F, 0.0F, 24.775F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail4 = gTail3.addOrReplaceChild("gTail4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 11.95F));

		PartDefinition abdomenspikes_r13 = gTail4.addOrReplaceChild("abdomenspikes_r13", CubeListBuilder.create().texOffs(155, 78).addBox(0.0F, 30.25F, -2.5F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.3281F, -28.6F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r14 = gTail4.addOrReplaceChild("abdomenspikes_r14", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 1.25F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5781F, 3.15F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition abdomenspikes_r15 = gTail4.addOrReplaceChild("abdomenspikes_r15", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 1.75F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5781F, 3.15F, 1.5708F, 0.0F, 0.0F));

		PartDefinition abdomenspikes_r16 = gTail4.addOrReplaceChild("abdomenspikes_r16", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 1.5F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3281F, 3.15F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition tail_r4 = gTail4.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(258, 327).addBox(-2.2071F, -2.2071F, -25.275F, 5.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 24.625F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail5 = gTail4.addOrReplaceChild("gTail5", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1307F, 11.4557F));

		PartDefinition abdomenspikes_r17 = gTail5.addOrReplaceChild("abdomenspikes_r17", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.25F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7088F, 3.6943F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition abdomenspikes_r18 = gTail5.addOrReplaceChild("abdomenspikes_r18", CubeListBuilder.create().texOffs(155, 78).addBox(0.0F, 42.25F, -3.5F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.4588F, -40.0557F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r19 = gTail5.addOrReplaceChild("abdomenspikes_r19", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.75F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7088F, 3.6943F, 1.5708F, 0.0F, 0.0F));

		PartDefinition abdomenspikes_r20 = gTail5.addOrReplaceChild("abdomenspikes_r20", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.5F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4588F, 3.6943F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition tail_r5 = gTail5.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(259, 349).addBox(-1.7071F, -1.7071F, -25.275F, 4.0F, 4.0F, 14.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 24.975F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail6 = gTail5.addOrReplaceChild("gTail6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2916F, 12.1682F));

		PartDefinition abdomenspikes_r21 = gTail6.addOrReplaceChild("abdomenspikes_r21", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.5F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 0.1672F, 3.5261F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition abdomenspikes_r22 = gTail6.addOrReplaceChild("abdomenspikes_r22", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.75F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4172F, 3.5261F, 1.5708F, 0.0F, 0.0F));

		PartDefinition abdomenspikes_r23 = gTail6.addOrReplaceChild("abdomenspikes_r23", CubeListBuilder.create().texOffs(155, 78).addBox(0.0F, 54.25F, -3.75F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.1672F, -52.2239F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r24 = gTail6.addOrReplaceChild("abdomenspikes_r24", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.25F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1672F, 3.5261F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition tail_r6 = gTail6.addOrReplaceChild("tail_r6", CubeListBuilder.create().texOffs(259, 349).addBox(-1.7071F, -1.7071F, -25.275F, 4.0F, 4.0F, 14.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.25F, 24.875F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail7 = gTail6.addOrReplaceChild("gTail7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0069F, 11.8713F));

		PartDefinition abdomenspikes_r25 = gTail7.addOrReplaceChild("abdomenspikes_r25", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.25F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 0.1603F, 3.6548F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition abdomenspikes_r26 = gTail7.addOrReplaceChild("abdomenspikes_r26", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.25F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4103F, 3.6548F, 1.5708F, 0.0F, 0.0F));

		PartDefinition abdomenspikes_r27 = gTail7.addOrReplaceChild("abdomenspikes_r27", CubeListBuilder.create().texOffs(155, 78).addBox(0.0F, 66.25F, -4.0F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.1603F, -64.0952F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r28 = gTail7.addOrReplaceChild("abdomenspikes_r28", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.0F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1603F, 3.6548F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition tail_r7 = gTail7.addOrReplaceChild("tail_r7", CubeListBuilder.create().texOffs(259, 349).addBox(-1.7071F, -1.7071F, -25.275F, 4.0F, 4.0F, 14.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.25F, 24.875F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail8 = gTail7.addOrReplaceChild("gTail8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1281F, 12.3145F));

		PartDefinition abdomenspikes_r29 = gTail8.addOrReplaceChild("abdomenspikes_r29", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, -0.5F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0322F, 3.3402F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition abdomenspikes_r30 = gTail8.addOrReplaceChild("abdomenspikes_r30", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, -0.25F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2822F, 3.3402F, 1.5708F, 0.0F, 0.0F));

		PartDefinition abdomenspikes_r31 = gTail8.addOrReplaceChild("abdomenspikes_r31", CubeListBuilder.create().texOffs(155, 78).addBox(0.0F, 78.25F, -4.5F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0322F, -76.4098F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r32 = gTail8.addOrReplaceChild("abdomenspikes_r32", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, -0.75F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2822F, 3.3402F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition tail_r8 = gTail8.addOrReplaceChild("tail_r8", CubeListBuilder.create().texOffs(257, 371).addBox(-1.7071F, -1.7071F, -25.275F, 4.0F, 4.0F, 15.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.0F, -0.4F, 24.875F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail9 = gTail8.addOrReplaceChild("gTail9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0455F, 12.2596F));

		PartDefinition abdomenspikes_r33 = gTail9.addOrReplaceChild("abdomenspikes_r33", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, -1.25F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2367F, 3.8306F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition abdomenspikes_r34 = gTail9.addOrReplaceChild("abdomenspikes_r34", CubeListBuilder.create().texOffs(155, 78).addBox(0.0F, 91.0F, -5.0F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.0133F, -88.6694F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r35 = gTail9.addOrReplaceChild("abdomenspikes_r35", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, -0.75F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2367F, 3.8306F, 1.5708F, 0.0F, 0.0F));

		PartDefinition abdomenspikes_r36 = gTail9.addOrReplaceChild("abdomenspikes_r36", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, -1.0F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0133F, 3.8306F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition tail_r9 = gTail9.addOrReplaceChild("tail_r9", CubeListBuilder.create().texOffs(256, 393).addBox(-1.7071F, -1.7071F, -25.275F, 4.0F, 4.0F, 16.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 24.875F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail10 = gTail9.addOrReplaceChild("gTail10", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1146F, 13.3826F));

		PartDefinition abdomenspikes_r37 = gTail10.addOrReplaceChild("abdomenspikes_r37", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, -0.25F, 0.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3512F, 3.198F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition abdomenspikes_r38 = gTail10.addOrReplaceChild("abdomenspikes_r38", CubeListBuilder.create().texOffs(155, 78).addBox(0.0F, 103.75F, -4.0F, 0.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.1012F, -102.052F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r39 = gTail10.addOrReplaceChild("abdomenspikes_r39", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.25F, 0.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3512F, 3.198F, 1.5708F, 0.0F, 0.0F));

		PartDefinition abdomenspikes_r40 = gTail10.addOrReplaceChild("abdomenspikes_r40", CubeListBuilder.create().texOffs(155, 78).mirror().addBox(0.0F, -1.5F, 0.0F, 0.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1012F, 3.198F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition tail_r10 = gTail10.addOrReplaceChild("tail_r10", CubeListBuilder.create().texOffs(258, 416).addBox(-1.2071F, -1.2071F, -25.275F, 3.0F, 3.0F, 16.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.0F, -0.45F, 24.975F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gTail11 = gTail10.addOrReplaceChild("gTail11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1012F, 11.698F));

		PartDefinition abdomenspikes_r41 = gTail11.addOrReplaceChild("abdomenspikes_r41", CubeListBuilder.create().texOffs(155, 75).mirror().addBox(-0.25F, -4.5F, 1.0F, 0.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.25F, 6.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition abdomenspikes_r42 = gTail11.addOrReplaceChild("abdomenspikes_r42", CubeListBuilder.create().texOffs(155, 75).mirror().addBox(0.0F, -4.5F, 0.75F, 0.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.25F, 6.0F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition tail_r11 = gTail11.addOrReplaceChild("tail_r11", CubeListBuilder.create().texOffs(256, 393).addBox(-1.7071F, -1.7071F, -8.275F, 4.0F, 4.0F, 16.0F, new CubeDeformation(-0.75F))
		.texOffs(264, 401).addBox(-1.7071F, -1.7071F, -3.275F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4867F, 7.7944F, 0.0F, 0.0F, 0.7854F));

		PartDefinition abdomenspikes_r43 = gTail11.addOrReplaceChild("abdomenspikes_r43", CubeListBuilder.create().texOffs(155, 75).addBox(0.25F, -4.5F, 1.5F, 0.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.25F, 6.0F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition abdomenspikes_r44 = gTail11.addOrReplaceChild("abdomenspikes_r44", CubeListBuilder.create().texOffs(155, 75).mirror().addBox(0.0F, -4.5F, 1.25F, 0.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.25F, 6.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition gTailBlade = gTail11.addOrReplaceChild("gTailBlade", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1988F, 13.852F));

		PartDefinition tailblade_r1 = gTailBlade.addOrReplaceChild("tailblade_r1", CubeListBuilder.create().texOffs(259, 465).addBox(0.0F, -3.0F, -21.0F, 0.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 20.55F, 0.0F, 0.0F, -3.1416F));

		PartDefinition gLeftLeg = gWaist.addOrReplaceChild("gLeftLeg", CubeListBuilder.create().texOffs(319, 126).mirror().addBox(-2.5F, -4.0F, -3.0F, 6.0F, 24.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(7.45F, 2.0F, 5.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition thighbottom_r1 = gLeftLeg.addOrReplaceChild("thighbottom_r1", CubeListBuilder.create().texOffs(322, 156).mirror().addBox(-1.75F, -12.5F, -2.0F, 4.0F, 23.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition thigh_r1 = gLeftLeg.addOrReplaceChild("thigh_r1", CubeListBuilder.create().texOffs(319, 126).mirror().addBox(0.5F, -3.0F, -3.0F, 6.0F, 22.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition thigh_r2 = gLeftLeg.addOrReplaceChild("thigh_r2", CubeListBuilder.create().texOffs(319, 134).mirror().addBox(0.5F, 3.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition thightop_r1 = gLeftLeg.addOrReplaceChild("thightop_r1", CubeListBuilder.create().texOffs(323, 99).mirror().addBox(-2.0078F, -10.5123F, -1.4869F, 4.0F, 23.0F, 3.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.826F, 7.3088F, -2.9072F, 0.0421F, -0.1756F, 0.0174F));

		PartDefinition upperthigh_r1 = gLeftLeg.addOrReplaceChild("upperthigh_r1", CubeListBuilder.create().texOffs(322, 80).mirror().addBox(-2.0031F, -11.3274F, -2.9597F, 2.0F, 12.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(5.1591F, 3.6562F, -0.628F, 0.0F, 0.0F, -0.0436F));

		PartDefinition hipbone_r1 = gLeftLeg.addOrReplaceChild("hipbone_r1", CubeListBuilder.create().texOffs(319, 60).mirror().addBox(-3.0611F, -5.5403F, -2.8362F, 3.0F, 11.0F, 8.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(2.9462F, -3.4814F, -0.128F, 1.5708F, 0.0F, 0.5672F));

		PartDefinition gLeftShin = gLeftLeg.addOrReplaceChild("gLeftShin", CubeListBuilder.create().texOffs(322, 211).mirror().addBox(-2.5F, -1.7028F, -2.7597F, 5.0F, 14.0F, 3.0F, new CubeDeformation(0.25F)).mirror(false)
		.texOffs(322, 211).mirror().addBox(-2.0F, 7.2972F, -2.7597F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 18.4864F, 0.1434F, 1.1781F, 0.0F, 0.0F));

		PartDefinition shinspur_r1 = gLeftShin.addOrReplaceChild("shinspur_r1", CubeListBuilder.create().texOffs(324, 185).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 16.222F, 0.5761F, -0.0087F, 0.0F, 0.0F));

		PartDefinition shinspur_r2 = gLeftShin.addOrReplaceChild("shinspur_r2", CubeListBuilder.create().texOffs(324, 185).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 19.222F, -0.4239F, -0.4014F, 0.0F, 0.0F));

		PartDefinition topshin_r1 = gLeftShin.addOrReplaceChild("topshin_r1", CubeListBuilder.create().texOffs(324, 196).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.1856F, 1.4891F, -0.2618F, 0.0F, 0.0F));

		PartDefinition topshin_r2 = gLeftShin.addOrReplaceChild("topshin_r2", CubeListBuilder.create().texOffs(324, 193).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 3.2237F, 0.0606F, 0.3054F, 0.0F, 0.0F));

		PartDefinition gLeftAnkle = gLeftShin.addOrReplaceChild("gLeftAnkle", CubeListBuilder.create().texOffs(323, 229).mirror().addBox(-1.5F, -0.2F, -2.0F, 3.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 18.766F, -1.4062F, -0.7854F, 0.0F, 0.0F));

		PartDefinition ankle_r1 = gLeftAnkle.addOrReplaceChild("ankle_r1", CubeListBuilder.create().texOffs(323, 229).mirror().addBox(2.0F, -4.5F, -4.5F, 3.0F, 18.0F, 4.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.0F, 1.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition gLeftFoot = gLeftAnkle.addOrReplaceChild("gLeftFoot", CubeListBuilder.create().texOffs(321, 264).mirror().addBox(-2.0F, -0.7693F, -2.1896F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.5F, 14.6598F, 0.0003F));

		PartDefinition foot_r1 = gLeftFoot.addOrReplaceChild("foot_r1", CubeListBuilder.create().texOffs(319, 274).mirror().addBox(-2.0F, -1.75F, -3.25F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6899F, -3.5332F, 0.5236F, 0.0F, 0.0F));

		PartDefinition footspur_r1 = gLeftFoot.addOrReplaceChild("footspur_r1", CubeListBuilder.create().texOffs(324, 253).mirror().addBox(-1.0F, -2.3F, -0.2F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6612F, -0.0581F, 0.0436F, 0.0F, 0.0F));

		PartDefinition gLeftMiddleToe = gLeftFoot.addOrReplaceChild("gLeftMiddleToe", CubeListBuilder.create().texOffs(323, 284).mirror().addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3036F, 4.7453F, -6.1173F, 0.0873F, 0.0873F, 0.0F));

		PartDefinition toenail_r1 = gLeftMiddleToe.addOrReplaceChild("toenail_r1", CubeListBuilder.create().texOffs(325, 293).addBox(-0.6F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gLeftMiddleToe2 = gLeftFoot.addOrReplaceChild("gLeftMiddleToe2", CubeListBuilder.create().texOffs(323, 284).mirror().addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.4964F, 4.7453F, -6.1173F, 0.0873F, 0.0F, 0.0F));

		PartDefinition toenail_r2 = gLeftMiddleToe2.addOrReplaceChild("toenail_r2", CubeListBuilder.create().texOffs(325, 293).addBox(-0.6F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gLeftMiddleToe3 = gLeftFoot.addOrReplaceChild("gLeftMiddleToe3", CubeListBuilder.create().texOffs(323, 284).mirror().addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(2.2964F, 4.7453F, -6.1173F, 0.0873F, -0.0873F, 0.0F));

		PartDefinition toenail_r3 = gLeftMiddleToe3.addOrReplaceChild("toenail_r3", CubeListBuilder.create().texOffs(325, 293).addBox(-0.6F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gLeftRingToe = gLeftFoot.addOrReplaceChild("gLeftRingToe", CubeListBuilder.create().texOffs(323, 284).mirror().addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(2.5464F, 2.4953F, -2.1173F, 0.409F, -0.2868F, -0.1056F));

		PartDefinition toenail_r4 = gLeftRingToe.addOrReplaceChild("toenail_r4", CubeListBuilder.create().texOffs(325, 293).addBox(-0.6F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gdRightIndexToe = gLeftFoot.addOrReplaceChild("gdRightIndexToe", CubeListBuilder.create().texOffs(323, 284).addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-1.7464F, 2.4953F, -2.1173F, 0.409F, 0.2868F, 0.1056F));

		PartDefinition toenail_r5 = gdRightIndexToe.addOrReplaceChild("toenail_r5", CubeListBuilder.create().texOffs(325, 293).mirror().addBox(-0.4F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gRightLeg = gWaist.addOrReplaceChild("gRightLeg", CubeListBuilder.create().texOffs(319, 126).addBox(-3.5F, -4.0F, -3.0F, 6.0F, 24.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-7.45F, 2.0F, 5.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition thighbottom_r2 = gRightLeg.addOrReplaceChild("thighbottom_r2", CubeListBuilder.create().texOffs(322, 156).addBox(-2.25F, -12.5F, -2.0F, 4.0F, 23.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 8.5F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition thigh_r3 = gRightLeg.addOrReplaceChild("thigh_r3", CubeListBuilder.create().texOffs(319, 126).addBox(-6.5F, -3.0F, -3.0F, 6.0F, 22.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition thigh_r4 = gRightLeg.addOrReplaceChild("thigh_r4", CubeListBuilder.create().texOffs(319, 134).addBox(-6.5F, 3.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition thightop_r2 = gRightLeg.addOrReplaceChild("thightop_r2", CubeListBuilder.create().texOffs(323, 99).addBox(-1.9922F, -10.5123F, -1.4869F, 4.0F, 23.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-0.826F, 7.3088F, -2.9072F, 0.0421F, 0.1756F, -0.0174F));

		PartDefinition upperthigh_r2 = gRightLeg.addOrReplaceChild("upperthigh_r2", CubeListBuilder.create().texOffs(322, 80).addBox(0.0031F, -11.3274F, -2.9597F, 2.0F, 12.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-5.1591F, 3.6562F, -0.628F, 0.0F, 0.0F, 0.0436F));

		PartDefinition hipbone_r2 = gRightLeg.addOrReplaceChild("hipbone_r2", CubeListBuilder.create().texOffs(319, 60).addBox(0.061F, -5.5403F, -2.8362F, 3.0F, 11.0F, 8.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-2.9462F, -3.4814F, -0.128F, 1.5708F, 0.0F, -0.5672F));

		PartDefinition gRightShin = gRightLeg.addOrReplaceChild("gRightShin", CubeListBuilder.create().texOffs(322, 211).addBox(-2.5F, -1.7028F, -2.7597F, 5.0F, 14.0F, 3.0F, new CubeDeformation(0.25F))
		.texOffs(322, 211).addBox(-2.0F, 7.2972F, -2.7597F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 18.4864F, 0.1434F, 1.1781F, 0.0F, 0.0F));

		PartDefinition shinspur_r3 = gRightShin.addOrReplaceChild("shinspur_r3", CubeListBuilder.create().texOffs(324, 185).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 16.222F, 0.5761F, -0.0087F, 0.0F, 0.0F));

		PartDefinition shinspur_r4 = gRightShin.addOrReplaceChild("shinspur_r4", CubeListBuilder.create().texOffs(324, 185).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 19.222F, -0.4239F, -0.4014F, 0.0F, 0.0F));

		PartDefinition topshin_r3 = gRightShin.addOrReplaceChild("topshin_r3", CubeListBuilder.create().texOffs(324, 196).mirror().addBox(-1.5F, -2.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.1856F, 1.4891F, -0.2618F, 0.0F, 0.0F));

		PartDefinition topshin_r4 = gRightShin.addOrReplaceChild("topshin_r4", CubeListBuilder.create().texOffs(324, 193).mirror().addBox(-1.5F, -4.0F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2237F, 0.0606F, 0.3054F, 0.0F, 0.0F));

		PartDefinition gRightAnkle = gRightShin.addOrReplaceChild("gRightAnkle", CubeListBuilder.create().texOffs(323, 229).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 18.766F, -1.4062F, -0.7854F, 0.0F, 0.0F));

		PartDefinition ankle_r2 = gRightAnkle.addOrReplaceChild("ankle_r2", CubeListBuilder.create().texOffs(323, 229).addBox(-5.0F, -4.5F, -4.5F, 3.0F, 18.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(3.5F, 2.0F, 1.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition gRightFoot = gRightAnkle.addOrReplaceChild("gRightFoot", CubeListBuilder.create().texOffs(321, 264).addBox(-3.0F, -0.7693F, -2.1896F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 14.6598F, 0.0003F));

		PartDefinition foot_r2 = gRightFoot.addOrReplaceChild("foot_r2", CubeListBuilder.create().texOffs(319, 274).addBox(-3.0F, -1.75F, -3.25F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 3.6899F, -3.5332F, 0.5236F, 0.0F, 0.0F));

		PartDefinition footspur_r2 = gRightFoot.addOrReplaceChild("footspur_r2", CubeListBuilder.create().texOffs(324, 253).addBox(-2.0F, -2.3F, -0.2F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 1.6612F, -0.0581F, 0.0436F, 0.0F, 0.0F));

		PartDefinition gRightMiddleToe = gRightFoot.addOrReplaceChild("gRightMiddleToe", CubeListBuilder.create().texOffs(323, 284).addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(1.3036F, 4.7453F, -6.1173F, 0.0873F, -0.0873F, 0.0F));

		PartDefinition toenail_r6 = gRightMiddleToe.addOrReplaceChild("toenail_r6", CubeListBuilder.create().texOffs(325, 293).mirror().addBox(-0.4F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gRightMiddleToe2 = gRightFoot.addOrReplaceChild("gRightMiddleToe2", CubeListBuilder.create().texOffs(323, 284).addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-0.4964F, 4.7453F, -6.1173F, 0.0873F, 0.0F, 0.0F));

		PartDefinition toenail_r7 = gRightMiddleToe2.addOrReplaceChild("toenail_r7", CubeListBuilder.create().texOffs(325, 293).mirror().addBox(-0.4F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gRightMiddleToe3 = gRightFoot.addOrReplaceChild("gRightMiddleToe3", CubeListBuilder.create().texOffs(323, 284).addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-2.2964F, 4.7453F, -6.1173F, 0.0873F, 0.0873F, 0.0F));

		PartDefinition toenail_r8 = gRightMiddleToe3.addOrReplaceChild("toenail_r8", CubeListBuilder.create().texOffs(325, 293).mirror().addBox(-0.4F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gRightRingToe = gRightFoot.addOrReplaceChild("gRightRingToe", CubeListBuilder.create().texOffs(323, 284).addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-2.5464F, 2.4953F, -2.1173F, 0.409F, 0.2868F, 0.1056F));

		PartDefinition toenail_r9 = gRightRingToe.addOrReplaceChild("toenail_r9", CubeListBuilder.create().texOffs(325, 293).mirror().addBox(-0.4F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gdLeftIndexToe = gRightFoot.addOrReplaceChild("gdLeftIndexToe", CubeListBuilder.create().texOffs(323, 284).mirror().addBox(-0.5F, -0.8911F, -5.8013F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(1.7464F, 2.4953F, -2.1173F, 0.409F, -0.2868F, -0.1056F));

		PartDefinition toenail_r10 = gdLeftIndexToe.addOrReplaceChild("toenail_r10", CubeListBuilder.create().texOffs(325, 293).addBox(-0.6F, -0.8295F, -2.7048F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.1F, -0.6353F, -5.6784F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gLowerBody = gWaist.addOrReplaceChild("gLowerBody", CubeListBuilder.create().texOffs(251, 96).addBox(-5.0F, -22.578F, -5.0376F, 10.0F, 21.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(155, 74).mirror().addBox(0.0F, -17.3156F, 4.564F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2618F, 6.1767F, 0.7854F, 0.0F, 0.0F));

		PartDefinition gUpperBody = gLowerBody.addOrReplaceChild("gUpperBody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -17.8086F, 0.4545F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gNeck = gUpperBody.addOrReplaceChild("gNeck", CubeListBuilder.create().texOffs(11, 31).addBox(-4.5F, -9.626F, -5.8993F, 9.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.4205F, -1.0126F, -0.3927F, 0.0F, 0.0F));

		PartDefinition neck_r1 = gNeck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(18, 31).mirror().addBox(-4.5F, -5.0F, -6.0F, 2.0F, 10.0F, 12.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4474F, -3.6317F, 0.1007F, 0.0F, 0.0F, 0.2618F));

		PartDefinition neck_r2 = gNeck.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(18, 31).addBox(2.5F, -5.0F, -6.0F, 2.0F, 10.0F, 12.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4474F, -3.6317F, 0.1007F, 0.0F, 0.0F, -0.2618F));

		PartDefinition neck_r3 = gNeck.addOrReplaceChild("neck_r3", CubeListBuilder.create().texOffs(20, 40).addBox(-4.5F, -5.0F, -6.0F, 9.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -3.1786F, -1.7459F, -0.3054F, 0.0F, 0.0F));

		PartDefinition gNeckEnd = gNeck.addOrReplaceChild("gNeckEnd", CubeListBuilder.create().texOffs(16, 62).addBox(-3.5F, -11.695F, -3.8371F, 7.0F, 11.0F, 8.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -5.1244F, 0.1676F, 0.3927F, 0.0F, 0.0F));

		PartDefinition neck_r4 = gNeckEnd.addOrReplaceChild("neck_r4", CubeListBuilder.create().texOffs(22, 62).mirror().addBox(-3.75F, -8.5F, -6.0F, 1.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5142F, -2.8921F, 2.1629F, 0.0F, 0.0F, 0.0873F));

		PartDefinition neck_r5 = gNeckEnd.addOrReplaceChild("neck_r5", CubeListBuilder.create().texOffs(22, 62).addBox(2.75F, -8.5F, -6.0F, 1.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5142F, -2.8921F, 2.1629F, 0.0F, 0.0F, -0.0873F));

		PartDefinition gHead = gNeckEnd.addOrReplaceChild("gHead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0641F, -9.8853F, -0.6645F, -1.1781F, 0.0F, 0.0F));

		PartDefinition neck_r6 = gHead.addOrReplaceChild("neck_r6", CubeListBuilder.create().texOffs(16, 62).addBox(-3.5F, -3.0F, -1.75F, 7.0F, 11.0F, 8.0F, new CubeDeformation(-0.525F)), PartPose.offsetAndRotation(0.0F, 2.8351F, -6.4341F, 1.8326F, 0.0F, 0.0F));

		PartDefinition lowerheadback_r1 = gHead.addOrReplaceChild("lowerheadback_r1", CubeListBuilder.create().texOffs(68, 113).addBox(-3.5F, 4809.3534F, -693.1201F, 7.0F, 6.0F, 13.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.0F, -4862.0879F, 6.4166F, 0.1396F, 0.0F, 0.0F));

		PartDefinition gFace = gHead.addOrReplaceChild("gFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7258F, -2.389F, -8.7783F, 0.3927F, 0.0F, 0.0F));

		PartDefinition jawwebbing_r1 = gFace.addOrReplaceChild("jawwebbing_r1", CubeListBuilder.create().texOffs(75, 310).addBox(0.0F, -2.0F, -4.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(75, 310).mirror().addBox(4.7365F, -2.0F, -4.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1582F, 0.349F, -5.0776F, 2.3562F, 0.0F, 0.0F));

		PartDefinition upperteeth_r1 = gFace.addOrReplaceChild("upperteeth_r1", CubeListBuilder.create().texOffs(121, 359).addBox(-4.0F, -2.4683F, -4.5278F, 8.0F, 6.0F, 11.0F, new CubeDeformation(-1.75F)), PartPose.offsetAndRotation(-0.79F, -0.1277F, -7.4374F, -0.2618F, 0.0F, 0.0F));

		PartDefinition gDome = gFace.addOrReplaceChild("gDome", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7258F, -2.4242F, -4.6842F, -0.1309F, 0.0F, 0.0F));

		PartDefinition domefront_r1 = gDome.addOrReplaceChild("domefront_r1", CubeListBuilder.create().texOffs(129, 295).mirror().addBox(2.0F, -2.5F, -3.5F, 1.0F, 5.0F, 7.0F, new CubeDeformation(-0.065F)).mirror(false), PartPose.offsetAndRotation(0.1846F, -1.0152F, 0.8956F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition domefront_r2 = gDome.addOrReplaceChild("domefront_r2", CubeListBuilder.create().texOffs(129, 295).addBox(-3.0F, -2.5F, -3.5F, 1.0F, 5.0F, 7.0F, new CubeDeformation(-0.065F)), PartPose.offsetAndRotation(-0.3128F, -1.0152F, 0.8956F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition domefront_r3 = gDome.addOrReplaceChild("domefront_r3", CubeListBuilder.create().texOffs(129, 295).addBox(-3.0F, -3.4332F, -2.5186F, 6.0F, 5.0F, 7.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(-0.0641F, 0.0012F, -0.2625F, 0.0698F, 0.0F, 0.0F));

		PartDefinition face_r1 = gDome.addOrReplaceChild("face_r1", CubeListBuilder.create().texOffs(125, 328).addBox(-3.0F, -0.2109F, -4.7063F, 6.0F, 3.0F, 11.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.0641F, 0.0012F, -0.2625F, -0.1571F, 0.0F, 0.0F));

		PartDefinition domestart_r1 = gDome.addOrReplaceChild("domestart_r1", CubeListBuilder.create().texOffs(133, 312).addBox(-3.0F, -4.0987F, -2.2545F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.0641F, 0.0012F, -0.2625F, 0.8814F, 0.0F, 0.0F));

		PartDefinition gLeftUpperMandibleBase = gDome.addOrReplaceChild("gLeftUpperMandibleBase", CubeListBuilder.create().texOffs(138, 336).addBox(-0.0827F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9127F, 2.3588F, 2.4068F, -1.5708F, -0.7854F, 0.0F));

		PartDefinition gLeftUpperMandible = gLeftUpperMandibleBase.addOrReplaceChild("gLeftUpperMandible", CubeListBuilder.create().texOffs(141, 335).mirror().addBox(-0.6047F, -0.13F, -0.564F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(1.0401F, 1.8675F, 0.0321F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gRightTopTusk3 = gLeftUpperMandible.addOrReplaceChild("gRightTopTusk3", CubeListBuilder.create().texOffs(77, 334).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offset(-0.1108F, 5.415F, -0.0963F));

		PartDefinition bottomjaw_r1 = gRightTopTusk3.addOrReplaceChild("bottomjaw_r1", CubeListBuilder.create().texOffs(70, 341).addBox(-0.5F, -1.3137F, -0.479F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 2.4733F, 0.0004F, 0.0F, -1.5708F, -2.0944F));

		PartDefinition bottomjaw_r2 = gRightTopTusk3.addOrReplaceChild("bottomjaw_r2", CubeListBuilder.create().texOffs(65, 338).addBox(-0.5F, -2.8381F, -0.0344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.75F, 2.4733F, 0.0004F, 0.0F, -1.5708F, -1.7017F));

		PartDefinition gRightUpperMandibleBase = gDome.addOrReplaceChild("gRightUpperMandibleBase", CubeListBuilder.create().texOffs(138, 336).mirror().addBox(-1.9173F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.0409F, 2.3588F, 2.4068F, -1.5708F, 0.7854F, 0.0F));

		PartDefinition gRightUpperMandible = gRightUpperMandibleBase.addOrReplaceChild("gRightUpperMandible", CubeListBuilder.create().texOffs(141, 335).addBox(-0.3953F, -0.13F, -0.564F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-1.0401F, 1.8675F, 0.0321F, 0.0F, 0.0F, -0.7854F));

		PartDefinition gLeftTopTusk3 = gRightUpperMandible.addOrReplaceChild("gLeftTopTusk3", CubeListBuilder.create().texOffs(77, 334).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offset(0.1108F, 5.415F, -0.0963F));

		PartDefinition bottomjaw_r3 = gLeftTopTusk3.addOrReplaceChild("bottomjaw_r3", CubeListBuilder.create().texOffs(70, 341).mirror().addBox(-0.5F, -1.3137F, -0.479F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.75F, 2.4733F, 0.0004F, 0.0F, 1.5708F, 2.0944F));

		PartDefinition bottomjaw_r4 = gLeftTopTusk3.addOrReplaceChild("bottomjaw_r4", CubeListBuilder.create().texOffs(65, 338).mirror().addBox(-0.5F, -2.8381F, -0.0344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.75F, 2.4733F, 0.0004F, 0.0F, 1.5708F, 1.7017F));

		PartDefinition gBottomJawBase = gFace.addOrReplaceChild("gBottomJawBase", CubeListBuilder.create(), PartPose.offset(0.1569F, 0.9622F, -2.3704F));

		PartDefinition bottomjawback_r1 = gBottomJawBase.addOrReplaceChild("bottomjawback_r1", CubeListBuilder.create().texOffs(73, 306).addBox(-3.16F, -1.7359F, -1.296F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7227F, 1.5358F, 0.1021F, -0.4625F, 0.0F, 0.0F));

		PartDefinition gRightBottomMandible = gBottomJawBase.addOrReplaceChild("gRightBottomMandible", CubeListBuilder.create().texOffs(74, 327).mirror().addBox(-0.4954F, -0.9301F, -7.6621F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4273F, 4.0773F, -1.9482F, -0.2618F, 0.0F, 0.0F));

		PartDefinition jawwebbing_r2 = gRightBottomMandible.addOrReplaceChild("jawwebbing_r2", CubeListBuilder.create().texOffs(75, 312).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3245F, -2.149F, -1.5625F, 0.5847F, 0.0F, 0.0F));

		PartDefinition gRightBottomShieldTusk = gRightBottomMandible.addOrReplaceChild("gRightBottomShieldTusk", CubeListBuilder.create().texOffs(51, 338).addBox(-0.5412F, -0.3488F, -0.7116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0458F, -0.7489F, -7.1874F, -2.3562F, 0.0F, 0.0F));

		PartDefinition bottomjaw_r5 = gRightBottomShieldTusk.addOrReplaceChild("bottomjaw_r5", CubeListBuilder.create().texOffs(70, 341).mirror().addBox(-0.5F, 0.4322F, -0.6341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0412F, 0.5761F, -2.1935F, 1.789F, 0.0F, 0.0F));

		PartDefinition bottomjaw_r6 = gRightBottomShieldTusk.addOrReplaceChild("bottomjaw_r6", CubeListBuilder.create().texOffs(65, 338).mirror().addBox(-0.5F, -1.9125F, -0.7329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0412F, 0.3261F, -1.1935F, 1.4342F, -0.2139F, 0.0442F));

		PartDefinition gRightBottomMandibleEnd = gRightBottomMandible.addOrReplaceChild("gRightBottomMandibleEnd", CubeListBuilder.create().texOffs(75, 332).mirror().addBox(-0.5173F, -1.0F, -2.75F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(0.0219F, 0.0551F, -7.1611F, 0.0F, -0.7854F, 0.0F));

		PartDefinition gRightBottomTusk = gRightBottomMandibleEnd.addOrReplaceChild("gRightBottomTusk", CubeListBuilder.create().texOffs(77, 334).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0173F, -0.5F, -2.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bottomjaw_r7 = gRightBottomTusk.addOrReplaceChild("bottomjaw_r7", CubeListBuilder.create().texOffs(70, 341).mirror().addBox(-0.5F, -2.0F, -1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bottomjaw_r8 = gRightBottomTusk.addOrReplaceChild("bottomjaw_r8", CubeListBuilder.create().texOffs(65, 338).mirror().addBox(-0.5F, -3.0F, -1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, 0.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition gLeftBottomMandible = gBottomJawBase.addOrReplaceChild("gLeftBottomMandible", CubeListBuilder.create().texOffs(74, 327).addBox(-0.5046F, -0.9301F, -7.6621F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5336F, 4.0773F, -1.9482F, -0.2618F, 0.0F, 0.0F));

		PartDefinition jawwebbing_r3 = gLeftBottomMandible.addOrReplaceChild("jawwebbing_r3", CubeListBuilder.create().texOffs(75, 312).mirror().addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3245F, -2.149F, -1.5625F, 0.5847F, 0.0F, 0.0F));

		PartDefinition gLeftBottomShieldTusk = gLeftBottomMandible.addOrReplaceChild("gLeftBottomShieldTusk", CubeListBuilder.create().texOffs(51, 338).mirror().addBox(-0.4588F, -0.3488F, -0.7116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.075F)).mirror(false), PartPose.offsetAndRotation(-0.0458F, -0.7489F, -7.1874F, -2.3562F, 0.0F, 0.0F));

		PartDefinition bottomjaw_r9 = gLeftBottomShieldTusk.addOrReplaceChild("bottomjaw_r9", CubeListBuilder.create().texOffs(70, 341).addBox(-0.5F, 0.4322F, -0.6341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0412F, 0.5761F, -2.1935F, 1.789F, 0.0F, 0.0F));

		PartDefinition bottomjaw_r10 = gLeftBottomShieldTusk.addOrReplaceChild("bottomjaw_r10", CubeListBuilder.create().texOffs(65, 338).addBox(-0.5F, -1.9125F, -0.7329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0412F, 0.3261F, -1.1935F, 1.4342F, 0.2139F, -0.0442F));

		PartDefinition gLeftBottomMandibleEnd = gLeftBottomMandible.addOrReplaceChild("gLeftBottomMandibleEnd", CubeListBuilder.create().texOffs(75, 332).addBox(-0.4827F, -1.0F, -2.75F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(-0.0219F, 0.0551F, -7.1611F, 0.0F, 0.7854F, 0.0F));

		PartDefinition gLeftBottomTusk = gLeftBottomMandibleEnd.addOrReplaceChild("gLeftBottomTusk", CubeListBuilder.create().texOffs(77, 334).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0173F, -0.5F, -2.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bottomjaw_r11 = gLeftBottomTusk.addOrReplaceChild("bottomjaw_r11", CubeListBuilder.create().texOffs(70, 341).addBox(-0.5F, -2.0F, -1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bottomjaw_r12 = gLeftBottomTusk.addOrReplaceChild("bottomjaw_r12", CubeListBuilder.create().texOffs(65, 338).addBox(-0.5F, -3.0F, -1.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition gBottomJaw = gBottomJawBase.addOrReplaceChild("gBottomJaw", CubeListBuilder.create(), PartPose.offset(-0.4835F, 3.8671F, -1.6555F));

		PartDefinition bottomteeth_r1 = gBottomJaw.addOrReplaceChild("bottomteeth_r1", CubeListBuilder.create().texOffs(66, 354).addBox(-3.0F, -1.6987F, -4.7653F, 6.0F, 6.0F, 9.0F, new CubeDeformation(-1.4F)), PartPose.offsetAndRotation(-0.3992F, -3.9458F, -2.8909F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bottomjaw_r13 = gBottomJaw.addOrReplaceChild("bottomjaw_r13", CubeListBuilder.create().texOffs(70, 327).addBox(-1.69F, 1.9614F, -8.1215F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-0.2733F, -2.5813F, 1.5076F, -0.2443F, 0.0F, 0.0F));

		PartDefinition gCrest = gHead.addOrReplaceChild("gCrest", CubeListBuilder.create(), PartPose.offsetAndRotation(2.45F, -8.6633F, 16.062F, 0.2007F, 0.0F, 0.0F));

		PartDefinition gUpperCrest = gCrest.addOrReplaceChild("gUpperCrest", CubeListBuilder.create(), PartPose.offset(-2.45F, -3.3937F, -14.2306F));

		PartDefinition gLeftUpperCrest = gUpperCrest.addOrReplaceChild("gLeftUpperCrest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2348F, -2.4475F, 3.4374F, -0.0167F, -0.0033F, 0.0004F));

		PartDefinition outermiddleplate_r1 = gLeftUpperCrest.addOrReplaceChild("outermiddleplate_r1", CubeListBuilder.create().texOffs(7, 204).addBox(-5.492F, 1.2569F, -19.713F, 9.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.8276F, 2.7768F, 22.0021F, -0.0202F, 0.3081F, 0.2538F));

		PartDefinition outerupperplate7_r1 = gLeftUpperCrest.addOrReplaceChild("outerupperplate7_r1", CubeListBuilder.create().texOffs(12, 153).mirror().addBox(6.0264F, -1.2843F, -0.8653F, 9.0F, 2.0F, 10.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8128F, 3.2413F, 19.7273F, -0.0814F, 0.8773F, 0.1499F));

		PartDefinition outerupperplate8_r1 = gLeftUpperCrest.addOrReplaceChild("outerupperplate8_r1", CubeListBuilder.create().texOffs(17, 141).mirror().addBox(10.4428F, -0.0026F, -1.7432F, 7.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8128F, 3.2413F, 19.7273F, 0.0032F, 0.2423F, 0.1363F));

		PartDefinition outercresttip_r1 = gLeftUpperCrest.addOrReplaceChild("outercresttip_r1", CubeListBuilder.create().texOffs(17, 130).mirror().addBox(10.3428F, 1.2122F, 5.0135F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8128F, 3.2413F, 19.7273F, 0.2213F, 0.2423F, 0.1363F));

		PartDefinition outerupperplate7_r2 = gLeftUpperCrest.addOrReplaceChild("outerupperplate7_r2", CubeListBuilder.create().texOffs(12, 153).mirror().addBox(3.5156F, 0.6863F, 24.624F, 8.0F, 2.0F, 10.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-20.5873F, -6.7477F, 9.9603F, -0.5525F, 1.5266F, -0.2289F));

		PartDefinition outerupperplate8_r2 = gLeftUpperCrest.addOrReplaceChild("outerupperplate8_r2", CubeListBuilder.create().texOffs(17, 141).mirror().addBox(-3.45F, -0.05F, -2.6F, 6.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(12.0088F, 5.15F, 3.0351F, -0.0955F, 0.8838F, 0.1288F));

		PartDefinition outercresttip_r2 = gLeftUpperCrest.addOrReplaceChild("outercresttip_r2", CubeListBuilder.create().texOffs(17, 130).mirror().addBox(-3.5F, 0.0F, -0.25F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(15.1389F, 6.1148F, 5.7478F, 0.1227F, 0.8838F, 0.1288F));

		PartDefinition gRightUpperCrest = gUpperCrest.addOrReplaceChild("gRightUpperCrest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1066F, -2.4475F, 3.4374F, -0.0167F, 0.0033F, -0.0004F));

		PartDefinition outermiddleplate_r2 = gRightUpperCrest.addOrReplaceChild("outermiddleplate_r2", CubeListBuilder.create().texOffs(7, 204).mirror().addBox(-3.508F, 1.2569F, -19.713F, 9.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.8276F, 2.7768F, 22.0021F, -0.0202F, -0.3081F, -0.2538F));

		PartDefinition outerupperplate8_r3 = gRightUpperCrest.addOrReplaceChild("outerupperplate8_r3", CubeListBuilder.create().texOffs(12, 153).addBox(-15.0264F, -1.2843F, -0.8653F, 9.0F, 2.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8128F, 3.2413F, 19.7273F, -0.0814F, -0.8773F, -0.1499F));

		PartDefinition outerupperplate9_r1 = gRightUpperCrest.addOrReplaceChild("outerupperplate9_r1", CubeListBuilder.create().texOffs(17, 141).addBox(-17.4428F, -0.0026F, -1.7432F, 7.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8128F, 3.2413F, 19.7273F, 0.0032F, -0.2423F, -0.1363F));

		PartDefinition outercresttip_r3 = gRightUpperCrest.addOrReplaceChild("outercresttip_r3", CubeListBuilder.create().texOffs(17, 130).addBox(-17.3428F, 1.2122F, 5.0135F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8128F, 3.2413F, 19.7273F, 0.2213F, -0.2423F, -0.1363F));

		PartDefinition outerupperplate8_r4 = gRightUpperCrest.addOrReplaceChild("outerupperplate8_r4", CubeListBuilder.create().texOffs(12, 153).addBox(-11.5156F, 0.6863F, 24.624F, 8.0F, 2.0F, 10.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(20.5873F, -6.7477F, 9.9603F, -0.5525F, -1.5266F, 0.2289F));

		PartDefinition outerupperplate9_r2 = gRightUpperCrest.addOrReplaceChild("outerupperplate9_r2", CubeListBuilder.create().texOffs(17, 141).addBox(-2.55F, -0.05F, -2.6F, 6.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-12.0088F, 5.15F, 3.0351F, -0.0955F, -0.8838F, -0.1288F));

		PartDefinition outercresttip_r4 = gRightUpperCrest.addOrReplaceChild("outercresttip_r4", CubeListBuilder.create().texOffs(17, 130).addBox(-2.5F, 0.0F, -0.25F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.1389F, 6.1148F, 5.7478F, 0.1227F, -0.8838F, -0.1288F));

		PartDefinition gLeftLowerCrest = gCrest.addOrReplaceChild("gLeftLowerCrest", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6981F, -1.3578F, -6.976F, -0.1494F, -0.0152F, -0.0012F));

		PartDefinition outercresttip_r5 = gLeftLowerCrest.addOrReplaceChild("outercresttip_r5", CubeListBuilder.create().texOffs(18, 130).mirror().addBox(-0.5097F, 0.0403F, 0.2788F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.1535F, 1.2069F, -7.869F, 0.9499F, 1.2499F, 1.1442F));

		PartDefinition outerupperplate9_r3 = gLeftLowerCrest.addOrReplaceChild("outerupperplate9_r3", CubeListBuilder.create().texOffs(18, 142).mirror().addBox(-1.6485F, -0.3346F, -3.5061F, 5.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(8.1535F, 1.2069F, -7.869F, 1.905F, 1.2984F, 2.2263F));

		PartDefinition outerupperplate8_r5 = gLeftLowerCrest.addOrReplaceChild("outerupperplate8_r5", CubeListBuilder.create().texOffs(16, 157).mirror().addBox(-2.1327F, -0.492F, -6.7357F, 7.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(8.1535F, 1.2069F, -7.869F, 2.6613F, 0.9499F, 3.0889F));

		PartDefinition abdomenspikes_r45 = gLeftLowerCrest.addOrReplaceChild("abdomenspikes_r45", CubeListBuilder.create().texOffs(177, 74).addBox(-0.25F, -7.5F, -1.0F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.528F, -2.9145F, -2.6383F, 1.5909F, -0.1254F, 0.8981F));

		PartDefinition innerupperplate_r1 = gLeftLowerCrest.addOrReplaceChild("innerupperplate_r1", CubeListBuilder.create().texOffs(75, 185).mirror().addBox(-2.025F, -5.0F, -2.5F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8058F, -0.857F, -3.9168F, -1.5016F, 0.0083F, 0.1318F));

		PartDefinition neckvertibrea_r1 = gLeftLowerCrest.addOrReplaceChild("neckvertibrea_r1", CubeListBuilder.create().texOffs(159, 38).addBox(0.0F, -4.5F, -1.5F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5828F, -1.092F, -13.8805F, 1.714F, -0.182F, 0.8988F));

		PartDefinition innermiddleplate_r1 = gLeftLowerCrest.addOrReplaceChild("innermiddleplate_r1", CubeListBuilder.create().texOffs(78, 205).mirror().addBox(-2.0F, -3.5F, -1.5F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(1.8322F, -0.4783F, -11.9282F, -1.2853F, -0.02F, 0.1292F));

		PartDefinition innermiddleplate_r2 = gLeftLowerCrest.addOrReplaceChild("innermiddleplate_r2", CubeListBuilder.create().texOffs(78, 205).mirror().addBox(-1.9784F, -2.3425F, -1.2006F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7322F, -0.3828F, -13.223F, -1.3718F, -0.0175F, 0.13F));

		PartDefinition gLeftDreads2 = gLeftLowerCrest.addOrReplaceChild("gLeftDreads2", CubeListBuilder.create().texOffs(91, 399).addBox(-1.0F, -0.971F, -3.4539F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2694F, -1.4164F, -6.3352F, 0.0F, 0.0873F, -1.5708F));

		PartDefinition gLeftDreadBase4 = gLeftDreads2.addOrReplaceChild("gLeftDreadBase4", CubeListBuilder.create().texOffs(93, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0237F, -2.5154F, 0.6963F, -0.0561F, 0.0669F));

		PartDefinition gLeftDreadMiddle4 = gLeftDreadBase4.addOrReplaceChild("gLeftDreadMiddle4", CubeListBuilder.create().texOffs(93, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gLeftDreadLower4 = gLeftDreadMiddle4.addOrReplaceChild("gLeftDreadLower4", CubeListBuilder.create().texOffs(93, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition gLeftDreadEnd4 = gLeftDreadLower4.addOrReplaceChild("gLeftDreadEnd4", CubeListBuilder.create().texOffs(93, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition gLeftDreadBase5 = gLeftDreads2.addOrReplaceChild("gLeftDreadBase5", CubeListBuilder.create().texOffs(98, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(98, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0237F, -0.0154F, 0.9163F, 0.0F, 0.0F));

		PartDefinition gLeftDreadMiddle5 = gLeftDreadBase5.addOrReplaceChild("gLeftDreadMiddle5", CubeListBuilder.create().texOffs(98, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(98, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gLeftDreadLower5 = gLeftDreadMiddle5.addOrReplaceChild("gLeftDreadLower5", CubeListBuilder.create().texOffs(98, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(98, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition gLeftDreadEnd5 = gLeftDreadLower5.addOrReplaceChild("gLeftDreadEnd5", CubeListBuilder.create().texOffs(98, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(98, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition gLeftDreadBase6 = gLeftDreads2.addOrReplaceChild("gLeftDreadBase6", CubeListBuilder.create().texOffs(103, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(103, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0237F, 2.4846F, 1.3472F, 0.1611F, -0.0674F));

		PartDefinition gLeftDreadMiddle6 = gLeftDreadBase6.addOrReplaceChild("gLeftDreadMiddle6", CubeListBuilder.create().texOffs(103, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(103, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, -0.3873F, 0.0665F, 0.1615F));

		PartDefinition gLeftDreadLower6 = gLeftDreadMiddle6.addOrReplaceChild("gLeftDreadLower6", CubeListBuilder.create().texOffs(103, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(103, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition gLeftDreadEnd6 = gLeftDreadLower6.addOrReplaceChild("gLeftDreadEnd6", CubeListBuilder.create().texOffs(103, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(103, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3873F, 0.0665F, 0.1615F));

		PartDefinition gRightLowerCrest = gCrest.addOrReplaceChild("gRightLowerCrest", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3301F, -1.3578F, -6.976F, -0.1494F, 0.0152F, 0.0012F));

		PartDefinition outercresttip_r6 = gRightLowerCrest.addOrReplaceChild("outercresttip_r6", CubeListBuilder.create().texOffs(18, 130).addBox(-3.4903F, 0.0403F, 0.2788F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1535F, 1.2069F, -7.869F, 0.9499F, -1.2499F, -1.1442F));

		PartDefinition outerupperplate10_r1 = gRightLowerCrest.addOrReplaceChild("outerupperplate10_r1", CubeListBuilder.create().texOffs(18, 142).addBox(-3.3515F, -0.3346F, -3.5061F, 5.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-8.1535F, 1.2069F, -7.869F, 1.905F, -1.2984F, -2.2263F));

		PartDefinition outerupperplate9_r4 = gRightLowerCrest.addOrReplaceChild("outerupperplate9_r4", CubeListBuilder.create().texOffs(16, 157).addBox(-4.8673F, -0.492F, -6.7357F, 7.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-8.1535F, 1.2069F, -7.869F, 2.6613F, -0.9499F, -3.0889F));

		PartDefinition abdomenspikes_r46 = gRightLowerCrest.addOrReplaceChild("abdomenspikes_r46", CubeListBuilder.create().texOffs(177, 74).mirror().addBox(0.25F, -7.5F, -1.0F, 0.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.528F, -2.9145F, -2.6383F, 1.5909F, 0.1254F, -0.8981F));

		PartDefinition innerupperplate_r2 = gRightLowerCrest.addOrReplaceChild("innerupperplate_r2", CubeListBuilder.create().texOffs(75, 185).addBox(-1.975F, -5.0F, -2.5F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8058F, -0.857F, -3.9168F, -1.5016F, -0.0083F, -0.1318F));

		PartDefinition neckvertibrea_r2 = gRightLowerCrest.addOrReplaceChild("neckvertibrea_r2", CubeListBuilder.create().texOffs(159, 38).mirror().addBox(0.0F, -4.5F, -1.5F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5828F, -1.092F, -13.8805F, 1.714F, 0.182F, -0.8988F));

		PartDefinition innermiddleplate_r3 = gRightLowerCrest.addOrReplaceChild("innermiddleplate_r3", CubeListBuilder.create().texOffs(78, 205).addBox(-2.0F, -3.5F, -1.5F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-1.8322F, -0.4783F, -11.9282F, -1.2853F, 0.02F, -0.1292F));

		PartDefinition innermiddleplate_r4 = gRightLowerCrest.addOrReplaceChild("innermiddleplate_r4", CubeListBuilder.create().texOffs(78, 205).addBox(-2.0216F, -2.3425F, -1.2006F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7322F, -0.3828F, -13.223F, -1.3718F, 0.0175F, -0.13F));

		PartDefinition gRightDreads2 = gRightLowerCrest.addOrReplaceChild("gRightDreads2", CubeListBuilder.create().texOffs(91, 399).mirror().addBox(-1.0F, -0.971F, -3.4539F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2694F, -1.4164F, -6.3352F, 0.0F, -0.0873F, 1.5708F));

		PartDefinition gRightDreadBase4 = gRightDreads2.addOrReplaceChild("gRightDreadBase4", CubeListBuilder.create().texOffs(93, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(93, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0237F, -2.5154F, 0.6963F, 0.0561F, -0.0669F));

		PartDefinition gRightDreadMiddle4 = gRightDreadBase4.addOrReplaceChild("gRightDreadMiddle4", CubeListBuilder.create().texOffs(93, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(93, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gRightDreadLower4 = gRightDreadMiddle4.addOrReplaceChild("gRightDreadLower4", CubeListBuilder.create().texOffs(93, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(93, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition gRightDreadEnd4 = gRightDreadLower4.addOrReplaceChild("gRightDreadEnd4", CubeListBuilder.create().texOffs(93, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(93, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition gRightDreadBase5 = gRightDreads2.addOrReplaceChild("gRightDreadBase5", CubeListBuilder.create().texOffs(98, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(98, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0237F, -0.0154F, 0.9163F, 0.0F, 0.0F));

		PartDefinition gRightDreadMiddle5 = gRightDreadBase5.addOrReplaceChild("gRightDreadMiddle5", CubeListBuilder.create().texOffs(98, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(98, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gRightDreadLower5 = gRightDreadMiddle5.addOrReplaceChild("gRightDreadLower5", CubeListBuilder.create().texOffs(98, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(98, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition gRightDreadEnd5 = gRightDreadLower5.addOrReplaceChild("gRightDreadEnd5", CubeListBuilder.create().texOffs(98, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(98, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition gRightDreadBase6 = gRightDreads2.addOrReplaceChild("gRightDreadBase6", CubeListBuilder.create().texOffs(103, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(103, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0237F, 2.4846F, 1.3472F, -0.1611F, 0.0674F));

		PartDefinition gRightDreadMiddle6 = gRightDreadBase6.addOrReplaceChild("gRightDreadMiddle6", CubeListBuilder.create().texOffs(103, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(103, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, -0.3873F, -0.0665F, -0.1615F));

		PartDefinition gRightDreadLower6 = gRightDreadMiddle6.addOrReplaceChild("gRightDreadLower6", CubeListBuilder.create().texOffs(103, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(103, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition gRightDreadEnd6 = gRightDreadLower6.addOrReplaceChild("gRightDreadEnd6", CubeListBuilder.create().texOffs(103, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(103, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3873F, -0.0665F, -0.1615F));

		PartDefinition gExtendedMouthAngle = gHead.addOrReplaceChild("gExtendedMouthAngle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6922F, -8.3818F, 0.3927F, 0.0F, 0.0F));

		PartDefinition gExtendedMouth = gExtendedMouthAngle.addOrReplaceChild("gExtendedMouth", CubeListBuilder.create().texOffs(17, 361).addBox(-1.0F, 0.0F, -2.9F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.15F))
		.texOffs(17, 377).addBox(-3.5F, -2.5F, -7.6F, 7.0F, 7.0F, 8.0F, new CubeDeformation(-2.25F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition gCenterCrest = gHead.addOrReplaceChild("gCenterCrest", CubeListBuilder.create(), PartPose.offset(-0.0641F, -11.4487F, 19.7231F));

		PartDefinition innermidplate7_r1 = gCenterCrest.addOrReplaceChild("innermidplate7_r1", CubeListBuilder.create().texOffs(22, 241).addBox(-5.5586F, -4.0F, -1.8698F, 6.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -4.75F, -1.443F, 0.0283F, -0.2164F));

		PartDefinition innermidplate8_r1 = gCenterCrest.addOrReplaceChild("innermidplate8_r1", CubeListBuilder.create().texOffs(23, 227).addBox(-5.4345F, 1.4582F, -0.7908F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4583F, 7.6925F, -1.4037F, 0.0804F, -0.2072F));

		PartDefinition innermidplate7_r2 = gCenterCrest.addOrReplaceChild("innermidplate7_r2", CubeListBuilder.create().texOffs(23, 227).mirror().addBox(-0.5655F, 1.4582F, -0.7908F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4583F, 7.6925F, -1.4037F, -0.0804F, 0.2072F));

		PartDefinition innermidplate6_r1 = gCenterCrest.addOrReplaceChild("innermidplate6_r1", CubeListBuilder.create().texOffs(22, 241).mirror().addBox(-0.4414F, -4.0F, -1.8698F, 6.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -4.75F, -1.443F, -0.0283F, 0.2164F));

		PartDefinition innerupperplate_r3 = gCenterCrest.addOrReplaceChild("innerupperplate_r3", CubeListBuilder.create().texOffs(24, 182).mirror().addBox(-0.4241F, -4.7874F, -0.5533F, 5.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4583F, 7.6925F, -1.3977F, -0.0227F, 0.1289F));

		PartDefinition innerupperplate_r4 = gCenterCrest.addOrReplaceChild("innerupperplate_r4", CubeListBuilder.create().texOffs(24, 182).addBox(-4.5759F, -4.7874F, -0.5533F, 5.0F, 8.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.4583F, 7.6925F, -1.3977F, 0.0227F, -0.1289F));

		PartDefinition uppercenterplate_r1 = gCenterCrest.addOrReplaceChild("uppercenterplate_r1", CubeListBuilder.create().texOffs(24, 119).addBox(-3.0F, -8.2817F, 0.8877F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4583F, 7.6925F, -1.2828F, 0.0F, 0.0F));

		PartDefinition uppercentertip_r1 = gCenterCrest.addOrReplaceChild("uppercentertip_r1", CubeListBuilder.create().texOffs(25, 109).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2261F, 21.1376F, -1.1083F, 0.0F, 0.0F));

		PartDefinition centercrestsupport_r1 = gCenterCrest.addOrReplaceChild("centercrestsupport_r1", CubeListBuilder.create().texOffs(69, 31).addBox(-3.5F, 0.5F, -2.0F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0641F, 1.8025F, -2.3333F, 0.3142F, 0.0F, 0.0F));

		PartDefinition centercrestsupport_r2 = gCenterCrest.addOrReplaceChild("centercrestsupport_r2", CubeListBuilder.create().texOffs(63, 25).addBox(-3.5F, -1.25F, -8.0F, 7.0F, 3.0F, 20.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0641F, 3.3025F, -7.3333F, 0.3054F, 0.0F, 0.0F));

		PartDefinition lowerheadmid_r1 = gCenterCrest.addOrReplaceChild("lowerheadmid_r1", CubeListBuilder.create().texOffs(67, 58).addBox(-3.5F, 4805.4373F, -692.5726F, 7.0F, 5.0F, 16.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -4850.6393F, -14.3066F, 0.1396F, 0.0F, 0.0F));

		PartDefinition lowerheadfront_r1 = gCenterCrest.addOrReplaceChild("lowerheadfront_r1", CubeListBuilder.create().texOffs(68, 85).addBox(-3.5F, 3371.2836F, -3501.4839F, 7.0F, 6.0F, 14.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0641F, -4850.6393F, -13.3066F, 0.8029F, 0.0F, 0.0F));

		PartDefinition gLeftUndersideDreads = gCenterCrest.addOrReplaceChild("gLeftUndersideDreads", CubeListBuilder.create().texOffs(115, 389).addBox(-1.0F, -0.971F, -8.4539F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3354F, 2.5105F, -0.9647F, 0.2893F, 0.0829F, -0.3843F));

		PartDefinition gLeftDreadBase7 = gLeftUndersideDreads.addOrReplaceChild("gLeftDreadBase7", CubeListBuilder.create().texOffs(117, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(117, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5237F, -7.5154F, -0.7854F, 0.0F, 0.0F));

		PartDefinition gLeftDreadMiddle7 = gLeftDreadBase7.addOrReplaceChild("gLeftDreadMiddle7", CubeListBuilder.create().texOffs(117, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(117, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftDreadLower7 = gLeftDreadMiddle7.addOrReplaceChild("gLeftDreadLower7", CubeListBuilder.create().texOffs(117, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(117, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gLeftDreadEnd7 = gLeftDreadLower7.addOrReplaceChild("gLeftDreadEnd7", CubeListBuilder.create().texOffs(117, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(117, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.3927F, 0.0F, 0.3927F));

		PartDefinition gLeftDreadBase8 = gLeftUndersideDreads.addOrReplaceChild("gLeftDreadBase8", CubeListBuilder.create().texOffs(122, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(122, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5237F, -5.0154F, -0.4168F, -0.1172F, -0.3295F));

		PartDefinition gLeftDreadMiddle8 = gLeftDreadBase8.addOrReplaceChild("gLeftDreadMiddle8", CubeListBuilder.create().texOffs(122, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(122, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, -0.3442F, -0.0594F, -0.5569F));

		PartDefinition gLeftDreadLower8 = gLeftDreadMiddle8.addOrReplaceChild("gLeftDreadLower8", CubeListBuilder.create().texOffs(122, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(122, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.0807F, 0.0334F, 0.3914F));

		PartDefinition gLeftDreadEnd8 = gLeftDreadLower8.addOrReplaceChild("gLeftDreadEnd8", CubeListBuilder.create().texOffs(122, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(122, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gLeftDreadBase9 = gLeftUndersideDreads.addOrReplaceChild("gLeftDreadBase9", CubeListBuilder.create().texOffs(127, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(127, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5237F, -2.5154F, -0.3054F, 0.0F, -0.3927F));

		PartDefinition gLeftDreadMiddle9 = gLeftDreadBase9.addOrReplaceChild("gLeftDreadMiddle9", CubeListBuilder.create().texOffs(127, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(127, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition gLeftDreadLower9 = gLeftDreadMiddle9.addOrReplaceChild("gLeftDreadLower9", CubeListBuilder.create().texOffs(127, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(127, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gLeftDreadEnd9 = gLeftDreadLower9.addOrReplaceChild("gLeftDreadEnd9", CubeListBuilder.create().texOffs(127, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(127, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition gLeftDreadBase10 = gLeftUndersideDreads.addOrReplaceChild("gLeftDreadBase10", CubeListBuilder.create().texOffs(132, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(132, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5237F, -0.0154F, 0.0F, 0.0F, -0.7854F));

		PartDefinition gLeftDreadMiddle10 = gLeftDreadBase10.addOrReplaceChild("gLeftDreadMiddle10", CubeListBuilder.create().texOffs(132, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(132, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftDreadLower10 = gLeftDreadMiddle10.addOrReplaceChild("gLeftDreadLower10", CubeListBuilder.create().texOffs(132, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(132, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 1.1781F));

		PartDefinition gLeftDreadEnd10 = gLeftDreadLower10.addOrReplaceChild("gLeftDreadEnd10", CubeListBuilder.create().texOffs(132, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(132, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition gLeftDreadBase11 = gLeftUndersideDreads.addOrReplaceChild("gLeftDreadBase11", CubeListBuilder.create().texOffs(137, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(137, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5237F, 2.4846F, 0.1745F, 0.0F, -0.1745F));

		PartDefinition gLeftDreadMiddle11 = gLeftDreadBase11.addOrReplaceChild("gLeftDreadMiddle11", CubeListBuilder.create().texOffs(137, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(137, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftDreadLower11 = gLeftDreadMiddle11.addOrReplaceChild("gLeftDreadLower11", CubeListBuilder.create().texOffs(137, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(137, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gLeftDreadEnd11 = gLeftDreadLower11.addOrReplaceChild("gLeftDreadEnd11", CubeListBuilder.create().texOffs(137, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(137, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, 0.3927F));

		PartDefinition gLeftDreadBase12 = gLeftUndersideDreads.addOrReplaceChild("gLeftDreadBase12", CubeListBuilder.create().texOffs(142, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(142, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5237F, 4.9846F, 0.2618F, 0.0F, 0.3927F));

		PartDefinition gLeftDreadMiddle12 = gLeftDreadBase12.addOrReplaceChild("gLeftDreadMiddle12", CubeListBuilder.create().texOffs(142, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(142, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftDreadLower12 = gLeftDreadMiddle12.addOrReplaceChild("gLeftDreadLower12", CubeListBuilder.create().texOffs(142, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(142, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftDreadEnd12 = gLeftDreadLower12.addOrReplaceChild("gLeftDreadEnd12", CubeListBuilder.create().texOffs(142, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(142, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, 0.3927F));

		PartDefinition gLeftDreadBase13 = gLeftUndersideDreads.addOrReplaceChild("gLeftDreadBase13", CubeListBuilder.create().texOffs(147, 409).addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(147, 407).addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5237F, 7.4846F, 0.3927F, 0.0F, 0.3927F));

		PartDefinition gLeftDreadMiddle13 = gLeftDreadBase13.addOrReplaceChild("gLeftDreadMiddle13", CubeListBuilder.create().texOffs(147, 416).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(147, 414).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftDreadLower13 = gLeftDreadMiddle13.addOrReplaceChild("gLeftDreadLower13", CubeListBuilder.create().texOffs(147, 422).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(147, 420).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftDreadEnd13 = gLeftDreadLower13.addOrReplaceChild("gLeftDreadEnd13", CubeListBuilder.create().texOffs(147, 429).addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(147, 427).addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, 0.3927F));

		PartDefinition gRightUndersideDreads = gCenterCrest.addOrReplaceChild("gRightUndersideDreads", CubeListBuilder.create().texOffs(115, 389).mirror().addBox(-1.0F, -0.971F, -8.4539F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3354F, 2.5105F, -0.9647F, 0.2893F, -0.0829F, 0.3843F));

		PartDefinition gRightDreadBase7 = gRightUndersideDreads.addOrReplaceChild("gRightDreadBase7", CubeListBuilder.create().texOffs(117, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(117, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5237F, -7.5154F, -0.7854F, 0.0F, 0.0F));

		PartDefinition gRightDreadMiddle7 = gRightDreadBase7.addOrReplaceChild("gRightDreadMiddle7", CubeListBuilder.create().texOffs(117, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(117, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gRightDreadLower7 = gRightDreadMiddle7.addOrReplaceChild("gRightDreadLower7", CubeListBuilder.create().texOffs(117, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(117, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gRightDreadEnd7 = gRightDreadLower7.addOrReplaceChild("gRightDreadEnd7", CubeListBuilder.create().texOffs(117, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(117, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.3927F, 0.0F, -0.3927F));

		PartDefinition gRightDreadBase8 = gRightUndersideDreads.addOrReplaceChild("gRightDreadBase8", CubeListBuilder.create().texOffs(122, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(122, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5237F, -5.0154F, -0.4168F, 0.1172F, 0.3295F));

		PartDefinition gRightDreadMiddle8 = gRightDreadBase8.addOrReplaceChild("gRightDreadMiddle8", CubeListBuilder.create().texOffs(122, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(122, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, -0.3442F, 0.0594F, 0.5569F));

		PartDefinition gRightDreadLower8 = gRightDreadMiddle8.addOrReplaceChild("gRightDreadLower8", CubeListBuilder.create().texOffs(122, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(122, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.0807F, -0.0334F, -0.3914F));

		PartDefinition gRightDreadEnd8 = gRightDreadLower8.addOrReplaceChild("gRightDreadEnd8", CubeListBuilder.create().texOffs(122, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(122, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gRightDreadBase9 = gRightUndersideDreads.addOrReplaceChild("gRightDreadBase9", CubeListBuilder.create().texOffs(127, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(127, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5237F, -2.5154F, -0.3054F, 0.0F, 0.3927F));

		PartDefinition gRightDreadMiddle9 = gRightDreadBase9.addOrReplaceChild("gRightDreadMiddle9", CubeListBuilder.create().texOffs(127, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(127, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gRightDreadLower9 = gRightDreadMiddle9.addOrReplaceChild("gRightDreadLower9", CubeListBuilder.create().texOffs(127, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(127, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition gRightDreadEnd9 = gRightDreadLower9.addOrReplaceChild("gRightDreadEnd9", CubeListBuilder.create().texOffs(127, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(127, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition gRightDreadBase10 = gRightUndersideDreads.addOrReplaceChild("gRightDreadBase10", CubeListBuilder.create().texOffs(132, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(132, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5237F, -0.0154F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gRightDreadMiddle10 = gRightDreadBase10.addOrReplaceChild("gRightDreadMiddle10", CubeListBuilder.create().texOffs(132, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(132, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gRightDreadLower10 = gRightDreadMiddle10.addOrReplaceChild("gRightDreadLower10", CubeListBuilder.create().texOffs(132, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(132, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition gRightDreadEnd10 = gRightDreadLower10.addOrReplaceChild("gRightDreadEnd10", CubeListBuilder.create().texOffs(132, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(132, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition gRightDreadBase11 = gRightUndersideDreads.addOrReplaceChild("gRightDreadBase11", CubeListBuilder.create().texOffs(137, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(137, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5237F, 2.4846F, 0.1745F, 0.0F, 0.1745F));

		PartDefinition gRightDreadMiddle11 = gRightDreadBase11.addOrReplaceChild("gRightDreadMiddle11", CubeListBuilder.create().texOffs(137, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(137, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gRightDreadLower11 = gRightDreadMiddle11.addOrReplaceChild("gRightDreadLower11", CubeListBuilder.create().texOffs(137, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(137, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gRightDreadEnd11 = gRightDreadLower11.addOrReplaceChild("gRightDreadEnd11", CubeListBuilder.create().texOffs(137, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(137, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, -0.3927F));

		PartDefinition gRightDreadBase12 = gRightUndersideDreads.addOrReplaceChild("gRightDreadBase12", CubeListBuilder.create().texOffs(142, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(142, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5237F, 4.9846F, 0.2618F, 0.0F, -0.3927F));

		PartDefinition gRightDreadMiddle12 = gRightDreadBase12.addOrReplaceChild("gRightDreadMiddle12", CubeListBuilder.create().texOffs(142, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(142, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gRightDreadLower12 = gRightDreadMiddle12.addOrReplaceChild("gRightDreadLower12", CubeListBuilder.create().texOffs(142, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(142, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gRightDreadEnd12 = gRightDreadLower12.addOrReplaceChild("gRightDreadEnd12", CubeListBuilder.create().texOffs(142, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(142, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, -0.3927F));

		PartDefinition gRightDreadBase13 = gRightUndersideDreads.addOrReplaceChild("gRightDreadBase13", CubeListBuilder.create().texOffs(147, 409).mirror().addBox(-1.0F, -0.4946F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(147, 407).mirror().addBox(0.0F, -0.4946F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5237F, 7.4846F, 0.3927F, 0.0F, -0.3927F));

		PartDefinition gRightDreadMiddle13 = gRightDreadBase13.addOrReplaceChild("gRightDreadMiddle13", CubeListBuilder.create().texOffs(147, 416).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(147, 414).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gRightDreadLower13 = gRightDreadMiddle13.addOrReplaceChild("gRightDreadLower13", CubeListBuilder.create().texOffs(147, 422).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(147, 420).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gRightDreadEnd13 = gRightDreadLower13.addOrReplaceChild("gRightDreadEnd13", CubeListBuilder.create().texOffs(147, 429).mirror().addBox(-1.0F, 0.0054F, 0.0615F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(147, 427).mirror().addBox(0.0F, 0.0054F, -0.9385F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3927F, 0.0F, -0.3927F));

		PartDefinition gLeftShoulder = gUpperBody.addOrReplaceChild("gLeftShoulder", CubeListBuilder.create().texOffs(216, 53).mirror().addBox(0.0527F, -1.4699F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(10.1059F, -7.83F, -0.7023F, -1.1781F, 0.0F, 0.0F));

		PartDefinition upperplate_r1 = gLeftShoulder.addOrReplaceChild("upperplate_r1", CubeListBuilder.create().texOffs(212, 64).mirror().addBox(-4.0F, -1.0F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(3.5642F, -0.2616F, 0.0F, 3.1416F, 0.0F, -0.7418F));

		PartDefinition upperplate_r2 = gLeftShoulder.addOrReplaceChild("upperplate_r2", CubeListBuilder.create().texOffs(212, 64).mirror().addBox(-3.6253F, -3.2417F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.3F)).mirror(false), PartPose.offsetAndRotation(3.9788F, -0.027F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition gLeftBicep = gLeftShoulder.addOrReplaceChild("gLeftBicep", CubeListBuilder.create().texOffs(216, 74).mirror().addBox(-2.0F, 0.5F, -2.5F, 4.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0525F, 0.4791F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition lowerplate_r1 = gLeftBicep.addOrReplaceChild("lowerplate_r1", CubeListBuilder.create().texOffs(212, 64).mirror().addBox(-8.0F, -1.0F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(3.3278F, 7.0098F, 0.0F, 0.0F, 0.0F, 1.1781F));

		PartDefinition bicep_r1 = gLeftBicep.addOrReplaceChild("bicep_r1", CubeListBuilder.create().texOffs(216, 79).mirror().addBox(-2.0F, -3.5F, -2.5F, 4.0F, 8.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.2541F, 10.191F, 0.0F, 3.1416F, 0.0F, 0.3054F));

		PartDefinition gLeftFobackm = gLeftBicep.addOrReplaceChild("gLeftFobackm", CubeListBuilder.create().texOffs(218, 96).mirror().addBox(-1.5F, -1.5F, -1.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(219, 113).mirror().addBox(-1.5F, 8.3F, -1.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 13.6F, -0.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition armspike_r1 = gLeftFobackm.addOrReplaceChild("armspike_r1", CubeListBuilder.create().texOffs(221, 157).mirror().addBox(-0.9419F, -6.1604F, -2.9324F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9592F, 5.99F, 1.7542F, -0.6109F, 1.1781F, 0.0F));

		PartDefinition armspike_r2 = gLeftFobackm.addOrReplaceChild("armspike_r2", CubeListBuilder.create().texOffs(221, 157).mirror().addBox(-0.9419F, -4.1612F, -2.8941F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(221, 157).mirror().addBox(-0.9419F, -2.1612F, 0.1059F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(221, 157).mirror().addBox(-0.9419F, -0.1612F, 3.1059F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9592F, 5.99F, 1.7542F, -1.3963F, 1.1781F, 0.0F));

		PartDefinition underforearm_r1 = gLeftFobackm.addOrReplaceChild("underforearm_r1", CubeListBuilder.create().texOffs(219, 130).mirror().addBox(-0.9419F, -4.1354F, -3.3586F, 2.0F, 17.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.9592F, 5.99F, 1.7542F, -0.2182F, 1.1781F, 0.0F));

		PartDefinition armspike_r3 = gLeftFobackm.addOrReplaceChild("armspike_r3", CubeListBuilder.create().texOffs(221, 157).mirror().addBox(-1.2051F, -0.9784F, 2.6985F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(221, 157).mirror().addBox(-1.2051F, -2.9784F, -0.3015F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(221, 157).mirror().addBox(-1.2051F, -4.9784F, -3.3015F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3687F, 3.5268F, 3.6736F, -1.3562F, 0.3923F, 0.0256F));

		PartDefinition armspike_r4 = gLeftFobackm.addOrReplaceChild("armspike_r4", CubeListBuilder.create().texOffs(221, 157).mirror().addBox(-1.2051F, -7.0263F, -2.6427F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3687F, 3.5268F, 3.6736F, -0.5708F, 0.3923F, 0.0256F));

		PartDefinition underforearm_r2 = gLeftFobackm.addOrReplaceChild("underforearm_r2", CubeListBuilder.create().texOffs(219, 130).mirror().addBox(-1.2051F, -4.8246F, -2.7595F, 2.0F, 18.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, 5.7768F, 1.6736F, -0.0873F, -1.1781F, 0.0F));

		PartDefinition underforearm_r3 = gLeftFobackm.addOrReplaceChild("underforearm_r3", CubeListBuilder.create().texOffs(219, 130).mirror().addBox(-1.2051F, -4.8246F, -2.7595F, 2.0F, 20.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.3687F, 3.5268F, 3.6736F, -0.1781F, 0.3923F, 0.0256F));

		PartDefinition gLeftHand = gLeftFobackm.addOrReplaceChild("gLeftHand", CubeListBuilder.create().texOffs(219, 166).mirror().addBox(-0.9841F, -0.7127F, -1.87F, 2.0F, 7.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(0.2015F, 17.7343F, 0.7679F));

		PartDefinition gLeftThumb = gLeftHand.addOrReplaceChild("gLeftThumb", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3046F, 3.8167F, -0.8017F, 0.0F, -0.3927F, 0.3927F));

		PartDefinition thumbextension_r1 = gLeftThumb.addOrReplaceChild("thumbextension_r1", CubeListBuilder.create().texOffs(230, 184).mirror().addBox(-0.7804F, -0.7138F, -0.6464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6899F, 1.2418F, -0.9051F, -3.0211F, 0.1748F, -2.6805F));

		PartDefinition thumbbase_r1 = gLeftThumb.addOrReplaceChild("thumbbase_r1", CubeListBuilder.create().texOffs(230, 180).mirror().addBox(-0.712F, -2.448F, -0.712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(-1.7001F, 0.9967F, -1.0227F, -2.7647F, -0.0084F, -2.3889F));

		PartDefinition gLeftThumbMid = gLeftThumb.addOrReplaceChild("gLeftThumbMid", CubeListBuilder.create().texOffs(230, 187).addBox(-0.336F, -0.248F, -0.606F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offset(-1.6935F, 1.6027F, -0.5176F));

		PartDefinition gLeftThumbTip = gLeftThumbMid.addOrReplaceChild("gLeftThumbTip", CubeListBuilder.create().texOffs(230, 192).addBox(-0.5264F, 0.1342F, -0.479F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.1069F, 2.2293F, -0.169F, 0.0F, 0.0F, -0.3927F));

		PartDefinition claw_r1 = gLeftThumbTip.addOrReplaceChild("claw_r1", CubeListBuilder.create().texOffs(230, 197).addBox(-0.252F, -1.832F, -0.748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0734F, 4.2283F, 0.227F, 0.0F, 0.0F, -0.1745F));

		PartDefinition gLeftPrimeFingers = gLeftHand.addOrReplaceChild("gLeftPrimeFingers", CubeListBuilder.create().texOffs(212, 179).mirror().addBox(-0.6016F, -0.4698F, -1.3169F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(0.0934F, 5.8849F, -0.0187F));

		PartDefinition gLeftIndexFinger = gLeftPrimeFingers.addOrReplaceChild("gLeftIndexFinger", CubeListBuilder.create().texOffs(212, 184).mirror().addBox(-0.622F, -0.13F, -0.564F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offset(0.0508F, 0.5849F, -0.8416F));

		PartDefinition gLeftIndexMid = gLeftIndexFinger.addOrReplaceChild("gLeftIndexMid", CubeListBuilder.create().texOffs(212, 190).mirror().addBox(-0.57F, 0.028F, -0.664F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-0.094F, 3.496F, 0.058F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gLeftIndexClaw = gLeftIndexMid.addOrReplaceChild("gLeftIndexClaw", CubeListBuilder.create().texOffs(218, 195).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.0535F, 3.5729F, -0.206F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gLeftIndexFinger2 = gLeftPrimeFingers.addOrReplaceChild("gLeftIndexFinger2", CubeListBuilder.create().texOffs(212, 184).mirror().addBox(-0.622F, -0.13F, -0.564F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(0.0508F, 0.5849F, 0.9084F, 0.1309F, 0.0F, 0.0F));

		PartDefinition gLeftIndexMid2 = gLeftIndexFinger2.addOrReplaceChild("gLeftIndexMid2", CubeListBuilder.create().texOffs(212, 190).mirror().addBox(-0.57F, 0.028F, -0.664F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-0.094F, 3.496F, 0.058F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gLeftIndexClaw2 = gLeftIndexMid2.addOrReplaceChild("gLeftIndexClaw2", CubeListBuilder.create().texOffs(218, 195).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.0535F, 3.5729F, -0.206F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gSecondaryFingers3 = gLeftHand.addOrReplaceChild("gSecondaryFingers3", CubeListBuilder.create().texOffs(222, 179).mirror().addBox(-0.7743F, -0.2364F, -1.1836F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0666F, 3.5104F, 1.6126F, 0.7854F, 0.0F, 0.0F));

		PartDefinition gLeftSecondRingFinger = gSecondaryFingers3.addOrReplaceChild("gLeftSecondRingFinger", CubeListBuilder.create().texOffs(218, 185).mirror().addBox(-1.012F, -0.248F, -0.722F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(0.2514F, 1.5867F, -0.8691F, -0.3927F, 0.0F, 0.0F));

		PartDefinition gSecondRingMid3 = gLeftSecondRingFinger.addOrReplaceChild("gSecondRingMid3", CubeListBuilder.create().texOffs(218, 190).mirror().addBox(-0.4766F, -0.0135F, -0.603F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-0.5774F, 2.3015F, -0.161F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gSecondRingClaw3 = gSecondRingMid3.addOrReplaceChild("gSecondRingClaw3", CubeListBuilder.create().texOffs(218, 195).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.0034F, 2.5775F, -0.145F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gLeftPinkyFinger = gSecondaryFingers3.addOrReplaceChild("gLeftPinkyFinger", CubeListBuilder.create().texOffs(224, 186).mirror().addBox(-1.128F, -0.35F, -0.664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(0.2996F, 1.6235F, 0.4946F, -0.2182F, 0.0F, 0.0F));

		PartDefinition gLeftPinkyMid = gLeftPinkyFinger.addOrReplaceChild("gLeftPinkyMid", CubeListBuilder.create().texOffs(218, 190).mirror().addBox(-0.5319F, 0.0133F, -0.603F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-0.6274F, 1.1696F, -0.103F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gLeftPinkyClaw = gLeftPinkyMid.addOrReplaceChild("gLeftPinkyClaw", CubeListBuilder.create().texOffs(218, 195).mirror().addBox(-0.5F, 0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.0641F, 2.4928F, -0.145F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gRightShoulder = gUpperBody.addOrReplaceChild("gRightShoulder", CubeListBuilder.create().texOffs(216, 53).addBox(-4.0527F, -1.4699F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-10.1059F, -7.83F, -0.7023F, -1.1781F, 0.0F, 0.0F));

		PartDefinition upperplate_r3 = gRightShoulder.addOrReplaceChild("upperplate_r3", CubeListBuilder.create().texOffs(212, 64).addBox(-4.0F, -1.0F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-3.5642F, -0.2616F, 0.0F, 3.1416F, 0.0F, 0.7418F));

		PartDefinition upperplate_r4 = gRightShoulder.addOrReplaceChild("upperplate_r4", CubeListBuilder.create().texOffs(212, 64).addBox(-4.3747F, -3.2417F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-3.9788F, -0.027F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition gLeftBicep2 = gRightShoulder.addOrReplaceChild("gLeftBicep2", CubeListBuilder.create().texOffs(216, 74).addBox(-2.0F, 0.5F, -2.5F, 4.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0525F, 0.4791F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition lowerplate_r2 = gLeftBicep2.addOrReplaceChild("lowerplate_r2", CubeListBuilder.create().texOffs(212, 64).addBox(0.0F, -1.0F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-3.3278F, 7.0098F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition bicep_r2 = gLeftBicep2.addOrReplaceChild("bicep_r2", CubeListBuilder.create().texOffs(216, 79).addBox(-2.0F, -3.5F, -2.5F, 4.0F, 8.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.2541F, 10.191F, 0.0F, 3.1416F, 0.0F, -0.3054F));

		PartDefinition gLeftFobackm4 = gLeftBicep2.addOrReplaceChild("gLeftFobackm4", CubeListBuilder.create().texOffs(218, 96).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(219, 113).addBox(-1.5F, 8.3F, -1.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 13.6F, -0.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition armspike_r5 = gLeftFobackm4.addOrReplaceChild("armspike_r5", CubeListBuilder.create().texOffs(221, 157).addBox(-1.0582F, -6.1604F, -2.9324F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9592F, 5.99F, 1.7542F, -0.6109F, -1.1781F, 0.0F));

		PartDefinition armspike_r6 = gLeftFobackm4.addOrReplaceChild("armspike_r6", CubeListBuilder.create().texOffs(221, 157).addBox(-1.0582F, -4.1612F, -2.8941F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(221, 157).addBox(-1.0582F, -2.1612F, 0.1059F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(221, 157).addBox(-1.0582F, -0.1612F, 3.1059F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9592F, 5.99F, 1.7542F, -1.3963F, -1.1781F, 0.0F));

		PartDefinition underforearm_r4 = gLeftFobackm4.addOrReplaceChild("underforearm_r4", CubeListBuilder.create().texOffs(219, 130).addBox(-1.0582F, -4.1354F, -3.3586F, 2.0F, 17.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.9592F, 5.99F, 1.7542F, -0.2182F, -1.1781F, 0.0F));

		PartDefinition armspike_r7 = gLeftFobackm4.addOrReplaceChild("armspike_r7", CubeListBuilder.create().texOffs(221, 157).addBox(-0.7949F, -0.9784F, 2.6985F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(221, 157).addBox(-0.7949F, -2.9784F, -0.3015F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F))
		.texOffs(221, 157).addBox(-0.7949F, -4.9784F, -3.3015F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3687F, 3.5268F, 3.6736F, -1.3562F, -0.3923F, -0.0256F));

		PartDefinition armspike_r8 = gLeftFobackm4.addOrReplaceChild("armspike_r8", CubeListBuilder.create().texOffs(221, 157).addBox(-0.7949F, -7.0263F, -2.6427F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3687F, 3.5268F, 3.6736F, -0.5708F, -0.3923F, -0.0256F));

		PartDefinition underforearm_r5 = gLeftFobackm4.addOrReplaceChild("underforearm_r5", CubeListBuilder.create().texOffs(219, 130).addBox(-0.7949F, -4.8246F, -2.7595F, 2.0F, 18.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6313F, 5.7768F, 1.6736F, -0.0873F, 1.1781F, 0.0F));

		PartDefinition underforearm_r6 = gLeftFobackm4.addOrReplaceChild("underforearm_r6", CubeListBuilder.create().texOffs(219, 130).addBox(-0.7949F, -4.8246F, -2.7595F, 2.0F, 20.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3687F, 3.5268F, 3.6736F, -0.1781F, -0.3923F, -0.0256F));

		PartDefinition gLeftHand4 = gLeftFobackm4.addOrReplaceChild("gLeftHand4", CubeListBuilder.create().texOffs(219, 166).addBox(-1.0159F, -0.7127F, -1.87F, 2.0F, 7.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offset(-0.2015F, 17.7343F, 0.7679F));

		PartDefinition gLeftThumb4 = gLeftHand4.addOrReplaceChild("gLeftThumb4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3046F, 3.8167F, -0.8017F, 0.0F, 0.3927F, -0.3927F));

		PartDefinition thumbextension_r2 = gLeftThumb4.addOrReplaceChild("thumbextension_r2", CubeListBuilder.create().texOffs(230, 184).addBox(-0.2196F, -0.7138F, -0.6464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(1.6899F, 1.2418F, -0.9051F, -3.0211F, -0.1748F, 2.6805F));

		PartDefinition thumbbase_r2 = gLeftThumb4.addOrReplaceChild("thumbbase_r2", CubeListBuilder.create().texOffs(230, 180).addBox(-0.288F, -2.448F, -0.712F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(1.7001F, 0.9967F, -1.0227F, -2.7647F, 0.0084F, 2.3889F));

		PartDefinition gLeftThumbMid4 = gLeftThumb4.addOrReplaceChild("gLeftThumbMid4", CubeListBuilder.create().texOffs(230, 187).mirror().addBox(-0.664F, -0.248F, -0.606F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offset(1.6935F, 1.6027F, -0.5176F));

		PartDefinition gLeftThumbTip4 = gLeftThumbMid4.addOrReplaceChild("gLeftThumbTip4", CubeListBuilder.create().texOffs(230, 192).mirror().addBox(-0.4736F, 0.1342F, -0.479F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.1069F, 2.2293F, -0.169F, 0.0F, 0.0F, 0.3927F));

		PartDefinition claw_r2 = gLeftThumbTip4.addOrReplaceChild("claw_r2", CubeListBuilder.create().texOffs(230, 197).mirror().addBox(-0.748F, -1.832F, -0.748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0734F, 4.2283F, 0.227F, 0.0F, 0.0F, 0.1745F));

		PartDefinition gLeftPrimeFingers4 = gLeftHand4.addOrReplaceChild("gLeftPrimeFingers4", CubeListBuilder.create().texOffs(212, 179).addBox(-0.3984F, -0.4698F, -1.3169F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offset(-0.0934F, 5.8849F, -0.0187F));

		PartDefinition gLeftIndexFinger7 = gLeftPrimeFingers4.addOrReplaceChild("gLeftIndexFinger7", CubeListBuilder.create().texOffs(212, 184).addBox(-0.378F, -0.13F, -0.564F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offset(-0.0508F, 0.5849F, -0.8416F));

		PartDefinition gLeftIndexMid7 = gLeftIndexFinger7.addOrReplaceChild("gLeftIndexMid7", CubeListBuilder.create().texOffs(212, 190).addBox(-0.43F, 0.028F, -0.664F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.094F, 3.496F, 0.058F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftIndexClaw7 = gLeftIndexMid7.addOrReplaceChild("gLeftIndexClaw7", CubeListBuilder.create().texOffs(218, 195).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0535F, 3.5729F, -0.206F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftIndexFinger8 = gLeftPrimeFingers4.addOrReplaceChild("gLeftIndexFinger8", CubeListBuilder.create().texOffs(212, 184).addBox(-0.378F, -0.13F, -0.564F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-0.0508F, 0.5849F, 0.9084F, 0.1309F, 0.0F, 0.0F));

		PartDefinition gLeftIndexMid8 = gLeftIndexFinger8.addOrReplaceChild("gLeftIndexMid8", CubeListBuilder.create().texOffs(212, 190).addBox(-0.43F, 0.028F, -0.664F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.094F, 3.496F, 0.058F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftIndexClaw8 = gLeftIndexMid8.addOrReplaceChild("gLeftIndexClaw8", CubeListBuilder.create().texOffs(218, 195).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0535F, 3.5729F, -0.206F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gSecondaryFingers7 = gLeftHand4.addOrReplaceChild("gSecondaryFingers7", CubeListBuilder.create().texOffs(222, 179).addBox(-0.2257F, -0.2364F, -1.1836F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0666F, 3.5104F, 1.6126F, 0.7854F, 0.0F, 0.0F));

		PartDefinition gLeftSecondRingFinger4 = gSecondaryFingers7.addOrReplaceChild("gLeftSecondRingFinger4", CubeListBuilder.create().texOffs(218, 185).addBox(0.012F, -0.248F, -0.722F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-0.2514F, 1.5867F, -0.8691F, -0.3927F, 0.0F, 0.0F));

		PartDefinition gSecondRingMid7 = gLeftSecondRingFinger4.addOrReplaceChild("gSecondRingMid7", CubeListBuilder.create().texOffs(218, 190).addBox(-0.5234F, -0.0135F, -0.603F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.5774F, 2.3015F, -0.161F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gSecondRingClaw7 = gSecondRingMid7.addOrReplaceChild("gSecondRingClaw7", CubeListBuilder.create().texOffs(218, 195).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0034F, 2.5775F, -0.145F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftPinkyFinger4 = gSecondaryFingers7.addOrReplaceChild("gLeftPinkyFinger4", CubeListBuilder.create().texOffs(224, 186).addBox(0.128F, -0.35F, -0.664F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-0.2996F, 1.6235F, 0.4946F, -0.2182F, 0.0F, 0.0F));

		PartDefinition gLeftPinkyMid4 = gLeftPinkyFinger4.addOrReplaceChild("gLeftPinkyMid4", CubeListBuilder.create().texOffs(218, 190).addBox(-0.4681F, 0.0133F, -0.603F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.6274F, 1.1696F, -0.103F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gLeftPinkyClaw4 = gLeftPinkyMid4.addOrReplaceChild("gLeftPinkyClaw4", CubeListBuilder.create().texOffs(218, 195).addBox(-0.5F, 0.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0641F, 2.4928F, -0.145F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gChest = gUpperBody.addOrReplaceChild("gChest", CubeListBuilder.create().texOffs(137, 135).mirror().addBox(-6.07F, -6.2208F, -4.572F, 12.0F, 16.0F, 17.0F, new CubeDeformation(0.103F)).mirror(false)
		.texOffs(138, 175).addBox(-10.57F, -6.2078F, 0.8089F, 21.0F, 16.0F, 7.0F, new CubeDeformation(0.102F)), PartPose.offset(0.07F, -8.1972F, -5.3089F));

		PartDefinition rightcollar_r1 = gChest.addOrReplaceChild("rightcollar_r1", CubeListBuilder.create().texOffs(170, 232).addBox(-1.0182F, -3.4074F, -4.8169F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-10.6011F, -5.6947F, 4.4752F, 1.0073F, -0.0158F, -1.3068F));

		PartDefinition rightcollar_r2 = gChest.addOrReplaceChild("rightcollar_r2", CubeListBuilder.create().texOffs(142, 232).addBox(-0.9818F, -3.31F, -2.1211F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-10.6011F, -5.6947F, 4.4752F, -0.1272F, -0.0158F, -1.3068F));

		PartDefinition leftcollar_r1 = gChest.addOrReplaceChild("leftcollar_r1", CubeListBuilder.create().texOffs(142, 232).mirror().addBox(-1.0182F, -3.31F, -2.1211F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(10.4611F, -5.6947F, 4.4752F, -0.1272F, 0.0158F, 1.3068F));

		PartDefinition leftcollar_r2 = gChest.addOrReplaceChild("leftcollar_r2", CubeListBuilder.create().texOffs(170, 232).mirror().addBox(-0.9818F, -3.4074F, -4.8169F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(10.4611F, -5.6947F, 4.4752F, 1.0073F, 0.0158F, 1.3068F));

		PartDefinition chestrightlowangle_r1 = gChest.addOrReplaceChild("chestrightlowangle_r1", CubeListBuilder.create().texOffs(140, 205).addBox(-4.8659F, -11.3F, -6.0117F, 4.0F, 16.0F, 7.0F, new CubeDeformation(0.08F)), PartPose.offsetAndRotation(-6.6297F, 5.0922F, 4.1315F, 0.0F, -0.8727F, 0.0F));

		PartDefinition chestleftlowangle_r1 = gChest.addOrReplaceChild("chestleftlowangle_r1", CubeListBuilder.create().texOffs(140, 205).addBox(0.6731F, -11.3F, -6.2415F, 4.0F, 16.0F, 7.0F, new CubeDeformation(0.08F)), PartPose.offsetAndRotation(6.4898F, 5.0922F, 4.1315F, 0.0F, 0.8727F, 0.0F));

		PartDefinition chestrighttopangle_r1 = gChest.addOrReplaceChild("chestrighttopangle_r1", CubeListBuilder.create().texOffs(168, 205).mirror().addBox(8.5522F, -6.2078F, -4.1983F, 4.0F, 16.0F, 7.0F, new CubeDeformation(0.08F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, -0.8727F, 3.1416F));

		PartDefinition chestlefttopangle_r1 = gChest.addOrReplaceChild("chestlefttopangle_r1", CubeListBuilder.create().texOffs(168, 205).mirror().addBox(-12.3593F, -6.2078F, -4.4281F, 4.0F, 16.0F, 7.0F, new CubeDeformation(0.08F)).mirror(false), PartPose.offsetAndRotation(-0.1399F, 0.0F, 0.0F, 3.1416F, 0.8727F, -3.1416F));

		PartDefinition abdomenspikes_r47 = gChest.addOrReplaceChild("abdomenspikes_r47", CubeListBuilder.create().texOffs(155, 74).mirror().addBox(0.0F, -6.5F, 0.0F, 0.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.07F, 0.1902F, 11.4184F, 0.0F, -0.3927F, 0.0F));

		PartDefinition abdomenspikes_r48 = gChest.addOrReplaceChild("abdomenspikes_r48", CubeListBuilder.create().texOffs(155, 74).mirror().addBox(0.0F, -6.5F, 0.0F, 0.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.07F, 0.1902F, 11.4184F, 0.0F, 0.3927F, 0.0F));

		PartDefinition topbackspine_r1 = gChest.addOrReplaceChild("topbackspine_r1", CubeListBuilder.create().texOffs(139, 99).addBox(-2.1819F, -8.5361F, -7.0359F, 13.0F, 16.0F, 13.0F, new CubeDeformation(0.07F)), PartPose.offsetAndRotation(-2.7444F, 2.3022F, 8.1854F, 0.0F, 0.7854F, 0.0F));

		PartDefinition gLeftTittyShoulder = gChest.addOrReplaceChild("gLeftTittyShoulder", CubeListBuilder.create().texOffs(221, 232).mirror().addBox(-1.475F, -1.925F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(3.1637F, -3.4163F, -4.4253F, -1.5708F, 0.0F, 0.0F));

		PartDefinition gLeftTittyBicep = gLeftTittyShoulder.addOrReplaceChild("gLeftTittyBicep", CubeListBuilder.create().texOffs(221, 242).mirror().addBox(-1.5F, 0.4F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(221, 242).mirror().addBox(-1.5F, 3.4F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 1.425F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition gLeftTittyForearm = gLeftTittyBicep.addOrReplaceChild("gLeftTittyForearm", CubeListBuilder.create().texOffs(223, 254).mirror().addBox(-1.0266F, -0.04F, -1.0894F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false)
		.texOffs(223, 254).mirror().addBox(-1.0266F, 2.11F, -1.0894F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0306F, 9.0191F, 0.0981F, -1.1781F, 0.0F, 0.0F));

		PartDefinition armspike_r9 = gLeftTittyForearm.addOrReplaceChild("armspike_r9", CubeListBuilder.create().texOffs(231, 162).mirror().addBox(1.0F, -4.0F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.3395F, 3.41F, 1.3853F, 0.0F, 1.5708F, 0.7418F));

		PartDefinition armspike_r10 = gLeftTittyForearm.addOrReplaceChild("armspike_r10", CubeListBuilder.create().texOffs(231, 163).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.5376F, 6.6981F, -0.1147F, 0.0F, 1.5708F, 0.6981F));

		PartDefinition armspike_r11 = gLeftTittyForearm.addOrReplaceChild("armspike_r11", CubeListBuilder.create().texOffs(231, 158).mirror().addBox(0.0F, -7.0F, -0.75F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.3395F, 3.91F, 1.3853F, -1.5708F, 1.1781F, -1.5708F));

		PartDefinition gLeftTittyHand = gLeftTittyForearm.addOrReplaceChild("gLeftTittyHand", CubeListBuilder.create().texOffs(224, 266).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0374F, 9.7191F, -0.2143F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition gLeftTittyThumb = gLeftTittyHand.addOrReplaceChild("gLeftTittyThumb", CubeListBuilder.create().texOffs(218, 273).mirror().addBox(-2.5097F, -0.5711F, -0.4742F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 1.0F, -1.1F, 0.0F, 0.0F, 0.3927F));

		PartDefinition gLeftTittyThumbEnd = gLeftTittyThumb.addOrReplaceChild("gLeftTittyThumbEnd", CubeListBuilder.create().texOffs(218, 277).mirror().addBox(-2.8F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0597F, -0.0711F, 0.0258F, 0.0F, 0.0F, -1.1781F));

		PartDefinition thumbnail_r1 = gLeftTittyThumbEnd.addOrReplaceChild("thumbnail_r1", CubeListBuilder.create().texOffs(219, 281).mirror().addBox(-1.25F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.2F, 0.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition gLeftTittyIndex = gLeftTittyHand.addOrReplaceChild("gLeftTittyIndex", CubeListBuilder.create().texOffs(230, 273).mirror().addBox(-0.5F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.85F, -0.6F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gLeftTittyIndexEnd = gLeftTittyIndex.addOrReplaceChild("gLeftTittyIndexEnd", CubeListBuilder.create().texOffs(230, 279).mirror().addBox(-0.75F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(0.25F, 2.8F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition claw_r3 = gLeftTittyIndexEnd.addOrReplaceChild("claw_r3", CubeListBuilder.create().texOffs(230, 284).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.717F, 3.0785F, 0.0001F, 0.0F, 0.7854F, 0.7854F));

		PartDefinition gLeftTittyRing = gLeftTittyHand.addOrReplaceChild("gLeftTittyRing", CubeListBuilder.create().texOffs(230, 273).mirror().addBox(-0.5F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 2.85F, 0.55F, 0.0F, 0.0F, 0.7854F));

		PartDefinition gLeftTittyRingEnd = gLeftTittyRing.addOrReplaceChild("gLeftTittyRingEnd", CubeListBuilder.create().texOffs(230, 279).mirror().addBox(-0.75F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(0.25F, 2.8F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition claw_r4 = gLeftTittyRingEnd.addOrReplaceChild("claw_r4", CubeListBuilder.create().texOffs(230, 284).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.717F, 3.0785F, 0.0001F, 0.0F, 0.7854F, 0.7854F));

		PartDefinition gRightTittyShoulder = gChest.addOrReplaceChild("gRightTittyShoulder", CubeListBuilder.create().texOffs(221, 232).addBox(-1.525F, -1.925F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-3.3036F, -3.4163F, -4.4253F, -1.5708F, 0.0F, 0.0F));

		PartDefinition gRightTittyBicep = gRightTittyShoulder.addOrReplaceChild("gRightTittyBicep", CubeListBuilder.create().texOffs(221, 242).addBox(-1.5F, 0.4F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(221, 242).addBox(-1.5F, 3.4F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.025F, 1.425F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition gRightTittyForearm = gRightTittyBicep.addOrReplaceChild("gRightTittyForearm", CubeListBuilder.create().texOffs(223, 254).addBox(-0.9734F, -0.04F, -1.0894F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.15F))
		.texOffs(223, 254).addBox(-0.9734F, 2.11F, -1.0894F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0306F, 9.0191F, 0.0981F, -1.1781F, 0.0F, 0.0F));

		PartDefinition armspike_r12 = gRightTittyForearm.addOrReplaceChild("armspike_r12", CubeListBuilder.create().texOffs(231, 162).addBox(-2.0F, -4.0F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.3395F, 3.41F, 1.3853F, 0.0F, -1.5708F, -0.7418F));

		PartDefinition armspike_r13 = gRightTittyForearm.addOrReplaceChild("armspike_r13", CubeListBuilder.create().texOffs(231, 163).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.5376F, 6.6981F, -0.1147F, 0.0F, -1.5708F, -0.6981F));

		PartDefinition armspike_r14 = gRightTittyForearm.addOrReplaceChild("armspike_r14", CubeListBuilder.create().texOffs(231, 158).addBox(-1.0F, -7.0F, -0.75F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.3395F, 3.91F, 1.3853F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition gRightTittyHand = gRightTittyForearm.addOrReplaceChild("gRightTittyHand", CubeListBuilder.create().texOffs(224, 266).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0374F, 9.7191F, -0.2143F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition gRightTittyThumb = gRightTittyHand.addOrReplaceChild("gRightTittyThumb", CubeListBuilder.create().texOffs(218, 273).addBox(-0.4903F, -0.5711F, -0.4742F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 1.0F, -1.1F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gRightTittyThumbEnd = gRightTittyThumb.addOrReplaceChild("gRightTittyThumbEnd", CubeListBuilder.create().texOffs(218, 277).addBox(-0.2F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0597F, -0.0711F, 0.0258F, 0.0F, 0.0F, 1.1781F));

		PartDefinition thumbnail_r2 = gRightTittyThumbEnd.addOrReplaceChild("thumbnail_r2", CubeListBuilder.create().texOffs(219, 281).addBox(-0.75F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8F, 0.2F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition gRightTittyIndex = gRightTittyHand.addOrReplaceChild("gRightTittyIndex", CubeListBuilder.create().texOffs(230, 273).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.85F, -0.6F, 0.0F, 0.0F, -0.7854F));

		PartDefinition gRightTittyIndexEnd = gRightTittyIndex.addOrReplaceChild("gRightTittyIndexEnd", CubeListBuilder.create().texOffs(230, 279).addBox(-0.25F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.25F, 2.8F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition claw_r5 = gRightTittyIndexEnd.addOrReplaceChild("claw_r5", CubeListBuilder.create().texOffs(230, 284).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.717F, 3.0785F, 0.0001F, 0.0F, -0.7854F, -0.7854F));

		PartDefinition gRightTittyRing = gRightTittyHand.addOrReplaceChild("gRightTittyRing", CubeListBuilder.create().texOffs(230, 273).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.85F, 0.55F, 0.0F, 0.0F, -0.7854F));

		PartDefinition gRightTittyRingEnd = gRightTittyRing.addOrReplaceChild("gRightTittyRingEnd", CubeListBuilder.create().texOffs(230, 279).addBox(-0.25F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.25F, 2.8F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition claw_r6 = gRightTittyRingEnd.addOrReplaceChild("claw_r6", CubeListBuilder.create().texOffs(230, 284).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.717F, 3.0785F, 0.0001F, 0.0F, -0.7854F, -0.7854F));

		PartDefinition gLeftSpines = gChest.addOrReplaceChild("gLeftSpines", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9901F, -3.9998F, 11.6017F, 0.0F, 0.7854F, 0.0F));

		PartDefinition gLeftUpperSpine = gLeftSpines.addOrReplaceChild("gLeftUpperSpine", CubeListBuilder.create().texOffs(183, 270).mirror().addBox(-0.45F, -1.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(134, 219).addBox(0.0F, -2.85F, -0.82F, 0.0F, 7.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition gLeftMiddleSpine2 = gLeftSpines.addOrReplaceChild("gLeftMiddleSpine2", CubeListBuilder.create().texOffs(183, 270).mirror().addBox(-0.45F, -1.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(134, 219).addBox(0.0F, -2.85F, -0.82F, 0.0F, 7.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 5.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition gLeftLowerSpine = gLeftSpines.addOrReplaceChild("gLeftLowerSpine", CubeListBuilder.create().texOffs(183, 270).mirror().addBox(-0.45F, -1.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(134, 219).addBox(0.0F, -2.85F, -0.82F, 0.0F, 7.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 9.0F, -1.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition gRightSpines = gChest.addOrReplaceChild("gRightSpines", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1301F, -3.9998F, 11.6017F, 0.0F, -0.7854F, 0.0F));

		PartDefinition gRightUpperSpine = gRightSpines.addOrReplaceChild("gRightUpperSpine", CubeListBuilder.create().texOffs(183, 270).addBox(-0.55F, -1.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(134, 219).mirror().addBox(0.0F, -2.85F, -0.82F, 0.0F, 7.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition gRightMiddleSpine2 = gRightSpines.addOrReplaceChild("gRightMiddleSpine2", CubeListBuilder.create().texOffs(183, 270).addBox(-0.55F, -1.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(134, 219).mirror().addBox(0.0F, -2.85F, -0.82F, 0.0F, 7.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.75F, 5.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition gRightLowerSpine = gRightSpines.addOrReplaceChild("gRightLowerSpine", CubeListBuilder.create().texOffs(183, 270).addBox(-0.55F, -1.1F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(134, 219).mirror().addBox(0.0F, -2.85F, -0.82F, 0.0F, 7.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 9.0F, -1.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition root2 = partdefinition.addOrReplaceChild("root2", CubeListBuilder.create(), PartPose.offset(0.0F, 30.8F, 17.0F));

		PartDefinition cube_r1 = root2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(398, 77).addBox(-4.0F, -6.0F, -9.0F, 8.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.9F, -8.7F, -1.1868F, 0.0F, 0.0F));

		PartDefinition bone = root2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -31.3F, 1.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(445, 71).addBox(-8.0F, -2.0F, -8.0F, 16.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9687F, 0.0F, 0.0F));

		PartDefinition gSack1 = bone.addOrReplaceChild("gSack1", CubeListBuilder.create().texOffs(404, 106).addBox(-12.0F, -10.0F, 4.0F, 24.0F, 22.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3121F, -6.6437F, -0.7854F, 0.0F, 0.0F));

		PartDefinition gSack2 = gSack1.addOrReplaceChild("gSack2", CubeListBuilder.create().texOffs(370, 156).addBox(-12.0F, -15.9603F, -3.004F, 32.0F, 32.0F, 47.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -2.2181F, 15.9911F, 0.6975F, -0.0047F, 0.0059F));

		PartDefinition gSack3 = gSack2.addOrReplaceChild("gSack3", CubeListBuilder.create().texOffs(361, 241).addBox(-16.0F, -20.6114F, -2.9414F, 40.0F, 40.0F, 51.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 34.0F, 0.0485F, 0.648F, -0.0433F));

		PartDefinition gSack4 = gSack3.addOrReplaceChild("gSack4", CubeListBuilder.create().texOffs(361, 341).addBox(-18.0F, -31.3362F, -4.3057F, 44.0F, 44.0F, 44.0F, new CubeDeformation(2.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 42.0F, -0.0093F, 0.6396F, -0.1206F));

		PartDefinition gSack5 = gSack4.addOrReplaceChild("gSack5", CubeListBuilder.create().texOffs(539, 72).addBox(-14.0F, -19.4676F, -9.6214F, 36.0F, 36.0F, 64.0F, new CubeDeformation(2.0F)), PartPose.offsetAndRotation(1.6187F, -6.7598F, 37.3033F, -0.1343F, 0.7278F, -0.1627F));

		PartDefinition bone2 = gSack5.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(552, 182).addBox(-18.0F, -18.0F, -4.8F, 36.0F, 36.0F, 51.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -1.4676F, 44.1786F, -0.0553F, 0.8249F, -0.1374F));

		PartDefinition gSack6 = bone2.addOrReplaceChild("gSack6", CubeListBuilder.create().texOffs(573, 279).addBox(-10.0F, -14.6114F, -2.9414F, 28.0F, 28.0F, 36.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(-4.4817F, 0.5045F, 41.545F, -0.203F, 0.4593F, -0.1049F));

		PartDefinition gSack7 = gSack6.addOrReplaceChild("gSack7", CubeListBuilder.create().texOffs(589, 349).addBox(-6.0F, -11.4393F, -2.9515F, 20.0F, 24.0F, 28.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(0.0997F, -0.8251F, 31.7071F, -0.4827F, -0.0107F, 0.0236F));

		PartDefinition gSack8 = gSack7.addOrReplaceChild("gSack8", CubeListBuilder.create().texOffs(598, 410).addBox(-2.0F, -3.5165F, -3.6905F, 12.0F, 12.0F, 28.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 24.0F, -0.6572F, -0.0189F, 0.0177F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(LivingEntityRenderState state) {
	}



//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//
//	}
//
//	@Override
//	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//		root2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
}