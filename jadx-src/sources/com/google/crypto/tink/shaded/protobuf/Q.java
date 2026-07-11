package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.I28;
import com.google.crypto.tink.shaded.protobuf.SPz;
import com.google.crypto.tink.shaded.protobuf.j;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Q extends com.google.crypto.tink.shaded.protobuf.j {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, Q> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected fg unknownFields = fg.t();

    public enum Ml {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static abstract class j extends j.AbstractC0803j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Q f59925n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        protected Q f59926t;

        private Q qie() {
            return this.f59925n.fD();
        }

        protected final void J2() {
            if (this.f59926t.aYN()) {
                return;
            }
            KN();
        }

        public Q nr() {
            if (!this.f59926t.aYN()) {
                return this.f59926t;
            }
            this.f59926t.ViF();
            return this.f59926t;
        }

        public Q xMQ() {
            return this.f59925n;
        }

        protected j(Q q2) {
            this.f59925n = q2;
            if (!q2.aYN()) {
                this.f59926t = qie();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static void gh(Object obj, Object obj2) {
            yg.n().nr(obj).mergeFrom(obj, obj2);
        }

        protected void KN() {
            Q qQie = qie();
            gh(qQie, this.f59926t);
            this.f59926t = qQie;
        }

        public j O() {
            j jVarTe = xMQ().te();
            jVarTe.f59926t = nr();
            return jVarTe;
        }

        public j mUb(Q q2) {
            if (xMQ().equals(q2)) {
                return this;
            }
            J2();
            gh(this.f59926t, q2);
            return this;
        }

        public final Q t() {
            Q qNr = nr();
            if (qNr.S()) {
                return qNr;
            }
            throw j.AbstractC0803j.rl(qNr);
        }
    }

    public static class w6 extends qz {
    }

    protected static Q X(Q q2, byte[] bArr, Xo xo) {
        return J2(nHg(q2, bArr, 0, bArr.length, xo));
    }

    public final boolean S() {
        return WPU(this, true);
    }

    void Uo() {
        this.memoizedHashCode = 0;
    }

    protected Object az(Ml ml, Object obj) {
        return ty(ml, obj, null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rv6
    public int getSerializedSize() {
        return rl(null);
    }

    protected Object qie(Ml ml) {
        return ty(ml, null, null);
    }

    protected abstract Object ty(Ml ml, Object obj, Object obj2);

    protected static class n extends com.google.crypto.tink.shaded.protobuf.n {
        private final Q rl;

        public n(Q q2) {
            this.rl = q2;
        }
    }

    private static Q J2(Q q2) throws InvalidProtocolBufferException {
        if (q2 == null || q2.S()) {
            return q2;
        }
        throw q2.nr().n().gh(q2);
    }

    protected static final boolean WPU(Q q2, boolean z2) {
        byte bByteValue = ((Byte) q2.qie(Ml.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = yg.n().nr(q2).isInitialized(q2);
        if (z2) {
            q2.az(Ml.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? q2 : null);
        }
        return zIsInitialized;
    }

    static Q ck(Class cls) {
        Q q2 = defaultInstanceMap.get(cls);
        if (q2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                q2 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (q2 != null) {
            return q2;
        }
        Q qIk = ((Q) o7q.gh(cls)).Ik();
        if (qIk == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, qIk);
        return qIk;
    }

    protected static Object iF(rv6 rv6Var, String str, Object[] objArr) {
        return new Sis(rv6Var, str, objArr);
    }

    private int mUb(mz mzVar) {
        return mzVar == null ? yg.n().nr(this).getSerializedSize(this) : mzVar.getSerializedSize(this);
    }

    public final Q Ik() {
        return (Q) qie(Ml.GET_DEFAULT_INSTANCE);
    }

    Object O() {
        return qie(Ml.BUILD_MESSAGE_INFO);
    }

    boolean aYN() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return yg.n().nr(this).equals(this, (Q) obj);
        }
        return false;
    }

    Q fD() {
        return (Q) qie(Ml.NEW_MUTABLE_INSTANCE);
    }

    protected final j gh() {
        return (j) qie(Ml.NEW_BUILDER);
    }

    void nY() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    int o() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    int r() {
        return this.memoizedHashCode;
    }

    public final j rV9() {
        return ((j) qie(Ml.NEW_BUILDER)).mUb(this);
    }

    public final j te() {
        return (j) qie(Ml.NEW_BUILDER);
    }

    void v(int i2) {
        if (i2 >= 0) {
            this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i2);
        }
    }

    void wTp(int i2) {
        this.memoizedHashCode = i2;
    }

    protected static Q E2(Q q2, fuX fux, Xo xo) {
        return J2(T(q2, fux, xo));
    }

    protected static SPz.Ml HI() {
        return pO.nr();
    }

    static Q N(Q q2, Dsr dsr, Xo xo) throws InvalidProtocolBufferException {
        Q qFD = q2.fD();
        try {
            mz mzVarNr = yg.n().nr(qFD);
            mzVarNr.rl(qFD, aC.J2(dsr), xo);
            mzVarNr.makeImmutable(qFD);
            return qFD;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.n()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.gh(qFD);
        } catch (UninitializedMessageException e3) {
            throw e3.n().gh(qFD);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).gh(qFD);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    private static Q T(Q q2, fuX fux, Xo xo) throws InvalidProtocolBufferException {
        Dsr dsrTy = fux.ty();
        Q qN = N(q2, dsrTy, xo);
        try {
            dsrTy.n(0);
            return qN;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.gh(qN);
        }
    }

    static Object XQ(Method method, Object obj, Object... objArr) {
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

    protected static Q e(Q q2, InputStream inputStream, Xo xo) {
        return J2(N(q2, Dsr.J2(inputStream), xo));
    }

    protected static SPz.Ml g(SPz.Ml ml) {
        int i2;
        int size = ml.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size * 2;
        }
        return ml.mutableCopyWithCapacity(i2);
    }

    private static Q nHg(Q q2, byte[] bArr, int i2, int i3, Xo xo) throws InvalidProtocolBufferException {
        Q qFD = q2.fD();
        try {
            mz mzVarNr = yg.n().nr(qFD);
            mzVarNr.n(qFD, bArr, i2, i2 + i3, new I28.j(xo));
            mzVarNr.makeImmutable(qFD);
            return qFD;
        } catch (InvalidProtocolBufferException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException = e2;
            if (invalidProtocolBufferException.n()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException(invalidProtocolBufferException);
            }
            throw invalidProtocolBufferException.gh(qFD);
        } catch (UninitializedMessageException e3) {
            throw e3.n().gh(qFD);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).gh(qFD);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.az().gh(qFD);
        }
    }

    protected static void s7N(Class cls, Q q2) {
        q2.nY();
        defaultInstanceMap.put(cls, q2);
    }

    void KN() {
        v(Integer.MAX_VALUE);
    }

    protected void ViF() {
        yg.n().nr(this).makeImmutable(this);
        nY();
    }

    boolean Z() {
        if (r() == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (aYN()) {
            return xMQ();
        }
        if (Z()) {
            wTp(xMQ());
        }
        return r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rv6
    public void n(CodedOutputStream codedOutputStream) {
        yg.n().nr(this).t(this, C.Uo(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j
    int rl(mz mzVar) {
        if (aYN()) {
            int iMUb = mUb(mzVar);
            if (iMUb >= 0) {
                return iMUb;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iMUb);
        }
        if (o() != Integer.MAX_VALUE) {
            return o();
        }
        int iMUb2 = mUb(mzVar);
        v(iMUb2);
        return iMUb2;
    }

    public String toString() {
        return Lu.J2(this, super.toString());
    }

    int xMQ() {
        return yg.n().nr(this).hashCode(this);
    }
}
