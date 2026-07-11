package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005J\"\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010*\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\u00020\u00108VX\u0096\u0004¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010)ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006/À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "", "Landroidx/compose/ui/geometry/Offset;", "relativeToScreen", "r", "(J)J", "relativeToLocal", "aYN", "relativeToWindow", "jB", "B", "xg", "sourceCoordinates", "relativeToSource", "nHg", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "", "includeMotionFrameOfReference", "e", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "I", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "U", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "([F)V", "Landroidx/compose/ui/unit/IntSize;", c.f62177j, "()J", "size", "piY", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "v", "parentCoordinates", "nr", "()Z", "isAttached", "fD", "getIntroducesMotionFrameOfReference$annotations", "()V", "introducesMotionFrameOfReference", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LayoutCoordinates {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    long B(long relativeToLocal);

    Rect I(LayoutCoordinates sourceCoordinates, boolean clipBounds);

    default boolean fD() {
        return false;
    }

    long jB(long relativeToWindow);

    long n();

    long nHg(LayoutCoordinates sourceCoordinates, long relativeToSource);

    boolean nr();

    LayoutCoordinates piY();

    LayoutCoordinates v();

    long xg(long relativeToLocal);

    static /* synthetic */ Rect N(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return layoutCoordinates.I(layoutCoordinates2, z2);
    }

    default void U(LayoutCoordinates sourceCoordinates, float[] matrix) {
        InlineClassHelperKt.J2("transformFrom is not implemented on this LayoutCoordinates");
    }

    default void a(float[] matrix) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    default long aYN(long relativeToLocal) {
        return Offset.INSTANCE.rl();
    }

    default long e(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    default long r(long relativeToScreen) {
        return Offset.INSTANCE.rl();
    }
}
