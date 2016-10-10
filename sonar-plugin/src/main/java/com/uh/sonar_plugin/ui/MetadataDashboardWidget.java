package com.uh.sonar_plugin.ui;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;

@UserRole(UserRole.USER)
@Description("Widget that show information about harcoded number of Erros in project.")
public class MetadataDashboardWidget extends AbstractRubyTemplate implements RubyRailsWidget {

	@Override
	public String getId() {
		return "project_error_plugin";
	}

	@Override
	public String getTitle() {
		return "Project Error Plugin";
	}

	@Override
	protected String getTemplatePath() {
		return "/widgets/analysis_widget.html.erb";
	}

}
