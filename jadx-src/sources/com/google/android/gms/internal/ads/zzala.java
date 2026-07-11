package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzala {
    private static final zzgrr zza = zzgrr.zza(zzgqq.zzc(':'));
    private static final zzgrr zzb = zzgrr.zza(zzgqq.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int zzb(zzaev zzaevVar, zzafv zzafvVar, List list) throws IOException {
        int i2;
        byte b2;
        char c2;
        int i3 = this.zzd;
        if (i3 == 0) {
            long jZzo = zzaevVar.zzo();
            zzafvVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i5 = 2;
        if (i3 != 1) {
            short s2 = 2817;
            short s3 = 2816;
            short s4 = 2192;
            if (i3 != 2) {
                long jZzn = zzaevVar.zzn();
                int iZzo = (int) ((zzaevVar.zzo() - zzaevVar.zzn()) - ((long) this.zze));
                zzer zzerVar = new zzer(iZzo);
                zzaevVar.zzc(zzerVar.zzi(), 0, iZzo);
                int i7 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i7 >= list2.size()) {
                        zzafvVar.zza = 0L;
                        return 1;
                    }
                    zzakz zzakzVar = (zzakz) list2.get(i7);
                    zzerVar.zzh((int) (zzakzVar.zza - jZzn));
                    zzerVar.zzk(4);
                    int iZzC = zzerVar.zzC();
                    Charset charset = StandardCharsets.UTF_8;
                    String strZzK = zzerVar.zzK(iZzC, charset);
                    switch (strZzK.hashCode()) {
                        case -1711564334:
                            b2 = strZzK.equals("SlowMotion_Data") ? (byte) 0 : (byte) -1;
                            break;
                        case -1332107749:
                            b2 = strZzK.equals("Super_SlowMotion_Edit_Data") ? (byte) 3 : (byte) -1;
                            break;
                        case -1251387154:
                            b2 = strZzK.equals("Super_SlowMotion_Data") ? (byte) 1 : (byte) -1;
                            break;
                        case -830665521:
                            b2 = strZzK.equals("Super_SlowMotion_Deflickering_On") ? (byte) 4 : (byte) -1;
                            break;
                        case 1760745220:
                            b2 = strZzK.equals("Super_SlowMotion_BGM") ? (byte) 2 : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        c2 = 2192;
                    } else if (b2 == 1) {
                        c2 = 2816;
                    } else if (b2 == 2) {
                        c2 = 2817;
                    } else if (b2 == 3) {
                        c2 = 2819;
                    } else {
                        if (b2 != 4) {
                            throw zzat.zzb("Invalid SEF name", null);
                        }
                        c2 = 2820;
                    }
                    int i8 = zzakzVar.zzb - (iZzC + 8);
                    if (c2 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZze = zzb.zze(zzerVar.zzK(i8, charset));
                        for (int i9 = 0; i9 < listZze.size(); i9++) {
                            List listZze2 = zza.zze((CharSequence) listZze.get(i9));
                            if (listZze2.size() != 3) {
                                throw zzat.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzaiv(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                            } catch (NumberFormatException e2) {
                                throw zzat.zzb(null, e2);
                            }
                        }
                        list.add(new zzaiw(arrayList));
                    } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                        throw new IllegalStateException();
                    }
                    i7++;
                }
            } else {
                long jZzo2 = zzaevVar.zzo();
                int i10 = this.zze - 20;
                zzer zzerVar2 = new zzer(i10);
                zzaevVar.zzc(zzerVar2.zzi(), 0, i10);
                int i11 = 0;
                while (i11 < i10 / 12) {
                    zzerVar2.zzk(i5);
                    short sZzw = zzerVar2.zzw();
                    if (sZzw == s4 || sZzw == s3 || sZzw == s2 || sZzw == 2819 || sZzw == 2820) {
                        i2 = i10;
                        this.zzc.add(new zzakz(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzerVar2.zzC()), zzerVar2.zzC()));
                    } else {
                        zzerVar2.zzk(8);
                        i2 = i10;
                    }
                    i11++;
                    i10 = i2;
                    i5 = 2;
                    s2 = 2817;
                    s3 = 2816;
                    s4 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzafvVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzafvVar.zza = ((zzakz) list3.get(0)).zza;
                }
            }
        } else {
            zzer zzerVar3 = new zzer(8);
            zzaevVar.zzc(zzerVar3.zzi(), 0, 8);
            this.zze = zzerVar3.zzC() + 8;
            if (zzerVar3.zzB() != 1397048916) {
                zzafvVar.zza = 0L;
            } else {
                zzafvVar.zza = zzaevVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
