package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class q extends o {
    public static final Parcelable.Creator<q> CREATOR = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f55847c;

    public q(String str, byte[] bArr) {
        super("PRIV");
        this.f55846b = str;
        this.f55847c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (z.a(this.f55846b, qVar.f55846b) && Arrays.equals(this.f55847c, qVar.f55847c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55846b;
        return Arrays.hashCode(this.f55847c) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f55846b);
        parcel.writeByteArray(this.f55847c);
    }

    public q(Parcel parcel) {
        super("PRIV");
        this.f55846b = parcel.readString();
        this.f55847c = parcel.createByteArray();
    }
}
