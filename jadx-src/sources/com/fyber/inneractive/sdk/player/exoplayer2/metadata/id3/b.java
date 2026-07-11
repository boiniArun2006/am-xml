package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b extends o {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f55820e;

    public b(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f55817b = str;
        this.f55818c = str2;
        this.f55819d = i2;
        this.f55820e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f55819d == bVar.f55819d && z.a(this.f55817b, bVar.f55817b) && z.a(this.f55818c, bVar.f55818c) && Arrays.equals(this.f55820e, bVar.f55820e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f55819d + 527) * 31;
        String str = this.f55817b;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55818c;
        return Arrays.hashCode(this.f55820e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55817b);
        parcel.writeString(this.f55818c);
        parcel.writeInt(this.f55819d);
        parcel.writeByteArray(this.f55820e);
    }

    public b(Parcel parcel) {
        super("APIC");
        this.f55817b = parcel.readString();
        this.f55818c = parcel.readString();
        this.f55819d = parcel.readInt();
        this.f55820e = parcel.createByteArray();
    }
}
