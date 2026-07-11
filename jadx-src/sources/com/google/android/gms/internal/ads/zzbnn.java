package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbnn implements zzboh {
    zzbnn() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(zzcjlVar.getContext()).edit();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                editorEdit.remove(jSONArray.getString(i2));
            }
            editorEdit.apply();
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "GMSG clear local storage keys handler");
        }
    }
}
