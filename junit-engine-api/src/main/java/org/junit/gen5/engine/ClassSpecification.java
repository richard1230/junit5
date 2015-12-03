/*
 * Copyright 2015 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.gen5.engine;

public class ClassSpecification implements TestPlanSpecificationElement {

	private final Class<?> testClass;

	public ClassSpecification(Class<?> testClass) {
		this.testClass = testClass;
	}

	@Override
	public void accept(TestPlanSpecificationElementVisitor visitor) {
		visitor.visitClass(testClass);
	}
}