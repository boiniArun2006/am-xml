package com.alightcreative.app.motion.scene.rendering;

import WzY.C1487z;
import WzY.EnumC1485c;
import WzY.s4;
import WzY.yg;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.ColorRange;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.EdgeDecorationDirection;
import com.alightcreative.app.motion.scene.EdgeDecorationKt;
import com.alightcreative.app.motion.scene.EdgeDecorationType;
import com.alightcreative.app.motion.scene.ElementTag;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableEdgeDecoration;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.QuaternionKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneSelection;
import com.alightcreative.app.motion.scene.SimplexNoiseKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.alightcreative.app.motion.scene.repeat.RepeatEasingKt;
import com.alightcreative.app.motion.scene.scripting.ACScript;
import com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt;
import com.alightcreative.app.motion.scene.scripting.ScriptGroup;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.app.motion.scene.visualeffect.ShaderGroup;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import yc.M;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a1\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000b\u001a3\u0010\u0010\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000b\u001a;\u0010\u0014\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0016\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u000b\u001a3\u0010\u0017\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u000b\u001aA\u0010\u0016\u001a\u00020\t*\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u000b\u001a\u001b\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\f*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00190!H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010$\u001a\u00020\f*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00190!H\u0002¢\u0006\u0004\b$\u0010#\"\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0018\u0010-\u001a\u00020\f*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0018\u00100\u001a\u00020\f*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneElement;", "LWzY/s4;", "canvas", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "Lcom/alightcreative/app/motion/scene/Rectangle;", "viewport", "", "renderSelection", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Rectangle;)V", "", "renderGeneralElementSelectionAndEditMode", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Rectangle;)Z", "renderWithEffects", "renderWithEffectsNoReverseInterpolation", "baseEnv", "Lcom/alightcreative/app/motion/scene/Transform;", "prevFrameTf", "renderWithEffectsInternal", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Transform;Lcom/alightcreative/app/motion/scene/Rectangle;)V", "renderWithRepeat", "renderWithPostRepeatScripts", "", "Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "repeatEffects", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/util/List;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Rectangle;)V", "renderInternal", "", "oneFrameDuration", "reverseInterpolateFirstFrame", "(Lcom/alightcreative/app/motion/scene/SceneElement;F)Lcom/alightcreative/app/motion/scene/SceneElement;", "", "includesShaderEffects", "(Ljava/util/Map;)Z", "includesScriptEffects", "LWzY/yg;", "scratchPaint", "LWzY/yg;", "LWzY/z;", "scratchPath", "LWzY/z;", "getNeedsSpecialCaseRender", "(Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;)Z", "needsSpecialCaseRender", "getHasEdgeDecorations", "(Lcom/alightcreative/app/motion/scene/SceneElement;)Z", "hasEdgeDecorations", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneElementRendering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneElementRendering.kt\ncom/alightcreative/app/motion/scene/rendering/SceneElementRenderingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Geometry.kt\ncom/alightcreative/app/motion/scene/GeometryKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 SceneElement.kt\ncom/alightcreative/app/motion/scene/SceneElementKt\n*L\n1#1,783:1\n1053#2:784\n1557#2:786\n1628#2,2:787\n1630#2:790\n1053#2:795\n1557#2:797\n1628#2,2:798\n1630#2:801\n360#2,7:802\n774#2:809\n865#2:810\n866#2:814\n1557#2:815\n1628#2,2:816\n1630#2:819\n774#2:820\n865#2,2:821\n1557#2:823\n1628#2,3:824\n774#2:827\n865#2:828\n866#2:832\n1557#2:833\n1628#2,2:834\n1630#2:837\n774#2:838\n865#2,2:839\n1557#2:841\n1628#2,3:842\n774#2:845\n865#2,2:846\n360#2,7:848\n1755#2,2:856\n1757#2:861\n1755#2,3:862\n1755#2,3:865\n105#3:785\n105#3:789\n105#3:791\n105#3:792\n105#3:793\n105#3:796\n105#3:800\n105#3:868\n105#3:869\n1#4:794\n188#5,3:811\n188#5,3:829\n188#5,3:858\n804#6:818\n804#6:836\n804#6:855\n*S KotlinDebug\n*F\n+ 1 SceneElementRendering.kt\ncom/alightcreative/app/motion/scene/rendering/SceneElementRenderingKt\n*L\n96#1:784\n130#1:786\n130#1:787,2\n130#1:790\n221#1:795\n254#1:797\n254#1:798,2\n254#1:801\n373#1:802,7\n421#1:809\n421#1:810\n421#1:814\n421#1:815\n421#1:816,2\n421#1:819\n422#1:820\n422#1:821,2\n424#1:823\n424#1:824,3\n459#1:827\n459#1:828\n459#1:832\n459#1:833\n459#1:834,2\n459#1:837\n460#1:838\n460#1:839,2\n462#1:841\n462#1:842,3\n481#1:845\n481#1:846,2\n624#1:848,7\n780#1:856,2\n780#1:861\n781#1:862,3\n782#1:865,3\n114#1:785\n132#1:789\n138#1:791\n195#1:792\n196#1:793\n238#1:796\n258#1:800\n105#1:868\n229#1:869\n421#1:811,3\n459#1:829,3\n780#1:858,3\n421#1:818\n459#1:836\n689#1:855\n*E\n"})
public final class SceneElementRenderingKt {
    private static final yg scratchPaint = new yg();
    private static final C1487z scratchPath = new C1487z();

