package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzibb {
    static final zzibb zza = new zzibb(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzibb zzd;
    private final Map zze;

    zzibb() {
        this.zze = new HashMap();
    }

    zzibb(boolean z2) {
        this.zze = Collections.EMPTY_MAP;
    }

    public static zzibb zza() {
        int i2 = zziaa.zza;
        return zza;
    }

    public static zzibb zzb() {
        zzibb zzibbVar = zzd;
        if (zzibbVar != null) {
            return zzibbVar;
        }
        synchronized (zzibb.class) {
            try {
                zzibb zzibbVar2 = zzd;
                if (zzibbVar2 != null) {
                    return zzibbVar2;
                }
                int i2 = zziaa.zza;
                zzibb zzibbVarZzb = zzibj.zzb(zzibb.class);
                zzd = zzibbVarZzb;
                return zzibbVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzibp zzc(zzidc zzidcVar, int i2) {
        return (zzibp) this.zze.get(new zziba(zzidcVar, i2));
    }
}
