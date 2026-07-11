package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f13132n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f13133t;

    static class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
        }

        j() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f13132n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f13132n);
        sb.append(" rating=");
        float f3 = this.f13133t;
        sb.append(f3 < 0.0f ? "unrated" : String.valueOf(f3));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f13132n);
        parcel.writeFloat(this.f13133t);
    }

    RatingCompat(int i2, float f3) {
        this.f13132n = i2;
        this.f13133t = f3;
    }
}
