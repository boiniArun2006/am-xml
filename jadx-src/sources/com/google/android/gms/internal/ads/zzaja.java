package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaja {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzajj zzc = new zzajj();
    private zzajb zzd;
    private int zze;
    private int zzf;
    private long zzg;

    public final void zza(zzajb zzajbVar) {
        this.zzd = zzajbVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    private final long zzd(zzaev zzaevVar, int i2) throws IOException {
        byte[] bArr = this.zza;
        zzaevVar.zzc(bArr, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | ((long) (bArr[i3] & UByte.MAX_VALUE));
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[LOOP:0: B:3:0x0005->B:37:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzaev zzaevVar) throws IOException {
        int i2;
        String str;
        int iZzd;
        int iZze;
        this.zzd.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.zzb;
            zzaiz zzaizVar = (zzaiz) arrayDeque.peek();
            if (zzaizVar != null && zzaevVar.zzn() >= zzaizVar.zzb()) {
                ((zzajc) this.zzd).zza.zzi(((zzaiz) arrayDeque.pop()).zza());
                return true;
            }
            int i3 = this.zze;
            if (i3 != 0) {
                if (i3 == 1) {
                }
                zzajb zzajbVar = this.zzd;
                i2 = this.zzf;
                zzajh zzajhVar = ((zzajc) zzajbVar).zza;
                switch (i2) {
                    case MRAID_JS_WRITE_FAILED_VALUE:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case AD_RESPONSE_EMPTY_VALUE:
                    case 231:
                    case 238:
                    case 240:
                    case 241:
                    case 247:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        long j2 = this.zzg;
                        if (j2 <= 8) {
                            zzajhVar.zzj(i2, zzd(zzaevVar, (int) j2));
                            this.zze = 0;
                            return true;
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 22);
                        sb.append("Invalid integer size: ");
                        sb.append(j2);
                        throw zzat.zzb(sb.toString(), null);
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        long j3 = this.zzg;
                        if (j3 > 2147483647L) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 21);
                            sb2.append("String element size: ");
                            sb2.append(j3);
                            throw zzat.zzb(sb2.toString(), null);
                        }
                        int i5 = (int) j3;
                        if (i5 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i5];
                            zzaevVar.zzc(bArr, 0, i5);
                            while (i5 > 0) {
                                int i7 = i5 - 1;
                                if (bArr[i7] == 0) {
                                    i5 = i7;
                                } else {
                                    str = new String(bArr, 0, i5);
                                }
                            }
                            str = new String(bArr, 0, i5);
                        }
                        zzajhVar.zzl(i2, str);
                        this.zze = 0;
                        return true;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzn = zzaevVar.zzn();
                        arrayDeque.push(new zzaiz(i2, this.zzg + jZzn, null));
                        ((zzajc) this.zzd).zza.zzh(this.zzf, jZzn, this.zzg);
                        this.zze = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        zzajhVar.zzm(i2, (int) this.zzg, zzaevVar);
                        this.zze = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        long j4 = this.zzg;
                        if (j4 != 4 && j4 != 8) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j4).length() + 20);
                            sb3.append("Invalid float size: ");
                            sb3.append(j4);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int i8 = (int) j4;
                        zzajhVar.zzk(i2, i8 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzaevVar, i8)));
                        this.zze = 0;
                        return true;
                    default:
                        zzaevVar.zzf((int) this.zzg);
                        this.zze = 0;
                        break;
                }
            } else {
                long jZzb = this.zzc.zzb(zzaevVar, true, false, 4);
                if (jZzb == -2) {
                    zzaevVar.zzl();
                    while (true) {
                        byte[] bArr2 = this.zza;
                        zzaevVar.zzi(bArr2, 0, 4);
                        iZzd = zzajj.zzd(bArr2[0]);
                        if (iZzd != -1 && iZzd <= 4) {
                            iZze = (int) zzajj.zze(bArr2, iZzd, false);
                            zzajh zzajhVar2 = ((zzajc) this.zzd).zza;
                            if (iZze != 357149030 && iZze != 524531317 && iZze != 475249515) {
                                if (iZze == 374648427) {
                                    iZze = 374648427;
                                }
                            }
                        }
                        zzaevVar.zzf(1);
                    }
                    zzaevVar.zzf(iZzd);
                    jZzb = iZze;
                }
                if (jZzb == -1) {
                    return false;
                }
                this.zzf = (int) jZzb;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzb(zzaevVar, false, true, 8);
            this.zze = 2;
            zzajb zzajbVar2 = this.zzd;
            i2 = this.zzf;
            zzajh zzajhVar3 = ((zzajc) zzajbVar2).zza;
            switch (i2) {
                case MRAID_JS_WRITE_FAILED_VALUE:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case 240:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    break;
            }
        }
    }
}
