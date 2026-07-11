package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgam extends zzgak {
    private static zzgam zzd;

    private zzgam(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgam zzh(Context context) {
        zzgam zzgamVar;
        synchronized (zzgam.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgam(context);
                }
                zzgamVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgamVar;
    }

    public final zzgah zzi(long j2, boolean z2) throws IOException {
        synchronized (zzgam.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j2, z2);
                }
                return new zzgah();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgam.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
