package com.alightcreative.app.motion.scene;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt;
import com.alightcreative.app.motion.scene.scripting.ScriptGroup;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import yc.nKE;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001aa\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0014\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0017\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001c\u001a\u00020\u001b*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001a\u001a\u0011\u0010\u001f\u001a\u00020\u000e*\u00020\u0011¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\u00020\u000e*\u00020\u00112\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#\u001a!\u0010&\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b&\u0010'\u001a)\u0010&\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b&\u0010+\u001a)\u0010,\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b,\u0010-\u001a!\u0010,\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b,\u0010'\u001a)\u00100\u001a\u00020/*\u00020\u000e2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0012¢\u0006\u0004\b0\u00101\u001a;\u00103\u001a\u00020\u000e*\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b3\u00104\"\u0014\u00105\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableTransform;", "transform", "", "startTime", "endTime", "", "id", "", "label", "inTime", "outTime", "Lcom/alightcreative/app/motion/scene/CameraProperties;", "cameraProperties", "trackId", "Lcom/alightcreative/app/motion/scene/SceneElement;", "CameraElement", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;IIJLjava/lang/String;IILcom/alightcreative/app/motion/scene/CameraProperties;J)Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/Scene;", "", "fov", "calcCameraZoom", "(Lcom/alightcreative/app/motion/scene/Scene;F)F", "cameraZoom", "calcCameraFov", "cameraSize", "calcCameraFovForSize", "(FF)F", "Lcom/alightcreative/app/motion/scene/Vector2D;", "calcCameraDimensions", "(Lcom/alightcreative/app/motion/scene/Scene;FF)Lcom/alightcreative/app/motion/scene/Vector2D;", "calcCameraLargeDimension", "makeDefaultCamera", "(Lcom/alightcreative/app/motion/scene/Scene;)Lcom/alightcreative/app/motion/scene/SceneElement;", "time", "getActiveCameraAtTime", "(Lcom/alightcreative/app/motion/scene/Scene;I)Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "bakeCamera", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;F)Lcom/alightcreative/app/motion/scene/SceneElement;", "scene", "Lyc/nKE;", "userPreviewMode", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;Lyc/nKE;F)Lcom/alightcreative/app/motion/scene/SceneElement;", "applyCameraAndParenting", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;FLyc/nKE;)Lcom/alightcreative/app/motion/scene/SceneElement;", "targetZ", "Lcom/alightcreative/app/motion/scene/Transform;", "getCameraTransform", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;IF)Lcom/alightcreative/app/motion/scene/Transform;", "activeCamera", "bakeCameraInternal", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lyc/nKE;Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneElement;F)Lcom/alightcreative/app/motion/scene/SceneElement;", "pi", "F", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCameraElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraElement.kt\ncom/alightcreative/app/motion/scene/CameraElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,441:1\n1#2:442\n*E\n"})
public final class CameraElementKt {
    private static final float pi = 3.1415927f;

