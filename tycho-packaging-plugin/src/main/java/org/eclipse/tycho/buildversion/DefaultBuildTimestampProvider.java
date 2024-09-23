/*******************************************************************************
 * Copyright (c) 2012, 2016 Sonatype Inc. and others.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.buildversion;

import java.util.Date;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.MojoExecution;
import org.apache.maven.project.MavenProject;
import org.eclipse.tycho.build.BuildTimestampProvider;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Build timestamp provider that returns the same timestamp for all projects, the
 * ${maven.build.timestamp}.
 */
@Singleton
@Named
public class DefaultBuildTimestampProvider implements BuildTimestampProvider {

    @Override
    public Date getTimestamp(MavenSession session, MavenProject project, MojoExecution execution) {
        return session.getStartTime();
    }

	@Override
	public void setQuiet(boolean quiet) {

	}
}
