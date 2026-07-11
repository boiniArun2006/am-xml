package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public interface ChronoLocalDate extends Temporal, j$.time.temporal.l, Comparable<ChronoLocalDate> {
    boolean equals(Object obj);

    int hashCode();

    Chronology i();

    @Override // j$.time.temporal.Temporal
    long n(Temporal temporal, TemporalUnit temporalUnit);

    String toString();

    default j w() {
        return i().S(j(j$.time.temporal.a.ERA));
    }

    default boolean R() {
        return i().E(h(j$.time.temporal.a.YEAR));
    }

    default int M() {
        return R() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).Y();
        }
        return pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate m(j$.time.temporal.l lVar) {
        return AbstractC2183c.q(i(), lVar.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate a(long j2, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
        return AbstractC2183c.q(i(), pVar.q(this, j2));
    }

    default ChronoLocalDate Q(j$.time.temporal.o oVar) {
        return AbstractC2183c.q(i(), oVar.q(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate b(long j2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
        return AbstractC2183c.q(i(), temporalUnit.q(this, j2));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate d(long j2, TemporalUnit temporalUnit) {
        return AbstractC2183c.q(i(), super.d(j2, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.g() || temporalQuery == j$.time.temporal.q.f() || temporalQuery == j$.time.temporal.q.d() || temporalQuery == j$.time.temporal.q.c()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.a()) {
            return i();
        }
        if (temporalQuery == j$.time.temporal.q.e()) {
            return ChronoUnit.DAYS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    default Temporal f(Temporal temporal) {
        return temporal.a(toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    default ChronoLocalDateTime N(LocalTime localTime) {
        return C2185e.s(this, localTime);
    }

    default long toEpochDay() {
        return h(j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC2181a) i()).compareTo(chronoLocalDate.i());
    }
}
