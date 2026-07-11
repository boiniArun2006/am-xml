package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzief {
    private static volatile int zza = 100;

    zzief() {
    }

    abstract void zza(Object obj, int i2, long j2);

    abstract void zzb(Object obj, int i2, int i3);

    abstract void zzc(Object obj, int i2, long j2);

    abstract void zzd(Object obj, int i2, zzian zzianVar);

    abstract void zze(Object obj, int i2, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzidp zzidpVar, int i2) throws IOException {
        int iZzc = zzidpVar.zzc();
        int i3 = iZzc >>> 3;
        int i5 = iZzc & 7;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 == 5) {
                                zzb(obj, i3, zzidpVar.zzk());
                                return true;
                            }
                            throw new zzicf("Protocol message tag had invalid wire type.");
                        }
                        if (i2 != 0) {
                            return false;
                        }
                        throw new zzicg("Protocol message end-group tag did not match expected tag.");
                    }
                    Object objZzf = zzf();
                    int i7 = i3 << 3;
                    int i8 = i2 + 1;
                    if (i8 < zza) {
                        while (zzidpVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzidpVar, i8)) {
                        }
                        if ((i7 | 4) == zzidpVar.zzc()) {
                            zze(obj, i3, zzg(objZzf));
                            return true;
                        }
                        throw new zzicg("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                zzd(obj, i3, zzidpVar.zzq());
                return true;
            }
            zzc(obj, i3, zzidpVar.zzj());
            return true;
        }
        zza(obj, i3, zzidpVar.zzh());
        return true;
    }
}
