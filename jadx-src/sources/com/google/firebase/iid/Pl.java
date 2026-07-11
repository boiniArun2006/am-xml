package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Pl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f60516O = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f60517n;
    private int nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f60518t;

    public Pl(Context context) {
        this.f60517n = context;
    }

    private synchronized void KN() {
        PackageInfo packageInfoJ2 = J2(this.f60517n.getPackageName());
        if (packageInfoJ2 != null) {
            this.rl = Integer.toString(packageInfoJ2.versionCode);
            this.f60518t = packageInfoJ2.versionName;
        }
    }

    public synchronized int O() {
        int i2 = this.f60516O;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.f60517n.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i3 = 1;
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f60516O = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f60516O = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f60516O = 2;
            i3 = 2;
        } else {
            this.f60516O = 1;
        }
        return i3;
    }

    public synchronized String n() {
        try {
            if (this.rl == null) {
                KN();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.rl;
    }

    public synchronized int nr() {
        PackageInfo packageInfoJ2;
        try {
            if (this.nr == 0 && (packageInfoJ2 = J2("com.google.android.gms")) != null) {
                this.nr = packageInfoJ2.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.nr;
    }

    public synchronized String rl() {
        try {
            if (this.f60518t == null) {
                KN();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f60518t;
    }

    private PackageInfo J2(String str) {
        try {
            return this.f60517n.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String t(com.google.firebase.Wre wre) {
        String strNr = wre.ck().nr();
        if (strNr != null) {
            return strNr;
        }
        String strT = wre.ck().t();
        if (!strT.startsWith("1:")) {
            return strT;
        }
        String[] strArrSplit = strT.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public boolean Uo() {
        if (O() != 0) {
            return true;
        }
        return false;
    }
}
