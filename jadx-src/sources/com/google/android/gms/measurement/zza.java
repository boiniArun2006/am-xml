package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzib;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzpk;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zza extends zzc {
    private final zzib zza;
    private final zzli zzb;

    public zza(@NonNull zzib zzibVar) {
        super(null);
        Preconditions.checkNotNull(zzibVar);
        this.zza = zzibVar;
        this.zzb = zzibVar.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zza(String str, String str2, Bundle bundle) {
        this.zzb.zzB(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzb(String str, String str2, Bundle bundle, long j2) {
        this.zzb.zzC(str, str2, bundle, true, false, j2);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Map zzc(boolean z2) {
        List<zzpk> listZzO = this.zzb.zzO(z2);
        ArrayMap arrayMap = new ArrayMap(listZzO.size());
        for (zzpk zzpkVar : listZzO) {
            Object objZza = zzpkVar.zza();
            if (objZza != null) {
                arrayMap.put(zzpkVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final Map zzd(String str, String str2, boolean z2) {
        return this.zzb.zzP(str, str2, z2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zze(zzjo zzjoVar) {
        this.zzb.zzV(zzjoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzf(zzjp zzjpVar) {
        this.zzb.zzW(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzg(zzjp zzjpVar) {
        this.zzb.zzX(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzh() {
        return this.zzb.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzi() {
        return this.zzb.zzae();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzj() {
        return this.zzb.zzQ();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzk() {
        return this.zzb.zzQ();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final long zzl() {
        return this.zza.zzk().zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzm(String str) {
        zzib zzibVar = this.zza;
        zzibVar.zzw().zza(str, zzibVar.zzaZ().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzn(String str) {
        zzib zzibVar = this.zza;
        zzibVar.zzw().zzb(str, zzibVar.zzaZ().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzo(Bundle bundle) {
        this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzp(String str, String str2, Bundle bundle) {
        this.zza.zzj().zzab(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final List zzq(String str, String str2) {
        return this.zzb.zzac(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final int zzr(String str) {
        this.zzb.zzY(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Boolean zzs() {
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Integer zzt() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final String zzu() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Long zzv() {
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Double zzw() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final Object zzx(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? this.zzb.zzi() : this.zzb.zzl() : this.zzb.zzm() : this.zzb.zzk() : this.zzb.zzj();
    }
}
