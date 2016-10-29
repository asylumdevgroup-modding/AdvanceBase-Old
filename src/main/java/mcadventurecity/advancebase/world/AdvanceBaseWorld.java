package mcadventurecity.advancebase.world;

import java.util.Random;

import mcadventurecity.advancebase.blocks.AdvanceBaseBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class AdvanceBaseWorld implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { // the overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(AdvanceBaseBlocks.copperOre.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 20, 80, 4 + random.nextInt(5), 8);
		generateOre(AdvanceBaseBlocks.tinOre.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 10, 64, 4 + random.nextInt(5), 6);
		generateOre(AdvanceBaseBlocks.aluminumOre.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 64, 4 + random.nextInt(5), 7);
		generateOre(AdvanceBaseBlocks.leadOre.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 30, 4 + random.nextInt(5), 5);
		generateOre(AdvanceBaseBlocks.silverOre.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 3, 4 + random.nextInt(5), 4);
	}
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
