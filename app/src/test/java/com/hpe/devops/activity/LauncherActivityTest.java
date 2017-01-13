package com.hpe.devops.activity;

import com.hpe.devops.BuildConfig;
import com.hpe.devops.R;
import com.hpe.devops.application.DevOpsApplication;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class LauncherActivityTest {

    LauncherActivity launcherActivity;

    @Before
    public void setup() {
        DevOpsApplication.inject(this);
        launcherActivity = new LauncherActivity();
    }

    @Test
    public void onCreate_shouldSetTitle() throws Exception {
        assertThat("Ahold").isEqualTo("Ahold");
    }

}
