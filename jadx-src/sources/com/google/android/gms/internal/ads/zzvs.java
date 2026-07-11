package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzvs extends zzvj {
    private final HashMap zza = new HashMap();

    @Nullable
    private Handler zzb;

    @Nullable
    private zzhz zzc;

    protected abstract void zzu(Object obj, zzwm zzwmVar, zzbf zzbfVar);

    protected int zzw(Object obj, int i2) {
        return 0;
    }

    @Nullable
    protected zzwk zzx(Object obj, zzwk zzwkVar) {
        throw null;
    }

    protected long zzy(Object obj, long j2, @Nullable zzwk zzwkVar) {
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    @CallSuper
    protected final void zzM() {
        for (zzvr zzvrVar : this.zza.values()) {
            zzvrVar.zza.zzq(zzvrVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    @CallSuper
    protected void zza(@Nullable zzhz zzhzVar) {
        this.zzc = zzhzVar;
        this.zzb = zzfj.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    @CallSuper
    protected final void zzc() {
        for (zzvr zzvrVar : this.zza.values()) {
            zzvrVar.zza.zzr(zzvrVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    @CallSuper
    protected void zzd() {
        HashMap map = this.zza;
        for (zzvr zzvrVar : map.values()) {
            zzwm zzwmVar = zzvrVar.zza;
            zzwmVar.zzs(zzvrVar.zzb);
            zzvq zzvqVar = zzvrVar.zzc;
            zzwmVar.zzm(zzvqVar);
            zzwmVar.zzo(zzvqVar);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    @CallSuper
    public void zzt() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzvr) it.next()).zza.zzt();
        }
    }

    protected final void zzv(final Object obj, zzwm zzwmVar) {
        HashMap map = this.zza;
        zzgrc.zza(!map.containsKey(obj));
        zzwl zzwlVar = new zzwl() { // from class: com.google.android.gms.internal.ads.zzvp
            @Override // com.google.android.gms.internal.ads.zzwl
            public final /* synthetic */ void zza(zzwm zzwmVar2, zzbf zzbfVar) {
                this.zza.zzu(obj, zzwmVar2, zzbfVar);
            }
        };
        zzvq zzvqVar = new zzvq(this, obj);
        map.put(obj, new zzvr(zzwmVar, zzwlVar, zzvqVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzwmVar.zzl(handler, zzvqVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzwmVar.zzn(handler2, zzvqVar);
        zzwmVar.zzp(zzwlVar, this.zzc, zzk());
        if (zzj()) {
            return;
        }
        zzwmVar.zzr(zzwlVar);
    }

    protected zzvs() {
    }
}
