package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d extends o {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f55821b;

    public d(String str, byte[] bArr) {
        super(str);
        this.f55821b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55845a.equals(dVar.f55845a) && Arrays.equals(this.f55821b, dVar.f55821b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55821b) + ((this.f55845a.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55845a);
        parcel.writeByteArray(this.f55821b);
    }

    public d(Parcel parcel) {
        super(parcel.readString());
        this.f55821b = parcel.createByteArray();
    }
}
