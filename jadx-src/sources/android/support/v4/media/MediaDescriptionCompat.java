package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.Ml;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new j();
    private final CharSequence J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final CharSequence f13117O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Uri f13118S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Bundle f13119Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f13120g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f13121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Uri f13122o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Bitmap f13123r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CharSequence f13124t;

    static class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }

        j() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.n(w6.n(parcel));
        }
    }

    public static final class n {
        private Uri J2;
        private Uri KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Bitmap f13125O;
        private Bundle Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f13126n;
        private CharSequence nr;
        private CharSequence rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private CharSequence f13127t;

        public n J2(String str) {
            this.f13126n = str;
            return this;
        }

        public n KN(CharSequence charSequence) {
            this.f13127t = charSequence;
            return this;
        }

        public n O(Uri uri) {
            this.J2 = uri;
            return this;
        }

        public n Uo(Uri uri) {
            this.KN = uri;
            return this;
        }

        public MediaDescriptionCompat n() {
            return new MediaDescriptionCompat(this.f13126n, this.rl, this.f13127t, this.nr, this.f13125O, this.J2, this.Uo, this.KN);
        }

        public n nr(Bitmap bitmap) {
            this.f13125O = bitmap;
            return this;
        }

        public n rl(CharSequence charSequence) {
            this.nr = charSequence;
            return this;
        }

        public n t(Bundle bundle) {
            this.Uo = bundle;
            return this;
        }

        public n xMQ(CharSequence charSequence) {
            this.rl = charSequence;
            return this;
        }
    }

    public static MediaDescriptionCompat n(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        n nVar = new n();
        nVar.J2(w6.J2(obj));
        nVar.xMQ(w6.KN(obj));
        nVar.KN(w6.Uo(obj));
        nVar.rl(w6.rl(obj));
        nVar.nr(w6.nr(obj));
        nVar.O(w6.O(obj));
        Bundle bundleT = w6.t(obj);
        if (bundleT != null) {
            MediaSessionCompat.n(bundleT);
            uri = (Uri) bundleT.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = bundleT;
        } else if (!bundleT.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleT.size() != 2) {
            bundleT.remove("android.support.v4.media.description.MEDIA_URI");
            bundleT.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleT;
        }
        nVar.t(bundle);
        if (uri != null) {
            nVar.Uo(uri);
        } else {
            nVar.Uo(Ml.n(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatN = nVar.n();
        mediaDescriptionCompatN.f13120g = obj;
        return mediaDescriptionCompatN;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object rl() {
        Object obj = this.f13120g;
        if (obj != null) {
            return obj;
        }
        Object objRl = w6.j.rl();
        w6.j.Uo(objRl, this.f13121n);
        w6.j.xMQ(objRl, this.f13124t);
        w6.j.KN(objRl, this.f13117O);
        w6.j.t(objRl, this.J2);
        w6.j.O(objRl, this.f13123r);
        w6.j.J2(objRl, this.f13122o);
        w6.j.nr(objRl, this.f13119Z);
        Ml.j.n(objRl, this.f13118S);
        Object objN = w6.j.n(objRl);
        this.f13120g = objN;
        return objN;
    }

    public String toString() {
        return ((Object) this.f13124t) + ", " + ((Object) this.f13117O) + ", " + ((Object) this.J2);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f13121n = str;
        this.f13124t = charSequence;
        this.f13117O = charSequence2;
        this.J2 = charSequence3;
        this.f13123r = bitmap;
        this.f13122o = uri;
        this.f13119Z = bundle;
        this.f13118S = uri2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        w6.xMQ(rl(), parcel, i2);
    }
}
