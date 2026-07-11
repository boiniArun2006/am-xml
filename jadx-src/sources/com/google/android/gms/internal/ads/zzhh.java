package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzhh implements zzhb {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzhb zzc;

    @Nullable
    private zzhb zzd;

    @Nullable
    private zzhb zze;

    @Nullable
    private zzhb zzf;

    @Nullable
    private zzhb zzg;

    @Nullable
    private zzhb zzh;

    @Nullable
    private zzhb zzi;

    @Nullable
    private zzhb zzj;

    @Nullable
    private zzhb zzk;

    private final void zzg(zzhb zzhbVar) {
        int i2 = 0;
        while (true) {
            List list = this.zzb;
            if (i2 >= list.size()) {
                return;
            }
            zzhbVar.zze((zzhz) list.get(i2));
            i2++;
        }
    }

    private final zzhb zzf() {
        if (this.zze == null) {
            zzgs zzgsVar = new zzgs(this.zza);
            this.zze = zzgsVar;
            zzg(zzgsVar);
        }
        return this.zze;
    }

    private static final void zzh(@Nullable zzhb zzhbVar, zzhz zzhzVar) {
        if (zzhbVar != null) {
            zzhbVar.zze(zzhzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        zzhb zzhbVar = this.zzk;
        zzhbVar.getClass();
        return zzhbVar.zza(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        zzhb zzhbVar;
        zzgrc.zzi(this.zzk == null);
        Uri uri = zzhfVar.zza;
        String scheme = uri.getScheme();
        String str = zzfj.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, FileUploadManager.f61570h)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzho zzhoVar = new zzho();
                    this.zzd = zzhoVar;
                    zzg(zzhoVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzf();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzf();
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            if (this.zzf == null) {
                zzgy zzgyVar = new zzgy(this.zza);
                this.zzf = zzgyVar;
                zzg(zzgyVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzhb zzhbVar2 = (zzhb) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzhbVar2;
                    zzg(zzhbVar2);
                } catch (ClassNotFoundException unused) {
                    zzee.zzc("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating RTMP extension", e2);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzib zzibVar = new zzib(2000);
                this.zzh = zzibVar;
                zzg(zzibVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzgz zzgzVar = new zzgz();
                this.zzi = zzgzVar;
                zzg(zzgzVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzhx zzhxVar = new zzhx(this.zza);
                    this.zzj = zzhxVar;
                    zzg(zzhxVar);
                }
                zzhbVar = this.zzj;
            } else {
                zzhbVar = this.zzc;
            }
            this.zzk = zzhbVar;
        }
        return this.zzk.zzb(zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar == null) {
            return null;
        }
        return zzhbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar != null) {
            try {
                zzhbVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        zzhb zzhbVar = this.zzk;
        return zzhbVar == null ? Collections.EMPTY_MAP : zzhbVar.zzj();
    }

    public zzhh(Context context, zzhb zzhbVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zzc.zze(zzhzVar);
        this.zzb.add(zzhzVar);
        zzh(this.zzd, zzhzVar);
        zzh(this.zze, zzhzVar);
        zzh(this.zzf, zzhzVar);
        zzh(this.zzg, zzhzVar);
        zzh(this.zzh, zzhzVar);
        zzh(this.zzi, zzhzVar);
        zzh(this.zzj, zzhzVar);
    }
}
