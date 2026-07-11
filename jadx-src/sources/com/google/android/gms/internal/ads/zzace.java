package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzace extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzacd zzd;
    private boolean zze;

    public static zzace zzb(Context context, boolean z2) {
        boolean z3 = true;
        if (z2 && !zza(context)) {
            z3 = false;
        }
        zzgrc.zzi(z3);
        return new zzacd().zza(z2 ? zzb : 0);
    }

    public static synchronized boolean zza(Context context) {
        if (!zzc) {
            try {
            } catch (zzdu e2) {
                zzee.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e2.getMessage())));
            }
            int i2 = zzdv.zza(context) ? zzdv.zzb() ? 1 : 2 : 0;
            zzb = i2;
            zzc = true;
        }
        return zzb != 0;
    }

    /* synthetic */ zzace(zzacd zzacdVar, SurfaceTexture surfaceTexture, boolean z2, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzacdVar;
        this.zza = z2;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzacd zzacdVar = this.zzd;
        synchronized (zzacdVar) {
            try {
                if (!this.zze) {
                    zzacdVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
