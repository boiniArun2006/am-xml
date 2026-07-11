package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class AppOpsManagerCompat {

    @RequiresApi
    static class Api29Impl {
        static int n(AppOpsManager appOpsManager, String str, int i2, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i2, str2);
        }

        static AppOpsManager t(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }

        static String rl(Context context) {
            return context.getOpPackageName();
        }
    }

    @RequiresApi
    static class Api23Impl {
        static Object n(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        static int rl(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        static String t(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    public static int n(Context context, int i2, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return rl(context, str, str2);
        }
        AppOpsManager appOpsManagerT = Api29Impl.t(context);
        int iN = Api29Impl.n(appOpsManagerT, str, Binder.getCallingUid(), str2);
        return iN != 0 ? iN : Api29Impl.n(appOpsManagerT, str, i2, Api29Impl.rl(context));
    }

    public static int rl(Context context, String str, String str2) {
        return Api23Impl.rl((AppOpsManager) Api23Impl.n(context, AppOpsManager.class), str, str2);
    }

    public static String t(String str) {
        return Api23Impl.t(str);
    }
}
