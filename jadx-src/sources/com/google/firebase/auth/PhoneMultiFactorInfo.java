package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@SafeParcelable.Class(creator = "PhoneMultiFactorInfoCreator")
public class PhoneMultiFactorInfo extends MultiFactorInfo {

    @NonNull
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new nKK();
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f60126O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60127n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60128t;

    public static PhoneMultiFactorInfo Uf(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new PhoneMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String Bu() {
        return "phone";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public long T3L() {
        return this.f60126O;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getDisplayName() {
        return this.f60128t;
    }

    public String getPhoneNumber() {
        return this.J2;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String p0N() {
        return this.f60127n;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f60127n);
            jSONObject.putOpt("displayName", this.f60128t);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f60126O));
            jSONObject.putOpt("phoneNumber", this.J2);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e2);
        }
    }

    public PhoneMultiFactorInfo(String str, String str2, long j2, String str3) {
        this.f60127n = Preconditions.checkNotEmpty(str);
        this.f60128t = str2;
        this.f60126O = j2;
        this.J2 = Preconditions.checkNotEmpty(str3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, p0N(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeLong(parcel, 3, T3L());
        SafeParcelWriter.writeString(parcel, 4, getPhoneNumber(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
