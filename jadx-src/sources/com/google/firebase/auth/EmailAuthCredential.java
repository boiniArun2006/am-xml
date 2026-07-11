package com.google.firebase.auth;

import ScC.FuwU.XIvb;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@SafeParcelable.Class(creator = "EmailAuthCredentialCreator")
public class EmailAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new rv6();
    private String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f60089O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f60090n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f60091r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f60092t;

    EmailAuthCredential(String str, String str2) {
        this(str, str2, null, null, false);
    }

    EmailAuthCredential(String str, String str2, String str3, String str4, boolean z2) {
        this.f60090n = Preconditions.checkNotEmpty(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f60092t = str2;
        this.f60089O = str3;
        this.J2 = str4;
        this.f60091r = z2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String Bu() {
        return !TextUtils.isEmpty(this.f60092t) ? XIvb.bXDDzUL : "emailLink";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String T3L() {
        return "password";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential p0N() {
        return new EmailAuthCredential(this.f60090n, this.f60092t, this.f60089O, this.J2, this.f60091r);
    }

    public final boolean ub() {
        return !TextUtils.isEmpty(this.f60089O);
    }

    public final String zzb() {
        return this.J2;
    }

    public final String zzc() {
        return this.f60090n;
    }

    public final String zzd() {
        return this.f60092t;
    }

    public final String zze() {
        return this.f60089O;
    }

    public final boolean zzg() {
        return this.f60091r;
    }

    public static boolean f(String str) {
        Ml mlT;
        if (TextUtils.isEmpty(str) || (mlT = Ml.t(str)) == null || mlT.rl() != 4) {
            return false;
        }
        return true;
    }

    public final EmailAuthCredential Uf(FirebaseUser firebaseUser) {
        this.J2 = firebaseUser.zze();
        this.f60091r = true;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f60090n, false);
        SafeParcelWriter.writeString(parcel, 2, this.f60092t, false);
        SafeParcelWriter.writeString(parcel, 3, this.f60089O, false);
        SafeParcelWriter.writeString(parcel, 4, this.J2, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f60091r);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
