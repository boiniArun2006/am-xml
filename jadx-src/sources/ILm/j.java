package ILm;

import android.media.MediaCodec;
import d2n.Ml;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import v9.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    public static final int n(MediaCodec processInputData, ByteBuffer buffer, int i2, long j2) {
        Intrinsics.checkNotNullParameter(processInputData, "$this$processInputData");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ByteBuffer inputBuffer = processInputData.getInputBuffer(i2);
        if (inputBuffer == null) {
            throw new IllegalStateException("Unexpected null ByteBuffer returned by codec!");
        }
        Intrinsics.checkNotNullExpressionValue(inputBuffer, "checkNotNull(getInputBuf…returned by codec!\"\n    }");
        int iTy = n.ty(inputBuffer, buffer);
        inputBuffer.flip();
        processInputData.queueInputBuffer(i2, 0, inputBuffer.remaining(), Ml.xMQ(j2), 0);
        return iTy;
    }

    public static final void rl(MediaCodec mediaCodec, int i2) {
        Intrinsics.checkNotNullParameter(mediaCodec, "<this>");
        mediaCodec.queueInputBuffer(i2, 0, 0, 0L, 4);
    }
}
