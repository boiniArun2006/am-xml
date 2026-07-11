package jgV;

import com.bendingspoons.pico.domain.entities.PicoEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {
    public static final PicoEvent n(PicoEvent.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return companion.n("ExperimentSegmentReceived", new pq.Ml());
    }
}
