package QNA;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class rv6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8146n;

    synchronized String n(Context context) {
        try {
            if (this.f8146n == null) {
                this.f8146n = rl(context);
            }
        } finally {
        }
        return "".equals(this.f8146n) ? null : this.f8146n;
    }

    rv6() {
    }

    private static String rl(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }
}
