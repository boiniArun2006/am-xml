package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class z extends AbstractC2183c {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient LocalDate f68995a;

    z(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f68995a = localDate;
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        x.f68993e.getClass();
        return this.f68995a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology i() {
        return x.f68993e;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j w() {
        return Y() >= 1 ? A.ROC : A.BEFORE_ROC;
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
        int i2 = y.f68994a[aVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return this.f68995a.l(pVar);
        }
        if (i2 != 4) {
            return x.f68993e.Z(aVar);
        }
        j$.time.temporal.s sVarC = j$.time.temporal.a.YEAR.C();
        return j$.time.temporal.s.j(1L, Y() <= 0 ? (-sVarC.e()) + 1912 : sVarC.d() - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i2 = y.f68994a[((j$.time.temporal.a) pVar).ordinal()];
            if (i2 == 4) {
                int iY = Y();
                if (iY < 1) {
                    iY = 1 - iY;
                }
                return iY;
            }
            LocalDate localDate = this.f68995a;
            if (i2 == 5) {
                return ((((long) Y()) * 12) + ((long) localDate.getMonthValue())) - 1;
            }
            if (i2 == 6) {
                return Y();
            }
            if (i2 != 7) {
                return localDate.h(pVar);
            }
            return Y() < 1 ? 0 : 1;
        }
        return pVar.s(this);
    }

    private int Y() {
        return this.f68995a.getYear() - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z a(long j2, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (h(aVar) == j2) {
                return this;
            }
            int[] iArr = y.f68994a;
            int i2 = iArr[aVar.ordinal()];
            LocalDate localDate = this.f68995a;
            if (i2 == 4) {
                int iA = x.f68993e.Z(aVar).a(j2, aVar);
                int i3 = iArr[aVar.ordinal()];
                if (i3 == 4) {
                    return d0(localDate.r0(Y() >= 1 ? iA + 1911 : 1912 - iA));
                }
                if (i3 == 6) {
                    return d0(localDate.r0(iA + 1911));
                }
                if (i3 == 7) {
                    return d0(localDate.r0(1912 - Y()));
                }
            } else {
                if (i2 == 5) {
                    x.f68993e.Z(aVar).b(j2, aVar);
                    return d0(localDate.plusMonths(j2 - (((((long) Y()) * 12) + ((long) localDate.getMonthValue())) - 1)));
                }
                if (i2 == 6 || i2 == 7) {
                }
            }
            return d0(localDate.a(j2, pVar));
        }
        return (z) super.a(j2, pVar);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        return (z) super.m(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.l lVar) {
        return (z) super.m(lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate Q(j$.time.temporal.o oVar) {
        return (z) super.Q(oVar);
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate X(long j2) {
        return d0(this.f68995a.l0(j2));
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate L(long j2) {
        return d0(this.f68995a.plusMonths(j2));
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate C(long j2) {
        return d0(this.f68995a.j0(j2));
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j2, TemporalUnit temporalUnit) {
        return (z) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j2, TemporalUnit temporalUnit) {
        return (z) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate d(long j2, TemporalUnit temporalUnit) {
        return (z) super.d(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        return (z) super.d(j2, temporalUnit);
    }

    private z d0(LocalDate localDate) {
        return localDate.equals(this.f68995a) ? this : new z(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f68995a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f68995a.equals(((z) obj).f68995a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new B((byte) 7, this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime N(LocalTime localTime) {
        return C2185e.s(this, localTime);
    }
}
