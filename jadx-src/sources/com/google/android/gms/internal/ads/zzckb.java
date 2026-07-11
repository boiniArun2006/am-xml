package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzckb {
    public static final zzcjl zza(final Context context, final zzclv zzclvVar, final String str, final boolean z2, final boolean z3, @Nullable final zzazh zzazhVar, @Nullable final zzbil zzbilVar, final VersionInfoParcel versionInfoParcel, @Nullable zzbht zzbhtVar, @Nullable final com.google.android.gms.ads.internal.zzn zznVar, @Nullable final com.google.android.gms.ads.internal.zza zzaVar, final zzbgd zzbgdVar, @Nullable final zzfir zzfirVar, @Nullable final zzfiu zzfiuVar, @Nullable final zzejf zzejfVar, @Nullable final zzfjo zzfjoVar, @Nullable final zzdxz zzdxzVar) throws zzcka {
        zzbhe.zza(context);
        try {
            final zzbht zzbhtVar2 = null;
            zzgru zzgruVar = new zzgru(context, zzclvVar, str, z2, z3, zzazhVar, zzbilVar, versionInfoParcel, zzbhtVar2, zznVar, zzaVar, zzbgdVar, zzfirVar, zzfiuVar, zzfjoVar, zzdxzVar, zzejfVar) { // from class: com.google.android.gms.internal.ads.zzcjx
                private final /* synthetic */ Context zza;
                private final /* synthetic */ zzclv zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ zzazh zzf;
                private final /* synthetic */ zzbil zzg;
                private final /* synthetic */ VersionInfoParcel zzh;
                private final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                private final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                private final /* synthetic */ zzbgd zzk;
                private final /* synthetic */ zzfir zzl;
                private final /* synthetic */ zzfiu zzm;
                private final /* synthetic */ zzfjo zzn;
                private final /* synthetic */ zzdxz zzo;
                private final /* synthetic */ zzejf zzp;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbgdVar;
                    this.zzl = zzfirVar;
                    this.zzm = zzfiuVar;
                    this.zzn = zzfjoVar;
                    this.zzo = zzdxzVar;
                    this.zzp = zzejfVar;
                }

                @Override // com.google.android.gms.internal.ads.zzgru
                public final /* synthetic */ Object zza() {
                    zzclv zzclvVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z4 = this.zzd;
                    boolean z5 = this.zze;
                    zzejf zzejfVar2 = this.zzp;
                    zzdxz zzdxzVar2 = this.zzo;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbgd zzbgdVar2 = this.zzk;
                    zzfir zzfirVar2 = this.zzl;
                    zzfiu zzfiuVar2 = this.zzm;
                    zzfjo zzfjoVar2 = this.zzn;
                    zzazh zzazhVar2 = this.zzf;
                    zzbil zzbilVar2 = this.zzg;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    Context context2 = this.zza;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i2 = zzcko.zza;
                        zzckh zzckhVar = new zzckh(new zzcko(new zzcln(context2), zzclvVar2, str2, z4, z5, zzazhVar2, zzbilVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbgdVar2, zzfirVar2, zzfiuVar2, zzfjoVar2), zzdxzVar2);
                        zzckhVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzf().zzb(zzckhVar, zzbgdVar2, z5, zzejfVar2));
                        zzckhVar.setWebChromeClient(new zzcjk(zzckhVar));
                        return zzckhVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objZza = zzgruVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzcjl) objZza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new zzcka("Webview initialization failed.", th2);
        }
    }

    public static final com.google.common.util.concurrent.Xo zzb(final Context context, final VersionInfoParcel versionInfoParcel, final String str, final zzazh zzazhVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzejf zzejfVar, final zzfjo zzfjoVar, final zzdxz zzdxzVar) {
        return zzgzo.zzf(new zzgyv() { // from class: com.google.android.gms.internal.ads.zzcjz
            @Override // com.google.android.gms.internal.ads.zzgyv
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza() throws zzcka {
                com.google.android.gms.ads.internal.zzt.zzd();
                Context context2 = context;
                zzclv zzclvVarZzb = zzclv.zzb();
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzbgd zzbgdVarZza = zzbgd.zza();
                zzejf zzejfVar2 = zzejfVar;
                zzfjo zzfjoVar2 = zzfjoVar;
                zzdxz zzdxzVar2 = zzdxzVar;
                zzcjl zzcjlVarZza = zzckb.zza(context2, zzclvVarZzb, "", false, false, zzazhVar, null, versionInfoParcel, null, null, zzaVar2, zzbgdVarZza, null, null, zzejfVar2, zzfjoVar2, zzdxzVar2);
                final zzcem zzcemVarZza = zzcem.zza(zzcjlVarZza);
                zzcjlVarZza.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzcjy
                    @Override // com.google.android.gms.internal.ads.zzclh
                    public final /* synthetic */ void zza(boolean z2, int i2, String str2, String str3) {
                        zzcemVarZza.zzb();
                    }
                });
                zzcjlVarZza.loadUrl(str);
                return zzcemVarZza;
            }
        }, zzcei.zzf);
    }
}
