package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathIterator;
import com.caoccao.javet.exceptions.JavetError;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u0000 O2\u00020\u0001:\u0002PQJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0012J/\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J?\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u001dJ!\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b)\u0010*J$\u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0005H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0005H&¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00101J\u001a\u00104\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020!H&¢\u0006\u0004\b6\u00107J!\u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u00020\u0002H\u0016¢\u0006\u0004\b<\u0010=J*\u0010C\u001a\u00020B2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@H&ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\"\u0010J\u001a\u00020E8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010Lø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006RÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "", "x", "y", "", "Ik", "(FF)V", "dx", "dy", "t", "S", "Z", "x1", "y1", "x2", "y2", "O", "(FFFF)V", "xMQ", "dx1", "dy1", "dx2", "dy2", "Uo", "az", "x3", "y3", "r", "(FFFFFF)V", "dx3", "dy3", "nr", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/graphics/Path$Direction;", "direction", "mUb", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Path$Direction;)V", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "WPU", "(Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;)V", JavetError.PARAMETER_PATH, "Landroidx/compose/ui/geometry/Offset;", "offset", "XQ", "(Landroidx/compose/ui/graphics/Path;J)V", MRAIDPresenter.CLOSE, "()V", "reset", "gh", "qie", "(J)V", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "conicEvaluation", "tolerance", "Landroidx/compose/ui/graphics/PathIterator;", "J2", "(Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)Landroidx/compose/ui/graphics/PathIterator;", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "", "o", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "Landroidx/compose/ui/graphics/PathFillType;", "HI", "()I", "KN", "(I)V", "fillType", "rl", "()Z", "isConvex", "isEmpty", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Companion", "Direction", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/compose/ui/graphics/Path\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
public interface Path {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31503n;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "<init>", "(Ljava/lang/String;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "t", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Direction {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ Direction[] f31504O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Direction f31505n = new Direction("CounterClockwise", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Direction f31506t = new Direction("Clockwise", 1);

        private static final /* synthetic */ Direction[] n() {
            return new Direction[]{f31505n, f31506t};
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f31504O.clone();
        }

        static {
            Direction[] directionArrN = n();
            f31504O = directionArrN;
            J2 = EnumEntriesKt.enumEntries(directionArrN);
        }

        private Direction(String str, int i2) {
        }
    }

    int HI();

    void Ik(float x2, float y2);

    void KN(int i2);

    void O(float x1, float y1, float x2, float y2);

    void S(float x2, float y2);

    void Uo(float dx1, float dy1, float dx2, float dy2);

    void WPU(RoundRect roundRect, Direction direction);

    void XQ(Path path, long offset);

    void Z(float dx, float dy);

    void close();

    Rect getBounds();

    boolean isEmpty();

    void mUb(Rect rect, Direction direction);

    void nr(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3);

    boolean o(Path path1, Path path2, int operation);

    void qie(long offset);

    void r(float x1, float y1, float x2, float y2, float x3, float y3);

    void reset();

    boolean rl();

    void t(float dx, float dy);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f31503n = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ void ck(Path path, Path path2, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i2 & 2) != 0) {
            j2 = Offset.INSTANCE.t();
        }
        path.XQ(path2, j2);
    }

    static /* synthetic */ void n(Path path, Rect rect, Direction direction, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i2 & 2) != 0) {
            direction = Direction.f31505n;
        }
        path.mUb(rect, direction);
    }

    static /* synthetic */ void ty(Path path, RoundRect roundRect, Direction direction, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i2 & 2) != 0) {
            direction = Direction.f31505n;
        }
        path.WPU(roundRect, direction);
    }

    default PathIterator J2(PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        return AndroidPathIterator_androidKt.n(this, conicEvaluation, tolerance);
    }

    default void az(float dx1, float dy1, float dx2, float dy2) {
        Uo(dx1, dy1, dx2, dy2);
    }

    default void gh() {
        reset();
    }

    default void xMQ(float x1, float y1, float x2, float y2) {
        O(x1, y1, x2, y2);
    }
}
