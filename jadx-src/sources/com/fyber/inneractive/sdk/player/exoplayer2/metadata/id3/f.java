package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f extends o {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f55826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o[] f55827g;

    public f(String str, int i2, int i3, long j2, long j3, o[] oVarArr) {
        super("CHAP");
        this.f55822b = str;
        this.f55823c = i2;
        this.f55824d = i3;
        this.f55825e = j2;
        this.f55826f = j3;
        this.f55827g = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f55823c == fVar.f55823c && this.f55824d == fVar.f55824d && this.f55825e == fVar.f55825e && this.f55826f == fVar.f55826f && z.a(this.f55822b, fVar.f55822b) && Arrays.equals(this.f55827g, fVar.f55827g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (((((((this.f55823c + 527) * 31) + this.f55824d) * 31) + ((int) this.f55825e)) * 31) + ((int) this.f55826f)) * 31;
        String str = this.f55822b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55822b);
        parcel.writeInt(this.f55823c);
        parcel.writeInt(this.f55824d);
        parcel.writeLong(this.f55825e);
        parcel.writeLong(this.f55826f);
        parcel.writeInt(this.f55827g.length);
        for (o oVar : this.f55827g) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public f(Parcel parcel) {
        super("CHAP");
        this.f55822b = parcel.readString();
        this.f55823c = parcel.readInt();
        this.f55824d = parcel.readInt();
        this.f55825e = parcel.readLong();
        this.f55826f = parcel.readLong();
        int i2 = parcel.readInt();
        this.f55827g = new o[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f55827g[i3] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
