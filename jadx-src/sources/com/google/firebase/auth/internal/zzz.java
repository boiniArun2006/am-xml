package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzc;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "DefaultAuthResultCreator")
public final class zzz implements AuthResult {
    public static final Parcelable.Creator<zzz> CREATOR = new fuX();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public zzc f60207O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zzaf f60208n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public zzx f60209t;

    public zzz(zzaf zzafVar) {
        zzaf zzafVar2 = (zzaf) Preconditions.checkNotNull(zzafVar);
        this.f60208n = zzafVar2;
        List listMh = zzafVar2.Mh();
        this.f60209t = null;
        for (int i2 = 0; i2 < listMh.size(); i2++) {
            if (!TextUtils.isEmpty(((zzab) listMh.get(i2)).zza())) {
                this.f60209t = new zzx(((zzab) listMh.get(i2)).n1(), ((zzab) listMh.get(i2)).zza(), zzafVar.jO());
            }
        }
        if (this.f60209t == null) {
            this.f60209t = new zzx(zzafVar.jO());
        }
        this.f60207O = zzafVar.Lp6();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final AuthCredential Org() {
        return this.f60207O;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final FirebaseUser U() {
        return this.f60208n;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final AdditionalUserInfo qm() {
        return this.f60209t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, U(), i2, false);
        SafeParcelWriter.writeParcelable(parcel, 2, qm(), i2, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f60207O, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzz(zzaf zzafVar, zzx zzxVar, zzc zzcVar) {
        this.f60208n = zzafVar;
        this.f60209t = zzxVar;
        this.f60207O = zzcVar;
    }
}
