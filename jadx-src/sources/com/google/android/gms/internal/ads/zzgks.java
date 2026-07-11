package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgks implements zzgkg {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzgce zzc;
    private final String zzd;
    private final String zze;
    private final zzgoe zzf;
    private final zzgku zzg;

    final /* synthetic */ zzgds zzc(UnknownHostException unknownHostException) {
        this.zzf.zzb(20007);
        return zze(13);
    }

    final /* synthetic */ zzgds zzd(SocketException socketException) {
        this.zzf.zzb(20008);
        return zze(13);
    }

    zzgks(Context context, ExecutorService executorService, zzgbf zzgbfVar, zzgce zzgceVar, zzgoe zzgoeVar, zzgku zzgkuVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzgceVar;
        this.zzf = zzgoeVar;
        this.zzg = zzgkuVar;
        this.zzd = zzgbfVar.zzb();
        this.zze = zzgbfVar.zzi().zzc();
    }

    private static zzgds zze(int i2) {
        zzgdr zzgdrVarZzd = zzgds.zzd();
        zzgdrVarZzd.zze(i2);
        return (zzgds) zzgdrVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgkg
    public final com.google.common.util.concurrent.Xo zza() {
        int i2;
        zzbcc zzbccVarZza = zzbcd.zza();
        byte[] bArrZza = zzatu.zza();
        zzian zzianVar = zzian.zza;
        zzbccVarZza.zza(zzian.zzs(bArrZza, 0, bArrZza.length));
        zzbccVarZza.zzb(Build.VERSION.SDK_INT);
        zzbccVarZza.zzc(Build.MODEL);
        Context context = this.zza;
        zzbccVarZza.zzd(context.getPackageName());
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i2 = -1;
        }
        zzgce zzgceVar = this.zzc;
        zzgoe zzgoeVar = this.zzf;
        zzbccVarZza.zze(i2);
        zzbccVarZza.zzf(this.zzd);
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk(zzgzg.zzw(zzgceVar.zza(Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", zzgca.zza(((zzbcd) zzbccVarZza.zzbu()).zzaN(), true)).build().toString())), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkr
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb((zzgcd) obj);
            }
        }, this.zzb), UnknownHostException.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkp
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((UnknownHostException) obj);
            }
        }, zzhaf.zza()), SocketException.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((SocketException) obj);
            }
        }, zzhaf.zza());
        zzgoeVar.zze(20002, zzgzgVar);
        return zzgzgVar;
    }

    final /* synthetic */ zzgds zzb(zzgcd zzgcdVar) {
        if (zzgcdVar.zza() != 200) {
            this.zzf.zzc(20003, new String(zzatu.zza(), StandardCharsets.UTF_8));
            return zze(7);
        }
        try {
            String strZzb = zzgcdVar.zzb();
            if (TextUtils.isEmpty(strZzb)) {
                this.zzf.zzb(20004);
                return zze(8);
            }
            zzbcf zzbcfVarZzb = zzbcf.zzb(zzgca.zzb(strZzb, true), zzibb.zzb());
            if (zzbcfVarZzb.zza().zzc() && zzbcfVarZzb.zza().zza()) {
                if (!this.zzg.zza(zzbcfVarZzb)) {
                    this.zzf.zzb(20006);
                    return zze(12);
                }
                zzgdr zzgdrVarZzd = zzgds.zzd();
                zzgdt zzgdtVarZze = zzgdu.zze();
                zzgdtVarZze.zzb(zzbcfVarZzb.zza().zzb());
                zzgdrVarZzd.zzb(zzgdtVarZze);
                zzgdrVarZzd.zzc(zzbcfVarZzb.zza().zzd());
                zzgdrVarZzd.zze(2);
                return (zzgds) zzgdrVarZzd.zzbu();
            }
            this.zzf.zzb(20004);
            return zze(8);
        } catch (Throwable th) {
            this.zzf.zzd(20005, th);
            return zze(6);
        }
    }
}
