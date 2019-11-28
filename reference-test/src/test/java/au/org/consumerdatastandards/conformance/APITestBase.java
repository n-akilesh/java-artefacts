package au.org.consumerdatastandards.conformance;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;

import java.io.IOException;

public abstract class APITestBase {

    @Before
    public void setApiBasePath() throws IOException {
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        String apiBasePath = variables.getProperty("apiBase");
        if (!StringUtils.isBlank(apiBasePath)) {
            getSteps().setupApiBasePath(apiBasePath);
            getSteps().setupPttProperties();
        }
    }

    protected abstract APIStepsBase getSteps();
}
