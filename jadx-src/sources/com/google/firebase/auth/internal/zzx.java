package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;
import oW.QaP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "DefaultAdditionalUserInfoCreator")
public final class zzx implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzx> CREATOR = new QaP();
    public boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Map f60204O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f60205n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f60206t;

    public zzx(boolean z2) {
        this.J2 = z2;
        this.f60206t = null;
        this.f60205n = null;
        this.f60204O = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final boolean M7() {
        return this.J2;
    }

    public final String n() {
        return this.f60205n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, n(), false);
        SafeParcelWriter.writeString(parcel, 2, this.f60206t, false);
        SafeParcelWriter.writeBoolean(parcel, 3, M7());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzx(String str, String str2, boolean z2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.f60205n = str;
        this.f60206t = str2;
        this.f60204O = Ml.nr(str2);
        this.J2 = z2;
    }
}
