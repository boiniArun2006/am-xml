package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaaj;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.List;
import oW.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "DefaultMultiFactorResolverCreator")
public final class zzal extends MultiFactorResolver {
    public static final Parcelable.Creator<zzal> CREATOR = new Dsr();
    public final zzc J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f60193O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f60194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f60195o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zzaf f60196r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzam f60197t;

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final MultiFactorSession T3L() {
        return this.f60197t;
    }

    public zzal(List list, zzam zzamVar, String str, zzc zzcVar, zzaf zzafVar, List list2) {
        this.f60194n = (List) Preconditions.checkNotNull(list);
        this.f60197t = (zzam) Preconditions.checkNotNull(zzamVar);
        this.f60193O = Preconditions.checkNotEmpty(str);
        this.J2 = zzcVar;
        this.f60196r = zzafVar;
        this.f60195o = (List) Preconditions.checkNotNull(list2);
    }

    public static zzal Bu(zzaaj zzaajVar, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        List<MultiFactorInfo> listZzc = zzaajVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : listZzc) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        List<MultiFactorInfo> listZzc2 = zzaajVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (MultiFactorInfo multiFactorInfo2 : listZzc2) {
            if (multiFactorInfo2 instanceof TotpMultiFactorInfo) {
                arrayList2.add((TotpMultiFactorInfo) multiFactorInfo2);
            }
        }
        return new zzal(arrayList, zzam.T3L(zzaajVar.zzc(), zzaajVar.zzb()), firebaseAuth.KN().HI(), zzaajVar.zza(), (zzaf) firebaseUser, arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f60194n, false);
        SafeParcelWriter.writeParcelable(parcel, 2, T3L(), i2, false);
        SafeParcelWriter.writeString(parcel, 3, this.f60193O, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.J2, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f60196r, i2, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.f60195o, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
