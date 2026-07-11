package com.alightcreative.app.motion.easing;

import com.alightcreative.app.motion.scene.Vector2D;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH&\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/easing/Easing;", "", "interpolate", "", "t", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "Lcom/alightcreative/app/motion/easing/BounceEasing;", "Lcom/alightcreative/app/motion/easing/CyclicEasing;", "Lcom/alightcreative/app/motion/easing/ElasticEasing;", "Lcom/alightcreative/app/motion/easing/ElasticStepEasing;", "Lcom/alightcreative/app/motion/easing/RandomEasing;", "Lcom/alightcreative/app/motion/easing/ReversedEasing;", "Lcom/alightcreative/app/motion/easing/SplittableEasing;", "Lcom/alightcreative/app/motion/easing/StepEasing;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Easing {
    Easing copyWithUpdatedHandle(String id, Vector2D position);

    List<EasingHandle> getHandles();

    float interpolate(float t3);

    String serializeToString();
}
