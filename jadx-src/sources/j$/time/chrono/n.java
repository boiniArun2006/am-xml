package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class n extends AbstractC2183c {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient l f68973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f68974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f68975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f68976d;

    static n a0(l lVar, int i2, int i3, int i5) {
        return new n(lVar, i2, i3, i5);
    }

    static n d0(l lVar, long j2) {
        return new n(lVar, j2);
    }

    private n(l lVar, int i2, int i3, int i5) {
        lVar.j0(i2, i3, i5);
        this.f68973a = lVar;
        this.f68974b = i2;
        this.f68975c = i3;
        this.f68976d = i5;
    }

    private n(l lVar, long j2) {
        int[] iArrK0 = lVar.k0((int) j2);
        this.f68973a = lVar;
        this.f68974b = iArrK0[0];
        this.f68975c = iArrK0[1];
        this.f68976d = iArrK0[2];
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology i() {
        return this.f68973a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j w() {
        return o.AH;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int M() {
        return this.f68973a.m0(this.f68974b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.L(this);
        }
        if (!g(pVar)) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i2 = m.f68972a[aVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? this.f68973a.Z(aVar) : j$.time.temporal.s.j(1L, 5L) : j$.time.temporal.s.j(1L, M()) : j$.time.temporal.s.j(1L, r2.l0(this.f68974b, this.f68975c));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.s(this);
        }
        int i2 = m.f68972a[((j$.time.temporal.a) pVar).ordinal()];
        int i3 = this.f68975c;
        int i5 = this.f68976d;
        int i7 = this.f68974b;
        switch (i2) {
            case 1:
                return i5;
            case 2:
                return Y();
            case 3:
                return ((i5 - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((i5 - 1) % 7) + 1;
            case 6:
                return ((Y() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((Y() - 1) / 7) + 1;
            case 9:
                return i3;
            case 10:
                return ((((long) i7) * 12) + ((long) i3)) - 1;
            case 11:
                return i7;
            case 12:
                return i7;
            case 13:
                return i7 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final n a(long j2, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (n) super.a(j2, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        l lVar = this.f68973a;
        lVar.Z(aVar).b(j2, aVar);
        int i2 = (int) j2;
        int i3 = m.f68972a[aVar.ordinal()];
        int i5 = this.f68976d;
        int i7 = this.f68975c;
        int i8 = this.f68974b;
        switch (i3) {
            case 1:
                return g0(i8, i7, i2);
            case 2:
                return C(Math.min(i2, M()) - Y());
            case 3:
                return C((j2 - h(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return C(j2 - ((long) (((int) Math.floorMod(toEpochDay() + 3, 7)) + 1)));
            case 5:
                return C(j2 - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return C(j2 - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new n(lVar, j2);
            case 8:
                return C((j2 - h(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return g0(i8, i2, i5);
            case 10:
                return L(j2 - (((((long) i8) * 12) + ((long) i7)) - 1));
            case 11:
                if (i8 < 1) {
                    i2 = 1 - i2;
                }
                return g0(i2, i7, i5);
            case 12:
                return g0(i2, i7, i5);
            case 13:
                return g0(1 - i8, i7, i5);
            default:
                throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
    }

    private n g0(int i2, int i3, int i5) {
        l lVar = this.f68973a;
        int iL0 = lVar.l0(i2, i3);
        if (i5 > iL0) {
            i5 = iL0;
        }
        return new n(lVar, i2, i3, i5);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        return (n) super.m(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.l lVar) {
        return (n) super.m(lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate Q(j$.time.temporal.o oVar) {
        return (n) super.Q(oVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f68973a.j0(this.f68974b, this.f68975c, this.f68976d);
    }

    private int Y() {
        return this.f68973a.i0(this.f68974b, this.f68975c) + this.f68976d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean R() {
        return this.f68973a.E(this.f68974b);
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate X(long j2) {
        return j2 == 0 ? this : g0(Math.addExact(this.f68974b, (int) j2), this.f68975c, this.f68976d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC2183c
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final n L(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (((long) this.f68974b) * 12) + ((long) (this.f68975c - 1)) + j2;
        return g0(this.f68973a.f0(Math.floorDiv(j3, 12L)), ((int) Math.floorMod(j3, 12L)) + 1, this.f68976d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC2183c
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final n C(long j2) {
        return new n(this.f68973a, toEpochDay() + j2);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j2, TemporalUnit temporalUnit) {
        return (n) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j2, TemporalUnit temporalUnit) {
        return (n) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate d(long j2, TemporalUnit temporalUnit) {
        return (n) super.d(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        return (n) super.d(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f68974b == nVar.f68974b && this.f68975c == nVar.f68975c && this.f68976d == nVar.f68976d && this.f68973a.equals(nVar.f68973a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        this.f68973a.getClass();
        int i2 = this.f68974b;
        return (((i2 << 11) + (this.f68975c << 6)) + this.f68976d) ^ ((i2 & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime N(LocalTime localTime) {
        return C2185e.s(this, localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new B((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f68973a);
        objectOutput.writeInt(j(j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j(j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j(j$.time.temporal.a.DAY_OF_MONTH));
    }
}
