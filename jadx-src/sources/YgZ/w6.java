package YgZ;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.content.pm.PackageInfoCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f12217n = new w6();

    public static /* synthetic */ void O(w6 w6Var, Context context, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        w6Var.nr(context, str, str2);
    }

    public final String J2() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    public final String KN() {
        String str = Build.ID;
        return str == null ? "" : str;
    }

    public final String Uo() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    public final String mUb() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    public final String n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    public final void nr(Context context, String label, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(text, "text");
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText(label, text);
        Intrinsics.checkNotNullExpressionValue(clipDataNewPlainText, "newPlainText(...)");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }

    public final long rl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return PackageInfoCompat.n(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (Exception e2) {
            Log.e("DeviceUtils", "Exception", e2);
            return 0L;
        }
    }

    public final String t(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str != null ? str : "";
        } catch (Exception e2) {
            Log.e("DeviceUtils", "Exception", e2);
            return "";
        }
    }

    public final int xMQ() {
        return Build.VERSION.SDK_INT;
    }

    private w6() {
    }
}
