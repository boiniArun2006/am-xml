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
public final class t implements Temporal, j$.time.temporal.l, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f69138c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69140b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t tVar = (t) obj;
        int i2 = this.f69139a - tVar.f69139a;
        return i2 == 0 ? this.f69140b - tVar.f69140b : i2;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.o(j$.time.temporal.a.YEAR, 4, 10, E.EXCEEDS_PAD);
        dateTimeFormatterBuilder.e('-');
        dateTimeFormatterBuilder.n(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    public static t s(int i2, int i3) {
        j$.time.temporal.a.YEAR.e0(i2);
        j$.time.temporal.a.MONTH_OF_YEAR.e0(i3);
        return new t(i2, i3);
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        t tVarS;
        if (temporal instanceof t) {
            tVarS = (t) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.p.f68978e.equals(Chronology.G(temporal))) {
                    temporal = LocalDate.C(temporal);
                }
                tVarS = s(temporal.j(j$.time.temporal.a.YEAR), temporal.j(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (DateTimeException e2) {
                throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e2);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jQ2 = tVarS.q() - q();
            switch (s.f69137b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jQ2;
                case 2:
                    return jQ2 / 12;
                case 3:
                    return jQ2 / 120;
                case 4:
                    return jQ2 / 1200;
                case 5:
                    return jQ2 / 12000;
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return tVarS.h(aVar) - h(aVar);
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.s(this, tVarS);
    }

    private t(int i2, int i3) {
        this.f69139a = i2;
        this.f69140b = i3;
    }

    private t Y(int i2, int i3) {
        return (this.f69139a == i2 && this.f69140b == i3) ? this : new t(i2, i3);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.j(1L, this.f69139a <= 0 ? 1000000000L : 999999999L);
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
        int i2 = s.f69136a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            return this.f69140b;
        }
        if (i2 == 2) {
            return q();
        }
        int i3 = this.f69139a;
        if (i2 == 3) {
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return i3;
        }
        if (i2 == 4) {
            return i3;
        }
        if (i2 == 5) {
            return i3 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
    }

    private long q() {
        return ((((long) this.f69139a) * 12) + ((long) this.f69140b)) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        return (t) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final t a(long j2, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (t) pVar.q(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.e0(j2);
        int i2 = s.f69136a[aVar.ordinal()];
        int i3 = this.f69139a;
        if (i2 == 1) {
            int i5 = (int) j2;
            j$.time.temporal.a.MONTH_OF_YEAR.e0(i5);
            return Y(i3, i5);
        }
        if (i2 == 2) {
            return L(j2 - q());
        }
        int i7 = this.f69140b;
        if (i2 == 3) {
            if (i3 < 1) {
                j2 = 1 - j2;
            }
            int i8 = (int) j2;
            j$.time.temporal.a.YEAR.e0(i8);
            return Y(i8, i7);
        }
        if (i2 == 4) {
            int i9 = (int) j2;
            j$.time.temporal.a.YEAR.e0(i9);
            return Y(i9, i7);
        }
        if (i2 != 5) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        if (h(j$.time.temporal.a.ERA) == j2) {
            return this;
        }
        int i10 = 1 - i3;
        j$.time.temporal.a.YEAR.e0(i10);
        return Y(i10, i7);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final t b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (t) temporalUnit.q(this, j2);
        }
        switch (s.f69137b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return L(j2);
            case 2:
                return X(j2);
            case 3:
                return X(Math.multiplyExact(j2, 10));
            case 4:
                return X(Math.multiplyExact(j2, 100));
            case 5:
                return X(Math.multiplyExact(j2, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(Math.addExact(h(aVar), j2), aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    public final t X(long j2) {
        return j2 == 0 ? this : Y(j$.time.temporal.a.YEAR.d0(((long) this.f69139a) + j2), this.f69140b);
    }

    public final t L(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (((long) this.f69139a) * 12) + ((long) (this.f69140b - 1)) + j2;
        long j4 = 12;
        return Y(j$.time.temporal.a.YEAR.d0(Math.floorDiv(j3, j4)), ((int) Math.floorMod(j3, j4)) + 1);
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
            return ChronoUnit.MONTHS;
        }
        return super.e(temporalQuery);
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        if (!Chronology.G(temporal).equals(j$.time.chrono.p.f68978e)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.a(q(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f69139a == tVar.f69139a && this.f69140b == tVar.f69140b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f69140b << 27) ^ this.f69139a;
    }

    public final String toString() {
        int i2 = this.f69139a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i2);
        } else if (i2 < 0) {
            sb.append(i2 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i2 + 10000);
            sb.deleteCharAt(0);
        }
        int i3 = this.f69140b;
        sb.append(i3 < 10 ? "-0" : "-");
        sb.append(i3);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void d0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f69139a);
        dataOutput.writeByte(this.f69140b);
    }
}