    private static final void renderWithRepeat(SceneElement sceneElement, WzY.s4 s4Var, RenderEnvironment renderEnvironment, SceneSelection sceneSelection, Rectangle rectangle) {
        Collection<KeyableVisualEffectRef> collectionValues = sceneElement.getVisualEffects().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (getNeedsSpecialCaseRender((KeyableVisualEffectRef) obj)) {
                arrayList.add(obj);
            }
        }
        renderWithRepeat(sceneElement, arrayList, s4Var, renderEnvironment, sceneSelection, rectangle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWithRepeat$lambda$38(float f3, PathMeasure pathMeasure, float f4, float f5, float f6, float f7, float[] fArr, float[] fArr2, boolean z2, SceneElement sceneElement, Transform transform, Vector2D vector2D, float f8, float f9, boolean z3, SolidColor solidColor, SolidColor solidColor2, List list, WzY.s4 s4Var, RenderEnvironment renderEnvironment, SceneSelection sceneSelection, Rectangle rectangle, int i2, float f10, float f11) {
        float fMix = QuaternionKt.mix(1.0f, f3, f11);
        pathMeasure.getPosTan(((f4 + (f5 * f10)) + ((f6 + 1000.0f) * f7)) % f7, fArr, fArr2);
        renderWithRepeat(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.multOpacityBy(TransformKt.rotatedBy(TransformKt.scaledBy$default(TransformKt.translatedBy(sceneElement.getTransform(), GeometryKt.plus(GeometryKt.minus(new Vector3D(fArr[0], fArr[1], 0.0f, 4, null), transform.getLocation()), GeometryKt.times(vector2D, f11))), fMix, fMix, 0.0f, 0.0f, 12, null), (z2 ? (-((float) Math.atan2(fArr2[0], fArr2[1]))) * 57.2958f : 0.0f) + (f8 * f11)), QuaternionKt.mix(1.0f, f9, f11)), (z3 && i2 % 2 == 1) ? sceneElement.getFillColor() : KeyableKt.keyable(GeometryKt.mix(solidColor, solidColor2, f11)), null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -193, 127, null), list, s4Var, ((double) Math.abs(0)) < 1.0E-4d ? renderEnvironment : new RenderEnvironmentTimeOffset(renderEnvironment, 0), sceneSelection, rectangle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWithRepeat$lambda$39(float f3, SceneElement sceneElement, float f4, float f5, float f6, float f7, Vector2D vector2D, float f8, float f9, int i2, float f10, boolean z2, SolidColor solidColor, SolidColor solidColor2, List list, WzY.s4 s4Var, RenderEnvironment renderEnvironment, SceneSelection sceneSelection, Rectangle rectangle, int i3, float f11, float f12) {
        float fMix = QuaternionKt.mix(1.0f, f3, f12);
        renderWithRepeat(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.multOpacityBy(TransformKt.rotatedBy(TransformKt.scaledBy$default(TransformKt.translatedBy(KeyableTransform.copy$default(sceneElement.getTransform(), null, KeyableKt.translatedBy(sceneElement.getTransform().getPivot(), 0.0f, -f4), null, null, sceneElement.getTransform().getOrientation() + f5 + (f6 * f12), sceneElement.getTransform().getSize() * f7, null, null, false, 461, null), GeometryKt.plus(GeometryKt.times(vector2D, f12), new Vector2D(0.0f, f4))), fMix, fMix, 0.0f, 0.0f, 12, null), (f8 - (f9 / 2.0f)) + ((f9 - (f9 / i2)) * f11)), QuaternionKt.mix(1.0f, f10, f12)), (z2 && i3 % 2 == 1) ? sceneElement.getFillColor() : KeyableKt.keyable(GeometryKt.mix(solidColor, solidColor2, f12)), null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -193, 127, null), list, s4Var, ((double) Math.abs(0)) < 1.0E-4d ? renderEnvironment : new RenderEnvironmentTimeOffset(renderEnvironment, 0), sceneSelection, rectangle);
        return Unit.INSTANCE;
    }

    public static final boolean renderGeneralElementSelectionAndEditMode(SceneElement sceneElement, WzY.s4 canvas, RenderEnvironment renderEnvironment, SceneSelection selection, Rectangle viewport) {
        List listEmptyList;
        SceneElement sceneElement2;
        WzY.s4 s4Var;
        boolean z2;
        int i2;
        SolidColor white;
        ElementTag tag;
        M colors;
        SceneElement sceneElement3 = sceneElement;
        RenderEnvironment env = renderEnvironment;
        Intrinsics.checkNotNullParameter(sceneElement3, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        if (!selection.isElementDirectlySelected(sceneElement3.getId())) {
            return false;
        }
        switch (env.getEditMode()) {
            case 2131362615:
                if (sceneElement3.getFillType() != FillType.GRADIENT) {
                    return false;
                }
                Rectangle rectangleBoundsAtTime = SceneElementKt.boundsAtTime(sceneElement3, renderEnvironment.getScene(), renderEnvironment.getTime(), renderEnvironment.getOverrideFrame(), renderEnvironment.getFramesPerHundredSeconds());
                float fTy = WzY.SPz.ty(canvas, 2131165504);
                float fTy2 = WzY.SPz.ty(canvas, 2131165506);
                float fTy3 = WzY.SPz.ty(canvas, 2131165505);
                float fTy4 = WzY.SPz.ty(canvas, 2131166220);
                float fTy5 = WzY.SPz.ty(canvas, 2131166221);
                float left = rectangleBoundsAtTime.getLeft() + (rectangleBoundsAtTime.getWidth() * sceneElement3.getFillGradient().getStartLocation().getX());
                float top = rectangleBoundsAtTime.getTop() + (rectangleBoundsAtTime.getHeight() * sceneElement3.getFillGradient().getStartLocation().getY());
                float left2 = rectangleBoundsAtTime.getLeft() + (rectangleBoundsAtTime.getWidth() * sceneElement3.getFillGradient().getEndLocation().getX());
                float top2 = rectangleBoundsAtTime.getTop() + (rectangleBoundsAtTime.getHeight() * sceneElement3.getFillGradient().getEndLocation().getY());
                yg ygVar = scratchPaint;
                yg.w6 w6Var = yg.w6.f11694O;
                ygVar.ty(w6Var);
                ygVar.gh(renderEnvironment.getUiColors().getSingleSelectionBg());
                ygVar.az(fTy4);
                canvas.fD(left, top, left2, top2, ygVar);
                yg.w6 w6Var2 = yg.w6.f11697t;
                ygVar.ty(w6Var2);
                ygVar.gh(renderEnvironment.getUiColors().getSingleSelectionBg());
                canvas.Z(left, top, fTy, ygVar);
                canvas.Z(left2, top2, fTy, ygVar);
                ygVar.ty(w6Var);
                ygVar.gh(renderEnvironment.getUiColors().getSingleSelectionFg());
                ygVar.az(fTy5);
                canvas.fD(left, top, left2, top2, ygVar);
                ygVar.ty(w6Var2);
                ygVar.gh(renderEnvironment.getUiColors().getSingleSelectionFg());
                canvas.Z(left, top, fTy2, ygVar);
                canvas.Z(left2, top2, fTy2, ygVar);
                ygVar.gh(sceneElement3.getFillGradient().getStartColor());
                canvas.Z(left, top, fTy3, ygVar);
                ygVar.gh(sceneElement3.getFillGradient().getEndColor());
                canvas.Z(left2, top2, fTy3, ygVar);
                return true;
            case 2131362620:
            case 2131362621:
            case 2131362626:
            case 2131362627:
                List<Keyframe> listSortedWith = CollectionsKt.sortedWith(sceneElement3.getTransform().getLocation().getKeyframes(), new Comparator() { // from class: com.alightcreative.app.motion.scene.rendering.SceneElementRenderingKt$renderGeneralElementSelectionAndEditMode$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t3, T t4) {
                        return ComparisonsKt.compareValues(Float.valueOf(((Keyframe) t3).getTime()), Float.valueOf(((Keyframe) t4).getTime()));
                    }
                });
                scratchPath.ijL();
                Vector2D zero = Vector2D.INSTANCE.getZERO();
                Vector2D vector2D = zero;
                float time = 0.0f;
                boolean z3 = true;
                for (Keyframe keyframe : listSortedWith) {
                    Vector3D vector3DRenderGeneralElementSelectionAndEditMode$posForTime = renderGeneralElementSelectionAndEditMode$posForTime(sceneElement3, env, keyframe.getTime());
                    Vector2D vector2D2 = new Vector2D(vector3DRenderGeneralElementSelectionAndEditMode$posForTime.getX(), vector3DRenderGeneralElementSelectionAndEditMode$posForTime.getY());
                    if (z3) {
                        scratchPath.k(vector2D2);
                        sceneElement2 = sceneElement3;
                    } else {
                        renderGeneralElementSelectionAndEditMode$addPoints(sceneElement3, env, time, keyframe.getTime(), vector2D, vector2D2, 0);
                        sceneElement2 = sceneElement3;
                        scratchPath.D(vector2D2);
                    }
                    time = keyframe.getTime();
                    env = renderEnvironment;
                    vector2D = vector2D2;
                    sceneElement3 = sceneElement2;
                    z3 = false;
                }
                SceneElement sceneElement4 = sceneElement3;
                canvas.O();
                canvas.XQ(viewport);
                C1487z c1487z = scratchPath;
                EnumC1485c enumC1485c = EnumC1485c.E2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
                for (Keyframe keyframe2 : listSortedWith) {
                    Vector3D vector3D = (Vector3D) KeyableKt.valueAtTime(CameraElementKt.applyCameraAndParenting(sceneElement4, renderEnvironment.getScene(), keyframe2.getTime(), renderEnvironment.getUserPreviewMode()).getTransform().getLocation(), keyframe2.getTime());
                    arrayList.add(new WzY.l3D(GeometryKt.plus(new Vector2D(vector3D.getX(), vector3D.getY()), (Vector2D) KeyableKt.valueAtTime(sceneElement4.getTransform().getPivot(), keyframe2.getTime())), renderEnvironment.getEditMode() != 2131362626 && sceneElement4.getTransform().getLocation().getKeyed() && renderEnvironment.getOverrideFrame() == TimeKt.frameNumberFromTime((int) (((double) sceneElement4.getStartTime()) + ((((double) keyframe2.getTime()) * renderEnvironment.getOverrideDurationInSeconds()) * ((double) 1000.0f))), renderEnvironment.getFramesPerHundredSeconds()), false, false, false, false, 60, null));
                }
                if (renderEnvironment.getEditMode() == 2131362626) {
                    Vector3D vector3D2 = (Vector3D) KeyableKt.valueAtTime(sceneElement4.getTransform().getLocation(), renderEnvironment.getTime());
                    listEmptyList = CollectionsKt.listOf(new WzY.l3D(GeometryKt.plus(new Vector2D(vector3D2.getX(), vector3D2.getY()), (Vector2D) KeyableKt.valueAtTime(sceneElement4.getTransform().getPivot(), renderEnvironment.getTime())), false, false, true, false, false, 54, null));
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                WzY.SPz.qie(canvas, c1487z, enumC1485c, CollectionsKt.plus((Collection) arrayList, (Iterable) listEmptyList), null, 8, null);
                canvas.n();
                return true;
            default:
                if (sceneElement3.getParent() != null) {
                    Transform parentTransform = LayerParentingKt.getParentTransform(sceneElement3, env.getScene(), env.getTime());
                    Vector3D location = parentTransform.getLocation();
                    Vector2D vector2DPlus = GeometryKt.plus(new Vector2D(location.getX(), location.getY()), parentTransform.getPivot());
                    Vector3D vector3DRenderGeneralElementSelectionAndEditMode$posForTime$3 = renderGeneralElementSelectionAndEditMode$posForTime$3(sceneElement3, env, env.getTime());
                    Vector2D vector2D3 = new Vector2D(vector3DRenderGeneralElementSelectionAndEditMode$posForTime$3.getX(), vector3DRenderGeneralElementSelectionAndEditMode$posForTime$3.getY());
                    Vector2D vector2DNormalize = GeometryKt.normalize(GeometryKt.minus(vector2DPlus, vector2D3));
                    SceneElement sceneElementElementById = SceneKt.elementById(env.getScene(), sceneElement3.getParent());
                    C1487z c1487z2 = scratchPath;
                    c1487z2.ijL();
                    z2 = false;
                    c1487z2.k(GeometryKt.plus(vector2D3, GeometryKt.times(GeometryKt.times(vector2DNormalize, 20.0f), canvas.Uo())));
                    c1487z2.D(vector2DPlus);
                    c1487z2.k(vector2DPlus);
                    c1487z2.D(GeometryKt.plus(vector2DPlus, GeometryKt.times(GeometryKt.times(GeometryKt.rot(vector2DNormalize, -145.0f), 20.0f), canvas.Uo())));
                    c1487z2.k(vector2DPlus);
                    c1487z2.D(GeometryKt.plus(vector2DPlus, GeometryKt.times(GeometryKt.times(GeometryKt.rot(vector2DNormalize, 145.0f), 20.0f), canvas.Uo())));
                    canvas.O();
                    canvas.XQ(viewport);
                    EnumC1485c enumC1485c2 = EnumC1485c.f11624N;
                    if (sceneElementElementById == null || (tag = sceneElementElementById.getTag()) == null || (colors = tag.getColors()) == null || (white = GeometryKt.mix(colors.n(), colors.rl(), 0.5f)) == null) {
                        white = SolidColor.INSTANCE.getWHITE();
                    }
                    i2 = 2131362624;
                    WzY.SPz.qie(canvas, c1487z2, enumC1485c2, null, white, 4, null);
                    s4Var = canvas;
                    c1487z2.ijL();
                    if (sceneElementElementById != null) {
                        renderSelection(sceneElementElementById, s4Var, RenderEnvironmentKt.withMode(RenderEnvironmentKt.withTimingForElement(env, sceneElementElementById), env.getEditMode() == 2131362624 ? 2131362625 : 2131362624), SceneKt.singleElementSelection(sceneElementElementById.getId()), viewport);
                    }
                    s4Var.n();
                } else {
                    s4Var = canvas;
                    z2 = false;
                    i2 = 2131362624;
                }
                if (env.getEditMode() != i2 && env.getEditMode() != 2131362625) {
                    List<Keyframe> listSortedWith2 = CollectionsKt.sortedWith(sceneElement3.getTransform().getLocation().getKeyframes(), new Comparator() { // from class: com.alightcreative.app.motion.scene.rendering.SceneElementRenderingKt$renderGeneralElementSelectionAndEditMode$$inlined$sortedBy$2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t3, T t4) {
                            return ComparisonsKt.compareValues(Float.valueOf(((Keyframe) t3).getTime()), Float.valueOf(((Keyframe) t4).getTime()));
                        }
                    });
                    scratchPath.ijL();
                    Vector2D zero2 = Vector2D.INSTANCE.getZERO();
                    Vector2D vector2D4 = zero2;
                    boolean z4 = true;
                    float time2 = 0.0f;
                    for (Keyframe keyframe3 : listSortedWith2) {
                        Vector3D vector3DRenderGeneralElementSelectionAndEditMode$posForTime$32 = renderGeneralElementSelectionAndEditMode$posForTime$3(sceneElement3, env, keyframe3.getTime());
                        Vector2D vector2D5 = new Vector2D(vector3DRenderGeneralElementSelectionAndEditMode$posForTime$32.getX(), vector3DRenderGeneralElementSelectionAndEditMode$posForTime$32.getY());
                        if (z4) {
                            scratchPath.k(vector2D5);
                        } else {
                            renderGeneralElementSelectionAndEditMode$addPoints$6(sceneElement3, env, time2, keyframe3.getTime(), vector2D4, vector2D5, 0);
                            scratchPath.D(vector2D5);
                        }
                        time2 = keyframe3.getTime();
                        env = renderEnvironment;
                        vector2D4 = vector2D5;
                        z4 = z2;
                    }
                    s4Var.O();
                    s4Var.XQ(viewport);
                    C1487z c1487z3 = scratchPath;
                    EnumC1485c enumC1485c3 = EnumC1485c.f11630e;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith2, 10));
                    for (Keyframe keyframe4 : listSortedWith2) {
                        Vector3D vector3D3 = (Vector3D) KeyableKt.valueAtTime(CameraElementKt.applyCameraAndParenting(sceneElement3, renderEnvironment.getScene(), keyframe4.getTime(), renderEnvironment.getUserPreviewMode()).getTransform().getLocation(), keyframe4.getTime());
                        arrayList2.add(new WzY.l3D(GeometryKt.plus(new Vector2D(vector3D3.getX(), vector3D3.getY()), (Vector2D) KeyableKt.valueAtTime(sceneElement3.getTransform().getPivot(), keyframe4.getTime())), renderEnvironment.getOverrideFrame() == TimeKt.frameNumberFromTime((int) (((double) sceneElement3.getStartTime()) + ((((double) keyframe4.getTime()) * renderEnvironment.getOverrideDurationInSeconds()) * ((double) 1000.0f))), renderEnvironment.getFramesPerHundredSeconds()) ? true : z2, false, false, false, false, 60, null));
                    }
                    WzY.SPz.qie(s4Var, c1487z3, enumC1485c3, arrayList2, null, 8, null);
                    s4Var.n();
                }
                return z2;
        }
    }

    private static final void renderGeneralElementSelectionAndEditMode$addPoints(SceneElement sceneElement, RenderEnvironment renderEnvironment, float f3, float f4, Vector2D vector2D, Vector2D vector2D2, int i2) {
        Vector2D vector2DDiv = GeometryKt.div(GeometryKt.plus(vector2D, vector2D2), 2);
        float f5 = (f3 + f4) / 2.0f;
        Vector3D vector3DRenderGeneralElementSelectionAndEditMode$posForTime = renderGeneralElementSelectionAndEditMode$posForTime(sceneElement, renderEnvironment, f5);
        Vector2D vector2D3 = new Vector2D(vector3DRenderGeneralElementSelectionAndEditMode$posForTime.getX(), vector3DRenderGeneralElementSelectionAndEditMode$posForTime.getY());
        if ((GeometryKt.getLengthSquared(GeometryKt.minus(vector2DDiv, vector2D3)) > 1.5f || i2 < 1) && i2 < 10) {
            int i3 = i2 + 1;
            renderGeneralElementSelectionAndEditMode$addPoints(sceneElement, renderEnvironment, f3, f5, vector2D, vector2D3, i3);
            scratchPath.D(vector2D3);
            renderGeneralElementSelectionAndEditMode$addPoints(sceneElement, renderEnvironment, f5, f4, vector2D3, vector2D2, i3);
        }
    }

    private static final void renderGeneralElementSelectionAndEditMode$addPoints$6(SceneElement sceneElement, RenderEnvironment renderEnvironment, float f3, float f4, Vector2D vector2D, Vector2D vector2D2, int i2) {
        Vector2D vector2DDiv = GeometryKt.div(GeometryKt.plus(vector2D, vector2D2), 2);
        float f5 = (f3 + f4) / 2.0f;
        Vector3D vector3DRenderGeneralElementSelectionAndEditMode$posForTime$3 = renderGeneralElementSelectionAndEditMode$posForTime$3(sceneElement, renderEnvironment, f5);
        Vector2D vector2D3 = new Vector2D(vector3DRenderGeneralElementSelectionAndEditMode$posForTime$3.getX(), vector3DRenderGeneralElementSelectionAndEditMode$posForTime$3.getY());
        if (GeometryKt.getLengthSquared(GeometryKt.minus(vector2DDiv, vector2D3)) <= 1.5f || i2 >= 10) {
            return;
        }
        int i3 = i2 + 1;
        renderGeneralElementSelectionAndEditMode$addPoints$6(sceneElement, renderEnvironment, f3, f5, vector2D, vector2D3, i3);
        scratchPath.D(vector2D3);
        renderGeneralElementSelectionAndEditMode$addPoints$6(sceneElement, renderEnvironment, f5, f4, vector2D3, vector2D2, i3);
    }

    public static final void renderSelection(SceneElement sceneElement, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        sceneElement.getType().renderSelection(sceneElement, canvas, env, selection, viewport);
    }

    public static final void renderWithEffects(SceneElement sceneElement, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        renderWithEffectsNoReverseInterpolation(reverseInterpolateFirstFrame(sceneElement, env.getTime() - env.getPreviousFrameTime()), canvas, env, selection, viewport);
    }

    private static final void renderWithEffectsInternal(SceneElement sceneElement, WzY.s4 s4Var, RenderEnvironment renderEnvironment, SceneSelection sceneSelection, final Transform transform, Rectangle rectangle) {
        Float f3;
        Object next;
        VisualEffect visualEffectVisualEffectById;
        Map<Integer, ShaderGroup> shaderGroups;
        float f4;
        List listEmptyList;
        RenderEnvironment renderEnvironment2;
        int i2;
        int i3;
        final SceneElement sceneElement2;
        final Transform transform2;
        final RenderEnvironment renderEnvironment3;
        VisualEffect visualEffectVisualEffectById2;
        Map<Integer, ShaderGroup> shaderGroups2;
        Map<String, KeyableUserParameterValue> parameters;
        KeyableUserParameterValue keyableUserParameterValue;
        Keyable<Float> floatValue;
        WzY.s4 s4Var2 = s4Var;
        if (sceneElement.getHidden()) {
            return;
        }
        s4Var2.qie(sceneSelection.isElementSelected(sceneElement.getId()) && renderEnvironment.getEditMode() == 2131362614);
        Iterator<T> it = sceneElement.getVisualEffects().values().iterator();
        while (true) {
            f3 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) next;
            if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effects.timequant") && !keyableVisualEffectRef.getHidden()) {
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef2 = (KeyableVisualEffectRef) next;
        if (keyableVisualEffectRef2 != null && (parameters = keyableVisualEffectRef2.getParameters()) != null && (keyableUserParameterValue = parameters.get("stepsPerSecond")) != null && (floatValue = keyableUserParameterValue.getFloatValue()) != null) {
            f3 = (Float) KeyableKt.valueAtTime(floatValue, renderEnvironment);
        }
        final RenderEnvironment renderEnvironmentTimeQuant = f3 == null ? renderEnvironment : new RenderEnvironmentTimeQuant(renderEnvironment, f3.floatValue());
        SceneElement sceneElementApplyCameraAndParenting = CameraElementKt.applyCameraAndParenting(sceneElement, renderEnvironmentTimeQuant, renderEnvironmentTimeQuant.getTime());
        final Transform transformValueAtTime = sceneElementApplyCameraAndParenting.getTransform().valueAtTime(renderEnvironmentTimeQuant);
        final SceneElement sceneElementCopy$default = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, sceneElementApplyCameraAndParenting.getVisualEffects(), sceneElementApplyCameraAndParenting.getVisualEffectOrder(), null, null, null, null, null, null, false, null, null, false, null, null, -100663297, 127, null);
        Matrix matrix = new Matrix();
        float left = rectangle.getLeft() / s4Var2.g();
        float fMUb = ((-rectangle.getBottom()) + s4Var2.mUb()) / s4Var2.mUb();
        float width = rectangle.getWidth() / s4Var2.g();
        float height = rectangle.getHeight() / s4Var2.mUb();
        matrix.preTranslate(left, fMUb);
        matrix.preScale(width, height);
        Iterator<SceneElement> it2 = renderEnvironmentTimeQuant.getScene().getElements().iterator();
        int i5 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i5 = -1;
                break;
            } else if (it2.next().getId() == sceneElementCopy$default.getId()) {
                break;
            } else {
                i5++;
            }
        }
        int i7 = i5 + 1;
        boolean z2 = i7 < renderEnvironmentTimeQuant.getScene().getElements().size() && renderEnvironmentTimeQuant.getScene().getElements().get(i7).getClippingMask();
        boolean z3 = (sceneElementCopy$default.getType().getHasVisualEffects() && includesShaderEffects(sceneElementCopy$default.getVisualEffects())) || getHasEdgeDecorations(sceneElementCopy$default);
        if ((sceneElementCopy$default.getType().getHasBlendingMode() && sceneElementCopy$default.getBlendingMode() != BlendingMode.NORMAL) || z2 || (z3 && transformValueAtTime.getOpacity() < 1.0f)) {
            if (sceneElementCopy$default.getBlendingMode().getBlendEffect() != null) {
                f4 = 1.0f;
                listEmptyList = CollectionsKt.listOf(new VisualEffectRef(sceneElementCopy$default.getBlendingMode().getBlendEffect(), MapsKt.emptyMap(), 0, SetsKt.emptySet()));
            } else {
                f4 = 1.0f;
                listEmptyList = CollectionsKt.emptyList();
            }
            List list = listEmptyList;
            boolean z4 = !list.isEmpty() && transformValueAtTime.getOpacity() < f4;
            if (z4) {
                Rectangle rectangleBoundsInScene = SceneElementKt.boundsInScene(sceneElementCopy$default, renderEnvironment.getScene());
                float opacity = transformValueAtTime.getOpacity();
                List listEmptyList2 = CollectionsKt.emptyList();
                BlendingMode blendingMode = BlendingMode.NORMAL;
                i2 = i7;
                i3 = 10;
                renderEnvironment2 = renderEnvironmentTimeQuant;
                sceneElement2 = sceneElementCopy$default;
                transform2 = transformValueAtTime;
                s4.j.n(s4Var2, rectangleBoundsInScene, transform2, transform, listEmptyList2, blendingMode, opacity, null, null, 192, null);
                s4.j.n(s4Var, SceneElementKt.boundsInScene(sceneElement2, renderEnvironment.getScene()), transform2, transform, list, blendingMode, 0.0f, null, null, 224, null);
            } else {
                renderEnvironment2 = renderEnvironmentTimeQuant;
                i2 = i7;
                i3 = 10;
                sceneElement2 = sceneElementCopy$default;
                transform2 = transformValueAtTime;
                s4.j.n(s4Var, SceneElementKt.boundsInScene(sceneElement2, renderEnvironment.getScene()), transform2, transform, list, list.isEmpty() ? sceneElement2.getBlendingMode() : BlendingMode.NORMAL, transform2.getOpacity(), null, null, 192, null);
            }
            if (z3) {
                XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.aC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SceneElementRenderingKt.renderWithEffectsInternal$lambda$32$lambda$14(transform2);
                    }
                });
                Rectangle rectangleBoundsInScene2 = SceneElementKt.boundsInScene(sceneElement2, renderEnvironment.getScene());
                List<KeyableVisualEffectRef> visualEffectsInOrder = SceneElementKt.getVisualEffectsInOrder(sceneElement2);
                ArrayList arrayList = new ArrayList();
                for (Object obj : visualEffectsInOrder) {
                    KeyableVisualEffectRef keyableVisualEffectRef3 = (KeyableVisualEffectRef) obj;
                    if (!keyableVisualEffectRef3.getHidden() && (visualEffectVisualEffectById2 = VisualEffectKt.visualEffectById(keyableVisualEffectRef3.getId())) != null && (shaderGroups2 = visualEffectVisualEffectById2.getShaderGroups()) != null && !shaderGroups2.isEmpty()) {
                        Iterator<Map.Entry<Integer, ShaderGroup>> it3 = shaderGroups2.entrySet().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (!keyableVisualEffectRef3.getDisabledRenderGroups().contains(it3.next().getKey())) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, i3));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(VisualEffectKt.valueAtTime((KeyableVisualEffectRef) it4.next(), renderEnvironment2.getTime(), (sceneElement2.getEndTime() - sceneElement2.getStartTime()) / 1000.0f));
                }
                List<KeyableEdgeDecoration> edgeDecorations = SceneElementKt.getEdgeDecorations(sceneElement2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : edgeDecorations) {
                    KeyableEdgeDecoration keyableEdgeDecoration = (KeyableEdgeDecoration) obj2;
                    if (keyableEdgeDecoration.getEnabled() && (sceneElement2.getType() != SceneElementType.Shape || keyableEdgeDecoration.getType() != EdgeDecorationType.BORDER || keyableEdgeDecoration.getDirection() != EdgeDecorationDirection.CENTERED)) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, i3));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(EdgeDecorationKt.valueAtTime((KeyableEdgeDecoration) it5.next(), renderEnvironment2));
                }
                renderEnvironment3 = renderEnvironment2;
                s4.j.n(s4Var, rectangleBoundsInScene2, transform2, transform, arrayList2, null, 0.0f, arrayList4, null, 176, null);
                SceneElement sceneElement3 = sceneElement2;
                renderWithRepeat(SceneElement.copy$default(sceneElement3, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(sceneElement2.getTransform(), null, null, null, null, 0.0f, 0.0f, KeyableFloat.INSTANCE.getONE(), null, false, 447, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null), s4Var, renderEnvironment3, sceneSelection, rectangle);
                s4Var.iF(matrix);
                sceneElement3.getType().renderOutline(sceneElement3, s4Var, renderEnvironment3, sceneSelection, rectangle);
                sceneElement2 = sceneElement3;
                s4Var2 = s4Var;
            } else {
                renderEnvironment3 = renderEnvironment2;
                s4Var2 = s4Var;
                XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SceneElementRenderingKt.renderWithEffectsInternal$lambda$32$lambda$20(transform2, transform, renderEnvironment3, sceneElement2);
                    }
                });
                renderWithRepeat(sceneElement2, s4Var2, renderEnvironment3, sceneSelection, rectangle);
            }
            if (z2) {
                XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SceneElementRenderingKt.renderWithEffectsInternal$lambda$32$lambda$21();
                    }
                });
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = i2;
                while (intRef.element < renderEnvironment3.getScene().getElements().size() && renderEnvironment3.getScene().getElements().get(intRef.element).getClippingMask()) {
                    XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.qz
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SceneElementRenderingKt.renderWithEffectsInternal$lambda$32$lambda$22(intRef);
                        }
                    });
                    final Ref.IntRef intRef2 = intRef;
                    RenderEnvironment renderEnvironment4 = renderEnvironment3;
                    s4.j.n(s4Var2, null, null, null, null, BlendingMode.CLIPPING_MASK, 0.0f, null, null, 239, null);
                    renderWithEffects(renderEnvironment4.getScene().getElements().get(intRef2.element), s4Var2, renderEnvironment, sceneSelection, rectangle);
                    s4Var2.iF(matrix);
                    XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.Pl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SceneElementRenderingKt.renderWithEffectsInternal$lambda$32$lambda$23(intRef2);
                        }
                    });
                    intRef2.element++;
                    intRef = intRef2;
                    renderEnvironment3 = renderEnvironment4;
                }
                XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.Xo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PtsLKY.cCbrWEF;
                    }
                });
            }
            if (z4) {
                s4Var2.iF(matrix);
            }
            s4Var2.iF(matrix);
        } else if (z3) {
            XoT.C.Uo(sceneElementCopy$default, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.eO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SceneElementRenderingKt.renderWithEffectsInternal$lambda$32$lambda$25(transformValueAtTime, transform, renderEnvironmentTimeQuant, sceneElementCopy$default);
                }
            });
            Rectangle rectangleBoundsInScene3 = SceneElementKt.boundsInScene(sceneElementCopy$default, renderEnvironment.getScene());
            float opacity2 = transformValueAtTime.getOpacity();
            List<KeyableVisualEffectRef> visualEffectsInOrder2 = SceneElementKt.getVisualEffectsInOrder(sceneElementCopy$default);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : visualEffectsInOrder2) {
                KeyableVisualEffectRef keyableVisualEffectRef4 = (KeyableVisualEffectRef) obj3;
                if (!keyableVisualEffectRef4.getHidden() && (visualEffectVisualEffectById = VisualEffectKt.visualEffectById(keyableVisualEffectRef4.getId())) != null && (shaderGroups = visualEffectVisualEffectById.getShaderGroups()) != null && !shaderGroups.isEmpty()) {
                    Iterator<Map.Entry<Integer, ShaderGroup>> it6 = shaderGroups.entrySet().iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (!keyableVisualEffectRef4.getDisabledRenderGroups().contains(it6.next().getKey())) {
                                arrayList5.add(obj3);
                                break;
                            }
                        }
                    }
                }
            }
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
            Iterator it7 = arrayList5.iterator();
            while (it7.hasNext()) {
                arrayList6.add(VisualEffectKt.valueAtTime((KeyableVisualEffectRef) it7.next(), renderEnvironmentTimeQuant.getTime(), (sceneElementCopy$default.getEndTime() - sceneElementCopy$default.getStartTime()) / 1000.0f));
            }
            List<KeyableEdgeDecoration> edgeDecorations2 = SceneElementKt.getEdgeDecorations(sceneElementCopy$default);
            ArrayList arrayList7 = new ArrayList();
            for (Object obj4 : edgeDecorations2) {
                KeyableEdgeDecoration keyableEdgeDecoration2 = (KeyableEdgeDecoration) obj4;
                if (keyableEdgeDecoration2.getEnabled() && (sceneElementCopy$default.getType() != SceneElementType.Shape || keyableEdgeDecoration2.getType() != EdgeDecorationType.BORDER || keyableEdgeDecoration2.getDirection() != EdgeDecorationDirection.CENTERED)) {
                    arrayList7.add(obj4);
                }
            }
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator it8 = arrayList7.iterator();
            while (it8.hasNext()) {
                arrayList8.add(EdgeDecorationKt.valueAtTime((KeyableEdgeDecoration) it8.next(), renderEnvironmentTimeQuant));
            }
            RenderEnvironment renderEnvironment5 = renderEnvironmentTimeQuant;
            s4.j.n(s4Var, rectangleBoundsInScene3, transformValueAtTime, transform, arrayList6, null, opacity2, arrayList8, null, 144, null);
            renderWithRepeat(SceneElement.copy$default(sceneElementCopy$default, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(sceneElementCopy$default.getTransform(), null, null, null, null, 0.0f, 0.0f, KeyableFloat.INSTANCE.getONE(), null, false, 447, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null), s4Var, renderEnvironment5, sceneSelection, rectangle);
            s4Var.iF(matrix);
            sceneElementCopy$default.getType().renderOutline(sceneElementCopy$default, s4Var, renderEnvironment5, sceneSelection, rectangle);
            s4Var2 = s4Var;
        } else {
            XoT.C.Uo(sceneElementCopy$default, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SceneElementRenderingKt.renderWithEffectsInternal$lambda$32$lambda$31();
                }
            });
            renderWithRepeat(sceneElementCopy$default, s4Var2, renderEnvironmentTimeQuant, sceneSelection, rectangle);
        }
        s4Var2.qie(false);
        Unit unit = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithEffectsInternal$lambda$32$lambda$14(Transform transform) {
        return "renderWithEffects AND blendmode: tf=" + transform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithEffectsInternal$lambda$32$lambda$21() {
        return "renderWithEffects : clippingMaskRender";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithEffectsInternal$lambda$32$lambda$22(Ref.IntRef intRef) {
        return "renderWithEffects : clippingMaskRender LAYER (" + intRef.element + ") IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithEffectsInternal$lambda$32$lambda$23(Ref.IntRef intRef) {
        return "renderWithEffects : clippingMaskRender LAYER (" + intRef.element + ") OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithEffectsInternal$lambda$32$lambda$31() {
        return "renderWithEffects BASIC";
    }

    private static final void renderWithEffectsNoReverseInterpolation(final SceneElement sceneElement, WzY.s4 s4Var, final RenderEnvironment renderEnvironment, SceneSelection sceneSelection, Rectangle rectangle) {
        final RenderEnvironment renderEnvironment2;
        final SceneElement sceneElement2;
        if (renderEnvironment.getEditMode() == 2131362622 && sceneSelection.isElementDirectlySelected(sceneElement.getId())) {
            renderInternal(sceneElement, s4Var, renderEnvironment, sceneSelection, rectangle);
            return;
        }
        if (renderEnvironment.getEditMode() == 2131362619 && sceneSelection.isElementDirectlySelected(sceneElement.getId())) {
            return;
        }
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneElementRenderingKt.renderWithEffectsNoReverseInterpolation$lambda$8(sceneElement, renderEnvironment);
            }
        });
        long jNanoTime = System.nanoTime();
        Object obj = null;
        if (renderEnvironment.getUserPreviewMode().nr()) {
            Iterator<T> it = renderEnvironment.getActiveCamera().getVisualEffects().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) next;
                if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effects.motionblur4") && !keyableVisualEffectRef.getHidden()) {
                    obj = next;
                    break;
                }
            }
            obj = (KeyableVisualEffectRef) obj;
        }
        if (!sceneElement.getType().getHasVisualEffects() || (obj == null && !includesScriptEffects(sceneElement.getVisualEffects()))) {
            renderEnvironment2 = renderEnvironment;
            if (sceneElement.getParent() != null) {
                renderWithEffectsInternal(sceneElement, s4Var, renderEnvironment2, sceneSelection, LayerParentingKt.applyLayerParenting(sceneElement, renderEnvironment2.getScene(), renderEnvironment2.getPreviousFrameTime()).getTransform().valueAtTimeOneFrameEarlier(renderEnvironment2), rectangle);
                sceneElement2 = sceneElement;
            } else {
                sceneElement2 = sceneElement;
                renderWithEffectsInternal(sceneElement2, s4Var, renderEnvironment2, sceneSelection, sceneElement.getTransform().valueAtTimeOneFrameEarlier(renderEnvironment2), rectangle);
            }
        } else {
            float previousFrameTime = renderEnvironment.getPreviousFrameTime();
            int currentFrame = renderEnvironment.getOverrideFrame() - 1;
            int framesPerHundredSeconds = renderEnvironment.getFramesPerHundredSeconds();
            Scene scene = renderEnvironment.getScene();
            Transform transformValueAtTimeOneFrameEarlier = sceneElement.getTransform().valueAtTimeOneFrameEarlier(renderEnvironment);
            int editMode = renderEnvironment.getEditMode();
            RenderMode renderMode = renderEnvironment.getRenderMode();
            boolean zIsElementDirectlySelected = sceneSelection.isElementDirectlySelected(sceneElement.getId());
            ScriptGroup scriptGroup = ScriptGroup.BeforeRepeat;
            Transform transformValueAtTimeOneFrameEarlier2 = CameraElementKt.applyCameraAndParenting(ScriptExecutorKt.runScripts$default(sceneElement, previousFrameTime, currentFrame, framesPerHundredSeconds, scene, transformValueAtTimeOneFrameEarlier, 0.0f, renderMode, Integer.valueOf(editMode), zIsElementDirectlySelected, scriptGroup, 32, null), renderEnvironment, renderEnvironment.getPreviousFrameTime()).getTransform().valueAtTimeOneFrameEarlier(renderEnvironment);
            renderEnvironment2 = renderEnvironment;
            renderWithEffectsInternal(ScriptExecutorKt.runScripts(ScriptExecutorKt.runScripts$default(sceneElement, renderEnvironment.getTime(), renderEnvironment.getOverrideFrame(), renderEnvironment.getFramesPerHundredSeconds(), renderEnvironment.getScene(), transformValueAtTimeOneFrameEarlier2, 0.0f, renderEnvironment.getRenderMode(), Integer.valueOf(renderEnvironment.getEditMode()), sceneSelection.isElementDirectlySelected(sceneElement.getId()), scriptGroup, 32, null), renderEnvironment.getTime(), renderEnvironment.getOverrideFrame(), renderEnvironment.getFramesPerHundredSeconds(), renderEnvironment.getScene(), transformValueAtTimeOneFrameEarlier2, renderEnvironment.getPreviousFrameTime(), renderEnvironment.getRenderMode(), Integer.valueOf(renderEnvironment.getEditMode()), sceneSelection.isElementDirectlySelected(sceneElement.getId()), ScriptGroup.ShaderCoop), s4Var, renderEnvironment2, sceneSelection, transformValueAtTimeOneFrameEarlier2, rectangle);
            sceneElement2 = sceneElement;
        }
        final long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
        XoT.C.Uo(sceneElement2, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneElementRenderingKt.renderWithEffectsNoReverseInterpolation$lambda$10(sceneElement2, jNanoTime2, renderEnvironment2);
            }
        });
    }

    private static final void renderWithPostRepeatScripts(SceneElement sceneElement, WzY.s4 s4Var, RenderEnvironment renderEnvironment, SceneSelection sceneSelection, Rectangle rectangle) {
        if (sceneElement.getHidden()) {
            return;
        }
        float time = renderEnvironment.getTime();
        int currentFrame = renderEnvironment.getOverrideFrame();
        int framesPerHundredSeconds = renderEnvironment.getFramesPerHundredSeconds();
        Scene scene = renderEnvironment.getScene();
        Transform transformValueAtTime = sceneElement.getTransform().valueAtTime(renderEnvironment.getTime());
        float previousFrameTime = renderEnvironment.getPreviousFrameTime();
        int editMode = renderEnvironment.getEditMode();
        renderInternal(ScriptExecutorKt.runScripts(sceneElement, time, currentFrame, framesPerHundredSeconds, scene, transformValueAtTime, previousFrameTime, renderEnvironment.getRenderMode(), Integer.valueOf(editMode), sceneSelection.isElementDirectlySelected(sceneElement.getId()), ScriptGroup.AfterRepeat), s4Var, renderEnvironment, sceneSelection, rectangle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWithRepeat$lambda$34(float f3, SceneElement sceneElement, Vector2D vector2D, Vector2D vector2D2, float f4, float f5, boolean z2, SolidColor solidColor, SolidColor solidColor2, List list, WzY.s4 s4Var, RenderEnvironment renderEnvironment, SceneSelection sceneSelection, Rectangle rectangle, int i2, float f6, float f7) {
        float fMix = QuaternionKt.mix(1.0f, f3, f7);
        renderWithRepeat(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.multOpacityBy(TransformKt.rotatedBy(TransformKt.scaledBy$default(TransformKt.translatedBy(sceneElement.getTransform(), GeometryKt.plus(GeometryKt.times(vector2D, f6), GeometryKt.times(vector2D2, f7))), fMix, fMix, 0.0f, 0.0f, 12, null), f4 * f7), QuaternionKt.mix(1.0f, f5, f7)), (z2 && i2 % 2 == 1) ? sceneElement.getFillColor() : KeyableKt.keyable(GeometryKt.mix(solidColor, solidColor2, f7)), null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -193, 127, null), list, s4Var, ((double) Math.abs(0)) < 1.0E-4d ? renderEnvironment : new RenderEnvironmentTimeOffset(renderEnvironment, 0), sceneSelection, rectangle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWithRepeat$lambda$35(int i2, float f3, float f4, SceneElement sceneElement, Vector2D vector2D, Vector2D vector2D2, float f5, float f6, boolean z2, SolidColor solidColor, SolidColor solidColor2, List list, WzY.s4 s4Var, RenderEnvironment renderEnvironment, SceneSelection sceneSelection, Rectangle rectangle, int i3, float f7, float f8) {
        int i5 = i3 / i2;
        float f9 = i2;
        float fMix = QuaternionKt.mix(1.0f, f3, f8);
        renderWithRepeat(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.multOpacityBy(TransformKt.rotatedBy(TransformKt.scaledBy$default(TransformKt.translatedBy(sceneElement.getTransform(), GeometryKt.plus(new Vector2D((vector2D.getX() * ((i3 - (i5 * i2)) / f9)) + ((i5 % 2) * f4), vector2D.getY() * (i5 / f9)), GeometryKt.times(vector2D2, f8))), fMix, fMix, 0.0f, 0.0f, 12, null), f5 * f8), QuaternionKt.mix(1.0f, f6, f8)), (z2 && i3 % 2 == 1) ? sceneElement.getFillColor() : KeyableKt.keyable(GeometryKt.mix(solidColor, solidColor2, f8)), null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -193, 127, null), list, s4Var, ((double) Math.abs(0)) < 1.0E-4d ? renderEnvironment : new RenderEnvironmentTimeOffset(renderEnvironment, 0), sceneSelection, rectangle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWithRepeat$lambda$36(float f3, float f4, float f5, float f6, SceneElement sceneElement, Vector2D vector2D, float f7, float f8, boolean z2, SolidColor solidColor, SolidColor solidColor2, List list, WzY.s4 s4Var, RenderEnvironment renderEnvironment, SceneSelection sceneSelection, Rectangle rectangle, int i2, float f9, float f10) {
        float fMix = QuaternionKt.mix(1.0f, f3, f10);
        double d2 = ((double) f4) * 1.0d;
        double d4 = f5;
        double d5 = i2;
        renderWithRepeat(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.multOpacityBy(TransformKt.rotatedBy(TransformKt.scaledBy$default(TransformKt.translatedBy(sceneElement.getTransform(), GeometryKt.plus(new Vector2D(((float) SimplexNoiseKt.simplexNoise(d2, 0.31d + (24791.93781d * d4), 231571.93341d * d5)) * f6, ((float) SimplexNoiseKt.simplexNoise(d2, 0.25d + (d4 * 30452.37729d), d5 * 733243.74533d)) * f6), GeometryKt.times(vector2D, f10))), fMix, fMix, 0.0f, 0.0f, 12, null), f7 * f10), QuaternionKt.mix(1.0f, f8, f10)), (z2 && i2 % 2 == 1) ? sceneElement.getFillColor() : KeyableKt.keyable(GeometryKt.mix(solidColor, solidColor2, f10)), null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -193, 127, null), list, s4Var, ((double) Math.abs(0)) < 1.0E-4d ? renderEnvironment : new RenderEnvironmentTimeOffset(renderEnvironment, 0), sceneSelection, rectangle);
        return Unit.INSTANCE;
    }

    private static final boolean getHasEdgeDecorations(SceneElement sceneElement) {
        if (sceneElement.getType().getHasBorderAndShadow()) {
            List<KeyableEdgeDecoration> edgeDecorations = SceneElementKt.getEdgeDecorations(sceneElement);
            if (edgeDecorations == null || !edgeDecorations.isEmpty()) {
                Iterator<T> it = edgeDecorations.iterator();
                while (it.hasNext()) {
                    if (((KeyableEdgeDecoration) it.next()).getEnabled()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private static final boolean getNeedsSpecialCaseRender(KeyableVisualEffectRef keyableVisualEffectRef) {
        return StringsKt.startsWith$default(keyableVisualEffectRef.getId(), "com.alightcreative.effects.repeat", false, 2, (Object) null);
    }

    private static final boolean includesScriptEffects(Map<?, KeyableVisualEffectRef> map) {
        List<ACScript> scripts;
        Collection<KeyableVisualEffectRef> collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(((KeyableVisualEffectRef) it.next()).getId());
            if (visualEffectVisualEffectById != null && (scripts = visualEffectVisualEffectById.getScripts()) != null && (!scripts.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    private static final boolean includesShaderEffects(Map<?, KeyableVisualEffectRef> map) {
        Map<Integer, ShaderGroup> shaderGroups;
        Collection<KeyableVisualEffectRef> collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        for (KeyableVisualEffectRef keyableVisualEffectRef : collectionValues) {
            VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(keyableVisualEffectRef.getId());
            if (visualEffectVisualEffectById != null && (shaderGroups = visualEffectVisualEffectById.getShaderGroups()) != null && !shaderGroups.isEmpty()) {
                Iterator<Map.Entry<Integer, ShaderGroup>> it = shaderGroups.entrySet().iterator();
                while (it.hasNext()) {
                    if (!keyableVisualEffectRef.getDisabledRenderGroups().contains(it.next().getKey())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final Vector3D renderGeneralElementSelectionAndEditMode$posForTime(SceneElement sceneElement, RenderEnvironment renderEnvironment, float f3) {
        return GeometryKt.plus((Vector3D) KeyableKt.valueAtTime(CameraElementKt.applyCameraAndParenting(sceneElement, renderEnvironment.getScene(), f3, renderEnvironment.getUserPreviewMode()).getTransform().getLocation(), f3), (Vector2D) KeyableKt.valueAtTime(sceneElement.getTransform().getPivot(), f3));
    }

    private static final Vector3D renderGeneralElementSelectionAndEditMode$posForTime$3(SceneElement sceneElement, RenderEnvironment renderEnvironment, float f3) {
        SceneElement sceneElementApplyCameraAndParenting = CameraElementKt.applyCameraAndParenting(sceneElement, renderEnvironment.getScene(), f3, renderEnvironment.getUserPreviewMode());
        return GeometryKt.plus((Vector3D) KeyableKt.valueAtTime(sceneElementApplyCameraAndParenting.getTransform().getLocation(), f3), (Vector2D) KeyableKt.valueAtTime(sceneElementApplyCameraAndParenting.getTransform().getPivot(), f3));
    }

    private static final void renderInternal(SceneElement sceneElement, WzY.s4 s4Var, RenderEnvironment renderEnvironment, SceneSelection sceneSelection, Rectangle rectangle) {
        sceneElement.getType().render(sceneElement, s4Var, renderEnvironment, sceneSelection, rectangle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithEffectsInternal$lambda$32$lambda$20(Transform transform, Transform transform2, RenderEnvironment renderEnvironment, SceneElement sceneElement) {
        return "renderWithEffects ONLY blendmode: tf=" + transform + " prevFrameTf=" + transform2 + " env.t=" + renderEnvironment.getTime() + " env.pt=" + renderEnvironment.getPreviousFrameTime() + " bounds=" + SceneElementKt.boundsInScene(sceneElement, renderEnvironment.getScene()) + " tf.location=" + transform.getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithEffectsInternal$lambda$32$lambda$25(Transform transform, Transform transform2, RenderEnvironment renderEnvironment, SceneElement sceneElement) {
        return wDgKoYAES.CMNBmJlZBT + transform + " prevFrameTf=" + transform2 + " env.t=" + renderEnvironment.getTime() + " env.pt=" + renderEnvironment.getPreviousFrameTime() + " bounds=" + SceneElementKt.boundsInScene(sceneElement, renderEnvironment.getScene()) + " tf.location=" + transform.getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithEffectsNoReverseInterpolation$lambda$10(SceneElement sceneElement, long j2, RenderEnvironment renderEnvironment) {
        return "End Render " + sceneElement.getType() + ":" + sceneElement.getId() + " (" + sceneElement.getLabel() + ") ELAPSED=" + j2 + "ms [F=" + renderEnvironment.getOverrideFrame() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderWithEffectsNoReverseInterpolation$lambda$8(SceneElement sceneElement, RenderEnvironment renderEnvironment) {
        return "Begin Render " + sceneElement.getType() + ":" + sceneElement.getId() + " (" + sceneElement.getLabel() + ") [F=" + renderEnvironment.getOverrideFrame() + "]";
    }

    private static final SceneElement reverseInterpolateFirstFrame(SceneElement sceneElement, float f3) {
        return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.reverseInterpolateFirstFrame(sceneElement.getTransform(), f3), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final void renderWithRepeat(final SceneElement sceneElement, List<KeyableVisualEffectRef> list, final WzY.s4 s4Var, final RenderEnvironment renderEnvironment, final SceneSelection sceneSelection, final Rectangle rectangle) {
        KeyableVisualEffectRef keyableVisualEffectRef;
        final float fFloatValue;
        SolidColor white;
        Vector2D zero;
        Keyable<Vector2D> vec2DValue;
        Keyable<SolidColor> colorValue;
        Keyable<Float> floatValue;
        Keyable<Float> floatValue2;
        Keyable<Float> floatValue3;
        Keyable<Float> floatValue4;
        Keyable<Float> floatValue5;
        Keyable<Float> floatValue6;
        Keyable<Float> floatValue7;
        Keyable<Float> floatValue8;
        Vector2D zero2;
        boolean booleanValue;
        final float f3;
        SolidColor white2;
        Vector2D zero3;
        Keyable<Vector2D> vec2DValue2;
        Keyable<SolidColor> colorValue2;
        Keyable<Float> floatValue9;
        Keyable<Float> floatValue10;
        Keyable<Float> floatValue11;
        Keyable<Float> floatValue12;
        Keyable<Float> floatValue13;
        Keyable<Vector2D> vec2DValue3;
        Keyable<Float> floatValue14;
        Vector2D zero4;
        SolidColor white3;
        Vector2D zero5;
        Keyable<Vector2D> vec2DValue4;
        Keyable<SolidColor> colorValue3;
        Keyable<Float> floatValue15;
        Keyable<Float> floatValue16;
        Keyable<Float> floatValue17;
        Keyable<Float> floatValue18;
        Keyable<Vector2D> vec2DValue5;
        Keyable<Float> floatValue19;
        KeyableVisualEffectRef keyableVisualEffectRef2;
        final float f4;
        SolidColor white4;
        Vector2D zero6;
        Keyable<Vector2D> vec2DValue6;
        Keyable<SolidColor> colorValue4;
        Keyable<Float> floatValue20;
        Keyable<Float> floatValue21;
        Keyable<Float> floatValue22;
        Keyable<Float> floatValue23;
        Keyable<Float> floatValue24;
        Keyable<Float> floatValue25;
        Keyable<Float> floatValue26;
        Keyable<Float> floatValue27;
        SceneElement sceneElement2;
        List list2;
        float f5;
        int i2;
        float f6;
        int i3;
        int i5;
        List list3;
        Keyable<Float> floatValue28;
        Keyable<Float> floatValue29;
        Keyable<Float> floatValue30;
        Vector2D zero7;
        int i7;
        Vector2D vector2D;
        int i8;
        float f7;
        float f8;
        float f9;
        float f10;
        List list4;
        float f11;
        Vector2D vector2D2;
        Keyable<Float> floatValue31;
        Keyable<Vector2D> vec2DValue7;
        Keyable<Float> floatValue32;
        Keyable<Float> floatValue33;
        Keyable<Float> floatValue34;
        Keyable<Float> floatValue35;
        final List list5;
        final float f12;
        final boolean booleanValue2;
        SolidColor white5;
        Vector2D zero8;
        Keyable<Vector2D> vec2DValue8;
        Keyable<SolidColor> colorValue5;
        Keyable<Float> floatValue36;
        Keyable<Float> floatValue37;
        Keyable<Float> floatValue38;
        Keyable<Float> floatValue39;
        Keyable<Float> floatValue40;
        Keyable<Float> floatValue41;
        Keyable<Float> floatValue42;
        Keyable<Float> floatValue43;
        Keyable<Float> floatValue44;
        Keyable<Float> floatValue45;
        final RenderEnvironment renderEnvironment2 = renderEnvironment;
        if (list.isEmpty()) {
            renderWithPostRepeatScripts(CameraElementKt.bakeCamera(LayerParentingKt.applyLayerParenting(sceneElement, renderEnvironment2.getScene(), renderEnvironment2.getTime()), renderEnvironment2, renderEnvironment2.getTime()), s4Var, renderEnvironment2, sceneSelection, rectangle);
        }
        KeyableVisualEffectRef keyableVisualEffectRef3 = (KeyableVisualEffectRef) CollectionsKt.first((List) list);
        final List listDrop = CollectionsKt.drop(list, 1);
        if (keyableVisualEffectRef3.getHidden()) {
            renderWithRepeat(sceneElement, listDrop, s4Var, renderEnvironment2, sceneSelection, rectangle);
            return;
        }
        String id = keyableVisualEffectRef3.getId();
        float fFloatValue2 = 0.0f;
        switch (id.hashCode()) {
            case -464936364:
                if (id.equals("com.alightcreative.effects.repeat.scatter")) {
                    KeyableUserParameterValue keyableUserParameterValue = keyableVisualEffectRef3.getParameters().get(JavetError.PARAMETER_COUNT);
                    int iRoundToInt = MathKt.roundToInt((keyableUserParameterValue == null || (floatValue8 = keyableUserParameterValue.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue8, renderEnvironment2)).floatValue());
                    KeyableUserParameterValue keyableUserParameterValue2 = keyableVisualEffectRef3.getParameters().get("radius");
                    final float fFloatValue3 = (keyableUserParameterValue2 == null || (floatValue7 = keyableUserParameterValue2.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue7, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue3 = keyableVisualEffectRef3.getParameters().get("evolution");
                    final float fFloatValue4 = (keyableUserParameterValue3 == null || (floatValue6 = keyableUserParameterValue3.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue6, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue4 = keyableVisualEffectRef3.getParameters().get("scatterSeed");
                    float fFloatValue5 = (keyableUserParameterValue4 == null || (floatValue5 = keyableUserParameterValue4.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue5, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue5 = keyableVisualEffectRef3.getParameters().get("angle");
                    final float fFloatValue6 = (keyableUserParameterValue5 == null || (floatValue4 = keyableUserParameterValue5.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue4, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue6 = keyableVisualEffectRef3.getParameters().get("scale");
                    if (keyableUserParameterValue6 == null || (floatValue3 = keyableUserParameterValue6.getFloatValue()) == null) {
                        keyableVisualEffectRef = keyableVisualEffectRef3;
                        fFloatValue = 1.0f;
                    } else {
                        keyableVisualEffectRef = keyableVisualEffectRef3;
                        fFloatValue = ((Number) KeyableKt.valueAtTime(floatValue3, renderEnvironment2)).floatValue();
                    }
                    KeyableUserParameterValue keyableUserParameterValue7 = keyableVisualEffectRef.getParameters().get("alpha");
                    float fFloatValue7 = (keyableUserParameterValue7 == null || (floatValue2 = keyableUserParameterValue7.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue2, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue8 = keyableVisualEffectRef.getParameters().get("blend");
                    if (keyableUserParameterValue8 != null && (floatValue = keyableUserParameterValue8.getFloatValue()) != null) {
                        fFloatValue2 = ((Number) KeyableKt.valueAtTime(floatValue, renderEnvironment2)).floatValue();
                    }
                    float f13 = fFloatValue2;
                    KeyableUserParameterValue keyableUserParameterValue9 = keyableVisualEffectRef.getParameters().get("colorAltCopies");
                    final boolean booleanValue3 = keyableUserParameterValue9 != null ? keyableUserParameterValue9.getBooleanValue() : false;
                    KeyableUserParameterValue keyableUserParameterValue10 = keyableVisualEffectRef.getParameters().get("fillColor");
                    if (keyableUserParameterValue10 == null || (colorValue = keyableUserParameterValue10.getColorValue()) == null || (white = (SolidColor) KeyableKt.valueAtTime(colorValue, renderEnvironment2)) == null) {
                        white = SolidColor.INSTANCE.getWHITE();
                    }
                    KeyableUserParameterValue keyableUserParameterValue11 = keyableVisualEffectRef.getParameters().get("offset");
                    if (keyableUserParameterValue11 == null || (vec2DValue = keyableUserParameterValue11.getVec2DValue()) == null || (zero = (Vector2D) KeyableKt.valueAtTime(vec2DValue, renderEnvironment2)) == null) {
                        zero = Vector2D.INSTANCE.getZERO();
                    }
                    ColorRange colorRangeComputeRepeatBlend = RepeatEasingKt.computeRepeatBlend(f13, (SolidColor) KeyableKt.valueAtTime(sceneElement.getFillColor(), renderEnvironment2), white);
                    final SolidColor startColor = colorRangeComputeRepeatBlend.getStartColor();
                    final SolidColor endColor = colorRangeComputeRepeatBlend.getEndColor();
                    final float f14 = fFloatValue5;
                    final Vector2D vector2D3 = zero;
                    final float f15 = fFloatValue7;
                    RepeatEasingKt.repeatWithEasing(iRoundToInt, keyableVisualEffectRef, renderEnvironment2, new Function3() { // from class: com.alightcreative.app.motion.scene.rendering.Wre
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return SceneElementRenderingKt.renderWithRepeat$lambda$36(fFloatValue, fFloatValue4, f14, fFloatValue3, sceneElement, vector2D3, fFloatValue6, f15, booleanValue3, startColor, endColor, listDrop, s4Var, renderEnvironment2, sceneSelection, rectangle, ((Integer) obj).intValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    });
                    break;
                }
                break;
            case -356890768:
                if (id.equals("com.alightcreative.effects.repeat.grid")) {
                    KeyableUserParameterValue keyableUserParameterValue12 = keyableVisualEffectRef3.getParameters().get(JavetError.PARAMETER_COUNT);
                    final int iRoundToInt2 = MathKt.roundToInt((keyableUserParameterValue12 == null || (floatValue14 = keyableUserParameterValue12.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue14, renderEnvironment2)).floatValue());
                    KeyableUserParameterValue keyableUserParameterValue13 = keyableVisualEffectRef3.getParameters().get("position");
                    if (keyableUserParameterValue13 == null || (vec2DValue3 = keyableUserParameterValue13.getVec2DValue()) == null || (zero2 = (Vector2D) KeyableKt.valueAtTime(vec2DValue3, renderEnvironment2)) == null) {
                        zero2 = Vector2D.INSTANCE.getZERO();
                    }
                    final Vector2D vector2D4 = zero2;
                    KeyableUserParameterValue keyableUserParameterValue14 = keyableVisualEffectRef3.getParameters().get("stagger");
                    float fFloatValue8 = (keyableUserParameterValue14 == null || (floatValue13 = keyableUserParameterValue14.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue13, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue15 = keyableVisualEffectRef3.getParameters().get("angle");
                    final float fFloatValue9 = (keyableUserParameterValue15 == null || (floatValue12 = keyableUserParameterValue15.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue12, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue16 = keyableVisualEffectRef3.getParameters().get("scale");
                    if (keyableUserParameterValue16 == null || (floatValue11 = keyableUserParameterValue16.getFloatValue()) == null) {
                        booleanValue = false;
                        f3 = 1.0f;
                    } else {
                        float fFloatValue10 = ((Number) KeyableKt.valueAtTime(floatValue11, renderEnvironment2)).floatValue();
                        booleanValue = false;
                        f3 = fFloatValue10;
                    }
                    KeyableUserParameterValue keyableUserParameterValue17 = keyableVisualEffectRef3.getParameters().get("alpha");
                    float fFloatValue11 = (keyableUserParameterValue17 == null || (floatValue10 = keyableUserParameterValue17.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue10, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue18 = keyableVisualEffectRef3.getParameters().get("blend");
                    if (keyableUserParameterValue18 != null && (floatValue9 = keyableUserParameterValue18.getFloatValue()) != null) {
                        fFloatValue2 = ((Number) KeyableKt.valueAtTime(floatValue9, renderEnvironment2)).floatValue();
                    }
                    float f16 = fFloatValue2;
                    KeyableUserParameterValue keyableUserParameterValue19 = keyableVisualEffectRef3.getParameters().get("colorAltCopies");
                    if (keyableUserParameterValue19 != null) {
                        booleanValue = keyableUserParameterValue19.getBooleanValue();
                    }
                    final boolean z2 = booleanValue;
                    KeyableUserParameterValue keyableUserParameterValue20 = keyableVisualEffectRef3.getParameters().get("fillColor");
                    if (keyableUserParameterValue20 == null || (colorValue2 = keyableUserParameterValue20.getColorValue()) == null || (white2 = (SolidColor) KeyableKt.valueAtTime(colorValue2, renderEnvironment2)) == null) {
                        white2 = SolidColor.INSTANCE.getWHITE();
                    }
                    KeyableUserParameterValue keyableUserParameterValue21 = keyableVisualEffectRef3.getParameters().get("offset");
                    if (keyableUserParameterValue21 == null || (vec2DValue2 = keyableUserParameterValue21.getVec2DValue()) == null || (zero3 = (Vector2D) KeyableKt.valueAtTime(vec2DValue2, renderEnvironment2)) == null) {
                        zero3 = Vector2D.INSTANCE.getZERO();
                    }
                    ColorRange colorRangeComputeRepeatBlend2 = RepeatEasingKt.computeRepeatBlend(f16, (SolidColor) KeyableKt.valueAtTime(sceneElement.getFillColor(), renderEnvironment2), white2);
                    final SolidColor startColor2 = colorRangeComputeRepeatBlend2.getStartColor();
                    final SolidColor endColor2 = colorRangeComputeRepeatBlend2.getEndColor();
                    final float f17 = fFloatValue8;
                    final Vector2D vector2D5 = zero3;
                    final float f18 = fFloatValue11;
                    RepeatEasingKt.repeatWithEasing(iRoundToInt2 * iRoundToInt2, keyableVisualEffectRef3, renderEnvironment2, new Function3() { // from class: com.alightcreative.app.motion.scene.rendering.I28
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return SceneElementRenderingKt.renderWithRepeat$lambda$35(iRoundToInt2, f3, f17, sceneElement, vector2D4, vector2D5, fFloatValue9, f18, z2, startColor2, endColor2, listDrop, s4Var, renderEnvironment2, sceneSelection, rectangle, ((Integer) obj).intValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    });
                    break;
                }
                break;
            case -356750306:
                if (id.equals("com.alightcreative.effects.repeat.line")) {
                    KeyableUserParameterValue keyableUserParameterValue22 = keyableVisualEffectRef3.getParameters().get(JavetError.PARAMETER_COUNT);
                    int iRoundToInt3 = MathKt.roundToInt((keyableUserParameterValue22 == null || (floatValue19 = keyableUserParameterValue22.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue19, renderEnvironment2)).floatValue());
                    KeyableUserParameterValue keyableUserParameterValue23 = keyableVisualEffectRef3.getParameters().get("position");
                    if (keyableUserParameterValue23 == null || (vec2DValue5 = keyableUserParameterValue23.getVec2DValue()) == null || (zero4 = (Vector2D) KeyableKt.valueAtTime(vec2DValue5, renderEnvironment2)) == null) {
                        zero4 = Vector2D.INSTANCE.getZERO();
                    }
                    KeyableUserParameterValue keyableUserParameterValue24 = keyableVisualEffectRef3.getParameters().get("angle");
                    final float fFloatValue12 = (keyableUserParameterValue24 == null || (floatValue18 = keyableUserParameterValue24.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue18, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue25 = keyableVisualEffectRef3.getParameters().get("scale");
                    float fFloatValue13 = (keyableUserParameterValue25 == null || (floatValue17 = keyableUserParameterValue25.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue17, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue26 = keyableVisualEffectRef3.getParameters().get("alpha");
                    final float fFloatValue14 = (keyableUserParameterValue26 == null || (floatValue16 = keyableUserParameterValue26.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue16, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue27 = keyableVisualEffectRef3.getParameters().get("blend");
                    if (keyableUserParameterValue27 != null && (floatValue15 = keyableUserParameterValue27.getFloatValue()) != null) {
                        fFloatValue2 = ((Number) KeyableKt.valueAtTime(floatValue15, renderEnvironment2)).floatValue();
                    }
                    float f19 = fFloatValue2;
                    KeyableUserParameterValue keyableUserParameterValue28 = keyableVisualEffectRef3.getParameters().get("colorAltCopies");
                    final float f20 = fFloatValue13;
                    final boolean booleanValue4 = keyableUserParameterValue28 != null ? keyableUserParameterValue28.getBooleanValue() : false;
                    KeyableUserParameterValue keyableUserParameterValue29 = keyableVisualEffectRef3.getParameters().get("fillColor");
                    if (keyableUserParameterValue29 == null || (colorValue3 = keyableUserParameterValue29.getColorValue()) == null || (white3 = (SolidColor) KeyableKt.valueAtTime(colorValue3, renderEnvironment2)) == null) {
                        white3 = SolidColor.INSTANCE.getWHITE();
                    }
                    KeyableUserParameterValue keyableUserParameterValue30 = keyableVisualEffectRef3.getParameters().get("offset");
                    if (keyableUserParameterValue30 == null || (vec2DValue4 = keyableUserParameterValue30.getVec2DValue()) == null || (zero5 = (Vector2D) KeyableKt.valueAtTime(vec2DValue4, renderEnvironment2)) == null) {
                        zero5 = Vector2D.INSTANCE.getZERO();
                    }
                    ColorRange colorRangeComputeRepeatBlend3 = RepeatEasingKt.computeRepeatBlend(f19, (SolidColor) KeyableKt.valueAtTime(sceneElement.getFillColor(), renderEnvironment2), white3);
                    final Vector2D vector2D6 = zero5;
                    final SolidColor startColor3 = colorRangeComputeRepeatBlend3.getStartColor();
                    final SolidColor endColor3 = colorRangeComputeRepeatBlend3.getEndColor();
                    final Vector2D vector2D7 = zero4;
                    RepeatEasingKt.repeatWithEasing(iRoundToInt3, keyableVisualEffectRef3, renderEnvironment, new Function3() { // from class: com.alightcreative.app.motion.scene.rendering.Ml
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return SceneElementRenderingKt.renderWithRepeat$lambda$34(f20, sceneElement, vector2D7, vector2D6, fFloatValue12, fFloatValue14, booleanValue4, startColor3, endColor3, listDrop, s4Var, renderEnvironment, sceneSelection, rectangle, ((Integer) obj).intValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    });
                    break;
                }
                break;
            case -356638641:
                if (id.equals("com.alightcreative.effects.repeat.path")) {
                    KeyableUserParameterValue keyableUserParameterValue31 = keyableVisualEffectRef3.getParameters().get(JavetError.PARAMETER_COUNT);
                    int iRoundToInt4 = MathKt.roundToInt((keyableUserParameterValue31 == null || (floatValue27 = keyableUserParameterValue31.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue27, renderEnvironment2)).floatValue());
                    KeyableUserParameterValue keyableUserParameterValue32 = keyableVisualEffectRef3.getParameters().get("startPos");
                    float fFloatValue15 = (keyableUserParameterValue32 == null || (floatValue26 = keyableUserParameterValue32.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue26, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue33 = keyableVisualEffectRef3.getParameters().get("pathPhase");
                    final float fFloatValue16 = (keyableUserParameterValue33 == null || (floatValue25 = keyableUserParameterValue33.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue25, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue34 = keyableVisualEffectRef3.getParameters().get("endPos");
                    float fFloatValue17 = (keyableUserParameterValue34 == null || (floatValue24 = keyableUserParameterValue34.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue24, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue35 = keyableVisualEffectRef3.getParameters().get("angle");
                    final float fFloatValue18 = (keyableUserParameterValue35 == null || (floatValue23 = keyableUserParameterValue35.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue23, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue36 = keyableVisualEffectRef3.getParameters().get("scale");
                    if (keyableUserParameterValue36 == null || (floatValue22 = keyableUserParameterValue36.getFloatValue()) == null) {
                        keyableVisualEffectRef2 = keyableVisualEffectRef3;
                        f4 = 1.0f;
                    } else {
                        float fFloatValue19 = ((Number) KeyableKt.valueAtTime(floatValue22, renderEnvironment2)).floatValue();
                        keyableVisualEffectRef2 = keyableVisualEffectRef3;
                        f4 = fFloatValue19;
                    }
                    KeyableUserParameterValue keyableUserParameterValue37 = keyableVisualEffectRef2.getParameters().get("alpha");
                    final float fFloatValue20 = (keyableUserParameterValue37 == null || (floatValue21 = keyableUserParameterValue37.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue21, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue38 = keyableVisualEffectRef2.getParameters().get("blend");
                    if (keyableUserParameterValue38 != null && (floatValue20 = keyableUserParameterValue38.getFloatValue()) != null) {
                        fFloatValue2 = ((Number) KeyableKt.valueAtTime(floatValue20, renderEnvironment2)).floatValue();
                    }
                    float f21 = fFloatValue2;
                    KeyableUserParameterValue keyableUserParameterValue39 = keyableVisualEffectRef2.getParameters().get("colorAltCopies");
                    final boolean booleanValue5 = keyableUserParameterValue39 != null ? keyableUserParameterValue39.getBooleanValue() : false;
                    KeyableUserParameterValue keyableUserParameterValue40 = keyableVisualEffectRef2.getParameters().get("tangent");
                    final boolean booleanValue6 = keyableUserParameterValue40 != null ? keyableUserParameterValue40.getBooleanValue() : false;
                    KeyableUserParameterValue keyableUserParameterValue41 = keyableVisualEffectRef2.getParameters().get("fillColor");
                    if (keyableUserParameterValue41 == null || (colorValue4 = keyableUserParameterValue41.getColorValue()) == null || (white4 = (SolidColor) KeyableKt.valueAtTime(colorValue4, renderEnvironment2)) == null) {
                        white4 = SolidColor.INSTANCE.getWHITE();
                    }
                    KeyableUserParameterValue keyableUserParameterValue42 = keyableVisualEffectRef2.getParameters().get("offset");
                    if (keyableUserParameterValue42 == null || (vec2DValue6 = keyableUserParameterValue42.getVec2DValue()) == null || (zero6 = (Vector2D) KeyableKt.valueAtTime(vec2DValue6, renderEnvironment2)) == null) {
                        zero6 = Vector2D.INSTANCE.getZERO();
                    }
                    final Vector2D vector2D8 = zero6;
                    ColorRange colorRangeComputeRepeatBlend4 = RepeatEasingKt.computeRepeatBlend(f21, (SolidColor) KeyableKt.valueAtTime(sceneElement.getFillColor(), renderEnvironment2), white4);
                    final SolidColor startColor4 = colorRangeComputeRepeatBlend4.getStartColor();
                    final SolidColor endColor4 = colorRangeComputeRepeatBlend4.getEndColor();
                    final Transform transformValueAtTime = sceneElement.getTransform().valueAtTime(renderEnvironment2);
                    Iterator<SceneElement> it = renderEnvironment2.getScene().getElements().iterator();
                    int i9 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i9 = -1;
                        } else if (it.next().getId() != sceneElement.getId()) {
                            i9++;
                        }
                    }
                    if (i9 >= 1) {
                        SceneElement sceneElement3 = renderEnvironment2.getScene().getElements().get(i9 - 1);
                        Path pathT = CubicBSplineKt.toPath(LiveShapeScriptKt.getShapeOutline(sceneElement3, renderEnvironment2.getTime())).t();
                        TransformKt.transform(pathT, sceneElement3.getTransform().valueAtTime(renderEnvironment2));
                        final PathMeasure pathMeasure = new PathMeasure(pathT, false);
                        KeyableVisualEffectRef keyableVisualEffectRef4 = keyableVisualEffectRef2;
                        final float length = pathMeasure.getLength();
                        final float f22 = (fFloatValue17 - fFloatValue15) * length;
                        final float f23 = fFloatValue15 * length;
                        final float[] fArr = new float[2];
                        final float[] fArr2 = new float[2];
                        RepeatEasingKt.repeatWithEasing(iRoundToInt4, keyableVisualEffectRef4, renderEnvironment, new Function3() { // from class: com.alightcreative.app.motion.scene.rendering.CN3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                return SceneElementRenderingKt.renderWithRepeat$lambda$38(f4, pathMeasure, f23, f22, fFloatValue16, length, fArr, fArr2, booleanValue6, sceneElement, transformValueAtTime, vector2D8, fFloatValue18, fFloatValue20, booleanValue5, startColor4, endColor4, listDrop, s4Var, renderEnvironment, sceneSelection, rectangle, ((Integer) obj).intValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                            }
                        });
                    } else {
                        renderWithRepeat(sceneElement, listDrop, s4Var, renderEnvironment2, sceneSelection, rectangle);
                    }
                    break;
                }
                break;
            case 554228714:
                float f24 = 1.0f;
                if (id.equals("com.alightcreative.effects.repeat.echokf")) {
                    KeyableUserParameterValue keyableUserParameterValue43 = keyableVisualEffectRef3.getParameters().get(JavetError.PARAMETER_COUNT);
                    int iRoundToInt5 = MathKt.roundToInt((keyableUserParameterValue43 == null || (floatValue30 = keyableUserParameterValue43.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue30, renderEnvironment2)).floatValue());
                    KeyableUserParameterValue keyableUserParameterValue44 = keyableVisualEffectRef3.getParameters().get("seconds");
                    float fFloatValue21 = (keyableUserParameterValue44 == null || (floatValue29 = keyableUserParameterValue44.getFloatValue()) == null) ? 0.5f : ((Number) KeyableKt.valueAtTime(floatValue29, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue45 = keyableVisualEffectRef3.getParameters().get("alpha");
                    float fFloatValue22 = (keyableUserParameterValue45 == null || (floatValue28 = keyableUserParameterValue45.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue28, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue46 = keyableVisualEffectRef3.getParameters().get("mode");
                    int intValue = keyableUserParameterValue46 != null ? keyableUserParameterValue46.getIntValue() : 1;
                    float endTime = 1.0f / ((((sceneElement.getEndTime() - sceneElement.getStartTime()) / 1000.0f) * renderEnvironment2.getFramesPerHundredSeconds()) / 100);
                    if (intValue == 0) {
                        renderWithRepeat(sceneElement, listDrop, s4Var, renderEnvironment2, sceneSelection, rectangle);
                        sceneElement2 = sceneElement;
                        list2 = listDrop;
                    } else {
                        sceneElement2 = sceneElement;
                        list2 = listDrop;
                    }
                    int i10 = 0;
                    while (i10 < iRoundToInt5) {
                        float f25 = (intValue == 0 ? (iRoundToInt5 - 1) - i10 : i10) / iRoundToInt5;
                        float fMix = QuaternionKt.mix(fFloatValue22, f24, f25);
                        int iSceneTimeSeconds = (int) ((SceneElementKt.sceneTimeSeconds(sceneElement2, renderEnvironment.getTime()) - ((double) ((f24 - f25) * fFloatValue21))) * ((double) 1000));
                        float fFractionalTime = SceneElementKt.fractionalTime(sceneElement2, iSceneTimeSeconds);
                        RenderEnvironmentAdj renderEnvironmentAdj = new RenderEnvironmentAdj(renderEnvironment, fFractionalTime, fFractionalTime - endTime, renderEnvironment.getOverrideDurationInSeconds(), TimeKt.frameNumberFromTime(iSceneTimeSeconds, renderEnvironment.getFramesPerHundredSeconds()));
                        if (fMix <= 0.0f) {
                            f5 = f24;
                            i2 = iRoundToInt5;
                            f6 = fFloatValue22;
                            i3 = intValue;
                            i5 = i10;
                            list3 = list2;
                        } else if (fMix < f24) {
                            f5 = f24;
                            i2 = iRoundToInt5;
                            i5 = i10;
                            i3 = intValue;
                            f6 = fFloatValue22;
                            List list6 = list2;
                            renderWithRepeat(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.multOpacityBy(sceneElement2.getTransform(), fMix), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null), list6, s4Var, renderEnvironmentAdj, sceneSelection, rectangle);
                            list3 = list6;
                        } else {
                            f5 = f24;
                            i2 = iRoundToInt5;
                            f6 = fFloatValue22;
                            i3 = intValue;
                            i5 = i10;
                            list3 = list2;
                            renderWithRepeat(sceneElement2, list3, s4Var, renderEnvironmentAdj, sceneSelection, rectangle);
                        }
                        i10 = i5 + 1;
                        sceneElement2 = sceneElement;
                        list2 = list3;
                        fFloatValue22 = f6;
                        iRoundToInt5 = i2;
                        f24 = f5;
                        intValue = i3;
                    }
                    List list7 = list2;
                    if (intValue == 1) {
                        renderWithRepeat(sceneElement, list7, s4Var, renderEnvironment, sceneSelection, rectangle);
                    }
                    break;
                }
                break;
            case 698322820:
                SceneElement sceneElement4 = sceneElement;
                List list8 = listDrop;
                if (id.equals("com.alightcreative.effects.repeat")) {
                    KeyableUserParameterValue keyableUserParameterValue47 = keyableVisualEffectRef3.getParameters().get(JavetError.PARAMETER_COUNT);
                    int iRoundToInt6 = MathKt.roundToInt((keyableUserParameterValue47 == null || (floatValue35 = keyableUserParameterValue47.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue35, renderEnvironment2)).floatValue());
                    KeyableUserParameterValue keyableUserParameterValue48 = keyableVisualEffectRef3.getParameters().get("time");
                    float fFloatValue23 = (keyableUserParameterValue48 == null || (floatValue34 = keyableUserParameterValue48.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue34, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue49 = keyableVisualEffectRef3.getParameters().get("angle");
                    float fFloatValue24 = (keyableUserParameterValue49 == null || (floatValue33 = keyableUserParameterValue49.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue33, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue50 = keyableVisualEffectRef3.getParameters().get("scale");
                    float fFloatValue25 = (keyableUserParameterValue50 == null || (floatValue32 = keyableUserParameterValue50.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue32, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue51 = keyableVisualEffectRef3.getParameters().get("offset");
                    if (keyableUserParameterValue51 == null || (vec2DValue7 = keyableUserParameterValue51.getVec2DValue()) == null || (zero7 = (Vector2D) KeyableKt.valueAtTime(vec2DValue7, renderEnvironment2)) == null) {
                        zero7 = Vector2D.INSTANCE.getZERO();
                    }
                    Vector2D vector2D9 = zero7;
                    KeyableUserParameterValue keyableUserParameterValue52 = keyableVisualEffectRef3.getParameters().get("alpha");
                    float fFloatValue26 = (keyableUserParameterValue52 == null || (floatValue31 = keyableUserParameterValue52.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue31, renderEnvironment2)).floatValue();
                    Vector2D zero9 = Vector2D.INSTANCE.getZERO();
                    float f26 = 0.0f;
                    float f27 = 0.0f;
                    int i11 = 0;
                    float f28 = 1.0f;
                    float f29 = 1.0f;
                    while (i11 < iRoundToInt6) {
                        int iRoundToInt7 = MathKt.roundToInt(f26);
                        int iRoundToInt8 = MathKt.roundToInt(((f26 - MathKt.truncate(f26)) * renderEnvironment2.getFramesPerHundredSeconds()) / 100.0f);
                        int currentFrame = renderEnvironment2.getOverrideFrame() - iRoundToInt7;
                        RenderEnvironment renderEnvironmentAdj2 = ((double) f26) < 1.0E-5d ? renderEnvironment2 : new RenderEnvironmentAdj(renderEnvironment, SceneElementKt.fractionalTime(sceneElement4, TimeKt.timeFromFrameNumber(currentFrame, renderEnvironment2.getFramesPerHundredSeconds()) - iRoundToInt8), SceneElementKt.fractionalTime(sceneElement4, TimeKt.timeFromFrameNumber(currentFrame - 1, renderEnvironment2.getFramesPerHundredSeconds()) - iRoundToInt8), renderEnvironment2.getOverrideDurationInSeconds(), currentFrame);
                        if (f28 > 0.0f) {
                            float f30 = f29;
                            f9 = f30;
                            f8 = f28;
                            f10 = f27;
                            i8 = i11;
                            f11 = 1.0f;
                            f7 = f26;
                            i7 = iRoundToInt6;
                            vector2D = vector2D9;
                            List list9 = list8;
                            renderWithRepeat(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.multOpacityBy(TransformKt.rotatedBy(TransformKt.scaledBy$default(TransformKt.translatedBy(sceneElement4.getTransform(), zero9), f30, f29, 0.0f, 0.0f, 12, null), f27), f28), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null), list9, s4Var, renderEnvironmentAdj2, sceneSelection, rectangle);
                            list4 = list9;
                            vector2D2 = zero9;
                        } else {
                            i7 = iRoundToInt6;
                            vector2D = vector2D9;
                            i8 = i11;
                            f7 = f26;
                            f8 = f28;
                            f9 = f29;
                            f10 = f27;
                            list4 = list8;
                            f11 = 1.0f;
                            vector2D2 = zero9;
                        }
                        zero9 = GeometryKt.plus(vector2D2, vector2D);
                        f29 = f9 * fFloatValue25;
                        f27 = f10 + fFloatValue24;
                        f28 = f8 - (f11 - fFloatValue26);
                        i11 = i8 + 1;
                        sceneElement4 = sceneElement;
                        iRoundToInt6 = i7;
                        renderEnvironment2 = renderEnvironment;
                        vector2D9 = vector2D;
                        list8 = list4;
                        f26 = f7 + fFloatValue23;
                    }
                    break;
                }
                break;
            case 924435401:
                if (id.equals("com.alightcreative.effects.repeat.radial")) {
                    KeyableUserParameterValue keyableUserParameterValue53 = keyableVisualEffectRef3.getParameters().get(JavetError.PARAMETER_COUNT);
                    final int iRoundToInt9 = MathKt.roundToInt((keyableUserParameterValue53 == null || (floatValue45 = keyableUserParameterValue53.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue45, renderEnvironment2)).floatValue());
                    KeyableUserParameterValue keyableUserParameterValue54 = keyableVisualEffectRef3.getParameters().get("radius");
                    float fFloatValue27 = (keyableUserParameterValue54 == null || (floatValue44 = keyableUserParameterValue54.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue44, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue55 = keyableVisualEffectRef3.getParameters().get("baseScale");
                    float fFloatValue28 = (keyableUserParameterValue55 == null || (floatValue43 = keyableUserParameterValue55.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue43, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue56 = keyableVisualEffectRef3.getParameters().get("startAngle");
                    float fFloatValue29 = (keyableUserParameterValue56 == null || (floatValue42 = keyableUserParameterValue56.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue42, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue57 = keyableVisualEffectRef3.getParameters().get("sweep");
                    float fFloatValue30 = (keyableUserParameterValue57 == null || (floatValue41 = keyableUserParameterValue57.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue41, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue58 = keyableVisualEffectRef3.getParameters().get("angle");
                    float fFloatValue31 = (keyableUserParameterValue58 == null || (floatValue40 = keyableUserParameterValue58.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue40, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue59 = keyableVisualEffectRef3.getParameters().get("orientation");
                    float fFloatValue32 = (keyableUserParameterValue59 == null || (floatValue39 = keyableUserParameterValue59.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue39, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue60 = keyableVisualEffectRef3.getParameters().get("scale");
                    float fFloatValue33 = (keyableUserParameterValue60 == null || (floatValue38 = keyableUserParameterValue60.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue38, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue61 = keyableVisualEffectRef3.getParameters().get("alpha");
                    float fFloatValue34 = (keyableUserParameterValue61 == null || (floatValue37 = keyableUserParameterValue61.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue37, renderEnvironment2)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue62 = keyableVisualEffectRef3.getParameters().get("blend");
                    if (keyableUserParameterValue62 != null && (floatValue36 = keyableUserParameterValue62.getFloatValue()) != null) {
                        fFloatValue2 = ((Number) KeyableKt.valueAtTime(floatValue36, renderEnvironment2)).floatValue();
                    }
                    float f31 = fFloatValue2;
                    KeyableUserParameterValue keyableUserParameterValue63 = keyableVisualEffectRef3.getParameters().get("colorAltCopies");
                    if (keyableUserParameterValue63 != null) {
                        list5 = listDrop;
                        f12 = fFloatValue33;
                        booleanValue2 = keyableUserParameterValue63.getBooleanValue();
                    } else {
                        list5 = listDrop;
                        f12 = fFloatValue33;
                        booleanValue2 = false;
                    }
                    KeyableUserParameterValue keyableUserParameterValue64 = keyableVisualEffectRef3.getParameters().get("fillColor");
                    if (keyableUserParameterValue64 == null || (colorValue5 = keyableUserParameterValue64.getColorValue()) == null || (white5 = (SolidColor) KeyableKt.valueAtTime(colorValue5, renderEnvironment2)) == null) {
                        white5 = SolidColor.INSTANCE.getWHITE();
                    }
                    KeyableUserParameterValue keyableUserParameterValue65 = keyableVisualEffectRef3.getParameters().get("offset");
                    if (keyableUserParameterValue65 == null || (vec2DValue8 = keyableUserParameterValue65.getVec2DValue()) == null || (zero8 = (Vector2D) KeyableKt.valueAtTime(vec2DValue8, renderEnvironment2)) == null) {
                        zero8 = Vector2D.INSTANCE.getZERO();
                    }
                    ColorRange colorRangeComputeRepeatBlend5 = RepeatEasingKt.computeRepeatBlend(f31, (SolidColor) KeyableKt.valueAtTime(sceneElement.getFillColor(), renderEnvironment2), white5);
                    final float f32 = fFloatValue29;
                    final float f33 = fFloatValue31;
                    final SolidColor startColor5 = colorRangeComputeRepeatBlend5.getStartColor();
                    final SolidColor endColor5 = colorRangeComputeRepeatBlend5.getEndColor();
                    final float f34 = fFloatValue28;
                    final float f35 = fFloatValue32;
                    final Vector2D vector2D10 = zero8;
                    final float f36 = fFloatValue30;
                    final float f37 = fFloatValue34;
                    final float f38 = fFloatValue27;
                    RepeatEasingKt.repeatWithEasing(iRoundToInt9, keyableVisualEffectRef3, renderEnvironment2, new Function3() { // from class: com.alightcreative.app.motion.scene.rendering.fuX
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return SceneElementRenderingKt.renderWithRepeat$lambda$39(f12, sceneElement, f38, f35, f33, f34, vector2D10, f32, f36, iRoundToInt9, f37, booleanValue2, startColor5, endColor5, list5, s4Var, renderEnvironment2, sceneSelection, rectangle, ((Integer) obj).intValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    });
                    break;
                }
                break;
        }
    }
}
