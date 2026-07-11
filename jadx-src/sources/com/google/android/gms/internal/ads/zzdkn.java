package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdkn extends zzcwf {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdiq zze;
    private final zzdmc zzf;
    private final zzcxa zzg;
    private final zzfvr zzh;
    private final zzdbs zzi;
    private final zzcdz zzj;
    private final zzdxz zzk;
    private boolean zzl;

    public final void finalize() throws Throwable {
        try {
            final zzcjl zzcjlVar = (zzcjl) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhE)).booleanValue()) {
                if (!this.zzl && zzcjlVar != null) {
                    zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkm
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcjlVar.destroy();
                        }
                    });
                }
            } else if (zzcjlVar != null) {
                zzcjlVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(boolean z2, Activity activity) {
        zzfir zzfirVarZzC;
        zzdiq zzdiqVar = this.zze;
        zzdiqVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdmc zzdmcVar = this.zzf;
        if (!com.google.android.gms.ads.internal.util.zzs.zzT(zzdmcVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzS(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbi)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbj)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                } else {
                    zzcjl zzcjlVar = (zzcjl) this.zzd.get();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() || zzcjlVar == null || (zzfirVarZzC = zzcjlVar.zzC()) == null || !zzfirVarZzC.zzar || zzfirVarZzC.zzas == this.zzj.zzj()) {
                        if (this.zzl) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                            this.zzi.zzc(zzfkm.zzd(10, null, null));
                        }
                        Context context = activity;
                        if (!this.zzl) {
                            if (activity == null) {
                                context = this.zzc;
                            }
                            try {
                                zzdmcVar.zza(z2, context, this.zzi);
                                zzdiqVar.zzb();
                                this.zzl = true;
                                return true;
                            } catch (zzdmb e2) {
                                this.zzi.zzd(e2);
                            }
                        }
                    } else {
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
                        this.zzi.zzc(zzfkm.zzd(12, "The consent form has already been shown.", null));
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }

    zzdkn(zzcwe zzcweVar, Context context, zzcjl zzcjlVar, zzdiq zzdiqVar, zzdmc zzdmcVar, zzcxa zzcxaVar, zzfvr zzfvrVar, zzdbs zzdbsVar, zzcdz zzcdzVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcjlVar);
        this.zze = zzdiqVar;
        this.zzf = zzdmcVar;
        this.zzg = zzcxaVar;
        this.zzh = zzfvrVar;
        this.zzi = zzdbsVar;
        this.zzj = zzcdzVar;
        this.zzk = zzdxzVar;
    }
}
