package QMK;

import JP.DAz;
import JP.Ew;
import com.google.protobuf.AbstractC1923o;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.KH;
import com.google.protobuf.QJ;
import com.google.protobuf.yg;
import io.grpc.SPz;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static volatile QJ f8047n = QJ.getEmptyRegistry();

    private static final class j implements DAz.w6 {
        private static final ThreadLocal nr = new ThreadLocal();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final KH f8048n;
        private final yg rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f8049t;

        private yg nr(AbstractC1923o abstractC1923o) throws InvalidProtocolBufferException {
            yg ygVar = (yg) this.f8048n.parseFrom(abstractC1923o, n.f8047n);
            try {
                abstractC1923o.checkLastTagWas(0);
                return ygVar;
            } catch (InvalidProtocolBufferException e2) {
                e2.setUnfinishedMessage(ygVar);
                throw e2;
            }
        }

        @Override // JP.DAz.w6
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public InputStream n(yg ygVar) {
            return new QMK.j(ygVar, this.f8048n);
        }

        @Override // JP.DAz.w6
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public yg rl(InputStream inputStream) {
            AbstractC1923o abstractC1923oNewInstance;
            byte[] bArr;
            if ((inputStream instanceof QMK.j) && ((QMK.j) inputStream).Uo() == this.f8048n) {
                try {
                    return ((QMK.j) inputStream).rl();
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof Ew) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.rl;
                        }
                        abstractC1923oNewInstance = null;
                    } else {
                        ThreadLocal threadLocal = nr;
                        Reference reference = (Reference) threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i2 = iAvailable;
                        while (i2 > 0) {
                            int i3 = inputStream.read(bArr, iAvailable - i2, i2);
                            if (i3 == -1) {
                                break;
                            }
                            i2 -= i3;
                        }
                        if (i2 != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i2));
                        }
                        abstractC1923oNewInstance = AbstractC1923o.newInstance(bArr, 0, iAvailable);
                    }
                } else {
                    abstractC1923oNewInstance = null;
                }
                if (abstractC1923oNewInstance == null) {
                    abstractC1923oNewInstance = AbstractC1923o.newInstance(inputStream);
                }
                abstractC1923oNewInstance.setSizeLimit(Integer.MAX_VALUE);
                int i5 = this.f8049t;
                if (i5 >= 0) {
                    abstractC1923oNewInstance.setRecursionLimit(i5);
                }
                try {
                    return nr(abstractC1923oNewInstance);
                } catch (InvalidProtocolBufferException e2) {
                    throw SPz.f68187o.Ik("Invalid protobuf byte sequence").ck(e2).nr();
                }
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }

        j(yg ygVar, int i2) {
            this.rl = (yg) Xo.ck(ygVar, "defaultInstance cannot be null");
            this.f8048n = ygVar.getParserForType();
            this.f8049t = i2;
        }
    }

    static long n(InputStream inputStream, OutputStream outputStream) throws IOException {
        Xo.ck(inputStream, "inputStream cannot be null!");
        Xo.ck(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return j2;
            }
            outputStream.write(bArr, 0, i2);
            j2 += (long) i2;
        }
    }

    public static DAz.w6 rl(yg ygVar) {
        return new j(ygVar, -1);
    }
}
