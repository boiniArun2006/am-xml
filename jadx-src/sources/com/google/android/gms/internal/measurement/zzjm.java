package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzjm {

    @Nullable
    @GuardedBy
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzjm() {
    }

    @ChecksSdkIntAtLeast
    public static boolean zza() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r5 = true;
     */
    @RequiresApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzd(Context context) {
        boolean z2;
        if (zzb) {
            return true;
        }
        synchronized (zzjm.class) {
            try {
                if (zzb) {
                    return true;
                }
                int i2 = 1;
                while (true) {
                    z2 = false;
                    if (i2 > 2) {
                        break;
                    }
                    if (zza == null) {
                        zza = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = zza;
                    if (userManager == null) {
                        z2 = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                        if (!userManager.isUserRunning(Process.myUserHandle())) {
                            break;
                        }
                    } catch (NullPointerException e2) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                        zza = null;
                        i2++;
                    }
                }
                if (z2) {
                    zza = null;
                }
                if (z2) {
                    zzb = true;
                }
                return z2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zzb(Context context) {
        if (zza() && !zzd(context)) {
            return true;
        }
        return false;
    }

    public static boolean zzc(Context context) {
        if (zza() && !zzd(context)) {
            return false;
        }
        return true;
    }
}
