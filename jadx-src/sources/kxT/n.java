package kxT;

import LQ.j;
import com.bendingspoons.fellini.utils.either.UnhandledFailureException;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import d2n.I28;
import d2n.Ml;
import kotlin.jvm.internal.Intrinsics;
import uPp.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final LQ.j t(CSs.j jVar) {
        SeekPoint seekPoint = jVar.getSeekPoints(0L).first;
        Intrinsics.checkNotNullExpressionValue(seekPoint, "getSeekPoints(0).first");
        jVar.n(seekPoint);
        try {
            FormatHolder formatHolder = new FormatHolder();
            DecoderInputBuffer decoderInputBufferNewNoDataInstance = DecoderInputBuffer.newNoDataInstance();
            Intrinsics.checkNotNullExpressionValue(decoderInputBufferNewNoDataInstance, "newNoDataInstance()");
            boolean z2 = false;
            boolean z3 = false;
            do {
                int data = jVar.readData(formatHolder, decoderInputBufferNewNoDataInstance, 4);
                if (data == -4 && decoderInputBufferNewNoDataInstance.isKeyFrame()) {
                    z2 = true;
                }
                if (data == -3) {
                    z3 = true;
                }
                if (z2) {
                    break;
                }
            } while (!z3);
            SeekPoint seekPoint2 = jVar.getSeekPoints(0L).first;
            Intrinsics.checkNotNullExpressionValue(seekPoint2, "getSeekPoints(0).first");
            jVar.n(seekPoint2);
            return z2 ? new j.w6(Ml.rl(Ml.f63370t.n(decoderInputBufferNewNoDataInstance.timeUs))) : new j.n(new Ml.n(new IllegalStateException("Stream doesn't seem to contain any sample")));
        } catch (UnhandledFailureException e2) {
            return new j.n(new Ml.n(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long O(CSs.j jVar) {
        long jNr = nr(jVar);
        if (d2n.j.Ik(jNr)) {
            return d2n.Ml.f63370t.nr();
        }
        return I28.rl(d2n.Ml.HI(d2n.Ml.f63370t.J2(), jNr));
    }

    private static final long nr(SeekMap seekMap) {
        if (seekMap.getDurationUs() == -9223372036854775807L) {
            return d2n.j.f63374t.n();
        }
        return d2n.j.f63374t.rl(seekMap.getDurationUs());
    }
}
