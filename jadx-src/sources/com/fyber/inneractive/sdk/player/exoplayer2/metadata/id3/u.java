package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class u extends o {
    public static final Parcelable.Creator<u> CREATOR = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55851c;

    public u(String str, String str2, String str3) {
        super(str);
        this.f55850b = str2;
        this.f55851c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f55845a.equals(uVar.f55845a) && z.a(this.f55850b, uVar.f55850b) && z.a(this.f55851c, uVar.f55851c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f55845a.hashCode() + 527) * 31;
        String str = this.f55850b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55851c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55845a);
        parcel.writeString(this.f55850b);
        parcel.writeString(this.f55851c);
    }

    public u(Parcel parcel) {
        super(parcel.readString());
        this.f55850b = parcel.readString();
        this.f55851c = parcel.readString();
    }
}
