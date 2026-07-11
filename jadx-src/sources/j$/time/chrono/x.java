package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class x extends AbstractC2181a implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f68993e = new x();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    public final j S(int i2) {
        if (i2 == 0) {
            return A.BEFORE_ROC;
        }
        if (i2 == 1) {
            return A.ROC;
        }
        throw new DateTimeException("Invalid era: " + i2);
    }

    @Override // j$.time.chrono.Chronology
    public final String W() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate H(int i2, int i3, int i5) {
        return new z(LocalDate.of(i2 + 1911, i3, i5));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate A(int i2, int i3) {
        return new z(LocalDate.h0(i2 + 1911, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate r(long j2) {
        return new z(LocalDate.ofEpochDay(j2));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate P() {
        return new z(LocalDate.C(LocalDate.f0(Clock.b())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof z) {
            return (z) temporalAccessor;
        }
        return new z(LocalDate.C(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean E(long j2) {
        return p.f68978e.E(j2 + 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final int x(j jVar, int i2) {
        if (jVar instanceof A) {
            return jVar == A.ROC ? i2 : 1 - i2;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final List D() {
        return j$.time.c.c(A.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.s Z(j$.time.temporal.a aVar) {
        int i2 = w.f68992a[aVar.ordinal()];
        if (i2 == 1) {
            j$.time.temporal.s sVarC = j$.time.temporal.a.PROLEPTIC_MONTH.C();
            return j$.time.temporal.s.j(sVarC.e() - 22932, sVarC.d() - 22932);
        }
        if (i2 == 2) {
            j$.time.temporal.s sVarC2 = j$.time.temporal.a.YEAR.C();
            return j$.time.temporal.s.k(1L, sVarC2.d() - 1911, (-sVarC2.e()) + 1912);
        }
        if (i2 == 3) {
            j$.time.temporal.s sVarC3 = j$.time.temporal.a.YEAR.C();
            return j$.time.temporal.s.j(sVarC3.e() - 1911, sVarC3.d() - 1911);
        }
        return aVar.C();
    }

    @Override // j$.time.chrono.AbstractC2181a, j$.time.chrono.Chronology
    public final ChronoLocalDate U(Map map, j$.time.format.D d2) {
        return (z) super.U(map, d2);
    }

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return i.C(this, instant, zoneId);
    }

    Object writeReplace() {
        return new B((byte) 1, this);
    }
}
