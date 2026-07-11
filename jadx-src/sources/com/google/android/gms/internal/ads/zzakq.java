package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import ep.oxM.esLNYym;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzakq {
    public static void zza(int i2, @Nullable zzap zzapVar, zzt zztVar, @Nullable zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzguf zzgufVarZzd = zzapVar.zzd(zzfs.class);
            int size = zzgufVarZzd.size();
            for (int i3 = 0; i3 < size; i3++) {
                zzfs zzfsVar = (zzfs) zzgufVarZzd.get(i3);
                if (!zzfsVar.zza.equals("com.android.capture.fps") || i2 == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfsVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzk(zzapVar2);
        }
    }

    public static void zzb(int i2, zzafn zzafnVar, zzt zztVar) {
        if (i2 == 1 && zzafnVar.zzb()) {
            zztVar.zzH(zzafnVar.zza);
            zztVar.zzI(zzafnVar.zzb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0286 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:9:0x003b, B:11:0x0046, B:15:0x0055, B:18:0x0061, B:21:0x006e, B:24:0x007b, B:27:0x0088, B:30:0x0096, B:32:0x00a2, B:40:0x00bf, B:41:0x00dd, B:42:0x00ef, B:45:0x00fb, B:48:0x0108, B:51:0x0115, B:54:0x0122, B:57:0x012f, B:60:0x013c, B:63:0x0149, B:65:0x0153, B:67:0x015d, B:69:0x0167, B:73:0x0178, B:75:0x017e, B:77:0x0192, B:78:0x0199, B:80:0x01a0, B:85:0x01ab, B:90:0x01b7, B:134:0x0286, B:91:0x01cc, B:93:0x01d3, B:95:0x01df, B:96:0x01f4, B:109:0x021e, B:112:0x022b, B:115:0x0238, B:118:0x0245, B:121:0x0251, B:124:0x025d, B:127:0x0267, B:130:0x0273, B:133:0x027f, B:135:0x02a3, B:136:0x02aa), top: B:141:0x002d }] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzao zzc(zzer zzerVar) {
        String str;
        zzao zzaidVar;
        int iZzg = zzerVar.zzg() + zzerVar.zzB();
        int iZzB = zzerVar.zzB();
        int i2 = (iZzB >> 24) & 255;
        zzao zzaoVarZzd = null;
        try {
            if (i2 == 169 || i2 == 253) {
                int i3 = iZzB & 16777215;
                if (i3 == 6516084) {
                    int iZzB2 = zzerVar.zzB();
                    if (zzerVar.zzB() == 1684108385) {
                        zzerVar.zzk(8);
                        String strZzL = zzerVar.zzL(iZzB2 - 16);
                        zzaoVarZzd = new zzaih(esLNYym.TDfbyeCgpAHJkif, strZzL, strZzL);
                    } else {
                        zzee.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzfw.zze(iZzB)));
                    }
                } else if (i3 == 7233901 || i3 == 7631467) {
                    zzaoVarZzd = zzd(iZzB, "TIT2", zzerVar);
                } else if (i3 == 6516589 || i3 == 7828084) {
                    zzaoVarZzd = zzd(iZzB, "TCOM", zzerVar);
                } else if (i3 == 6578553) {
                    zzaoVarZzd = zzd(iZzB, "TDRC", zzerVar);
                } else if (i3 == 4280916) {
                    zzaoVarZzd = zzd(iZzB, "TPE1", zzerVar);
                } else if (i3 == 7630703) {
                    zzaoVarZzd = zzd(iZzB, "TSSE", zzerVar);
                } else if (i3 == 6384738) {
                    zzaoVarZzd = zzd(iZzB, "TALB", zzerVar);
                } else if (i3 == 7108978) {
                    zzaoVarZzd = zzd(iZzB, "USLT", zzerVar);
                } else if (i3 == 6776174) {
                    zzaoVarZzd = zzd(iZzB, "TCON", zzerVar);
                } else if (i3 == 6779504) {
                    zzaoVarZzd = zzd(iZzB, "TIT1", zzerVar);
                } else if (i3 == 7173742) {
                    zzaoVarZzd = zzd(iZzB, "MVNM", zzerVar);
                } else if (i3 == 7173737) {
                    zzaoVarZzd = zze(iZzB, "MVIN", zzerVar, true, false);
                } else {
                    String strZze = zzfw.zze(iZzB);
                    StringBuilder sb = new StringBuilder(strZze.length() + 32);
                    sb.append("Skipped unknown metadata entry: ");
                    sb.append(strZze);
                    zzee.zza("MetadataUtil", sb.toString());
                }
            } else if (iZzB == 1735291493) {
                String strZza = zzaio.zza(zzf(zzerVar) - 1);
                if (strZza != null) {
                    zzaidVar = new zzais("TCON", null, zzguf.zzj(strZza));
                    zzaoVarZzd = zzaidVar;
                } else {
                    zzee.zzc("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iZzB == 1684632427) {
                zzaoVarZzd = zzg(1684632427, "TPOS", zzerVar);
            } else if (iZzB == 1953655662) {
                zzaoVarZzd = zzg(1953655662, "TRCK", zzerVar);
            } else if (iZzB == 1953329263) {
                zzaoVarZzd = zze(1953329263, "TBPM", zzerVar, true, false);
            } else if (iZzB == 1668311404) {
                zzaoVarZzd = zze(1668311404, "TCMP", zzerVar, true, true);
            } else if (iZzB == 1668249202) {
                int iZzB3 = zzerVar.zzB();
                if (zzerVar.zzB() == 1684108385) {
                    int iZzB4 = zzerVar.zzB();
                    int i5 = zzakh.zza;
                    int i7 = iZzB4 & 16777215;
                    if (i7 == 13) {
                        str = "image/jpeg";
                    } else if (i7 == 14) {
                        str = MimeTypes.IMAGE_PNG;
                        i7 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i7);
                        zzee.zzc("MetadataUtil", sb2.toString());
                    } else {
                        zzerVar.zzk(4);
                        int i8 = iZzB3 - 16;
                        byte[] bArr = new byte[i8];
                        zzerVar.zzm(bArr, 0, i8);
                        zzaidVar = new zzaid(str, null, 3, bArr);
                        zzaoVarZzd = zzaidVar;
                    }
                } else {
                    zzee.zzc("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iZzB == 1631670868) {
                zzaoVarZzd = zzd(1631670868, "TPE2", zzerVar);
            } else if (iZzB == 1936682605) {
                zzaoVarZzd = zzd(1936682605, "TSOT", zzerVar);
            } else if (iZzB == 1936679276) {
                zzaoVarZzd = zzd(1936679276, "TSOA", zzerVar);
            } else if (iZzB == 1936679282) {
                zzaoVarZzd = zzd(1936679282, "TSOP", zzerVar);
            } else if (iZzB == 1936679265) {
                zzaoVarZzd = zzd(1936679265, "TSO2", zzerVar);
            } else if (iZzB == 1936679791) {
                zzaoVarZzd = zzd(1936679791, "TSOC", zzerVar);
            } else if (iZzB == 1920233063) {
                zzaoVarZzd = zze(1920233063, "ITUNESADVISORY", zzerVar, false, false);
            } else if (iZzB == 1885823344) {
                zzaoVarZzd = zze(1885823344, "ITUNESGAPLESS", zzerVar, false, true);
            } else if (iZzB == 1936683886) {
                zzaoVarZzd = zzd(1936683886, "TVSHOWSORT", zzerVar);
            } else if (iZzB == 1953919848) {
                zzaoVarZzd = zzd(1953919848, "TVSHOW", zzerVar);
            } else if (iZzB == 757935405) {
                int i9 = -1;
                int i10 = -1;
                String strZzL2 = null;
                String strZzL3 = null;
                while (zzerVar.zzg() < iZzg) {
                    int iZzg2 = zzerVar.zzg();
                    int iZzB5 = zzerVar.zzB();
                    int iZzB6 = zzerVar.zzB();
                    zzerVar.zzk(4);
                    if (iZzB6 == 1835360622) {
                        strZzL2 = zzerVar.zzL(iZzB5 - 12);
                    } else {
                        int i11 = iZzB5 - 12;
                        if (iZzB6 == 1851878757) {
                            strZzL3 = zzerVar.zzL(i11);
                        } else {
                            if (iZzB6 == 1684108385) {
                                i10 = iZzB5;
                            }
                            if (iZzB6 == 1684108385) {
                                i9 = iZzg2;
                            }
                            zzerVar.zzk(i11);
                        }
                    }
                }
                if (strZzL2 != null && strZzL3 != null && i9 != -1) {
                    zzerVar.zzh(i9);
                    zzerVar.zzk(16);
                    zzaoVarZzd = new zzaip(strZzL2, strZzL3, zzerVar.zzL(i10 - 16));
                }
            }
            return zzaoVarZzd;
        } finally {
            zzerVar.zzh(iZzg);
        }
    }

    @Nullable
    private static zzais zzd(int i2, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            return new zzais(str, null, zzguf.zzj(zzerVar.zzL(iZzB - 16)));
        }
        zzee.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfw.zze(i2)));
        return null;
    }

    @Nullable
    private static zzain zze(int i2, String str, zzer zzerVar, boolean z2, boolean z3) {
        int iZzf = zzf(zzerVar);
        if (z3) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            if (z2) {
                return new zzais(str, null, zzguf.zzj(Integer.toString(iZzf)));
            }
            return new zzaih("und", str, Integer.toString(iZzf));
        }
        zzee.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfw.zze(i2)));
        return null;
    }

    private static int zzf(zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            int i2 = iZzB - 16;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4 && (zzerVar.zzn() & 128) == 0) {
                            return zzerVar.zzH();
                        }
                    } else {
                        return zzerVar.zzx();
                    }
                } else {
                    return zzerVar.zzt();
                }
            } else {
                return zzerVar.zzs();
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzais zzg(int i2, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385 && iZzB >= 22) {
            zzerVar.zzk(10);
            int iZzt = zzerVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzt).length());
                sb.append(iZzt);
                String string = sb.toString();
                int iZzt2 = zzerVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iZzt2);
                    string = sb2.toString();
                }
                return new zzais(str, null, zzguf.zzj(string));
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfw.zze(i2)));
        return null;
    }
}
