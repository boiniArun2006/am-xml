package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.b;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaoj implements zzaon {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;

    @Nullable
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzagh zzi;
    private zzagh zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzagh zzw;
    private long zzx;
    private final zzeq zzc = new zzeq(new byte[7], 7);
    private final zzer zzd = new zzer(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public static boolean zzf(int i2) {
        return (i2 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzagh zzaghVar, long j2, int i2, int i3) {
        this.zzk = 4;
        this.zzl = i2;
        this.zzw = zzaghVar;
        this.zzx = j2;
        this.zzu = i3;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b2, byte b4) {
        return zzf((b4 & UByte.MAX_VALUE) | 65280);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i2) {
        this.zzv = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0261, code lost:
    
        r20.zzn = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0265, code lost:
    
        if (r20.zzo != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0267, code lost:
    
        r20.zzk = 1;
        r20.zzl = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x026d, code lost:
    
        zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0270, code lost:
    
        r21.zzh(r13);
        r9 = r19;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ec, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0253, code lost:
    
        r20.zzr = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025c, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ce  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) throws zzat {
        int i2;
        char c2;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 2;
        this.zzi.getClass();
        String str = zzfj.zza;
        while (zzerVar.zzd() > 0) {
            int i13 = this.zzk;
            char c4 = 7;
            int i14 = 3;
            if (i13 == 0) {
                byte[] bArrZzi = zzerVar.zzi();
                int iZzg = zzerVar.zzg();
                int iZze = zzerVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzerVar.zzh(iZzg);
                        break;
                    }
                    int i15 = iZzg + 1;
                    byte b2 = bArrZzi[iZzg];
                    int i16 = b2 & UByte.MAX_VALUE;
                    int i17 = i14;
                    if (this.zzm != 512 || !zzl((byte) -1, (byte) i16)) {
                        i2 = i12;
                        c2 = c4;
                    } else {
                        if (this.zzo) {
                            break;
                        }
                        int i18 = iZzg - 1;
                        zzerVar.zzh(iZzg);
                        zzeq zzeqVar = this.zzc;
                        if (zzm(zzerVar, zzeqVar.zza, 1)) {
                            zzeqVar.zzf(4);
                            int iZzj = zzeqVar.zzj(1);
                            int i19 = this.zzp;
                            if (i19 == -1 || iZzj == i19) {
                                if (this.zzq == -1) {
                                    i2 = i12;
                                } else {
                                    if (!zzm(zzerVar, zzeqVar.zza, 1)) {
                                        break;
                                    }
                                    zzeqVar.zzf(i12);
                                    i2 = i12;
                                    if (zzeqVar.zzj(4) == this.zzq) {
                                        zzerVar.zzh(iZzg + 1);
                                    }
                                }
                                if (!zzm(zzerVar, zzeqVar.zza, 4)) {
                                    break;
                                }
                                zzeqVar.zzf(14);
                                int iZzj2 = zzeqVar.zzj(13);
                                c2 = 7;
                                if (iZzj2 >= 7) {
                                    byte[] bArrZzi2 = zzerVar.zzi();
                                    int iZze2 = zzerVar.zze();
                                    int i20 = i18 + iZzj2;
                                    if (i20 < iZze2) {
                                        byte b4 = bArrZzi2[i20];
                                        if (b4 != -1) {
                                            if (b4 == 73 && ((i9 = i20 + 1) == iZze2 || (bArrZzi2[i9] == 68 && ((i10 = i20 + 2) == iZze2 || bArrZzi2[i10] == 51)))) {
                                                break;
                                            }
                                        } else {
                                            int i21 = i20 + 1;
                                            if (i21 == iZze2) {
                                                break;
                                            }
                                            byte b5 = bArrZzi2[i21];
                                            if (zzl((byte) -1, b5) && ((b5 & 8) >> 3) == iZzj) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            c2 = 7;
                        } else {
                            i2 = i12;
                            c2 = 7;
                        }
                    }
                    int i22 = this.zzm;
                    int i23 = i22 | i16;
                    if (i23 == 329) {
                        i3 = i17;
                        i5 = i2;
                        i7 = 0;
                        i8 = 768;
                    } else if (i23 == 511) {
                        i3 = i17;
                        i5 = i2;
                        i7 = 0;
                        i8 = 512;
                    } else if (i23 == 836) {
                        i3 = i17;
                        i5 = i2;
                        i7 = 0;
                        i8 = 1024;
                    } else {
                        if (i23 == 1075) {
                            int i24 = i2;
                            this.zzk = i24;
                            this.zzl = i17;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzerVar.zzh(i15);
                            i12 = i24;
                            i11 = 0;
                            break;
                        }
                        if (i22 != 256) {
                            this.zzm = 256;
                            c4 = c2;
                            i14 = i17;
                            i12 = i2;
                            i11 = 0;
                        } else {
                            i3 = i17;
                            i5 = i2;
                            i7 = 0;
                            i11 = i7;
                            iZzg = i15;
                            i14 = i3;
                            c4 = c2;
                            i12 = i5;
                        }
                    }
                    this.zzm = i8;
                    i11 = i7;
                    iZzg = i15;
                    i14 = i3;
                    c4 = c2;
                    i12 = i5;
                }
            } else if (i13 != 1) {
                if (i13 == i12) {
                    zzer zzerVar2 = this.zzd;
                    if (zzh(zzerVar, zzerVar2.zzi(), 10)) {
                        this.zzj.zzc(zzerVar2, 10);
                        zzerVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzerVar2.zzG() + 10);
                    }
                } else if (i13 != 3) {
                    int iMin = Math.min(zzerVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzc(zzerVar, iMin);
                    int i25 = this.zzl + iMin;
                    this.zzl = i25;
                    if (i25 == this.zzu) {
                        zzgrc.zzi(this.zzv != -9223372036854775807L ? 1 : i11);
                        this.zzw.zze(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i26 = true != this.zzn ? 5 : 7;
                    zzeq zzeqVar2 = this.zzc;
                    if (zzh(zzerVar, zzeqVar2.zza, i26)) {
                        zzeqVar2.zzf(i11);
                        if (this.zzs) {
                            zzeqVar2.zzh(10);
                        } else {
                            int iZzj3 = zzeqVar2.zzj(i12) + 1;
                            if (iZzj3 != i12) {
                                StringBuilder sb = new StringBuilder(String.valueOf(iZzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(iZzj3);
                                sb.append(", but assuming AAC LC.");
                                zzee.zzc("AdtsReader", sb.toString());
                            }
                            zzeqVar2.zzh(5);
                            int iZzj4 = zzeqVar2.zzj(3);
                            int i27 = this.zzq;
                            byte b6 = (byte) (((iZzj4 << 3) & b.f61769v) | ((i27 << 7) & 128));
                            byte[] bArr = new byte[i12];
                            bArr[i11] = (byte) (((i27 >> 1) & 7) | 16);
                            bArr[1] = b6;
                            zzads zzadsVarZza = zzadt.zza(bArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzl(this.zzg);
                            zztVar.zzm("audio/mp4a-latm");
                            zztVar.zzj(zzadsVarZza.zzc);
                            zztVar.zzE(zzadsVarZza.zzb);
                            zztVar.zzF(zzadsVarZza.zza);
                            zztVar.zzp(Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            zzv zzvVarZzM = zztVar.zzM();
                            this.zzt = 1024000000 / ((long) zzvVarZzM.zzH);
                            this.zzi.zzz(zzvVarZzM);
                            this.zzs = true;
                        }
                        zzeqVar2.zzh(4);
                        int iZzj5 = zzeqVar2.zzj(13);
                        int i28 = iZzj5 - 7;
                        if (this.zzn) {
                            i28 = iZzj5 - 9;
                        }
                        zzj(this.zzi, this.zzt, 0, i28);
                    }
                }
            } else if (zzerVar.zzd() != 0) {
                zzeq zzeqVar3 = this.zzc;
                zzeqVar3.zza[i11] = zzerVar.zzi()[zzerVar.zzg()];
                zzeqVar3.zzf(i12);
                int iZzj6 = zzeqVar3.zzj(4);
                int i29 = this.zzq;
                if (i29 == -1 || iZzj6 == i29) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = iZzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    public zzaoj(boolean z2, @Nullable String str, int i2, String str2) {
        this.zzb = z2;
        this.zze = str;
        this.zzf = i2;
        this.zzg = str2;
        zzi();
    }

    private final boolean zzh(zzer zzerVar, byte[] bArr, int i2) {
        int iMin = Math.min(zzerVar.zzd(), i2 - this.zzl);
        zzerVar.zzm(bArr, this.zzl, iMin);
        int i3 = this.zzl + iMin;
        this.zzl = i3;
        if (i3 == i2) {
            return true;
        }
        return false;
    }

    private static final boolean zzm(zzer zzerVar, byte[] bArr, int i2) {
        if (zzerVar.zzd() < i2) {
            return false;
        }
        zzerVar.zzm(bArr, 0, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 1);
        this.zzi = zzaghVarZzu;
        this.zzw = zzaghVarZzu;
        if (this.zzb) {
            zzaqbVar.zza();
            zzagh zzaghVarZzu2 = zzaexVar.zzu(zzaqbVar.zzb(), 5);
            this.zzj = zzaghVarZzu2;
            zzt zztVar = new zzt();
            zztVar.zza(zzaqbVar.zzc());
            zztVar.zzl(this.zzg);
            zztVar.zzm("application/id3");
            zzaghVarZzu2.zzz(zztVar.zzM());
            return;
        }
        this.zzj = new zzaer();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }
}
