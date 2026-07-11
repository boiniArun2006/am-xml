package K7m;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static UiModeManager f4838n;

    public static a88.CN3 n() {
        UiModeManager uiModeManager = f4838n;
        if (uiModeManager == null) {
            return a88.CN3.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? a88.CN3.OTHER : a88.CN3.CTV : a88.CN3.MOBILE;
    }

    public static void rl(Context context) {
        if (context != null) {
            f4838n = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
