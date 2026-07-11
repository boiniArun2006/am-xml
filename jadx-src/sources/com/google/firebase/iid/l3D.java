package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;
import cS.Zv.SzFNXybiSxdx;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class l3D {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static l3D f60533t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f60534n = null;
    private Boolean rl = null;

    private l3D() {
    }

    public static synchronized l3D n() {
        try {
            if (f60533t == null) {
                f60533t = new l3D();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60533t;
    }

    boolean rl(Context context) {
        if (this.rl == null) {
            this.rl = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f60534n.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.rl.booleanValue();
    }

    boolean t(Context context) {
        if (this.f60534n == null) {
            this.f60534n = Boolean.valueOf(context.checkCallingOrSelfPermission(wDgKoYAES.BHtnsOuYFBpaXPf) == 0);
        }
        if (!this.f60534n.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", SzFNXybiSxdx.PAtIzk);
        }
        return this.f60534n.booleanValue();
    }
}
