package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class v implements j, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f68987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v[] f68988e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f68989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient LocalDate f68990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f68991c;

    static {
        v vVar = new v(-1, LocalDate.of(1868, 1, 1), "Meiji");
        f68987d = vVar;
        f68988e = new v[]{vVar, new v(0, LocalDate.of(1912, 7, 30), "Taisho"), new v(1, LocalDate.of(1926, 12, 25), "Showa"), new v(2, LocalDate.of(1989, 1, 8), "Heisei"), new v(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    static v r() {
        return f68988e[r0.length - 1];
    }

    static long x() {
        int year = 1000000000 - r().f68990b.getYear();
        v[] vVarArr = f68988e;
        int year2 = vVarArr[0].f68990b.getYear();
        for (int i2 = 1; i2 < vVarArr.length; i2++) {
            v vVar = vVarArr[i2];
            year = Math.min(year, (vVar.f68990b.getYear() - year2) + 1);
            year2 = vVar.f68990b.getYear();
        }
        return year;
    }

    static long v() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.C().f();
        for (v vVar : f68988e) {
            jF = Math.min(jF, (vVar.f68990b.M() - vVar.f68990b.X()) + 1);
            if (vVar.t() != null) {
                jF = Math.min(jF, vVar.t().f68990b.X() - 1);
            }
        }
        return jF;
    }

    private v(int i2, LocalDate localDate, String str) {
        this.f68989a = i2;
        this.f68990b = localDate;
        this.f68991c = str;
    }

    final LocalDate s() {
        return this.f68990b;
    }

    public static v u(int i2) {
        int i3 = i2 + 1;
        if (i3 >= 0) {
            v[] vVarArr = f68988e;
            if (i3 < vVarArr.length) {
                return vVarArr[i3];
            }
        }
        throw new DateTimeException("Invalid era: " + i2);
    }

    public static v[] y() {
        v[] vVarArr = f68988e;
        return (v[]) Arrays.copyOf(vVarArr, vVarArr.length);
    }

    static v q(LocalDate localDate) {
        if (localDate.a0(u.f68983d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        v[] vVarArr = f68988e;
        for (int length = vVarArr.length - 1; length >= 0; length--) {
            v vVar = vVarArr[length];
            if (localDate.compareTo((ChronoLocalDate) vVar.f68990b) >= 0) {
                return vVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return this.f68989a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (pVar == aVar) {
            return s.f68981e.Z(aVar);
        }
        return super.l(pVar);
    }

    public final String toString() {
        return this.f68991c;
    }

    final v t() {
        if (this == r()) {
            return null;
        }
        return u(this.f68989a + 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new B((byte) 5, this);
    }

    final void A(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f68989a);
    }
}
