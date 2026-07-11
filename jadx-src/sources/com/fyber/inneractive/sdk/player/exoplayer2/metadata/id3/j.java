package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j extends o {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55835d;

    public j(String str, String str2, String str3) {
        super("COMM");
        this.f55833b = str;
        this.f55834c = str2;
        this.f55835d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (z.a(this.f55834c, jVar.f55834c) && z.a(this.f55833b, jVar.f55833b) && z.a(this.f55835d, jVar.f55835d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55833b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f55834c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55835d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55845a);
        parcel.writeString(this.f55833b);
        parcel.writeString(this.f55835d);
    }

    public j(Parcel parcel) {
        super("COMM");
        this.f55833b = parcel.readString();
        this.f55834c = parcel.readString();
        this.f55835d = parcel.readString();
    }
}
