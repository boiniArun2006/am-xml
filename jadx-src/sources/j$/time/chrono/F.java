package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class F extends AbstractC2183c {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient LocalDate f68941a;

    F(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f68941a = localDate;
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        D.f68939e.getClass();
        return this.f68941a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology i() {
        return D.f68939e;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j w() {
        return Y() >= 1 ? G.BE : G.BEFORE_BE;
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
        int i2 = E.f68940a[aVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return this.f68941a.l(pVar);
        }
        if (i2 != 4) {
            return D.f68939e.Z(aVar);
        }
        j$.time.temporal.s sVarC = j$.time.temporal.a.YEAR.C();
        return j$.time.temporal.s.j(1L, Y() <= 0 ? (-(sVarC.e() + 543)) + 1 : 543 + sVarC.d());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i2 = E.f68940a[((j$.time.temporal.a) pVar).ordinal()];
            if (i2 == 4) {
                int iY = Y();
                if (iY < 1) {
                    iY = 1 - iY;
                }
                return iY;
            }
            LocalDate localDate = this.f68941a;
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
        return this.f68941a.getYear() + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F a(long j2, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (h(aVar) == j2) {
                return this;
            }
            int[] iArr = E.f68940a;
            int i2 = iArr[aVar.ordinal()];
            LocalDate localDate = this.f68941a;
            if (i2 == 4) {
                int iA = D.f68939e.Z(aVar).a(j2, aVar);
                int i3 = iArr[aVar.ordinal()];
                if (i3 == 4) {
                    if (Y() < 1) {
                        iA = 1 - iA;
                    }
                    return d0(localDate.r0(iA - 543));
                }
                if (i3 == 6) {
                    return d0(localDate.r0(iA - 543));
                }
                if (i3 == 7) {
                    return d0(localDate.r0((-542) - Y()));
                }
            } else {
                if (i2 == 5) {
                    D.f68939e.Z(aVar).b(j2, aVar);
                    return d0(localDate.plusMonths(j2 - (((((long) Y()) * 12) + ((long) localDate.getMonthValue())) - 1)));
                }
                if (i2 == 6 || i2 == 7) {
                }
            }
            return d0(localDate.a(j2, pVar));
        }
        return (F) super.a(j2, pVar);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        return (F) super.m(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.l lVar) {
        return (F) super.m(lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate Q(j$.time.temporal.o oVar) {
        return (F) super.Q(oVar);
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate X(long j2) {
        return d0(this.f68941a.l0(j2));
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate L(long j2) {
        return d0(this.f68941a.plusMonths(j2));
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate C(long j2) {
        return d0(this.f68941a.j0(j2));
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j2, TemporalUnit temporalUnit) {
        return (F) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j2, TemporalUnit temporalUnit) {
        return (F) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate d(long j2, TemporalUnit temporalUnit) {
        return (F) super.d(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        return (F) super.d(j2, temporalUnit);
    }

    private F d0(LocalDate localDate) {
        return localDate.equals(this.f68941a) ? this : new F(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f68941a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return this.f68941a.equals(((F) obj).f68941a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new B((byte) 8, this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime N(LocalTime localTime) {
        return C2185e.s(this, localTime);
    }
}
