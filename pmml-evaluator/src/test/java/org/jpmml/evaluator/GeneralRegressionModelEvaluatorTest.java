/*
 * Copyright (c) 2013 Villu Ruusmann
 */
package org.jpmml.evaluator;

import org.dmg.pmml.*;

abstract
public class GeneralRegressionModelEvaluatorTest extends PMMLTest {

	public GeneralRegressionModelEvaluator createEvaluator() throws Exception {
		PMML pmml = loadPMML(getClass());

		GeneralRegressionModelEvaluator evaluator = new GeneralRegressionModelEvaluator(pmml);

		return evaluator;
	}
}