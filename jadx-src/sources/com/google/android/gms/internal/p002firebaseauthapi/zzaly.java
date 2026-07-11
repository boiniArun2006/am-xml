package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzaly implements zzalz {
    zzaly() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final int zza(int i2, Object obj, Object obj2) {
        zzalw zzalwVar = (zzalw) obj;
        if (zzalwVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzalwVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final Object zzc(Object obj) {
        ((zzalw) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final Map<?, ?> zzd(Object obj) {
        return (zzalw) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final Map<?, ?> zze(Object obj) {
        return (zzalw) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final boolean zzf(Object obj) {
        return !((zzalw) obj).zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final Object zzb(Object obj) {
        return zzalw.zza().zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final zzalx<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalz
    public final Object zza(Object obj, Object obj2) {
        zzalw zzalwVarZzb = (zzalw) obj;
        zzalw zzalwVar = (zzalw) obj2;
        if (!zzalwVar.isEmpty()) {
            if (!zzalwVarZzb.zzd()) {
                zzalwVarZzb = zzalwVarZzb.zzb();
            }
            zzalwVarZzb.zza(zzalwVar);
        }
        return zzalwVarZzb;
    }
}
