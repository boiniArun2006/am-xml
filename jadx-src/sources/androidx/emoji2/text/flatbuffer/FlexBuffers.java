package androidx.emoji2.text.flatbuffer;

import com.caoccao.javet.values.primitive.V8ValueNull;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class FlexBuffers {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ReadBuf f38371n = new ArrayReadWriteBuf(new byte[]{0}, 1);

    public static class Blob extends Sized {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        static final Blob f38372O = new Blob(FlexBuffers.f38371n, 1, 1);

        public static Blob t() {
            return f38372O;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder n(StringBuilder sb) {
            sb.append(Typography.quote);
            sb.append(this.f38374n.n(this.rl, rl()));
            sb.append(Typography.quote);
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.f38374n.n(this.rl, rl());
        }

        Blob(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int rl() {
            return super.rl();
        }
    }

    public static class Key extends Object {
        private static final Key nr = new Key(FlexBuffers.f38371n, 0, 0);

        public static Key t() {
            return nr;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.rl == this.rl && key.f38375t == this.f38375t;
        }

        public int hashCode() {
            return this.rl ^ this.f38375t;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i2 = this.rl;
            while (this.f38374n.get(i2) != 0) {
                i2++;
            }
            int i3 = this.rl;
            return this.f38374n.n(i3, i2 - i3);
        }

        Key(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder n(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }
    }

    public static class KeyVector {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TypedVector f38373n;

        public int rl() {
            return this.f38373n.rl();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i2 = 0; i2 < this.f38373n.rl(); i2++) {
                this.f38373n.nr(i2).Ik(sb);
                if (i2 != this.f38373n.rl() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }

        KeyVector(TypedVector typedVector) {
            this.f38373n = typedVector;
        }

        public Key n(int i2) {
            if (i2 >= rl()) {
                return Key.nr;
            }
            TypedVector typedVector = this.f38373n;
            int i3 = typedVector.rl + (i2 * typedVector.f38375t);
            TypedVector typedVector2 = this.f38373n;
            ReadBuf readBuf = typedVector2.f38374n;
            return new Key(readBuf, FlexBuffers.Uo(readBuf, i3, typedVector2.f38375t), 1);
        }
    }

    public static class Map extends Vector {
        private static final Map J2 = new Map(FlexBuffers.f38371n, 1, 1);

        public static Map O() {
            return J2;
        }

        public KeyVector J2() {
            int i2 = this.rl - (this.f38375t * 3);
            ReadBuf readBuf = this.f38374n;
            int iUo = FlexBuffers.Uo(readBuf, i2, this.f38375t);
            ReadBuf readBuf2 = this.f38374n;
            int i3 = this.f38375t;
            return new KeyVector(new TypedVector(readBuf, iUo, FlexBuffers.mUb(readBuf2, i2 + i3, i3), 4));
        }

        public Vector Uo() {
            return new Vector(this.f38374n, this.rl, this.f38375t);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder n(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keyVectorJ2 = J2();
            int iRl = rl();
            Vector vectorUo = Uo();
            for (int i2 = 0; i2 < iRl; i2++) {
                sb.append(Typography.quote);
                sb.append(keyVectorJ2.n(i2).toString());
                sb.append("\" : ");
                sb.append(vectorUo.nr(i2).toString());
                if (i2 != iRl - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        Map(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }
    }

    private static abstract class Object {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ReadBuf f38374n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f38375t;

        public abstract StringBuilder n(StringBuilder sb);

        public String toString() {
            return n(new StringBuilder(128)).toString();
        }

        Object(ReadBuf readBuf, int i2, int i3) {
            this.f38374n = readBuf;
            this.rl = i2;
            this.f38375t = i3;
        }
    }

    public static class Reference {
        private static final Reference J2 = new Reference(FlexBuffers.f38371n, 0, 1, 0);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f38376O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ReadBuf f38377n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f38378t;

        Reference(ReadBuf readBuf, int i2, int i3, int i5) {
            this(readBuf, i2, i3, 1 << (i5 & 3), i5 >> 2);
        }

        Reference(ReadBuf readBuf, int i2, int i3, int i5, int i7) {
            this.f38377n = readBuf;
            this.rl = i2;
            this.f38378t = i3;
            this.nr = i5;
            this.f38376O = i7;
        }

        public boolean HI() {
            return this.f38376O == 5;
        }

        StringBuilder Ik(StringBuilder sb) {
            int i2 = this.f38376O;
            if (i2 != 36) {
                switch (i2) {
                    case 0:
                        sb.append(V8ValueNull.NULL);
                        return sb;
                    case 1:
                    case 6:
                        sb.append(J2());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(xMQ());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(nr());
                        return sb;
                    case 4:
                        Key keyO = O();
                        sb.append(Typography.quote);
                        StringBuilder sbN = keyO.n(sb);
                        sbN.append(Typography.quote);
                        return sbN;
                    case 5:
                        sb.append(Typography.quote);
                        sb.append(KN());
                        sb.append(Typography.quote);
                        return sb;
                    case 9:
                        return Uo().n(sb);
                    case 10:
                        return mUb().n(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.f38376O);
                    case 25:
                        return rl().n(sb);
                    case 26:
                        sb.append(t());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(mUb());
            return sb;
        }

        public long J2() {
            int i2 = this.f38376O;
            if (i2 == 1) {
                return FlexBuffers.gh(this.f38377n, this.rl, this.f38378t);
            }
            if (i2 == 2) {
                return FlexBuffers.qie(this.f38377n, this.rl, this.f38378t);
            }
            if (i2 == 3) {
                return (long) FlexBuffers.xMQ(this.f38377n, this.rl, this.f38378t);
            }
            if (i2 == 5) {
                try {
                    return Long.parseLong(KN());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i2 == 6) {
                ReadBuf readBuf = this.f38377n;
                return FlexBuffers.gh(readBuf, FlexBuffers.Uo(readBuf, this.rl, this.f38378t), this.nr);
            }
            if (i2 == 7) {
                ReadBuf readBuf2 = this.f38377n;
                return FlexBuffers.qie(readBuf2, FlexBuffers.Uo(readBuf2, this.rl, this.f38378t), this.f38378t);
            }
            if (i2 == 8) {
                ReadBuf readBuf3 = this.f38377n;
                return (long) FlexBuffers.xMQ(readBuf3, FlexBuffers.Uo(readBuf3, this.rl, this.f38378t), this.nr);
            }
            if (i2 == 10) {
                return mUb().rl();
            }
            if (i2 != 26) {
                return 0L;
            }
            return FlexBuffers.mUb(this.f38377n, this.rl, this.f38378t);
        }

        public boolean az() {
            return this.f38376O == 4;
        }

        public boolean ck() {
            int i2 = this.f38376O;
            return i2 == 10 || i2 == 9;
        }

        public boolean gh() {
            return this.f38376O == 25;
        }

        public double nr() {
            int i2 = this.f38376O;
            if (i2 == 3) {
                return FlexBuffers.xMQ(this.f38377n, this.rl, this.f38378t);
            }
            if (i2 == 1) {
                return FlexBuffers.mUb(this.f38377n, this.rl, this.f38378t);
            }
            if (i2 != 2) {
                if (i2 == 5) {
                    return Double.parseDouble(KN());
                }
                if (i2 == 6) {
                    ReadBuf readBuf = this.f38377n;
                    return FlexBuffers.mUb(readBuf, FlexBuffers.Uo(readBuf, this.rl, this.f38378t), this.nr);
                }
                if (i2 == 7) {
                    ReadBuf readBuf2 = this.f38377n;
                    return FlexBuffers.qie(readBuf2, FlexBuffers.Uo(readBuf2, this.rl, this.f38378t), this.nr);
                }
                if (i2 == 8) {
                    ReadBuf readBuf3 = this.f38377n;
                    return FlexBuffers.xMQ(readBuf3, FlexBuffers.Uo(readBuf3, this.rl, this.f38378t), this.nr);
                }
                if (i2 == 10) {
                    return mUb().rl();
                }
                if (i2 != 26) {
                    return 0.0d;
                }
            }
            return FlexBuffers.qie(this.f38377n, this.rl, this.f38378t);
        }

        public boolean qie() {
            return this.f38376O == 26;
        }

        public String toString() {
            return Ik(new StringBuilder(128)).toString();
        }

        public boolean ty() {
            return this.f38376O == 9;
        }

        public long xMQ() {
            int i2 = this.f38376O;
            if (i2 == 2) {
                return FlexBuffers.qie(this.f38377n, this.rl, this.f38378t);
            }
            if (i2 == 1) {
                return FlexBuffers.gh(this.f38377n, this.rl, this.f38378t);
            }
            if (i2 == 3) {
                return (long) FlexBuffers.xMQ(this.f38377n, this.rl, this.f38378t);
            }
            if (i2 == 10) {
                return mUb().rl();
            }
            if (i2 == 26) {
                return FlexBuffers.mUb(this.f38377n, this.rl, this.f38378t);
            }
            if (i2 == 5) {
                return Long.parseLong(KN());
            }
            if (i2 == 6) {
                ReadBuf readBuf = this.f38377n;
                return FlexBuffers.gh(readBuf, FlexBuffers.Uo(readBuf, this.rl, this.f38378t), this.nr);
            }
            if (i2 == 7) {
                ReadBuf readBuf2 = this.f38377n;
                return FlexBuffers.qie(readBuf2, FlexBuffers.Uo(readBuf2, this.rl, this.f38378t), this.nr);
            }
            if (i2 != 8) {
                return 0L;
            }
            ReadBuf readBuf3 = this.f38377n;
            return (long) FlexBuffers.xMQ(readBuf3, FlexBuffers.Uo(readBuf3, this.rl, this.f38378t), this.f38378t);
        }

        public String KN() {
            if (HI()) {
                int iUo = FlexBuffers.Uo(this.f38377n, this.rl, this.f38378t);
                ReadBuf readBuf = this.f38377n;
                int i2 = this.nr;
                return this.f38377n.n(iUo, (int) FlexBuffers.qie(readBuf, iUo - i2, i2));
            }
            if (az()) {
                int iUo2 = FlexBuffers.Uo(this.f38377n, this.rl, this.nr);
                int i3 = iUo2;
                while (this.f38377n.get(i3) != 0) {
                    i3++;
                }
                return this.f38377n.n(iUo2, i3 - iUo2);
            }
            return "";
        }

        public Key O() {
            if (az()) {
                ReadBuf readBuf = this.f38377n;
                return new Key(readBuf, FlexBuffers.Uo(readBuf, this.rl, this.f38378t), this.nr);
            }
            return Key.t();
        }

        public Map Uo() {
            if (ty()) {
                ReadBuf readBuf = this.f38377n;
                return new Map(readBuf, FlexBuffers.Uo(readBuf, this.rl, this.f38378t), this.nr);
            }
            return Map.O();
        }

        public Vector mUb() {
            if (ck()) {
                ReadBuf readBuf = this.f38377n;
                return new Vector(readBuf, FlexBuffers.Uo(readBuf, this.rl, this.f38378t), this.nr);
            }
            int i2 = this.f38376O;
            if (i2 == 15) {
                ReadBuf readBuf2 = this.f38377n;
                return new TypedVector(readBuf2, FlexBuffers.Uo(readBuf2, this.rl, this.f38378t), this.nr, 4);
            }
            if (FlexBuffers.KN(i2)) {
                ReadBuf readBuf3 = this.f38377n;
                return new TypedVector(readBuf3, FlexBuffers.Uo(readBuf3, this.rl, this.f38378t), this.nr, FlexBuffers.az(this.f38376O));
            }
            return Vector.t();
        }

        public Blob rl() {
            if (!gh() && !HI()) {
                return Blob.t();
            }
            ReadBuf readBuf = this.f38377n;
            return new Blob(readBuf, FlexBuffers.Uo(readBuf, this.rl, this.f38378t), this.nr);
        }

        public boolean t() {
            if (qie()) {
                if (this.f38377n.get(this.rl) == 0) {
                    return false;
                }
                return true;
            }
            if (xMQ() == 0) {
                return false;
            }
            return true;
        }
    }

    private static abstract class Sized extends Object {
        protected final int nr;

        public int rl() {
            return this.nr;
        }

        Sized(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
            this.nr = FlexBuffers.mUb(this.f38374n, i2 - i3, i3);
        }
    }

    static class Unsigned {
        static int n(byte b2) {
            return b2 & UByte.MAX_VALUE;
        }

        static long rl(int i2) {
            return ((long) i2) & 4294967295L;
        }

        static int t(short s2) {
            return s2 & UShort.MAX_VALUE;
        }
    }

    public static class Vector extends Sized {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final Vector f38379O = new Vector(FlexBuffers.f38371n, 1, 1);

        public static Vector t() {
            return f38379O;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder n(StringBuilder sb) {
            sb.append("[ ");
            int iRl = rl();
            for (int i2 = 0; i2 < iRl; i2++) {
                nr(i2).Ik(sb);
                if (i2 != iRl - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        Vector(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        public Reference nr(int i2) {
            long jRl = rl();
            long j2 = i2;
            if (j2 >= jRl) {
                return Reference.J2;
            }
            return new Reference(this.f38374n, this.rl + (i2 * this.f38375t), this.f38375t, Unsigned.n(this.f38374n.get((int) (((long) this.rl) + (jRl * ((long) this.f38375t)) + j2))));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int rl() {
            return super.rl();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    static boolean KN(int i2) {
        return (i2 >= 11 && i2 <= 15) || i2 == 36;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Uo(ReadBuf readBuf, int i2, int i3) {
        return (int) (((long) i2) - qie(readBuf, i2, i3));
    }

    static int az(int i2) {
        return i2 - 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long gh(ReadBuf readBuf, int i2, int i3) {
        int i5;
        if (i3 == 1) {
            i5 = readBuf.get(i2);
        } else if (i3 == 2) {
            i5 = readBuf.getShort(i2);
        } else {
            if (i3 != 4) {
                if (i3 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i2);
            }
            i5 = readBuf.getInt(i2);
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long qie(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 1) {
            return Unsigned.n(readBuf.get(i2));
        }
        if (i3 == 2) {
            return Unsigned.t(readBuf.getShort(i2));
        }
        if (i3 == 4) {
            return Unsigned.rl(readBuf.getInt(i2));
        }
        if (i3 != 8) {
            return -1L;
        }
        return readBuf.getLong(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double xMQ(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 4) {
            return readBuf.getFloat(i2);
        }
        if (i3 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i2);
    }

    public static class FlexBufferException extends RuntimeException {
        FlexBufferException(String str) {
            super(str);
        }
    }

    public static class TypedVector extends Vector {
        private static final TypedVector Uo = new TypedVector(FlexBuffers.f38371n, 1, 1, 1);
        private final int J2;

        TypedVector(ReadBuf readBuf, int i2, int i3, int i5) {
            super(readBuf, i2, i3);
            this.J2 = i5;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference nr(int i2) {
            if (i2 >= rl()) {
                return Reference.J2;
            }
            return new Reference(this.f38374n, this.rl + (i2 * this.f38375t), this.f38375t, 1, this.J2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mUb(ReadBuf readBuf, int i2, int i3) {
        return (int) gh(readBuf, i2, i3);
    }
}
