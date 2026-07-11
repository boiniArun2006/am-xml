package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/CheckDrawingCache;", "", "Landroidx/compose/ui/graphics/Path;", "checkPath", "Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure", "pathToDraw", "<init>", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathMeasure;Landroidx/compose/ui/graphics/Path;)V", c.f62177j, "Landroidx/compose/ui/graphics/Path;", "()Landroidx/compose/ui/graphics/Path;", "rl", "Landroidx/compose/ui/graphics/PathMeasure;", "()Landroidx/compose/ui/graphics/PathMeasure;", "t", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CheckDrawingCache {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Path checkPath;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final PathMeasure pathMeasure;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Path pathToDraw;

    public CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2) {
        this.checkPath = path;
        this.pathMeasure = pathMeasure;
        this.pathToDraw = path2;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Path getCheckPath() {
        return this.checkPath;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AndroidPath_androidKt.n() : path, (i2 & 2) != 0 ? AndroidPathMeasure_androidKt.n() : pathMeasure, (i2 & 4) != 0 ? AndroidPath_androidKt.n() : path2);
    }
}
