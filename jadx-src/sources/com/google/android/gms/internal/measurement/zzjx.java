package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzjx implements zzju {

    @GuardedBy
    private static zzjx zza;
    private final Context zzb;
    private final ContentObserver zzc;

    @GuardedBy
    private boolean zzd;

    private zzjx() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    private zzjx(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjv(this, null);
    }

    static zzjx zza(Context context) {
        zzjx zzjxVar;
        synchronized (zzjx.class) {
            try {
                if (zza == null) {
                    zza = PermissionChecker.rl(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzjx(context) : new zzjx();
                }
                zzjx zzjxVar2 = zza;
                if (zzjxVar2 != null && zzjxVar2.zzc != null && !zzjxVar2.zzd) {
                    try {
                        context.getContentResolver().registerContentObserver(zzjg.zza, true, zza.zzc);
                        ((zzjx) Xo.HI(zza)).zzd = true;
                    } catch (SecurityException e2) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e2);
                    }
                }
                zzjxVar = (zzjx) Xo.HI(zza);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjxVar;
    }

    static synchronized void zzc() {
        Context context;
        try {
            zzjx zzjxVar = zza;
            if (zzjxVar != null && (context = zzjxVar.zzb) != null && zzjxVar.zzc != null && zzjxVar.zzd) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzju
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final String zze(final String str) {
        Context context = this.zzb;
        if (context != null && !zzjm.zzb(context)) {
            try {
                return (String) zzju.zzg(new zzjt() { // from class: com.google.android.gms.internal.measurement.zzjw
                    @Override // com.google.android.gms.internal.measurement.zzjt
                    public final /* synthetic */ Object zza() {
                        return this.zza.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e2) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e2);
            }
        }
        return null;
    }

    final /* synthetic */ String zzd(String str) {
        return zzjf.zza(((Context) Xo.HI(this.zzb)).getContentResolver(), str, null);
    }
}
