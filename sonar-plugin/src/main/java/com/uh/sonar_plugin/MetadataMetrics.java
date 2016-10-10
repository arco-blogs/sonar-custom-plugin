package com.uh.sonar_plugin;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

public class MetadataMetrics implements Metrics {
	public static final String PROJECT_ERRORS = "prj_errors";
	public static final Metric ERRORS = new Metric.Builder(PROJECT_ERRORS, "Errors in Project", Metric.ValueType.INT)
			.setDescription("Projects Error.").setQualitative(true).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

	@Override
	public List getMetrics() {
		return Arrays.asList(ERRORS);
	}
}