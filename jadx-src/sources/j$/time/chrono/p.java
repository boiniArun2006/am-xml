package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class p extends AbstractC2181a implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f68978e = new p();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.Chronology
    public final j S(int i2) {
        if (i2 == 0) {
            return q.BCE;
        }
        if (i2 == 1) {
            return q.CE;
        }
        throw new DateTimeException("Invalid era: " + i2);
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final String W() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate H(int i2, int i3, int i5) {
        return LocalDate.of(i2, i3, i5);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate A(int i2, int i3) {
        return LocalDate.h0(i2, i3);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate r(long j2) {
        return LocalDate.ofEpochDay(j2);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(TemporalAccessor temporalAccessor) {
        return LocalDate.C(temporalAccessor);
    }

    private p() {
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDateTime c0(Temporal temporal) {
        return LocalDateTime.s(temporal);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime O(Temporal temporal) {
        return ZonedDateTime.s(temporal);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate P() {
        return LocalDate.C(LocalDate.f0(Clock.b()));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean E(long j2) {
        if ((3 & j2) == 0) {
            return j2 % 100 != 0 || j2 % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.Chronology
    public final int x(j jVar, int i2) {
        if (jVar instanceof q) {
            return jVar == q.CE ? i2 : 1 - i2;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final List D() {
        return j$.time.c.c(q.values());
    }

    @Override // j$.time.chrono.AbstractC2181a, j$.time.chrono.Chronology
    public final ChronoLocalDate U(Map map, j$.time.format.D d2) {
        return (LocalDate) super.U(map, d2);
    }

    @Override // j$.time.chrono.AbstractC2181a
    final void Y(Map map, j$.time.format.D d2) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            if (d2 != j$.time.format.D.LENIENT) {
                aVar.e0(l2.longValue());
            }
            AbstractC2181a.q(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l2.longValue(), r4)) + 1);
            AbstractC2181a.q(map, j$.time.temporal.a.YEAR, Math.floorDiv(l2.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC2181a
    final ChronoLocalDate d0(Map map, j$.time.format.D d2) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            if (d2 != j$.time.format.D.LENIENT) {
                aVar.e0(l2.longValue());
            }
            Long l5 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l5 != null) {
                if (l5.longValue() == 1) {
                    AbstractC2181a.q(map, j$.time.temporal.a.YEAR, l2.longValue());
                    return null;
                }
                if (l5.longValue() == 0) {
                    AbstractC2181a.q(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l2.longValue()));
                    return null;
                }
                throw new DateTimeException("Invalid value for era: " + l5);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            Long l6 = (Long) map.get(aVar2);
            if (d2 != j$.time.format.D.STRICT) {
                AbstractC2181a.q(map, aVar2, (l6 == null || l6.longValue() > 0) ? l2.longValue() : Math.subtractExact(1L, l2.longValue()));
                return null;
            }
            if (l6 != null) {
                long jLongValue = l6.longValue();
                long jLongValue2 = l2.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                AbstractC2181a.q(map, aVar2, jLongValue2);
                return null;
            }
            map.put(aVar, l2);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        aVar3.e0(((Long) map.get(aVar3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC2181a
    final ChronoLocalDate a0(Map map, j$.time.format.D d2) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iD0 = aVar.d0(((Long) map.remove(aVar)).longValue());
        boolean z2 = true;
        if (d2 == j$.time.format.D.LENIENT) {
            return LocalDate.of(iD0, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).j0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iD02 = aVar2.d0(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iD03 = aVar3.d0(((Long) map.remove(aVar3)).longValue());
        if (d2 == j$.time.format.D.SMART) {
            if (iD02 == 4 || iD02 == 6 || iD02 == 9 || iD02 == 11) {
                iD03 = Math.min(iD03, 30);
            } else if (iD02 == 2) {
                Month month = Month.FEBRUARY;
                long j2 = iD0;
                int i2 = j$.time.r.f69134b;
                if ((3 & j2) != 0 || (j2 % 100 == 0 && j2 % 400 != 0)) {
                    z2 = false;
                }
                iD03 = Math.min(iD03, month.s(z2));
            }
        }
        return LocalDate.of(iD0, iD02, iD03);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.s Z(j$.time.temporal.a aVar) {
        return aVar.C();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new B((byte) 1, this);
    }
}
