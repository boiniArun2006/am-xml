package androidx.media;

import android.os.Bundle;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class MediaBrowserCompatUtils {
    public static boolean n(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    public static boolean rl(Bundle bundle, Bundle bundle2) {
        int i2;
        int i3;
        int i5;
        int i7 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i8 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
        int i9 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i10 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i11 = Integer.MAX_VALUE;
        if (i7 == -1 || i9 == -1) {
            i2 = Integer.MAX_VALUE;
            i3 = 0;
        } else {
            i3 = i7 * i9;
            i2 = (i9 + i3) - 1;
        }
        if (i8 == -1 || i10 == -1) {
            i5 = 0;
        } else {
            i5 = i8 * i10;
            i11 = (i10 + i5) - 1;
        }
        return i2 >= i5 && i11 >= i3;
    }
}
