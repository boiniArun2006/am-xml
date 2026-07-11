package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class n implements Temporal, j$.time.temporal.l, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalTime f69124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f69125b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        boolean zEquals = this.f69125b.equals(nVar.f69125b);
        LocalTime localTime = this.f69124a;
        LocalTime localTime2 = nVar.f69124a;
        if (zEquals) {
            return localTime.compareTo(localTime2);
        }
        int iCompare = Long.compare(C(), nVar.C());
        return iCompare == 0 ? localTime.compareTo(localTime2) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.f68927g;
        localTime.getClass();
        new n(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f68926f;
        localTime2.getClass();
        new n(localTime2, zoneOffset2);
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        n nVar;
        if (temporal instanceof n) {
            nVar = (n) temporal;
        } else {
            try {
                nVar = new n(LocalTime.s(temporal), ZoneOffset.from(temporal));
            } catch (DateTimeException e2) {
                throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e2);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jC = nVar.C() - C();
            switch (m.f69123a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jC;
                case 2:
                    return jC / 1000;
                case 3:
                    return jC / 1000000;
                case 4:
                    return jC / 1000000000;
                case 5:
                    return jC / 60000000000L;
                case 6:
                    return jC / 3600000000000L;
                case 7:
                    return jC / 43200000000000L;
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.s(this, nVar);
    }

    private n(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.f69124a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f69125b = zoneOffset;
    }

    private n L(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f69124a == localTime && this.f69125b.equals(zoneOffset)) ? this : new n(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).f0() || pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).C();
            }
            return this.f69124a.l(pVar);
        }
        return pVar.L(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f69125b.getTotalSeconds();
            }
            return this.f69124a.h(pVar);
        }
        return pVar.s(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        return (n) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j2, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            LocalTime localTime = this.f69124a;
            if (pVar == aVar) {
                return L(localTime, ZoneOffset.ofTotalSeconds(((j$.time.temporal.a) pVar).d0(j2)));
            }
            return L(localTime.a(j2, pVar), this.f69125b);
        }
        return (n) pVar.q(this, j2);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final n b(long j2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return L(this.f69124a.b(j2, temporalUnit), this.f69125b);
        }
        return (n) temporalUnit.q(this, j2);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j2, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.d() || temporalQuery == j$.time.temporal.q.f()) {
            return this.f69125b;
        }
        if (((temporalQuery == j$.time.temporal.q.g()) || (temporalQuery == j$.time.temporal.q.a())) || temporalQuery == j$.time.temporal.q.b()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.c()) {
            return this.f69124a;
        }
        if (temporalQuery == j$.time.temporal.q.e()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.f69124a.i0(), j$.time.temporal.a.NANO_OF_DAY).a(this.f69125b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    private long C() {
        return this.f69124a.i0() - (((long) this.f69125b.getTotalSeconds()) * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f69124a.equals(nVar.f69124a) && this.f69125b.equals(nVar.f69125b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f69124a.hashCode() ^ this.f69125b.hashCode();
    }

    public final String toString() {
        return this.f69124a.toString() + this.f69125b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f69124a.l0(objectOutput);
        this.f69125b.g0(objectOutput);
    }

    static n s(ObjectInput objectInput) {
        return new n(LocalTime.h0(objectInput), ZoneOffset.f0(objectInput));
    }
}
