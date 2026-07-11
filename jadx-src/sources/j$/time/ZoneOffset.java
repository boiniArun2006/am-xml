package j$.time;

import com.caoccao.javet.interop.engine.JavetEngineConfig;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.l, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f68928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f68929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f68924d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f68925e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f68926f = ofTotalSeconds(-64800);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f68927g = ofTotalSeconds(64800);

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneOffset d0(String str) {
        int iE0;
        int iE02;
        int iE03;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) f68925e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iE0 = e0(str, 1, false);
                    iE02 = e0(str, 3, false);
                } else if (length == 6) {
                    iE0 = e0(str, 1, false);
                    iE02 = e0(str, 4, true);
                } else if (length == 7) {
                    iE0 = e0(str, 1, false);
                    iE02 = e0(str, 3, false);
                    iE03 = e0(str, 5, false);
                } else if (length == 9) {
                    iE0 = e0(str, 1, false);
                    iE02 = e0(str, 4, true);
                    iE03 = e0(str, 7, true);
                } else {
                    throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iE03 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt != '-') {
                return ofHoursMinutesSeconds(-iE0, -iE02, -iE03);
            }
            return ofHoursMinutesSeconds(iE0, iE02, iE03);
        }
        iE0 = e0(str, 1, false);
        iE02 = 0;
        iE03 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt != '-') {
        }
    }

    private static int e0(String str, int i2, boolean z2) {
        if (z2 && str.charAt(i2 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i2);
        char cCharAt2 = str.charAt(i2 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.e(j$.time.temporal.q.d());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static ZoneOffset ofHoursMinutesSeconds(int i2, int i3, int i5) {
        if (i2 < -18 || i2 > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i2 + " is not in the range -18 to 18");
        }
        if (i2 > 0) {
            if (i3 < 0 || i5 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i2 < 0) {
            if (i3 > 0 || i5 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i3 > 0 && i5 < 0) || (i3 < 0 && i5 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i3 < -59 || i3 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (i5 < -59 || i5 > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i5 + " is not in the range -59 to 59");
        }
        if (Math.abs(i2) != 18 || (i3 | i5) == 0) {
            return ofTotalSeconds((i3 * 60) + (i2 * JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS) + i5);
        }
        throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
    }

    public static ZoneOffset ofTotalSeconds(int i2) {
        if (i2 < -64800 || i2 > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i2 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i2);
            ConcurrentHashMap concurrentHashMap = f68924d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i2));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
            f68925e.putIfAbsent(zoneOffset2.f68929c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i2);
    }

    private ZoneOffset(int i2) {
        String string;
        this.f68928b = i2;
        if (i2 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i2);
            StringBuilder sb = new StringBuilder();
            int i3 = iAbs / JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS;
            int i5 = (iAbs / 60) % 60;
            sb.append(i2 < 0 ? "-" : "+");
            sb.append(i3 < 10 ? "0" : "");
            sb.append(i3);
            sb.append(i5 < 10 ? ":0" : ":");
            sb.append(i5);
            int i7 = iAbs % 60;
            if (i7 != 0) {
                sb.append(i7 < 10 ? ":0" : ":");
                sb.append(i7);
            }
            string = sb.toString();
        }
        this.f68929c = string;
    }

    public int getTotalSeconds() {
        return this.f68928b;
    }

    @Override // j$.time.ZoneId
    public final String u() {
        return this.f68929c;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f s() {
        return j$.time.zone.f.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f68928b;
        }
        if (pVar == null) {
            return super.l(pVar).a(h(pVar), pVar);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f68928b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        return pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        return (temporalQuery == j$.time.temporal.q.d() || temporalQuery == j$.time.temporal.q.f()) ? this : super.e(temporalQuery);
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.f68928b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f68928b - this.f68928b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            if (this.f68928b == ((ZoneOffset) obj).f68928b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.f68928b;
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.f68929c;
    }

    private Object writeReplace() {
        return new p((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    final void Y(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        g0(objectOutput);
    }

    final void g0(DataOutput dataOutput) throws IOException {
        int i2 = this.f68928b;
        int i3 = i2 % 900 == 0 ? i2 / 900 : 127;
        dataOutput.writeByte(i3);
        if (i3 == 127) {
            dataOutput.writeInt(i2);
        }
    }

    static ZoneOffset f0(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        return b2 == 127 ? ofTotalSeconds(objectInput.readInt()) : ofTotalSeconds(b2 * 900);
    }
}
