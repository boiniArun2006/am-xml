package io.grpc;

import io.grpc.QJ;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import t1.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class SPz {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    static final QJ.CN3 f68185S;
    private static final QJ.aC WPU;
    static final QJ.CN3 aYN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f68189n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Throwable f68190t;
    private static final List nr = J2();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final SPz f68184O = n.OK.rl();
    public static final SPz J2 = n.CANCELLED.rl();
    public static final SPz Uo = n.UNKNOWN.rl();
    public static final SPz KN = n.INVALID_ARGUMENT.rl();
    public static final SPz xMQ = n.DEADLINE_EXCEEDED.rl();
    public static final SPz mUb = n.NOT_FOUND.rl();
    public static final SPz gh = n.ALREADY_EXISTS.rl();
    public static final SPz qie = n.PERMISSION_DENIED.rl();
    public static final SPz az = n.UNAUTHENTICATED.rl();
    public static final SPz ty = n.RESOURCE_EXHAUSTED.rl();
    public static final SPz HI = n.FAILED_PRECONDITION.rl();
    public static final SPz ck = n.ABORTED.rl();
    public static final SPz Ik = n.OUT_OF_RANGE.rl();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final SPz f68188r = n.UNIMPLEMENTED.rl();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final SPz f68187o = n.INTERNAL.rl();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final SPz f68186Z = n.UNAVAILABLE.rl();
    public static final SPz XQ = n.DATA_LOSS.rl();

    private static final class Ml implements QJ.aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final byte[] f68191n = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private Ml() {
        }

        private static String O(byte[] bArr) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
            int i2 = 0;
            while (i2 < bArr.length) {
                if (bArr[i2] == 37 && i2 + 2 < bArr.length) {
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i2 + 1, 2, t1.I28.f73395n), 16));
                        i2 += 3;
                    } catch (NumberFormatException unused) {
                        byteBufferAllocate.put(bArr[i2]);
                        i2++;
                    }
                }
                byteBufferAllocate.put(bArr[i2]);
                i2++;
            }
            return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), t1.I28.f73396t);
        }

        private static byte[] Uo(byte[] bArr, int i2) {
            byte[] bArr2 = new byte[((bArr.length - i2) * 3) + i2];
            if (i2 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i2);
            }
            int i3 = i2;
            while (i2 < bArr.length) {
                byte b2 = bArr[i2];
                if (t(b2)) {
                    bArr2[i3] = 37;
                    byte[] bArr3 = f68191n;
                    bArr2[i3 + 1] = bArr3[(b2 >> 4) & 15];
                    bArr2[i3 + 2] = bArr3[b2 & 15];
                    i3 += 3;
                } else {
                    bArr2[i3] = b2;
                    i3++;
                }
                i2++;
            }
            return Arrays.copyOf(bArr2, i3);
        }

        private static boolean t(byte b2) {
            return b2 < 32 || b2 >= 126 || b2 == 37;
        }

        @Override // io.grpc.QJ.aC
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public String rl(byte[] bArr) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b2 = bArr[i2];
                if (b2 < 32 || b2 >= 126 || (b2 == 37 && i2 + 2 < bArr.length)) {
                    return O(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // io.grpc.QJ.aC
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public byte[] n(String str) {
            byte[] bytes = str.getBytes(t1.I28.f73396t);
            for (int i2 = 0; i2 < bytes.length; i2++) {
                if (t(bytes[i2])) {
                    return Uo(bytes, i2);
                }
            }
            return bytes;
        }
    }

    public enum n {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f68204n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final byte[] f68205t;

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] nr() {
            return this.f68205t;
        }

        public int t() {
            return this.f68204n;
        }

        n(int i2) {
            this.f68204n = i2;
            this.f68205t = Integer.toString(i2).getBytes(t1.I28.f73395n);
        }

        public SPz rl() {
            return (SPz) SPz.nr.get(this.f68204n);
        }
    }

    private SPz(n nVar) {
        this(nVar, null, null);
    }

    private static SPz mUb(byte[] bArr) {
        int i2;
        byte b2;
        int length = bArr.length;
        char c2 = 1;
        if (length != 1) {
            i2 = (length == 2 && (b2 = bArr[0]) >= 48 && b2 <= 57) ? (b2 - 48) * 10 : 0;
            return Uo.Ik("Unknown code " + new String(bArr, t1.I28.f73395n));
        }
        c2 = 0;
        byte b4 = bArr[c2];
        if (b4 >= 48 && b4 <= 57) {
            int i3 = i2 + (b4 - 48);
            List list = nr;
            if (i3 < list.size()) {
                return (SPz) list.get(i3);
            }
        }
        return Uo.Ik("Unknown code " + new String(bArr, t1.I28.f73395n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SPz xMQ(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f68184O : mUb(bArr);
    }

    private static final class w6 implements QJ.aC {
        private w6() {
        }

        @Override // io.grpc.QJ.aC
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public byte[] n(SPz sPz) {
            return sPz.az().nr();
        }

        @Override // io.grpc.QJ.aC
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public SPz rl(byte[] bArr) {
            return SPz.xMQ(bArr);
        }
    }

    private SPz(n nVar, String str, Throwable th) {
        this.f68189n = (n) t1.Xo.ck(nVar, "code");
        this.rl = str;
        this.f68190t = th;
    }

    private static List J2() {
        TreeMap treeMap = new TreeMap();
        for (n nVar : n.values()) {
            SPz sPz = (SPz) treeMap.put(Integer.valueOf(nVar.t()), new SPz(nVar));
            if (sPz != null) {
                throw new IllegalStateException("Code value duplication between " + sPz.az().name() + " & " + nVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    public static SPz KN(int i2) {
        if (i2 >= 0) {
            List list = nr;
            if (i2 < list.size()) {
                return (SPz) list.get(i2);
            }
        }
        return Uo.Ik("Unknown code " + i2);
    }

    static String Uo(SPz sPz) {
        if (sPz.rl == null) {
            return sPz.f68189n.toString();
        }
        return sPz.f68189n + ": " + sPz.rl;
    }

    public static SPz gh(Throwable th) {
        for (Throwable cause = (Throwable) t1.Xo.ck(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).n();
            }
            if (cause instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) cause).n();
            }
        }
        return Uo.ck(th);
    }

    public boolean HI() {
        return n.OK == this.f68189n;
    }

    public SPz Ik(String str) {
        return t1.C.n(this.rl, str) ? this : new SPz(this.f68189n, str, this.f68190t);
    }

    public SPz O(String str) {
        if (str == null) {
            return this;
        }
        if (this.rl == null) {
            return new SPz(this.f68189n, str, this.f68190t);
        }
        return new SPz(this.f68189n, this.rl + "\n" + str, this.f68190t);
    }

    public n az() {
        return this.f68189n;
    }

    public SPz ck(Throwable th) {
        return t1.C.n(this.f68190t, th) ? this : new SPz(this.f68189n, this.rl, th);
    }

    public StatusRuntimeException nr() {
        return new StatusRuntimeException(this);
    }

    public Throwable qie() {
        return this.f68190t;
    }

    public StatusException t() {
        return new StatusException(this);
    }

    public String ty() {
        return this.rl;
    }

    static {
        f68185S = QJ.CN3.Uo("grpc-status", false, new w6());
        Ml ml = new Ml();
        WPU = ml;
        aYN = QJ.CN3.Uo("grpc-message", false, ml);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        Dsr.n nVarNr = t1.Dsr.t(this).nr("code", this.f68189n.name()).nr("description", this.rl);
        Throwable th = this.f68190t;
        Object objO = th;
        if (th != null) {
            objO = t1.SPz.O(th);
        }
        return nVarNr.nr("cause", objO).toString();
    }
}
