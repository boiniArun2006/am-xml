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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class D extends AbstractC2181a implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f68939e = new D();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.Chronology
    public final j S(int i2) {
        if (i2 == 0) {
            return G.BEFORE_BE;
        }
        if (i2 == 1) {
            return G.BE;
        }
        throw new DateTimeException("Invalid era: " + i2);
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final String W() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate H(int i2, int i3, int i5) {
        return new F(LocalDate.of(i2 - 543, i3, i5));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate A(int i2, int i3) {
        return new F(LocalDate.h0(i2 - 543, i3));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate r(long j2) {
        return new F(LocalDate.ofEpochDay(j2));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate P() {
        return new F(LocalDate.C(LocalDate.f0(Clock.b())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof F) {
            return (F) temporalAccessor;
        }
        return new F(LocalDate.C(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean E(long j2) {
        return p.f68978e.E(j2 - 543);
    }

    @Override // j$.time.chrono.Chronology
    public final int x(j jVar, int i2) {
        if (jVar instanceof G) {
            return jVar == G.BE ? i2 : 1 - i2;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private D() {
    }

    @Override // j$.time.chrono.Chronology
    public final List D() {
        return j$.time.c.c(G.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.s Z(j$.time.temporal.a aVar) {
        int i2 = C.f68938a[aVar.ordinal()];
        if (i2 == 1) {
            j$.time.temporal.s sVarC = j$.time.temporal.a.PROLEPTIC_MONTH.C();
            return j$.time.temporal.s.j(sVarC.e() + 6516, sVarC.d() + 6516);
        }
        if (i2 == 2) {
            j$.time.temporal.s sVarC2 = j$.time.temporal.a.YEAR.C();
            return j$.time.temporal.s.k(1L, (-(sVarC2.e() + 543)) + 1, sVarC2.d() + 543);
        }
        if (i2 == 3) {
            j$.time.temporal.s sVarC3 = j$.time.temporal.a.YEAR.C();
            return j$.time.temporal.s.j(sVarC3.e() + 543, sVarC3.d() + 543);
        }
        return aVar.C();
    }

    @Override // j$.time.chrono.AbstractC2181a, j$.time.chrono.Chronology
    public final ChronoLocalDate U(Map map, j$.time.format.D d2) {
        return (F) super.U(map, d2);
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
