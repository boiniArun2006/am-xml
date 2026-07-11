package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgai {
    private static zzgai zzb;
    final zzgaj zza;

    public static final zzgai zza(Context context) {
        zzgai zzgaiVar;
        synchronized (zzgai.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgai(context);
                }
                zzgaiVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgaiVar;
    }

    public final void zzb(boolean z2) throws IOException {
        synchronized (zzgai.class) {
            try {
                zzgaj zzgajVar = this.zza;
                zzgajVar.zzb("paidv2_publisher_option", Boolean.valueOf(z2));
                if (!z2) {
                    zzgajVar.zzf("paidv2_creation_time");
                    zzgajVar.zzf("paidv2_id");
                    zzgajVar.zzf("vendor_scoped_gpid_v2_id");
                    zzgajVar.zzf("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzgai.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z2) throws IOException {
        synchronized (zzgai.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z2));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzgai.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }

    private zzgai(Context context) {
        this.zza = zzgaj.zza(context);
    }
}
