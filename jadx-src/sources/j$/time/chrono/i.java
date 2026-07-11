package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class i implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient C2185e f68958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ZoneOffset f68959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient ZoneId f68960c;

    static ChronoZonedDateTime s(ZoneId zoneId, ZoneOffset zoneOffset, C2185e c2185e) {
        Objects.requireNonNull(c2185e, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new i(zoneId, (ZoneOffset) zoneId, c2185e);
        }
        j$.time.zone.f fVarS = zoneId.s();
        LocalDateTime localDateTimeS = LocalDateTime.s(c2185e);
        List listG = fVarS.g(localDateTimeS);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarS.f(localDateTimeS);
            c2185e = c2185e.L(bVarF.C().getSeconds());
            zoneOffset = bVarF.L();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new i(zoneId, zoneOffset, c2185e);
    }

    static i C(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.s().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new i(zoneId, zoneOffsetD, (C2185e) chronology.c0(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    static i q(Chronology chronology, Temporal temporal) {
        i iVar = (i) temporal;
        if (chronology.equals(iVar.i())) {
            return iVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.u() + ", actual: " + iVar.i().u());
    }

    private i(ZoneId zoneId, ZoneOffset zoneOffset, C2185e c2185e) {
        Objects.requireNonNull(c2185e, "dateTime");
        this.f68958a = c2185e;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f68959b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.f68960c = zoneId;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset F() {
        return this.f68959b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime B() {
        return this.f68958a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId V() {
        return this.f68960c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime K(ZoneId zoneId) {
        return s(zoneId, this.f68959b, this.f68958a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime I(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f68960c.equals(zoneId)) {
            return this;
        }
        return C(i(), Instant.ofEpochSecond(this.f68958a.toEpochSecond(this.f68959b), r0.o().getNano()), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.a0(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime a(long j2, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i2 = h.f68957a[aVar.ordinal()];
            if (i2 == 1) {
                return b(j2 - T(), (TemporalUnit) ChronoUnit.SECONDS);
            }
            ZoneId zoneId = this.f68960c;
            C2185e c2185e = this.f68958a;
            if (i2 != 2) {
                return s(zoneId, this.f68959b, c2185e.a(j2, pVar));
            }
            return C(i(), Instant.ofEpochSecond(c2185e.toEpochSecond(ZoneOffset.ofTotalSeconds(aVar.d0(j2))), c2185e.o().getNano()), zoneId);
        }
        return q(i(), pVar.q(this, j2));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime b(long j2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m(this.f68958a.b(j2, temporalUnit));
        }
        return q(i(), temporalUnit.q(this, j2));
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeO = i().O(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f68958a.n(chronoZonedDateTimeO.I(this.f68959b).B(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.s(this, chronoZonedDateTimeO);
    }

    private Object writeReplace() {
        return new B((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f68958a);
        objectOutput.writeObject(this.f68959b);
        objectOutput.writeObject(this.f68960c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }

    public final int hashCode() {
        return (this.f68958a.hashCode() ^ this.f68959b.hashCode()) ^ Integer.rotateLeft(this.f68960c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f68958a.toString();
        ZoneOffset zoneOffset = this.f68959b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f68960c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }
}
