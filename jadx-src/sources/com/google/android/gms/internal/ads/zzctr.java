package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzctr extends zzcwf {

    @Nullable
    private final zzcjl zzc;
    private final int zzd;
    private final Context zze;
    private final zzctf zzf;
    private final zzdmc zzg;
    private final zzdiq zzh;
    private final zzdbs zzi;
    private final boolean zzj;
    private final zzcdz zzk;
    private final zzdxz zzl;
    private boolean zzm;

    public final int zzc() {
        return this.zzd;
    }

    public final void zza(zzber zzberVar) {
        zzcjl zzcjlVar = this.zzc;
        if (zzcjlVar != null) {
            zzcjlVar.zzay(zzberVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzb(Activity activity, zzbfe zzbfeVar, boolean z2) throws RemoteException {
        zzcjl zzcjlVar;
        zzfir zzfirVarZzC;
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        boolean z3 = this.zzj;
        if (z3) {
            this.zzh.zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdmc zzdmcVar = this.zzg;
        if (!com.google.android.gms.ads.internal.util.zzs.zzT(zzdmcVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzS(context, this.zzb, this.zzl);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbi)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzL(context)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbj)).booleanValue()) {
                        new zzfvr(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() && (zzcjlVar = this.zzc) != null && (zzfirVarZzC = zzcjlVar.zzC()) != null && zzfirVarZzC.zzar && zzfirVarZzC.zzas != this.zzk.zzj()) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The app open consent form has been shown.");
            this.zzi.zzc(zzfkm.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfkm.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdmcVar.zza(z2, context, this.zzi);
            if (z3) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdmb e2) {
            this.zzi.zzd(e2);
        }
    }

    public final void zze(long j2, int i2) {
        this.zzf.zza(j2, i2);
    }

    zzctr(zzcwe zzcweVar, Context context, @Nullable zzcjl zzcjlVar, int i2, zzctf zzctfVar, zzdmc zzdmcVar, zzdiq zzdiqVar, zzdbs zzdbsVar, zzcdz zzcdzVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.zzm = false;
        this.zzc = zzcjlVar;
        this.zze = context;
        this.zzd = i2;
        this.zzf = zzctfVar;
        this.zzg = zzdmcVar;
        this.zzh = zzdiqVar;
        this.zzi = zzdbsVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgu)).booleanValue();
        this.zzk = zzcdzVar;
        this.zzl = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwf
    public final void zzd() {
        super.zzd();
        zzcjl zzcjlVar = this.zzc;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
        }
    }
}
