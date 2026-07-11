package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class o implements j$.time.temporal.o, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f69126d = new o(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69129c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        c.c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static o b(int i2) {
        if (i2 == 0) {
            return f69126d;
        }
        return new o(0, 0, i2);
    }

    private o(int i2, int i3, int i5) {
        this.f69127a = i2;
        this.f69128b = i3;
        this.f69129c = i5;
    }

    public final int a() {
        return this.f69129c;
    }

    public final long d() {
        return (((long) this.f69127a) * 12) + ((long) this.f69128b);
    }

    @Override // j$.time.temporal.o
    public final Temporal q(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDateB;
        Chronology chronology = (Chronology) chronoLocalDate.e(j$.time.temporal.q.a());
        if (chronology == null || j$.time.chrono.p.f68978e.equals(chronology)) {
            if (this.f69128b == 0) {
                int i2 = this.f69127a;
                chronoLocalDateB = chronoLocalDate;
                if (i2 != 0) {
                    chronoLocalDateB = chronoLocalDate.b(i2, (TemporalUnit) ChronoUnit.YEARS);
                }
            } else {
                long jD = d();
                chronoLocalDateB = chronoLocalDate;
                if (jD != 0) {
                    chronoLocalDateB = chronoLocalDate.b(jD, (TemporalUnit) ChronoUnit.MONTHS);
                }
            }
            int i3 = this.f69129c;
            return i3 != 0 ? chronoLocalDateB.b(i3, (TemporalUnit) ChronoUnit.DAYS) : chronoLocalDateB;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + chronology.u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f69127a == oVar.f69127a && this.f69128b == oVar.f69128b && this.f69129c == oVar.f69129c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f69129c, 16) + Integer.rotateLeft(this.f69128b, 8) + this.f69127a;
    }

    public final String toString() {
        if (this == f69126d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i2 = this.f69127a;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('Y');
        }
        int i3 = this.f69128b;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        int i5 = this.f69129c;
        if (i5 != 0) {
            sb.append(i5);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f69127a);
        objectOutput.writeInt(this.f69128b);
        objectOutput.writeInt(this.f69129c);
    }

    static o c(ObjectInput objectInput) throws IOException {
        int i2 = objectInput.readInt();
        int i3 = objectInput.readInt();
        int i5 = objectInput.readInt();
        if ((i2 | i3 | i5) == 0) {
            return f69126d;
        }
        return new o(i2, i3, i5);
    }
}
