package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.caoccao.javet.values.primitive.V8ValueNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class LoadAdError extends AdError {

    @Nullable
    private final ResponseInfo zza;

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    public LoadAdError(int i2, @NonNull String str, @NonNull String str2, @Nullable AdError adError, @Nullable ResponseInfo responseInfo) {
        super(i2, str, str2, adError);
        this.zza = responseInfo;
    }

    @Override // com.google.android.gms.ads.AdError
    @NonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    @NonNull
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObjectZzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            jSONObjectZzb.put("Response Info", V8ValueNull.NULL);
            return jSONObjectZzb;
        }
        jSONObjectZzb.put("Response Info", responseInfo.zza());
        return jSONObjectZzb;
    }
}
