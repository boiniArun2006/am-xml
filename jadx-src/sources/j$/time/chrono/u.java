package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class u extends AbstractC2183c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final LocalDate f68983d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient LocalDate f68984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient v f68985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f68986c;

    u(LocalDate localDate) {
        if (localDate.a0(f68983d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        v vVarQ = v.q(localDate);
        this.f68985b = vVarQ;
        this.f68986c = (localDate.getYear() - vVarQ.s().getYear()) + 1;
        this.f68984a = localDate;
    }

    u(v vVar, int i2, LocalDate localDate) {
        if (localDate.a0(f68983d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.f68985b = vVar;
        this.f68986c = i2;
        this.f68984a = localDate;
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        s.f68981e.getClass();
        return this.f68984a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology i() {
        return s.f68981e;
    }

    public final v Y() {
        return this.f68985b;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j w() {
        return this.f68985b;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int M() {
        int iM;
        v vVar = this.f68985b;
        v vVarT = vVar.t();
        LocalDate localDate = this.f68984a;
        if (vVarT != null && vVarT.s().getYear() == localDate.getYear()) {
            iM = vVarT.s().X() - 1;
        } else {
            iM = localDate.M();
        }
        return this.f68986c == 1 ? iM - (vVar.s().X() - 1) : iM;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).Y();
        }
        return pVar != null && pVar.a0(this);
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
        int i2 = t.f68982a[aVar.ordinal()];
        if (i2 == 1) {
            return j$.time.temporal.s.j(1L, this.f68984a.lengthOfMonth());
        }
        if (i2 == 2) {
            return j$.time.temporal.s.j(1L, M());
        }
        if (i2 != 3) {
            return s.f68981e.Z(aVar);
        }
        v vVar = this.f68985b;
        int year = vVar.s().getYear();
        return vVar.t() != null ? j$.time.temporal.s.j(1L, (r6.s().getYear() - year) + 1) : j$.time.temporal.s.j(1L, 999999999 - year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.s(this);
        }
        int i2 = t.f68982a[((j$.time.temporal.a) pVar).ordinal()];
        int i3 = this.f68986c;
        v vVar = this.f68985b;
        LocalDate localDate = this.f68984a;
        switch (i2) {
            case 2:
                return i3 == 1 ? (localDate.X() - vVar.s().X()) + 1 : localDate.X();
            case 3:
                return i3;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
            case 8:
                return vVar.getValue();
            default:
                return localDate.h(pVar);
        }
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final u a(long j2, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (h(aVar) == j2) {
                return this;
            }
            int[] iArr = t.f68982a;
            int i2 = iArr[aVar.ordinal()];
            LocalDate localDate = this.f68984a;
            if (i2 == 3 || i2 == 8 || i2 == 9) {
                s sVar = s.f68981e;
                int iA = sVar.Z(aVar).a(j2, aVar);
                int i3 = iArr[aVar.ordinal()];
                if (i3 == 3) {
                    return e0(localDate.r0(sVar.x(this.f68985b, iA)));
                }
                if (i3 == 8) {
                    return e0(localDate.r0(sVar.x(v.u(iA), this.f68986c)));
                }
                if (i3 == 9) {
                    return e0(localDate.r0(iA));
                }
            }
            return e0(localDate.a(j2, pVar));
        }
        return (u) super.a(j2, pVar);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        return (u) super.m(localDate);
    }

    public final u f0(j$.time.temporal.n nVar) {
        return (u) super.m(nVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.l lVar) {
        return (u) super.m(lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate Q(j$.time.temporal.o oVar) {
        return (u) super.Q(oVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime N(LocalTime localTime) {
        return C2185e.s(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate X(long j2) {
        return e0(this.f68984a.l0(j2));
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate L(long j2) {
        return e0(this.f68984a.plusMonths(j2));
    }

    @Override // j$.time.chrono.AbstractC2183c
    final ChronoLocalDate C(long j2) {
        return e0(this.f68984a.j0(j2));
    }

    public final u a0(long j2, ChronoUnit chronoUnit) {
        return (u) super.b(j2, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j2, TemporalUnit temporalUnit) {
        return (u) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j2, TemporalUnit temporalUnit) {
        return (u) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate d(long j2, TemporalUnit temporalUnit) {
        return (u) super.d(j2, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        return (u) super.d(j2, temporalUnit);
    }

    private u e0(LocalDate localDate) {
        return localDate.equals(this.f68984a) ? this : new u(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f68984a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC2183c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f68984a.equals(((u) obj).f68984a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new B((byte) 4, this);
    }
}
