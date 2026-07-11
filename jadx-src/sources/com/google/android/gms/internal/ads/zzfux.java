package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfux extends zzfus {
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzful zzfulVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfud.zzg(jSONObject, zzfulVar.zzd())) {
            return null;
        }
        zzfulVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfut, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    public zzfux(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(zzfulVar, hashSet, jSONObject, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfut
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfth zzfthVarZza;
        if (!TextUtils.isEmpty(str) && (zzfthVarZza = zzfth.zza()) != null) {
            for (zzfsn zzfsnVar : zzfthVarZza.zze()) {
                if (((zzfus) this).zza.contains(zzfsnVar.zzh())) {
                    zzfsnVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
