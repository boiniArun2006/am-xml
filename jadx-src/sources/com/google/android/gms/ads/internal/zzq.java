package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zza.zzN();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzs zzsVar = this.zza;
        String str = (String) obj;
        if (zzsVar.zzW() == null || str == null) {
            return;
        }
        AdMobNetworkBridge.webviewLoadUrl(zzsVar.zzW(), str);
    }

    /* synthetic */ zzq(zzs zzsVar, byte[] bArr) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }
}
