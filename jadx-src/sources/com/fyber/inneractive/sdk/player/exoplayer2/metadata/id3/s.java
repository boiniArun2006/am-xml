package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class s extends o {
    public static final Parcelable.Creator<s> CREATOR = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55849c;

    public s(String str, String str2, String str3) {
        super(str);
        this.f55848b = str2;
        this.f55849c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f55845a.equals(sVar.f55845a) && z.a(this.f55848b, sVar.f55848b) && z.a(this.f55849c, sVar.f55849c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f55845a.hashCode() + 527) * 31;
        String str = this.f55848b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55849c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55845a);
        parcel.writeString(this.f55848b);
        parcel.writeString(this.f55849c);
    }

    public s(Parcel parcel) {
        super(parcel.readString());
        this.f55848b = parcel.readString();
        this.f55849c = parcel.readString();
    }
}
