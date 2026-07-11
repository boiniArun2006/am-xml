package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzezr implements zzfax {
    private final Context zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final VersionInfoParcel zzd;

    zzezr(Context context, zzgzy zzgzyVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzc = zzfjkVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzezs zzc() {
        zzgah zzgahVar;
        boolean z2;
        boolean zZze;
        try {
            Context context = this.zza;
            boolean zZza = this.zzc.zza();
            zzgah zzgahVar2 = new zzgah();
            zzgah zzgahVar3 = new zzgah();
            boolean zZzc = true;
            if (zZza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdV)).booleanValue()) {
                    return new zzezs(true);
                }
            }
            if (!zZza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdR)).booleanValue()) {
                    if (zZza) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdT)).booleanValue()) {
                            zzgahVar2 = zzgal.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                        }
                    }
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdZ)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdY)).intValue()) {
                    zzgam.zzh(context).zzj();
                }
            }
            if (!zZza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdS)).booleanValue()) {
                    if (zZza) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdU)).booleanValue()) {
                            zzgam zzgamVarZzh = zzgam.zzh(context);
                            zzgai zzgaiVarZza = zzgai.zza(context);
                            if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdY)).intValue()) {
                                zzgahVar3 = zzgamVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzed)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                                zZzc = zzgaiVarZza.zzc();
                            }
                            zZze = zzgaiVarZza.zze();
                            zzgahVar = zzgahVar3;
                            z2 = zZzc;
                        }
                    }
                    zzgahVar = zzgahVar3;
                    z2 = true;
                    zZze = true;
                }
            }
            return new zzezs(zzgahVar2, zzgahVar, z2, zZze, zZza);
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PerAppIdSignal");
            return new zzezs(this.zzc.zza());
        }
    }
}
