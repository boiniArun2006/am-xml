package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", c.f62177j, "(Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TransitionComposeAnimation_androidKt {
    public static final TransitionComposeAnimation n(Transition transition) {
        Set of;
        Object objXMQ = transition.xMQ();
        if (objXMQ != null) {
            Object[] enumConstants = objXMQ.getClass().getEnumConstants();
            if (enumConstants == null || (of = ArraysKt.toSet(enumConstants)) == null) {
                of = SetsKt.setOf(objXMQ);
            }
            String label = transition.getLabel();
            if (label == null) {
                label = Reflection.getOrCreateKotlinClass(objXMQ.getClass()).getSimpleName();
            }
            return new TransitionComposeAnimation(transition, of, label);
        }
        return null;
    }
}
