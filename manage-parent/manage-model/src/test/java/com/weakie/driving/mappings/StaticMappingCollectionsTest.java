package com.weakie.driving.mappings;

import static org.junit.Assert.*;

import org.junit.Test;

import com.weakie.driving.mappings.StaticMappingCollections;

public class StaticMappingCollectionsTest {

	@Test
	public void test() {
		StaticMappingCollections.getInstance().initialize();
		assertNotNull(StaticMappingCollections.getInstance().getDebitedPeroidMapping());
	}

}
