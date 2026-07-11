package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class C2186f implements j$.time.temporal.o, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f68951e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Chronology f68952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f68953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f68954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f68955d;

    static {
        j$.time.c.c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    C2186f(Chronology chronology, int i2, int i3, int i5) {
        this.f68952a = chronology;
        this.f68953b = i2;
        this.f68954c = i3;
        this.f68955d = i5;
    }

    public final String toString() {
        Chronology chronology = this.f68952a;
        int i2 = this.f68955d;
        int i3 = this.f68954c;
        int i5 = this.f68953b;
        if (i5 == 0 && i3 == 0 && i2 == 0) {
            return chronology.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(chronology.toString());
        sb.append(" P");
        if (i5 != 0) {
            sb.append(i5);
            sb.append('Y');
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final Temporal q(ChronoLocalDate chronoLocalDate) {
        Chronology chronology = (Chronology) chronoLocalDate.e(j$.time.temporal.q.a());
        Chronology chronology2 = this.f68952a;
        if (chronology == null || chronology2.equals(chronology)) {
            int i2 = this.f68953b;
            int i3 = this.f68954c;
            Temporal temporalB = chronoLocalDate;
            if (i3 != 0) {
                j$.time.temporal.s sVarZ = chronology2.Z(j$.time.temporal.a.MONTH_OF_YEAR);
                long jD = (sVarZ.g() && sVarZ.h()) ? (sVarZ.d() - sVarZ.e()) + 1 : -1L;
                ChronoLocalDate chronoLocalDateB = chronoLocalDate;
                if (jD > 0) {
                    temporalB = chronoLocalDate.b((((long) i2) * jD) + ((long) i3), (TemporalUnit) ChronoUnit.MONTHS);
                } else {
                    if (i2 != 0) {
                        chronoLocalDateB = chronoLocalDate.b(i2, (TemporalUnit) ChronoUnit.YEARS);
                    }
                    temporalB = chronoLocalDateB.b(i3, (TemporalUnit) ChronoUnit.MONTHS);
                }
            } else if (i2 != 0) {
                temporalB = chronoLocalDate.b(i2, (TemporalUnit) ChronoUnit.YEARS);
            }
            int i5 = this.f68955d;
            return i5 != 0 ? temporalB.b(i5, ChronoUnit.DAYS) : temporalB;
        }
        throw new DateTimeException("Chronology mismatch, expected: " + chronology2.u() + ", actual: " + chronology.u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2186f) {
            C2186f c2186f = (C2186f) obj;
            if (this.f68953b == c2186f.f68953b && this.f68954c == c2186f.f68954c && this.f68955d == c2186f.f68955d && this.f68952a.equals(c2186f.f68952a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68952a.hashCode() ^ (Integer.rotateLeft(this.f68955d, 16) + (Integer.rotateLeft(this.f68954c, 8) + this.f68953b));
    }

    protected Object writeReplace() {
        return new B((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f68952a.u());
        objectOutput.writeInt(this.f68953b);
        objectOutput.writeInt(this.f68954c);
        objectOutput.writeInt(this.f68955d);
    }
}
