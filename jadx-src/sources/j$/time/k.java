package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class k implements TemporalAccessor, j$.time.temporal.l, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69121b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        int i2 = this.f69120a - kVar.f69120a;
        return i2 == 0 ? this.f69121b - kVar.f69121b : i2;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f("--");
        dateTimeFormatterBuilder.n(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.e('-');
        dateTimeFormatterBuilder.n(j$.time.temporal.a.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    private k(int i2, int i3) {
        this.f69120a = i2;
        this.f69121b = i3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH : pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.C();
        }
        if (pVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.l(pVar);
        }
        Month monthL = Month.L(this.f69120a);
        monthL.getClass();
        int i2 = i.f69118a[monthL.ordinal()];
        return j$.time.temporal.s.k(1L, i2 != 1 ? (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31 : 28, Month.L(r8).C());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        return l(pVar).a(h(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        int i2;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.s(this);
        }
        int i3 = j.f69119a[((j$.time.temporal.a) pVar).ordinal()];
        if (i3 == 1) {
            i2 = this.f69121b;
        } else {
            if (i3 != 2) {
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
            }
            i2 = this.f69120a;
        }
        return i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.a()) {
            return j$.time.chrono.p.f68978e;
        }
        return super.e(temporalQuery);
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        if (!Chronology.G(temporal).equals(j$.time.chrono.p.f68978e)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        Temporal temporalA = temporal.a(this.f69120a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalA.a(Math.min(temporalA.l(aVar).d(), this.f69121b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f69120a == kVar.f69120a && this.f69121b == kVar.f69121b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f69120a << 6) + this.f69121b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i2 = this.f69120a;
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        int i3 = this.f69121b;
        sb.append(i3 < 10 ? "-0" : "-");
        sb.append(i3);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void s(DataOutput dataOutput) {
        dataOutput.writeByte(this.f69120a);
        dataOutput.writeByte(this.f69121b);
    }

    static k q(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        byte b4 = objectInput.readByte();
        Month monthL = Month.L(b2);
        Objects.requireNonNull(monthL, "month");
        j$.time.temporal.a.DAY_OF_MONTH.e0(b4);
        if (b4 > monthL.C()) {
            throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + monthL.name());
        }
        return new k(monthL.getValue(), b4);
    }
}
