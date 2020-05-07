/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
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
package com.ibm.watson.health.iml.v1.corpora;

import org.junit.Assert;
import org.junit.Test;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.watson.health.iml.v1.InsightsForMedicalLiteratureService;
import com.ibm.watson.health.iml.v1.WatsonServiceTest;
import com.ibm.watson.health.iml.v1.model.CorporaConfigModel;
import com.ibm.watson.health.iml.v1.model.SetCorpusConfigOptions;

public class TestConfigureCorpus extends WatsonServiceTest {
	private InsightsForMedicalLiteratureService imlService;

	public TestConfigureCorpus() {
		super();
		try {
			this.setUp();
			imlService = this.getServiceInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConfigureCorpus() {
		SetCorpusConfigOptions configOptions = new SetCorpusConfigOptions.Builder().userName("elastic").password("imliml")
				.corpusURI("watsonvmwrk27.rch.stglabs.ibm.com:9200").build();
		ServiceCall<CorporaConfigModel> sc = imlService.setCorpusConfig(configOptions);
		try {
		Response<CorporaConfigModel> response = sc.execute();
		} catch (Exception mie) {
			Assert.assertNotNull(mie.getMessage());
		}
	}
}
