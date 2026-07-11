package com.google.android.gms.internal.ads;

import Hr.CQ.USEaHtCMH;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzep {

    @Nullable
    private static zzep zza;
    private final Executor zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;

    @GuardedBy
    private int zze;

    @GuardedBy
    private boolean zzf;

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    public static synchronized zzep zza(Context context) {
        try {
            if (zza == null) {
                zza = new zzep(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    private final void zzg() {
        CopyOnWriteArrayList<zzel> copyOnWriteArrayList = this.zzc;
        for (zzel zzelVar : copyOnWriteArrayList) {
            if (zzelVar.zza()) {
                copyOnWriteArrayList.remove(zzelVar);
            }
        }
    }

    public final int zzc() {
        int i2;
        synchronized (this.zzd) {
            i2 = this.zze;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzd(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(USEaHtCMH.sfWyLcyI);
        int i2 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i2 = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i2 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i2 = 4;
                                break;
                            case 13:
                                i2 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i2 = 6;
                                break;
                            case 18:
                                i2 = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i2 = 9;
                                }
                                break;
                        }
                    } else if (type != 1) {
                        if (type != 4 && type != 5) {
                            if (type != 6) {
                                i2 = type != 9 ? 8 : 7;
                            }
                        }
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i2 != 5) {
            zze(i2);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            zzei zzeiVar = new zzei(this);
            telephonyManager.registerTelephonyCallback(this.zzb, zzeiVar);
            telephonyManager.unregisterTelephonyCallback(zzeiVar);
        } catch (RuntimeException unused2) {
            zze(5);
        }
    }

    private zzep(final Context context) {
        Executor executorZza = zzdh.zza();
        this.zzb = executorZza;
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        executorZza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzem
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzeo(this.zza, null), intentFilter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze(int i2) {
        zzg();
        synchronized (this.zzd) {
            try {
                if (this.zzf && this.zze == i2) {
                    return;
                }
                this.zzf = true;
                this.zze = i2;
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((zzel) it.next()).zzb();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzej zzejVar, Executor executor) {
        boolean z2;
        zzg();
        zzel zzelVar = new zzel(this, zzejVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzelVar);
            z2 = this.zzf;
        }
        if (z2) {
            zzelVar.zzb();
        }
    }
}
