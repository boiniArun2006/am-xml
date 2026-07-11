package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaia implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzaia(int i2, String str, String str2, int i3, int i5, int i7, int i8, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i3;
        this.zze = i5;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaia.class == obj.getClass()) {
            zzaia zzaiaVar = (zzaia) obj;
            if (this.zza == zzaiaVar.zza && this.zzb.equals(zzaiaVar.zzb) && this.zzc.equals(zzaiaVar.zzc) && this.zzd == zzaiaVar.zzd && this.zze == zzaiaVar.zze && this.zzf == zzaiaVar.zzf && this.zzg == zzaiaVar.zzg && Arrays.equals(this.zzh, zzaiaVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 32 + str2.length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzh, this.zza);
    }

    public static zzaia zzb(zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        String strZzh = zzas.zzh(zzerVar.zzK(zzerVar.zzB(), StandardCharsets.US_ASCII));
        String strZzK = zzerVar.zzK(zzerVar.zzB(), StandardCharsets.UTF_8);
        int iZzB2 = zzerVar.zzB();
        int iZzB3 = zzerVar.zzB();
        int iZzB4 = zzerVar.zzB();
        int iZzB5 = zzerVar.zzB();
        int iZzB6 = zzerVar.zzB();
        byte[] bArr = new byte[iZzB6];
        zzerVar.zzm(bArr, 0, iZzB6);
        return new zzaia(iZzB, strZzh, strZzK, iZzB2, iZzB3, iZzB4, iZzB5, bArr);
    }
}
