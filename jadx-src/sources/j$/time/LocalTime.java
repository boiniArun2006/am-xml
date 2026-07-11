package j$.time;

import com.caoccao.javet.interop.engine.JavetEngineConfig;
import com.vungle.ads.internal.signals.SignalManager;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class LocalTime implements Temporal, j$.time.temporal.l, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIDNIGHT;
    public static final LocalTime MIN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final LocalTime[] f68914e = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f68915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f68916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte f68917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f68918d;

    static {
        int i2 = 0;
        while (true) {
            LocalTime[] localTimeArr = f68914e;
            if (i2 < localTimeArr.length) {
                localTimeArr[i2] = new LocalTime(i2, 0, 0, 0);
                i2++;
            } else {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static LocalTime L(int i2) {
        j$.time.temporal.a.HOUR_OF_DAY.e0(i2);
        return f68914e[i2];
    }

    public static LocalTime of(int i2, int i3, int i5, int i7) {
        j$.time.temporal.a.HOUR_OF_DAY.e0(i2);
        j$.time.temporal.a.MINUTE_OF_HOUR.e0(i3);
        j$.time.temporal.a.SECOND_OF_MINUTE.e0(i5);
        j$.time.temporal.a.NANO_OF_SECOND.e0(i7);
        return q(i2, i3, i5, i7);
    }

    public static LocalTime Y(long j2) {
        j$.time.temporal.a.SECOND_OF_DAY.e0(j2);
        int i2 = (int) (j2 / 3600);
        long j3 = j2 - ((long) (i2 * JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS));
        int i3 = (int) (j3 / 60);
        return q(i2, i3, (int) (j3 - ((long) (i3 * 60))), 0);
    }

    public static LocalTime X(long j2) {
        j$.time.temporal.a.NANO_OF_DAY.e0(j2);
        int i2 = (int) (j2 / 3600000000000L);
        long j3 = j2 - (((long) i2) * 3600000000000L);
        int i3 = (int) (j3 / 60000000000L);
        long j4 = j3 - (((long) i3) * 60000000000L);
        int i5 = (int) (j4 / 1000000000);
        return q(i2, i3, i5, (int) (j4 - (((long) i5) * 1000000000)));
    }

    public static LocalTime s(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.e(j$.time.temporal.q.c());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f69016f;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new e(2));
    }

    private static LocalTime q(int i2, int i3, int i5, int i7) {
        if ((i3 | i5 | i7) == 0) {
            return f68914e[i2];
        }
        return new LocalTime(i2, i3, i5, i7);
    }

    private LocalTime(int i2, int i3, int i5, int i7) {
        this.f68915a = (byte) i2;
        this.f68916b = (byte) i3;
        this.f68917c = (byte) i5;
        this.f68918d = i7;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).f0();
        }
        return pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return C(pVar);
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.NANO_OF_DAY) {
                return i0();
            }
            if (pVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return i0() / 1000;
            }
            return C(pVar);
        }
        return pVar.s(this);
    }

    private int C(j$.time.temporal.p pVar) {
        int i2 = h.f69116a[((j$.time.temporal.a) pVar).ordinal()];
        byte b2 = this.f68916b;
        int i3 = this.f68918d;
        byte b4 = this.f68915a;
        switch (i2) {
            case 1:
                return i3;
            case 2:
                throw new j$.time.temporal.r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i3 / 1000;
            case 4:
                throw new j$.time.temporal.r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i3 / 1000000;
            case 6:
                return (int) (i0() / 1000000);
            case 7:
                return this.f68917c;
            case 8:
                return toSecondOfDay();
            case 9:
                return b2;
            case 10:
                return (b4 * 60) + b2;
            case 11:
                return b4 % 12;
            case 12:
                int i5 = b4 % 12;
                if (i5 % 12 == 0) {
                    return 12;
                }
                return i5;
            case 14:
                if (b4 == 0) {
                    return 24;
                }
            case 13:
                return b4;
            case 15:
                return b4 / 12;
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
    }

    public int getHour() {
        return this.f68915a;
    }

    public int getMinute() {
        return this.f68916b;
    }

    public int getSecond() {
        return this.f68917c;
    }

    public int getNano() {
        return this.f68918d;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public final Temporal m(LocalDate localDate) {
        return (LocalTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(long j2, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (LocalTime) pVar.q(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.e0(j2);
        int i2 = h.f69116a[aVar.ordinal()];
        byte b2 = this.f68916b;
        byte b4 = this.f68917c;
        int i3 = this.f68918d;
        byte b5 = this.f68915a;
        switch (i2) {
            case 1:
                return k0((int) j2);
            case 2:
                return X(j2);
            case 3:
                return k0(((int) j2) * 1000);
            case 4:
                return X(j2 * 1000);
            case 5:
                return k0(((int) j2) * 1000000);
            case 6:
                return X(j2 * 1000000);
            case 7:
                int i5 = (int) j2;
                if (b4 != i5) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.e0(i5);
                    return q(b5, b2, i5, i3);
                }
                return this;
            case 8:
                return g0(j2 - ((long) toSecondOfDay()));
            case 9:
                int i7 = (int) j2;
                if (b2 != i7) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.e0(i7);
                    return q(b5, i7, b4, i3);
                }
                return this;
            case 10:
                return e0(j2 - ((long) ((b5 * 60) + b2)));
            case 11:
                return d0(j2 - ((long) (b5 % 12)));
            case 12:
                if (j2 == 12) {
                    j2 = 0;
                }
                return d0(j2 - ((long) (b5 % 12)));
            case 13:
                int i8 = (int) j2;
                if (b5 != i8) {
                    j$.time.temporal.a.HOUR_OF_DAY.e0(i8);
                    return q(i8, b2, b4, i3);
                }
                return this;
            case 14:
                if (j2 == 24) {
                    j2 = 0;
                }
                int i9 = (int) j2;
                if (b5 != i9) {
                    j$.time.temporal.a.HOUR_OF_DAY.e0(i9);
                    return q(i9, b2, b4, i3);
                }
                return this;
            case 15:
                return d0((j2 - ((long) (b5 / 12))) * 12);
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
    }

    public final LocalTime k0(int i2) {
        if (this.f68918d == i2) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.e0(i2);
        return q(this.f68915a, this.f68916b, this.f68917c, i2);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j2, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (h.f69117b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return f0(j2);
                case 2:
                    return f0((j2 % 86400000000L) * 1000);
                case 3:
                    return f0((j2 % SignalManager.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
                case 4:
                    return g0(j2);
                case 5:
                    return e0(j2);
                case 6:
                    return d0(j2);
                case 7:
                    return d0((j2 % 2) * 12);
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.q(this, j2);
    }

    public final LocalTime d0(long j2) {
        if (j2 == 0) {
            return this;
        }
        return q(((((int) (j2 % 24)) + this.f68915a) + 24) % 24, this.f68916b, this.f68917c, this.f68918d);
    }

    public final LocalTime e0(long j2) {
        if (j2 != 0) {
            int i2 = (this.f68915a * 60) + this.f68916b;
            int i3 = ((((int) (j2 % 1440)) + i2) + 1440) % 1440;
            if (i2 != i3) {
                return q(i3 / 60, i3 % 60, this.f68917c, this.f68918d);
            }
        }
        return this;
    }

    public final LocalTime g0(long j2) {
        if (j2 != 0) {
            int i2 = (this.f68916b * 60) + (this.f68915a * 3600) + this.f68917c;
            int i3 = ((((int) (j2 % 86400)) + i2) + 86400) % 86400;
            if (i2 != i3) {
                return q(i3 / JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS, (i3 / 60) % 60, i3 % 60, this.f68918d);
            }
        }
        return this;
    }

    public final LocalTime f0(long j2) {
        if (j2 != 0) {
            long jI0 = i0();
            long j3 = (((j2 % 86400000000000L) + jI0) + 86400000000000L) % 86400000000000L;
            if (jI0 != j3) {
                return q((int) (j3 / 3600000000000L), (int) ((j3 / 60000000000L) % 60), (int) ((j3 / 1000000000) % 60), (int) (j3 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j2, TemporalUnit temporalUnit) {
        return j2 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j2, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.a() || temporalQuery == j$.time.temporal.q.g() || temporalQuery == j$.time.temporal.q.f() || temporalQuery == j$.time.temporal.q.d()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.c()) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.q.b()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.e()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        return temporal.a(i0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeS = s(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jI0 = localTimeS.i0() - i0();
            switch (h.f69117b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jI0;
                case 2:
                    return jI0 / 1000;
                case 3:
                    return jI0 / 1000000;
                case 4:
                    return jI0 / 1000000000;
                case 5:
                    return jI0 / 60000000000L;
                case 6:
                    return jI0 / 3600000000000L;
                case 7:
                    return jI0 / 43200000000000L;
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.s(this, localTimeS);
    }

    public int toSecondOfDay() {
        return (this.f68916b * 60) + (this.f68915a * 3600) + this.f68917c;
    }

    public final long i0() {
        return (((long) this.f68917c) * 1000000000) + (((long) this.f68916b) * 60000000000L) + (((long) this.f68915a) * 3600000000000L) + ((long) this.f68918d);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.f68915a, localTime.f68915a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f68916b, localTime.f68916b)) == 0 && (iCompare = Integer.compare(this.f68917c, localTime.f68917c)) == 0) ? Integer.compare(this.f68918d, localTime.f68918d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.f68915a == localTime.f68915a && this.f68916b == localTime.f68916b && this.f68917c == localTime.f68917c && this.f68918d == localTime.f68918d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jI0 = i0();
        return (int) (jI0 ^ (jI0 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.f68915a;
        sb.append(b2 < 10 ? "0" : "");
        sb.append((int) b2);
        byte b4 = this.f68916b;
        sb.append(b4 < 10 ? ":0" : ":");
        sb.append((int) b4);
        byte b5 = this.f68917c;
        int i2 = this.f68918d;
        if (b5 > 0 || i2 > 0) {
            sb.append(b5 < 10 ? ":0" : ":");
            sb.append((int) b5);
            if (i2 > 0) {
                sb.append('.');
                if (i2 % 1000000 == 0) {
                    sb.append(Integer.toString((i2 / 1000000) + 1000).substring(1));
                } else if (i2 % 1000 == 0) {
                    sb.append(Integer.toString((i2 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i2 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void l0(DataOutput dataOutput) throws IOException {
        byte b2 = this.f68917c;
        byte b4 = this.f68915a;
        byte b5 = this.f68916b;
        int i2 = this.f68918d;
        if (i2 != 0) {
            dataOutput.writeByte(b4);
            dataOutput.writeByte(b5);
            dataOutput.writeByte(b2);
            dataOutput.writeInt(i2);
            return;
        }
        if (b2 != 0) {
            dataOutput.writeByte(b4);
            dataOutput.writeByte(b5);
            dataOutput.writeByte(~b2);
        } else if (b5 == 0) {
            dataOutput.writeByte(~b4);
        } else {
            dataOutput.writeByte(b4);
            dataOutput.writeByte(~b5);
        }
    }

    static LocalTime h0(ObjectInput objectInput) throws IOException {
        int i2;
        int i3;
        int i5 = objectInput.readByte();
        int i7 = 0;
        if (i5 < 0) {
            i5 = ~i5;
            i3 = 0;
            i2 = 0;
        } else {
            byte b2 = objectInput.readByte();
            if (b2 < 0) {
                int i8 = ~b2;
                i2 = 0;
                i7 = i8;
                i3 = 0;
            } else {
                byte b4 = objectInput.readByte();
                if (b4 < 0) {
                    i3 = ~b4;
                    i2 = 0;
                    i7 = b2;
                } else {
                    i2 = objectInput.readInt();
                    i7 = b2;
                    i3 = b4;
                }
            }
        }
        return of(i5, i7, i3, i2);
    }
}
