package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.D;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f69155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ g[] f69156b;

    @Override // j$.time.temporal.p
    public final boolean Y() {
        return true;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f69156b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.p
            public final s C() {
                return s.k(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.p
            public final boolean a0(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.DAY_OF_YEAR) || !temporalAccessor.g(a.MONTH_OF_YEAR) || !temporalAccessor.g(a.YEAR)) {
                    return false;
                }
                p pVar = i.f69159a;
                return Chronology.G(temporalAccessor).equals(j$.time.chrono.p.f68978e);
            }

            @Override // j$.time.temporal.p
            public final s L(TemporalAccessor temporalAccessor) {
                if (!a0(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long jH = temporalAccessor.h(g.QUARTER_OF_YEAR);
                if (jH == 1) {
                    return j$.time.chrono.p.f68978e.E(temporalAccessor.h(a.YEAR)) ? s.j(1L, 91L) : s.j(1L, 90L);
                }
                if (jH == 2) {
                    return s.j(1L, 91L);
                }
                if (jH == 3 || jH == 4) {
                    return s.j(1L, 92L);
                }
                return C();
            }

            @Override // j$.time.temporal.p
            public final long s(TemporalAccessor temporalAccessor) {
                if (!a0(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.j(a.DAY_OF_YEAR) - g.f69155a[((temporalAccessor.j(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.p.f68978e.E(temporalAccessor.h(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final Temporal q(Temporal temporal, long j2) {
                long jS2 = s(temporal);
                C().b(j2, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.a((j2 - jS2) + temporal.h(aVar), aVar);
            }

            @Override // j$.time.temporal.p
            public final TemporalAccessor X(HashMap map, TemporalAccessor temporalAccessor, D d2) {
                long jSubtractExact;
                LocalDate localDatePlusMonths;
                a aVar = a.YEAR;
                Long l2 = (Long) map.get(aVar);
                p pVar = g.QUARTER_OF_YEAR;
                Long l5 = (Long) map.get(pVar);
                if (l2 == null || l5 == null) {
                    return null;
                }
                int iD0 = aVar.d0(l2.longValue());
                long jLongValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                p pVar2 = i.f69159a;
                if (!Chronology.G(temporalAccessor).equals(j$.time.chrono.p.f68978e)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (d2 == D.LENIENT) {
                    localDatePlusMonths = LocalDate.of(iD0, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l5.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iD0, ((pVar.C().a(l5.longValue(), pVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (d2 == D.STRICT) {
                            L(localDateOf).b(jLongValue, this);
                        } else {
                            C().b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDatePlusMonths = localDateOf;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(pVar);
                return localDatePlusMonths.j0(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final s C() {
                return s.j(1L, 4L);
            }

            @Override // j$.time.temporal.p
            public final boolean a0(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.MONTH_OF_YEAR)) {
                    return false;
                }
                p pVar = i.f69159a;
                return Chronology.G(temporalAccessor).equals(j$.time.chrono.p.f68978e);
            }

            @Override // j$.time.temporal.p
            public final long s(TemporalAccessor temporalAccessor) {
                if (!a0(temporalAccessor)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.h(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.p
            public final s L(TemporalAccessor temporalAccessor) {
                if (!a0(temporalAccessor)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return C();
            }

            @Override // j$.time.temporal.p
            public final Temporal q(Temporal temporal, long j2) {
                long jS2 = s(temporal);
                C().b(j2, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.a(((j2 - jS2) * 3) + temporal.h(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final s C() {
                return s.k(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.p
            public final boolean a0(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.EPOCH_DAY)) {
                    return false;
                }
                p pVar = i.f69159a;
                return Chronology.G(temporalAccessor).equals(j$.time.chrono.p.f68978e);
            }

            @Override // j$.time.temporal.p
            public final s L(TemporalAccessor temporalAccessor) {
                if (!a0(temporalAccessor)) {
                    throw new r("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.h0(LocalDate.C(temporalAccessor));
            }

            @Override // j$.time.temporal.p
            public final long s(TemporalAccessor temporalAccessor) {
                if (!a0(temporalAccessor)) {
                    throw new r("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.e0(LocalDate.C(temporalAccessor));
            }

            @Override // j$.time.temporal.p
            public final Temporal q(Temporal temporal, long j2) {
                C().b(j2, this);
                return temporal.b(Math.subtractExact(j2, s(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.p
            public final TemporalAccessor X(HashMap map, TemporalAccessor temporalAccessor, D d2) {
                LocalDate localDateA;
                long j2;
                long j3;
                p pVar = g.WEEK_BASED_YEAR;
                Long l2 = (Long) map.get(pVar);
                a aVar = a.DAY_OF_WEEK;
                Long l5 = (Long) map.get(aVar);
                if (l2 == null || l5 == null) {
                    return null;
                }
                int iA = pVar.C().a(l2.longValue(), pVar);
                long jLongValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                p pVar2 = i.f69159a;
                if (Chronology.G(temporalAccessor).equals(j$.time.chrono.p.f68978e)) {
                    LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                    if (d2 == D.LENIENT) {
                        long jLongValue2 = l5.longValue();
                        if (jLongValue2 > 7) {
                            long j4 = jLongValue2 - 1;
                            j2 = 1;
                            localDateOf = localDateOf.k0(j4 / 7);
                            j3 = j4 % 7;
                        } else {
                            j2 = 1;
                            if (jLongValue2 < 1) {
                                localDateOf = localDateOf.k0(Math.subtractExact(jLongValue2, 7L) / 7);
                                j3 = (jLongValue2 + 6) % 7;
                            }
                            localDateA = localDateOf.k0(Math.subtractExact(jLongValue, j2)).a(jLongValue2, aVar);
                        }
                        jLongValue2 = j3 + j2;
                        localDateA = localDateOf.k0(Math.subtractExact(jLongValue, j2)).a(jLongValue2, aVar);
                    } else {
                        int iD0 = aVar.d0(l5.longValue());
                        if (jLongValue < 1 || jLongValue > 52) {
                            if (d2 == D.STRICT) {
                                g.h0(localDateOf).b(jLongValue, this);
                            } else {
                                C().b(jLongValue, this);
                            }
                        }
                        localDateA = localDateOf.k0(jLongValue - 1).a(iD0, aVar);
                    }
                    map.remove(this);
                    map.remove(pVar);
                    map.remove(aVar);
                    return localDateA;
                }
                throw new DateTimeException("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final s C() {
                return a.YEAR.C();
            }

            @Override // j$.time.temporal.p
            public final boolean a0(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.EPOCH_DAY)) {
                    return false;
                }
                p pVar = i.f69159a;
                return Chronology.G(temporalAccessor).equals(j$.time.chrono.p.f68978e);
            }

            @Override // j$.time.temporal.p
            public final long s(TemporalAccessor temporalAccessor) {
                if (!a0(temporalAccessor)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                return g.i0(LocalDate.C(temporalAccessor));
            }

            @Override // j$.time.temporal.p
            public final s L(TemporalAccessor temporalAccessor) {
                if (!a0(temporalAccessor)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                return C();
            }

            @Override // j$.time.temporal.p
            public final Temporal q(Temporal temporal, long j2) {
                if (!a0(temporal)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.C().a(j2, g.WEEK_BASED_YEAR);
                LocalDate localDateC = LocalDate.C(temporal);
                int iJ = localDateC.j(a.DAY_OF_WEEK);
                int iE0 = g.e0(localDateC);
                if (iE0 == 53 && g.j0(iA) == 52) {
                    iE0 = 52;
                }
                return temporal.m(LocalDate.of(iA, 1, 4).j0(((iE0 - 1) * 7) + (iJ - r6.j(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        f69156b = new g[]{gVar, gVar2, gVar3, gVar4};
        f69155a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static s h0(LocalDate localDate) {
        return s.j(1L, j0(i0(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j0(int i2) {
        LocalDate localDateOf = LocalDate.of(i2, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.R()) ? 53 : 52;
        }
        return 53;
    }

    static int e0(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iX = localDate.X() - 1;
        int i2 = (3 - iOrdinal) + iX;
        int i3 = i2 - ((i2 / 7) * 7);
        int i5 = i3 - 3;
        if (i5 < -3) {
            i5 = i3 + 4;
        }
        if (iX < i5) {
            return (int) s.j(1L, j0(i0(localDate.q0(180).l0(-1L)))).d();
        }
        int i7 = ((iX - i5) / 7) + 1;
        if (i7 != 53 || i5 == -3 || (i5 == -2 && localDate.R())) {
            return i7;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i0(LocalDate localDate) {
        int year = localDate.getYear();
        int iX = localDate.X();
        if (iX <= 3) {
            return iX - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iX >= 363) {
            return ((iX - 363) - (localDate.R() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
