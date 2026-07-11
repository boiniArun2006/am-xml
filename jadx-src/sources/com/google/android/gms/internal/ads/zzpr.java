package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzpr {
    public static final zzpr zza;
    public final int zzb;
    public final int zzc;

    @Nullable
    private final zzgup zzd;

    public zzpr(int i2, int i3) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpr)) {
            return false;
        }
        zzpr zzprVar = (zzpr) obj;
        return this.zzb == zzprVar.zzb && this.zzc == zzprVar.zzc && Objects.equals(this.zzd, zzprVar.zzd);
    }

    static {
        zzpr zzprVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzguo zzguoVar = new zzguo();
            for (int i2 = 1; i2 <= 10; i2++) {
                zzguoVar.zzf(Integer.valueOf(zzfj.zzB(i2)));
            }
            zzprVar = new zzpr(2, zzguoVar.zzi());
        } else {
            zzprVar = new zzpr(2, 10);
        }
        zza = zzprVar;
    }

    @RequiresApi
    public zzpr(int i2, Set set) {
        this.zzb = i2;
        zzgup zzgupVarZzo = zzgup.zzo(set);
        this.zzd = zzgupVarZzo;
        zzgwt it = zzgupVarZzo.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }

    public final int hashCode() {
        zzgup zzgupVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgupVar == null ? 0 : zzgupVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i2 = this.zzb;
        int length = String.valueOf(i2).length();
        int i3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i3).length() + 15 + strValueOf.length() + 1);
        sb.append("AudioProfile[format=");
        sb.append(i2);
        sb.append(", maxChannelCount=");
        sb.append(i3);
        sb.append(", channelMasks=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zza(int i2) {
        zzgup zzgupVar = this.zzd;
        if (zzgupVar == null) {
            return i2 <= this.zzc;
        }
        int iZzB = zzfj.zzB(i2);
        if (iZzB == 0) {
            return false;
        }
        return zzgupVar.contains(Integer.valueOf(iZzB));
    }

    public final int zzb(int i2, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzps.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i3 = this.zzb;
        for (int i5 = 10; i5 > 0; i5--) {
            int iZzB = zzfj.zzB(i5);
            if (iZzB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i3).setSampleRate(i2).setChannelMask(iZzB).build(), zzdVar.zza())) {
                return i5;
            }
        }
        return 0;
    }
}
