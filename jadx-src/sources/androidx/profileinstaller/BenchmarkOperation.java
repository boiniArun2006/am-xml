package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class BenchmarkOperation {

    @RequiresApi
    private static class Api21ContextHelper {
        static File n(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @RequiresApi
    private static class Api24ContextHelper {
        static Context n(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static void rl(Context context, ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        if (n(Build.VERSION.SDK_INT >= 34 ? Api24ContextHelper.n(context).getCacheDir() : Api21ContextHelper.n(Api24ContextHelper.n(context)))) {
            resultDiagnostics.n(14, null);
        } else {
            resultDiagnostics.n(15, null);
        }
    }

    static boolean n(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File file2 : fileArrListFiles) {
                if (n(file2) && z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }
}
