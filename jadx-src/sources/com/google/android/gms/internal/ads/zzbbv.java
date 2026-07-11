package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbbv extends zzbby {
    private final View zzh;

    public zzbbv(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i2, int i3, View view) {
        super(zzbakVar, "FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", zzawgVar, i2, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzel);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmu);
            zzbao zzbaoVar = new zzbao((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzaxe zzaxeVarZza = zzaxf.zza();
            zzaxeVarZza.zzb(zzbaoVar.zza.longValue());
            zzaxeVarZza.zzc(zzbaoVar.zzb.longValue());
            zzaxeVarZza.zzd(zzbaoVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzaxeVarZza.zza(zzbaoVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzaxeVarZza.zze(zzbaoVar.zzd.longValue());
            }
            this.zzd.zzM((zzaxf) zzaxeVarZza.zzbu());
        }
    }
}
