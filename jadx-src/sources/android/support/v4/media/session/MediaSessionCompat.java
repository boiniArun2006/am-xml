package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MediaDescriptionCompat f13142n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f13143t;

        static class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i2) {
                return new QueueItem[i2];
            }

            j() {
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f13142n + ", Id=" + this.f13143t + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f13142n.writeToParcel(parcel, i2);
            parcel.writeLong(this.f13143t);
        }

        QueueItem(Parcel parcel) {
            this.f13142n = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f13143t = parcel.readLong();
        }
    }

    @RestrictTo
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ResultReceiver f13144n;

        static class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
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
            this.f13144n.writeToParcel(parcel, i2);
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f13144n = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new j();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Bundle f13145O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f13146n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private n f13147t;

        static class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i2) {
                return new Token[i2];
            }

            j() {
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public static Token n(Object obj) {
            return rl(obj, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f13146n;
            if (obj2 == null) {
                return token.f13146n == null;
            }
            Object obj3 = token.f13146n;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        Token(Object obj, n nVar) {
            this(obj, nVar, null);
        }

        public static Token rl(Object obj, n nVar) {
            if (obj != null) {
                return new Token(Ml.n(obj), nVar);
            }
            return null;
        }

        public void J2(Bundle bundle) {
            this.f13145O = bundle;
        }

        public void O(n nVar) {
            this.f13147t = nVar;
        }

        public int hashCode() {
            Object obj = this.f13146n;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public Object nr() {
            return this.f13146n;
        }

        public n t() {
            return this.f13147t;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable((Parcelable) this.f13146n, i2);
        }

        Token(Object obj, n nVar, Bundle bundle) {
            this.f13146n = obj;
            this.f13147t = nVar;
            this.f13145O = bundle;
        }
    }

    public static void n(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
