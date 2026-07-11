package oVe;

import android.media.MediaCodec;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    public static final boolean n(MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(bufferInfo, "<this>");
        return (bufferInfo.flags & 2) != 0;
    }

    public static final boolean rl(MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(bufferInfo, "<this>");
        return (bufferInfo.flags & 4) != 0;
    }
}
