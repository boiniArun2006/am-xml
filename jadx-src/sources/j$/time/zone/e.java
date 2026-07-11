package j$.time.zone;

import com.caoccao.javet.interop.engine.JavetEngineConfig;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.p;
import j$.time.temporal.m;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Month f69203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f69204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DayOfWeek f69205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LocalTime f69206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f69207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f69208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ZoneOffset f69209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ZoneOffset f69210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ZoneOffset f69211i;

    e(Month month, int i2, DayOfWeek dayOfWeek, LocalTime localTime, boolean z2, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f69203a = month;
        this.f69204b = (byte) i2;
        this.f69205c = dayOfWeek;
        this.f69206d = localTime;
        this.f69207e = z2;
        this.f69208f = dVar;
        this.f69209g = zoneOffset;
        this.f69210h = zoneOffset2;
        this.f69211i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        LocalTime localTime = this.f69206d;
        boolean z2 = this.f69207e;
        int secondOfDay = z2 ? 86400 : localTime.toSecondOfDay();
        int totalSeconds = this.f69209g.getTotalSeconds();
        ZoneOffset zoneOffset = this.f69210h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.f69211i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        int hour = secondOfDay % JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS == 0 ? z2 ? 24 : localTime.getHour() : 31;
        int i2 = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i3 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i5 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f69205c;
        objectOutput.writeInt((this.f69203a.getValue() << 28) + ((this.f69204b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (hour << 14) + (this.f69208f.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i5);
        if (hour == 31) {
            objectOutput.writeInt(secondOfDay);
        }
        if (i2 == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i5 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }

    static e b(ObjectInput objectInput) {
        int i2 = objectInput.readInt();
        Month monthL = Month.L(i2 >>> 28);
        int i3 = ((264241152 & i2) >>> 22) - 32;
        int i5 = (3670016 & i2) >>> 19;
        DayOfWeek dayOfWeekQ = i5 == 0 ? null : DayOfWeek.q(i5);
        int i7 = (507904 & i2) >>> 14;
        d dVar = d.values()[(i2 & 12288) >>> 12];
        int i8 = (i2 & 4080) >>> 4;
        int i9 = (i2 & 12) >>> 2;
        int i10 = i2 & 3;
        LocalTime localTimeY = i7 == 31 ? LocalTime.Y(objectInput.readInt()) : LocalTime.L(i7 % 24);
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i8 == 255 ? objectInput.readInt() : (i8 - 128) * 900);
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i9 == 3 ? objectInput.readInt() : (i9 * 1800) + zoneOffsetOfTotalSeconds.getTotalSeconds());
        ZoneOffset zoneOffsetOfTotalSeconds3 = i10 == 3 ? ZoneOffset.ofTotalSeconds(objectInput.readInt()) : ZoneOffset.ofTotalSeconds((i10 * 1800) + zoneOffsetOfTotalSeconds.getTotalSeconds());
        boolean z2 = i7 == 24;
        Objects.requireNonNull(monthL, "month");
        Objects.requireNonNull(localTimeY, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds, "standardOffset");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "offsetAfter");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z2 && !localTimeY.equals(LocalTime.MIDNIGHT)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeY.getNano() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(monthL, i3, dayOfWeekQ, localTimeY, z2, dVar, zoneOffsetOfTotalSeconds, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3);
    }

    public final b a(int i2) {
        LocalDate localDateG0;
        Month month = this.f69203a;
        DayOfWeek dayOfWeek = this.f69205c;
        byte b2 = this.f69204b;
        if (b2 < 0) {
            localDateG0 = LocalDate.g0(i2, month, month.s(p.f68978e.E(i2)) + 1 + b2);
            if (dayOfWeek != null) {
                localDateG0 = localDateG0.c(new m(dayOfWeek.getValue(), 1));
            }
        } else {
            localDateG0 = LocalDate.g0(i2, month, b2);
            if (dayOfWeek != null) {
                localDateG0 = localDateG0.c(new m(dayOfWeek.getValue(), 0));
            }
        }
        if (this.f69207e) {
            localDateG0 = localDateG0.j0(1L);
        }
        LocalDateTime localDateTimeF0 = LocalDateTime.f0(localDateG0, this.f69206d);
        int i3 = c.f69201a[this.f69208f.ordinal()];
        ZoneOffset zoneOffset = this.f69210h;
        if (i3 == 1) {
            localDateTimeF0 = localDateTimeF0.i0(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
        } else if (i3 == 2) {
            localDateTimeF0 = localDateTimeF0.i0(zoneOffset.getTotalSeconds() - this.f69209g.getTotalSeconds());
        }
        return new b(localDateTimeF0, zoneOffset, this.f69211i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f69203a == eVar.f69203a && this.f69204b == eVar.f69204b && this.f69205c == eVar.f69205c && this.f69208f == eVar.f69208f && this.f69206d.equals(eVar.f69206d) && this.f69207e == eVar.f69207e && this.f69209g.equals(eVar.f69209g) && this.f69210h.equals(eVar.f69210h) && this.f69211i.equals(eVar.f69211i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int secondOfDay = ((this.f69206d.toSecondOfDay() + (this.f69207e ? 1 : 0)) << 15) + (this.f69203a.ordinal() << 11) + ((this.f69204b + 32) << 5);
        DayOfWeek dayOfWeek = this.f69205c;
        return ((this.f69209g.hashCode() ^ (this.f69208f.ordinal() + (secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f69210h.hashCode()) ^ this.f69211i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f69210h;
        ZoneOffset zoneOffset2 = this.f69211i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        Month month = this.f69203a;
        byte b2 = this.f69204b;
        DayOfWeek dayOfWeek = this.f69205c;
        if (dayOfWeek == null) {
            sb.append(month.name());
            sb.append(' ');
            sb.append((int) b2);
        } else if (b2 == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(month.name());
        } else if (b2 < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b2) - 1);
            sb.append(" of ");
            sb.append(month.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(month.name());
            sb.append(' ');
            sb.append((int) b2);
        }
        sb.append(" at ");
        sb.append(this.f69207e ? "24:00" : this.f69206d.toString());
        sb.append(" ");
        sb.append(this.f69208f);
        sb.append(", standard offset ");
        sb.append(this.f69209g);
        sb.append(']');
        return sb.toString();
    }
}
