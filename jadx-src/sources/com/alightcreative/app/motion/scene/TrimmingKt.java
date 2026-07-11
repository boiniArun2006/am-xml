package com.alightcreative.app.motion.scene;

import d2n.Ml;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\t\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003¨\u0006\n"}, d2 = {"trimStart", "Lcom/alightcreative/app/motion/scene/SceneElement;", "newStartTime", "", "allowExtend", "", "recomputeInTime", "trimEnd", "newEndTime", "recomputeOutTime", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TrimmingKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float trimEnd$lambda$1(float f3, float f4) {
        return f4 * f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float trimStart$lambda$0(float f3, float f4, float f5) {
        return (f5 * f3) + f4;
    }

    public static final int recomputeInTime(SceneElement sceneElement, int i2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Ml.j jVar = d2n.Ml.f63370t;
        return (int) d2n.Ml.mUb(bK.n.t(jVar.rl(((long) i2) - ((long) sceneElement.getStartTime())), jVar.rl(sceneElement.getInTime()), sceneElement.getTimeMapping().getSpeedFunction()));
    }

    public static final int recomputeOutTime(SceneElement sceneElement, int i2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Ml.j jVar = d2n.Ml.f63370t;
        return (int) d2n.Ml.mUb(bK.n.t(jVar.rl(((long) i2) - ((long) sceneElement.getStartTime())), jVar.rl(sceneElement.getInTime()), sceneElement.getTimeMapping().getSpeedFunction()));
    }

    public static final SceneElement trimEnd(SceneElement sceneElement, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        if (i2 > sceneElement.getEndTime() && !z2) {
            return sceneElement;
        }
        int endTime = sceneElement.getEndTime() - sceneElement.getStartTime();
        int startTime = i2 - sceneElement.getStartTime();
        if (startTime < 1) {
            return null;
        }
        final float f3 = endTime / startTime;
        return SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElement, new Function1() { // from class: com.alightcreative.app.motion.scene.VoU
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(TrimmingKt.trimEnd$lambda$1(f3, ((Float) obj).floatValue()));
            }
        }), null, 0, i2, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, recomputeOutTime(sceneElement, i2), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -262149, 127, null);
    }

    public static /* synthetic */ SceneElement trimEnd$default(SceneElement sceneElement, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        return trimEnd(sceneElement, i2, z2);
    }

    public static final SceneElement trimStart(SceneElement sceneElement, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        if (i2 < sceneElement.getStartTime() && !z2) {
            return sceneElement;
        }
        int endTime = sceneElement.getEndTime() - sceneElement.getStartTime();
        int endTime2 = sceneElement.getEndTime() - i2;
        float f3 = endTime2;
        final float startTime = (sceneElement.getStartTime() - i2) / f3;
        int iRecomputeInTime = recomputeInTime(sceneElement, i2);
        if (endTime2 < 1) {
            return null;
        }
        final float f4 = endTime / f3;
        return SceneElement.copy$default(SceneElementKt.copyAdjustingKeyframeTiming(sceneElement, new Function1() { // from class: com.alightcreative.app.motion.scene.HcS
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(TrimmingKt.trimStart$lambda$0(f4, startTime, ((Float) obj).floatValue()));
            }
        }), null, i2, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, iRecomputeInTime, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -131075, 127, null);
    }

    public static /* synthetic */ SceneElement trimStart$default(SceneElement sceneElement, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        return trimStart(sceneElement, i2, z2);
    }
}
