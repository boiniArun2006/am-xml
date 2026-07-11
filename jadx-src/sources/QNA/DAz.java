package QNA;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class DAz {
    private boolean J2;
    private final TaskCompletionSource KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f8052O;
    private Boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedPreferences f8053n;
    TaskCompletionSource nr;
    private final com.google.firebase.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f8054t;

    public synchronized void KN(Boolean bool) {
        if (bool != null) {
            try {
                this.J2 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.Uo = bool != null ? bool : n(this.rl.qie());
        xMQ(this.f8053n, bool);
        synchronized (this.f8054t) {
            try {
                if (nr()) {
                    if (!this.f8052O) {
                        this.nr.trySetResult(null);
                        this.f8052O = true;
                    }
                } else if (this.f8052O) {
                    this.nr = new TaskCompletionSource();
                    this.f8052O = false;
                }
            } finally {
            }
        }
    }

    public synchronized boolean nr() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.Uo;
            zBooleanValue = bool != null ? bool.booleanValue() : O();
            J2(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    private void J2(boolean z2) {
        h1M.CN3.J2().rl(String.format("Crashlytics automatic data collection %s by %s.", z2 ? "ENABLED" : "DISABLED", this.Uo == null ? "global Firebase setting" : this.J2 ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private boolean O() {
        try {
            return this.rl.S();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private static Boolean Uo(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e2) {
            h1M.CN3.J2().O("Could not read data collection permission from manifest", e2);
            return null;
        }
    }

    private Boolean rl() {
        if (!this.f8053n.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.J2 = false;
        return Boolean.valueOf(this.f8053n.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    public Task gh() {
        return Zlm.n.rl(this.KN.getTask(), mUb());
    }

    public Task mUb() {
        Task task;
        synchronized (this.f8054t) {
            task = this.nr.getTask();
        }
        return task;
    }

    public void t(boolean z2) {
        if (!z2) {
            throw new IllegalStateException(YjqZUJsVmhcjko.paFqelATV);
        }
        this.KN.trySetResult(null);
    }

    public DAz(com.google.firebase.Wre wre) {
        Object obj = new Object();
        this.f8054t = obj;
        this.nr = new TaskCompletionSource();
        this.f8052O = false;
        this.J2 = false;
        this.KN = new TaskCompletionSource();
        Context contextQie = wre.qie();
        this.rl = wre;
        this.f8053n = Dsr.Ik(contextQie);
        Boolean boolRl = rl();
        this.Uo = boolRl == null ? n(contextQie) : boolRl;
        synchronized (obj) {
            try {
                if (nr()) {
                    this.nr.trySetResult(null);
                    this.f8052O = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean n(Context context) {
        Boolean boolUo = Uo(context);
        if (boolUo == null) {
            this.J2 = false;
            return null;
        }
        this.J2 = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolUo));
    }

    private static void xMQ(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }
}
