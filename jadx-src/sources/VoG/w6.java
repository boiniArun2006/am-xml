package VoG;

import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.SampleStream;
import kotlin.coroutines.Continuation;
import w9.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface w6 extends fuX {
    long KN();

    boolean isInitialized();

    LQ.n t(long j2);

    Object xMQ(SampleStream sampleStream, Format format, Surface surface, Continuation continuation);
}
