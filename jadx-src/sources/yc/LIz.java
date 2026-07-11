package yc;

import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class LIz {
    public static final Vector2D n(Vector2D vector2D, Scene scene, SceneElement el, int i2, nKE userPreviewMode, boolean z2) {
        Transform identity;
        float x2;
        Intrinsics.checkNotNullParameter(vector2D, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(userPreviewMode, "userPreviewMode");
        boolean zNr = userPreviewMode.nr();
        SceneElement activeCameraAtTime = zNr ? CameraElementKt.getActiveCameraAtTime(scene, i2) : null;
        long id = activeCameraAtTime != null ? activeCameraAtTime.getId() : 0L;
        float fFractionalTime = SceneElementKt.fractionalTime(el, i2);
        float z3 = (el.getId() == id && zNr) ? 0.0f : ((Vector3D) KeyableKt.valueAtTime(el.getTransform().getLocation(), fFractionalTime)).getZ();
        if (activeCameraAtTime == null || (identity = CameraElementKt.getCameraTransform(activeCameraAtTime, scene, i2, z3)) == null) {
            identity = Transform.INSTANCE.getIDENTITY();
        }
        Transform parentTransform = el.getParent() != null ? LayerParentingKt.getParentTransform(el, scene, fFractionalTime) : Transform.INSTANCE.getIDENTITY();
        float fFloatValue = z2 ? ((Number) KeyableKt.valueAtTime(el.getTransform().getRotation(), fFractionalTime)).floatValue() : 0.0f;
        if (z2) {
            Vector2D vector2D2 = (Vector2D) KeyableKt.valueAtTime(el.getTransform().getScale(), fFractionalTime);
            x2 = (vector2D2.getX() + vector2D2.getY()) / 2.0f;
        } else {
            x2 = 1.0f;
        }
        return GeometryKt.times(GeometryKt.times(GeometryKt.rot(vector2D, (identity.getRotation() - parentTransform.getRotation()) - fFloatValue), identity.getScale()), x2);
    }
}
