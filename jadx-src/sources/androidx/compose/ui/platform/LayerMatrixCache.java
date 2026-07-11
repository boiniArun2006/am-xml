package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J \u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001cRD\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u001c\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001c\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0016\u0010(\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "target", "Landroid/graphics/Matrix;", "matrix", "", "getMatrix", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "KN", "()V", "t", "Landroidx/compose/ui/graphics/Matrix;", "rl", "(Ljava/lang/Object;)[F", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/geometry/MutableRect;", "rect", "nr", "(Ljava/lang/Object;Landroidx/compose/ui/geometry/MutableRect;)V", "J2", "Landroidx/compose/ui/geometry/Offset;", "offset", "O", "(Ljava/lang/Object;J)J", "Uo", "Lkotlin/jvm/functions/Function2;", "Landroid/graphics/Matrix;", "androidMatrixCache", "[F", "matrixCache", "inverseMatrixCache", "", "Z", "isDirty", "isInverseDirty", "isInverseValid", "isIdentity", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayerMatrixCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerMatrixCache.android.kt\nandroidx/compose/ui/platform/LayerMatrixCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class LayerMatrixCache<T> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean isInverseDirty;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function2 getMatrix;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Matrix androidMatrixCache;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float[] matrixCache = androidx.compose.ui.graphics.Matrix.t(null, 1, null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private float[] inverseMatrixCache = androidx.compose.ui.graphics.Matrix.t(null, 1, null);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean isInverseValid = true;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean isIdentity = true;

    public final void KN() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.ui.graphics.Matrix.KN(this.matrixCache);
        androidx.compose.ui.graphics.Matrix.KN(this.inverseMatrixCache);
    }

    public final void t() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final float[] n(Object target) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.n(rl(target), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    public final float[] rl(Object target) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(target, matrix);
        AndroidMatrixConversions_androidKt.rl(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.n(fArr);
        return fArr;
    }

    public LayerMatrixCache(Function2 function2) {
        this.getMatrix = function2;
    }

    public final void J2(Object target, MutableRect rect) {
        float[] fArrN = n(target);
        if (fArrN == null) {
            rect.Uo(0.0f, 0.0f, 0.0f, 0.0f);
        } else if (!this.isIdentity) {
            androidx.compose.ui.graphics.Matrix.Uo(fArrN, rect);
        }
    }

    public final long O(Object target, long offset) {
        float[] fArrRl = rl(target);
        if (!this.isIdentity) {
            return androidx.compose.ui.graphics.Matrix.J2(fArrRl, offset);
        }
        return offset;
    }

    public final long Uo(Object target, long offset) {
        float[] fArrN = n(target);
        if (fArrN == null) {
            return Offset.INSTANCE.n();
        }
        if (!this.isIdentity) {
            return androidx.compose.ui.graphics.Matrix.J2(fArrN, offset);
        }
        return offset;
    }

    public final void nr(Object target, MutableRect rect) {
        float[] fArrRl = rl(target);
        if (!this.isIdentity) {
            androidx.compose.ui.graphics.Matrix.Uo(fArrRl, rect);
        }
    }
}
