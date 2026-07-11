package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l extends o {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f55839e;

    public l(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f55836b = str;
        this.f55837c = str2;
        this.f55838d = str3;
        this.f55839e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (z.a(this.f55836b, lVar.f55836b) && z.a(this.f55837c, lVar.f55837c) && z.a(this.f55838d, lVar.f55838d) && Arrays.equals(this.f55839e, lVar.f55839e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55836b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f55837c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55838d;
        return Arrays.hashCode(this.f55839e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55836b);
        parcel.writeString(this.f55837c);
        parcel.writeString(this.f55838d);
        parcel.writeByteArray(this.f55839e);
    }

    public l(Parcel parcel) {
        super("GEOB");
        this.f55836b = parcel.readString();
        this.f55837c = parcel.readString();
        this.f55838d = parcel.readString();
        this.f55839e = parcel.createByteArray();
    }
}
