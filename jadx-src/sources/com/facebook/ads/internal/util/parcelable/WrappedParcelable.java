package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f52258n;

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public WrappedParcelable[] newArray(int i2) {
            return new WrappedParcelable[i2];
        }

        j() {
        }
    }

    protected WrappedParcelable(Parcel parcel) {
        this.f52258n = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.f52258n);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f52258n = marshallParcelable(parcelable);
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(parcelable, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Nullable
    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] bArr = this.f52258n;
        if (bArr != null) {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            Parcelable parcelable = parcelObtain.readParcelable(classLoader);
            parcelObtain.recycle();
            return parcelable;
        }
        return null;
    }

    public WrappedParcelable(@Nullable byte[] bArr) {
        this.f52258n = bArr;
    }
}
