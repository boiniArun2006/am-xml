package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new j();
    final long E2;
    final float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final long f13152O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final long f13153S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final CharSequence f13154Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Bundle f13155e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    List f13156g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f13157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final int f13158o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final long f13159r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final long f13160t;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new j();
        private final Bundle J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f13161O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f13162n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final CharSequence f13163t;

        static class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }

            j() {
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f13163t) + ", mIcon=" + this.f13161O + ", mExtras=" + this.J2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f13162n);
            TextUtils.writeToParcel(this.f13163t, parcel, i2);
            parcel.writeInt(this.f13161O);
            parcel.writeBundle(this.J2);
        }

        CustomAction(Parcel parcel) {
            this.f13162n = parcel.readString();
            this.f13163t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f13161O = parcel.readInt();
            this.J2 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    static class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }

        j() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f13157n + ", position=" + this.f13160t + ", buffered position=" + this.f13152O + ", speed=" + this.J2 + ", updated=" + this.f13153S + ", actions=" + this.f13159r + ", error code=" + this.f13158o + ", error message=" + this.f13154Z + ", custom actions=" + this.f13156g + ", active item id=" + this.E2 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f13157n);
        parcel.writeLong(this.f13160t);
        parcel.writeFloat(this.J2);
        parcel.writeLong(this.f13153S);
        parcel.writeLong(this.f13152O);
        parcel.writeLong(this.f13159r);
        TextUtils.writeToParcel(this.f13154Z, parcel, i2);
        parcel.writeTypedList(this.f13156g);
        parcel.writeLong(this.E2);
        parcel.writeBundle(this.f13155e);
        parcel.writeInt(this.f13158o);
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f13157n = parcel.readInt();
        this.f13160t = parcel.readLong();
        this.J2 = parcel.readFloat();
        this.f13153S = parcel.readLong();
        this.f13152O = parcel.readLong();
        this.f13159r = parcel.readLong();
        this.f13154Z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13156g = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.E2 = parcel.readLong();
        this.f13155e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f13158o = parcel.readInt();
    }
}
