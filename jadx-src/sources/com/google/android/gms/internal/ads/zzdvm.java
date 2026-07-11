package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdvm {
    private final Map zza = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zza(String str, zzfki zzfkiVar) {
        zzbwh zzbwhVarZzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbwh zzbwhVarZzC = null;
        if (zzfkiVar != null) {
            try {
                zzbwhVarZzB = zzfkiVar.zzB();
            } catch (zzfjr unused) {
                zzbwhVarZzB = null;
            }
            if (zzfkiVar != null) {
            }
            boolean z2 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
            }
            this.zza.put(str, new zzdvl(str, zzbwhVarZzB, zzbwhVarZzC, z2));
            return;
        }
        zzbwhVarZzB = null;
        if (zzfkiVar != null) {
            try {
                zzbwhVarZzC = zzfkiVar.zzC();
            } catch (zzfjr unused2) {
            }
        }
        boolean z22 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
            if (zzfkiVar == null) {
                z22 = false;
            } else {
                try {
                    zzfkiVar.zzn();
                } catch (zzfjr unused3) {
                    z22 = false;
                }
            }
        }
        this.zza.put(str, new zzdvl(str, zzbwhVarZzB, zzbwhVarZzC, z22));
        return;
    }

    final synchronized void zzb(String str, zzbvs zzbvsVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdvl(str, zzbvsVar.zzf(), zzbvsVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    public final synchronized zzdvl zzc(String str) {
        return (zzdvl) this.zza.get(str);
    }

    zzdvm() {
    }

    public final String zzd(String str) {
        zzbwh zzbwhVar;
        zzdvl zzdvlVarZzc = zzc(str);
        if (zzdvlVarZzc != null && (zzbwhVar = zzdvlVarZzc.zzb) != null) {
            return zzbwhVar.toString();
        }
        return "";
    }
}
