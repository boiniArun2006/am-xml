package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f69195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Serializable f69196b;

    public a() {
    }

    a(byte b2, Serializable serializable) {
        this.f69195a = b2;
        this.f69196b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.f69195a;
        Serializable serializable = this.f69196b;
        objectOutput.writeByte(b2);
        if (b2 == 1) {
            ((f) serializable).writeExternal(objectOutput);
            return;
        }
        if (b2 == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b2 == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else {
            if (b2 == 100) {
                ((f) serializable).l(objectOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable serializableK;
        byte b2 = objectInput.readByte();
        this.f69195a = b2;
        if (b2 == 1) {
            serializableK = f.k(objectInput);
        } else if (b2 == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            serializableK = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b2 == 3) {
            serializableK = e.b(objectInput);
        } else {
            if (b2 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            serializableK = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f69196b = serializableK;
    }

    private Object readResolve() {
        return this.f69196b;
    }

    static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i2 = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        objectOutput.writeByte(i2);
        if (i2 == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    static ZoneOffset b(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        return b2 == 127 ? ZoneOffset.ofTotalSeconds(objectInput.readInt()) : ZoneOffset.ofTotalSeconds(b2 * 900);
    }

    static void c(long j2, ObjectOutput objectOutput) {
        if (j2 >= -4575744000L && j2 < 10413792000L && j2 % 900 == 0) {
            int i2 = (int) ((j2 + 4575744000L) / 900);
            objectOutput.writeByte((i2 >>> 16) & 255);
            objectOutput.writeByte((i2 >>> 8) & 255);
            objectOutput.writeByte(i2 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j2);
    }

    static long a(ObjectInput objectInput) {
        int i2 = objectInput.readByte() & UByte.MAX_VALUE;
        if (i2 == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i2 << 16) + ((objectInput.readByte() & UByte.MAX_VALUE) << 8)) + (objectInput.readByte() & UByte.MAX_VALUE))) * 900) - 4575744000L;
    }
}
