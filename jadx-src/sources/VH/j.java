package VH;

import com.google.android.exoplayer2.ExoPlaybackException;
import kotlin.jvm.internal.Intrinsics;
import uPp.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {
    public static final Ml n(ExoPlaybackException exoPlaybackException) {
        Intrinsics.checkNotNullParameter(exoPlaybackException, "<this>");
        int i2 = exoPlaybackException.rendererFormatSupport & 7;
        if (i2 == 0) {
            throw new IllegalStateException("Trying to initialized a decoder with a wrong format type", exoPlaybackException);
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return new Ml.j(exoPlaybackException);
        }
        if (i2 == 4) {
            return new Ml.n(exoPlaybackException);
        }
        throw new IllegalStateException(("Unexpected format support value: " + i2).toString());
    }
}
