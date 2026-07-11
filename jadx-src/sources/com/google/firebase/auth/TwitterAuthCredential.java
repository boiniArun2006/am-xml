package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@SafeParcelable.Class(creator = "TwitterAuthCredentialCreator")
public class TwitterAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new qf();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f60144n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f60145t;

    @Override // com.google.firebase.auth.AuthCredential
    public String Bu() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String T3L() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential p0N() {
        return new TwitterAuthCredential(this.f60144n, this.f60145t);
    }

    TwitterAuthCredential(String str, String str2) {
        this.f60144n = Preconditions.checkNotEmpty(str);
        this.f60145t = Preconditions.checkNotEmpty(str2);
    }

    public static zzait Uf(TwitterAuthCredential twitterAuthCredential, String str) {
        Preconditions.checkNotNull(twitterAuthCredential);
        return new zzait(null, twitterAuthCredential.f60144n, twitterAuthCredential.T3L(), null, twitterAuthCredential.f60145t, null, str, null, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f60144n, false);
        SafeParcelWriter.writeString(parcel, 2, this.f60145t, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
