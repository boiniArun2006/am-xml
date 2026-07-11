package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzjf {
    final Context zza;
    zzdn zzb;
    zzgru zzc;
    zzgru zzd;
    zzgru zze;
    zzgru zzf;
    zzgru zzg;
    zzgqt zzh;
    Looper zzi;
    int zzj;
    zzd zzk;
    int zzl;
    boolean zzm;
    zzmt zzn;
    zzms zzo;
    long zzp;
    long zzq;
    int zzr;
    int zzs;
    int zzt;
    int zzu;
    boolean zzv;
    boolean zzw;
    String zzx;
    zzip zzy;

    public zzjf(final Context context, final zzmq zzmqVar) {
        zzgru zzgruVar = new zzgru() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return zzmqVar;
            }
        };
        zzgru zzgruVar2 = new zzgru() { // from class: com.google.android.gms.internal.ads.zziz
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new zzvx(context, new zzaeq());
            }
        };
        zzgru zzgruVar3 = new zzgru() { // from class: com.google.android.gms.internal.ads.zzja
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new zzaaa(context);
            }
        };
        zziy zziyVar = zziy.zza;
        zzgru zzgruVar4 = new zzgru() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return zzaav.zzh(context);
            }
        };
        zzix zzixVar = zzix.zza;
        context.getClass();
        this.zza = context;
        this.zzc = zzgruVar;
        this.zzd = zzgruVar2;
        this.zze = zzgruVar3;
        this.zzf = zziyVar;
        this.zzg = zzgruVar4;
        this.zzh = zzixVar;
        this.zzi = zzfj.zze();
        this.zzk = zzd.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzmt.zzc;
        this.zzo = zzms.zza;
        this.zzy = new zzip(0.97f, 1.03f, 1000L, 1.0E-7f, zzfj.zzq(20L), zzfj.zzq(500L), 0.999f, null);
        this.zzb = zzdn.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = 600000;
        this.zzv = true;
        this.zzx = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i2 = zziv.zza;
        }
    }
}
