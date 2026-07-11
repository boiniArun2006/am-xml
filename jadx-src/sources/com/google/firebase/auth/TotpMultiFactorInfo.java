package com.google.firebase.auth;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "TotpMultiFactorInfoCreator")
public class TotpMultiFactorInfo extends MultiFactorInfo {

    @NonNull
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new u();
    private final zzair J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f60141O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60142n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60143t;

    public static TotpMultiFactorInfo Uf(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt(pTYaLzzmJSGAPQ.DBW) == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new TotpMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzair());
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String Bu() {
        return "totp";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public long T3L() {
        return this.f60141O;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getDisplayName() {
        return this.f60143t;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String p0N() {
        return this.f60142n;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f60142n);
            jSONObject.putOpt("displayName", this.f60143t);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f60141O));
            jSONObject.putOpt("totpInfo", this.J2);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e2);
        }
    }

    public TotpMultiFactorInfo(String str, String str2, long j2, zzair zzairVar) {
        this.f60142n = Preconditions.checkNotEmpty(str);
        this.f60143t = str2;
        this.f60141O = j2;
        this.J2 = (zzair) Preconditions.checkNotNull(zzairVar, "totpInfo cannot be null.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, p0N(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeLong(parcel, 3, T3L());
        SafeParcelWriter.writeParcelable(parcel, 4, this.J2, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
