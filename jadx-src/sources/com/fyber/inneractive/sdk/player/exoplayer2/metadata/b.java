package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o[] f55816a;

    public b(ArrayList arrayList) {
        o[] oVarArr = new o[arrayList.size()];
        this.f55816a = oVarArr;
        arrayList.toArray(oVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f55816a, ((b) obj).f55816a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55816a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f55816a.length);
        for (o oVar : this.f55816a) {
            parcel.writeParcelable(oVar, 0);
        }
    }

    public b(Parcel parcel) {
        this.f55816a = new o[parcel.readInt()];
        int i2 = 0;
        while (true) {
            o[] oVarArr = this.f55816a;
            if (i2 >= oVarArr.length) {
                return;
            }
            oVarArr[i2] = (o) parcel.readParcelable(o.class.getClassLoader());
            i2++;
        }
    }
}
