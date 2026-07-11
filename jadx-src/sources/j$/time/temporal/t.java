package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.D;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class t implements p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final s f69182f = s.j(1, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final s f69183g = s.k(0, 4, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final s f69184h = s.k(0, 52, 54);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final s f69185i = s.k(1, 52, 53);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeekFields f69187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Enum f69188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Enum f69189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f69190e;

    @Override // j$.time.temporal.p
    public final boolean Y() {
        return true;
    }

    static t e(WeekFields weekFields) {
        return new t("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, f69182f);
    }

    static t h(WeekFields weekFields) {
        return new t("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f69183g);
    }

    static t i(WeekFields weekFields) {
        return new t("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, i.f69162d, f69185i);
    }

    static t g(WeekFields weekFields) {
        return new t("WeekBasedYear", weekFields, i.f69162d, ChronoUnit.FOREVER, a.YEAR.C());
    }

    private ChronoLocalDate f(Chronology chronology, int i2, int i3, int i5) {
        ChronoLocalDate chronoLocalDateH = chronology.H(i2, 1, 1);
        int iL = l(1, b(chronoLocalDateH));
        int i7 = i5 - 1;
        return chronoLocalDateH.b(((Math.min(i3, a(iL, this.f69187b.e() + chronoLocalDateH.M()) - 1) - 1) * 7) + i7 + (-iL), (TemporalUnit) ChronoUnit.DAYS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, s sVar) {
        this.f69186a = str;
        this.f69187b = weekFields;
        this.f69188c = (Enum) temporalUnit;
        this.f69189d = (Enum) temporalUnit2;
        this.f69190e = sVar;
    }

    @Override // j$.time.temporal.p
    public final long s(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r12 = this.f69189d;
        if (r12 == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (r12 != ChronoUnit.MONTHS) {
            if (r12 != ChronoUnit.YEARS) {
                if (r12 == WeekFields.f69144h) {
                    iC = d(temporalAccessor);
                } else if (r12 == ChronoUnit.FOREVER) {
                    iC = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + r12 + ", this: " + this);
                }
            } else {
                int iB = b(temporalAccessor);
                int iJ = temporalAccessor.j(a.DAY_OF_YEAR);
                iC = a(l(iJ, iB), iJ);
            }
        } else {
            int iB2 = b(temporalAccessor);
            int iJ2 = temporalAccessor.j(a.DAY_OF_MONTH);
            iC = a(l(iJ2, iB2), iJ2);
        }
        return iC;
    }

    private int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.j(a.DAY_OF_WEEK) - this.f69187b.getFirstDayOfWeek().getValue(), 7) + 1;
    }

    private int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iJ = temporalAccessor.j(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iJ2 = temporalAccessor.j(aVar);
        int iL = l(iJ2, iB);
        int iA = a(iL, iJ2);
        if (iA == 0) {
            return iJ - 1;
        }
        return iA >= a(iL, this.f69187b.e() + ((int) temporalAccessor.l(aVar).d())) ? iJ + 1 : iJ;
    }

    private int d(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iJ = temporalAccessor.j(aVar);
        int iL = l(iJ, iB);
        int iA = a(iL, iJ);
        if (iA == 0) {
            return d(Chronology.G(temporalAccessor).v(temporalAccessor).d(iJ, (TemporalUnit) ChronoUnit.DAYS));
        }
        if (iA <= 50) {
            return iA;
        }
        int iA2 = a(iL, this.f69187b.e() + ((int) temporalAccessor.l(aVar).d()));
        return iA >= iA2 ? (iA - iA2) + 1 : iA;
    }

    private int l(int i2, int i3) {
        int iFloorMod = Math.floorMod(i2 - i3, 7);
        return iFloorMod + 1 > this.f69187b.e() ? 7 - iFloorMod : -iFloorMod;
    }

    private static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.TemporalUnit, java.lang.Enum] */
    @Override // j$.time.temporal.p
    public final Temporal q(Temporal temporal, long j2) {
        if (this.f69190e.a(j2, this) == temporal.j(this)) {
            return temporal;
        }
        if (this.f69189d == ChronoUnit.FOREVER) {
            WeekFields weekFields = this.f69187b;
            return f(Chronology.G(temporal), (int) j2, temporal.j(weekFields.f69149e), temporal.j(weekFields.f69147c));
        }
        return temporal.b(r0 - r1, this.f69188c);
    }

    @Override // j$.time.temporal.p
    public final TemporalAccessor X(HashMap map, TemporalAccessor temporalAccessor, D d2) {
        ChronoLocalDate chronoLocalDateB;
        ChronoLocalDate chronoLocalDateB2;
        ChronoLocalDate chronoLocalDateB3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r7 = this.f69189d;
        s sVar = this.f69190e;
        WeekFields weekFields = this.f69187b;
        if (r7 == chronoUnit) {
            long jFloorMod = Math.floorMod((sVar.a(jLongValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iFloorMod = Math.floorMod(aVar.d0(((Long) map.get(aVar)).longValue()) - weekFields.getFirstDayOfWeek().getValue(), 7) + 1;
        Chronology chronologyG = Chronology.G(temporalAccessor);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if ((r7 != WeekFields.f69144h && r7 != ChronoUnit.FOREVER) || !map.containsKey(weekFields.f69150f) || !map.containsKey(weekFields.f69149e)) {
                return null;
            }
            int iA = ((t) weekFields.f69150f).f69190e.a(((Long) map.get(weekFields.f69150f)).longValue(), weekFields.f69150f);
            if (d2 == D.LENIENT) {
                chronoLocalDateB = f(chronologyG, iA, 1, iFloorMod).b(Math.subtractExact(((Long) map.get(weekFields.f69149e)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                ChronoLocalDate chronoLocalDateF = f(chronologyG, iA, ((t) weekFields.f69149e).f69190e.a(((Long) map.get(weekFields.f69149e)).longValue(), weekFields.f69149e), iFloorMod);
                if (d2 == D.STRICT && c(chronoLocalDateF) != iA) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDateB = chronoLocalDateF;
            }
            map.remove(this);
            map.remove(weekFields.f69150f);
            map.remove(weekFields.f69149e);
            map.remove(aVar);
            return chronoLocalDateB;
        }
        int iD0 = aVar2.d0(((Long) map.get(aVar2)).longValue());
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (r7 == chronoUnit2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long jLongValue2 = ((Long) map.get(aVar3)).longValue();
                long j2 = intExact;
                if (d2 == D.LENIENT) {
                    ChronoLocalDate chronoLocalDateB4 = chronologyG.H(iD0, 1, 1).b(Math.subtractExact(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(chronoLocalDateB4);
                    int iJ = chronoLocalDateB4.j(a.DAY_OF_MONTH);
                    chronoLocalDateB3 = chronoLocalDateB4.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, a(l(iJ, iB), iJ)), 7), iFloorMod - b(chronoLocalDateB4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateH = chronologyG.H(iD0, aVar3.d0(jLongValue2), 1);
                    long jA = sVar.a(j2, this);
                    int iB2 = b(chronoLocalDateH);
                    int iJ2 = chronoLocalDateH.j(a.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateB5 = chronoLocalDateH.b((((int) (jA - ((long) a(l(iJ2, iB2), iJ2)))) * 7) + (iFloorMod - b(chronoLocalDateH)), (TemporalUnit) ChronoUnit.DAYS);
                    if (d2 == D.STRICT && chronoLocalDateB5.h(aVar3) != jLongValue2) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDateB3 = chronoLocalDateB5;
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar3);
                map.remove(aVar);
                return chronoLocalDateB3;
            }
        }
        if (r7 != ChronoUnit.YEARS) {
            return null;
        }
        long j3 = intExact;
        ChronoLocalDate chronoLocalDateH2 = chronologyG.H(iD0, 1, 1);
        if (d2 == D.LENIENT) {
            int iB3 = b(chronoLocalDateH2);
            int iJ3 = chronoLocalDateH2.j(a.DAY_OF_YEAR);
            chronoLocalDateB2 = chronoLocalDateH2.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j3, a(l(iJ3, iB3), iJ3)), 7), iFloorMod - b(chronoLocalDateH2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = sVar.a(j3, this);
            int iB4 = b(chronoLocalDateH2);
            int iJ4 = chronoLocalDateH2.j(a.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateB6 = chronoLocalDateH2.b((((int) (jA2 - ((long) a(l(iJ4, iB4), iJ4)))) * 7) + (iFloorMod - b(chronoLocalDateH2)), (TemporalUnit) ChronoUnit.DAYS);
            if (d2 == D.STRICT && chronoLocalDateB6.h(aVar2) != iD0) {
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDateB2 = chronoLocalDateB6;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return chronoLocalDateB2;
    }

    @Override // j$.time.temporal.p
    public final s C() {
        return this.f69190e;
    }

    @Override // j$.time.temporal.p
    public final boolean a0(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.g(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r12 = this.f69189d;
        if (r12 == chronoUnit) {
            return true;
        }
        if (r12 == ChronoUnit.MONTHS) {
            return temporalAccessor.g(a.DAY_OF_MONTH);
        }
        if (r12 == ChronoUnit.YEARS) {
            return temporalAccessor.g(a.DAY_OF_YEAR);
        }
        if (r12 == WeekFields.f69144h) {
            return temporalAccessor.g(a.DAY_OF_YEAR);
        }
        if (r12 == ChronoUnit.FOREVER) {
            return temporalAccessor.g(a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.p
    public final s L(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r12 = this.f69189d;
        if (r12 == chronoUnit) {
            return this.f69190e;
        }
        if (r12 == ChronoUnit.MONTHS) {
            return j(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (r12 == ChronoUnit.YEARS) {
            return j(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (r12 == WeekFields.f69144h) {
            return k(temporalAccessor);
        }
        if (r12 == ChronoUnit.FOREVER) {
            return a.YEAR.C();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + r12 + ", this: " + this);
    }

    private s j(TemporalAccessor temporalAccessor, a aVar) {
        int iL = l(temporalAccessor.j(aVar), b(temporalAccessor));
        s sVarL = temporalAccessor.l(aVar);
        return s.j(a(iL, (int) sVarL.e()), a(iL, (int) sVarL.d()));
    }

    private s k(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.g(aVar)) {
            return f69184h;
        }
        int iB = b(temporalAccessor);
        int iJ = temporalAccessor.j(aVar);
        int iL = l(iJ, iB);
        int iA = a(iL, iJ);
        if (iA == 0) {
            return k(Chronology.G(temporalAccessor).v(temporalAccessor).d(iJ + 7, (TemporalUnit) ChronoUnit.DAYS));
        }
        if (iA >= a(iL, this.f69187b.e() + ((int) temporalAccessor.l(aVar).d()))) {
            return k(Chronology.G(temporalAccessor).v(temporalAccessor).b((r0 - iJ) + 8, (TemporalUnit) ChronoUnit.DAYS));
        }
        return s.j(1L, r1 - 1);
    }

    public final String toString() {
        return this.f69186a + "[" + this.f69187b.toString() + "]";
    }
}
