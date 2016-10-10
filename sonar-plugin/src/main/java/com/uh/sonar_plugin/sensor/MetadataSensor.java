package com.uh.sonar_plugin.sensor;

import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import com.uh.sonar_plugin.MetadataMetrics;
import org.sonar.api.measures.Metric;

public class MetadataSensor implements Sensor {

	public MetadataSensor() {
	}

	@Override
	public boolean shouldExecuteOnProject(Project project) {
		return true;
	}

	@Override
	public void analyse(Project sonarProject, SensorContext context) {
		saveMeasure(context, context.getResource(sonarProject), MetadataMetrics.ERRORS, "ERRORS",
				sonarProject.getName(), 10);
	}

	private void saveMeasure(SensorContext context, Resource resource, Metric metric, String message,
			String projectInfo, Integer value) {
		context.saveMeasure(resource, metric, new Double(value));
	}
}
