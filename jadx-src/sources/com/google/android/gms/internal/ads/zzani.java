package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzani {

    @Nullable
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;

    @Nullable
    private String zzl;

    @Nullable
    private Layout.Alignment zzo;

    @Nullable
    private Layout.Alignment zzp;

    @Nullable
    private zzanb zzr;

    @Nullable
    private String zzt;

    @Nullable
    private String zzu;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    @Nullable
    public final Layout.Alignment zzA() {
        return this.zzp;
    }

    public final zzani zzB(@Nullable Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final boolean zzC() {
        return this.zzq == 1;
    }

    public final zzani zzD(boolean z2) {
        this.zzq = z2 ? 1 : 0;
        return this;
    }

    @Nullable
    public final zzanb zzE() {
        return this.zzr;
    }

    public final zzani zzF(@Nullable zzanb zzanbVar) {
        this.zzr = zzanbVar;
        return this;
    }

    public final zzani zzG(float f3) {
        this.zzk = f3;
        return this;
    }

    public final zzani zzH(int i2) {
        this.zzj = i2;
        return this;
    }

    public final int zzI() {
        return this.zzj;
    }

    public final float zzJ() {
        return this.zzk;
    }

    public final zzani zzK(@Nullable String str) {
        this.zzt = str;
        return this;
    }

    @Nullable
    public final String zzL() {
        return this.zzt;
    }

    public final zzani zzM(@Nullable String str) {
        this.zzu = str;
        return this;
    }

    @Nullable
    public final String zzN() {
        return this.zzu;
    }

    public final int zza() {
        int i2 = this.zzh;
        if (i2 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final boolean zzb() {
        return this.zzf == 1;
    }

    public final zzani zzc(boolean z2) {
        this.zzf = z2 ? 1 : 0;
        return this;
    }

    public final boolean zzd() {
        return this.zzg == 1;
    }

    public final zzani zze(boolean z2) {
        this.zzg = z2 ? 1 : 0;
        return this;
    }

    public final zzani zzf(boolean z2) {
        this.zzh = z2 ? 1 : 0;
        return this;
    }

    public final zzani zzg(boolean z2) {
        this.zzi = z2 ? 1 : 0;
        return this;
    }

    @Nullable
    public final String zzh() {
        return this.zza;
    }

    public final zzani zzi(@Nullable String str) {
        this.zza = str;
        return this;
    }

    public final zzani zzk(int i2) {
        this.zzb = i2;
        this.zzc = true;
        return this;
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final zzani zzn(int i2) {
        this.zzd = i2;
        this.zze = true;
        return this;
    }

    public final boolean zzo() {
        return this.zze;
    }

    public final zzani zzp(float f3) {
        this.zzs = f3;
        return this;
    }

    public final float zzq() {
        return this.zzs;
    }

    public final zzani zzs(@Nullable String str) {
        this.zzl = str;
        return this;
    }

    @Nullable
    public final String zzt() {
        return this.zzl;
    }

    public final zzani zzu(int i2) {
        this.zzm = i2;
        return this;
    }

    public final int zzv() {
        return this.zzm;
    }

    public final zzani zzw(int i2) {
        this.zzn = i2;
        return this;
    }

    public final int zzx() {
        return this.zzn;
    }

    @Nullable
    public final Layout.Alignment zzy() {
        return this.zzo;
    }

    public final zzani zzz(@Nullable Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }

    public final int zzj() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int zzm() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final zzani zzr(@Nullable zzani zzaniVar) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzaniVar != null) {
            if (!this.zzc && zzaniVar.zzc) {
                zzk(zzaniVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzaniVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzaniVar.zzi;
            }
            if (this.zza == null && (str = zzaniVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzaniVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzaniVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzaniVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzaniVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzaniVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzaniVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzaniVar.zzj;
                this.zzk = zzaniVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzaniVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzaniVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzaniVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzaniVar.zzu;
            }
            if (!this.zze && zzaniVar.zze) {
                zzn(zzaniVar.zzd);
            }
            if (this.zzm == -1 && (i2 = zzaniVar.zzm) != -1) {
                this.zzm = i2;
            }
        }
        return this;
    }
}
