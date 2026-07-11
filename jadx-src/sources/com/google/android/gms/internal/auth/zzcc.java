package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcc {

    @GuardedBy
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    @ChecksSdkIntAtLeast
    public static boolean zzb() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, NullPointerException -> 0x0045, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:35:0x0058, B:36:0x005a, B:24:0x0031, B:26:0x0037, B:33:0x0054, B:31:0x0046), top: B:42:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context) {
        int i2;
        boolean z2;
        if (zzb() && !zzb) {
            synchronized (zzcc.class) {
                try {
                    if (!zzb) {
                        i2 = 1;
                        while (true) {
                            if (i2 <= 2) {
                                if (zza == null) {
                                    zza = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = zza;
                                if (userManager == null) {
                                    z2 = true;
                                    break;
                                }
                                if (userManager.isUserUnlocked()) {
                                    break;
                                }
                                if (!userManager.isUserRunning(Process.myUserHandle())) {
                                    break;
                                }
                                if (z2) {
                                    zza = null;
                                }
                            } else {
                                break;
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                        if (z2) {
                            zzb = true;
                        }
                        if (!z2) {
                            return true;
                        }
                    }
                } catch (NullPointerException e2) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                    zza = null;
                    i2++;
                } finally {
                }
            }
        }
        return false;
    }
}
