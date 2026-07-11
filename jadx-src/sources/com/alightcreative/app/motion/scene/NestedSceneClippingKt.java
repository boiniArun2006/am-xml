package com.alightcreative.app.motion.scene;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"nestedSceneApplyingClipping", "Lcom/alightcreative/app/motion/scene/Scene;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "getNestedSceneApplyingClipping", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Lcom/alightcreative/app/motion/scene/Scene;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNestedSceneClipping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedSceneClipping.kt\ncom/alightcreative/app/motion/scene/NestedSceneClippingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1611#2,9:25\n1863#2:34\n1864#2:36\n1620#2:37\n1#3:35\n*S KotlinDebug\n*F\n+ 1 NestedSceneClipping.kt\ncom/alightcreative/app/motion/scene/NestedSceneClippingKt\n*L\n14#1:25,9\n14#1:34\n14#1:36\n14#1:37\n14#1:35\n*E\n"})
public final class NestedSceneClippingKt {
    public static final Scene getNestedSceneApplyingClipping(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        int iRoundToInt = MathKt.roundToInt((sceneElement.getEndTime() - sceneElement.getStartTime()) * sceneElement.getNestedSceneSpeedFactor());
        int duration = SceneKt.getDuration(sceneElement.getNestedScene());
        boolean z2 = Math.abs(iRoundToInt - duration) < 8;
        if (sceneElement.getNestedScene().getReTimingMethod() != ReTimingMethod.OFF || (sceneElement.getInTime() == 0 && z2)) {
            return sceneElement.getNestedScene();
        }
        Scene nestedScene = sceneElement.getNestedScene();
        List<SceneElement> elements = sceneElement.getNestedScene().getElements();
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement2 : elements) {
            SceneElement sceneElementTrimStart = TrimmingKt.trimStart(SceneElement.copy$default(sceneElement2, null, sceneElement2.getStartTime() - sceneElement.getInTime(), sceneElement2.getEndTime() - sceneElement.getInTime(), 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null), 0, false);
            SceneElement sceneElementTrimEnd = sceneElementTrimStart != null ? TrimmingKt.trimEnd(sceneElementTrimStart, iRoundToInt, Math.abs(sceneElement2.getEndTime() - duration) < 8) : null;
            if (sceneElementTrimEnd != null) {
                arrayList.add(sceneElementTrimEnd);
            }
        }
        return Scene.copy$default(nestedScene, null, 0, 0, 0, 0, 0, arrayList, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null);
    }
}
