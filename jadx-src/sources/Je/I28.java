package Je;

import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableEdgeDecoration;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.StyledTextAlign;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 implements Ja.n {
    @Override // Ja.n
    public boolean n(SceneElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        KeyableEdgeDecoration stroke = element.getStroke();
        KeyableEdgeDecoration.Companion companion = KeyableEdgeDecoration.INSTANCE;
        if (!Intrinsics.areEqual(stroke, companion.getNO_STROKE()) || !element.getBorders().isEmpty() || !Intrinsics.areEqual(element.getDropShadow(), companion.getNO_SHADOW()) || element.getBlendingMode() != BlendingMode.NORMAL) {
            return true;
        }
        Keyable<Float> opacity = element.getTransform().getOpacity();
        KeyableFloat.Companion companion2 = KeyableFloat.INSTANCE;
        return (Intrinsics.areEqual(opacity, companion2.getONE()) && !element.getTransform().getScale().getKeyed() && !element.getTransform().getLocation().getKeyed() && !element.getTransform().getRotation().getKeyed() && !element.getTransform().getSkew().getKeyed() && !element.getTransform().getPivot().getKeyed() && Intrinsics.areEqual(element.getText().getFont(), "") && element.getText().getFontSize() == 18.0f && element.getText().getAlign() == StyledTextAlign.LEFT && Intrinsics.areEqual(element.getGain(), KeyableKt.keyable(1.0f)) && element.getVisualEffects().isEmpty() && element.getVisualEffectOrder().isEmpty() && Intrinsics.areEqual(element.getSpeedMap(), companion2.getONE())) ? false : true;
    }
}
