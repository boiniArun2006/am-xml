package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h extends o {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f55831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o[] f55832f;

    public h(String str, boolean z2, boolean z3, String[] strArr, o[] oVarArr) {
        super("CTOC");
        this.f55828b = str;
        this.f55829c = z2;
        this.f55830d = z3;
        this.f55831e = strArr;
        this.f55832f = oVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f55829c == hVar.f55829c && this.f55830d == hVar.f55830d && z.a(this.f55828b, hVar.f55828b) && Arrays.equals(this.f55831e, hVar.f55831e) && Arrays.equals(this.f55832f, hVar.f55832f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((((this.f55829c ? 1 : 0) + 527) * 31) + (this.f55830d ? 1 : 0)) * 31;
        String str = this.f55828b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55828b);
        parcel.writeByte(this.f55829c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f55830d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f55831e);
        parcel.writeInt(this.f55832f.length);
        int i3 = 0;
        while (true) {
            o[] oVarArr = this.f55832f;
            if (i3 >= oVarArr.length) {
                return;
            }
            parcel.writeParcelable(oVarArr[i3], 0);
            i3++;
        }
    }

    public h(Parcel parcel) {
        super("CTOC");
        this.f55828b = parcel.readString();
        this.f55829c = parcel.readByte() != 0;
        this.f55830d = parcel.readByte() != 0;
        this.f55831e = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f55832f = new o[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f55832f[i3] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }
}
