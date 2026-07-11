package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbau extends zzbby {
    private final Activity zzh;
    private final View zzi;

    public zzbau(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i2, int i3, View view, Activity activity) {
        super(zzbakVar, "v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", zzawgVar, i2, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdp);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, bool);
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzS(((Long) objArr[0]).longValue());
                zzawgVar.zzT(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    zzawgVar.zzU((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
