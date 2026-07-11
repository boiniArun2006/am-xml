package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class Ml {

    static class j {
        public static void n(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri n(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
