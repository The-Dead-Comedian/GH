// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart main;

	public Modelcustom_model(ModelPart root) {
		this.main = root.getChild("main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.5F, -22.0F, -1.5F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Arms_R = main.addOrReplaceChild("Arms_R",
				CubeListBuilder.create().texOffs(0, 15).mirror()
						.addBox(-3.5F, -5.25F, -1.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(20, 11).addBox(-3.0F, -5.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.5F, -17.0F, -0.5F));

		PartDefinition Arm_L = main.addOrReplaceChild("Arm_L",
				CubeListBuilder.create().texOffs(20, 11)
						.addBox(9.0F, -5.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(8.5F, -5.25F, -1.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.5F, -17.0F, -0.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}