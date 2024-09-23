/*******************************************************************************
 * Copyright (c) 2022 Christoph Läubrich and others.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Christoph Läubrich - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.p2resolver;

import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.query.IQueryable;
import org.eclipse.tycho.ReactorProject;
import org.eclipse.tycho.p2.target.facade.PomDependencyCollector;

public interface PomUnits {
    IQueryable<IInstallableUnit> createPomQueryable(ReactorProject reactorProject);
    void addCollectedUnits(PomDependencyCollector collector, ReactorProject reactorProject);
}
