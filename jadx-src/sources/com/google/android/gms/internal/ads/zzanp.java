package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzanp {

    @ColorInt
    private int zzf;
    private int zzh;
    private float zzn;
    private String zza = "";
    private String zzb = "";
    private Set zzc = Collections.EMPTY_SET;
    private String zzd = "";

    @Nullable
    private String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    public final void zza(String str) {
        this.zza = str;
    }

    public final void zzb(String str) {
        this.zzb = str;
    }

    public final void zzd(String str) {
        this.zzd = str;
    }

    public final int zzf() {
        int i2 = this.zzk;
        if (i2 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final boolean zzg() {
        return this.zzj == 1;
    }

    public final zzanp zzh(boolean z2) {
        this.zzj = 1;
        return this;
    }

    public final zzanp zzi(boolean z2) {
        this.zzk = 1;
        return this;
    }

    public final zzanp zzj(boolean z2) {
        this.zzl = 1;
        return this;
    }

    @Nullable
    public final String zzk() {
        return this.zze;
    }

    public final zzanp zzn(int i2) {
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    public final boolean zzo() {
        return this.zzg;
    }

    public final zzanp zzq(int i2) {
        this.zzh = i2;
        this.zzi = true;
        return this;
    }

    public final boolean zzr() {
        return this.zzi;
    }

    public final zzanp zzs(float f3) {
        this.zzn = f3;
        return this;
    }

    public final zzanp zzt(int i2) {
        this.zzm = i2;
        return this;
    }

    public final int zzu() {
        return this.zzm;
    }

    public final float zzv() {
        return this.zzn;
    }

    public final zzanp zzw(int i2) {
        this.zzo = i2;
        return this;
    }

    public final int zzx() {
        return this.zzo;
    }

    public final zzanp zzy(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final boolean zzz() {
        return this.zzp;
    }

    public final void zzc(String[] strArr) {
        this.zzc = new HashSet(Arrays.asList(strArr));
    }

    public final int zze(@Nullable String str, @Nullable String str2, Set set, @Nullable String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (iZzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return iZzA + (this.zzc.size() * 4);
    }

    public final int zzm() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int zzp() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    private static int zzA(int i2, String str, @Nullable String str2, int i3) {
        if (!str.isEmpty() && i2 != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i2 + i3;
        }
        return i2;
    }

    public final zzanp zzl(@Nullable String str) {
        this.zze = zzgql.zza(str);
        return this;
    }
}
