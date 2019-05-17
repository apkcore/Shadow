package com.tencent.shadow.test.cases.plugin_main;

import android.content.Intent;

import androidx.test.core.app.ApplicationProvider;

public class ActivityContextSubDirTest extends PluginMainAppTest {
    @Override
    protected Intent getLaunchIntent() {
        Intent pluginIntent = new Intent();
        String packageName = ApplicationProvider.getApplicationContext().getPackageName();
        pluginIntent.setClassName(
                packageName,
                "com.tencent.shadow.test.plugin.general_cases.lib.usecases.context.ActivityContextSubDirTestActivity"
        );
        return pluginIntent;
    }
}
