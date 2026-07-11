package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaim {
    public static final zzaij zza = zzaik.zza;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a7 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TRY_LEAVE, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02cf A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0506  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzain zzc(int i2, zzer zzerVar, boolean z2, int i3, @Nullable zzaij zzaijVar) {
        int iZzH;
        int i5;
        int i7;
        boolean z3;
        boolean z4;
        int i8;
        String str;
        zzain zzainVar;
        int i9;
        zzain zzaieVar;
        zzain zzaiqVar;
        zzain zzaihVar;
        int iZzi;
        String strConcat;
        int iZzs = zzerVar.zzs();
        int iZzs2 = zzerVar.zzs();
        int iZzs3 = zzerVar.zzs();
        int iZzs4 = i2 >= 3 ? zzerVar.zzs() : 0;
        if (i2 == 4) {
            iZzH = zzerVar.zzH();
            if (!z2) {
                iZzH = ((iZzH >> 24) << 21) | (iZzH & 255) | (((iZzH >> 8) & 255) << 7) | (((iZzH >> 16) & 255) << 14);
            }
        } else {
            iZzH = i2 == 3 ? zzerVar.zzH() : zzerVar.zzx();
        }
        int iZzt = i2 >= 3 ? zzerVar.zzt() : 0;
        if (iZzs == 0 && iZzs2 == 0 && iZzs3 == 0 && iZzs4 == 0 && iZzH == 0 && iZzt == 0) {
            zzerVar.zzh(zzerVar.zze());
            return null;
        }
        int iZzg = zzerVar.zzg() + iZzH;
        if (iZzg > zzerVar.zze()) {
            zzee.zzc("Id3Decoder", "Frame size exceeds remaining tag data");
            zzerVar.zzh(zzerVar.zze());
            return null;
        }
        if (zzaijVar != null) {
            zzerVar.zzh(iZzg);
            return null;
        }
        if (i2 == 3) {
            int i10 = iZzt & 64;
            i5 = (iZzt & 128) != 0 ? 1 : 0;
            i8 = 0;
            z4 = i10 != 0;
            z3 = (iZzt & 32) != 0;
            i7 = i5;
        } else if (i2 == 4) {
            boolean z5 = (iZzt & 64) != 0;
            int i11 = (iZzt & 8) != 0 ? 1 : 0;
            z4 = (iZzt & 4) != 0;
            i8 = (iZzt & 2) != 0 ? 1 : 0;
            i7 = iZzt & 1;
            int i12 = i11;
            z3 = z5;
            i5 = i12;
        } else {
            i5 = 0;
            i7 = 0;
            z3 = false;
            z4 = false;
            i8 = 0;
        }
        if (i5 != 0 || z4) {
            zzee.zzc("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzerVar.zzh(iZzg);
            return null;
        }
        if (z3) {
            zzerVar.zzk(1);
            iZzH--;
        }
        if (i7 != 0) {
            zzerVar.zzk(4);
            iZzH -= 4;
        }
        if (i8 != 0) {
            iZzH = zze(zzerVar, iZzH);
        }
        try {
            try {
                if (iZzs == 84 && iZzs2 == 88 && iZzs3 == 88 && (i2 == 2 || iZzs4 == 88)) {
                    if (iZzH > 0) {
                        int iZzs5 = zzerVar.zzs();
                        int i13 = iZzH - 1;
                        byte[] bArr = new byte[i13];
                        zzerVar.zzm(bArr, 0, i13);
                        int iZzh = zzh(bArr, 0, iZzs5);
                        zzaihVar = new zzais("TXXX", new String(bArr, 0, iZzh, zzf(iZzs5)), zzd(bArr, iZzs5, iZzh + zzj(iZzs5)));
                        i8 = iZzs;
                        str = "Id3Decoder";
                        zzerVar.zzh(iZzg);
                        zzainVar = zzaihVar;
                        e = null;
                    }
                    i8 = iZzs;
                    str = "Id3Decoder";
                    zzaihVar = null;
                    zzerVar.zzh(iZzg);
                    zzainVar = zzaihVar;
                    e = null;
                } else if (iZzs == 84) {
                    String strZzg = zzg(i2, 84, iZzs2, iZzs3, iZzs4);
                    if (iZzH <= 0) {
                        i8 = iZzs;
                        str = "Id3Decoder";
                        zzaihVar = null;
                        zzerVar.zzh(iZzg);
                        zzainVar = zzaihVar;
                        e = null;
                    } else {
                        int iZzs6 = zzerVar.zzs();
                        int i14 = iZzH - 1;
                        byte[] bArr2 = new byte[i14];
                        zzerVar.zzm(bArr2, 0, i14);
                        i8 = iZzs;
                        zzaihVar = new zzais(strZzg, null, zzd(bArr2, iZzs6, 0));
                        str = "Id3Decoder";
                        zzerVar.zzh(iZzg);
                        zzainVar = zzaihVar;
                        e = null;
                    }
                } else {
                    if (iZzs == 87) {
                        if (iZzs2 != 88 || iZzs3 != 88 || (i2 != 2 && iZzs4 != 88)) {
                            i9 = 87;
                        }
                        if (iZzH <= 0) {
                            i8 = iZzs;
                            str = "Id3Decoder";
                            zzaihVar = null;
                            zzerVar.zzh(iZzg);
                            zzainVar = zzaihVar;
                            e = null;
                        } else {
                            int iZzs7 = zzerVar.zzs();
                            int i15 = iZzH - 1;
                            byte[] bArr3 = new byte[i15];
                            zzerVar.zzm(bArr3, 0, i15);
                            int iZzh2 = zzh(bArr3, 0, iZzs7);
                            String str2 = new String(bArr3, 0, iZzh2, zzf(iZzs7));
                            int iZzj = iZzh2 + zzj(iZzs7);
                            zzaihVar = new zzait("WXXX", str2, zzl(bArr3, iZzj, zzi(bArr3, iZzj), StandardCharsets.ISO_8859_1));
                            i8 = iZzs;
                            str = "Id3Decoder";
                            zzerVar.zzh(iZzg);
                            zzainVar = zzaihVar;
                            e = null;
                        }
                    } else {
                        i9 = iZzs;
                    }
                    if (i9 == 87) {
                        String strZzg2 = zzg(i2, 87, iZzs2, iZzs3, iZzs4);
                        byte[] bArr4 = new byte[iZzH];
                        zzerVar.zzm(bArr4, 0, iZzH);
                        zzaihVar = new zzait(strZzg2, null, new String(bArr4, 0, zzi(bArr4, 0), StandardCharsets.ISO_8859_1));
                    } else {
                        if (i9 == 80) {
                            if (iZzs2 == 82 && iZzs3 == 73 && iZzs4 == 86) {
                                byte[] bArr5 = new byte[iZzH];
                                zzerVar.zzm(bArr5, 0, iZzH);
                                int iZzi2 = zzi(bArr5, 0);
                                zzaihVar = new zzair(new String(bArr5, 0, iZzi2, StandardCharsets.ISO_8859_1), zzk(bArr5, iZzi2 + 1, iZzH));
                            } else {
                                i9 = 80;
                            }
                        }
                        try {
                            if (i9 != 71) {
                                str = "Id3Decoder";
                                try {
                                    if (i2 == 2) {
                                        if (i9 == 80 && iZzs2 == 73 && iZzs3 == 67) {
                                            int iZzs8 = zzerVar.zzs();
                                            Charset charsetZzf = zzf(iZzs8);
                                            int i16 = iZzH - 1;
                                            byte[] bArr6 = new byte[i16];
                                            zzerVar.zzm(bArr6, 0, i16);
                                            if (i2 != 2) {
                                                i8 = iZzs;
                                                strConcat = "image/".concat(String.valueOf(zzgql.zza(new String(bArr6, 0, 3, StandardCharsets.ISO_8859_1))));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = "image/jpeg";
                                                }
                                                iZzi = 2;
                                            } else {
                                                i8 = iZzs;
                                                iZzi = zzi(bArr6, 0);
                                                String strZza = zzgql.zza(new String(bArr6, 0, iZzi, StandardCharsets.ISO_8859_1));
                                                strConcat = strZza.indexOf(47) == -1 ? "image/".concat(strZza) : strZza;
                                            }
                                            int i17 = bArr6[iZzi + 1] & UByte.MAX_VALUE;
                                            int i18 = iZzi + 2;
                                            int iZzh3 = zzh(bArr6, i18, iZzs8);
                                            zzaieVar = new zzaid(strConcat, new String(bArr6, i18, iZzh3 - i18, charsetZzf), i17, zzk(bArr6, iZzh3 + zzj(iZzs8), i16));
                                            zzaihVar = zzaieVar;
                                            zzerVar.zzh(iZzg);
                                            zzainVar = zzaihVar;
                                            e = null;
                                        }
                                        i8 = iZzs;
                                        if (i9 == 67 || iZzs2 != 79 || iZzs3 != 77 || (iZzs4 != 77 && i2 != 2)) {
                                            if (i9 != 67 && iZzs2 == 72 && iZzs3 == 65 && iZzs4 == 80) {
                                                int iZzg2 = zzerVar.zzg();
                                                int iZzi3 = zzi(zzerVar.zzi(), iZzg2);
                                                String str3 = new String(zzerVar.zzi(), iZzg2, iZzi3 - iZzg2, StandardCharsets.ISO_8859_1);
                                                zzerVar.zzh(iZzi3 + 1);
                                                int iZzB = zzerVar.zzB();
                                                int iZzB2 = zzerVar.zzB();
                                                long jZzz = zzerVar.zzz();
                                                if (jZzz == 4294967295L) {
                                                    jZzz = -1;
                                                }
                                                long j2 = jZzz;
                                                long jZzz2 = zzerVar.zzz();
                                                if (jZzz2 == 4294967295L) {
                                                    jZzz2 = -1;
                                                }
                                                long j3 = jZzz2;
                                                ArrayList arrayList = new ArrayList();
                                                int i19 = iZzg2 + iZzH;
                                                while (zzerVar.zzg() < i19) {
                                                    zzain zzainVarZzc = zzc(i2, zzerVar, z2, i3, null);
                                                    if (zzainVarZzc != null) {
                                                        arrayList.add(zzainVarZzc);
                                                    }
                                                }
                                                zzaiqVar = new zzaif(str3, iZzB, iZzB2, j2, j3, (zzain[]) arrayList.toArray(new zzain[0]));
                                            } else if (i9 != 67 && iZzs2 == 84 && iZzs3 == 79 && iZzs4 == 67) {
                                                int iZzg3 = zzerVar.zzg();
                                                int iZzi4 = zzi(zzerVar.zzi(), iZzg3);
                                                String str4 = new String(zzerVar.zzi(), iZzg3, iZzi4 - iZzg3, StandardCharsets.ISO_8859_1);
                                                zzerVar.zzh(iZzi4 + 1);
                                                int iZzs9 = zzerVar.zzs();
                                                boolean z6 = (iZzs9 & 2) != 0;
                                                int i20 = iZzs9 & 1;
                                                int iZzs10 = zzerVar.zzs();
                                                String[] strArr = new String[iZzs10];
                                                int i21 = 0;
                                                while (i21 < iZzs10) {
                                                    int iZzg4 = zzerVar.zzg();
                                                    int i22 = iZzg3;
                                                    int iZzi5 = zzi(zzerVar.zzi(), iZzg4);
                                                    String[] strArr2 = strArr;
                                                    strArr2[i21] = new String(zzerVar.zzi(), iZzg4, iZzi5 - iZzg4, StandardCharsets.ISO_8859_1);
                                                    zzerVar.zzh(iZzi5 + 1);
                                                    i21++;
                                                    iZzg3 = i22;
                                                    iZzs10 = iZzs10;
                                                    str4 = str4;
                                                    strArr = strArr2;
                                                }
                                                int i23 = iZzg3;
                                                String str5 = str4;
                                                String[] strArr3 = strArr;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i24 = i23 + iZzH;
                                                while (zzerVar.zzg() < i24) {
                                                    zzain zzainVarZzc2 = zzc(i2, zzerVar, z2, i3, null);
                                                    if (zzainVarZzc2 != null) {
                                                        arrayList2.add(zzainVarZzc2);
                                                    }
                                                }
                                                zzaiqVar = new zzaig(str5, z6, 1 == i20, strArr3, (zzain[]) arrayList2.toArray(new zzain[0]));
                                            } else if (i9 != 77 && iZzs2 == 76 && iZzs3 == 76 && iZzs4 == 84) {
                                                int iZzt2 = zzerVar.zzt();
                                                int iZzx = zzerVar.zzx();
                                                int iZzx2 = zzerVar.zzx();
                                                int iZzs11 = zzerVar.zzs();
                                                int iZzs12 = zzerVar.zzs();
                                                zzeq zzeqVar = new zzeq();
                                                zzeqVar.zza(zzerVar);
                                                int i25 = ((iZzH - 10) * 8) / (iZzs11 + iZzs12);
                                                int[] iArr = new int[i25];
                                                int[] iArr2 = new int[i25];
                                                for (int i26 = 0; i26 < i25; i26++) {
                                                    int iZzj2 = zzeqVar.zzj(iZzs11);
                                                    int iZzj3 = zzeqVar.zzj(iZzs12);
                                                    iArr[i26] = iZzj2;
                                                    iArr2[i26] = iZzj3;
                                                }
                                                zzaiqVar = new zzaiq(iZzt2, iZzx, iZzx2, iArr, iArr2);
                                            } else {
                                                String strZzg3 = zzg(i2, i9, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr7 = new byte[iZzH];
                                                zzerVar.zzm(bArr7, 0, iZzH);
                                                zzaieVar = new zzaie(strZzg3, bArr7);
                                                zzaihVar = zzaieVar;
                                            }
                                            zzaihVar = zzaiqVar;
                                        } else if (iZzH < 4) {
                                            zzaihVar = null;
                                        } else {
                                            int iZzs13 = zzerVar.zzs();
                                            Charset charsetZzf2 = zzf(iZzs13);
                                            byte[] bArr8 = new byte[3];
                                            zzerVar.zzm(bArr8, 0, 3);
                                            String str6 = new String(bArr8, 0, 3);
                                            int i27 = iZzH - 4;
                                            byte[] bArr9 = new byte[i27];
                                            zzerVar.zzm(bArr9, 0, i27);
                                            int iZzh4 = zzh(bArr9, 0, iZzs13);
                                            String str7 = new String(bArr9, 0, iZzh4, charsetZzf2);
                                            int iZzj4 = iZzh4 + zzj(iZzs13);
                                            zzaihVar = new zzaih(str6, str7, zzl(bArr9, iZzj4, zzh(bArr9, iZzj4, iZzs13), charsetZzf2));
                                        }
                                        zzerVar.zzh(iZzg);
                                        zzainVar = zzaihVar;
                                        e = null;
                                    } else {
                                        if (i9 == 65 && iZzs2 == 80 && iZzs3 == 73 && iZzs4 == 67) {
                                            int iZzs82 = zzerVar.zzs();
                                            Charset charsetZzf3 = zzf(iZzs82);
                                            int i162 = iZzH - 1;
                                            byte[] bArr62 = new byte[i162];
                                            zzerVar.zzm(bArr62, 0, i162);
                                            if (i2 != 2) {
                                            }
                                            int i172 = bArr62[iZzi + 1] & UByte.MAX_VALUE;
                                            int i182 = iZzi + 2;
                                            int iZzh32 = zzh(bArr62, i182, iZzs82);
                                            zzaieVar = new zzaid(strConcat, new String(bArr62, i182, iZzh32 - i182, charsetZzf3), i172, zzk(bArr62, iZzh32 + zzj(iZzs82), i162));
                                        } else {
                                            i8 = iZzs;
                                            if (i9 == 67) {
                                                if (i9 != 67) {
                                                    if (i9 != 67) {
                                                        if (i9 != 77) {
                                                        }
                                                        String strZzg32 = zzg(i2, i9, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr72 = new byte[iZzH];
                                                        zzerVar.zzm(bArr72, 0, iZzH);
                                                        zzaieVar = new zzaie(strZzg32, bArr72);
                                                    }
                                                }
                                            }
                                        }
                                        zzaihVar = zzaieVar;
                                        zzerVar.zzh(iZzg);
                                        zzainVar = zzaihVar;
                                        e = null;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    zzerVar.zzh(iZzg);
                                    zzainVar = null;
                                } catch (OutOfMemoryError e3) {
                                    e = e3;
                                    zzerVar.zzh(iZzg);
                                    zzainVar = null;
                                }
                            } else if (iZzs2 != 69 || iZzs3 != 79) {
                                str = "Id3Decoder";
                                i9 = 71;
                                if (i2 == 2) {
                                }
                            } else if (iZzs4 == 66 || i2 == 2) {
                                try {
                                    int iZzs14 = zzerVar.zzs();
                                    Charset charsetZzf4 = zzf(iZzs14);
                                    int i28 = iZzH - 1;
                                    byte[] bArr10 = new byte[i28];
                                    zzerVar.zzm(bArr10, 0, i28);
                                    int iZzi6 = zzi(bArr10, 0);
                                    str = "Id3Decoder";
                                    String strZzh = zzas.zzh(new String(bArr10, 0, iZzi6, StandardCharsets.ISO_8859_1));
                                    int i29 = iZzi6 + 1;
                                    int iZzh5 = zzh(bArr10, i29, iZzs14);
                                    String strZzl = zzl(bArr10, i29, iZzh5, charsetZzf4);
                                    int iZzj5 = iZzh5 + zzj(iZzs14);
                                    int iZzh6 = zzh(bArr10, iZzj5, iZzs14);
                                    i8 = iZzs;
                                    zzaihVar = new zzaii(strZzh, strZzl, zzl(bArr10, iZzj5, iZzh6, charsetZzf4), zzk(bArr10, iZzh6 + zzj(iZzs14), i28));
                                    zzerVar.zzh(iZzg);
                                    zzainVar = zzaihVar;
                                    e = null;
                                } catch (Exception e4) {
                                    e = e4;
                                    str = "Id3Decoder";
                                    i8 = iZzs;
                                    zzerVar.zzh(iZzg);
                                    zzainVar = null;
                                } catch (OutOfMemoryError e5) {
                                    e = e5;
                                    str = "Id3Decoder";
                                    i8 = iZzs;
                                    zzerVar.zzh(iZzg);
                                    zzainVar = null;
                                }
                            } else {
                                i9 = 71;
                                str = "Id3Decoder";
                                if (i2 == 2) {
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                        } catch (OutOfMemoryError e7) {
                            e = e7;
                        }
                    }
                    i8 = iZzs;
                    str = "Id3Decoder";
                    zzerVar.zzh(iZzg);
                    zzainVar = zzaihVar;
                    e = null;
                }
            } catch (Throwable th) {
                zzerVar.zzh(iZzg);
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            i8 = iZzs;
            str = "Id3Decoder";
            zzerVar.zzh(iZzg);
            zzainVar = null;
            if (zzainVar == null) {
            }
            return zzainVar;
        } catch (OutOfMemoryError e9) {
            e = e9;
            i8 = iZzs;
            str = "Id3Decoder";
            zzerVar.zzh(iZzg);
            zzainVar = null;
            if (zzainVar == null) {
            }
            return zzainVar;
        }
        if (zzainVar == null) {
            String strZzg4 = zzg(i2, i8, iZzs2, iZzs3, iZzs4);
            StringBuilder sb = new StringBuilder(String.valueOf(strZzg4).length() + 39 + String.valueOf(iZzH).length());
            sb.append("Failed to decode frame: id=");
            sb.append(strZzg4);
            sb.append(", frameSize=");
            sb.append(iZzH);
            zzee.zzd(str, sb.toString(), e);
        }
        return zzainVar;
    }

    private static zzguf zzd(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return zzguf.zzj("");
        }
        int i5 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        int iZzh = zzh(bArr, i3, i2);
        while (i3 < iZzh) {
            zzgucVar.zzf(new String(bArr, i3, iZzh - i3, zzf(i2)));
            i3 = zzj(i2) + iZzh;
            iZzh = zzh(bArr, i3, i2);
        }
        zzguf zzgufVarZzi = zzgucVar.zzi();
        return zzgufVarZzi.isEmpty() ? zzguf.zzj("") : zzgufVarZzi;
    }

    private static Charset zzf(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String zzg(int i2, int i3, int i5, int i7, int i8) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i7)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    private static int zzi(byte[] bArr, int i2) {
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return length;
            }
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
    }

    private static int zzj(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    private static String zzl(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzap zza(byte[] bArr, int i2, zzaij zzaijVar, zzahw zzahwVar) {
        zzail zzailVar;
        ArrayList arrayList = new ArrayList();
        zzer zzerVar = new zzer(bArr, i2);
        boolean z2 = false;
        if (zzerVar.zzd() < 10) {
            zzee.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzx = zzerVar.zzx();
            if (iZzx == 4801587) {
                int iZzs = zzerVar.zzs();
                zzerVar.zzk(1);
                int iZzs2 = zzerVar.zzs();
                int iZzG = zzerVar.zzG();
                if (iZzs == 2) {
                    if ((iZzs2 & 64) != 0) {
                        zzee.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzailVar = new zzail(iZzs, iZzs >= 4 && (iZzs2 & 128) != 0, iZzG);
                } else {
                    if (iZzs == 3) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzB = zzerVar.zzB();
                            zzerVar.zzk(iZzB);
                            iZzG -= iZzB + 4;
                        }
                    } else if (iZzs == 4) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzG2 = zzerVar.zzG();
                            zzerVar.zzk(iZzG2 - 4);
                            iZzG -= iZzG2;
                        }
                        if ((iZzs2 & 16) != 0) {
                            iZzG -= 10;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzs).length() + 46);
                        sb.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb.append(iZzs);
                        zzee.zzc("Id3Decoder", sb.toString());
                    }
                    if (iZzs >= 4) {
                        zzailVar = new zzail(iZzs, iZzs >= 4 && (iZzs2 & 128) != 0, iZzG);
                    }
                }
                if (zzailVar != null) {
                    return null;
                }
                int iZzg = zzerVar.zzg();
                int i3 = zzailVar.zza() == 2 ? 6 : 10;
                boolean zZzb = zzailVar.zzb();
                int iZzc = zzailVar.zzc();
                if (zZzb) {
                    iZzc = zze(zzerVar, zzailVar.zzc());
                }
                zzerVar.zzf(iZzg + iZzc);
                if (!zzb(zzerVar, zzailVar.zza(), i3, false)) {
                    if (zzailVar.zza() != 4 || !zzb(zzerVar, 4, i3, true)) {
                        int iZza = zzailVar.zza();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 45);
                        sb2.append("Failed to validate ID3 tag with majorVersion=");
                        sb2.append(iZza);
                        zzee.zzc("Id3Decoder", sb2.toString());
                        return null;
                    }
                    z2 = true;
                }
                while (zzerVar.zzd() >= i3) {
                    zzain zzainVarZzc = zzc(zzailVar.zza(), zzerVar, z2, i3, zzaijVar);
                    if (zzainVarZzc != null) {
                        arrayList.add(zzainVarZzc);
                    }
                }
                return new zzap(arrayList);
            }
            zzee.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iZzx))));
        }
        zzailVar = null;
        if (zzailVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzb(zzer zzerVar, int i2, int i3, boolean z2) {
        boolean z3;
        int iZzx;
        long jZzx;
        int iZzt;
        int i5;
        int iZzg = zzerVar.zzg();
        while (true) {
            try {
                z3 = true;
                z3 = true;
                int i7 = 1;
                int i8 = 1;
                if (zzerVar.zzd() < i3) {
                    break;
                }
                if (i2 >= 3) {
                    iZzx = zzerVar.zzB();
                    jZzx = zzerVar.zzz();
                    iZzt = zzerVar.zzt();
                } else {
                    iZzx = zzerVar.zzx();
                    jZzx = zzerVar.zzx();
                    iZzt = 0;
                }
                if (iZzx != 0 || jZzx != 0 || iZzt != 0) {
                    if (i2 != 4 || z2) {
                        if (i2 != 4) {
                            if ((iZzt & 64) == 0) {
                                i7 = 0;
                            }
                            int i9 = i7;
                            i8 = iZzt & 1;
                            i5 = i9;
                        } else if (i2 == 3) {
                            i5 = (iZzt & 32) != 0 ? 1 : 0;
                            if ((iZzt & 128) == 0) {
                                i8 = 0;
                            }
                        } else {
                            i5 = 0;
                            i8 = 0;
                        }
                        if (i8 != 0) {
                            i5 += 4;
                        }
                        if (jZzx < i5 && zzerVar.zzd() >= jZzx) {
                            zzerVar.zzk((int) jZzx);
                        }
                    } else {
                        if ((8421504 & jZzx) != 0) {
                            break;
                        }
                        jZzx = ((jZzx >> 24) << 21) | (((jZzx >> 16) & 255) << 14) | (jZzx & 255) | (((jZzx >> 8) & 255) << 7);
                        if (i2 != 4) {
                        }
                        if (i8 != 0) {
                        }
                        if (jZzx < i5) {
                            break;
                        }
                        zzerVar.zzk((int) jZzx);
                    }
                }
            } finally {
                zzerVar.zzh(iZzg);
            }
        }
        z3 = false;
        return z3;
    }

    private static byte[] zzk(byte[] bArr, int i2, int i3) {
        return i3 <= i2 ? zzfj.zzb : Arrays.copyOfRange(bArr, i2, i3);
    }

    private static int zze(zzer zzerVar, int i2) {
        byte[] bArrZzi = zzerVar.zzi();
        int iZzg = zzerVar.zzg();
        int i3 = iZzg;
        while (true) {
            int i5 = i3 + 1;
            if (i5 < iZzg + i2) {
                if ((bArrZzi[i3] & UByte.MAX_VALUE) == 255 && bArrZzi[i5] == 0) {
                    System.arraycopy(bArrZzi, i3 + 2, bArrZzi, i5, (i2 - (i3 - iZzg)) - 2);
                    i2--;
                }
                i3 = i5;
            } else {
                return i2;
            }
        }
    }

    private static int zzh(byte[] bArr, int i2, int i3) {
        int iZzi = zzi(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iZzi;
        }
        while (true) {
            int length = bArr.length;
            if (iZzi < length - 1) {
                int i5 = iZzi + 1;
                if ((iZzi - i2) % 2 == 0 && bArr[i5] == 0) {
                    return iZzi;
                }
                iZzi = zzi(bArr, i5);
            } else {
                return length;
            }
        }
    }
}
