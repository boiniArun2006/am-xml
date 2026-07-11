package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.nKK;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@UnstableApi
public class CuesWithTiming {
    public final nKK cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(List<Cue> list, long j2, long j3) {
        this.cues = nKK.ty(list);
        this.startTimeUs = j2;
        this.durationUs = j3;
        long j4 = -9223372036854775807L;
        if (j2 != -9223372036854775807L && j3 != -9223372036854775807L) {
            j4 = j2 + j3;
        }
        this.endTimeUs = j4;
    }
}
