package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.l, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDateTime f68921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f68922b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f68910c;
        ZoneOffset zoneOffset = ZoneOffset.f68927g;
        localDateTime.getClass();
        s(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f68911d;
        ZoneOffset zoneOffset2 = ZoneOffset.f68926f;
        localDateTime2.getClass();
        s(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime s(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime C(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.s().d(instant);
        return new OffsetDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    public static OffsetDateTime q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset zoneOffsetFrom = ZoneOffset.from(temporalAccessor);
            LocalDate localDate = (LocalDate) temporalAccessor.e(j$.time.temporal.q.b());
            LocalTime localTime = (LocalTime) temporalAccessor.e(j$.time.temporal.q.c());
            if (localDate != null && localTime != null) {
                return new OffsetDateTime(LocalDateTime.f0(localDate, localTime), zoneOffsetFrom);
            }
            return C(Instant.s(temporalAccessor), zoneOffsetFrom);
        } catch (DateTimeException e2) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
        }
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f69017g;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.parse(charSequence, new e(3));
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f68921a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f68922b = zoneOffset;
    }

    private OffsetDateTime Y(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f68921a == localDateTime && this.f68922b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
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
            return this.f68921a.l(pVar);
        }
        return pVar.L(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i2 = l.f69122a[((j$.time.temporal.a) pVar).ordinal()];
            if (i2 == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i2 == 2) {
                return this.f68922b.getTotalSeconds();
            }
            return this.f68921a.j(pVar);
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i2 = l.f69122a[((j$.time.temporal.a) pVar).ordinal()];
            ZoneOffset zoneOffset = this.f68922b;
            LocalDateTime localDateTime = this.f68921a;
            if (i2 == 1) {
                return localDateTime.toEpochSecond(zoneOffset);
            }
            if (i2 == 2) {
                return zoneOffset.getTotalSeconds();
            }
            return localDateTime.h(pVar);
        }
        return pVar.s(this);
    }

    public final ZoneOffset F() {
        return this.f68922b;
    }

    @Override // java.lang.Comparable
    public int compareTo(OffsetDateTime offsetDateTime) {
        int nano;
        ZoneOffset zoneOffset = offsetDateTime.f68922b;
        ZoneOffset zoneOffset2 = this.f68922b;
        if (zoneOffset2.equals(zoneOffset)) {
            nano = toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f68921a;
            long epochSecond = localDateTime.toEpochSecond(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime.f68922b;
            LocalDateTime localDateTime2 = offsetDateTime.f68921a;
            int iCompare = Long.compare(epochSecond, localDateTime2.toEpochSecond(zoneOffset3));
            nano = iCompare == 0 ? localDateTime.o().getNano() - localDateTime2.o().getNano() : iCompare;
        }
        return nano == 0 ? toLocalDateTime().compareTo(offsetDateTime.toLocalDateTime()) : nano;
    }

    public LocalDateTime toLocalDateTime() {
        return this.f68921a;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        LocalDateTime localDateTime = this.f68921a;
        ZoneOffset zoneOffset = this.f68922b;
        if (localDate != null) {
            return Y(localDateTime.m(localDate), zoneOffset);
        }
        return (OffsetDateTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j2, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i2 = l.f69122a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.f68922b;
            LocalDateTime localDateTime = this.f68921a;
            if (i2 == 1) {
                return C(Instant.ofEpochSecond(j2, localDateTime.C()), zoneOffset);
            }
            if (i2 == 2) {
                return Y(localDateTime, ZoneOffset.ofTotalSeconds(aVar.d0(j2)));
            }
            return Y(localDateTime.a(j2, pVar), zoneOffset);
        }
        return (OffsetDateTime) pVar.q(this, j2);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return Y(this.f68921a.b(j2, temporalUnit), this.f68922b);
        }
        return (OffsetDateTime) temporalUnit.q(this, j2);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j2, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.d() || temporalQuery == j$.time.temporal.q.f()) {
            return this.f68922b;
        }
        if (temporalQuery == j$.time.temporal.q.g()) {
            return null;
        }
        TemporalQuery temporalQueryB = j$.time.temporal.q.b();
        LocalDateTime localDateTime = this.f68921a;
        if (temporalQuery == temporalQueryB) {
            return localDateTime.k0();
        }
        if (temporalQuery == j$.time.temporal.q.c()) {
            return localDateTime.o();
        }
        if (temporalQuery == j$.time.temporal.q.a()) {
            return j$.time.chrono.p.f68978e;
        }
        if (temporalQuery == j$.time.temporal.q.e()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f68921a;
        return temporal.a(localDateTime.k0().toEpochDay(), aVar).a(localDateTime.o().i0(), j$.time.temporal.a.NANO_OF_DAY).a(this.f68922b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTimeQ = q(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = offsetDateTimeQ.f68922b;
            ZoneOffset zoneOffset2 = this.f68922b;
            if (!zoneOffset2.equals(zoneOffset)) {
                offsetDateTimeQ = new OffsetDateTime(offsetDateTimeQ.f68921a.i0(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()), zoneOffset2);
            }
            return this.f68921a.n(offsetDateTimeQ.f68921a, temporalUnit);
        }
        return temporalUnit.s(this, offsetDateTimeQ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f68921a.equals(offsetDateTime.f68921a) && this.f68922b.equals(offsetDateTime.f68922b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68921a.hashCode() ^ this.f68922b.hashCode();
    }

    public final String toString() {
        return this.f68921a.toString() + this.f68922b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        this.f68921a.p0(objectOutput);
        this.f68922b.g0(objectOutput);
    }

    static OffsetDateTime X(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f68910c;
        LocalDate localDate = LocalDate.MIN;
        return new OffsetDateTime(LocalDateTime.f0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.h0(objectInput)), ZoneOffset.f0(objectInput));
    }
}
