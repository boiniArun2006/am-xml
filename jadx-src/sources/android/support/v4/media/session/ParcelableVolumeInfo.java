package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new j();
    public int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f13148O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13149n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13150r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13151t;

    static class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }

        j() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f13149n);
        parcel.writeInt(this.f13148O);
        parcel.writeInt(this.J2);
        parcel.writeInt(this.f13150r);
        parcel.writeInt(this.f13151t);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f13149n = parcel.readInt();
        this.f13148O = parcel.readInt();
        this.J2 = parcel.readInt();
        this.f13150r = parcel.readInt();
        this.f13151t = parcel.readInt();
    }
}
