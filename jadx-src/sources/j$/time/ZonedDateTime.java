package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDateTime f68930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f68931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZoneId f68932c;

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j2, chronoUnit);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        a aVar;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            aVar = a.f68933b;
        } else {
            aVar = new a(zoneId);
        }
        Objects.requireNonNull(aVar, "clock");
        return ofInstant(aVar.instant(), aVar.a());
    }

    public static ZonedDateTime C(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarS = zoneId.s();
        List listG = fVarS.g(localDateTime);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarS.f(localDateTime);
            localDateTime = localDateTime.i0(bVarF.C().getSeconds());
            zoneOffset = bVarF.L();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return q(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    private ZonedDateTime X(LocalDateTime localDateTime) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        ZoneOffset zoneOffset = this.f68931b;
        Objects.requireNonNull(zoneOffset, "offset");
        ZoneId zoneId = this.f68932c;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.s().g(localDateTime).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        return q(localDateTime.toEpochSecond(zoneOffset), localDateTime.C(), zoneId);
    }

    private static ZonedDateTime q(long j2, int i2, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.s().d(Instant.ofEpochSecond(j2, i2));
        return new ZonedDateTime(LocalDateTime.ofEpochSecond(j2, i2, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime s(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId zoneIdQ = ZoneId.q(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            if (!temporal.g(aVar)) {
                return C(LocalDateTime.f0(LocalDate.C(temporal), LocalTime.s(temporal)), zoneIdQ, null);
            }
            return q(temporal.h(aVar), temporal.j(j$.time.temporal.a.NANO_OF_SECOND), zoneIdQ);
        } catch (DateTimeException e2) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e2);
        }
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f68930a = localDateTime;
        this.f68931b = zoneOffset;
        this.f68932c = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).C();
            }
            return this.f68930a.l(pVar);
        }
        return pVar.L(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i2 = v.f69194a[((j$.time.temporal.a) pVar).ordinal()];
            if (i2 == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i2 == 2) {
                return this.f68931b.getTotalSeconds();
            }
            return this.f68930a.j(pVar);
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i2 = v.f69194a[((j$.time.temporal.a) pVar).ordinal()];
            if (i2 == 1) {
                return T();
            }
            if (i2 == 2) {
                return this.f68931b.getTotalSeconds();
            }
            return this.f68930a.h(pVar);
        }
        return pVar.s(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset F() {
        return this.f68931b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId V() {
        return this.f68932c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime K(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f68932c.equals(zoneId) ? this : C(this.f68930a, zoneId, this.f68931b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: withZoneSameInstant, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime I(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f68932c.equals(zoneId)) {
            return this;
        }
        ZoneOffset zoneOffset = this.f68931b;
        LocalDateTime localDateTime = this.f68930a;
        return q(localDateTime.toEpochSecond(zoneOffset), localDateTime.C(), zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime B() {
        return this.f68930a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate p() {
        return this.f68930a.k0();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime o() {
        return this.f68930a.o();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime m(LocalDate localDate) {
        ZoneOffset zoneOffset = this.f68931b;
        LocalDateTime localDateTime = this.f68930a;
        ZoneId zoneId = this.f68932c;
        if (localDate != null) {
            return C(LocalDateTime.f0(localDate, localDateTime.o()), zoneId, zoneOffset);
        }
        return (ZonedDateTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime a(long j2, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i2 = v.f69194a[aVar.ordinal()];
            LocalDateTime localDateTime = this.f68930a;
            ZoneId zoneId = this.f68932c;
            if (i2 == 1) {
                return q(j2, localDateTime.C(), zoneId);
            }
            ZoneOffset zoneOffset = this.f68931b;
            if (i2 != 2) {
                return C(localDateTime.a(j2, pVar), zoneId, zoneOffset);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(aVar.d0(j2));
            return (zoneOffsetOfTotalSeconds.equals(zoneOffset) || !zoneId.s().g(localDateTime).contains(zoneOffsetOfTotalSeconds)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetOfTotalSeconds);
        }
        return (ZonedDateTime) pVar.q(this, j2);
    }

    public ZonedDateTime withDayOfMonth(int i2) {
        return C(this.f68930a.o0(i2), this.f68932c, this.f68931b);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime b(long j2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            boolean z2 = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
            LocalDateTime localDateTime = this.f68930a;
            if (z2) {
                return C(localDateTime.b(j2, temporalUnit), this.f68932c, this.f68931b);
            }
            return X(localDateTime.b(j2, temporalUnit));
        }
        return (ZonedDateTime) temporalUnit.q(this, j2);
    }

    public ZonedDateTime plusSeconds(long j2) {
        return X(this.f68930a.i0(j2));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: k */
    public final ChronoZonedDateTime d(long j2, ChronoUnit chronoUnit) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j2, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.b()) {
            return p();
        }
        return super.e(temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeS = s(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime zonedDateTimeI = zonedDateTimeS.I(this.f68932c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
            LocalDateTime localDateTime = this.f68930a;
            if (iCompareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return localDateTime.n(zonedDateTimeI.f68930a, temporalUnit);
            }
            return OffsetDateTime.s(localDateTime, this.f68931b).n(OffsetDateTime.s(zonedDateTimeI.f68930a, zonedDateTimeI.f68931b), temporalUnit);
        }
        return temporalUnit.s(this, zonedDateTimeS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f68930a.equals(zonedDateTime.f68930a) && this.f68931b.equals(zonedDateTime.f68931b) && this.f68932c.equals(zonedDateTime.f68932c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f68930a.hashCode() ^ this.f68931b.hashCode()) ^ Integer.rotateLeft(this.f68932c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f68930a.toString();
        ZoneOffset zoneOffset = this.f68931b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f68932c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new p((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void d0(DataOutput dataOutput) throws IOException {
        this.f68930a.p0(dataOutput);
        this.f68931b.g0(dataOutput);
        this.f68932c.Y((ObjectOutput) dataOutput);
    }

    static ZonedDateTime L(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.f68910c;
        LocalDate localDate = LocalDate.MIN;
        LocalDateTime localDateTimeF0 = LocalDateTime.f0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.h0(objectInput));
        ZoneOffset zoneOffsetF0 = ZoneOffset.f0(objectInput);
        ZoneId zoneId = (ZoneId) p.a(objectInput);
        Objects.requireNonNull(zoneOffsetF0, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !zoneOffsetF0.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(localDateTimeF0, zoneId, zoneOffsetF0);
    }
}
