package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcdz implements zzbdy {

    @VisibleForTesting
    final zzcdw zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();

    @VisibleForTesting
    final HashSet zzb = new HashSet();

    @VisibleForTesting
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzcdx zzf = new zzcdx();

    public final boolean zzl() {
        return this.zzg;
    }

    public final String zzm() {
        return this.zzf.zzb();
    }

    public final void zzb(zzcdo zzcdoVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcdoVar);
        }
    }

    public final void zzc(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zza();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, long j2) {
        synchronized (this.zzd) {
            this.zza.zze(zzmVar, j2);
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zzg();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final int zzj() {
        int iZzd;
        synchronized (this.zzd) {
            iZzd = this.zza.zzd();
        }
        return iZzd;
    }

    public final zzcdo zzk(Clock clock, String str) {
        return new zzcdo(clock, this, this.zzf.zza(), str);
    }

    public final zzcdv zzn(Set set, @Nullable String str) {
        return this.zza.zzi(set, str);
    }

    public final Bundle zzo(Context context, zzfks zzfksVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            HashSet hashSet2 = this.zzb;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(PangleCreativeInfo.f62498a, this.zza.zzh(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzcdo) it2.next()).zzi());
        }
        bundle.putParcelableArrayList(l.f62638S, arrayList);
        zzfksVar.zzb(hashSet);
        return bundle;
    }

    public zzcdz(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzcdw(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z2) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (z2) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zze;
            if (jCurrentTimeMillis - zzgVar.zzm() > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbB)).longValue()) {
                this.zza.zzd = -1;
            } else {
                this.zza.zzd = zzgVar.zzo();
            }
            this.zzg = true;
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.zze;
        zzgVar2.zzl(jCurrentTimeMillis);
        zzgVar2.zzn(this.zza.zzd);
    }
}
