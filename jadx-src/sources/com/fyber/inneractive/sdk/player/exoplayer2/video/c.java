package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f56269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56270e;

    public c(int i2, int i3, int i5, byte[] bArr) {
        this.f56266a = i2;
        this.f56267b = i3;
        this.f56268c = i5;
        this.f56269d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f56266a == cVar.f56266a && this.f56267b == cVar.f56267b && this.f56268c == cVar.f56268c && Arrays.equals(this.f56269d, cVar.f56269d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f56270e == 0) {
            this.f56270e = Arrays.hashCode(this.f56269d) + ((((((this.f56266a + 527) * 31) + this.f56267b) * 31) + this.f56268c) * 31);
        }
        return this.f56270e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f56266a);
        sb.append(", ");
        sb.append(this.f56267b);
        sb.append(", ");
        sb.append(this.f56268c);
        sb.append(", ");
        sb.append(this.f56269d != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f56266a);
        parcel.writeInt(this.f56267b);
        parcel.writeInt(this.f56268c);
        parcel.writeInt(this.f56269d != null ? 1 : 0);
        byte[] bArr = this.f56269d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public c(Parcel parcel) {
        this.f56266a = parcel.readInt();
        this.f56267b = parcel.readInt();
        this.f56268c = parcel.readInt();
        this.f56269d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
