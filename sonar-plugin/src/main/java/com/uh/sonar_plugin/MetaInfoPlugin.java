package com.uh.sonar_plugin;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.Extension;
import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;

import com.uh.sonar_plugin.sensor.MetadataSensor;
import com.uh.sonar_plugin.ui.MetadataDashboardWidget;

@Properties({
    @Property(key = "metadata.project", name = "Plugin Property", description = "A property for the plugin")})
public class MetaInfoPlugin extends SonarPlugin {

	@Override
	public List<Class<? extends Extension>> getExtensions() {
		return Arrays.asList(
				MetadataMetrics.class, 
				MetadataSensor.class, 
				MetadataDashboardWidget.class);
	}

}
