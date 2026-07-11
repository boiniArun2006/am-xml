package j$.time;

import com.caoccao.javet.interop.engine.JavetEngineConfig;
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
public final class Instant implements Temporal, j$.time.temporal.l, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f68905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f68906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f68904c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant C(long j2) {
        return q(j2, 0);
    }

    public static Instant ofEpochSecond(long j2, long j3) {
        return q(Math.addExact(j2, Math.floorDiv(j3, 1000000000L)), (int) Math.floorMod(j3, 1000000000L));
    }

    public static Instant ofEpochMilli(long j2) {
        long j3 = 1000;
        return q(Math.floorDiv(j2, j3), ((int) Math.floorMod(j2, j3)) * 1000000);
    }

    public static Instant s(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.h(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.j(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (DateTimeException e2) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
        }
    }

    private static Instant q(long j2, int i2) {
        if ((((long) i2) | j2) == 0) {
            return f68904c;
        }
        if (j2 < -31557014167219200L || j2 > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j2, i2);
    }

    private Instant(long j2, int i2) {
        this.f68905a = j2;
        this.f68906b = i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND : pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return super.l(pVar).a(pVar.s(this), pVar);
        }
        int i2 = d.f68996a[((j$.time.temporal.a) pVar).ordinal()];
        int i3 = this.f68906b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            return i3 / 1000;
        }
        if (i2 == 3) {
            return i3 / 1000000;
        }
        if (i2 == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.d0(this.f68905a);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        int i2;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.s(this);
        }
        int i3 = d.f68996a[((j$.time.temporal.a) pVar).ordinal()];
        int i5 = this.f68906b;
        if (i3 == 1) {
            return i5;
        }
        if (i3 == 2) {
            i2 = i5 / 1000;
        } else {
            if (i3 != 3) {
                if (i3 == 4) {
                    return this.f68905a;
                }
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
            }
            i2 = i5 / 1000000;
        }
        return i2;
    }

    public long getEpochSecond() {
        return this.f68905a;
    }

    public int getNano() {
        return this.f68906b;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        return (Instant) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j2, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.q(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.e0(j2);
        int i2 = d.f68996a[aVar.ordinal()];
        int i3 = this.f68906b;
        long j3 = this.f68905a;
        if (i2 != 1) {
            if (i2 == 2) {
                int i5 = ((int) j2) * 1000;
                if (i5 != i3) {
                    return q(j3, i5);
                }
            } else if (i2 == 3) {
                int i7 = ((int) j2) * 1000000;
                if (i7 != i3) {
                    return q(j3, i7);
                }
            } else {
                if (i2 != 4) {
                    throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
                }
                if (j2 != j3) {
                    return q(j2, i3);
                }
            }
        } else if (j2 != i3) {
            return q(j3, (int) j2);
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.q(this, j2);
        }
        switch (d.f68997b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return L(0L, j2);
            case 2:
                return L(j2 / 1000000, (j2 % 1000000) * 1000);
            case 3:
                return L(j2 / 1000, (j2 % 1000) * 1000000);
            case 4:
                return L(j2, 0L);
            case 5:
                return L(Math.multiplyExact(j2, 60), 0L);
            case 6:
                return L(Math.multiplyExact(j2, JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS), 0L);
            case 7:
                return L(Math.multiplyExact(j2, 43200), 0L);
            case 8:
                return L(Math.multiplyExact(j2, 86400), 0L);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    private Instant L(long j2, long j3) {
        if ((j2 | j3) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.f68905a, j2), j3 / 1000000000), ((long) this.f68906b) + (j3 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j2, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.e()) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery == j$.time.temporal.q.a() || temporalQuery == j$.time.temporal.q.g() || temporalQuery == j$.time.temporal.q.f() || temporalQuery == j$.time.temporal.q.d() || temporalQuery == j$.time.temporal.q.b() || temporalQuery == j$.time.temporal.q.c()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.f68905a, j$.time.temporal.a.INSTANT_SECONDS).a(this.f68906b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantS = s(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            int i2 = d.f68997b[((ChronoUnit) temporalUnit).ordinal()];
            int i3 = this.f68906b;
            long j2 = this.f68905a;
            switch (i2) {
                case 1:
                    return Math.addExact(Math.multiplyExact(Math.subtractExact(instantS.f68905a, j2), 1000000000L), instantS.f68906b - i3);
                case 2:
                    return Math.addExact(Math.multiplyExact(Math.subtractExact(instantS.f68905a, j2), 1000000000L), instantS.f68906b - i3) / 1000;
                case 3:
                    return Math.subtractExact(instantS.toEpochMilli(), toEpochMilli());
                case 4:
                    return Y(instantS);
                case 5:
                    return Y(instantS) / 60;
                case 6:
                    return Y(instantS) / 3600;
                case 7:
                    return Y(instantS) / 43200;
                case 8:
                    return Y(instantS) / 86400;
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.s(this, instantS);
    }

    private long Y(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.f68905a, this.f68905a);
        long j2 = instant.f68906b - this.f68906b;
        return (jSubtractExact <= 0 || j2 >= 0) ? (jSubtractExact >= 0 || j2 <= 0) ? jSubtractExact : jSubtractExact + 1 : jSubtractExact - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.C(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    public long toEpochMilli() {
        long j2 = this.f68905a;
        return (j2 >= 0 || this.f68906b <= 0) ? Math.addExact(Math.multiplyExact(j2, 1000), r5 / 1000000) : Math.addExact(Math.multiplyExact(j2 + 1, 1000), (r5 / 1000000) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.f68905a, instant.f68905a);
        return iCompare != 0 ? iCompare : this.f68906b - instant.f68906b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f68905a == instant.f68905a && this.f68906b == instant.f68906b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f68905a;
        return (this.f68906b * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.f69018h.a(this);
    }

    private Object writeReplace() {
        return new p((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void a0(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f68905a);
        dataOutput.writeInt(this.f68906b);
    }
}
