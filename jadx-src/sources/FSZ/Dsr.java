package FSZ;

import bA.C1653C;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr {
    public static final j KN = new j(null);
    private static final Class xMQ = Dsr.class;
    private final l3D J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Executor f2591O;
    private final afx Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final xfE.C f2592n;
    private final Executor nr;
    private final A72.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final A72.C f2593t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public Dsr(xfE.C fileCache, A72.fuX pooledByteBufferFactory, A72.C pooledByteStreams, Executor readExecutor, Executor writeExecutor, l3D imageCacheStatsTracker) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(readExecutor, "readExecutor");
        Intrinsics.checkNotNullParameter(writeExecutor, "writeExecutor");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f2592n = fileCache;
        this.rl = pooledByteBufferFactory;
        this.f2593t = pooledByteStreams;
        this.nr = readExecutor;
        this.f2591O = writeExecutor;
        this.J2 = imageCacheStatsTracker;
        afx afxVarRl = afx.rl();
        Intrinsics.checkNotNullExpressionValue(afxVarRl, "getInstance(...)");
        this.Uo = afxVarRl;
    }

    private final void HI(lN.Ml ml, final C1653C c1653c) {
        Class cls = xMQ;
        Dzy.j.HI(cls, "About to write to disk-cache for key %s", ml.n());
        try {
            this.f2592n.n(ml, new lN.Dsr() { // from class: FSZ.fuX
                @Override // lN.Dsr
                public final void n(OutputStream outputStream) {
                    Dsr.ck(c1653c, this, outputStream);
                }
            });
            this.J2.t(ml);
            Dzy.j.HI(cls, "Successful disk-cache write for key %s", ml.n());
        } catch (IOException e2) {
            Dzy.j.aYN(xMQ, e2, "Failed to write to disk-cache for key %s", ml.n());
        }
    }

    private final ePk.I28 J2(lN.Ml ml, C1653C c1653c) {
        Dzy.j.HI(xMQ, "Found image for %s in staging area", ml.n());
        this.J2.az(ml);
        ePk.I28 i28KN = ePk.I28.KN(c1653c);
        Intrinsics.checkNotNullExpressionValue(i28KN, "forResult(...)");
        return i28KN;
    }

    private final ePk.I28 KN(final lN.Ml ml, final AtomicBoolean atomicBoolean) {
        try {
            final Object objNr = kd.j.nr("BufferedDiskCache_getAsync");
            return ePk.I28.rl(new Callable() { // from class: FSZ.Wre
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Dsr.xMQ(objNr, atomicBoolean, this, ml);
                }
            }, this.nr);
        } catch (Exception e2) {
            Dzy.j.aYN(xMQ, e2, "Failed to schedule disk-cache read for %s", ml.n());
            return ePk.I28.Uo(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(C1653C c1653c, Dsr this$0, OutputStream os) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNull(c1653c);
        InputStream inputStreamEF = c1653c.eF();
        if (inputStreamEF == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this$0.f2593t.n(inputStreamEF, os);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(Object obj, Dsr this$0, lN.Ml key, C1653C c1653c) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objO = kd.j.O(obj, null);
        try {
            this$0.HI(key, c1653c);
        } finally {
        }
    }

    private final PooledByteBuffer qie(lN.Ml ml) throws IOException {
        try {
            Class cls = xMQ;
            Dzy.j.HI(cls, "Disk cache read for %s", ml.n());
            com.facebook.binaryresource.j jVarRl = this.f2592n.rl(ml);
            if (jVarRl == null) {
                Dzy.j.HI(cls, "Disk cache miss for %s", ml.n());
                this.J2.mUb(ml);
                return null;
            }
            Dzy.j.HI(cls, "Found entry in disk cache for %s", ml.n());
            this.J2.KN(ml);
            InputStream inputStreamN = jVarRl.n();
            try {
                PooledByteBuffer pooledByteBufferRl = this.rl.rl(inputStreamN, (int) jVarRl.size());
                inputStreamN.close();
                Dzy.j.HI(cls, "Successful read from disk cache for %s", ml.n());
                return pooledByteBufferRl;
            } catch (Throwable th) {
                inputStreamN.close();
                throw th;
            }
        } catch (IOException e2) {
            Dzy.j.aYN(xMQ, e2, "Exception reading from cache for %s", ml.n());
            this.J2.xMQ(ml);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void ty(Object obj, Dsr this$0, lN.Ml key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objO = kd.j.O(obj, null);
        try {
            this$0.Uo.O(key);
            this$0.f2592n.t(key);
            return null;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1653C xMQ(Object obj, AtomicBoolean isCancelled, Dsr this$0, lN.Ml key) {
        Intrinsics.checkNotNullParameter(isCancelled, "$isCancelled");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objO = kd.j.O(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            C1653C c1653cN = this$0.Uo.n(key);
            if (c1653cN != null) {
                Dzy.j.HI(xMQ, "Found image for %s in staging area", key.n());
                this$0.J2.az(key);
            } else {
                Dzy.j.HI(xMQ, "Did not find image for %s in staging area", key.n());
                this$0.J2.rl(key);
                try {
                    PooledByteBuffer pooledByteBufferQie = this$0.qie(key);
                    if (pooledByteBufferQie == null) {
                        return null;
                    }
                    Pj0.j jVarA = Pj0.j.a(pooledByteBufferQie);
                    Intrinsics.checkNotNullExpressionValue(jVarA, "of(...)");
                    try {
                        c1653cN = new C1653C(jVarA);
                    } finally {
                        Pj0.j.M7(jVarA);
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                return c1653cN;
            }
            Dzy.j.ty(xMQ, "Host thread was interrupted, decreasing reference count");
            c1653cN.close();
            throw new InterruptedException();
        } catch (Throwable th) {
            try {
                kd.j.t(obj, th);
                throw th;
            } finally {
                kd.j.J2(objO);
            }
        }
    }

    public final void O(lN.Ml key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f2592n.nr(key);
    }

    public final ePk.I28 Uo(lN.Ml key, AtomicBoolean isCancelled) {
        ePk.I28 i28KN;
        ePk.I28 i28J2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
        if (!T5.n.nr()) {
            C1653C c1653cN = this.Uo.n(key);
            return (c1653cN == null || (i28J2 = J2(key, c1653cN)) == null) ? KN(key, isCancelled) : i28J2;
        }
        T5.n.n("BufferedDiskCache#get");
        try {
            C1653C c1653cN2 = this.Uo.n(key);
            if (c1653cN2 == null || (i28KN = J2(key, c1653cN2)) == null) {
                i28KN = KN(key, isCancelled);
            }
            T5.n.rl();
            return i28KN;
        } catch (Throwable th) {
            T5.n.rl();
            throw th;
        }
    }

    public final ePk.I28 az(final lN.Ml key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.Uo.O(key);
        try {
            final Object objNr = kd.j.nr("BufferedDiskCache_remove");
            return ePk.I28.rl(new Callable() { // from class: FSZ.CN3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Dsr.ty(objNr, this, key);
                }
            }, this.f2591O);
        } catch (Exception e2) {
            Dzy.j.aYN(xMQ, e2, "Failed to schedule disk-cache remove for %s", key.n());
            return ePk.I28.Uo(e2);
        }
    }

    public final void mUb(final lN.Ml key, C1653C encodedImage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!T5.n.nr()) {
            if (!C1653C.qm(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.Uo.nr(key, encodedImage);
            final C1653C c1653cRl = C1653C.rl(encodedImage);
            try {
                final Object objNr = kd.j.nr("BufferedDiskCache_putAsync");
                this.f2591O.execute(new Runnable() { // from class: FSZ.I28
                    @Override // java.lang.Runnable
                    public final void run() {
                        Dsr.gh(objNr, this, key, c1653cRl);
                    }
                });
                return;
            } catch (Exception e2) {
                Dzy.j.aYN(xMQ, e2, "Failed to schedule disk-cache write for %s", key.n());
                this.Uo.J2(key, encodedImage);
                C1653C.Uo(c1653cRl);
                return;
            }
        }
        T5.n.n("BufferedDiskCache#put");
        try {
            if (!C1653C.qm(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.Uo.nr(key, encodedImage);
            final C1653C c1653cRl2 = C1653C.rl(encodedImage);
            try {
                final Object objNr2 = kd.j.nr("BufferedDiskCache_putAsync");
                this.f2591O.execute(new Runnable() { // from class: FSZ.I28
                    @Override // java.lang.Runnable
                    public final void run() {
                        Dsr.gh(objNr2, this, key, c1653cRl2);
                    }
                });
            } catch (Exception e3) {
                Dzy.j.aYN(xMQ, e3, "Failed to schedule disk-cache write for %s", key.n());
                this.Uo.J2(key, encodedImage);
                C1653C.Uo(c1653cRl2);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            T5.n.rl();
        }
    }
}
