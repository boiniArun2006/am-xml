package com.google.android.gms.internal.ads;

import android.os.IBinder;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgop extends zzgpq {
    private final IBinder zza;

    @Nullable
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;

    @Nullable
    private final String zzf;

    /* synthetic */ zzgop(IBinder iBinder, String str, int i2, float f3, int i3, int i5, String str2, int i7, String str3, String str4, String str5, byte[] bArr) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i2;
        this.zzd = f3;
        this.zze = i7;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgpq) {
            zzgpq zzgpqVar = (zzgpq) obj;
            if (this.zza.equals(zzgpqVar.zza()) && ((str = this.zzb) != null ? str.equals(zzgpqVar.zzb()) : zzgpqVar.zzb() == null) && this.zzc == zzgpqVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzgpqVar.zzd())) {
                zzgpqVar.zze();
                zzgpqVar.zzf();
                zzgpqVar.zzg();
                if (this.zze == zzgpqVar.zzh()) {
                    zzgpqVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzgpqVar.zzj()) : zzgpqVar.zzj() == null) {
                        zzgpqVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    public final IBinder zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    public final int zzf() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    @Nullable
    public final String zzg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    public final int zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    @Nullable
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    @Nullable
    public final String zzj() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    @Nullable
    public final String zzk() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i2 = this.zze;
        String str2 = this.zzf;
        return ((((iHashCode2 * 1525764945) ^ i2) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i2 = this.zzc;
        int length3 = String.valueOf(i2).length();
        float f3 = this.zzd;
        int length4 = String.valueOf(f3).length();
        int i3 = this.zze;
        int length5 = String.valueOf(i3).length();
        String str2 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        sb.append("OverlayDisplayShowRequest{windowToken=");
        sb.append(string);
        sb.append(", appId=");
        sb.append(str);
        sb.append(", layoutGravity=");
        sb.append(i2);
        sb.append(", layoutVerticalMargin=");
        sb.append(f3);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(i3);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
