package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class Duration implements j$.time.temporal.o, Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f68901c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f68902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f68903b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f68902a, duration2.f68902a);
        return iCompare != 0 ? iCompare : this.f68903b - duration2.f68903b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofMinutes(long j2) {
        return s(Math.multiplyExact(j2, 60), 0);
    }

    public static Duration C(long j2) {
        return s(j2, 0);
    }

    public static Duration ofSeconds(long j2, long j3) {
        return s(Math.addExact(j2, Math.floorDiv(j3, 1000000000L)), (int) Math.floorMod(j3, 1000000000L));
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            long jN = temporal.n(temporal2, ChronoUnit.NANOS);
            long j2 = jN / 1000000000;
            int i2 = (int) (jN % 1000000000);
            if (i2 < 0) {
                i2 = (int) (((long) i2) + 1000000000);
                j2--;
            }
            return s(j2, i2);
        } catch (DateTimeException | ArithmeticException unused) {
            long jN2 = temporal.n(temporal2, ChronoUnit.SECONDS);
            long j3 = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long jH = temporal2.h(aVar) - temporal.h(aVar);
                if (jN2 > 0 && jH < 0) {
                    jN2++;
                } else if (jN2 < 0 && jH > 0) {
                    jN2--;
                }
                j3 = jH;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(jN2, j3);
        }
    }

    private static Duration s(long j2, int i2) {
        if ((((long) i2) | j2) == 0) {
            return f68901c;
        }
        return new Duration(j2, i2);
    }

    private Duration(long j2, int i2) {
        this.f68902a = j2;
        this.f68903b = i2;
    }

    public boolean isNegative() {
        return this.f68902a < 0;
    }

    public long getSeconds() {
        return this.f68902a;
    }

    public int getNano() {
        return this.f68903b;
    }

    @Override // j$.time.temporal.o
    public final Temporal q(ChronoLocalDate chronoLocalDate) {
        long j2 = this.f68902a;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate;
        if (j2 != 0) {
            chronoLocalDateB = chronoLocalDate.b(j2, (TemporalUnit) ChronoUnit.SECONDS);
        }
        int i2 = this.f68903b;
        return i2 != 0 ? chronoLocalDateB.b(i2, (TemporalUnit) ChronoUnit.NANOS) : chronoLocalDateB;
    }

    public long toMillis() {
        long j2 = this.f68903b;
        long j3 = this.f68902a;
        if (j3 < 0) {
            j3++;
            j2 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j3, 1000), j2 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f68902a == duration.f68902a && this.f68903b == duration.f68903b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f68902a;
        return (this.f68903b * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        if (this == f68901c) {
            return "PT0S";
        }
        long j2 = this.f68902a;
        int i2 = this.f68903b;
        long j3 = (j2 >= 0 || i2 <= 0) ? j2 : 1 + j2;
        long j4 = j3 / 3600;
        int i3 = (int) ((j3 % 3600) / 60);
        int i5 = (int) (j3 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j4 != 0) {
            sb.append(j4);
            sb.append('H');
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        if (i5 == 0 && i2 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j2 < 0 && i2 > 0 && i5 == 0) {
            sb.append("-0");
        } else {
            sb.append(i5);
        }
        if (i2 > 0) {
            int length = sb.length();
            if (j2 < 0) {
                sb.append(2000000000 - ((long) i2));
            } else {
                sb.append(((long) i2) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f68902a);
        objectOutput.writeInt(this.f68903b);
    }
}
