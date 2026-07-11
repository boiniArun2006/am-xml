package com.alightcreative.app.motion.scene.scripting.builtin;

import HI0.vd;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.scripting.ScriptEnv;
import com.alightcreative.app.motion.scene.scripting.builtin.GrowPartsKt;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"script_growParts", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "effectRef", "Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "scriptEnv", "Lcom/alightcreative/app/motion/scene/scripting/ScriptEnv;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GrowPartsKt {
    public static final SceneElement script_growParts(SceneElement el, KeyableVisualEffectRef effectRef, final ScriptEnv scriptEnv) {
        Keyable<Float> floatValue;
        Keyable<Float> floatValue2;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(effectRef, "effectRef");
        Intrinsics.checkNotNullParameter(scriptEnv, "scriptEnv");
        float time = scriptEnv.getTime();
        KeyableUserParameterValue keyableUserParameterValue = effectRef.getParameters().get("progress");
        float fFloatValue = 0.0f;
        final float fFloatValue2 = (keyableUserParameterValue == null || (floatValue2 = keyableUserParameterValue.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue2, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue2 = effectRef.getParameters().get("depth");
        if (keyableUserParameterValue2 != null && (floatValue = keyableUserParameterValue2.getFloatValue()) != null) {
            fFloatValue = ((Number) KeyableKt.valueAtTime(floatValue, time)).floatValue();
        }
        final int iRoundToInt = MathKt.roundToInt(fFloatValue);
        return SceneElementKt.mapChildrenWithDepth$default(el, 0, new Function2() { // from class: g.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GrowPartsKt.script_growParts$lambda$0(iRoundToInt, scriptEnv, fFloatValue2, ((Integer) obj).intValue(), (SceneElement) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement script_growParts$lambda$0(int i2, ScriptEnv scriptEnv, float f3, int i3, SceneElement child) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (i2 != i3) {
            return child;
        }
        double d2 = f3;
        float fRl = (float) vd.rl(d2 * 1000.0d, (d2 + 0.1d) * 1000.0d, child.getTransform().valueAtTime(scriptEnv.getTime()).getLocation().getY());
        return SceneElement.copy$default(child, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(child.getTransform(), fRl, fRl, 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }
}
