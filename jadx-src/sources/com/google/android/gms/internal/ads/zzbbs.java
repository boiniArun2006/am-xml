package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbbs extends zzbby {
    private final zzbar zzh;
    private long zzi;

    public zzbbs(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i2, int i3, zzbar zzbarVar) {
        super(zzbakVar, "X3d3ekEggpPfZcTTuZPSKX+MUCnQGNsbyccHnkW7iVTfczCTjKoxcgVjpAE8Uhyz", "I4rncSeVGoKv0gEJ8Xd0rq9G0kL2Ky2ley3iuTG83Dg=", zzawgVar, i2, 53);
        this.zzh = zzbarVar;
        if (zzbarVar != null) {
            this.zzi = zzbarVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
