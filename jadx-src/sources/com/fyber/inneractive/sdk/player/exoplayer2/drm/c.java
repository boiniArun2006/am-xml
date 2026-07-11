package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f54710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f54712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54713e;

    public c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f54710b = uuid;
        this.f54711c = str;
        bArr.getClass();
        this.f54712d = bArr;
        this.f54713e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        return this.f54711c.equals(cVar.f54711c) && z.a(this.f54710b, cVar.f54710b) && Arrays.equals(this.f54712d, cVar.f54712d);
    }

    public final int hashCode() {
        if (this.f54709a == 0) {
            this.f54709a = Arrays.hashCode(this.f54712d) + ((this.f54711c.hashCode() + (this.f54710b.hashCode() * 31)) * 31);
        }
        return this.f54709a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f54710b.getMostSignificantBits());
        parcel.writeLong(this.f54710b.getLeastSignificantBits());
        parcel.writeString(this.f54711c);
        parcel.writeByteArray(this.f54712d);
        parcel.writeByte(this.f54713e ? (byte) 1 : (byte) 0);
    }

    public c(Parcel parcel) {
        this.f54710b = new UUID(parcel.readLong(), parcel.readLong());
        this.f54711c = parcel.readString();
        this.f54712d = parcel.createByteArray();
        this.f54713e = parcel.readByte() != 0;
    }
}
