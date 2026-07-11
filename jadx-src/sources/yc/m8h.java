package yc;

import android.app.Activity;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class m8h {
    public static final KeyableTransform n(Activity activity, Scene scene, SceneElement camera) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(camera, "camera");
        return rl(scene, camera, HW.C.XQ(activity));
    }

    public static final KeyableTransform rl(Scene scene, SceneElement camera, int i2) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(camera, "camera");
        float fFractionalTime = SceneElementKt.fractionalTime(camera, i2);
        Transform transformValueAtTime = camera.getTransform().valueAtTime(fFractionalTime);
        Vector2D vector2DDiv = GeometryKt.div(CameraElementKt.calcCameraDimensions(scene, ((Number) KeyableKt.valueAtTime(camera.getCameraProperties().getFov(), fFractionalTime)).floatValue(), -transformValueAtTime.getLocation().getZ()), SceneKt.getSize(scene));
        float x2 = (vector2DDiv.getX() + vector2DDiv.getY()) / 2.0f;
        Vector3D location = transformValueAtTime.getLocation();
        return new KeyableTransform(KeyableKt.keyable(new Vector3D(location.getX(), location.getY(), 0.0f)), null, KeyableKt.keyable(new Vector2D(x2, x2)), KeyableKt.keyable(transformValueAtTime.getRotation()), 0.0f, 0.0f, null, null, false, 498, null);
    }

    public static /* synthetic */ KeyableTransform t(Scene scene, SceneElement sceneElement, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return rl(scene, sceneElement, i2);
    }
}
