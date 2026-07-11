package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class B implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f68936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f68937b;

    public B() {
    }

    B(byte b2, Object obj) {
        this.f68936a = b2;
        this.f68937b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.f68936a;
        Object obj = this.f68937b;
        objectOutput.writeByte(b2);
        switch (b2) {
            case 1:
                objectOutput.writeUTF(((AbstractC2181a) obj).u());
                return;
            case 2:
                ((C2185e) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((i) obj).writeExternal(objectOutput);
                return;
            case 4:
                u uVar = (u) obj;
                uVar.getClass();
                objectOutput.writeInt(uVar.j(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(uVar.j(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(uVar.j(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((v) obj).A(objectOutput);
                return;
            case 6:
                ((n) obj).writeExternal(objectOutput);
                return;
            case 7:
                z zVar = (z) obj;
                zVar.getClass();
                objectOutput.writeInt(zVar.j(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(zVar.j(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(zVar.j(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                F f3 = (F) obj;
                f3.getClass();
                objectOutput.writeInt(f3.j(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(f3.j(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(f3.j(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C2186f) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objC;
        byte b2 = objectInput.readByte();
        this.f68936a = b2;
        switch (b2) {
            case 1:
                int i2 = AbstractC2181a.f68946d;
                objC = AbstractC2181a.C(objectInput.readUTF());
                break;
            case 2:
                objC = ((ChronoLocalDate) objectInput.readObject()).N((LocalTime) objectInput.readObject());
                break;
            case 3:
                objC = ((ChronoLocalDateTime) objectInput.readObject()).J((ZoneOffset) objectInput.readObject()).K((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = u.f68983d;
                int i3 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                s.f68981e.getClass();
                objC = new u(LocalDate.of(i3, b4, b5));
                break;
            case 5:
                v vVar = v.f68987d;
                objC = v.u(objectInput.readByte());
                break;
            case 6:
                l lVar = (l) objectInput.readObject();
                int i5 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                lVar.getClass();
                objC = n.a0(lVar, i5, b6, b7);
                break;
            case 7:
                int i7 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                x.f68993e.getClass();
                objC = new z(LocalDate.of(i7 + 1911, b8, b9));
                break;
            case 8:
                int i8 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                byte b11 = objectInput.readByte();
                D.f68939e.getClass();
                objC = new F(LocalDate.of(i8 - 543, b10, b11));
                break;
            case 9:
                int i9 = C2186f.f68951e;
                objC = new C2186f(AbstractC2181a.C(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f68937b = objC;
    }

    private Object readResolve() {
        return this.f68937b;
    }
}
