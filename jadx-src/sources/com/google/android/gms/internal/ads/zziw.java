package com.google.android.gms.internal.ads;

import WJ.phkN.HFAkacKHsU;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zziw extends zzau {
    public final int zzc;

    @Nullable
    public final String zzd;
    public final int zze;

    @Nullable
    public final zzv zzf;
    public final int zzg;

    @Nullable
    public final zzwk zzh;
    final boolean zzi;

    private zziw(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zziw(int i2, @Nullable Throwable th, @Nullable String str, int i3, @Nullable String str2, int i5, @Nullable zzv zzvVar, int i7, @Nullable zzwk zzwkVar, boolean z2) {
        String str3;
        int i8;
        String string;
        String str4;
        if (i2 == 0) {
            str3 = str2;
            i8 = i5;
            string = "Source error";
        } else if (i2 != 1) {
            string = "Unexpected runtime error";
            str3 = str2;
            i8 = i5;
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str5 = zzfj.zza;
            if (i7 == 0) {
                str4 = "NO";
            } else if (i7 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i7 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i7 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(i5).length() + 9 + strValueOf.length() + 19 + str4.length());
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i8 = i5;
            sb.append(i8);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(str4);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(HFAkacKHsU.KuHc), th, i3, i2, str3, i8, zzvVar, i7, zzwkVar, SystemClock.elapsedRealtime(), z2);
    }

    public static zziw zza(IOException iOException, int i2) {
        return new zziw(0, iOException, i2);
    }

    public static zziw zzb(Throwable th, String str, int i2, @Nullable zzv zzvVar, int i3, @Nullable zzwk zzwkVar, boolean z2, int i5) {
        if (zzvVar == null) {
            i3 = 4;
        }
        return new zziw(1, th, null, i5, str, i2, zzvVar, i3, zzwkVar, z2);
    }

    public static zziw zzc(RuntimeException runtimeException, int i2) {
        return new zziw(2, runtimeException, i2);
    }

    @CheckResult
    final zziw zzd(@Nullable zzwk zzwkVar) {
        String message = getMessage();
        String str = zzfj.zza;
        return new zziw(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzwkVar, this.zzb, this.zzi);
    }

    private zziw(String str, @Nullable Throwable th, int i2, int i3, @Nullable String str2, int i5, @Nullable zzv zzvVar, int i7, @Nullable zzwk zzwkVar, long j2, boolean z2) {
        boolean z3;
        super(str, th, i2, Bundle.EMPTY, j2);
        if (!z2) {
            z3 = true;
        } else if (i3 == 1) {
            i3 = 1;
            z3 = true;
        } else {
            z3 = false;
        }
        zzgrc.zza(z3);
        zzgrc.zza(th != null);
        this.zzc = i3;
        this.zzd = str2;
        this.zze = i5;
        this.zzf = zzvVar;
        this.zzg = i7;
        this.zzh = zzwkVar;
        this.zzi = z2;
    }
}
