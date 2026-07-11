package aO;

import HI0.qf;
import Hr.Dsr;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.net.Uri;
import android.opengl.GLES20;
import android.util.LruCache;
import android.view.Surface;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.vungle.ads.internal.protos.Sdk;
import d.AbstractC1951j;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import z.C2470N;
import z.Ew;
import z.KH;
import z.Mf;
import z.OU;
import z.ci;
import z.hQ;
import z.mz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class z {
    private static int J2;
    private static final Map KN;
    private static final Bitmap Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ExecutorService f12876n = Executors.newSingleThreadExecutor();
    private static final boolean rl = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f12877t = true;
    private static final j nr = new j();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Map f12875O = new LinkedHashMap();

    public static final class j extends LruCache {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int sizeOf(Pair pair, w6 w6Var) {
            Bitmap bitmapN;
            if (!Intrinsics.areEqual(pair != null ? (Integer) pair.getSecond() : null, w6Var != null ? Integer.valueOf(w6Var.t()) : null) || w6Var == null || (bitmapN = w6Var.n()) == null) {
                return 1;
            }
            return bitmapN.getAllocationByteCount();
        }

        j() {
            super(33554432);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(Object obj, Ref.BooleanRef booleanRef, SurfaceTexture surfaceTexture) {
        synchronized (obj) {
            booleanRef.element = true;
            obj.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void o() {
        boolean zRl;
        boolean z2 = true;
        while (z2) {
            I28 i28 = I28.f12846n;
            synchronized (i28) {
                i28.t(false);
                zRl = i28.rl();
            }
            z2 = zRl;
        }
    }

    private static final boolean HI(MediaCodec mediaCodec, SurfaceTexture surfaceTexture, Dsr.j jVar) {
        boolean z2;
        final Object obj = new Object();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: aO.eO
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                z.ck(obj, booleanRef, surfaceTexture2);
            }
        });
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        boolean z3 = false;
        boolean Z2 = false;
        while (!z3) {
            if (!Z2) {
                Z2 = Z(mediaCodec, jVar);
            }
            if (XQ(mediaCodec, bufferInfo)) {
                if ((bufferInfo.flags & 4) != 0) {
                    z3 = true;
                }
                synchronized (obj) {
                    try {
                        long jNanoTime = System.nanoTime();
                        while (!booleanRef.element && System.nanoTime() - jNanoTime < 1500000000) {
                            obj.wait(100L);
                        }
                        z2 = booleanRef.element;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final Bitmap S(KH kh, SurfaceTexture surfaceTexture, int i2, int i3, int i5) {
        ci ciVarXQ = kh.XQ(surfaceTexture, i3, i5, i2);
        int i7 = i3 * i5;
        try {
            IntBuffer intBufferAllocate = IntBuffer.allocate(i7);
            int[] iArr = new int[i7];
            int[] iArrArray = intBufferAllocate.hasArray() ? null : new int[i7];
            ciVarXQ.eF();
            GLES20.glViewport(0, 0, i3, i5);
            hQ.render$default(Mf.nr(kh), C2470N.KN.n(), ciVarXQ, 0.0f, 4, null);
            intBufferAllocate.rewind();
            GLES20.glReadPixels(0, 0, kh.Ik(), kh.HI(), 6408, 5121, intBufferAllocate);
            if (iArrArray == null) {
                iArrArray = intBufferAllocate.array();
            } else {
                intBufferAllocate.rewind();
                intBufferAllocate.get(iArrArray);
            }
            for (int i8 = 0; i8 < i5; i8++) {
                for (int i9 = 0; i9 < i3; i9++) {
                    int i10 = (i8 * i3) + i9;
                    iArr[i10] = qf.n(iArrArray[i10]);
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i3, i5, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Cp.n.n(ciVarXQ, null);
            return bitmapCreateBitmap;
        } finally {
        }
    }

    public static final void WPU() {
        I28 i28 = I28.f12846n;
        synchronized (i28) {
            i28.t(true);
            Unit unit = Unit.INSTANCE;
        }
    }

    private static final boolean XQ(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (iDequeueOutputBuffer < 0) {
            return false;
        }
        mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, true);
        return true;
    }

    private static final boolean Z(MediaCodec mediaCodec, Dsr.j jVar) {
        ByteBuffer inputBuffer;
        int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer < 0 || (inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer)) == null) {
            return false;
        }
        Hr.o oVar = jVar.read(inputBuffer);
        if (oVar instanceof Hr.C) {
            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, inputBuffer.limit(), ((Hr.C) oVar).n(), 0);
            return false;
        }
        if (!(oVar instanceof Hr.fuX)) {
            throw new NoWhenBranchMatchedException();
        }
        mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean az(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(Pair pair, w6 w6Var) {
        nr.put(pair, w6Var);
        synchronized (s4.f12872n) {
            try {
                Map map = f12875O;
                Object first = pair.getFirst();
                Object obj = map.get(first);
                if (obj == null) {
                    List[] listArr = new List[1800];
                    for (int i2 = 0; i2 < 1800; i2++) {
                        listArr[i2] = new ArrayList();
                    }
                    map.put(first, listArr);
                    obj = listArr;
                }
                List[] listArr2 = (List[]) obj;
                listArr2[(((Number) pair.getSecond()).intValue() / Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE) % listArr2.length].add(new WeakReference(w6Var));
                int i3 = J2 + 1;
                J2 = i3;
                if (i3 > 200) {
                    ArrayList arrayList = null;
                    for (Map.Entry entry : f12875O.entrySet()) {
                        Uri uri = (Uri) entry.getKey();
                        List[] listArr3 = (List[]) entry.getValue();
                        for (List list : listArr3) {
                            CollectionsKt.removeAll(list, new Function1() { // from class: aO.Xo
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return Boolean.valueOf(z.az((WeakReference) obj2));
                                }
                            });
                        }
                        int length = listArr3.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(uri);
                            } else if (!listArr3[i5].isEmpty()) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            f12875O.remove((Uri) it.next());
                        }
                    }
                    J2 = 0;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void r() {
        I28 i28 = I28.f12846n;
        synchronized (i28) {
            i28.t(false);
            Unit unit = Unit.INSTANCE;
        }
    }

    private static final boolean ty(Ml ml) throws IOException {
        Object objM313constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strT = ml.nr().t();
            Intrinsics.checkNotNull(strT);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(strT);
            Intrinsics.checkNotNullExpressionValue(mediaCodecCreateByCodecName, "createByCodecName(...)");
            try {
                qcD.CN3 cn3 = qcD.CN3.f72470n;
                cn3.Uo(mediaCodecCreateByCodecName, "thumbs");
                mediaCodecCreateByCodecName.configure(ml.nr().J2(), ml.rl(), (MediaCrypto) null, 0);
                mediaCodecCreateByCodecName.start();
                boolean zHI = HI(mediaCodecCreateByCodecName, ml.t(), ml.n());
                mediaCodecCreateByCodecName.release();
                cn3.gh(mediaCodecCreateByCodecName);
                objM313constructorimpl = Result.m313constructorimpl(Boolean.valueOf(zHI));
            } catch (Throwable th) {
                mediaCodecCreateByCodecName.release();
                qcD.CN3.f72470n.gh(mediaCodecCreateByCodecName);
                throw th;
            }
        } catch (MediaCodec.CodecException e2) {
            XoT.C.gh("Thumbnail extraction", new QJ(e2));
            FirebaseCrashlytics.getInstance().recordException(e2);
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(e2));
        } catch (IllegalArgumentException e3) {
            XoT.C.gh("Thumbnail extraction", new l3D(e3));
            FirebaseCrashlytics.getInstance().recordException(e3);
            Result.Companion companion3 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(e3));
        } catch (IllegalStateException e4) {
            XoT.C.gh("Thumbnail extraction", new C1509c(e4));
            FirebaseCrashlytics.getInstance().recordException(e4);
            Result.Companion companion4 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(e4));
        }
        if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null) {
            objM313constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM313constructorimpl).booleanValue();
    }

    static {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Uo = bitmapCreateBitmap;
        KN = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap Ik(Dsr.j jVar, Dsr.n.Ml ml, int i2, int i3, Context context) {
        Bitmap bitmapS;
        Pair pairUo = AbstractC1951j.Uo(ml.Uo(), ml.nr(), i2, i3);
        int iIntValue = ((Number) pairUo.component1()).intValue();
        int iIntValue2 = ((Number) pairUo.component2()).intValue();
        mz mzVarRl = IB.w6.rl(context, "videoThumbs", false, null, 12, null);
        try {
            mzVarRl.N();
            mzVarRl.ViF(new OU(iIntValue, iIntValue2));
            int iO = Ew.O("extractThumbnailSyncInternal");
            SurfaceTexture surfaceTexture = new SurfaceTexture(iO);
            try {
                Surface surface = new Surface(surfaceTexture);
                try {
                    if (ty(new Ml(jVar, ml, surface, surfaceTexture))) {
                        bitmapS = S(mzVarRl.rl(), surfaceTexture, iO, iIntValue, iIntValue2);
                    } else {
                        bitmapS = null;
                    }
                    surfaceTexture.release();
                    Cp.n.n(mzVarRl, null);
                    return bitmapS;
                } finally {
                    surface.release();
                }
            } catch (Throwable th) {
                surfaceTexture.release();
                throw th;
            }
        } finally {
        }
    }
}