    public static final SceneElement applyCameraAndParenting(SceneElement sceneElement, Scene scene, float f3, nKE userPreviewMode) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(userPreviewMode, "userPreviewMode");
        return bakeCamera(LayerParentingKt.applyLayerParenting(sceneElement, scene, f3), scene, userPreviewMode, f3);
    }

    public static final SceneElement bakeCamera(SceneElement sceneElement, RenderEnvironment env, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(env, "env");
        return bakeCameraInternal(sceneElement, env, env.getUserPreviewMode(), env.getScene(), env.getActiveCamera(), f3);
    }

    public static final float calcCameraFovForSize(float f3, float f4) {
        return ((((float) Math.atan((f4 / f3) / 2.0f)) * 2.0f) * 180.0f) / pi;
    }

    public static final SceneElement CameraElement(KeyableTransform transform, int i2, int i3, long j2, String label, int i5, int i7, CameraProperties cameraProperties, long j3) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        return new SceneElement(SceneElementType.Camera, i2, i3, j2, new EngineState(j3), label, transform, null, null, null, null, null, null, null, null, null, null, i5, i7, false, null, null, null, SceneKt.getEMPTY_SCENE(), null, null, null, null, null, null, null, null, null, false, cameraProperties, null, false, null, null, -26083456, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
    }

    public static /* synthetic */ SceneElement CameraElement$default(KeyableTransform keyableTransform, int i2, int i3, long j2, String str, int i5, int i7, CameraProperties cameraProperties, long j3, int i8, Object obj) {
        return CameraElement(keyableTransform, i2, i3, (i8 & 8) != 0 ? 0L : j2, (i8 & 16) != 0 ? YmsTEL.JERojDNxgHv : str, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? Integer.MAX_VALUE : i7, (i8 & 128) != 0 ? CameraProperties.INSTANCE.getDEFAULT() : cameraProperties, (i8 & 256) != 0 ? nCS.j.f71005n.n() : j3);
    }

    public static final SceneElement applyCameraAndParenting(SceneElement sceneElement, RenderEnvironment env, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(env, "env");
        return bakeCamera(LayerParentingKt.applyLayerParenting(sceneElement, env.getScene(), f3), env, f3);
    }

    public static final SceneElement bakeCamera(SceneElement sceneElement, Scene scene, nKE userPreviewMode, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(userPreviewMode, "userPreviewMode");
        return bakeCameraInternal(sceneElement, null, userPreviewMode, scene, userPreviewMode.nr() ? getActiveCameraAtTime(scene, SceneElementKt.sceneTime(sceneElement, f3)) : makeDefaultCamera(scene), f3);
    }

    public static final SceneElement bakeCameraInternal(SceneElement sceneElement, RenderEnvironment renderEnvironment, nKE userPreviewMode, Scene scene, SceneElement activeCamera, float f3) {
        SceneElement sceneElementRunScripts$default;
        Object obj;
        Object next;
        SolidColor transparent;
        float fCoerceAtLeast;
        List<Long> list;
        List<Long> list2;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(userPreviewMode, "userPreviewMode");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(activeCamera, "activeCamera");
        if (userPreviewMode.nr() && sceneElement.getId() == activeCamera.getId()) {
            return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null);
        }
        if (sceneElement.getType() == SceneElementType.Camera) {
            return sceneElement;
        }
        float fFractionalTime = SceneElementKt.fractionalTime(activeCamera, SceneElementKt.sceneTime(sceneElement, f3));
        if (renderEnvironment != null) {
            sceneElementRunScripts$default = ScriptExecutorKt.runScripts(activeCamera, fFractionalTime, renderEnvironment.getOverrideFrame(), renderEnvironment.getFramesPerHundredSeconds(), renderEnvironment.getScene(), activeCamera.getTransform().valueAtTimeOneFrameEarlier(renderEnvironment), renderEnvironment.getPreviousFrameTime(), renderEnvironment.getRenderMode(), Integer.valueOf(renderEnvironment.getEditMode()), false, ScriptGroup.BeforeRepeat);
        } else {
            sceneElementRunScripts$default = ScriptExecutorKt.runScripts$default(activeCamera, fFractionalTime, scene, null, null, false, null, 60, null);
        }
        SceneElement sceneElementApplyLayerParenting = LayerParentingKt.applyLayerParenting(sceneElementRunScripts$default, scene, fFractionalTime);
        Iterator<T> it = sceneElement.getVisualEffects().values().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) next;
            if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effects.motionblur4") && !keyableVisualEffectRef.getHidden()) {
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef2 = (KeyableVisualEffectRef) next;
        Iterator<T> it2 = sceneElementApplyLayerParenting.getVisualEffects().values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            KeyableVisualEffectRef keyableVisualEffectRef3 = (KeyableVisualEffectRef) next2;
            if (Intrinsics.areEqual(keyableVisualEffectRef3.getId(), "com.alightcreative.effects.motionblur4") && !keyableVisualEffectRef3.getHidden()) {
                obj = next2;
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef4 = (KeyableVisualEffectRef) obj;
        Vector2D center = SceneElementKt.getCenter(scene);
        Transform transformValueAtTime = TransformKt.translatedBy(sceneElementApplyLayerParenting.getTransform(), GeometryKt.unaryMinus(center)).valueAtTime(fFractionalTime);
        Transform transformValueAtTime2 = sceneElement.getTransform().valueAtTime(f3);
        if (transformValueAtTime2.getLocation().getZ() <= transformValueAtTime.getLocation().getZ()) {
            return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null);
        }
        float z2 = transformValueAtTime2.getLocation().getZ() - transformValueAtTime.getLocation().getZ();
        float fCalcCameraZoom = sceneElementApplyLayerParenting.getCameraProperties().getType() == CameraType.Perspective ? calcCameraZoom(scene, ((Number) KeyableKt.valueAtTime(sceneElementApplyLayerParenting.getCameraProperties().getFov(), fFractionalTime)).floatValue()) / z2 : 1.0f;
        if (sceneElementApplyLayerParenting.getCameraProperties().getFogEnabled()) {
            float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElementApplyLayerParenting.getCameraProperties().getFogNearZ(), fFractionalTime)).floatValue();
            float fFloatValue2 = ((Number) KeyableKt.valueAtTime(sceneElementApplyLayerParenting.getCameraProperties().getFogFarZ(), fFractionalTime)).floatValue();
            SolidColor solidColor = (SolidColor) KeyableKt.valueAtTime(sceneElementApplyLayerParenting.getCameraProperties().getFogColor(), fFractionalTime);
            transparent = SolidColor.copy$default(solidColor, 0.0f, 0.0f, 0.0f, solidColor.getA() * RangesKt.coerceIn((z2 - fFloatValue) / (fFloatValue2 - fFloatValue), 0.0f, 1.0f), 7, null);
        } else {
            transparent = SolidColor.INSTANCE.getTRANSPARENT();
        }
        SolidColor solidColor2 = transparent;
        if (sceneElementApplyLayerParenting.getCameraProperties().getFocusBlurEnabled()) {
            float fFloatValue3 = ((Number) KeyableKt.valueAtTime(sceneElementApplyLayerParenting.getCameraProperties().getFocusDepthOfField(), fFractionalTime)).floatValue();
            fCoerceAtLeast = (RangesKt.coerceAtLeast(Math.abs(((Number) KeyableKt.valueAtTime(sceneElementApplyLayerParenting.getCameraProperties().getFocusDistance(), fFractionalTime)).floatValue() - z2) - fFloatValue3, 0.0f) * ((Number) KeyableKt.valueAtTime(sceneElementApplyLayerParenting.getCameraProperties().getFocusBlurStrength(), fFractionalTime)).floatValue()) / (z2 + (fFloatValue3 / 2.0f));
        } else {
            fCoerceAtLeast = 0.0f;
        }
        if (fCoerceAtLeast > 0.0f) {
            Long l2 = (Long) CollectionsKt.maxOrNull((Iterable) sceneElement.getVisualEffects().keySet());
            jLongValue = (l2 != null ? l2.longValue() : 0L) + 1;
        }
        long j2 = jLongValue;
        Map visualEffects = sceneElement.getVisualEffects();
        List<Long> visualEffectOrder = sceneElement.getVisualEffectOrder();
        if (fCoerceAtLeast > 0.0f || solidColor2.getA() > 0.0f || (keyableVisualEffectRef4 != null && keyableVisualEffectRef2 == null)) {
            visualEffects = MapsKt.toMutableMap(visualEffects);
            List<Long> mutableList = CollectionsKt.toMutableList((Collection) visualEffectOrder);
            if (fCoerceAtLeast > 0.0f) {
                Pair pair = TuplesKt.to(Long.valueOf(j2), new KeyableVisualEffectRef("com.alightcreative.effects.gaussianblur", j2, MapsKt.mapOf(TuplesKt.to("strength", new KeyableUserParameterValue(fCoerceAtLeast))), 0, false, false, null, b.f61769v, null));
                visualEffects.put(pair.getFirst(), pair.getSecond());
                mutableList.add(Long.valueOf(j2));
                j2++;
            }
            long j3 = j2;
            if (solidColor2.getA() > 0.0f) {
                Pair pair2 = TuplesKt.to(Long.valueOf(j3), new KeyableVisualEffectRef("com.alightcreative.solidcolor", j3, MapsKt.mapOf(TuplesKt.to(TtmlNode.ATTR_TTS_COLOR, new KeyableUserParameterValue(SolidColor.copy$default(solidColor2, 0.0f, 0.0f, 0.0f, 1.0f, 7, null))), TuplesKt.to("alpha", new KeyableUserParameterValue(solidColor2.getA())), TuplesKt.to("blendMode", new KeyableUserParameterValue(0))), 0, false, false, null, b.f61769v, null));
                visualEffects.put(pair2.getFirst(), pair2.getSecond());
                mutableList.add(Long.valueOf(j3));
                j3++;
            }
            long j4 = j3;
            if (keyableVisualEffectRef4 == null || keyableVisualEffectRef2 != null) {
                list = mutableList;
            } else {
                list = mutableList;
                Pair pair3 = TuplesKt.to(Long.valueOf(j4), KeyableVisualEffectRef.copy$default(keyableVisualEffectRef4, null, j4, null, 0, false, false, null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null));
                visualEffects.put(pair3.getFirst(), pair3.getSecond());
                list.add(Long.valueOf(j4));
            }
            list2 = list;
        } else {
            list2 = visualEffectOrder;
        }
        return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.asKeyable(Transform.copy$default(transformValueAtTime2, GeometryKt.minus(GeometryKt.plus(GeometryKt.times(GeometryKt.rot2D(GeometryKt.minus(GeometryKt.minus(GeometryKt.plus(transformValueAtTime2.getLocation(), transformValueAtTime2.getPivot()), center), transformValueAtTime.getLocation()), -transformValueAtTime.getRotation()), fCalcCameraZoom), center), transformValueAtTime2.getPivot()), null, GeometryKt.times(transformValueAtTime2.getScale(), fCalcCameraZoom), 0.0f, 0.0f, transformValueAtTime2.getRotation() - transformValueAtTime.getRotation(), 0.0f, null, null, 474, null)), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, visualEffects, list2, null, null, null, null, null, null, false, null, null, false, null, null, -100663361, 127, null);
    }

    public static final Vector2D calcCameraDimensions(Scene scene, float f3, float f4) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        float fMax = Math.max(scene.getWidth(), scene.getHeight());
        float fTan = ((float) Math.tan(((f3 / 2.0f) * pi) / 180.0f)) * 2.0f * f4;
        return new Vector2D((scene.getWidth() / fMax) * fTan, (scene.getHeight() / fMax) * fTan);
    }

    public static final float calcCameraFov(Scene scene, float f3) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return ((((float) Math.atan((Math.max(scene.getWidth(), scene.getHeight()) / f3) / 2.0f)) * 2.0f) * 180.0f) / pi;
    }

    public static final float calcCameraLargeDimension(float f3, float f4) {
        return ((float) Math.tan(((f3 / 2.0f) * pi) / 180.0f)) * 2.0f * f4;
    }

    public static final float calcCameraZoom(Scene scene, float f3) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return (Math.max(scene.getWidth(), scene.getHeight()) / ((float) Math.tan(((f3 / 2.0f) * pi) / 180.0f))) / 2.0f;
    }

    public static final SceneElement getActiveCameraAtTime(Scene scene, int i2) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        SceneElement sceneElement = null;
        for (SceneElement sceneElement2 : scene.getElements()) {
            if (sceneElement2.getType() == SceneElementType.Camera && !sceneElement2.getHidden() && (sceneElement == null || (i2 >= sceneElement2.getStartTime() && i2 <= sceneElement2.getEndTime()))) {
                sceneElement = sceneElement2;
            }
        }
        return sceneElement != null ? sceneElement : makeDefaultCamera(scene);
    }

    public static final Transform getCameraTransform(SceneElement sceneElement, Scene scene, int i2, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        if (sceneElement.getType() != SceneElementType.Camera) {
            throw new IllegalStateException("Check failed.");
        }
        Vector2D center = SceneElementKt.getCenter(scene);
        float fFractionalTime = SceneElementKt.fractionalTime(sceneElement, i2);
        Transform transformValueAtTime = TransformKt.translatedBy(LayerParentingKt.applyLayerParenting(ScriptExecutorKt.runScripts$default(sceneElement, fFractionalTime, scene, null, null, false, null, 60, null), scene, fFractionalTime).getTransform(), GeometryKt.unaryMinus(center)).valueAtTime(fFractionalTime);
        float z2 = sceneElement.getCameraProperties().getType() == CameraType.Perspective ? (f3 - transformValueAtTime.getLocation().getZ()) / calcCameraZoom(scene, ((Number) KeyableKt.valueAtTime(sceneElement.getCameraProperties().getFov(), fFractionalTime)).floatValue()) : 1.0f;
        return Transform.copy$default(transformValueAtTime, null, null, new Vector2D(z2, z2), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 507, null);
    }

    public static final SceneElement makeDefaultCamera(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        CameraProperties cameraProperties = CameraProperties.INSTANCE.getDEFAULT();
        return CameraElement$default(new KeyableTransform(KeyableKt.keyable(new Vector3D(scene.getWidth() / 2.0f, scene.getHeight() / 2.0f, -calcCameraZoom(scene, ((Number) KeyableKt.valueAtTime(cameraProperties.getFov(), 0.0f)).floatValue()))), null, null, null, 0.0f, 0.0f, null, null, false, 510, null), 0, scene.getTotalTime(), 0L, "Camera", 0, 0, cameraProperties, 640982598L, 104, null);
    }
}
