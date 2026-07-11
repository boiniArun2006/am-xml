package com.alightcreative.app.motion.easing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lcom/alightcreative/app/motion/easing/LinearEasing;", "Lcom/alightcreative/app/motion/easing/SplittableEasing;", "<init>", "()V", "interpolate", "", "t", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "Lcom/alightcreative/app/motion/easing/Easing;", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", V8ValueBuiltInSymbol.PROPERTY_SPLIT, "Lkotlin/Pair;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LinearEasing implements SplittableEasing {
    public static final int $stable = 0;
    public static final LinearEasing INSTANCE = new LinearEasing();

    @Override // com.alightcreative.app.motion.easing.Easing
    public float interpolate(float t3) {
        return t3;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public Easing copyWithUpdatedHandle(String id, Vector2D position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        if (Intrinsics.areEqual(id, "1")) {
            if (GeometryKt.getLength(GeometryKt.minus(position, new Vector2D(0.25f, 0.25f))) >= 1.0E-4d) {
                return new CubicBezierEasing(position.getX(), position.getY(), 0.75f, 0.75f);
            }
        } else if (Intrinsics.areEqual(id, "2") && GeometryKt.getLength(GeometryKt.minus(position, new Vector2D(0.75f, 0.75f))) >= 1.0E-4d) {
            return new CubicBezierEasing(0.25f, 0.25f, position.getX(), position.getY());
        }
        return this;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public List<EasingHandle> getHandles() {
        return CollectionsKt.listOf((Object[]) new EasingHandle[]{new EasingHandle("1", new Vector2D(0.25f, 0.25f), new Vector2D(0.0f, 0.0f), false, 0.0f, null, 56, null), new EasingHandle("2", new Vector2D(0.75f, 0.75f), new Vector2D(1.0f, 1.0f), false, 0.0f, null, 56, null)});
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public String serializeToString() {
        return "linear";
    }

    private LinearEasing() {
    }

    @Override // com.alightcreative.app.motion.easing.SplittableEasing
    public Pair<SplittableEasing, SplittableEasing> split(float t3) {
        return TuplesKt.to(this, this);
    }
}
