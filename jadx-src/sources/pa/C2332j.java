package pa;

import WU.w6;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;

/* JADX INFO: renamed from: pa.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class C2332j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f72034n;
    private boolean nr;
    private final SharedPreferences rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w6 f72035t;

    public synchronized boolean rl() {
        return this.nr;
    }

    private boolean nr() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f72034n.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f72034n.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private boolean t() {
        return this.rl.contains("firebase_data_collection_default_enabled") ? this.rl.getBoolean("firebase_data_collection_default_enabled", true) : nr();
    }

    public C2332j(Context context, String str, w6 w6Var) {
        Context contextN = n(context);
        this.f72034n = contextN;
        this.rl = contextN.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f72035t = w6Var;
        this.nr = t();
    }

    private static Context n(Context context) {
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }
}
