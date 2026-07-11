package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV22;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroid/graphics/Bitmap;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayerSnapshot.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,220:1\n54#2:221\n59#2:223\n85#3:222\n90#3:224\n314#4,11:225\n*S KotlinDebug\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n*L\n83#1:221\n84#1:223\n83#1:222\n84#1:224\n89#1:225,11\n*E\n"})
public final class LayerSnapshotV22 implements LayerSnapshotImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LayerSnapshotV22 f31714n = new LayerSnapshotV22();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(GraphicsLayer graphicsLayer, Continuation continuation) {
        LayerSnapshotV22$toBitmap$1 layerSnapshotV22$toBitmap$1;
        AutoCloseable autoCloseable;
        if (continuation instanceof LayerSnapshotV22$toBitmap$1) {
            layerSnapshotV22$toBitmap$1 = (LayerSnapshotV22$toBitmap$1) continuation;
            int i2 = layerSnapshotV22$toBitmap$1.f31716S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layerSnapshotV22$toBitmap$1.f31716S = i2 - Integer.MIN_VALUE;
            } else {
                layerSnapshotV22$toBitmap$1 = new LayerSnapshotV22$toBitmap$1(this, continuation);
            }
        }
        Object objWPU = layerSnapshotV22$toBitmap$1.f31719o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = layerSnapshotV22$toBitmap$1.f31716S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWPU);
            long size = graphicsLayer.getSize();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (size >> 32), (int) (size & 4294967295L), 1, 1);
            try {
                layerSnapshotV22$toBitmap$1.f31718n = graphicsLayer;
                layerSnapshotV22$toBitmap$1.f31721t = looperMyLooper;
                layerSnapshotV22$toBitmap$1.f31715O = imageReaderNewInstance;
                layerSnapshotV22$toBitmap$1.J2 = imageReaderNewInstance;
                layerSnapshotV22$toBitmap$1.f31720r = layerSnapshotV22$toBitmap$1;
                layerSnapshotV22$toBitmap$1.f31716S = 1;
                final GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(layerSnapshotV22$toBitmap$1), 1);
                eOVar.e();
                imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader) {
                        GJW.Pl pl = eOVar;
                        Result.Companion companion = Result.INSTANCE;
                        pl.resumeWith(Result.m313constructorimpl(imageReader.acquireLatestImage()));
                    }
                }, HandlerCompat.n(looperMyLooper));
                Surface surface = imageReaderNewInstance.getSurface();
                Canvas canvasRl = SurfaceUtils.f31732n.rl(surface);
                try {
                    canvasRl.drawColor(ColorKt.mUb(Color.INSTANCE.n()), PorterDuff.Mode.CLEAR);
                    graphicsLayer.KN(AndroidCanvas_androidKt.rl(canvasRl), null);
                    surface.unlockCanvasAndPost(canvasRl);
                    objWPU = eOVar.WPU();
                    if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(layerSnapshotV22$toBitmap$1);
                    }
                    if (objWPU == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    autoCloseable = imageReaderNewInstance;
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasRl);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                autoCloseable = imageReaderNewInstance;
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            autoCloseable = (AutoCloseable) layerSnapshotV22$toBitmap$1.f31715O;
            try {
                ResultKt.throwOnFailure(objWPU);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    AutoCloseableKt.closeFinally(autoCloseable, th);
                    throw th4;
                }
            }
        }
        Bitmap bitmapRl = LayerSnapshot_androidKt.rl((Image) objWPU);
        AutoCloseableKt.closeFinally(autoCloseable, null);
        return bitmapRl;
    }

    private LayerSnapshotV22() {
    }
}
