package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public abstract class AbstractC2181a implements Chronology {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f68943a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f68944b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Locale f68945c = new Locale("ja", "JP", "JP");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f68946d = 0;

    static Chronology L(AbstractC2181a abstractC2181a, String str) {
        String strW;
        Chronology chronology = (Chronology) f68943a.putIfAbsent(str, abstractC2181a);
        if (chronology == null && (strW = abstractC2181a.W()) != null) {
            f68944b.putIfAbsent(strW, abstractC2181a);
        }
        return chronology;
    }

    private static boolean s() {
        if (f68943a.get("ISO") != null) {
            return false;
        }
        l lVar = l.f68962n;
        L(lVar, lVar.u());
        s sVar = s.f68981e;
        L(sVar, sVar.u());
        x xVar = x.f68993e;
        L(xVar, xVar.u());
        D d2 = D.f68939e;
        L(d2, d2.u());
        try {
            for (AbstractC2181a abstractC2181a : Arrays.asList(new AbstractC2181a[0])) {
                if (!abstractC2181a.u().equals("ISO")) {
                    L(abstractC2181a, abstractC2181a.u());
                }
            }
            p pVar = p.f68978e;
            L(pVar, pVar.u());
            return true;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    static Chronology ofLocale(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(f68945c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return p.f68978e;
        }
        do {
            Chronology chronology = (Chronology) f68944b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
        } while (s());
        for (Chronology chronology2 : ServiceLoader.load(Chronology.class)) {
            if (unicodeLocaleType.equals(chronology2.W())) {
                return chronology2;
            }
        }
        throw new DateTimeException("Unknown calendar system: ".concat(unicodeLocaleType));
    }

    static Chronology C(String str) {
        Objects.requireNonNull(str, "id");
        do {
            Chronology chronology = (Chronology) f68943a.get(str);
            if (chronology == null) {
                chronology = (Chronology) f68944b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (s());
        for (Chronology chronology2 : ServiceLoader.load(Chronology.class)) {
            if (str.equals(chronology2.u()) || str.equals(chronology2.W())) {
                return chronology2;
            }
        }
        throw new DateTimeException("Unknown chronology: ".concat(str));
    }

    protected AbstractC2181a() {
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate U(Map map, j$.time.format.D d2) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return r(((Long) map.remove(aVar)).longValue());
        }
        Y(map, d2);
        ChronoLocalDate chronoLocalDateD0 = d0(map, d2);
        if (chronoLocalDateD0 != null) {
            return chronoLocalDateD0;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return a0(map, d2);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(aVar5)) {
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int iA = Z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (d2 == j$.time.format.D.LENIENT) {
                            return X(H(iA, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int iA2 = Z(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        ChronoLocalDate chronoLocalDateM = H(iA, iA2, 1).b((Z(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).m(new j$.time.temporal.m(DayOfWeek.q(Z(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                        if (d2 != j$.time.format.D.STRICT || chronoLocalDateM.j(aVar3) == iA2) {
                            return chronoLocalDateM;
                        }
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int iA3 = Z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (d2 == j$.time.format.D.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                        return H(iA3, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA4 = Z(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA5 = Z(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    ChronoLocalDate chronoLocalDateB = H(iA3, iA4, 1).b((Z(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((iA5 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (d2 != j$.time.format.D.STRICT || chronoLocalDateB.j(aVar3) == iA4) {
                        return chronoLocalDateB;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (!map.containsKey(aVar7)) {
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(aVar8)) {
                return null;
            }
            j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(aVar9)) {
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (!map.containsKey(aVar10)) {
                    return null;
                }
                int iA6 = Z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (d2 == j$.time.format.D.LENIENT) {
                    return X(A(iA6, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
                }
                ChronoLocalDate chronoLocalDateM2 = A(iA6, 1).b((Z(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).m(new j$.time.temporal.m(DayOfWeek.q(Z(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
                if (d2 != j$.time.format.D.STRICT || chronoLocalDateM2.j(aVar2) == iA6) {
                    return chronoLocalDateM2;
                }
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            int iA7 = Z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (d2 == j$.time.format.D.LENIENT) {
                return A(iA7, 1).b(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iA8 = Z(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
            ChronoLocalDate chronoLocalDateB2 = A(iA7, 1).b((Z(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (d2 != j$.time.format.D.STRICT || chronoLocalDateB2.j(aVar2) == iA7) {
                return chronoLocalDateB2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        int iA9 = Z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (d2 == j$.time.format.D.LENIENT) {
            return A(iA9, 1).b(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        return A(iA9, Z(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
    }

    void Y(Map map, j$.time.format.D d2) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            if (d2 != j$.time.format.D.LENIENT) {
                aVar.e0(l2.longValue());
            }
            ChronoLocalDate chronoLocalDateA = P().a(1L, (j$.time.temporal.p) j$.time.temporal.a.DAY_OF_MONTH).a(l2.longValue(), (j$.time.temporal.p) aVar);
            q(map, j$.time.temporal.a.MONTH_OF_YEAR, chronoLocalDateA.j(r0));
            q(map, j$.time.temporal.a.YEAR, chronoLocalDateA.j(r0));
        }
    }

    ChronoLocalDate d0(Map map, j$.time.format.D d2) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            Long l5 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (d2 != j$.time.format.D.LENIENT) {
                intExact = Z(aVar).a(l2.longValue(), aVar);
            } else {
                intExact = Math.toIntExact(l2.longValue());
            }
            if (l5 != null) {
                q(map, j$.time.temporal.a.YEAR, x(S(Z(r2).a(l5.longValue(), r2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar2)) {
                q(map, aVar2, x(A(Z(aVar2).a(((Long) map.get(aVar2)).longValue(), aVar2), 1).w(), intExact));
                return null;
            }
            if (d2 == j$.time.format.D.STRICT) {
                map.put(aVar, l2);
                return null;
            }
            if (D().isEmpty()) {
                q(map, aVar2, intExact);
                return null;
            }
            q(map, aVar2, x((j) r9.get(r9.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        Z(aVar3).b(((Long) map.get(aVar3)).longValue(), aVar3);
        return null;
    }

    ChronoLocalDate a0(Map map, j$.time.format.D d2) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = Z(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (d2 == j$.time.format.D.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return H(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = Z(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = Z(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (d2 != j$.time.format.D.SMART) {
            return H(iA, iA2, iA3);
        }
        try {
            return H(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return H(iA, iA2, 1).m(new j$.time.temporal.n(0));
        }
    }

    static ChronoLocalDate X(ChronoLocalDate chronoLocalDate, long j2, long j3, long j4) {
        long j5;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate.b(j2, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateB2 = chronoLocalDateB.b(j3, (TemporalUnit) chronoUnit);
        if (j4 > 7) {
            long j6 = j4 - 1;
            chronoLocalDateB2 = chronoLocalDateB2.b(j6 / 7, (TemporalUnit) chronoUnit);
            j5 = j6 % 7;
        } else {
            if (j4 < 1) {
                chronoLocalDateB2 = chronoLocalDateB2.b(Math.subtractExact(j4, 7L) / 7, (TemporalUnit) chronoUnit);
                j5 = (j4 + 6) % 7;
            }
            return chronoLocalDateB2.m(new j$.time.temporal.m(DayOfWeek.q((int) j4).getValue(), 0));
        }
        j4 = j5 + 1;
        return chronoLocalDateB2.m(new j$.time.temporal.m(DayOfWeek.q((int) j4).getValue(), 0));
    }

    static void q(Map map, j$.time.temporal.a aVar, long j2) {
        Long l2 = (Long) map.get(aVar);
        if (l2 != null && l2.longValue() != j2) {
            throw new DateTimeException("Conflict found: " + aVar + " " + l2 + " differs from " + aVar + " " + j2);
        }
        map.put(aVar, Long.valueOf(j2));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Chronology chronology) {
        return u().compareTo(chronology.u());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC2181a) && compareTo((AbstractC2181a) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getClass().hashCode() ^ u().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return u();
    }
}
