package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public interface Temporal extends TemporalAccessor {
    Temporal a(long j2, p pVar);

    Temporal b(long j2, TemporalUnit temporalUnit);

    long n(Temporal temporal, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: c */
    default Temporal m(LocalDate localDate) {
        return localDate.f(this);
    }

    default Temporal d(long j2, TemporalUnit temporalUnit) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j2, temporalUnit);
    }
}
