package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhiy extends zzhys {
    @Override // com.google.android.gms.internal.ads.zzhys
    public final /* bridge */ /* synthetic */ void zza(zzhzs zzhzsVar, Object obj) throws IOException {
        throw null;
    }

    private static final zzhyl zzd(zzhzq zzhzqVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 5) {
            String strZzi = zzhzqVar.zzi();
            if (zzhja.zza(strZzi)) {
                return new zzhyp(strZzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i3 == 6) {
            return new zzhyp(new zzhiz(zzhzqVar.zzi()));
        }
        if (i3 == 7) {
            return new zzhyp(Boolean.valueOf(zzhzqVar.zzj()));
        }
        if (i3 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzhzr.zza(i2)));
        }
        zzhzqVar.zzk();
        return zzhym.zza;
    }

    private static final zzhyl zze(zzhzq zzhzqVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 0) {
            zzhzqVar.zzb();
            return new zzhyk();
        }
        if (i3 != 2) {
            return null;
        }
        zzhzqVar.zzd();
        return new zzhyn();
    }

    public static final zzhyl zzb(zzhzq zzhzqVar) throws IOException {
        String strZzh;
        zzhyl zzhylVarZzd;
        int iZzm = zzhzqVar.zzm();
        zzhyl zzhylVarZze = zze(zzhzqVar, iZzm);
        if (zzhylVarZze == null) {
            return zzd(zzhzqVar, iZzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzhzqVar.zzf()) {
                if (zzhylVarZze instanceof zzhyn) {
                    strZzh = zzhzqVar.zzh();
                    if (!zzhja.zza(strZzh)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    strZzh = null;
                }
                int iZzm2 = zzhzqVar.zzm();
                zzhyl zzhylVarZze2 = zze(zzhzqVar, iZzm2);
                if (zzhylVarZze2 == null) {
                    zzhylVarZzd = zzd(zzhzqVar, iZzm2);
                } else {
                    zzhylVarZzd = zzhylVarZze2;
                }
                if (zzhylVarZze instanceof zzhyk) {
                    ((zzhyk) zzhylVarZze).zza(zzhylVarZzd);
                } else {
                    zzhyn zzhynVar = (zzhyn) zzhylVarZze;
                    if (!zzhynVar.zzc(strZzh)) {
                        zzhynVar.zza(strZzh, zzhylVarZzd);
                    } else {
                        throw new IOException("duplicate key: ".concat(String.valueOf(strZzh)));
                    }
                }
                if (zzhylVarZze2 != null) {
                    arrayDeque.addLast(zzhylVarZze);
                    if (arrayDeque.size() <= 100) {
                        zzhylVarZze = zzhylVarZzd;
                    } else {
                        throw new IOException("too many recursions");
                    }
                } else {
                    continue;
                }
            } else {
                if (zzhylVarZze instanceof zzhyk) {
                    zzhzqVar.zzc();
                } else {
                    zzhzqVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zzhylVarZze;
                }
                zzhylVarZze = (zzhyl) arrayDeque.removeLast();
            }
        }
    }
}
