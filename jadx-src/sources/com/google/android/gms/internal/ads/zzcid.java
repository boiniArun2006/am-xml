package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.dash.DashMediaSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzcid implements zzlj {
    private final zzaat zza = new zzaat(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
    private int zzf;
    private boolean zzg;

    zzcid() {
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zza(zzpq zzpqVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        int i2;
        this.zzf = 0;
        for (zzaac zzaacVar : zzaacVarArr) {
            if (zzaacVar != null) {
                int i3 = this.zzf;
                int i5 = zzaacVar.zza().zzc;
                if (i5 == 0) {
                    i2 = 144310272;
                } else if (i5 == 1) {
                    i2 = 13107200;
                } else if (i5 != 2) {
                    i2 = 131072;
                    if (i5 != 3 && i5 != 5 && i5 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i2 = 131072000;
                }
                this.zzf = i3 + i2;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzc(zzpq zzpqVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzd(zzpq zzpqVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final zzaan zze(zzpq zzpqVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final long zzf(zzpq zzpqVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzg(zzpq zzpqVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzh(zzli zzliVar) {
        long j2 = zzliVar.zze;
        boolean z2 = true;
        char c2 = j2 > this.zzc ? (char) 0 : j2 < this.zzb ? (char) 2 : (char) 1;
        int iZzg = this.zza.zzg();
        int i2 = this.zzf;
        if (c2 != 2 && (c2 != 1 || !this.zzg || iZzg >= i2)) {
            z2 = false;
        }
        this.zzg = z2;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzi(zzli zzliVar) {
        long j2 = zzliVar.zzg ? this.zze : this.zzd;
        return j2 <= 0 || zzliVar.zze >= j2;
    }

    public final synchronized void zzk(int i2) {
        this.zzb = ((long) i2) * 1000;
    }

    public final synchronized void zzl(int i2) {
        this.zzc = ((long) i2) * 1000;
    }

    public final synchronized void zzm(int i2) {
        this.zzd = ((long) i2) * 1000;
    }

    public final synchronized void zzn(int i2) {
        this.zze = ((long) i2) * 1000;
    }

    @VisibleForTesting
    final void zzo(boolean z2) {
        this.zzf = 0;
        this.zzg = false;
        if (z2) {
            this.zza.zze();
        }
    }
}
