package com.alightcreative.app.motion.scene.scripting.builtin;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.alightcreative.app.motion.scene.scripting.ScriptEnv;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"script_moveAlongPath", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "effectRef", "Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "scriptEnv", "Lcom/alightcreative/app/motion/scene/scripting/ScriptEnv;", "script_moveAlongPath2", "script_moveAlongPath3", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMoveAlongPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoveAlongPath.kt\ncom/alightcreative/app/motion/scene/scripting/builtin/MoveAlongPathKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n360#2,7:139\n360#2,7:146\n360#2,7:153\n360#2,7:160\n*S KotlinDebug\n*F\n+ 1 MoveAlongPath.kt\ncom/alightcreative/app/motion/scene/scripting/builtin/MoveAlongPathKt\n*L\n36#1:139,7\n71#1:146,7\n107#1:153,7\n109#1:160,7\n*E\n"})
public final class MoveAlongPathKt {
    public static final SceneElement script_moveAlongPath(SceneElement el, KeyableVisualEffectRef effectRef, ScriptEnv scriptEnv) {
        Vector2D zero;
        Keyable<Vector2D> vec2DValue;
        Keyable<Float> floatValue;
        Keyable<Float> floatValue2;
        Keyable<Float> floatValue3;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(effectRef, "effectRef");
        Intrinsics.checkNotNullParameter(scriptEnv, "scriptEnv");
        float time = scriptEnv.getTime();
        KeyableUserParameterValue keyableUserParameterValue = effectRef.getParameters().get("progress");
        float fFloatValue = (keyableUserParameterValue == null || (floatValue3 = keyableUserParameterValue.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue3, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue2 = effectRef.getParameters().get("angle");
        float fFloatValue2 = (keyableUserParameterValue2 == null || (floatValue2 = keyableUserParameterValue2.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue2, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue3 = effectRef.getParameters().get("tangent");
        boolean booleanValue = keyableUserParameterValue3 != null ? keyableUserParameterValue3.getBooleanValue() : false;
        KeyableUserParameterValue keyableUserParameterValue4 = effectRef.getParameters().get("inset");
        float fFloatValue3 = (keyableUserParameterValue4 == null || (floatValue = keyableUserParameterValue4.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue5 = effectRef.getParameters().get("offset");
        if (keyableUserParameterValue5 == null || (vec2DValue = keyableUserParameterValue5.getVec2DValue()) == null || (zero = (Vector2D) KeyableKt.valueAtTime(vec2DValue, time)) == null) {
            zero = Vector2D.INSTANCE.getZERO();
        }
        Transform transformValueAtTime = el.getTransform().valueAtTime(time);
        Iterator<SceneElement> it = scriptEnv.getScene().getElements().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getId() == el.getId()) {
                break;
            }
            i2++;
        }
        if (i2 < 1) {
            return el;
        }
        SceneElement sceneElement = scriptEnv.getScene().getElements().get(i2 - 1);
        Path pathT = CubicBSplineKt.toPath(LiveShapeScriptKt.getShapeOutline(sceneElement, time)).t();
        TransformKt.transform(pathT, sceneElement.getTransform().valueAtTime(time));
        PathMeasure pathMeasure = new PathMeasure(pathT, false);
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength() * fFloatValue, fArr, fArr2);
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, TransformKt.rotatedBy(TransformKt.translatedBy(el.getTransform(), GeometryKt.plus(GeometryKt.plus(GeometryKt.minus(new Vector3D(fArr[0], fArr[1], 0.0f, 4, null), transformValueAtTime.getLocation()), GeometryKt.times(GeometryKt.perpCCw(GeometryKt.normalize(new Vector2D(fArr2[0], fArr2[1]))), fFloatValue3)), zero)), (booleanValue ? (-((float) Math.atan2(fArr2[0], fArr2[1]))) * 57.2958f : 0.0f) + fFloatValue2), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    public static final SceneElement script_moveAlongPath2(SceneElement el, KeyableVisualEffectRef effectRef, ScriptEnv scriptEnv) {
        Vector2D zero;
        Keyable<Vector2D> vec2DValue;
        Keyable<Float> floatValue;
        Keyable<Float> floatValue2;
        Keyable<Float> floatValue3;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(effectRef, "effectRef");
        Intrinsics.checkNotNullParameter(scriptEnv, "scriptEnv");
        float time = scriptEnv.getTime();
        KeyableUserParameterValue keyableUserParameterValue = effectRef.getParameters().get("progress");
        float fFloatValue = (keyableUserParameterValue == null || (floatValue3 = keyableUserParameterValue.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue3, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue2 = effectRef.getParameters().get("angle");
        float fFloatValue2 = (keyableUserParameterValue2 == null || (floatValue2 = keyableUserParameterValue2.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue2, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue3 = effectRef.getParameters().get("tangent");
        boolean booleanValue = keyableUserParameterValue3 != null ? keyableUserParameterValue3.getBooleanValue() : false;
        KeyableUserParameterValue keyableUserParameterValue4 = effectRef.getParameters().get("inset");
        float fFloatValue3 = (keyableUserParameterValue4 == null || (floatValue = keyableUserParameterValue4.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue5 = effectRef.getParameters().get("offset");
        if (keyableUserParameterValue5 == null || (vec2DValue = keyableUserParameterValue5.getVec2DValue()) == null || (zero = (Vector2D) KeyableKt.valueAtTime(vec2DValue, time)) == null) {
            zero = Vector2D.INSTANCE.getZERO();
        }
        Transform transformValueAtTime = el.getTransform().valueAtTime(time);
        Iterator<SceneElement> it = scriptEnv.getScene().getElements().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getId() == el.getId()) {
                break;
            }
            i2++;
        }
        if (i2 < 1) {
            return el;
        }
        SceneElement sceneElement = scriptEnv.getScene().getElements().get(i2 - 1);
        Path pathT = CubicBSplineKt.toPath(LiveShapeScriptKt.getShapeOutline(sceneElement, time)).t();
        TransformKt.transform(pathT, sceneElement.getTransform().valueAtTime(time));
        PathMeasure pathMeasure = new PathMeasure(pathT, false);
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength() * fFloatValue, fArr, fArr2);
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, TransformKt.rotatedBy(TransformKt.translatedBy(el.getTransform(), GeometryKt.plus(GeometryKt.plus(GeometryKt.minus(new Vector3D(fArr[0], fArr[1], 0.0f, 4, null), transformValueAtTime.getLocation()), GeometryKt.times(GeometryKt.perpCCw(GeometryKt.normalize(new Vector2D(fArr2[0], fArr2[1]))), fFloatValue3)), zero)), (booleanValue ? (-((float) Math.atan2(r0.getX(), r0.getY()))) * 57.2958f : 0.0f) + fFloatValue2), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    public static final SceneElement script_moveAlongPath3(SceneElement el, KeyableVisualEffectRef effectRef, ScriptEnv scriptEnv) {
        Vector2D zero;
        Keyable<Vector2D> vec2DValue;
        Keyable<Float> floatValue;
        Keyable<Float> floatValue2;
        Keyable<Float> floatValue3;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(effectRef, "effectRef");
        Intrinsics.checkNotNullParameter(scriptEnv, "scriptEnv");
        float time = scriptEnv.getTime();
        KeyableUserParameterValue keyableUserParameterValue = effectRef.getParameters().get("progress");
        float fFloatValue = (keyableUserParameterValue == null || (floatValue3 = keyableUserParameterValue.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue3, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue2 = effectRef.getParameters().get("angle");
        float fFloatValue2 = (keyableUserParameterValue2 == null || (floatValue2 = keyableUserParameterValue2.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue2, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue3 = effectRef.getParameters().get("tangent");
        boolean booleanValue = keyableUserParameterValue3 != null ? keyableUserParameterValue3.getBooleanValue() : false;
        KeyableUserParameterValue keyableUserParameterValue4 = effectRef.getParameters().get("inset");
        float fFloatValue3 = (keyableUserParameterValue4 == null || (floatValue = keyableUserParameterValue4.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue, time)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue5 = effectRef.getParameters().get("offset");
        if (keyableUserParameterValue5 == null || (vec2DValue = keyableUserParameterValue5.getVec2DValue()) == null || (zero = (Vector2D) KeyableKt.valueAtTime(vec2DValue, time)) == null) {
            zero = Vector2D.INSTANCE.getZERO();
        }
        Transform transformValueAtTime = el.getTransform().valueAtTime(time);
        int i2 = -1;
        if (el.getParent() == null) {
            Iterator<SceneElement> it = scriptEnv.getScene().getElements().iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().getId() == el.getId()) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            if (i2 >= 1) {
                i2--;
            }
            return el;
        }
        Iterator<SceneElement> it2 = scriptEnv.getScene().getElements().iterator();
        int i5 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            long id = it2.next().getId();
            Long parent = el.getParent();
            if (parent != null && id == parent.longValue()) {
                i2 = i5;
                break;
            }
            i5++;
        }
        int iSceneTimeFromLocalTime = KeyableKt.sceneTimeFromLocalTime(el, time);
        SceneElement sceneElement = scriptEnv.getScene().getElements().get(i2);
        if (!SceneElementKt.indirectParent(sceneElement, scriptEnv.getScene(), el.getId())) {
            float fFractionalTime = SceneElementKt.fractionalTime(sceneElement, iSceneTimeFromLocalTime);
            SceneElement sceneElementApplyLayerParenting = LayerParentingKt.applyLayerParenting(sceneElement, scriptEnv.getScene(), fFractionalTime);
            Path pathT = CubicBSplineKt.toPath(LiveShapeScriptKt.getShapeOutline(sceneElementApplyLayerParenting, fFractionalTime)).t();
            TransformKt.transform(pathT, sceneElementApplyLayerParenting.getTransform().valueAtTime(fFractionalTime));
            PathMeasure pathMeasure = new PathMeasure(pathT, false);
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            pathMeasure.getPosTan(pathMeasure.getLength() * fFloatValue, fArr, fArr2);
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, TransformKt.rotatedBy(TransformKt.translatedBy(el.getTransform(), GeometryKt.plus(GeometryKt.plus(GeometryKt.minus(GeometryKt.minus(new Vector3D(fArr[0], fArr[1], 0.0f, 4, null), transformValueAtTime.getLocation()), transformValueAtTime.getPivot()), GeometryKt.times(GeometryKt.perpCCw(GeometryKt.normalize(new Vector2D(fArr2[0], fArr2[1]))), fFloatValue3)), zero)), (booleanValue ? (-((float) Math.atan2(r0.getX(), r0.getY()))) * 57.2958f : 0.0f) + fFloatValue2), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
        }
        return el;
    }
}
