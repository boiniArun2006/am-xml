package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@SafeParcelable.Class(creator = "PhoneAuthCredentialCreator")
public class PhoneAuthCredential extends AuthCredential implements Cloneable {

    @NonNull
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new Z();
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f60122O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f60123n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f60124r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f60125t;

    public final PhoneAuthCredential ub(boolean z2) {
        this.J2 = false;
        return this;
    }

    public static PhoneAuthCredential Qu(String str, String str2) {
        return new PhoneAuthCredential(null, null, str, true, str2);
    }

    public static PhoneAuthCredential f(String str, String str2) {
        return new PhoneAuthCredential(str, str2, null, true, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String Bu() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String T3L() {
        return "phone";
    }

    public String Uf() {
        return this.f60125t;
    }

    public /* synthetic */ Object clone() {
        return new PhoneAuthCredential(this.f60123n, Uf(), this.f60122O, this.J2, this.f60124r);
    }

    public final String zzb() {
        return this.f60122O;
    }

    public final String zzc() {
        return this.f60123n;
    }

    public final String zzd() {
        return this.f60124r;
    }

    public final boolean zze() {
        return this.J2;
    }

    PhoneAuthCredential(String str, String str2, String str3, boolean z2, String str4) {
        boolean z3;
        if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f60123n = str;
        this.f60125t = str2;
        this.f60122O = str3;
        this.J2 = z2;
        this.f60124r = str4;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential p0N() {
        return (PhoneAuthCredential) clone();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f60123n, false);
        SafeParcelWriter.writeString(parcel, 2, Uf(), false);
        SafeParcelWriter.writeString(parcel, 4, this.f60122O, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.J2);
        SafeParcelWriter.writeString(parcel, 6, this.f60124r, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
