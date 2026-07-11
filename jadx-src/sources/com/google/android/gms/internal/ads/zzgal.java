package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgal extends zzgak {
    private static zzgal zzd;

    private zzgal(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzgal zzh(Context context) {
        zzgal zzgalVar;
        synchronized (zzgal.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgal(context);
                }
                zzgalVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgalVar;
    }

    public final zzgah zzi(long j2, boolean z2) throws IOException {
        zzgah zzgahVarZza;
        synchronized (zzgal.class) {
            zzgahVarZza = zza(null, null, j2, z2);
        }
        return zzgahVarZza;
    }

    public final zzgah zzj(String str, String str2, long j2, boolean z2) throws IOException {
        zzgah zzgahVarZza;
        synchronized (zzgal.class) {
            zzgahVarZza = zza(str, str2, j2, z2);
        }
        return zzgahVarZza;
    }

    public final void zzk() throws IOException {
        synchronized (zzgal.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzgal.class) {
            zzc(true);
        }
    }
}
