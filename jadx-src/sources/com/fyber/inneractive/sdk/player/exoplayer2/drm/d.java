package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d implements Comparator, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f54714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54716c;

    public d(boolean z2, c... cVarArr) {
        cVarArr = z2 ? (c[]) cVarArr.clone() : cVarArr;
        Arrays.sort(cVarArr, this);
        for (int i2 = 1; i2 < cVarArr.length; i2++) {
            if (cVarArr[i2 - 1].f54710b.equals(cVarArr[i2].f54710b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + cVarArr[i2].f54710b);
            }
        }
        this.f54714a = cVarArr;
        this.f54716c = cVarArr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.b.f54689b;
        return uuid.equals(cVar.f54710b) ? uuid.equals(cVar2.f54710b) ? 0 : 1 : cVar.f54710b.compareTo(cVar2.f54710b);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f54714a, ((d) obj).f54714a);
    }

    public final int hashCode() {
        if (this.f54715b == 0) {
            this.f54715b = Arrays.hashCode(this.f54714a);
        }
        return this.f54715b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedArray(this.f54714a, 0);
    }

    public d(Parcel parcel) {
        c[] cVarArr = (c[]) parcel.createTypedArray(c.CREATOR);
        this.f54714a = cVarArr;
        this.f54716c = cVarArr.length;
    }
}
