package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class p implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f69130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f69131b;

    public p() {
    }

    p(byte b2, Object obj) {
        this.f69130a = b2;
        this.f69131b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.f69130a;
        Object obj = this.f69131b;
        objectOutput.writeByte(b2);
        switch (b2) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).a0(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).s0(objectOutput);
                return;
            case 4:
                ((LocalTime) obj).l0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).p0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).d0(objectOutput);
                return;
            case 7:
                ((u) obj).d0(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).g0(objectOutput);
                return;
            case 9:
                ((n) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((r) obj).X(objectOutput);
                return;
            case 12:
                ((t) obj).d0(objectOutput);
                return;
            case 13:
                ((k) obj).s(objectOutput);
                return;
            case 14:
                ((o) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        this.f69130a = b2;
        this.f69131b = b(b2, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b2, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b2) {
            case 1:
                Duration duration = Duration.f68901c;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f68904c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.h0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f68910c;
                LocalDate localDate2 = LocalDate.MIN;
                return LocalDateTime.f0(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.h0(objectInput));
            case 6:
                return ZonedDateTime.L(objectInput);
            case 7:
                int i2 = u.f69191d;
                return ZoneId.C(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.f0(objectInput);
            case 9:
                return n.s(objectInput);
            case 10:
                return OffsetDateTime.X(objectInput);
            case 11:
                int i3 = r.f69134b;
                return r.q(objectInput.readInt());
            case 12:
                int i5 = t.f69138c;
                return t.s(objectInput.readInt(), objectInput.readByte());
            case 13:
                return k.q(objectInput);
            case 14:
                return o.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f69131b;
    }
}
