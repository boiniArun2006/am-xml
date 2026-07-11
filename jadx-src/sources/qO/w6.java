package qO;

import android.media.MediaFormat;
import as.CN3;
import as.eO;
import as.qz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 {
    public static final Oe.w6 J2(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return new Oe.w6(Uo(mediaFormat), t(mediaFormat));
    }

    public static final int O(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return eO.nr(mediaFormat.getInteger("sample-rate"));
    }

    public static final int Uo(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return mediaFormat.getInteger("width");
    }

    public static final CN3 n(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return new CN3(rl(mediaFormat), O(mediaFormat), null);
    }

    public static final String nr(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return mediaFormat.getString("mime");
    }

    public static final int rl(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return qz.rl(mediaFormat.getInteger("channel-count"));
    }

    public static final int t(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return mediaFormat.getInteger("height");
    }
}
