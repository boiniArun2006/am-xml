package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzahq {

    @Nullable
    private final String zza;

    @NonNull
    private final String zzb;

    @Nullable
    private final String zzc;
    private final long zzd;

    @Nullable
    private final zzair zze;

    private static long zza(String str) {
        try {
            return zzaoe.zza(zzaoe.zza(str));
        } catch (ParseException e2) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e2);
            return 0L;
        }
    }

    @Nullable
    public final zzair zzb() {
        return this.zze;
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    @Nullable
    public final String zze() {
        return this.zza;
    }

    private zzahq(@Nullable String str, @Nullable String str2, @Nullable String str3, long j2, @Nullable zzair zzairVar) {
        if (!TextUtils.isEmpty(str) && zzairVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
        this.zzd = j2;
        this.zze = zzairVar;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzahq zza(@NonNull JSONObject jSONObject) {
        zzahq zzahqVar = new zzahq(Strings.emptyToNull(jSONObject.optString("phoneInfo")), Strings.emptyToNull(jSONObject.optString("mfaEnrollmentId")), Strings.emptyToNull(jSONObject.optString("displayName")), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzair() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahqVar;
    }

    public static List<zzahq> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(zza(jSONArray.getJSONObject(i2)));
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
