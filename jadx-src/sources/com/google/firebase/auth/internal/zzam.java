package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "DefaultMultiFactorSessionCreator")
public final class zzam extends MultiFactorSession {
    public static final Parcelable.Creator<zzam> CREATOR = new n();
    public List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public List f60198O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f60199n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public zzaf f60200r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f60201t;

    public zzam() {
    }

    public zzam(String str, String str2, List list, List list2, zzaf zzafVar) {
        this.f60199n = str;
        this.f60201t = str2;
        this.f60198O = list;
        this.J2 = list2;
        this.f60200r = zzafVar;
    }

    public final String zzb() {
        return this.f60199n;
    }

    public final String zzc() {
        return this.f60201t;
    }

    public final boolean zzd() {
        return this.f60199n != null;
    }

    public static zzam T3L(List list, String str) {
        Preconditions.checkNotNull(list);
        Preconditions.checkNotEmpty(str);
        zzam zzamVar = new zzam();
        zzamVar.f60198O = new ArrayList();
        zzamVar.J2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzamVar.f60198O.add((PhoneMultiFactorInfo) multiFactorInfo);
            } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                zzamVar.J2.add((TotpMultiFactorInfo) multiFactorInfo);
            } else {
                throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + multiFactorInfo.Bu());
            }
        }
        zzamVar.f60201t = str;
        return zzamVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f60199n, false);
        SafeParcelWriter.writeString(parcel, 2, this.f60201t, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f60198O, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.J2, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f60200r, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
