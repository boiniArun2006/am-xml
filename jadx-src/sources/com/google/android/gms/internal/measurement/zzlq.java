package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzlq {
    static final zzlq zza = new zzlq(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzlq zzd;
    private final Map zze;

    zzlq() {
        this.zze = new HashMap();
    }

    zzlq(boolean z2) {
        this.zze = Collections.EMPTY_MAP;
    }

    public static zzlq zza() {
        zzlq zzlqVar = zzd;
        if (zzlqVar != null) {
            return zzlqVar;
        }
        synchronized (zzlq.class) {
            try {
                zzlq zzlqVar2 = zzd;
                if (zzlqVar2 != null) {
                    return zzlqVar2;
                }
                int i2 = zznt.zza;
                zzlq zzlqVarZzb = zzly.zzb(zzlq.class);
                zzd = zzlqVarZzb;
                return zzlqVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzmd zzb(zznl zznlVar, int i2) {
        return (zzmd) this.zze.get(new zzlp(zznlVar, i2));
    }
}
