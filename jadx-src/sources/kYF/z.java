package kYF;

import Z.w6;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class z {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Z.CN3.values().length];
            try {
                iArr[Z.CN3.f12263n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z.CN3.f12264t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Bitmap n(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getFrameAtTime(j2, i2);
        }
        MediaMetadataRetriever.BitmapParams bitmapParamsN = o.n();
        bitmapParamsN.setPreferredConfig(config);
        return mediaMetadataRetriever.getFrameAtTime(j2, i2, bitmapParamsN);
    }

    public static final Bitmap rl(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i5, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j2, i2, i3, i5);
        }
        MediaMetadataRetriever.BitmapParams bitmapParamsN = o.n();
        bitmapParamsN.setPreferredConfig(config);
        return mediaMetadataRetriever.getScaledFrameAtTime(j2, i2, i3, i5, bitmapParamsN);
    }

    public static final int t(Z.w6 w6Var, Z.CN3 cn3) {
        if (w6Var instanceof w6.j) {
            return ((w6.j) w6Var).f12273n;
        }
        int i2 = j.$EnumSwitchMapping$0[cn3.ordinal()];
        if (i2 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i2 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
