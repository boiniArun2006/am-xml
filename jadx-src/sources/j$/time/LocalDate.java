package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class LocalDate implements Temporal, j$.time.temporal.l, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f68907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f68908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f68909c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    public static LocalDate now() {
        return f0(Clock.b());
    }

    public static LocalDate f0(Clock clock) {
        Instant instant = clock.instant();
        ZoneId zoneIdA = clock.a();
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneIdA, "zone");
        return ofEpochDay(Math.floorDiv(instant.getEpochSecond() + ((long) zoneIdA.s().d(instant).getTotalSeconds()), 86400));
    }

    public static LocalDate g0(int i2, Month month, int i3) {
        j$.time.temporal.a.YEAR.e0(i2);
        j$.time.temporal.a.DAY_OF_MONTH.e0(i3);
        return s(i2, month.getValue(), i3);
    }

    public static LocalDate of(int i2, int i3, int i5) {
        j$.time.temporal.a.YEAR.e0(i2);
        j$.time.temporal.a.MONTH_OF_YEAR.e0(i3);
        j$.time.temporal.a.DAY_OF_MONTH.e0(i5);
        return s(i2, i3, i5);
    }

    public static LocalDate h0(int i2, int i3) {
        long j2 = i2;
        j$.time.temporal.a.YEAR.e0(j2);
        j$.time.temporal.a.DAY_OF_YEAR.e0(i3);
        boolean zE = j$.time.chrono.p.f68978e.E(j2);
        if (i3 == 366 && !zE) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        Month monthL = Month.L(((i3 - 1) / 31) + 1);
        if (i3 > (monthL.s(zE) + monthL.q(zE)) - 1) {
            monthL = monthL.X();
        }
        return new LocalDate(i2, monthL.getValue(), (i3 - monthL.q(zE)) + 1);
    }

    public static LocalDate ofEpochDay(long j2) {
        long j3;
        j$.time.temporal.a.EPOCH_DAY.e0(j2);
        long j4 = 719468 + j2;
        if (j4 < 0) {
            long j5 = ((j2 + 719469) / 146097) - 1;
            j3 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j3 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((j6 / 400) + (((j6 / 4) + (j6 * 365)) - (j6 / 100)));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        }
        int i2 = (int) j7;
        int i3 = ((i2 * 5) + 2) / 153;
        return new LocalDate(j$.time.temporal.a.YEAR.d0(j6 + j3 + ((long) (i3 / 10))), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate C(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.e(j$.time.temporal.q.b());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new e(0));
    }

    private static LocalDate s(int i2, int i3, int i5) {
        int i7 = 28;
        if (i5 > 28) {
            if (i3 != 2) {
                i7 = (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) ? 30 : 31;
            } else if (j$.time.chrono.p.f68978e.E(i2)) {
                i7 = 29;
            }
            if (i5 > i7) {
                if (i5 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i2 + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.L(i3).name() + " " + i5 + "'");
            }
        }
        return new LocalDate(i2, i3, i5);
    }

    private static LocalDate m0(int i2, int i3, int i5) {
        if (i3 == 2) {
            i5 = Math.min(i5, j$.time.chrono.p.f68978e.E((long) i2) ? 29 : 28);
        } else if (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) {
            i5 = Math.min(i5, 30);
        }
        return new LocalDate(i2, i3, i5);
    }

    private LocalDate(int i2, int i3, int i5) {
        this.f68907a = i2;
        this.f68908b = (short) i3;
        this.f68909c = (short) i5;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.L(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.Y()) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        int i2 = f.f68999a[aVar.ordinal()];
        if (i2 == 1) {
            return j$.time.temporal.s.j(1L, lengthOfMonth());
        }
        if (i2 == 2) {
            return j$.time.temporal.s.j(1L, M());
        }
        if (i2 != 3) {
            return i2 != 4 ? ((j$.time.temporal.a) pVar).C() : getYear() <= 0 ? j$.time.temporal.s.j(1L, 1000000000L) : j$.time.temporal.s.j(1L, 999999999L);
        }
        return j$.time.temporal.s.j(1L, (getMonth() != Month.FEBRUARY || R()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return L(pVar);
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.EPOCH_DAY) {
                return toEpochDay();
            }
            if (pVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return Y();
            }
            return L(pVar);
        }
        return pVar.s(this);
    }

    private int L(j$.time.temporal.p pVar) {
        int i2;
        int i3 = f.f68999a[((j$.time.temporal.a) pVar).ordinal()];
        short s2 = this.f68909c;
        int i5 = this.f68907a;
        switch (i3) {
            case 1:
                return s2;
            case 2:
                return X();
            case 3:
                i2 = (s2 - 1) / 7;
                break;
            case 4:
                return i5 >= 1 ? i5 : 1 - i5;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                i2 = (s2 - 1) % 7;
                break;
            case 7:
                return ((X() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((X() - 1) / 7) + 1;
            case 10:
                return this.f68908b;
            case 11:
                throw new j$.time.temporal.r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i5;
            case 13:
                return i5 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        return i2 + 1;
    }

    private long Y() {
        return ((((long) this.f68907a) * 12) + ((long) this.f68908b)) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology i() {
        return j$.time.chrono.p.f68978e;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j w() {
        return getYear() >= 1 ? j$.time.chrono.q.CE : j$.time.chrono.q.BCE;
    }

    public int getYear() {
        return this.f68907a;
    }

    public int getMonthValue() {
        return this.f68908b;
    }

    public Month getMonth() {
        return Month.L(this.f68908b);
    }

    public int getDayOfMonth() {
        return this.f68909c;
    }

    public final int X() {
        return (getMonth().q(R()) + this.f68909c) - 1;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.q(((int) Math.floorMod(toEpochDay() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean R() {
        return j$.time.chrono.p.f68978e.E(this.f68907a);
    }

    public int lengthOfMonth() {
        short s2 = this.f68908b;
        return s2 != 2 ? (s2 == 4 || s2 == 6 || s2 == 9 || s2 == 11) ? 30 : 31 : R() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int M() {
        return R() ? 366 : 365;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate m(j$.time.temporal.l lVar) {
        if (lVar instanceof LocalDate) {
            return (LocalDate) lVar;
        }
        return (LocalDate) lVar.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j2, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (LocalDate) pVar.q(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.e0(j2);
        int i2 = f.f68999a[aVar.ordinal()];
        int i3 = this.f68907a;
        switch (i2) {
            case 1:
                return p0((int) j2);
            case 2:
                return q0((int) j2);
            case 3:
                return k0(j2 - h(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i3 < 1) {
                    j2 = 1 - j2;
                }
                return r0((int) j2);
            case 5:
                return j0(j2 - ((long) getDayOfWeek().getValue()));
            case 6:
                return j0(j2 - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return j0(j2 - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j2);
            case 9:
                return k0(j2 - h(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i5 = (int) j2;
                if (this.f68908b != i5) {
                    j$.time.temporal.a.MONTH_OF_YEAR.e0(i5);
                    return m0(i3, i5, this.f68909c);
                }
                return this;
            case 11:
                return plusMonths(j2 - Y());
            case 12:
                return r0((int) j2);
            case 13:
                if (h(j$.time.temporal.a.ERA) != j2) {
                    return r0(1 - i3);
                }
                return this;
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
    }

    public final LocalDate r0(int i2) {
        if (this.f68907a == i2) {
            return this;
        }
        j$.time.temporal.a.YEAR.e0(i2);
        return m0(i2, this.f68908b, this.f68909c);
    }

    public final LocalDate p0(int i2) {
        return this.f68909c == i2 ? this : of(this.f68907a, this.f68908b, i2);
    }

    public final LocalDate q0(int i2) {
        return X() == i2 ? this : h0(this.f68907a, i2);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate Q(j$.time.temporal.o oVar) {
        if (oVar instanceof o) {
            return plusMonths(((o) oVar).d()).j0(r4.a());
        }
        Objects.requireNonNull(oVar, "amountToAdd");
        return (LocalDate) oVar.q(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.q(this, j2);
        }
        switch (f.f69000b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return j0(j2);
            case 2:
                return k0(j2);
            case 3:
                return plusMonths(j2);
            case 4:
                return l0(j2);
            case 5:
                return l0(Math.multiplyExact(j2, 10));
            case 6:
                return l0(Math.multiplyExact(j2, 100));
            case 7:
                return l0(Math.multiplyExact(j2, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(Math.addExact(h(aVar), j2), aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    public final LocalDate l0(long j2) {
        return j2 == 0 ? this : m0(j$.time.temporal.a.YEAR.d0(((long) this.f68907a) + j2), this.f68908b, this.f68909c);
    }

    public LocalDate plusMonths(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (((long) this.f68907a) * 12) + ((long) (this.f68908b - 1)) + j2;
        long j4 = 12;
        return m0(j$.time.temporal.a.YEAR.d0(Math.floorDiv(j3, j4)), ((int) Math.floorMod(j3, j4)) + 1, this.f68909c);
    }

    public final LocalDate k0(long j2) {
        return j0(Math.multiplyExact(j2, 7));
    }

    public final LocalDate j0(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = ((long) this.f68909c) + j2;
        if (j3 > 0) {
            short s2 = this.f68908b;
            int i2 = this.f68907a;
            if (j3 <= 28) {
                return new LocalDate(i2, s2, (int) j3);
            }
            if (j3 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j3 <= jLengthOfMonth) {
                    return new LocalDate(i2, s2, (int) j3);
                }
                if (s2 < 12) {
                    return new LocalDate(i2, s2 + 1, (int) (j3 - jLengthOfMonth));
                }
                int i3 = i2 + 1;
                j$.time.temporal.a.YEAR.e0(i3);
                return new LocalDate(i3, 1, (int) (j3 - jLengthOfMonth));
            }
        }
        return ofEpochDay(Math.addExact(toEpochDay(), j2));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j2, ChronoUnit chronoUnit) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j2, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.q.b() ? this : super.e(temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateC = C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.s(this, localDateC);
        }
        switch (f.f69000b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateC.toEpochDay() - toEpochDay();
            case 2:
                return (localDateC.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return e0(localDateC);
            case 4:
                return e0(localDateC) / 12;
            case 5:
                return e0(localDateC) / 120;
            case 6:
                return e0(localDateC) / 1200;
            case 7:
                return e0(localDateC) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return localDateC.h(aVar) - h(aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    private long e0(LocalDate localDate) {
        return (((localDate.Y() * 32) + ((long) localDate.getDayOfMonth())) - ((Y() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime N(LocalTime localTime) {
        return LocalDateTime.f0(this, localTime);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.f0(this, LocalTime.MIDNIGHT);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j2 = this.f68907a;
        long j3 = this.f68908b;
        long j4 = 365 * j2;
        long j5 = (((367 * j3) - 362) / 12) + (j2 >= 0 ? ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4 : j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))))) + ((long) (this.f68909c - 1));
        if (j3 > 2) {
            j5 = !R() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return q((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    final int q(LocalDate localDate) {
        int i2 = this.f68907a - localDate.f68907a;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f68908b - localDate.f68908b;
        return i3 == 0 ? this.f68909c - localDate.f68909c : i3;
    }

    public final boolean a0(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? q((LocalDate) chronoLocalDate) < 0 : toEpochDay() < chronoLocalDate.toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && q((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i2 = this.f68907a;
        return (((i2 << 11) + (this.f68908b << 6)) + this.f68909c) ^ (i2 & (-2048));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i2 = this.f68907a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        } else if (i2 < 0) {
            sb.append(i2 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i2 + 10000);
            sb.deleteCharAt(0);
        }
        short s2 = this.f68908b;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        short s3 = this.f68909c;
        sb.append(s3 < 10 ? "-0" : "-");
        sb.append((int) s3);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void s0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f68907a);
        dataOutput.writeByte(this.f68908b);
        dataOutput.writeByte(this.f68909c);
    }
}
