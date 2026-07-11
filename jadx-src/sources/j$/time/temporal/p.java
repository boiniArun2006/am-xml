package j$.time.temporal;

import j$.time.format.D;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public interface p {
    s C();

    s L(TemporalAccessor temporalAccessor);

    boolean Y();

    boolean a0(TemporalAccessor temporalAccessor);

    Temporal q(Temporal temporal, long j2);

    long s(TemporalAccessor temporalAccessor);

    default TemporalAccessor X(HashMap map, TemporalAccessor temporalAccessor, D d2) {
        return null;
    }
}
