package com.pairip;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class StartupLauncher {
    private static boolean launchCalled = false;
    private static String startupProgramName = "LBTFTPenSqISV9NY";

    public static synchronized void launch() {
        if (launchCalled) {
            return;
        }
        launchCalled = true;
        VMRunner.invoke(startupProgramName, null);
    }

    private StartupLauncher() {
    }
}
