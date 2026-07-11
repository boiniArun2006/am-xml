package j$.time;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.signals.SignalManager;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.l, ChronoLocalDateTime<LocalDate>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f68910c = f0(LocalDate.MIN, LocalTime.MIN);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f68911d = f0(LocalDate.MAX, LocalTime.MAX);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDate f68912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocalTime f68913b;

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j2, chronoUnit);
    }

    public static LocalDateTime now() {
        Clock clockB = Clock.b();
        Instant instant = clockB.instant();
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), clockB.a().s().d(instant));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime J(ZoneId zoneId) {
        return ZonedDateTime.C(this, zoneId, null);
    }

    public static LocalDateTime d0(int i2) {
        return new LocalDateTime(LocalDate.of(i2, 12, 31), LocalTime.L(0));
    }

    public static LocalDateTime e0(int i2, int i3, int i5, int i7, int i8, int i9) {
        return new LocalDateTime(LocalDate.of(i2, i3, i5), LocalTime.of(i7, i8, i9, 0));
    }

    public static LocalDateTime f0(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofEpochSecond(long j2, int i2, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j3 = i2;
        j$.time.temporal.a.NANO_OF_SECOND.e0(j3);
        long totalSeconds = j2 + ((long) zoneOffset.getTotalSeconds());
        long j4 = 86400;
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(totalSeconds, j4)), LocalTime.X((((long) ((int) Math.floorMod(totalSeconds, j4))) * 1000000000) + j3));
    }

    public static LocalDateTime s(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).B();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.C(temporalAccessor), LocalTime.s(temporalAccessor));
        } catch (DateTimeException e2) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
        }
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.parse(charSequence, new e(1));
    }

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f68912a = localDate;
        this.f68913b = localTime;
    }

    private LocalDateTime n0(LocalDate localDate, LocalTime localTime) {
        return (this.f68912a == localDate && this.f68913b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.a0(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.Y() || aVar.f0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).f0() ? this.f68913b.l(pVar) : this.f68912a.l(pVar);
        }
        return pVar.L(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).f0() ? this.f68913b.j(pVar) : this.f68912a.j(pVar);
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).f0() ? this.f68913b.h(pVar) : this.f68912a.h(pVar);
        }
        return pVar.s(this);
    }

    private int q(LocalDateTime localDateTime) {
        int iQ = this.f68912a.q(localDateTime.f68912a);
        return iQ == 0 ? this.f68913b.compareTo(localDateTime.f68913b) : iQ;
    }

    public final LocalDate k0() {
        return this.f68912a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate p() {
        return this.f68912a;
    }

    public final int X() {
        return this.f68912a.getYear();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime o() {
        return this.f68913b;
    }

    public final int L() {
        return this.f68913b.getSecond();
    }

    public final int C() {
        return this.f68913b.getNano();
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime m(LocalDate localDate) {
        if (localDate != null) {
            return n0(localDate, this.f68913b);
        }
        return (LocalDateTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j2, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            boolean zF0 = ((j$.time.temporal.a) pVar).f0();
            LocalTime localTime = this.f68913b;
            LocalDate localDate = this.f68912a;
            if (zF0) {
                return n0(localDate, localTime.a(j2, pVar));
            }
            return n0(localDate.a(j2, pVar), localTime);
        }
        return (LocalDateTime) pVar.q(this, j2);
    }

    public final LocalDateTime o0(int i2) {
        return n0(this.f68912a.p0(i2), this.f68913b);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.q(this, j2);
        }
        switch (g.f69115a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return j0(this.f68912a, 0L, 0L, 0L, j2);
            case 2:
                LocalDateTime localDateTimeH0 = h0(j2 / 86400000000L);
                return localDateTimeH0.j0(localDateTimeH0.f68912a, 0L, 0L, 0L, (j2 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeH02 = h0(j2 / SignalManager.TWENTY_FOUR_HOURS_MILLIS);
                return localDateTimeH02.j0(localDateTimeH02.f68912a, 0L, 0L, 0L, (j2 % SignalManager.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
            case 4:
                return i0(j2);
            case 5:
                return j0(this.f68912a, 0L, j2, 0L, 0L);
            case 6:
                return j0(this.f68912a, j2, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeH03 = h0(j2 / 256);
                return localDateTimeH03.j0(localDateTimeH03.f68912a, (j2 % 256) * 12, 0L, 0L, 0L);
            default:
                return n0(this.f68912a.b(j2, temporalUnit), this.f68913b);
        }
    }

    public final LocalDateTime h0(long j2) {
        return n0(this.f68912a.j0(j2), this.f68913b);
    }

    public final LocalDateTime i0(long j2) {
        return j0(this.f68912a, 0L, 0L, j2, 0L);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: k */
    public final ChronoLocalDateTime d(long j2, ChronoUnit chronoUnit) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j2, chronoUnit);
    }

    private LocalDateTime j0(LocalDate localDate, long j2, long j3, long j4, long j5) {
        long j6 = j2 | j3 | j4 | j5;
        LocalTime localTimeX = this.f68913b;
        if (j6 == 0) {
            return n0(localDate, localTimeX);
        }
        long j7 = j2 / 24;
        long j9 = j7 + (j3 / 1440) + (j4 / 86400) + (j5 / 86400000000000L);
        long j10 = 1;
        long j11 = ((j2 % 24) * 3600000000000L) + ((j3 % 1440) * 60000000000L) + ((j4 % 86400) * 1000000000) + (j5 % 86400000000000L);
        long jI0 = localTimeX.i0();
        long j12 = (j11 * j10) + jI0;
        long jFloorDiv = Math.floorDiv(j12, 86400000000000L) + (j9 * j10);
        long jFloorMod = Math.floorMod(j12, 86400000000000L);
        if (jFloorMod != jI0) {
            localTimeX = LocalTime.X(jFloorMod);
        }
        return n0(localDate.j0(jFloorDiv), localTimeX);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.b()) {
            return this.f68912a;
        }
        return super.e(temporalQuery);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        ChronoLocalDate chronoLocalDateJ0;
        long jMultiplyExact;
        long j2;
        LocalDateTime localDateTimeS = s(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.s(this, localDateTimeS);
        }
        boolean z2 = ((ChronoUnit) temporalUnit).compareTo(ChronoUnit.DAYS) < 0;
        LocalTime localTime = this.f68913b;
        LocalDate localDate = this.f68912a;
        if (!z2) {
            LocalDate localDate2 = localDateTimeS.f68912a;
            localDate2.getClass();
            LocalTime localTime2 = localDateTimeS.f68913b;
            if (localDate == null ? localDate2.toEpochDay() <= localDate.toEpochDay() : localDate2.q(localDate) <= 0) {
                boolean zA0 = localDate2.a0(localDate);
                chronoLocalDateJ0 = localDate2;
                if (zA0) {
                    chronoLocalDateJ0 = localDate2;
                    if (localTime2.compareTo(localTime) > 0) {
                        chronoLocalDateJ0 = localDate2.j0(1L);
                    }
                }
            } else if (localTime2.compareTo(localTime) < 0) {
                chronoLocalDateJ0 = localDate2.j0(-1L);
            }
            return localDate.n(chronoLocalDateJ0, temporalUnit);
        }
        LocalDate localDate3 = localDateTimeS.f68912a;
        localDate.getClass();
        long epochDay = localDate3.toEpochDay() - localDate.toEpochDay();
        LocalTime localTime3 = localDateTimeS.f68913b;
        if (epochDay == 0) {
            return localTime.n(localTime3, temporalUnit);
        }
        long jI0 = localTime3.i0() - localTime.i0();
        if (epochDay > 0) {
            jMultiplyExact = epochDay - 1;
            j2 = jI0 + 86400000000000L;
        } else {
            jMultiplyExact = epochDay + 1;
            j2 = jI0 - 86400000000000L;
        }
        switch (g.f69115a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j2 /= 1000;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, SignalManager.TWENTY_FOUR_HOURS_MILLIS);
                j2 /= 1000000;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400);
                j2 /= 1000000000;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440);
                j2 /= 60000000000L;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24);
                j2 /= 3600000000000L;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2);
                j2 /= 43200000000000L;
                break;
        }
        return Math.addExact(jMultiplyExact, j2);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    /* JADX INFO: renamed from: b0 */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return q((LocalDateTime) chronoLocalDateTime);
        }
        return super.compareTo(chronoLocalDateTime);
    }

    public final boolean Y(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return q(localDateTime) > 0;
        }
        long epochDay = this.f68912a.toEpochDay();
        long epochDay2 = localDateTime.f68912a.toEpochDay();
        if (epochDay <= epochDay2) {
            return epochDay == epochDay2 && this.f68913b.i0() > localDateTime.f68913b.i0();
        }
        return true;
    }

    public final boolean a0(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return q(localDateTime) < 0;
        }
        long epochDay = this.f68912a.toEpochDay();
        long epochDay2 = localDateTime.f68912a.toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.f68913b.i0() < localDateTime.f68913b.i0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f68912a.equals(localDateTime.f68912a) && this.f68913b.equals(localDateTime.f68913b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f68912a.hashCode() ^ this.f68913b.hashCode();
    }

    public final String toString() {
        return this.f68912a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.f68913b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void p0(DataOutput dataOutput) {
        this.f68912a.s0(dataOutput);
        this.f68913b.l0(dataOutput);
    }
}
