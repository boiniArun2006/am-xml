package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class w6 {

    static class j {
        public static void J2(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        public static void KN(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        public static void O(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        public static void Uo(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        public static Object n(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        public static void nr(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        public static Object rl() {
            return new MediaDescription.Builder();
        }

        public static void t(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        public static void xMQ(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }
    }

    public static String J2(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    public static CharSequence KN(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    public static Uri O(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    public static CharSequence Uo(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    public static Object n(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    public static Bitmap nr(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    public static CharSequence rl(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    public static Bundle t(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    public static void xMQ(Object obj, Parcel parcel, int i2) {
        ((MediaDescription) obj).writeToParcel(parcel, i2);
    }
}
