package upM;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static UiModeManager f74604n;

    public static Vy.CN3 n() {
        UiModeManager uiModeManager = f74604n;
        if (uiModeManager == null) {
            return Vy.CN3.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? Vy.CN3.OTHER : Vy.CN3.CTV : Vy.CN3.MOBILE;
    }

    public static void rl(Context context) {
        if (context != null) {
            f74604n = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
