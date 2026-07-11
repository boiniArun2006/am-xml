package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaru;
import com.google.android.gms.internal.ads.zzary;
import com.google.android.gms.internal.ads.zzase;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzcen;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbk extends zzary {
    private final zzcen zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzcen zzcenVar) {
        super(0, str, new zzbj(zzcenVar));
        this.zza = zzcenVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzaru zzaruVar = (zzaru) obj;
        Map map = zzaruVar.zzc;
        int i2 = zzaruVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i2);
        byte[] bArr = zzaruVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzaruVar);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    protected final zzase zzr(zzaru zzaruVar) {
        return zzase.zza(zzaruVar, zzasv.zza(zzaruVar));
    }
}
