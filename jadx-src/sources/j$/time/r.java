package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.E;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class r implements Temporal, j$.time.temporal.l, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f69134b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69135a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f69135a - ((r) obj).f69135a;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.o(j$.time.temporal.a.YEAR, 4, 10, E.EXCEEDS_PAD);
        dateTimeFormatterBuilder.toFormatter();
    }

    public static r q(int i2) {
        j$.time.temporal.a.YEAR.e0(i2);
        return new r(i2);
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        r rVarQ;
        if (temporal instanceof r) {
            rVarQ = (r) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.p.f68978e.equals(Chronology.G(temporal))) {
                    temporal = LocalDate.C(temporal);
                }
                rVarQ = q(temporal.j(j$.time.temporal.a.YEAR));
            } catch (DateTimeException e2) {
                throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e2);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j2 = ((long) rVarQ.f69135a) - ((long) this.f69135a);
            int i2 = q.f69133b[((ChronoUnit) temporalUnit).ordinal()];
            if (i2 == 1) {
                return j2;
            }
            if (i2 == 2) {
                return j2 / 10;
            }
            if (i2 == 3) {
                return j2 / 100;
            }
            if (i2 == 4) {
                return j2 / 1000;
            }
            if (i2 == 5) {
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return rVarQ.h(aVar) - h(aVar);
            }
            throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.s(this, rVarQ);
    }

    private r(int i2) {
        this.f69135a = i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.j(1L, this.f69135a <= 0 ? 1000000000L : 999999999L);
        }
        return super.l(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        return l(pVar).a(h(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.s(this);
        }
        int i2 = q.f69132a[((j$.time.temporal.a) pVar).ordinal()];
        int i3 = this.f69135a;
        if (i2 == 1) {
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return i3;
        }
        if (i2 == 2) {
            return i3;
        }
        if (i2 == 3) {
            return i3 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        return (r) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final r a(long j2, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (r) pVar.q(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.e0(j2);
        int i2 = q.f69132a[aVar.ordinal()];
        int i3 = this.f69135a;
        if (i2 == 1) {
            if (i3 < 1) {
                j2 = 1 - j2;
            }
            return q((int) j2);
        }
        if (i2 == 2) {
            return q((int) j2);
        }
        if (i2 == 3) {
            return h(j$.time.temporal.a.ERA) == j2 ? this : q(1 - i3);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final r b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (r) temporalUnit.q(this, j2);
        }
        int i2 = q.f69133b[((ChronoUnit) temporalUnit).ordinal()];
        if (i2 == 1) {
            return C(j2);
        }
        if (i2 == 2) {
            return C(Math.multiplyExact(j2, 10));
        }
        if (i2 == 3) {
            return C(Math.multiplyExact(j2, 100));
        }
        if (i2 == 4) {
            return C(Math.multiplyExact(j2, 1000));
        }
        if (i2 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return a(Math.addExact(h(aVar), j2), aVar);
        }
        throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
    }

    public final r C(long j2) {
        return j2 == 0 ? this : q(j$.time.temporal.a.YEAR.d0(((long) this.f69135a) + j2));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j2, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.a()) {
            return j$.time.chrono.p.f68978e;
        }
        if (temporalQuery == j$.time.temporal.q.e()) {
            return ChronoUnit.YEARS;
        }
        return super.e(temporalQuery);
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        if (!Chronology.G(temporal).equals(j$.time.chrono.p.f68978e)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.a(this.f69135a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            if (this.f69135a == ((r) obj).f69135a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f69135a;
    }

    public final String toString() {
        return Integer.toString(this.f69135a);
    }

    private Object writeReplace() {
        return new p((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void X(DataOutput dataOutput) {
        dataOutput.writeInt(this.f69135a);
    }
}
