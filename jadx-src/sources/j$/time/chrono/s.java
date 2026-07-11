package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class s extends AbstractC2181a implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f68981e = new s();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final String W() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate H(int i2, int i3, int i5) {
        return new u(LocalDate.of(i2, i3, i5));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate A(int i2, int i3) {
        return new u(LocalDate.h0(i2, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate r(long j2) {
        return new u(LocalDate.ofEpochDay(j2));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate P() {
        return new u(LocalDate.C(LocalDate.f0(Clock.b())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof u) {
            return (u) temporalAccessor;
        }
        return new u(LocalDate.C(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean E(long j2) {
        return p.f68978e.E(j2);
    }

    private s() {
    }

    @Override // j$.time.chrono.Chronology
    public final int x(j jVar, int i2) {
        if (!(jVar instanceof v)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        v vVar = (v) jVar;
        int year = (vVar.s().getYear() + i2) - 1;
        if (i2 != 1 && (year < -999999999 || year > 999999999 || year < vVar.s().getYear() || jVar != v.q(LocalDate.of(year, 1, 1)))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // j$.time.chrono.Chronology
    public final j S(int i2) {
        return v.u(i2);
    }

    @Override // j$.time.chrono.Chronology
    public final List D() {
        return j$.time.c.c(v.y());
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.s Z(j$.time.temporal.a aVar) {
        switch (r.f68980a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.r("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.s.k(1L, v.x(), 999999999 - v.r().s().getYear());
            case 6:
                return j$.time.temporal.s.k(1L, v.v(), j$.time.temporal.a.DAY_OF_YEAR.C().d());
            case 7:
                return j$.time.temporal.s.j(u.f68983d.getYear(), 999999999L);
            case 8:
                return j$.time.temporal.s.j(v.f68987d.getValue(), v.r().getValue());
            default:
                return aVar.C();
        }
    }

    @Override // j$.time.chrono.AbstractC2181a, j$.time.chrono.Chronology
    public final ChronoLocalDate U(Map map, j$.time.format.D d2) {
        return (u) super.U(map, d2);
    }

    @Override // j$.time.chrono.AbstractC2181a
    final ChronoLocalDate d0(Map map, j$.time.format.D d2) {
        u uVarF0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l2 = (Long) map.get(aVar);
        v vVarU = l2 != null ? v.u(Z(aVar).a(l2.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l5 = (Long) map.get(aVar2);
        int iA = l5 != null ? Z(aVar2).a(l5.longValue(), aVar2) : 0;
        if (vVarU == null && l5 != null && !map.containsKey(j$.time.temporal.a.YEAR) && d2 != j$.time.format.D.STRICT) {
            vVarU = v.y()[v.y().length - 1];
        }
        if (l5 != null && vVarU != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (d2 == j$.time.format.D.LENIENT) {
                        return new u(LocalDate.of((vVarU.s().getYear() + iA) - 1, 1, 1)).a0(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).a0(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = Z(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = Z(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (d2 != j$.time.format.D.SMART) {
                        LocalDate localDate = u.f68983d;
                        LocalDate localDateOf = LocalDate.of((vVarU.s().getYear() + iA) - 1, iA2, iA3);
                        if (localDateOf.a0(vVarU.s()) || vVarU != v.q(localDateOf)) {
                            throw new DateTimeException("year, month, and day not valid for Era");
                        }
                        return new u(vVarU, iA, localDateOf);
                    }
                    if (iA < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + iA);
                    }
                    int year = (vVarU.s().getYear() + iA) - 1;
                    try {
                        uVarF0 = new u(LocalDate.of(year, iA2, iA3));
                    } catch (DateTimeException unused) {
                        uVarF0 = new u(LocalDate.of(year, iA2, 1)).f0(new j$.time.temporal.n(0));
                    }
                    if (uVarF0.Y() == vVarU || uVarF0.j(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return uVarF0;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + vVarU + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (d2 == j$.time.format.D.LENIENT) {
                    return new u(LocalDate.h0((vVarU.s().getYear() + iA) - 1, 1)).a0(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = Z(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate2 = u.f68983d;
                LocalDate localDateH0 = iA == 1 ? LocalDate.h0(vVarU.s().getYear(), (vVarU.s().X() + iA4) - 1) : LocalDate.h0((vVarU.s().getYear() + iA) - 1, iA4);
                if (localDateH0.a0(vVarU.s()) || vVarU != v.q(localDateH0)) {
                    throw new DateTimeException("Invalid parameters");
                }
                return new u(vVarU, iA, localDateH0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return i.C(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new B((byte) 1, this);
    }
}
