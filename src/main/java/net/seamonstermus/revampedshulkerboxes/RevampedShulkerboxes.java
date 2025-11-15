package net.seamonstermus.revampedshulkerboxes;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RevampedShulkerboxes implements ModInitializer {
	public static final String MOD_ID = "revamped-shulkerboxes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}