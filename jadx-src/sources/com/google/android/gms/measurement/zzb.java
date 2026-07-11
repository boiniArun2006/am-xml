package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzlj;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzb extends zzc {
    private final zzlj zza;

    public zzb(zzlj zzljVar) {
        super(null);
        Preconditions.checkNotNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzb(String str, String str2, Bundle bundle, long j2) {
        this.zza.zzb(str, str2, bundle, j2);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Map zzc(boolean z2) {
        return this.zza.zzd(null, null, z2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final Map zzd(String str, String str2, boolean z2) {
        return this.zza.zzd(str, str2, z2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zze(zzjo zzjoVar) {
        this.zza.zze(zzjoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzf(zzjp zzjpVar) {
        this.zza.zzf(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzg(zzjp zzjpVar) {
        this.zza.zzg(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzm(String str) {
        this.zza.zzm(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzn(String str) {
        this.zza.zzn(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzo(Bundle bundle) {
        this.zza.zzo(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzp(String str, String str2, Bundle bundle) {
        this.zza.zzp(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final List zzq(String str, String str2) {
        return this.zza.zzq(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final int zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Boolean zzs() {
        return (Boolean) this.zza.zzx(4);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Integer zzt() {
        return (Integer) this.zza.zzx(3);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final String zzu() {
        return (String) this.zza.zzx(0);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Long zzv() {
        return (Long) this.zza.zzx(1);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Double zzw() {
        return (Double) this.zza.zzx(2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final Object zzx(int i2) {
        return this.zza.zzx(i2);
    }
}
