package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzalv extends zzalt {

    @Nullable
    private zzalu zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzagm zzd;

    @Nullable
    private zzagk zze;

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final boolean zzc(zzer zzerVar, long j2, zzalr zzalrVar) throws IOException {
        zzalu zzaluVar;
        int i2;
        int iZzb;
        int i3;
        int[] iArr;
        int i5;
        long jFloor;
        if (this.zza != null) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzagm zzagmVar = this.zzd;
        int i7 = 1;
        if (zzagmVar == null) {
            zzagn.zzd(1, zzerVar, false);
            int iZzI = zzerVar.zzI();
            int iZzs = zzerVar.zzs();
            int iZzI2 = zzerVar.zzI();
            int iZzC = zzerVar.zzC();
            int i8 = iZzC <= 0 ? -1 : iZzC;
            int iZzC2 = zzerVar.zzC();
            int i9 = iZzC2 <= 0 ? -1 : iZzC2;
            int iZzC3 = zzerVar.zzC();
            int i10 = iZzC3 <= 0 ? -1 : iZzC3;
            int iZzs2 = zzerVar.zzs();
            this.zzd = new zzagm(iZzI, iZzs, iZzI2, i8, i9, i10, (int) Math.pow(2.0d, iZzs2 & 15), (int) Math.pow(2.0d, (iZzs2 & 240) >> 4), 1 == (zzerVar.zzs() & 1), Arrays.copyOf(zzerVar.zzi(), zzerVar.zze()));
        } else {
            int i11 = 4;
            zzagk zzagkVar = this.zze;
            if (zzagkVar == null) {
                this.zze = zzagn.zzb(zzerVar, true, true);
            } else {
                byte[] bArr = new byte[zzerVar.zze()];
                System.arraycopy(zzerVar.zzi(), 0, bArr, 0, zzerVar.zze());
                int i12 = zzagmVar.zza;
                int i13 = 5;
                zzagn.zzd(5, zzerVar, false);
                int iZzs3 = zzerVar.zzs() + 1;
                zzagj zzagjVar = new zzagj(zzerVar.zzi());
                zzagjVar.zzc(zzerVar.zzg() * 8);
                int i14 = 0;
                while (true) {
                    int i15 = 2;
                    int i16 = 16;
                    if (i14 >= iZzs3) {
                        int i17 = i7;
                        int i18 = 6;
                        int iZzb2 = zzagjVar.zzb(6) + i17;
                        for (int i19 = 0; i19 < iZzb2; i19++) {
                            if (zzagjVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzagjVar.zzb(6) + i17;
                        int i20 = 0;
                        while (true) {
                            int i21 = 3;
                            if (i20 < iZzb3) {
                                int iZzb4 = zzagjVar.zzb(i16);
                                if (iZzb4 == 0) {
                                    int i22 = 8;
                                    zzagjVar.zzc(8);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(6);
                                    zzagjVar.zzc(8);
                                    int iZzb5 = zzagjVar.zzb(4) + 1;
                                    int i23 = 0;
                                    while (i23 < iZzb5) {
                                        zzagjVar.zzc(i22);
                                        i23++;
                                        i22 = 8;
                                    }
                                } else {
                                    if (iZzb4 != i17) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzb4).length() + 41);
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(iZzb4);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    int iZzb6 = zzagjVar.zzb(5);
                                    int[] iArr2 = new int[iZzb6];
                                    int i24 = -1;
                                    for (int i25 = 0; i25 < iZzb6; i25++) {
                                        int iZzb7 = zzagjVar.zzb(4);
                                        iArr2[i25] = iZzb7;
                                        if (iZzb7 > i24) {
                                            i24 = iZzb7;
                                        }
                                    }
                                    int i26 = i24 + 1;
                                    int[] iArr3 = new int[i26];
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        int i28 = 1;
                                        iArr3[i27] = zzagjVar.zzb(i21) + 1;
                                        int iZzb8 = zzagjVar.zzb(2);
                                        if (iZzb8 > 0) {
                                            i3 = 8;
                                            zzagjVar.zzc(8);
                                        } else {
                                            i3 = 8;
                                        }
                                        int i29 = i26;
                                        int i30 = 0;
                                        while (true) {
                                            int i31 = i28 << iZzb8;
                                            iArr = iArr2;
                                            if (i30 < i31) {
                                                zzagjVar.zzc(i3);
                                                i30++;
                                                iArr2 = iArr;
                                                i3 = 8;
                                                i28 = 1;
                                            }
                                        }
                                        i27++;
                                        iArr2 = iArr;
                                        i26 = i29;
                                        i21 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    zzagjVar.zzc(2);
                                    int iZzb9 = zzagjVar.zzb(4);
                                    int i32 = 0;
                                    int i33 = 0;
                                    for (int i34 = 0; i34 < iZzb6; i34++) {
                                        i32 += iArr3[iArr4[i34]];
                                        while (i33 < i32) {
                                            zzagjVar.zzc(iZzb9);
                                            i33++;
                                        }
                                    }
                                }
                                i20++;
                                i18 = 6;
                                i16 = 16;
                                i17 = 1;
                            } else {
                                int i35 = 1;
                                int iZzb10 = zzagjVar.zzb(i18) + 1;
                                int i36 = 0;
                                while (i36 < iZzb10) {
                                    if (zzagjVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    int iZzb11 = zzagjVar.zzb(i18) + i35;
                                    int i37 = 8;
                                    zzagjVar.zzc(8);
                                    int[] iArr5 = new int[iZzb11];
                                    for (int i38 = 0; i38 < iZzb11; i38++) {
                                        iArr5[i38] = ((zzagjVar.zza() ? zzagjVar.zzb(5) : 0) * 8) + zzagjVar.zzb(3);
                                    }
                                    int i39 = 0;
                                    while (i39 < iZzb11) {
                                        int i40 = 0;
                                        while (i40 < i37) {
                                            if ((iArr5[i39] & (1 << i40)) != 0) {
                                                zzagjVar.zzc(i37);
                                            }
                                            i40++;
                                            i37 = 8;
                                        }
                                        i39++;
                                        i37 = 8;
                                    }
                                    i36++;
                                    i18 = 6;
                                    i35 = 1;
                                }
                                int iZzb12 = zzagjVar.zzb(i18) + 1;
                                for (int i41 = 0; i41 < iZzb12; i41++) {
                                    int iZzb13 = zzagjVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb13).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(iZzb13);
                                        zzee.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzagjVar.zza()) {
                                            i2 = 1;
                                            iZzb = zzagjVar.zzb(4) + 1;
                                        } else {
                                            i2 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzagjVar.zza()) {
                                            int iZzb14 = zzagjVar.zzb(8) + i2;
                                            for (int i42 = 0; i42 < iZzb14; i42++) {
                                                int i43 = i12 - 1;
                                                zzagjVar.zzc(zzagn.zza(i43));
                                                zzagjVar.zzc(zzagn.zza(i43));
                                            }
                                        }
                                        if (zzagjVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i44 = 0; i44 < i12; i44++) {
                                                zzagjVar.zzc(4);
                                            }
                                        }
                                        for (int i45 = 0; i45 < iZzb; i45++) {
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzagjVar.zzb(6);
                                int i46 = iZzb15 + 1;
                                zzagl[] zzaglVarArr = new zzagl[i46];
                                for (int i47 = 0; i47 < i46; i47++) {
                                    zzaglVarArr[i47] = new zzagl(zzagjVar.zza(), zzagjVar.zzb(16), zzagjVar.zzb(16), zzagjVar.zzb(8));
                                }
                                if (!zzagjVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzaluVar = new zzalu(zzagmVar, zzagkVar, bArr, zzaglVarArr, zzagn.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzagjVar.zzb(24) != 5653314) {
                            int iZzd = zzagjVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(iZzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int iZzb16 = zzagjVar.zzb(16);
                        int iZzb17 = zzagjVar.zzb(24);
                        if (zzagjVar.zza()) {
                            zzagjVar.zzc(i13);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzagjVar.zzb(zzagn.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzagjVar.zza();
                            for (int i48 = 0; i48 < iZzb17; i48++) {
                                if (!zZza) {
                                    zzagjVar.zzc(i13);
                                } else if (zzagjVar.zza()) {
                                    zzagjVar.zzc(i13);
                                }
                            }
                        }
                        int i49 = i11;
                        int iZzb19 = zzagjVar.zzb(i49);
                        if (iZzb19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iZzb19);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (iZzb19 != i7) {
                            if (iZzb19 != 2) {
                                i5 = i7;
                            }
                            i14++;
                            i7 = i5;
                            i11 = 4;
                            i13 = 5;
                        } else {
                            i15 = iZzb19;
                        }
                        zzagjVar.zzc(32);
                        zzagjVar.zzc(32);
                        int iZzb20 = zzagjVar.zzb(i49) + i7;
                        zzagjVar.zzc(i7);
                        if (i15 != i7) {
                            i5 = i7;
                            jFloor = ((long) iZzb16) * ((long) iZzb17);
                        } else if (iZzb16 != 0) {
                            i5 = i7;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16)));
                        } else {
                            i5 = i7;
                            jFloor = 0;
                        }
                        zzagjVar.zzc((int) (jFloor * ((long) iZzb20)));
                        i14++;
                        i7 = i5;
                        i11 = 4;
                        i13 = 5;
                    }
                }
            }
        }
        zzaluVar = null;
        this.zza = zzaluVar;
        if (zzaluVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzagm zzagmVar2 = zzaluVar.zza;
        arrayList.add(zzagmVar2.zzg);
        arrayList.add(zzaluVar.zzc);
        zzap zzapVarZzc = zzagn.zzc(zzguf.zzr(zzaluVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzl("audio/ogg");
        zztVar.zzm("audio/vorbis");
        zztVar.zzh(zzagmVar2.zzd);
        zztVar.zzi(zzagmVar2.zzc);
        zztVar.zzE(zzagmVar2.zza);
        zztVar.zzF(zzagmVar2.zzb);
        zztVar.zzp(arrayList);
        zztVar.zzk(zzapVarZzc);
        zzalrVar.zza = zztVar.zzM();
        return true;
    }

    zzalv() {
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zza(boolean z2) {
        super.zza(z2);
        if (z2) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final long zzb(zzer zzerVar) {
        int i2;
        int i3 = 0;
        if ((zzerVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b2 = zzerVar.zzi()[0];
        zzalu zzaluVar = this.zza;
        zzaluVar.getClass();
        if (!zzaluVar.zzd[(b2 >> 1) & (255 >>> (8 - zzaluVar.zze))].zza) {
            i2 = zzaluVar.zza.zze;
        } else {
            i2 = zzaluVar.zza.zzf;
        }
        if (this.zzc) {
            i3 = (this.zzb + i2) / 4;
        }
        if (zzerVar.zzj() < zzerVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze() + 4);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzerVar.zzf(zzerVar.zze() + 4);
        }
        long j2 = i3;
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[zzerVar.zze() - 4] = (byte) (j2 & 255);
        bArrZzi[zzerVar.zze() - 3] = (byte) ((j2 >>> 8) & 255);
        bArrZzi[zzerVar.zze() - 2] = (byte) ((j2 >>> 16) & 255);
        bArrZzi[zzerVar.zze() - 1] = (byte) ((j2 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i2;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zzj(long j2) {
        boolean z2;
        super.zzj(j2);
        int i2 = 0;
        if (j2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzc = z2;
        zzagm zzagmVar = this.zzd;
        if (zzagmVar != null) {
            i2 = zzagmVar.zze;
        }
        this.zzb = i2;
    }
}
