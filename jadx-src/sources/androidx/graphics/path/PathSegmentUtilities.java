package androidx.graphics.path;

import android.graphics.PointF;
import androidx.graphics.path.PathSegment;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/graphics/path/PathSegment;", c.f62177j, "Landroidx/graphics/path/PathSegment;", "rl", "()Landroidx/graphics/path/PathSegment;", "DoneSegment", "CloseSegment", "graphics-path_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "PathSegmentUtilities")
@SourceDebugExtension({"SMAP\nPathSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,138:1\n26#2:139\n26#2:140\n*S KotlinDebug\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n*L\n130#1:139\n137#1:140\n*E\n"})
public final class PathSegmentUtilities {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PathSegment f38793n = new PathSegment(PathSegment.Type.Done, new PointF[0], 0.0f);
    private static final PathSegment rl = new PathSegment(PathSegment.Type.Close, new PointF[0], 0.0f);

    public static final PathSegment n() {
        return rl;
    }

    public static final PathSegment rl() {
        return f38793n;
    }
}
