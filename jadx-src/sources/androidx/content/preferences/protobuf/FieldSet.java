package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import androidx.content.preferences.protobuf.LazyField;
import androidx.content.preferences.protobuf.MessageLite;
import androidx.content.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    private static final FieldSet nr = new FieldSet(true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SmallSortedMap f37954n;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f37955t;

    static final class Builder<T extends FieldDescriptorLite<T>> {
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        MessageLite.Builder O(MessageLite.Builder builder, MessageLite messageLite);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
        this.f37954n = SmallSortedMap.Z();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37956n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            rl = iArr;
            try {
                iArr[WireFormat.FieldType.f38210O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[WireFormat.FieldType.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rl[WireFormat.FieldType.f38219r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                rl[WireFormat.FieldType.f38218o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                rl[WireFormat.FieldType.f38215Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                rl[WireFormat.FieldType.f38211S.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                rl[WireFormat.FieldType.f38217g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                rl[WireFormat.FieldType.E2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                rl[WireFormat.FieldType.f38214X.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                rl[WireFormat.FieldType.f38212T.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                rl[WireFormat.FieldType.f38216e.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                rl[WireFormat.FieldType.f38209N.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                rl[WireFormat.FieldType.f38220v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                rl[WireFormat.FieldType.jB.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                rl[WireFormat.FieldType.f38213U.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                rl[WireFormat.FieldType.P5.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                rl[WireFormat.FieldType.M7.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                rl[WireFormat.FieldType.Xw.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f37956n = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f37956n[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f37956n[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f37956n[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f37956n[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f37956n[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f37956n[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f37956n[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f37956n[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static FieldSet KN() {
        return nr;
    }

    static int O(WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.rl[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.r(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.nY(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.X(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.E2(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.aYN(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.S(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.az(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.te((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.nHg((LazyField) obj) : CodedOutputStream.bzg((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.ck((ByteString) obj) : CodedOutputStream.D((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.ck((ByteString) obj) : CodedOutputStream.ty((byte[]) obj);
            case 13:
                return CodedOutputStream.GR(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.M7(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.eF(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.M(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.B(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.Z(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.Z(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static FieldSet aYN() {
        return new FieldSet();
    }

    static int az(WireFormat.FieldType fieldType, boolean z2) {
        if (z2) {
            return 2;
        }
        return fieldType.rl();
    }

    static void g(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i2, Object obj) {
        if (fieldType == WireFormat.FieldType.f38214X) {
            codedOutputStream.qm(i2, (MessageLite) obj);
        } else {
            codedOutputStream.W(i2, az(fieldType, false));
            te(codedOutputStream, fieldType, obj);
        }
    }

    private static boolean r(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static Object t(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void te(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.rl[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.eWT(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.Rl(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.Po6(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.a63(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.GD(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.Jk(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.n1(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.C(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.Org((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.UhV((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.kSg((String) obj);
                } else {
                    codedOutputStream.fcU((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.Mx((byte[]) obj);
                } else {
                    codedOutputStream.fcU((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.RQ(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.How(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.tUK(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.ER(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.lLA(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.ul(((Integer) obj).intValue());
                } else {
                    codedOutputStream.ul(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    public boolean HI() {
        return this.rl;
    }

    public void S(FieldSet fieldSet) {
        int iTy = fieldSet.f37954n.ty();
        for (int i2 = 0; i2 < iTy; i2++) {
            WPU(fieldSet.f37954n.az(i2));
        }
        Iterator it = fieldSet.f37954n.ck().iterator();
        while (it.hasNext()) {
            WPU((Map.Entry) it.next());
        }
    }

    public void XQ() {
        if (this.rl) {
            return;
        }
        int iTy = this.f37954n.ty();
        for (int i2 = 0; i2 < iTy; i2++) {
            Map.Entry entryAz = this.f37954n.az(i2);
            if (entryAz.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryAz.getValue()).iF();
            }
        }
        this.f37954n.o();
        this.rl = true;
    }

    public boolean ck() {
        int iTy = this.f37954n.ty();
        for (int i2 = 0; i2 < iTy; i2++) {
            if (!Ik(this.f37954n.az(i2))) {
                return false;
            }
        }
        Iterator it = this.f37954n.ck().iterator();
        while (it.hasNext()) {
            if (!Ik((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f37954n.equals(((FieldSet) obj).f37954n);
        }
        return false;
    }

    public int hashCode() {
        return this.f37954n.hashCode();
    }

    public int mUb() {
        int iTy = this.f37954n.ty();
        int iGh = 0;
        for (int i2 = 0; i2 < iTy; i2++) {
            iGh += gh(this.f37954n.az(i2));
        }
        Iterator it = this.f37954n.ck().iterator();
        while (it.hasNext()) {
            iGh += gh((Map.Entry) it.next());
        }
        return iGh;
    }

    public int qie() {
        int iTy = this.f37954n.ty();
        int iJ2 = 0;
        for (int i2 = 0; i2 < iTy; i2++) {
            Map.Entry entryAz = this.f37954n.az(i2);
            iJ2 += J2((FieldDescriptorLite) entryAz.getKey(), entryAz.getValue());
        }
        for (Map.Entry entry : this.f37954n.ck()) {
            iJ2 += J2((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iJ2;
    }

    boolean ty() {
        return this.f37954n.isEmpty();
    }

    public Object xMQ(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f37954n.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).J2() : obj;
    }

    private FieldSet(boolean z2) {
        this(SmallSortedMap.Z());
        XQ();
    }

    private static boolean Ik(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (!r(list.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
            return r(entry.getValue());
        }
        return true;
    }

    public static int J2(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List list = (List) obj;
            int size = list.size();
            int i2 = 0;
            if (fieldDescriptorLite.isPacked()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iO = 0;
                while (i2 < size) {
                    iO += O(liteType, list.get(i2));
                    i2++;
                }
                return CodedOutputStream.a(number) + iO + CodedOutputStream.GR(iO);
            }
            int iNr = 0;
            while (i2 < size) {
                iNr += nr(liteType, number, list.get(i2));
                i2++;
            }
            return iNr;
        }
        return nr(liteType, number, obj);
    }

    private void WPU(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof LazyField;
        if (fieldDescriptorLite.isRepeated()) {
            if (!z2) {
                Object objXMQ = xMQ(fieldDescriptorLite);
                if (objXMQ == null) {
                    objXMQ = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) objXMQ).add(t(it.next()));
                }
                this.f37954n.put(fieldDescriptorLite, objXMQ);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object objXMQ2 = xMQ(fieldDescriptorLite);
            if (objXMQ2 == null) {
                this.f37954n.put(fieldDescriptorLite, t(value));
                if (z2) {
                    this.f37955t = true;
                    return;
                }
                return;
            }
            if (z2) {
                value = ((LazyField) value).J2();
            }
            this.f37954n.put(fieldDescriptorLite, fieldDescriptorLite.O(((MessageLite) objXMQ2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (!z2) {
            this.f37954n.put(fieldDescriptorLite, t(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    private int gh(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.T(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value);
            }
            return CodedOutputStream.wTp(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
        }
        return J2(fieldDescriptorLite, value);
    }

    private void nY(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (o(fieldDescriptorLite.getLiteType(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().n(), obj.getClass().getName()));
        }
    }

    static int nr(WireFormat.FieldType fieldType, int i2, Object obj) {
        int iA = CodedOutputStream.a(i2);
        if (fieldType == WireFormat.FieldType.f38214X) {
            iA *= 2;
        }
        return iA + O(fieldType, obj);
    }

    private static boolean o(WireFormat.FieldType fieldType, Object obj) {
        Internal.n(obj);
        switch (AnonymousClass1.f37956n[fieldType.n().ordinal()]) {
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof Internal.EnumLite)) {
                }
                break;
            case 9:
                if ((obj instanceof MessageLite) || (obj instanceof LazyField)) {
                }
                break;
        }
        return false;
    }

    Iterator Uo() {
        if (ty()) {
            return Collections.emptyIterator();
        }
        if (this.f37955t) {
            return new LazyField.LazyIterator(this.f37954n.gh().iterator());
        }
        return this.f37954n.gh().iterator();
    }

    public void ViF(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (fieldDescriptorLite.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    nY(fieldDescriptorLite, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            nY(fieldDescriptorLite, obj);
        }
        if (obj instanceof LazyField) {
            this.f37955t = true;
        }
        this.f37954n.put(fieldDescriptorLite, obj);
    }

    public Iterator Z() {
        if (ty()) {
            return Collections.emptyIterator();
        }
        if (this.f37955t) {
            return new LazyField.LazyIterator(this.f37954n.entrySet().iterator());
        }
        return this.f37954n.entrySet().iterator();
    }

    public void n(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List arrayList;
        if (fieldDescriptorLite.isRepeated()) {
            nY(fieldDescriptorLite, obj);
            Object objXMQ = xMQ(fieldDescriptorLite);
            if (objXMQ == null) {
                arrayList = new ArrayList();
                this.f37954n.put(fieldDescriptorLite, arrayList);
            } else {
                arrayList = (List) objXMQ;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public FieldSet clone() {
        FieldSet fieldSetAYN = aYN();
        int iTy = this.f37954n.ty();
        for (int i2 = 0; i2 < iTy; i2++) {
            Map.Entry entryAz = this.f37954n.az(i2);
            fieldSetAYN.ViF((FieldDescriptorLite) entryAz.getKey(), entryAz.getValue());
        }
        for (Map.Entry entry : this.f37954n.ck()) {
            fieldSetAYN.ViF((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetAYN.f37955t = this.f37955t;
        return fieldSetAYN;
    }

    private FieldSet(SmallSortedMap smallSortedMap) {
        this.f37954n = smallSortedMap;
        XQ();
    }
}
