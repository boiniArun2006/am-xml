package com.google.android.gms.internal.ads;

import com.caoccao.javet.utils.Float16;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.RoundingMode;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzaqg implements zzaqh {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, Float16.EXPONENT_SIGNIFICAND_MASK};
    private final zzaex zzc;
    private final zzagh zzd;
    private final zzaql zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzer zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    private final int zzf(int i2) {
        return (i2 + i2) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza(long j2) {
        this.zzk = 0;
        this.zzl = j2;
        this.zzm = 0;
        this.zzn = 0L;
    }

    private final void zzd(int i2) {
        long jZzt = this.zzl + zzfj.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int iZzf = zzf(i2);
        this.zzd.zze(jZzt, 1, iZzf, this.zzm - iZzf, null);
        this.zzn += (long) i2;
        this.zzm -= iZzf;
    }

    private final int zze(int i2) {
        int i3 = this.zze.zzb;
        return i2 / (i3 + i3);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(int i2, long j2) {
        zzaqo zzaqoVar = new zzaqo(this.zze, this.zzf, i2, j2);
        this.zzc.zzw(zzaqoVar);
        zzagh zzaghVar = this.zzd;
        zzaghVar.zzz(this.zzj);
        zzaghVar.zzN(zzaqoVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:4:0x0022). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzaev zzaevVar, long j2) throws IOException {
        int iZze;
        int iZze2 = zze(this.zzm);
        int i2 = this.zzi;
        String str = zzfj.zza;
        int i3 = this.zzf;
        zzaql zzaqlVar = this.zze;
        int i5 = zzaqlVar.zzd;
        int i7 = ((((i2 - iZze2) + i3) - 1) / i3) * i5;
        boolean z2 = true;
        boolean z3 = j2 == 0;
        while (!z3) {
            if (this.zzk >= i7) {
                break;
            }
            int iZza = zzaevVar.zza(this.zzg, this.zzk, (int) Math.min(i7 - r12, j2));
            if (iZza == -1) {
                while (!z3) {
                }
            } else {
                this.zzk += iZza;
            }
        }
        int i8 = this.zzk / i5;
        if (i8 > 0) {
            byte[] bArr = this.zzg;
            zzer zzerVar = this.zzh;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = 0;
                while (true) {
                    int i11 = zzaqlVar.zzb;
                    if (i10 < i11) {
                        byte[] bArrZzi = zzerVar.zzi();
                        int i12 = (i5 / i11) - 4;
                        int i13 = (i9 * i5) + (i10 * 4);
                        boolean z4 = z2;
                        int i14 = bArr[i13 + 1] & UByte.MAX_VALUE;
                        int i15 = bArr[i13] & UByte.MAX_VALUE;
                        int i16 = i8;
                        byte[] bArr2 = bArr;
                        int iMin = Math.min(bArr[i13 + 2] & UByte.MAX_VALUE, 88);
                        int[] iArr = zzb;
                        int i17 = iArr[iMin];
                        int i18 = (i9 * i3 * i11) + i10;
                        int iMax = (short) (i15 | (i14 << 8));
                        int i19 = i18 + i18;
                        bArrZzi[i19] = (byte) (iMax & 255);
                        bArrZzi[i19 + 1] = (byte) (iMax >> 8);
                        for (int i20 = 0; i20 < i12 + i12; i20++) {
                            byte b2 = bArr2[(i11 * 4) + i13 + ((i20 / 8) * i11 * 4) + ((i20 / 2) % 4)];
                            int i21 = iMin;
                            int i22 = i20 % 2 == 0 ? b2 & 15 : (b2 & UByte.MAX_VALUE) >> 4;
                            int i23 = i22 & 7;
                            int i24 = (((i23 + i23) + 1) * i17) >> 3;
                            if ((i22 & 8) != 0) {
                                i24 = -i24;
                            }
                            iMax = Math.max(-32768, Math.min(iMax + i24, Float16.EXPONENT_SIGNIFICAND_MASK));
                            i19 += i11 + i11;
                            bArrZzi[i19] = (byte) (iMax & 255);
                            bArrZzi[i19 + 1] = (byte) (iMax >> 8);
                            iMin = Math.max(0, Math.min(i21 + zza[i22], 88));
                            i17 = iArr[iMin];
                        }
                        i10++;
                        i8 = i16;
                        z2 = z4;
                        bArr = bArr2;
                    }
                }
                i9++;
                z2 = z2;
            }
            int i25 = i8;
            int iZzf = zzf(i3 * i25);
            zzerVar.zzh(0);
            zzerVar.zzf(iZzf);
            this.zzk -= i25 * i5;
            int iZze3 = zzerVar.zze();
            this.zzd.zzc(zzerVar, iZze3);
            int i26 = this.zzm + iZze3;
            this.zzm = i26;
            if (zze(i26) >= i2) {
                zzd(i2);
            }
        }
        if (z3 && (iZze = zze(this.zzm)) > 0) {
            zzd(iZze);
        }
        return z3;
    }

    public zzaqg(zzaex zzaexVar, zzagh zzaghVar, zzaql zzaqlVar) throws zzat {
        this.zzc = zzaexVar;
        this.zzd = zzaghVar;
        this.zze = zzaqlVar;
        int iMax = Math.max(1, zzaqlVar.zzc / 10);
        this.zzi = iMax;
        zzer zzerVar = new zzer(zzaqlVar.zzf);
        zzerVar.zzu();
        int iZzu = zzerVar.zzu();
        this.zzf = iZzu;
        int i2 = zzaqlVar.zzb;
        int i3 = zzaqlVar.zzd;
        int i5 = (((i3 - (i2 * 4)) * 8) / (zzaqlVar.zze * i2)) + 1;
        if (iZzu == i5) {
            String str = zzfj.zza;
            int i7 = ((iMax + iZzu) - 1) / iZzu;
            this.zzg = new byte[i3 * i7];
            this.zzh = new zzer(i7 * (iZzu + iZzu) * i2);
            int i8 = ((zzaqlVar.zzc * zzaqlVar.zzd) * 8) / iZzu;
            zzt zztVar = new zzt();
            zztVar.zzm("audio/raw");
            zztVar.zzh(i8);
            zztVar.zzi(i8);
            zztVar.zzn((iMax + iMax) * i2);
            zztVar.zzE(zzaqlVar.zzb);
            zztVar.zzF(zzaqlVar.zzc);
            zztVar.zzG(2);
            this.zzj = zztVar.zzM();
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34 + String.valueOf(iZzu).length());
        sb.append("Expected frames per block: ");
        sb.append(i5);
        sb.append("; got: ");
        sb.append(iZzu);
        throw zzat.zzb(sb.toString(), null);
    }
}
