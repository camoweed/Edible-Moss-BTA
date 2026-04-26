package camoweed.ediblemoss.mixin;

import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.core.enums.EnumDropCause.WORLD;

@Mixin(BlockLogic.class)
public abstract class EatMossyMixin {

	@Inject(method = "onBlockRightClicked", at = @At("HEAD"), cancellable = true)
	private void onUse(World world, int x, int y, int z, Player player, Side side, double hitX, double hitY, CallbackInfoReturnable<Boolean> cir) {

		if (player.getHeldItem() != null) {
			return;
		}
		if (world.getBlockId(x, y, z) == Blocks.MOSS_STONE.id()) {
			world.setBlockWithNotify(x, y, z, Blocks.STONE.id());
			world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, x,y,z,"random.bite",1.0F,1.0F);
			cir.setReturnValue(true);
		}
		if (world.getBlockId(x, y, z) == Blocks.LOG_OAK_MOSSY.id()) {
			world.setBlockWithNotify(x, y, z, Blocks.LOG_OAK.id());
			world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, x,y,z,"random.bite",1.0F,1.0F);
			cir.setReturnValue(true);
		}
		if (world.getBlockId(x, y, z) == Blocks.COBBLE_STONE_MOSSY.id()) {
			world.setBlockWithNotify(x, y, z, Blocks.COBBLE_STONE.id());
			world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, x,y,z,"random.bite",1.0F,1.0F);
			cir.setReturnValue(true);
		}
		if (world.getBlockId(x, y, z) == Blocks.BRICK_STONE_POLISHED_MOSSY.id()) {
			world.setBlockWithNotify(x, y, z, Blocks.BRICK_STONE_POLISHED.id());
			world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, x,y,z,"random.bite",1.0F,1.0F);
			cir.setReturnValue(true);
		}
		if (world.getBlockId(x, y, z) == Blocks.MOSS_GRANITE.id()) {
			world.setBlockWithNotify(x, y, z, Blocks.GRANITE.id());
			world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, x,y,z,"random.bite",1.0F,1.0F);
			cir.setReturnValue(true);
		}
		if (world.getBlockId(x, y, z) == Blocks.MOSS_BASALT.id()) {
			world.setBlockWithNotify(x, y, z, Blocks.BASALT.id());
			world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, x,y,z,"random.bite",1.0F,1.0F);
			cir.setReturnValue(true);
		}
		if (world.getBlockId(x, y, z) == Blocks.MOSS_LIMESTONE.id()) {
			world.setBlockWithNotify(x, y, z, Blocks.LIMESTONE.id());
			world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, x,y,z,"random.bite",1.0F,1.0F);
			cir.setReturnValue(true);
		}
	}
}
