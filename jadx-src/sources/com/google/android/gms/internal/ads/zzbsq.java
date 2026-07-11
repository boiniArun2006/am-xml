package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbsq {
    private final Object zza = new Object();
    private final Object zzb = new Object();

    @Nullable
    private zzbsz zzc;
    private zzbsz zzd;

    private static final boolean zze(Context context) {
        if (((Boolean) zzbjk.zzc.zze()).booleanValue()) {
            return false;
        }
        return com.google.android.gms.ads.internal.util.zzs.zzm(zzd(context)).zza().toLowerCase(Locale.ROOT).equals("ru");
    }

    public final zzbsz zza(Context context, VersionInfoParcel versionInfoParcel, zzfor zzforVar) {
        zzbsz zzbszVar;
        String str;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    Context contextZzd = zzd(context);
                    if (zze(context)) {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzc);
                    } else {
                        str = (String) zzbjo.zza.zze();
                    }
                    this.zzd = new zzbsz(contextZzd, versionInfoParcel, str, zzforVar);
                }
                zzbszVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbszVar;
    }

    public final zzbsz zzb(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzfor zzforVar) {
        zzbsz zzbszVar;
        String str;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    if (zze(context)) {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzc);
                    } else if (((Boolean) zzbjk.zzg.zze()).booleanValue()) {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zza);
                    } else {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzb);
                    }
                    this.zzc = new zzbsz(zzd(context), versionInfoParcel, str, zzforVar);
                }
                zzbszVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbszVar;
    }

    public final void zzc() {
        synchronized (this.zza) {
            try {
                zzbsz zzbszVar = this.zzc;
                if (zzbszVar != null) {
                    zzbszVar.zzc();
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }
}
