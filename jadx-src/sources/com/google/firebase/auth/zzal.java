package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.internal.p002firebaseauthapi.zzam;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "PasskeyInfoCreator")
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new afx();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f60227O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60228n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60229t;

    public static final zzal Bu(JSONObject jSONObject) {
        return new zzal(jSONObject.getString("credentialId"), jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), jSONObject.getString("displayName"));
    }

    public static zzaj T3L(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaj.zza(new ArrayList());
        }
        zzam zzamVarZzg = zzaj.zzg();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            zzamVarZzg.zza(new zzal(jSONObject.getString("credentialId"), jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), jSONObject.getString("displayName")));
        }
        return zzamVarZzg.zza();
    }

    public static final JSONObject p0N(zzal zzalVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", zzalVar.f60228n);
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzalVar.f60229t);
        jSONObject.put("displayName", zzalVar.f60227O);
        return jSONObject;
    }

    zzal(String str, String str2, String str3) {
        this.f60228n = str;
        this.f60229t = str2;
        this.f60227O = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f60228n, false);
        SafeParcelWriter.writeString(parcel, 2, this.f60229t, false);
        SafeParcelWriter.writeString(parcel, 3, this.f60227O, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
