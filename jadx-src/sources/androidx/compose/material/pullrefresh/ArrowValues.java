package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.Immutable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/pullrefresh/ArrowValues;", "", "", "rotation", "startAngle", "endAngle", "scale", "<init>", "(FFFF)V", c.f62177j, "F", "rl", "()F", "nr", "t", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ArrowValues {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float rotation;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float scale;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float startAngle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float endAngle;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getEndAngle() {
        return this.endAngle;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final float getStartAngle() {
        return this.startAngle;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    public ArrowValues(float f3, float f4, float f5, float f6) {
        this.rotation = f3;
        this.startAngle = f4;
        this.endAngle = f5;
        this.scale = f6;
    }
}
