package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzvj implements zzwm {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzwu zzc = new zzwu();
    private final zztj zzd = new zztj();

    @Nullable
    private Looper zze;

    @Nullable
    private zzbf zzf;

    @Nullable
    private zzpq zzg;

    protected void zzM() {
    }

    protected abstract void zza(@Nullable zzhz zzhzVar);

    protected void zzc() {
    }

    protected abstract void zzd();

    protected final zzwu zzf(@Nullable zzwk zzwkVar) {
        return this.zzc.zza(0, zzwkVar);
    }

    protected final zzwu zzg(int i2, @Nullable zzwk zzwkVar) {
        return this.zzc.zza(0, zzwkVar);
    }

    protected final zztj zzh(@Nullable zzwk zzwkVar) {
        return this.zzd.zza(0, zzwkVar);
    }

    protected final zztj zzi(int i2, @Nullable zzwk zzwkVar) {
        return this.zzd.zza(0, zzwkVar);
    }

    protected final void zze(zzbf zzbfVar) {
        this.zzf = zzbfVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzwl) arrayList.get(i2)).zza(this, zzbfVar);
        }
    }

    protected final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    protected final zzpq zzk() {
        zzpq zzpqVar = this.zzg;
        zzpqVar.getClass();
        return zzpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzl(Handler handler, zzwv zzwvVar) {
        this.zzc.zzb(handler, zzwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzm(zzwv zzwvVar) {
        this.zzc.zzc(zzwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzn(Handler handler, zztk zztkVar) {
        this.zzd.zzb(handler, zztkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzo(zztk zztkVar) {
        this.zzd.zzc(zztkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzq(zzwl zzwlVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzwlVar);
        if (zIsEmpty) {
            zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzr(zzwl zzwlVar) {
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzwlVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzs(zzwl zzwlVar) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzwlVar);
        if (!arrayList.isEmpty()) {
            zzr(zzwlVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzp(zzwl zzwlVar, @Nullable zzhz zzhzVar, zzpq zzpqVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z2 = true;
        if (looper != null && looper != looperMyLooper) {
            z2 = false;
        }
        zzgrc.zza(z2);
        this.zzg = zzpqVar;
        zzbf zzbfVar = this.zzf;
        this.zza.add(zzwlVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzwlVar);
            zza(zzhzVar);
        } else if (zzbfVar != null) {
            zzq(zzwlVar);
            zzwlVar.zza(this, zzbfVar);
        }
    }
}
