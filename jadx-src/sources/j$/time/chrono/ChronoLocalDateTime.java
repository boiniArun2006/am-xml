package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, j$.time.temporal.l, Comparable<ChronoLocalDateTime<?>> {
    ChronoZonedDateTime J(ZoneId zoneId);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime a(long j2, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime b(long j2, TemporalUnit temporalUnit);

    LocalTime o();

    ChronoLocalDate p();

    default Chronology i() {
        return p().i();
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    default ChronoLocalDateTime m(LocalDate localDate) {
        return C2185e.q(i(), localDate.f(this));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    default ChronoLocalDateTime d(long j2, ChronoUnit chronoUnit) {
        return C2185e.q(i(), super.d(j2, chronoUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.g() || temporalQuery == j$.time.temporal.q.f() || temporalQuery == j$.time.temporal.q.d()) {
            return null;
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

    @Override // j$.time.temporal.l
    default Temporal f(Temporal temporal) {
        return temporal.a(p().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).a(o().i0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((p().toEpochDay() * 86400) + ((long) o().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = p().compareTo(chronoLocalDateTime.p());
        return (iCompareTo == 0 && (iCompareTo = o().compareTo(chronoLocalDateTime.o())) == 0) ? i().compareTo(chronoLocalDateTime.i()) : iCompareTo;
    }
}
