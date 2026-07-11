package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzpe {
    final /* synthetic */ zzpf zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzwk zze;
    private boolean zzf;
    private boolean zzg;

    public final boolean zzb(int i2, @Nullable zzwk zzwkVar) {
        if (zzwkVar != null) {
            long j2 = zzwkVar.zzd;
            if (j2 != -1) {
                zzwk zzwkVar2 = this.zze;
                return zzwkVar2 == null ? !zzwkVar.zzb() && j2 == this.zzd : j2 == zzwkVar2.zzd && zzwkVar.zzb == zzwkVar2.zzb && zzwkVar.zzc == zzwkVar2.zzc;
            }
        }
        return i2 == this.zzc;
    }

    final /* synthetic */ String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzwk zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z2) {
        this.zzf = true;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(boolean z2) {
        this.zzg = true;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i2 = this.zzc;
        if (i2 < zzbfVar.zza()) {
            zzpf zzpfVar = this.zza;
            zzbfVar.zzb(i2, zzpfVar.zzj(), 0L);
            for (int i3 = zzpfVar.zzj().zzn; i3 <= zzpfVar.zzj().zzo; i3++) {
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i3));
                if (iZze != -1) {
                    i2 = zzbfVar2.zzd(iZze, zzpfVar.zzk(), false).zzc;
                    break;
                }
            }
            i2 = -1;
        } else if (i2 >= zzbfVar2.zza()) {
            i2 = -1;
        }
        this.zzc = i2;
        if (i2 == -1) {
            return false;
        }
        zzwk zzwkVar = this.zze;
        return zzwkVar == null || zzbfVar2.zze(zzwkVar.zza) != -1;
    }

    public final void zzc(int i2, @Nullable zzwk zzwkVar) {
        if (this.zzd == -1 && i2 == this.zzc && zzwkVar != null) {
            zzpf zzpfVar = this.zza;
            long j2 = zzwkVar.zzd;
            if (j2 >= zzpfVar.zzi()) {
                this.zzd = j2;
            }
        }
    }

    public final boolean zzd(zzmy zzmyVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return this.zzc != zzmyVar.zzc;
        }
        long j2 = this.zzd;
        if (j2 == -1) {
            return false;
        }
        long j3 = zzwkVar.zzd;
        if (j3 > j2) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zzmyVar.zzb;
        int iZze = zzbfVar.zze(zzwkVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzwk zzwkVar2 = this.zze;
        if (j3 < zzwkVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzwkVar.zzb()) {
            int i2 = zzwkVar.zze;
            return i2 == -1 || i2 > zzwkVar2.zzb;
        }
        int i3 = zzwkVar.zzb;
        int i5 = zzwkVar.zzc;
        int i7 = zzwkVar2.zzb;
        if (i3 <= i7) {
            return i3 == i7 && i5 > zzwkVar2.zzc;
        }
        return true;
    }

    public zzpe(zzpf zzpfVar, String str, @Nullable int i2, zzwk zzwkVar) {
        long j2;
        Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
        this.zzb = str;
        this.zzc = i2;
        if (zzwkVar == null) {
            j2 = -1;
        } else {
            j2 = zzwkVar.zzd;
        }
        this.zzd = j2;
        if (zzwkVar != null && zzwkVar.zzb()) {
            this.zze = zzwkVar;
        }
    }
}
