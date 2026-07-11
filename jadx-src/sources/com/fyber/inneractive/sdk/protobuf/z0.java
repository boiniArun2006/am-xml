package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class z0 extends b {
    private static Map<Object, z0> defaultInstanceMap = new ConcurrentHashMap();
    protected n3 unknownFields = n3.f56625f;
    protected int memoizedSerializedSize = -1;

    public static z0 a(z0 z0Var) throws n1 {
        if (z0Var == null || z0Var.isInitialized()) {
            return z0Var;
        }
        m3 m3VarNewUninitializedMessageException = z0Var.newUninitializedMessageException();
        m3VarNewUninitializedMessageException.getClass();
        throw new n1(m3VarNewUninitializedMessageException.getMessage());
    }

    public static g1 mutableCopy(g1 g1Var) {
        a1 a1Var = (a1) g1Var;
        int i2 = a1Var.f56526c;
        return a1Var.b(i2 == 0 ? 10 : i2 * 2);
    }

    public static <T extends z0> T parseDelimitedFrom(T t3, InputStream inputStream) throws n1 {
        return (T) a(a(t3, inputStream, h0.a()));
    }

    public static <T extends z0> T parseFrom(T t3, InputStream inputStream) throws n1 {
        w uVar;
        if (inputStream == null) {
            byte[] bArr = l1.f56613b;
            int length = bArr.length;
            uVar = new t(bArr, 0, length, false);
            try {
                uVar.d(length);
            } catch (n1 e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            uVar = new u(inputStream);
        }
        return (T) a(parsePartialFrom(t3, uVar, h0.a()));
    }

    public static <T extends z0> T parsePartialFrom(T t3, w wVar, h0 h0Var) throws n1 {
        T t4 = (T) t3.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        try {
            p2 p2Var = p2.f56635c;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(t4.getClass());
            x xVar = wVar.f56696d;
            if (xVar == null) {
                xVar = new x(wVar);
            }
            t2VarA.a(t4, xVar, h0Var);
            t2VarA.c(t4);
            return t4;
        } catch (IOException e2) {
            if (e2.getCause() instanceof n1) {
                throw ((n1) e2.getCause());
            }
            throw new n1(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof n1) {
                throw ((n1) e3.getCause());
            }
            throw e3;
        }
    }

    public final <MessageType extends z0, BuilderType extends t0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(y0.NEW_BUILDER);
    }

    public Object dynamicMethod(y0 y0Var, Object obj) {
        return dynamicMethod(y0Var, obj, null);
    }

    public abstract Object dynamicMethod(y0 y0Var, Object obj, Object obj2);

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public static b1 emptyBooleanList() {
        return j.f56599d;
    }

    public static c1 emptyDoubleList() {
        return d0.f56545d;
    }

    public static f1 emptyFloatList() {
        return q0.f56640d;
    }

    public static g1 emptyIntList() {
        return a1.f56524d;
    }

    public static j1 emptyLongList() {
        return u1.f56678d;
    }

    public static <E> k1 emptyProtobufList() {
        return q2.f56643d;
    }

    public static <T extends z0> T getDefaultInstance(Class<T> cls) {
        T t3 = (T) defaultInstanceMap.get(cls);
        if (t3 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t3 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t3 != null) {
            return t3;
        }
        try {
            T t4 = (T) ((z0) x3.f56718a.allocateInstance(cls)).getDefaultInstanceForType();
            if (t4 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, t4);
            return t4;
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    public static final <T extends z0> boolean isInitialized(T t3, boolean z2) {
        byte bByteValue = ((Byte) t3.dynamicMethod(y0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        p2 p2Var = p2.f56635c;
        p2Var.getClass();
        boolean zA = p2Var.a(t3.getClass()).a(t3);
        if (z2) {
            t3.dynamicMethod(y0.SET_MEMOIZED_IS_INITIALIZED, zA ? t3 : null);
        }
        return zA;
    }

    public static Object newMessageInfo(d2 d2Var, String str, Object[] objArr) {
        return new r2(d2Var, str, objArr);
    }

    public static <ContainingType extends d2, Type> x0 newRepeatedGeneratedExtension(ContainingType containingtype, d2 d2Var, e1 e1Var, int i2, j4 j4Var, boolean z2, Class cls) {
        return new x0(containingtype, Collections.EMPTY_LIST, d2Var, new w0(e1Var, i2, j4Var, true, z2));
    }

    public static <ContainingType extends d2, Type> x0 newSingularGeneratedExtension(ContainingType containingtype, Type type, d2 d2Var, e1 e1Var, int i2, j4 j4Var, Class cls) {
        return new x0(containingtype, type, d2Var, new w0(e1Var, i2, j4Var, false, false));
    }

    public static <T extends z0> void registerDefaultInstance(Class<T> cls, T t3) {
        defaultInstanceMap.put(cls, t3);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(y0.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends z0, BuilderType extends t0> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.c();
        t0.a(buildertype.f56666b, messagetype);
        return buildertype;
    }

    public Object dynamicMethod(y0 y0Var) {
        return dynamicMethod(y0Var, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p2 p2Var = p2.f56635c;
        p2Var.getClass();
        return p2Var.a(getClass()).b(this, (z0) obj);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final z0 getDefaultInstanceForType() {
        return (z0) dynamicMethod(y0.GET_DEFAULT_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final m2 getParserForType() {
        return (m2) dynamicMethod(y0.GET_PARSER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            p2 p2Var = p2.f56635c;
            p2Var.getClass();
            this.memoizedSerializedSize = p2Var.a(getClass()).b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        p2 p2Var = p2.f56635c;
        p2Var.getClass();
        int iD = p2Var.a(getClass()).d(this);
        this.memoizedHashCode = iD;
        return iD;
    }

    public void makeImmutable() {
        p2 p2Var = p2.f56635c;
        p2Var.getClass();
        p2Var.a(getClass()).c(this);
    }

    public void mergeLengthDelimitedField(int i2, s sVar) {
        if (this.unknownFields == n3.f56625f) {
            this.unknownFields = new n3();
        }
        n3 n3Var = this.unknownFields;
        if (!n3Var.f56630e) {
            throw new UnsupportedOperationException();
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        n3Var.a((i2 << 3) | 2, sVar);
    }

    public final void mergeUnknownFields(n3 n3Var) {
        this.unknownFields = n3.a(this.unknownFields, n3Var);
    }

    public void mergeVarintField(int i2, int i3) {
        if (this.unknownFields == n3.f56625f) {
            this.unknownFields = new n3();
        }
        n3 n3Var = this.unknownFields;
        if (!n3Var.f56630e) {
            throw new UnsupportedOperationException();
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        n3Var.a(i2 << 3, Long.valueOf(i3));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public final t0 newBuilderForType() {
        return (t0) dynamicMethod(y0.NEW_BUILDER);
    }

    public boolean parseUnknownField(int i2, w wVar) throws IOException {
        if ((i2 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == n3.f56625f) {
            this.unknownFields = new n3();
        }
        return this.unknownFields.a(i2, wVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b
    public void setMemoizedSerializedSize(int i2) {
        this.memoizedSerializedSize = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public final t0 toBuilder() {
        t0 t0Var = (t0) dynamicMethod(y0.NEW_BUILDER);
        t0Var.c();
        t0.a(t0Var.f56666b, this);
        return t0Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public void writeTo(b0 b0Var) throws IOException {
        p2 p2Var = p2.f56635c;
        p2Var.getClass();
        t2 t2VarA = p2Var.a(getClass());
        c0 c0Var = b0Var.f56533a;
        if (c0Var == null) {
            c0Var = new c0(b0Var);
        }
        t2VarA.a((Object) this, c0Var);
    }

    public static x0 access$000(e0 e0Var) {
        e0Var.getClass();
        return (x0) e0Var;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        f2.a(this, sb, 0);
        return sb.toString();
    }

    public static j1 mutableCopy(j1 j1Var) {
        u1 u1Var = (u1) j1Var;
        int i2 = u1Var.f56680c;
        return u1Var.b(i2 == 0 ? 10 : i2 * 2);
    }

    public static <T extends z0> T parseDelimitedFrom(T t3, InputStream inputStream, h0 h0Var) throws n1 {
        return (T) a(a(t3, inputStream, h0Var));
    }

    public static z0 a(z0 z0Var, InputStream inputStream, h0 h0Var) throws n1 {
        try {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            if ((i2 & 128) != 0) {
                i2 &= 127;
                int i3 = 7;
                while (true) {
                    if (i3 < 32) {
                        int i5 = inputStream.read();
                        if (i5 == -1) {
                            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        i2 |= (i5 & 127) << i3;
                        if ((i5 & 128) == 0) {
                            break;
                        }
                        i3 += 7;
                    } else {
                        while (i3 < 64) {
                            int i7 = inputStream.read();
                            if (i7 == -1) {
                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                            if ((i7 & 128) != 0) {
                                i3 += 7;
                            }
                        }
                        throw new n1("CodedInputStream encountered a malformed varint.");
                    }
                }
            }
            u uVar = new u(new a(inputStream, i2));
            z0 partialFrom = parsePartialFrom(z0Var, uVar, h0Var);
            uVar.a(0);
            return partialFrom;
        } catch (IOException e2) {
            throw new n1(e2.getMessage());
        }
    }

    public static f1 mutableCopy(f1 f1Var) {
        q0 q0Var = (q0) f1Var;
        int i2 = q0Var.f56642c;
        return q0Var.b(i2 == 0 ? 10 : i2 * 2);
    }

    public static c1 mutableCopy(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        int i2 = d0Var.f56547c;
        return d0Var.b(i2 == 0 ? 10 : i2 * 2);
    }

    public static <T extends z0> T parseFrom(T t3, InputStream inputStream, h0 h0Var) throws n1 {
        w uVar;
        if (inputStream == null) {
            byte[] bArr = l1.f56613b;
            int length = bArr.length;
            uVar = new t(bArr, 0, length, false);
            try {
                uVar.d(length);
            } catch (n1 e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            uVar = new u(inputStream);
        }
        return (T) a(parsePartialFrom(t3, uVar, h0Var));
    }

    public static b1 mutableCopy(b1 b1Var) {
        j jVar = (j) b1Var;
        int i2 = jVar.f56601c;
        return jVar.b(i2 == 0 ? 10 : i2 * 2);
    }

    public static <T extends z0> T parsePartialFrom(T t3, byte[] bArr, int i2, int i3, h0 h0Var) throws n1 {
        T t4 = (T) t3.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        try {
            p2 p2Var = p2.f56635c;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(t4.getClass());
            t2VarA.a(t4, bArr, i2, i2 + i3, new f(h0Var));
            t2VarA.c(t4);
            if (t4.memoizedHashCode == 0) {
                return t4;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof n1) {
                throw ((n1) e2.getCause());
            }
            throw new n1(e2.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static <E> k1 mutableCopy(k1 k1Var) {
        int size = k1Var.size();
        return k1Var.b(size == 0 ? 10 : size * 2);
    }

    public static <T extends z0> T parseFrom(T t3, ByteBuffer byteBuffer, h0 h0Var) throws n1 {
        t tVar;
        w vVar;
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            int iRemaining = byteBuffer.remaining();
            tVar = new t(bArrArray, iPosition, iRemaining, false);
            try {
                tVar.d(iRemaining);
            } catch (n1 e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            if (byteBuffer.isDirect() && x3.f56721d) {
                vVar = new v(byteBuffer, false);
                return (T) a(parseFrom(t3, vVar, h0Var));
            }
            int iRemaining2 = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining2];
            byteBuffer.duplicate().get(bArr);
            t tVar2 = new t(bArr, 0, iRemaining2, true);
            try {
                tVar2.d(iRemaining2);
                tVar = tVar2;
            } catch (n1 e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        vVar = tVar;
        return (T) a(parseFrom(t3, vVar, h0Var));
    }

    public static <T extends z0> T parsePartialFrom(T t3, w wVar) throws n1 {
        return (T) parsePartialFrom(t3, wVar, h0.a());
    }

    public static <T extends z0> T parseFrom(T t3, ByteBuffer byteBuffer) throws n1 {
        return (T) parseFrom(t3, byteBuffer, h0.a());
    }

    public static <T extends z0> T parseFrom(T t3, s sVar) throws n1 {
        return (T) a(parseFrom(t3, sVar, h0.a()));
    }

    public static <T extends z0> T parseFrom(T t3, s sVar, h0 h0Var) throws n1 {
        w wVarD = sVar.d();
        z0 partialFrom = parsePartialFrom(t3, wVarD, h0Var);
        wVarD.a(0);
        return (T) a(partialFrom);
    }

    public static <T extends z0> T parseFrom(T t3, byte[] bArr) throws n1 {
        return (T) a(parsePartialFrom(t3, bArr, 0, bArr.length, h0.a()));
    }

    public static <T extends z0> T parseFrom(T t3, byte[] bArr, h0 h0Var) throws n1 {
        return (T) a(parsePartialFrom(t3, bArr, 0, bArr.length, h0Var));
    }

    public static <T extends z0> T parseFrom(T t3, w wVar) throws n1 {
        return (T) parseFrom(t3, wVar, h0.a());
    }

    public static <T extends z0> T parseFrom(T t3, w wVar, h0 h0Var) throws n1 {
        return (T) a(parsePartialFrom(t3, wVar, h0Var));
    }
}
