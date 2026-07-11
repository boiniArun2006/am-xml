package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgez {
    private final zzgzy zza;
    private final zzgfe zzb;
    private final Set zzc;
    private final String zzd;
    private final zzawg zze;
    private final zzgfx zzf;
    private final zzgoe zzg;

    final com.google.common.util.concurrent.Xo zza() {
        if (!this.zzb.zzc()) {
            return zzgzo.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgey
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb();
                }
            }, this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.submit((zzgha) it.next()));
        }
        return zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzgew
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }, zzhaf.zza());
    }

    final /* synthetic */ String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    final /* synthetic */ String zzc() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgex
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        };
        zzgoc zzgocVarZza = this.zzg.zza(101);
        try {
            zzgocVarZza.zza();
            Object objCall = callable.call();
            zzgocVarZza.zzc();
            return (String) objCall;
        } finally {
        }
    }

    final /* synthetic */ String zzd() {
        zzaxg zzaxgVar = (zzaxg) this.zze.zzbu();
        String str = this.zzd;
        zzgfe zzgfeVar = this.zzb;
        try {
            return Base64.encodeToString(((zzaxx) zzgfeVar.zzf(zzaxgVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzgfeVar.zzg(4096, str);
        }
    }

    zzgez(zzgzy zzgzyVar, zzgfe zzgfeVar, zzgfx zzgfxVar, zzgcc zzgccVar, String str, zzawg zzawgVar, zzikv zzikvVar, zzikv zzikvVar2, zzikv zzikvVar3, zzgoe zzgoeVar) {
        this.zza = zzgzyVar;
        this.zzb = zzgfeVar;
        this.zzd = str;
        this.zzf = zzgfxVar;
        this.zze = zzawgVar;
        this.zzg = zzgoeVar;
        int iOrdinal = zzgccVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    this.zzc = ((zziks) zzikvVar3).zzb();
                    return;
                }
                throw new IllegalStateException();
            }
            this.zzc = ((zziks) zzikvVar2).zzb();
            return;
        }
        this.zzc = ((zziks) zzikvVar).zzb();
    }
}
