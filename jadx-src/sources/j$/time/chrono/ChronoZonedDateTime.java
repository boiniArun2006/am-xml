package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoLocalDateTime B();

    ZoneOffset F();

    ChronoZonedDateTime I(ZoneId zoneId);

    ChronoZonedDateTime K(ZoneId zoneId);

    ZoneId V();

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime a(long j2, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime b(long j2, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).C();
            }
            return B().l(pVar);
        }
        return pVar.L(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i2 = AbstractC2187g.f68956a[((j$.time.temporal.a) pVar).ordinal()];
            if (i2 == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i2 == 2) {
                return F().getTotalSeconds();
            }
            return B().j(pVar);
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i2 = AbstractC2187g.f68956a[((j$.time.temporal.a) pVar).ordinal()];
            if (i2 == 1) {
                return T();
            }
            if (i2 == 2) {
                return F().getTotalSeconds();
            }
            return B().h(pVar);
        }
        return pVar.s(this);
    }

    default ChronoLocalDate p() {
        return B().p();
    }

    default LocalTime o() {
        return B().o();
    }

    default Chronology i() {
        return p().i();
    }

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime m(j$.time.temporal.l lVar) {
        return i.q(i(), lVar.f(this));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    default ChronoZonedDateTime d(long j2, ChronoUnit chronoUnit) {
        return i.q(i(), super.d(j2, chronoUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f() || temporalQuery == j$.time.temporal.q.g()) {
            return V();
        }
        if (temporalQuery == j$.time.temporal.q.d()) {
            return F();
        }
        if (temporalQuery == j$.time.temporal.q.c()) {
            return o();
        }
        if (temporalQuery == j$.time.temporal.q.a()) {
            return i();
        }
        if (temporalQuery == j$.time.temporal.q.e()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    default Instant toInstant() {
        return Instant.ofEpochSecond(T(), o().getNano());
    }

    default long T() {
        return ((p().toEpochDay() * 86400) + ((long) o().toSecondOfDay())) - ((long) F().getTotalSeconds());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(T(), chronoZonedDateTime.T());
        return (iCompare == 0 && (iCompare = o().getNano() - chronoZonedDateTime.o().getNano()) == 0 && (iCompare = B().compareTo(chronoZonedDateTime.B())) == 0 && (iCompare = V().u().compareTo(chronoZonedDateTime.V().u())) == 0) ? i().compareTo(chronoZonedDateTime.i()) : iCompare;
    }

    default boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime) {
        long jT2 = T();
        long jT3 = chronoZonedDateTime.T();
        if (jT2 >= jT3) {
            return jT2 == jT3 && o().getNano() < chronoZonedDateTime.o().getNano();
        }
        return true;
    }
}
