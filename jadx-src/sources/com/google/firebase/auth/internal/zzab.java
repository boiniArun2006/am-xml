package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzahc;
import com.google.android.gms.internal.p002firebaseauthapi.zzaht;
import com.google.firebase.auth.QJ;
import oW.C2309Ml;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "DefaultAuthUserInfoCreator")
public final class zzab extends AbstractSafeParcelable implements QJ {
    public static final Parcelable.Creator<zzab> CREATOR = new C2309Ml();
    public String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f60172O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f60173S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f60174Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f60175g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f60176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f60177o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Uri f60178r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f60179t;

    public zzab(zzaht zzahtVar) {
        Preconditions.checkNotNull(zzahtVar);
        this.f60176n = zzahtVar.zzd();
        this.f60179t = Preconditions.checkNotEmpty(zzahtVar.zzf());
        this.f60172O = zzahtVar.zzb();
        Uri uriZza = zzahtVar.zza();
        if (uriZza != null) {
            this.J2 = uriZza.toString();
            this.f60178r = uriZza;
        }
        this.f60177o = zzahtVar.zzc();
        this.f60174Z = zzahtVar.zze();
        this.f60173S = false;
        this.f60175g = zzahtVar.zzg();
    }

    public static zzab Bu(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzab(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString(Scopes.EMAIL), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaag(e2);
        }
    }

    public final String T3L() {
        return this.f60176n;
    }

    public final String getDisplayName() {
        return this.f60172O;
    }

    @Override // com.google.firebase.auth.QJ
    public final String getEmail() {
        return this.f60177o;
    }

    public final String getPhoneNumber() {
        return this.f60174Z;
    }

    public final Uri getPhotoUrl() {
        if (!TextUtils.isEmpty(this.J2) && this.f60178r == null) {
            this.f60178r = Uri.parse(this.J2);
        }
        return this.f60178r;
    }

    @Override // com.google.firebase.auth.QJ
    public final String n1() {
        return this.f60179t;
    }

    @Override // com.google.firebase.auth.QJ
    public final boolean rl() {
        return this.f60173S;
    }

    public final String zza() {
        return this.f60175g;
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f60176n);
            jSONObject.putOpt("providerId", this.f60179t);
            jSONObject.putOpt("displayName", this.f60172O);
            jSONObject.putOpt("photoUrl", this.J2);
            jSONObject.putOpt(Scopes.EMAIL, this.f60177o);
            jSONObject.putOpt("phoneNumber", this.f60174Z);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f60173S));
            jSONObject.putOpt("rawUserInfo", this.f60175g);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d(FijIa.JipSFFs, "Failed to jsonify this object");
            throw new zzaag(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, T3L(), false);
        SafeParcelWriter.writeString(parcel, 2, n1(), false);
        SafeParcelWriter.writeString(parcel, 3, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel, 4, this.J2, false);
        SafeParcelWriter.writeString(parcel, 5, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 6, getPhoneNumber(), false);
        SafeParcelWriter.writeBoolean(parcel, 7, rl());
        SafeParcelWriter.writeString(parcel, 8, this.f60175g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzab(zzahc zzahcVar, String str) {
        Preconditions.checkNotNull(zzahcVar);
        Preconditions.checkNotEmpty(str);
        this.f60176n = Preconditions.checkNotEmpty(zzahcVar.zzi());
        this.f60179t = str;
        this.f60177o = zzahcVar.zzh();
        this.f60172O = zzahcVar.zzg();
        Uri uriZzc = zzahcVar.zzc();
        if (uriZzc != null) {
            this.J2 = uriZzc.toString();
            this.f60178r = uriZzc;
        }
        this.f60173S = zzahcVar.zzm();
        this.f60175g = null;
        this.f60174Z = zzahcVar.zzj();
    }

    public zzab(String str, String str2, String str3, String str4, String str5, String str6, boolean z2, String str7) {
        this.f60176n = str;
        this.f60179t = str2;
        this.f60177o = str3;
        this.f60174Z = str4;
        this.f60172O = str5;
        this.J2 = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f60178r = Uri.parse(this.J2);
        }
        this.f60173S = z2;
        this.f60175g = str7;
    }
}
