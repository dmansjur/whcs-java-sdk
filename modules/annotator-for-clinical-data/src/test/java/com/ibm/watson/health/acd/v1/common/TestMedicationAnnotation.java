/*
 * Copyright 2018, 2020 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.health.acd.v1.common;

import java.util.List;

import org.junit.Assert;

import com.ibm.watson.health.acd.v1.model.MedicationAnnotation;
import com.ibm.watson.health.acd.v1.util.CustomCollection;

public class TestMedicationAnnotation {

	public static void testMedicationAnnotation(MedicationAnnotation annotation) {
		Assert.assertTrue(annotation.getBegin() > -1);
		Assert.assertNotNull(annotation.getCoveredText());
		Assert.assertNotNull(annotation.getCui());
		List<CustomCollection> customCollections = annotation.getDrug();
		if (customCollections != null && !customCollections.isEmpty()) {
			for (CustomCollection collection : customCollections) {
				TestCustomCollection.testCustomCollection(collection);
			}
		}
		Assert.assertTrue(annotation.getEnd() > annotation.getBegin());
		Assert.assertNull(annotation.getId());
		if (annotation.getSectionNormalizedName() != null) {
			Assert.assertEquals(annotation.getSectionNormalizedName(), Constants.SECTION_NAME);
			Assert.assertEquals(annotation.getSectionSurfaceForm(), Constants.SECTION_NAME);
		}
		Assert.assertNotNull(annotation.getType());
		if (annotation.getUid() != null) {
			Assert.assertTrue(annotation.getUid() > 0);
		}
	}
}
