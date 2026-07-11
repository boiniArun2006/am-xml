package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfo {
    private final zzfn zza;
    private final zzdx zzb;
    private final zzdx zzc;
    private boolean zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzg(boolean z2, boolean z3) {
        return z2 && z3;
    }

    public final void zza(boolean z2) {
        if (this.zzd == z2) {
            return;
        }
        this.zzd = z2;
        zzf(z2, this.zze);
    }

    public final void zzb(boolean z2) {
        if (this.zze == z2) {
            return;
        }
        this.zze = z2;
        if (this.zzd) {
            zzf(true, z2);
        }
    }

    final /* synthetic */ void zzc(Runnable runnable, boolean z2, boolean z3) {
        this.zzc.zzl(runnable);
        this.zza.zzb(z2, z3);
    }

    final /* synthetic */ void zzd(boolean z2, boolean z3) {
        this.zza.zzb(z2, z3);
    }

    public zzfo(Context context, Looper looper, zzdn zzdnVar) {
        this.zza = new zzfn(context.getApplicationContext());
        this.zzb = zzdnVar.zzd(looper, null);
        this.zzc = zzdnVar.zzd(Looper.getMainLooper(), null);
    }

    private final void zzf(final boolean z2, final boolean z3) {
        if (zzg(z2, z3)) {
            this.zzb.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd(z2, z3);
                }
            });
            return;
        }
        final zzfn zzfnVar = this.zza;
        Objects.requireNonNull(zzfnVar);
        final Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfnVar.zza();
            }
        };
        this.zzc.zzo(runnable, 1000L);
        this.zzb.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(runnable, z2, z3);
            }
        });
    }
}
