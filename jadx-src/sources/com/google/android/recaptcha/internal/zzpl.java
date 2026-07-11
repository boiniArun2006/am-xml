package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzpl {
    private static volatile int zza = 100;

    zzpl() {
    }

    abstract Object zza(Object obj);

    abstract Object zzb();

    abstract Object zzc(Object obj);

    abstract void zzd(Object obj, int i2, int i3);

    abstract void zze(Object obj, int i2, long j2);

    abstract void zzf(Object obj, int i2, Object obj2);

    abstract void zzg(Object obj, int i2, zzle zzleVar);

    abstract void zzh(Object obj, int i2, long j2);

    abstract void zzi(Object obj);

    abstract void zzj(Object obj, Object obj2);

    final boolean zzk(Object obj, zzov zzovVar, int i2) throws IOException {
        int iZzd = zzovVar.zzd();
        int i3 = iZzd >>> 3;
        int i5 = iZzd & 7;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 == 5) {
                                zzd(obj, i3, zzovVar.zzf());
                                return true;
                            }
                            throw new zznm("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    Object objZzb = zzb();
                    int i7 = i3 << 3;
                    int i8 = i2 + 1;
                    if (i8 < zza) {
                        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzovVar, i8)) {
                        }
                        if ((i7 | 4) == zzovVar.zzd()) {
                            zzf(obj, i3, zzc(objZzb));
                            return true;
                        }
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                zzg(obj, i3, zzovVar.zzp());
                return true;
            }
            zze(obj, i3, zzovVar.zzk());
            return true;
        }
        zzh(obj, i3, zzovVar.zzl());
        return true;
    }
}
