package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfyj extends zzfxx {
    private zzgru<Integer> zza;
    private zzgru<Integer> zzb;

    @Nullable
    private zzfxz zzc;

    @Nullable
    private HttpURLConnection zzd;

    zzfyj(zzgru<Integer> zzgruVar, zzgru<Integer> zzgruVar2, @Nullable zzfxz zzfxzVar) {
        this.zza = zzgruVar;
        this.zzb = zzgruVar2;
        this.zzc = zzfxzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    zzfyj() {
        this(zzfyi.zza, zzfya.zza, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ URLConnection zzy(URL url) throws IOException {
        int i2 = zzfxs.zzb;
        return url.openConnection();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(@NonNull final URL url, final int i2) throws IOException {
        this.zza = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfyb
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = new zzfxz() { // from class: com.google.android.gms.internal.ads.zzfyc
            @Override // com.google.android.gms.internal.ads.zzfxz
            public final /* synthetic */ URLConnection zza() {
                return zzfyj.zzy(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(@NonNull final Network network, @NonNull final URL url, final int i2, final int i3) throws IOException {
        this.zza = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfyd
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzb = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfye
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i3);
            }
        };
        this.zzc = new zzfxz() { // from class: com.google.android.gms.internal.ads.zzfyf
            @Override // com.google.android.gms.internal.ads.zzfxz
            public final /* synthetic */ URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzfxz zzfxzVar, final int i2, final int i3) throws IOException {
        this.zza = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfyg
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzb = new zzgru() { // from class: com.google.android.gms.internal.ads.zzfyh
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i3);
            }
        };
        this.zzc = zzfxzVar;
        return zzj();
    }

    public HttpURLConnection zzj() throws IOException {
        zzfxy.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfxz zzfxzVar = this.zzc;
        zzfxzVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfxzVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public static void zzi(@Nullable HttpURLConnection httpURLConnection) {
        zzfxy.zzb();
        if (httpURLConnection != null) {
            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
        }
    }
}
