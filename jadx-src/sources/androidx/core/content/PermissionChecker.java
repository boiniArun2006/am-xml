package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class PermissionChecker {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface PermissionResult {
    }

    public static int n(Context context, String str, int i2, int i3, String str2) {
        int iRl;
        if (context.checkPermission(str, i2, i3) == -1) {
            return -1;
        }
        String strT = AppOpsManagerCompat.t(str);
        if (strT == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i3);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (iMyUid == i3 && ObjectsCompat.n(packageName, str2)) {
            iRl = AppOpsManagerCompat.n(context, i3, strT, str2);
        } else {
            iRl = AppOpsManagerCompat.rl(context, strT, str2);
        }
        if (iRl == 0) {
            return 0;
        }
        return -2;
    }

    public static int rl(Context context, String str) {
        return n(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
