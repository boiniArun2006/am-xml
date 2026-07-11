package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final /* synthetic */ class zzbod implements zzboh {
    static final /* synthetic */ zzbod zza = new zzbod();

    private /* synthetic */ zzbod() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcle zzcleVar = (zzcle) obj;
        zzboh zzbohVar = zzbog.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i2 = Integer.parseInt(str);
            int i3 = Integer.parseInt(str2);
            int i5 = Integer.parseInt(str3);
            zzazh zzazhVarZzS = zzcleVar.zzS();
            if (zzazhVarZzS != null) {
                zzazhVarZzS.zzb().zze(i2, i3, i5);
            }
        } catch (NumberFormatException unused) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
