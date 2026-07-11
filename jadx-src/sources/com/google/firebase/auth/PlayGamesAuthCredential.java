package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@SafeParcelable.Class(creator = "PlayGamesAuthCredentialCreator")
public class PlayGamesAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new DAz();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60135n;

    @Override // com.google.firebase.auth.AuthCredential
    public String Bu() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String T3L() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential p0N() {
        return new PlayGamesAuthCredential(this.f60135n);
    }

    PlayGamesAuthCredential(String str) {
        this.f60135n = Preconditions.checkNotEmpty(str);
    }

    public static zzait Uf(PlayGamesAuthCredential playGamesAuthCredential, String str) {
        Preconditions.checkNotNull(playGamesAuthCredential);
        return new zzait(null, null, playGamesAuthCredential.T3L(), null, null, playGamesAuthCredential.f60135n, str, null, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f60135n, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
