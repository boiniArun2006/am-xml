package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class PackageManagerHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42992n = Logger.J2("PackageManagerHelper");

    public static void n(Context context, Class cls, boolean z2) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z2 ? 1 : 2, 1);
            Logger.t().n(f42992n, String.format("%s %s", cls.getName(), z2 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e2) {
            Logger.t().n(f42992n, String.format("%s could not be %s", cls.getName(), z2 ? "enabled" : "disabled"), e2);
        }
    }
}
