// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhowling_mask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "howling_mask"), "main");
	private final ModelPart body;
	private final ModelPart bb_main;

	public Modelhowling_mask(ModelPart root) {
		this.body = root.getChild("body");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(),
				PartPose.offset(0.0F, -15.0F, 2.0F));

		PartDefinition spine2 = torso.addOrReplaceChild("spine2", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -9.0F, -3.25F));

		PartDefinition cube_r1 = spine2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(48, 23).addBox(2.5F, 0.0F, 0.25F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.533F, -0.6248F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone2 = spine2.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 5.5758F, 0.0278F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(40, 49).addBox(2.5F, 0.0F, 0.25F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(58, 19).addBox(2.5F,
				-0.783F, -3.1252F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.7928F, 3.3474F));

		PartDefinition torso2 = bone3.addOrReplaceChild("torso2",
				CubeListBuilder.create().texOffs(0, 33)
						.addBox(7.0F, -12.283F, -3.8752F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5F, -14.533F, -3.1252F, 13.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(7.0F, -6.283F, -3.8752F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-2.0F, -6.283F, -3.8752F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 41)
						.addBox(3.0F, -14.283F, 1.1248F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-2.0F, -9.283F, -3.8752F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(7.0F, -9.283F, -3.8752F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-2.0F, -12.283F, -3.8752F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.75F, -4.0F));

		PartDefinition neck = torso2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F,
				-10.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -6.533F, 1.8748F));

		PartDefinition cube_r3 = neck.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 33).addBox(3.9262F, -2.5984F, -4.4047F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9012F, -4.75F, 0.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 64).addBox(3.9262F, -2.5984F, 2.4047F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9012F, -4.75F, 0.0F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(64, 51).addBox(4.9863F, 1.9176F, -0.75F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9012F, -4.75F, 0.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(53, 65).addBox(-1.7195F, -6.3497F, -0.75F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9012F, -4.75F, 0.0F, 0.0F, 0.0F, 1.0036F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 25)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition left_horn = head.addOrReplaceChild("left_horn", CubeListBuilder.create(),
				PartPose.offset(-3.081F, -12.7315F, -3.0878F));

		PartDefinition cube_r7 = left_horn.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(19, 33).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.3927F, 0.0F));

		PartDefinition cube_r8 = left_horn.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.3478F, -0.2346F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2929F, 3.8478F, -0.7071F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r9 = left_horn.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 52).addBox(-2.0F, -22.0F, -2.0F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7873F, 23.3676F, 7.8368F, 0.3927F, 0.3927F, 0.0F));

		PartDefinition right_horn = head.addOrReplaceChild("right_horn", CubeListBuilder.create(),
				PartPose.offset(3.081F, -12.7315F, -3.0878F));

		PartDefinition cube_r10 = right_horn.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(19, 33).mirror()
						.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, -0.3927F, 0.0F));

		PartDefinition cube_r11 = right_horn.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -3.3478F, -0.2346F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2929F, 3.8478F, -0.7071F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r12 = right_horn.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 52).mirror()
						.addBox(-1.0F, -22.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.7873F, 23.3676F, 7.8368F, 0.3927F, -0.3927F, 0.0F));

		PartDefinition left_arm = torso2.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(58, 0)
				.addBox(-3.2003F, -2.7078F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.7997F, -12.8252F, 1.3748F));

		PartDefinition cube_r13 = left_arm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(54, 8).mirror()
						.addBox(-7.0F, -2.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8414F, -0.6882F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r14 = left_arm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(55, 40).mirror()
						.addBox(-14.0F, 4.75F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.2003F, -9.2078F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r15 = left_arm.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(56, 15).addBox(-7.0F, -2.0F, -1.0F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.8794F, 1.6887F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r16 = left_arm.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(56, 47).addBox(-7.0F, 0.0F, -1.0F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2003F, -1.2078F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition lower_left_arm = left_arm.addOrReplaceChild("lower_left_arm", CubeListBuilder.create()
				.texOffs(24, 17).addBox(-14.0F, -1.5F, -1.5F, 14.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-15.8195F, -1.1907F, -0.25F));

		PartDefinition palm = lower_left_arm.addOrReplaceChild("palm", CubeListBuilder.create().texOffs(40, 41).addBox(
				-6.0F, -2.5F, -1.5F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-14.0F, 0.0F, 0.0F));

		PartDefinition left_thumb = palm.addOrReplaceChild("left_thumb", CubeListBuilder.create().texOffs(0, 17).addBox(
				-1.0F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, 0.0F));

		PartDefinition lower_left_thumb = left_thumb.addOrReplaceChild("lower_left_thumb", CubeListBuilder.create()
				.texOffs(19, 37).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.5F, 0.0F));

		PartDefinition left_pointy = palm.addOrReplaceChild("left_pointy", CubeListBuilder.create().texOffs(64, 23)
				.addBox(-3.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.5F, -1.5F, 0.0F));

		PartDefinition left_lower_pointy = left_pointy.addOrReplaceChild("left_lower_pointy", CubeListBuilder.create()
				.texOffs(48, 31).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 0.0F, 0.0F));

		PartDefinition left_pointy2 = palm.addOrReplaceChild("left_pointy2", CubeListBuilder.create().texOffs(0, 64)
				.addBox(-3.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.5F, 1.5F, 0.0F));

		PartDefinition left_lower_pointy2 = left_pointy2.addOrReplaceChild("left_lower_pointy2", CubeListBuilder
				.create().texOffs(34, 23).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 0.0F, 0.0F));

		PartDefinition left_pointy3 = palm.addOrReplaceChild("left_pointy3",
				CubeListBuilder.create().texOffs(10, 63).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4621F, 3.1391F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition left_lower_pointy3 = left_pointy3
				.addOrReplaceChild(
						"left_lower_pointy3", CubeListBuilder.create().texOffs(24, 23).addBox(-4.4679F, -0.2144F, -0.5F,
								4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-1.0321F, -0.2856F, 0.0F));

		PartDefinition right_arm = torso2.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(58, 0).mirror()
						.addBox(-0.7997F, -2.7078F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(11.7997F, -12.8252F, 1.3748F));

		PartDefinition cube_r17 = right_arm.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(54, 8).addBox(0.0F, -2.0F, -1.0F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8414F, -0.6882F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r18 = right_arm.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(55, 40).addBox(7.0F, 4.75F, -1.0F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2003F, -9.2078F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r19 = right_arm.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(56, 15).mirror()
						.addBox(0.0F, -2.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.8794F, 1.6887F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r20 = right_arm.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(56, 47).mirror()
						.addBox(0.0F, 0.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.2003F, -1.2078F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition lower_right_arm = right_arm.addOrReplaceChild("lower_right_arm",
				CubeListBuilder.create().texOffs(24, 17).mirror()
						.addBox(0.0F, -1.5F, -1.5F, 14.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(15.8195F, -1.1907F, -0.25F));

		PartDefinition palm2 = lower_right_arm.addOrReplaceChild("palm2",
				CubeListBuilder.create().texOffs(40, 41).mirror()
						.addBox(0.0F, -2.5F, -1.5F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(14.0F, 0.0F, 0.0F));

		PartDefinition right_thumb = palm2.addOrReplaceChild("right_thumb",
				CubeListBuilder.create().texOffs(0, 17).mirror()
						.addBox(-1.0F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.0F, -2.0F, 0.0F));

		PartDefinition lower_right_thumb = right_thumb.addOrReplaceChild("lower_right_thumb",
				CubeListBuilder.create().texOffs(19, 37).mirror()
						.addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -3.5F, 0.0F));

		PartDefinition right_pointy4 = palm2.addOrReplaceChild("right_pointy4",
				CubeListBuilder.create().texOffs(64, 23).mirror()
						.addBox(0.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.5F, -1.5F, 0.0F));

		PartDefinition right_lower_pointy4 = right_pointy4.addOrReplaceChild("right_lower_pointy4",
				CubeListBuilder.create().texOffs(48, 31).mirror()
						.addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.5F, 0.0F, 0.0F));

		PartDefinition right_pointy5 = palm2.addOrReplaceChild("right_pointy5",
				CubeListBuilder.create().texOffs(0, 64).mirror()
						.addBox(0.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.5F, 1.5F, 0.0F));

		PartDefinition right_lower_pointy5 = right_pointy5.addOrReplaceChild("right_lower_pointy5",
				CubeListBuilder.create().texOffs(34, 23).mirror()
						.addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.5F, 0.0F, 0.0F));

		PartDefinition right_pointy6 = palm2.addOrReplaceChild("right_pointy6",
				CubeListBuilder.create().texOffs(10, 63).mirror()
						.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.4621F, 3.1391F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition right_lower_pointy6 = right_pointy6.addOrReplaceChild("right_lower_pointy6",
				CubeListBuilder.create().texOffs(24, 23).mirror()
						.addBox(0.4679F, -0.2144F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.0321F, -0.2856F, 0.0F));

		PartDefinition pelvis = body.addOrReplaceChild("pelvis", CubeListBuilder.create().texOffs(34, 0).addBox(-4.5F,
				-1.0F, -6.0F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, 3.0F));

		PartDefinition leftleg = pelvis.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(0, 43)
						.addBox(-1.5F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 57)
						.addBox(-1.0F, 5.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 1.0F, -3.0F));

		PartDefinition lower_left_leg = leftleg.addOrReplaceChild("lower_left_leg", CubeListBuilder.create(),
				PartPose.offset(3.0F, 10.0F, 0.0F));

		PartDefinition cube_r21 = lower_left_leg.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(13, 51).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 9.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 3.6252F, 0.1905F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r22 = lower_left_leg.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(25, 54).addBox(-2.5F, 0.0F, -1.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition foot = lower_left_leg.addOrReplaceChild("foot", CubeListBuilder.create().texOffs(0, 58)
				.addBox(-1.45F, 0.0F, -3.25F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 3).mirror()
				.addBox(0.05F, 2.0F, -0.25F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.5F, 11.0F, 6.0F));

		PartDefinition foot_tip = foot.addOrReplaceChild("foot_tip", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, -1.0F));

		PartDefinition bone = foot_tip.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(1.55F, -0.3265F, 0.1228F));

		PartDefinition cube_r23 = bone
				.addOrReplaceChild("cube_r23",
						CubeListBuilder.create().texOffs(55, 61).addBox(-3.0F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(12, 43).addBox(-2.975F,
				-0.6735F, -2.1228F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(22, 62).addBox(-3.0F, -0.5F, -3.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.05F, -1.1735F, 1.3772F, 0.3054F, 0.0F, 0.0F));

		PartDefinition finger = bone4.addOrReplaceChild("finger", CubeListBuilder.create(),
				PartPose.offset(-3.11F, -0.4611F, -1.684F));

		PartDefinition cube_r25 = finger.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -0.9244F, -2.25F, 0.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5423F, -0.1231F, -1.7425F, 0.0F, 0.2457F, -0.0914F));

		PartDefinition cube_r26 = finger.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.9244F, -2.25F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.56F, 0.7876F, -0.1772F, -0.3604F, 0.2457F, -0.0914F));

		PartDefinition finger2 = bone4.addOrReplaceChild("finger2", CubeListBuilder.create(),
				PartPose.offset(0.01F, -0.4611F, -1.684F));

		PartDefinition cube_r27 = finger2.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(4, 20).addBox(0.5F, -0.9244F, -2.25F, 0.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5423F, -0.1231F, -1.7425F, 0.0F, -0.2457F, 0.0914F));

		PartDefinition cube_r28 = finger2.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 5).addBox(-0.5F, -0.9244F, -2.25F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.56F, 0.7876F, -0.1772F, -0.3604F, -0.2457F, 0.0914F));

		PartDefinition rightleg = pelvis.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 43).mirror()
				.addBox(-2.5F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(41, 57)
				.mirror().addBox(-2.0F, 5.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.0F, 1.0F, -3.0F));

		PartDefinition lower_right_leg = rightleg.addOrReplaceChild("lower_right_leg", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 10.0F, 0.0F));

		PartDefinition cube_r29 = lower_right_leg.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(13, 51).mirror()
						.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 3.6252F, 0.1905F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r30 = lower_right_leg.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(25, 54).mirror()
						.addBox(-1.5F, 0.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition foot2 = lower_right_leg.addOrReplaceChild("foot2",
				CubeListBuilder.create().texOffs(0, 58).mirror()
						.addBox(-1.55F, 0.0F, -3.25F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(4, 3).addBox(-0.05F, 2.0F, -0.25F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 11.0F, 6.0F));

		PartDefinition foot_tip2 = foot2.addOrReplaceChild("foot_tip2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, -1.0F));

		PartDefinition bone5 = foot_tip2.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(-1.55F, -0.3265F, 0.1228F));

		PartDefinition cube_r31 = bone5.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(55, 61).mirror()
						.addBox(0.0F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(12, 43).mirror()
						.addBox(-0.025F, -0.6735F, -2.1228F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition cube_r32 = bone6.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(22, 62).mirror()
						.addBox(0.0F, -0.5F, -3.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.05F, -1.1735F, 1.3772F, 0.3054F, 0.0F, 0.0F));

		PartDefinition finger3 = bone6.addOrReplaceChild("finger3", CubeListBuilder.create(),
				PartPose.offset(3.11F, -0.4611F, -1.684F));

		PartDefinition cube_r33 = finger3.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(34, 0).mirror()
						.addBox(0.5F, -0.9244F, -2.25F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5423F, -0.1231F, -1.7425F, 0.0F, -0.2457F, 0.0914F));

		PartDefinition cube_r34 = finger3.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(0, 22).mirror()
						.addBox(-0.5F, -0.9244F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.56F, 0.7876F, -0.1772F, -0.3604F, -0.2457F, 0.0914F));

		PartDefinition finger4 = bone6.addOrReplaceChild("finger4", CubeListBuilder.create(),
				PartPose.offset(-0.01F, -0.4611F, -1.684F));

		PartDefinition cube_r35 = finger4.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(4, 20).mirror()
						.addBox(-0.5F, -0.9244F, -2.25F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5423F, -0.1231F, -1.7425F, 0.0F, 0.2457F, -0.0914F));

		PartDefinition cube_r36 = finger4.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(0, 5).mirror()
						.addBox(-0.5F, -0.9244F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.56F, 0.7876F, -0.1772F, -0.3604F, 0.2457F, -0.0914F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	@Override
	public ResourceLocation getModelLocation(JackInTheBoxItem object) {
		return new ResourceLocation(GeckoLib.ModID, "geo/howling mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(JackInTheBoxItem object) {
		return new ResourceLocation(GeckoLib.ModID, "textures/item/howling_mask.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(JackInTheBoxItem object) {
		return new ResourceLocation(GeckoLib.ModID, "animations/howling_mask.animation.json");
	}
}