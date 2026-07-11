package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzanv {
    public CharSequence zzc;
    public long zza = 0;
    public long zzb = 0;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzcw zza() {
        Layout.Alignment alignment;
        float f3 = this.zzh;
        float f4 = -3.4028235E38f;
        if (f3 == -3.4028235E38f) {
            int i2 = this.zzd;
            f3 = i2 != 4 ? i2 != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i3 = this.zzi;
        if (i3 == Integer.MIN_VALUE) {
            int i5 = this.zzd;
            if (i5 == 1) {
                i3 = 0;
            } else if (i5 == 3) {
                i3 = 2;
            } else if (i5 != 4) {
                if (i5 != 5) {
                    i3 = 1;
                }
            }
        }
        zzcw zzcwVar = new zzcw();
        int i7 = this.zzd;
        if (i7 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i7 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i7 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i7 != 4) {
            if (i7 != 5) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 23);
                sb.append("Unknown textAlignment: ");
                sb.append(i7);
                zzee.zzc("WebvttCueParser", sb.toString());
                alignment = null;
            }
        }
        zzcwVar.zzd(alignment);
        float f5 = this.zze;
        int i8 = this.zzf;
        if (f5 == -3.4028235E38f || i8 != 0 || (f5 >= 0.0f && f5 <= 1.0f)) {
            if (f5 != -3.4028235E38f) {
                f4 = f5;
            } else if (i8 == 0) {
                f4 = 1.0f;
            }
        }
        zzcwVar.zzf(f4, i8);
        zzcwVar.zzg(this.zzg);
        zzcwVar.zzi(f3);
        zzcwVar.zzj(i3);
        float f6 = this.zzj;
        if (i3 == 0) {
            f3 = 1.0f - f3;
        } else if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException(String.valueOf(i3));
            }
        } else if (f3 <= 0.5f) {
            f3 += f3;
        } else {
            float f7 = 1.0f - f3;
            f3 = f7 + f7;
        }
        zzcwVar.zzm(Math.min(f6, f3));
        zzcwVar.zzo(this.zzk);
        CharSequence charSequence = this.zzc;
        if (charSequence != null) {
            zzcwVar.zza(charSequence);
        }
        return zzcwVar;
    }
}
