package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.nio.ByteOrder;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzafh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;

    @Nullable
    public final zzafg zzk;

    @Nullable
    private final zzap zzl;

    @VisibleForTesting
    zzafh(int i2, int i3, int i5, int i7, int i8, int i9, int i10, long j2, @Nullable zzafg zzafgVar, @Nullable zzap zzapVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i5;
        this.zzd = i7;
        this.zze = i8;
        this.zzf = zzf(i8);
        this.zzg = i9;
        this.zzh = i10;
        this.zzi = zzg(i10);
        this.zzj = j2;
        this.zzk = zzafgVar;
        this.zzl = zzapVar;
    }

    private static int zzf(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzg(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 20) {
            return 5;
        }
        if (i2 != 24) {
            return i2 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final zzv zzc(byte[] bArr, @Nullable zzap zzapVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        zzap zzapVarZzd = zzd(zzapVar);
        zzt zztVar = new zzt();
        zztVar.zzm("audio/flac");
        int i2 = this.zzd;
        if (i2 <= 0) {
            i2 = -1;
        }
        zztVar.zzn(i2);
        zztVar.zzE(this.zzg);
        zztVar.zzF(this.zze);
        zztVar.zzG(zzfj.zzz(this.zzh, ByteOrder.LITTLE_ENDIAN));
        zztVar.zzp(Collections.singletonList(bArr));
        zztVar.zzk(zzapVarZzd);
        return zztVar.zzM();
    }

    public final zzafh zze(@Nullable zzafg zzafgVar) {
        return new zzafh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzafgVar, this.zzl);
    }

    public zzafh(byte[] bArr, int i2) {
        zzeq zzeqVar = new zzeq(bArr, bArr.length);
        zzeqVar.zzf(i2 * 8);
        this.zza = zzeqVar.zzj(16);
        this.zzb = zzeqVar.zzj(16);
        this.zzc = zzeqVar.zzj(24);
        this.zzd = zzeqVar.zzj(24);
        int iZzj = zzeqVar.zzj(20);
        this.zze = iZzj;
        this.zzf = zzf(iZzj);
        this.zzg = zzeqVar.zzj(3) + 1;
        int iZzj2 = zzeqVar.zzj(5) + 1;
        this.zzh = iZzj2;
        this.zzi = zzg(iZzj2);
        this.zzj = zzeqVar.zzk(36);
        this.zzk = null;
        this.zzl = null;
    }

    public final long zza() {
        long j2 = this.zzj;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j2) {
        String str = zzfj.zza;
        return Math.max(0L, Math.min((j2 * ((long) this.zze)) / 1000000, this.zzj - 1));
    }

    @Nullable
    public final zzap zzd(@Nullable zzap zzapVar) {
        zzap zzapVar2 = this.zzl;
        return zzapVar2 == null ? zzapVar : zzapVar2.zzf(zzapVar);
    }
}
