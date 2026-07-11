package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001%J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerManager;", "", "Landroidx/collection/ScatterSet;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layers", "", "nr", "(Landroidx/collection/ScatterSet;)V", "layer", "J2", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "t", "()V", "Uo", "Landroidx/compose/ui/graphics/CanvasHolder;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/collection/MutableScatterSet;", "rl", "Landroidx/collection/MutableScatterSet;", "layerSet", "Landroid/media/ImageReader;", "Landroid/media/ImageReader;", "imageReader", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/collection/MutableObjectList;", "O", "Landroidx/collection/MutableObjectList;", "postponedReleaseRequests", "", "Z", "persistenceIterationInProgress", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayerManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,167:1\n1516#2:168\n1#3:169\n41#4,3:170\n44#4,2:198\n231#5,3:173\n200#5,7:176\n211#5,3:184\n214#5,9:188\n234#5:197\n1399#6:183\n1270#6:187\n287#7,6:200\n*S KotlinDebug\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n*L\n82#1:168\n123#1:170,3\n123#1:198,2\n126#1:173,3\n126#1:176,7\n126#1:184,3\n126#1:188,9\n126#1:197\n126#1:183\n126#1:187\n132#1:200,6\n*E\n"})
public final class LayerManager {
    private static final boolean KN;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean persistenceIterationInProgress;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private MutableObjectList postponedReleaseRequests;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CanvasHolder canvasHolder;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableScatterSet layerSet;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private ImageReader imageReader;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerManager$Companion;", "", "<init>", "()V", "", "isRobolectric", "Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean n() {
            return LayerManager.KN;
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        KN = Intrinsics.areEqual(lowerCase, "robolectric");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(ImageReader imageReader) {
        Image imageAcquireLatestImage;
        if (imageReader == null || (imageAcquireLatestImage = imageReader.acquireLatestImage()) == null) {
            return;
        }
        imageAcquireLatestImage.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void nr(ScatterSet layers) {
        if (!layers.J2() || KN) {
            return;
        }
        ImageReader imageReaderNewInstance = this.imageReader;
        if (imageReaderNewInstance == null) {
            imageReaderNewInstance = ImageReader.newInstance(1, 1, 1, 3);
            imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.compose.ui.graphics.layer.r
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    LayerManager.O(imageReader);
                }
            }, this.handler);
            this.imageReader = imageReaderNewInstance;
        }
        Surface surface = imageReaderNewInstance.getSurface();
        Canvas canvasN = LockHardwareCanvasHelper.f31725n.n(surface);
        this.persistenceIterationInProgress = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().te(canvasN);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        canvasN.save();
        int i2 = 0;
        canvasN.clipRect(0, 0, 1, 1);
        Object[] objArr = layers.elements;
        long[] jArr = layers.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i7 = i2; i7 < i5; i7++) {
                        if ((j2 & 255) < 128) {
                            ((GraphicsLayer) objArr[(i3 << 3) + i7]).xMQ(androidCanvas);
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                    i2 = 0;
                }
            }
        }
        canvasN.restore();
        canvasHolder.getAndroidCanvas().te(internalCanvas);
        this.persistenceIterationInProgress = false;
        MutableObjectList mutableObjectList = this.postponedReleaseRequests;
        if (mutableObjectList != null && mutableObjectList.KN()) {
            Object[] objArr2 = mutableObjectList.content;
            int i8 = mutableObjectList._size;
            for (int i9 = 0; i9 < i8; i9++) {
                J2((GraphicsLayer) objArr2[i9]);
            }
            mutableObjectList.Z();
        }
        surface.unlockCanvasAndPost(canvasN);
    }

    public final void J2(GraphicsLayer layer) {
        if (!this.persistenceIterationInProgress) {
            if (this.layerSet.nY(layer)) {
                layer.Uo();
            }
        } else {
            MutableObjectList mutableObjectList = this.postponedReleaseRequests;
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList(0, 1, null);
                this.postponedReleaseRequests = mutableObjectList;
            }
            mutableObjectList.ty(layer);
        }
    }

    public final void t() {
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        this.imageReader = null;
    }

    public final void Uo() {
        t();
        nr(this.layerSet);
    }
}
