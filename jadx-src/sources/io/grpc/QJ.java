package io.grpc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.io.BaseEncoding;
import d8q.jqQ.QTafcm;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object[] f68179n;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Logger f68178t = Logger.getLogger(QJ.class.getName());
    public static final I28 nr = new j();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Ml f68177O = new n();
    static final BaseEncoding J2 = BaseEncoding.n().gh();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static abstract class CN3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final BitSet f68180O = rl();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f68181n;
        private final Object nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final byte[] f68182t;

        /* synthetic */ CN3(String str, boolean z2, Object obj, j jVar) {
            this(str, z2, obj);
        }

        public static CN3 O(String str, Ml ml) {
            return J2(str, false, ml);
        }

        abstract Object KN(byte[] bArr);

        abstract byte[] mUb(Object obj);

        boolean xMQ() {
            return false;
        }

        private CN3(String str, boolean z2, Object obj) {
            String str2 = (String) t1.Xo.ck(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f68181n = str2;
            String strGh = gh(str2.toLowerCase(Locale.ROOT), z2);
            this.rl = strGh;
            this.f68182t = strGh.getBytes(t1.I28.f73395n);
            this.nr = obj;
        }

        static CN3 J2(String str, boolean z2, Ml ml) {
            return new w6(str, z2, ml, null);
        }

        static CN3 Uo(String str, boolean z2, aC aCVar) {
            return new Dsr(str, z2, aCVar, null);
        }

        private static String gh(String str, boolean z2) {
            t1.Xo.ck(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            t1.Xo.O(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                QJ.f68178t.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (!z2 || cCharAt != ':' || i2 != 0) {
                    t1.Xo.Uo(f68180O.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, str);
                }
            }
            return str;
        }

        private static BitSet rl() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            for (char c4 = 'a'; c4 <= 'z'; c4 = (char) (c4 + 1)) {
                bitSet.set(c4);
            }
            return bitSet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.rl.equals(((CN3) obj).rl);
        }

        public final int hashCode() {
            return this.rl.hashCode();
        }

        byte[] n() {
            return this.f68182t;
        }

        public final String nr() {
            return this.rl;
        }

        final Object t(Class cls) {
            if (cls.isInstance(this.nr)) {
                return cls.cast(this.nr);
            }
            return null;
        }

        public String toString() {
            return QTafcm.zFt + this.rl + "'}";
        }
    }

    private static final class Dsr extends CN3 {
        private final aC J2;

        /* synthetic */ Dsr(String str, boolean z2, aC aCVar, j jVar) {
            this(str, z2, aCVar);
        }

        private Dsr(String str, boolean z2, aC aCVar) {
            super(str, z2, aCVar, null);
            t1.Xo.qie(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.J2 = (aC) t1.Xo.ck(aCVar, "marshaller");
        }

        @Override // io.grpc.QJ.CN3
        Object KN(byte[] bArr) {
            return this.J2.rl(bArr);
        }

        @Override // io.grpc.QJ.CN3
        byte[] mUb(Object obj) {
            return (byte[]) t1.Xo.ck(this.J2.n(obj), "null marshaller.toAsciiString()");
        }
    }

    public interface I28 {
    }

    public interface Ml {
        String n(Object obj);

        Object rl(String str);
    }

    public interface Wre {
    }

    interface aC {
        byte[] n(Object obj);

        Object rl(byte[] bArr);
    }

    static final class fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f68183n;
        private volatile byte[] rl;

        InputStream O() {
            throw null;
        }

        static fuX n(CN3 cn3, Object obj) {
            rl(cn3);
            android.support.v4.media.j.n(t1.Xo.HI(null));
            return new fuX(null, obj);
        }

        private static Wre rl(CN3 cn3) {
            android.support.v4.media.j.n(cn3.t(Wre.class));
            return null;
        }

        byte[] t() {
            if (this.rl == null) {
                synchronized (this) {
                    try {
                        if (this.rl == null) {
                            this.rl = QJ.r(O());
                        }
                    } finally {
                    }
                }
            }
            return this.rl;
        }

        fuX(Wre wre, Object obj) {
            this.f68183n = obj;
        }

        Object nr(CN3 cn3) {
            if (cn3.xMQ()) {
                rl(cn3);
            }
            return cn3.KN(t());
        }
    }

    private static class w6 extends CN3 {
        private final Ml J2;

        /* synthetic */ w6(String str, boolean z2, Ml ml, j jVar) {
            this(str, z2, ml);
        }

        private w6(String str, boolean z2, Ml ml) {
            super(str, z2, ml, null);
            t1.Xo.qie(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.J2 = (Ml) t1.Xo.ck(ml, "marshaller");
        }

        @Override // io.grpc.QJ.CN3
        Object KN(byte[] bArr) {
            return this.J2.rl(new String(bArr, t1.I28.f73395n));
        }

        @Override // io.grpc.QJ.CN3
        byte[] mUb(Object obj) {
            return ((String) t1.Xo.ck(this.J2.n(obj), "null marshaller.toAsciiString()")).getBytes(t1.I28.f73395n);
        }
    }

    QJ(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    class j implements I28 {
        j() {
        }
    }

    class n implements Ml {
        @Override // io.grpc.QJ.Ml
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public String n(String str) {
            return str;
        }

        @Override // io.grpc.QJ.Ml
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public String rl(String str) {
            return str;
        }

        n() {
        }
    }

    QJ(int i2, byte[]... bArr) {
        this(i2, (Object[]) bArr);
    }

    private byte[] HI(int i2) {
        return (byte[]) this.f68179n[i2 * 2];
    }

    private void J2(int i2) {
        Object[] objArr = new Object[i2];
        if (!xMQ()) {
            System.arraycopy(this.f68179n, 0, objArr, 0, gh());
        }
        this.f68179n = objArr;
    }

    private void XQ(int i2, byte[] bArr) {
        this.f68179n[(i2 * 2) + 1] = bArr;
    }

    private void Z(int i2, Object obj) {
        if (this.f68179n instanceof byte[][]) {
            J2(nr());
        }
        this.f68179n[(i2 * 2) + 1] = obj;
    }

    private int gh() {
        return this.rl * 2;
    }

    private int nr() {
        Object[] objArr = this.f68179n;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private Object o(int i2) {
        return this.f68179n[(i2 * 2) + 1];
    }

    private void ty(int i2, byte[] bArr) {
        this.f68179n[i2 * 2] = bArr;
    }

    private boolean xMQ() {
        return this.rl == 0;
    }

    int KN() {
        return this.rl;
    }

    public Object Uo(CN3 cn3) {
        for (int i2 = this.rl - 1; i2 >= 0; i2--) {
            if (t(cn3.n(), HI(i2))) {
                return WPU(i2, cn3);
            }
        }
        return null;
    }

    public void ck(CN3 cn3, Object obj) {
        t1.Xo.ck(cn3, "key");
        t1.Xo.ck(obj, "value");
        qie();
        ty(this.rl, cn3.n());
        if (cn3.xMQ()) {
            Z(this.rl, fuX.n(cn3, obj));
        } else {
            XQ(this.rl, cn3.mUb(obj));
        }
        this.rl++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i2 = 0; i2 < this.rl; i2++) {
            if (i2 != 0) {
                sb.append(',');
            }
            byte[] bArrHI = HI(i2);
            Charset charset = t1.I28.f73395n;
            String str = new String(bArrHI, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(J2.O(S(i2)));
            } else {
                sb.append(new String(S(i2), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    QJ(int i2, Object[] objArr) {
        this.rl = i2;
        this.f68179n = objArr;
    }

    private byte[] S(int i2) {
        Object objO = o(i2);
        if (objO instanceof byte[]) {
            return (byte[]) objO;
        }
        return ((fuX) objO).t();
    }

    private Object WPU(int i2, CN3 cn3) {
        Object objO = o(i2);
        if (objO instanceof byte[]) {
            return cn3.KN((byte[]) objO);
        }
        return ((fuX) objO).nr(cn3);
    }

    private void qie() {
        if (gh() != 0 && gh() != nr()) {
            return;
        }
        J2(Math.max(gh() * 2, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] r(InputStream inputStream) {
        try {
            return JMO.j.nr(inputStream);
        } catch (IOException e2) {
            throw new RuntimeException("failure reading serialized stream", e2);
        }
    }

    private boolean t(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    byte[][] Ik() {
        byte[][] bArr = new byte[gh()][];
        Object[] objArr = this.f68179n;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, gh());
            return bArr;
        }
        for (int i2 = 0; i2 < this.rl; i2++) {
            int i3 = i2 * 2;
            bArr[i3] = HI(i2);
            bArr[i3 + 1] = S(i2);
        }
        return bArr;
    }

    public void O(CN3 cn3) {
        if (xMQ()) {
            return;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.rl; i3++) {
            if (!t(cn3.n(), HI(i3))) {
                ty(i2, HI(i3));
                Z(i2, o(i3));
                i2++;
            }
        }
        Arrays.fill(this.f68179n, i2 * 2, gh(), (Object) null);
        this.rl = i2;
    }

    public void az(QJ qj) {
        if (qj.xMQ()) {
            return;
        }
        int iNr = nr() - gh();
        if (xMQ() || iNr < qj.gh()) {
            J2(gh() + qj.gh());
        }
        System.arraycopy(qj.f68179n, 0, this.f68179n, gh(), qj.gh());
        this.rl += qj.rl;
    }

    public Set mUb() {
        if (xMQ()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(this.rl);
        for (int i2 = 0; i2 < this.rl; i2++) {
            hashSet.add(new String(HI(i2), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public QJ() {
    }
}
