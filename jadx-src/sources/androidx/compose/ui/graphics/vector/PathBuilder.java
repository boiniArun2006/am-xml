package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0010J=\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\"\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u001bJ-\u0010#\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b%\u0010$R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020'0+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "<init>", "()V", c.f62177j, "()Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "x", "y", "xMQ", "(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "Uo", "dx", "dy", "KN", "O", "(F)Landroidx/compose/ui/graphics/vector/PathBuilder;", "J2", "qie", "az", "x1", "y1", "x2", "y2", "x3", "y3", "rl", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "t", "mUb", "(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "gh", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "_nodes", "", "nr", "()Ljava/util/List;", "nodes", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PathBuilder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ArrayList _nodes = new ArrayList(32);

    public final PathBuilder J2(float dx) {
        this._nodes.add(new PathNode.RelativeHorizontalTo(dx));
        return this;
    }

    public final PathBuilder KN(float dx, float dy) {
        this._nodes.add(new PathNode.RelativeLineTo(dx, dy));
        return this;
    }

    public final PathBuilder O(float x2) {
        this._nodes.add(new PathNode.HorizontalTo(x2));
        return this;
    }

    public final PathBuilder Uo(float x2, float y2) {
        this._nodes.add(new PathNode.LineTo(x2, y2));
        return this;
    }

    public final PathBuilder az(float dy) {
        this._nodes.add(new PathNode.RelativeVerticalTo(dy));
        return this;
    }

    public final PathBuilder gh(float dx1, float dy1, float dx2, float dy2) {
        this._nodes.add(new PathNode.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2));
        return this;
    }

    public final PathBuilder mUb(float x1, float y1, float x2, float y2) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(x1, y1, x2, y2));
        return this;
    }

    public final PathBuilder n() {
        this._nodes.add(PathNode.Close.f31794t);
        return this;
    }

    public final List nr() {
        return this._nodes;
    }

    public final PathBuilder qie(float y2) {
        this._nodes.add(new PathNode.VerticalTo(y2));
        return this;
    }

    public final PathBuilder rl(float x1, float y1, float x2, float y2, float x3, float y3) {
        this._nodes.add(new PathNode.CurveTo(x1, y1, x2, y2, x3, y3));
        return this;
    }

    public final PathBuilder t(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this._nodes.add(new PathNode.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3));
        return this;
    }

    public final PathBuilder xMQ(float x2, float y2) {
        this._nodes.add(new PathNode.MoveTo(x2, y2));
        return this;
    }
}
