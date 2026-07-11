package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "DefaultOAuthCredentialCreator")
public class zzc extends OAuthCredential {
    public static final Parcelable.Creator<zzc> CREATOR = new M();
    private final zzait J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f60230O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final String f60231Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f60233o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f60234r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60235t;

    public static zzc Qu(String str, String str2, String str3, String str4, String str5) {
        Preconditions.checkNotEmpty(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zzc(str, str2, str3, null, str4, str5, null);
    }

    public static zzc ub(zzait zzaitVar) {
        Preconditions.checkNotNull(zzaitVar, "Must specify a non-null webSignInCredential");
        return new zzc(null, null, null, zzaitVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String Bu() {
        return this.f60232n;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String T3L() {
        return this.f60232n;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    public String Uf() {
        return this.f60233o;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    public String getAccessToken() {
        return this.f60230O;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    public String getIdToken() {
        return this.f60235t;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential p0N() {
        return new zzc(this.f60232n, this.f60235t, this.f60230O, this.J2, this.f60234r, this.f60233o, this.f60231Z);
    }

    zzc(String str, String str2, String str3, zzait zzaitVar, String str4, String str5, String str6) {
        this.f60232n = com.google.android.gms.internal.p002firebaseauthapi.zzae.zzb(str);
        this.f60235t = str2;
        this.f60230O = str3;
        this.J2 = zzaitVar;
        this.f60234r = str4;
        this.f60233o = str5;
        this.f60231Z = str6;
    }

    public static zzait f(zzc zzcVar, String str) {
        Preconditions.checkNotNull(zzcVar);
        zzait zzaitVar = zzcVar.J2;
        if (zzaitVar != null) {
            return zzaitVar;
        }
        return new zzait(zzcVar.getIdToken(), zzcVar.getAccessToken(), zzcVar.T3L(), null, zzcVar.Uf(), null, str, zzcVar.f60234r, zzcVar.f60231Z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, T3L(), false);
        SafeParcelWriter.writeString(parcel, 2, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 3, getAccessToken(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.J2, i2, false);
        SafeParcelWriter.writeString(parcel, 5, this.f60234r, false);
        SafeParcelWriter.writeString(parcel, 6, Uf(), false);
        SafeParcelWriter.writeString(parcel, 7, this.f60231Z, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
