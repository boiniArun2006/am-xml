package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "DefaultFirebaseUserMetadataCreator")
public final class zzah implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzah> CREATOR = new oW.CN3();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f60191n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f60192t;

    public static zzah t(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new zzah(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long n() {
        return this.f60192t;
    }

    public final JSONObject nr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f60191n);
            jSONObject.put("creationTimestamp", this.f60192t);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final long rl() {
        return this.f60191n;
    }

    public zzah(long j2, long j3) {
        this.f60191n = j2;
        this.f60192t = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, rl());
        SafeParcelWriter.writeLong(parcel, 2, n());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
