package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzlj;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Ml implements zzlj {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ zzfb f60062n;

    Ml(zzfb zzfbVar) {
        this.f60062n = zzfbVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zza(String str, String str2, Bundle bundle) {
        this.f60062n.zzi(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzb(String str, String str2, Bundle bundle, long j2) {
        this.f60062n.zzj(str, str2, bundle, j2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final Map zzd(String str, String str2, boolean z2) {
        return this.f60062n.zzC(str, str2, z2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zze(zzjo zzjoVar) {
        this.f60062n.zzd(zzjoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzf(zzjp zzjpVar) {
        this.f60062n.zzf(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzg(zzjp zzjpVar) {
        this.f60062n.zzg(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzh() {
        return this.f60062n.zzA();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzi() {
        return this.f60062n.zzB();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzj() {
        return this.f60062n.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final String zzk() {
        return this.f60062n.zzx();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final long zzl() {
        return this.f60062n.zzz();
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzm(String str) {
        this.f60062n.zzu(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzn(String str) {
        this.f60062n.zzv(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzo(Bundle bundle) {
        this.f60062n.zzl(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final void zzp(String str, String str2, Bundle bundle) {
        this.f60062n.zzm(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final List zzq(String str, String str2) {
        return this.f60062n.zzn(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final int zzr(String str) {
        return this.f60062n.zzF(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlj
    public final Object zzx(int i2) {
        return this.f60062n.zzJ(i2);
    }
}
