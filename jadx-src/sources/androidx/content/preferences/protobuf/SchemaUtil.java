package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
final class SchemaUtil {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Class f38139n = te();
    private static final UnknownFieldSchema rl = iF();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final UnknownFieldSchema f38140t = new UnknownFieldSetLiteSchema();

    private static UnknownFieldSchema iF() {
        try {
            Class clsFD = fD();
            if (clsFD == null) {
                return null;
            }
            return (UnknownFieldSchema) clsFD.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void B(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i2, list, z2);
    }

    public static void D(int i2, List list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i2, list);
    }

    public static void E(int i2, List list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.J2(i2, list, schema);
    }

    public static void FX(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i2, list, z2);
    }

    static int HI(int i2, Object obj, Schema schema) {
        return obj instanceof LazyFieldLite ? CodedOutputStream.N(i2, (LazyFieldLite) obj) : CodedOutputStream.rV9(i2, (MessageLite) obj, schema);
    }

    public static void I(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i2, list, z2);
    }

    public static void J(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i2, list, z2);
    }

    public static void M(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i2, list, z2);
    }

    public static void M7(int i2, List list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.n(i2, list, schema);
    }

    static boolean N(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void P5(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i2, list, z2);
    }

    public static void T(Class cls) {
        Class cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && !Protobuf.nr && (cls2 = f38139n) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void U(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i2, list, z2);
    }

    public static void Xw(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i2, list, z2);
    }

    public static void a(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i2, list, z2);
    }

    public static void bzg(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i2, list, z2);
    }

    public static void eF(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i2, list, z2);
    }

    private static Class fD() {
        if (Protobuf.nr) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object g(Object obj, int i2, List list, Internal.EnumVerifier enumVerifier, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.isInRange(iIntValue)) {
                    obj2 = nHg(obj, i2, iIntValue, obj2, unknownFieldSchema);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i3 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Integer num = (Integer) list.get(i5);
            int iIntValue2 = num.intValue();
            if (enumVerifier.isInRange(iIntValue2)) {
                if (i5 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = nHg(obj, i2, iIntValue2, obj2, unknownFieldSchema);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    public static void jB(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i2, list, z2);
    }

    static Object nHg(Object obj, int i2, int i3, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (obj2 == null) {
            obj2 = unknownFieldSchema.J2(obj);
        }
        unknownFieldSchema.O(obj2, i2, i3);
        return obj2;
    }

    static Object nY(Object obj, int i2, List list, Internal.EnumLiteMap enumLiteMap, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumLiteMap == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) == null) {
                    obj2 = nHg(obj, i2, iIntValue, obj2, unknownFieldSchema);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i3 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Integer num = (Integer) list.get(i5);
            int iIntValue2 = num.intValue();
            if (enumLiteMap.findValueByNumber(iIntValue2) != null) {
                if (i5 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = nHg(obj, i2, iIntValue2, obj2, unknownFieldSchema);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    public static void p5(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i2, list, z2);
    }

    public static void rV9(int i2, List list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i2, list);
    }

    public static UnknownFieldSchema s7N() {
        return rl;
    }

    private static Class te() {
        if (Protobuf.nr) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void v(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i2, list, z2);
    }

    public static UnknownFieldSchema wTp() {
        return f38140t;
    }

    static void E2(ExtensionSchema extensionSchema, Object obj, Object obj2) {
        FieldSet fieldSetT = extensionSchema.t(obj2);
        if (!fieldSetT.ty()) {
            extensionSchema.nr(obj).S(fieldSetT);
        }
    }

    static int Ik(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(iR);
        }
        return iR + (size * CodedOutputStream.a(i2));
    }

    static int J2(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(size * 4);
        }
        return size * CodedOutputStream.XQ(i2, 0);
    }

    static int KN(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(size * 8);
        }
        return size * CodedOutputStream.WPU(i2, 0L);
    }

    static int O(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int iZ = 0;
            while (i2 < size) {
                iZ += CodedOutputStream.Z(intArrayList.getInt(i2));
                i2++;
            }
            return iZ;
        }
        int iZ2 = 0;
        while (i2 < size) {
            iZ2 += CodedOutputStream.Z(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iZ2;
    }

    static int S(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iWPU = WPU(list);
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(iWPU);
        }
        return iWPU + (size * CodedOutputStream.a(i2));
    }

    static int Uo(List list) {
        return list.size() * 4;
    }

    static int ViF(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int iY = 0;
            while (i2 < size) {
                iY += CodedOutputStream.Y(longArrayList.getLong(i2));
                i2++;
            }
            return iY;
        }
        int iY2 = 0;
        while (i2 < size) {
            iY2 += CodedOutputStream.Y(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iY2;
    }

    static int WPU(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int iGR = 0;
            while (i2 < size) {
                iGR += CodedOutputStream.GR(intArrayList.getInt(i2));
                i2++;
            }
            return iGR;
        }
        int iGR2 = 0;
        while (i2 < size) {
            iGR2 += CodedOutputStream.GR(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iGR2;
    }

    static void X(UnknownFieldSchema unknownFieldSchema, Object obj, Object obj2) {
        unknownFieldSchema.ck(obj, unknownFieldSchema.gh(unknownFieldSchema.Uo(obj), unknownFieldSchema.Uo(obj2)));
    }

    static int XQ(int i2, List list) {
        int iD;
        int iD2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iA = CodedOutputStream.a(i2) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i3 < size) {
                Object raw = lazyStringList.getRaw(i3);
                if (raw instanceof ByteString) {
                    iD2 = CodedOutputStream.ck((ByteString) raw);
                } else {
                    iD2 = CodedOutputStream.D((String) raw);
                }
                iA += iD2;
                i3++;
            }
            return iA;
        }
        while (i3 < size) {
            Object obj = list.get(i3);
            if (obj instanceof ByteString) {
                iD = CodedOutputStream.ck((ByteString) obj);
            } else {
                iD = CodedOutputStream.D((String) obj);
            }
            iA += iD;
            i3++;
        }
        return iA;
    }

    static int Z(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int iB = 0;
            while (i2 < size) {
                iB += CodedOutputStream.B(longArrayList.getLong(i2));
                i2++;
            }
            return iB;
        }
        int iB2 = 0;
        while (i2 < size) {
            iB2 += CodedOutputStream.B(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iB2;
    }

    static int aYN(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iViF = ViF(list);
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(iViF);
        }
        return iViF + (size * CodedOutputStream.a(i2));
    }

    static int az(int i2, List list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        int iTy = ty(list);
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(iTy);
        }
        return iTy + (list.size() * CodedOutputStream.a(i2));
    }

    static int ck(int i2, List list, Schema schema) {
        int iXw;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = CodedOutputStream.a(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof LazyFieldLite) {
                iXw = CodedOutputStream.nHg((LazyFieldLite) obj);
            } else {
                iXw = CodedOutputStream.Xw((MessageLite) obj, schema);
            }
            iA += iXw;
        }
        return iA;
    }

    static void e(MapFieldSchema mapFieldSchema, Object obj, Object obj2, long j2) {
        UnsafeUtil.FX(obj, j2, mapFieldSchema.mergeFrom(UnsafeUtil.T(obj, j2), UnsafeUtil.T(obj2, j2)));
    }

    static int gh(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQie = qie(list);
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(iQie);
        }
        return iQie + (size * CodedOutputStream.a(i2));
    }

    static int mUb(int i2, List list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iG += CodedOutputStream.g(i2, (MessageLite) list.get(i3), schema);
        }
        return iG;
    }

    static int n(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(size);
        }
        return size * CodedOutputStream.qie(i2, true);
    }

    static int nr(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = O(list);
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(iO);
        }
        return iO + (size * CodedOutputStream.a(i2));
    }

    static int o(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = Z(list);
        if (z2) {
            return CodedOutputStream.a(i2) + CodedOutputStream.s7N(iZ);
        }
        return iZ + (size * CodedOutputStream.a(i2));
    }

    static int qie(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int iE2 = 0;
            while (i2 < size) {
                iE2 += CodedOutputStream.E2(intArrayList.getInt(i2));
                i2++;
            }
            return iE2;
        }
        int iE22 = 0;
        while (i2 < size) {
            iE22 += CodedOutputStream.E2(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iE22;
    }

    static int r(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int iM = 0;
            while (i2 < size) {
                iM += CodedOutputStream.M(intArrayList.getInt(i2));
                i2++;
            }
            return iM;
        }
        int iM2 = 0;
        while (i2 < size) {
            iM2 += CodedOutputStream.M(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iM2;
    }

    static int rl(List list) {
        return list.size();
    }

    static int t(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = size * CodedOutputStream.a(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += CodedOutputStream.ck((ByteString) list.get(i3));
        }
        return iA;
    }

    static int ty(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int iX = 0;
            while (i2 < size) {
                iX += CodedOutputStream.X(longArrayList.getLong(i2));
                i2++;
            }
            return iX;
        }
        int iX2 = 0;
        while (i2 < size) {
            iX2 += CodedOutputStream.X(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iX2;
    }

    static int xMQ(List list) {
        return list.size() * 8;
    }
}
