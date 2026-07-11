package com.alightcreative.app.motion.scene.scripting;

import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SimplexNoiseKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.StyledText;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.Vector4D;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.alightcreative.app.motion.scene.scripting.builtin.GrowPartsKt;
import com.alightcreative.app.motion.scene.scripting.builtin.MorphPathKt;
import com.alightcreative.app.motion.scene.scripting.builtin.MoveAlongPathKt;
import com.alightcreative.app.motion.scene.scripting.builtin.ShakePartsKt;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.app.motion.scene.visualeffect.ShaderGroup;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.caoccao.javet.annotations.V8Function;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.V8ScriptOrigin;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001ao\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0014\u001aq\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001aA\u0010\u001f\u001a\u00020\u001e*\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001b0\u00172\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010$\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010)\u001a\u00020%*\u00020!2\u0006\u0010(\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100\" \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00000+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.¨\u00063"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneElement;", "", "time", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "renderMode", "", "editMode", "", "selected", "Lcom/alightcreative/app/motion/scene/scripting/ScriptGroup;", "runGroup", "runScripts", "(Lcom/alightcreative/app/motion/scene/SceneElement;FLcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/rendering/RenderMode;Ljava/lang/Integer;ZLcom/alightcreative/app/motion/scene/scripting/ScriptGroup;)Lcom/alightcreative/app/motion/scene/SceneElement;", "frame", "fphs", "Lcom/alightcreative/app/motion/scene/Transform;", "prevFrameTf", "prevFrameTime", "(Lcom/alightcreative/app/motion/scene/SceneElement;FIILcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/Transform;FLcom/alightcreative/app/motion/scene/rendering/RenderMode;Ljava/lang/Integer;ZLcom/alightcreative/app/motion/scene/scripting/ScriptGroup;)Lcom/alightcreative/app/motion/scene/SceneElement;", "runScriptsInternal", "LI/n;", "", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "parameterRefs", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "parameters", "fractionalTime", "Lcom/caoccao/javet/values/reference/V8ValueObject;", "userParamsAtTimeForScript", "(LI/n;Ljava/util/Map;Ljava/util/Map;F)Lcom/caoccao/javet/values/reference/V8ValueObject;", "Lcom/caoccao/javet/interop/V8Runtime;", "v8", "AM", "logtag", "", "registerAlightMotionScriptMethods", "(Lcom/caoccao/javet/interop/V8Runtime;Lcom/caoccao/javet/values/reference/V8ValueObject;Ljava/lang/String;)V", "scriptString", "executeVoidScript", "(Lcom/caoccao/javet/interop/V8Runtime;Ljava/lang/String;)V", "", "LI/Dsr;", "scriptEnvCache", "Ljava/util/Map;", "RUN_SCRIPT_CACHE_MAX_SIZE", "I", "Lcom/alightcreative/app/motion/scene/scripting/ScriptArguments;", "runScriptsCache", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScriptExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScriptExecutor.kt\ncom/alightcreative/app/motion/scene/scripting/ScriptExecutorKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 SceneElement.kt\ncom/alightcreative/app/motion/scene/SceneElementKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 Geometry.kt\ncom/alightcreative/app/motion/scene/GeometryKt\n*L\n1#1,509:1\n381#2,7:510\n381#2,7:521\n804#3:517\n2632#4,3:518\n1863#4,2:533\n1557#4:535\n1628#4,3:536\n216#5,2:528\n216#5,2:530\n105#6:532\n*S KotlinDebug\n*F\n+ 1 ScriptExecutor.kt\ncom/alightcreative/app/motion/scene/scripting/ScriptExecutorKt\n*L\n128#1:510,7\n204#1:521,7\n164#1:517\n203#1:518,3\n237#1:533,2\n376#1:535\n376#1:536,3\n396#1:528,2\n428#1:530,2\n269#1:532\n*E\n"})
public final class ScriptExecutorKt {
    private static final int RUN_SCRIPT_CACHE_MAX_SIZE = 5000;
    private static final Map<String, I.Dsr> scriptEnvCache = new LinkedHashMap();
    private static final Map<ScriptArguments, SceneElement> runScriptsCache = new LinkedHashMap();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ACScriptType.values().length];
            try {
                iArr[ACScriptType.JS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ACScriptType.External.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RenderMode.values().length];
            try {
                iArr2[RenderMode.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RenderMode.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RenderMode.EXPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RenderMode.THUMB.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RenderMode.SCENE_THUMB.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DataType.values().length];
            try {
                iArr3[DataType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[DataType.SOLID_COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DataType.VEC2.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[DataType.VEC3.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[DataType.VEC4.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[DataType.BOOLEAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[DataType.TEXTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final SceneElement runScripts(SceneElement sceneElement, float f3, Scene scene, RenderMode renderMode, Integer num, boolean z2, ScriptGroup runGroup) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(runGroup, "runGroup");
        int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        int iSceneTime = SceneElementKt.sceneTime(sceneElement, f3);
        int i2 = (int) ((((long) iSceneTime) * ((long) framesPerHundredSeconds)) / SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
        float fFractionalTime = SceneElementKt.fractionalTime(sceneElement, iSceneTime - (100000 / framesPerHundredSeconds));
        return runScripts(sceneElement, f3, i2, framesPerHundredSeconds, scene, sceneElement.getTransform().valueAtTime(fFractionalTime), fFractionalTime, renderMode, num, z2, runGroup);
    }

    public static /* synthetic */ SceneElement runScripts$default(SceneElement sceneElement, float f3, Scene scene, RenderMode renderMode, Integer num, boolean z2, ScriptGroup scriptGroup, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            renderMode = null;
        }
        RenderMode renderMode2 = renderMode;
        if ((i2 & 8) != 0) {
            num = 0;
        }
        Integer num2 = num;
        boolean z3 = (i2 & 16) != 0 ? false : z2;
        if ((i2 & 32) != 0) {
            scriptGroup = ScriptGroup.All;
        }
        return runScripts(sceneElement, f3, scene, renderMode2, num2, z3, scriptGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e3  */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r4v25, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r4v30, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r4v34, types: [T, com.alightcreative.app.motion.scene.Transform] */
    /* JADX WARN: Type inference failed for: r5v38, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /* JADX WARN: Type inference failed for: r5v45, types: [T, com.alightcreative.app.motion.scene.Transform] */
    /* JADX WARN: Type inference failed for: r5v52, types: [T, com.alightcreative.app.motion.scene.Transform] */
    /* JADX WARN: Type inference failed for: r5v58, types: [T, com.alightcreative.app.motion.scene.Transform] */
    /* JADX WARN: Type inference failed for: r8v17, types: [T, com.alightcreative.app.motion.scene.Transform] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit runScriptsInternal$lambda$20(Transform transform, Ref.ObjectRef objectRef, float f3, SceneElement sceneElement, KeyableVisualEffectRef keyableVisualEffectRef, float f4, VisualEffect visualEffect, float f5, int i2, int i3, final Transform transform2, Integer num, boolean z2, RenderMode renderMode, Vector2D vector2D, final I.n run, V8Runtime v82) throws JavetException {
        Set setEmptySet;
        Set<Integer> setEmptySet2;
        String str;
        boolean z3;
        V8Value v8Value;
        Map<Integer, ShaderGroup> shaderGroups;
        Set<Integer> setKeySet;
        Intrinsics.checkNotNullParameter(run, "$this$run");
        Intrinsics.checkNotNullParameter(v82, "v8");
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = transform;
        final SolidColor solidColor = (SolidColor) KeyableKt.valueAtTime(((SceneElement) objectRef.element).getFillColor(), f3);
        double endTime = ((double) (sceneElement.getEndTime() - sceneElement.getStartTime())) / 1000.0d;
        V8ValueArray v8ValueArrayRl = run.rl();
        VisualEffect effect = VisualEffectKt.getEffect(keyableVisualEffectRef);
        if (effect == null || (shaderGroups = effect.getShaderGroups()) == null || (setKeySet = shaderGroups.keySet()) == null || (setEmptySet = CollectionsKt.toSet(setKeySet)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        Set set = setEmptySet;
        KeyableVisualEffectRef keyableVisualEffectRef2 = ((SceneElement) objectRef.element).getVisualEffects().get(Long.valueOf(keyableVisualEffectRef.getInstanceId()));
        if (keyableVisualEffectRef2 == null || (setEmptySet2 = keyableVisualEffectRef2.getDisabledRenderGroups()) == null) {
            setEmptySet2 = SetsKt.emptySet();
        }
        Iterator it = SetsKt.minus(set, (Iterable) setEmptySet2).iterator();
        while (it.hasNext()) {
            v8ValueArrayRl.push(Integer.valueOf(((Number) it.next()).intValue()));
        }
        V8ValueObject v8ValueObjectT = run.t();
        run.Uo(v8ValueObjectT, "transform", new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScriptExecutorKt.runScriptsInternal$lambda$20$lambda$10$lambda$8(run, objectRef2, (V8ValueObject) obj);
            }
        });
        v8ValueObjectT.set("alpha", Double.valueOf(((double) ((Transform) objectRef2.element).getOpacity()) + 0.0d));
        run.Uo(v8ValueObjectT, "fillColor", new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScriptExecutorKt.runScriptsInternal$lambda$20$lambda$10$lambda$9(solidColor, (V8ValueObject) obj);
            }
        });
        v8ValueObjectT.set("text", ((SceneElement) objectRef.element).getText().getText());
        v8ValueObjectT.set("shaderGroups", v8ValueArrayRl);
        V8ValueObject v8ValueObjectT2 = run.t();
        double d2 = f3;
        v8ValueObjectT2.set("time", Double.valueOf(d2 + 0.0d));
        v8ValueObjectT2.set("prevFrameTime", Double.valueOf(((double) f5) + 0.0d));
        v8ValueObjectT2.set("duration", Double.valueOf(endTime));
        v8ValueObjectT2.set("startTime", Double.valueOf(((double) sceneElement.getStartTime()) / 1000.0d));
        v8ValueObjectT2.set("inTime", Double.valueOf(((double) sceneElement.getInTime()) / 1000.0d));
        v8ValueObjectT2.set("frame", Integer.valueOf(i2));
        v8ValueObjectT2.set("fps", Double.valueOf(((double) i3) / 100.0d));
        v8ValueObjectT2.set("endTime", Double.valueOf(((double) sceneElement.getEndTime()) / 1000.0d));
        v8ValueObjectT2.set("absTime", Double.valueOf((((double) sceneElement.getStartTime()) / 1000.0d) + (endTime * d2)));
        run.Uo(v8ValueObjectT2, "velocity", new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.fuX
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScriptExecutorKt.runScriptsInternal$lambda$20$lambda$12$lambda$11(objectRef2, transform2, (V8ValueObject) obj);
            }
        });
        v8ValueObjectT2.set("angularVelocity", Double.valueOf(((Transform) objectRef2.element).getRotation() - transform2.getRotation()));
        v8ValueObjectT2.set("editMode", (num != null && num.intValue() == 2131362629) ? "eyedropper" : (num != null && num.intValue() == 2131362630) ? "eyedropper-drag" : (num != null && num.intValue() == 0) ? "none" : InneractiveMediationNameConsts.OTHER);
        v8ValueObjectT2.set("selected", Boolean.valueOf(z2));
        int i5 = renderMode == null ? -1 : WhenMappings.$EnumSwitchMapping$1[renderMode.ordinal()];
        if (i5 == -1) {
            str = "";
        } else if (i5 == 1) {
            str = "play";
        } else if (i5 == 2) {
            str = "pause";
        } else if (i5 == 3) {
            str = "export";
        } else if (i5 == 4) {
            str = "thumb";
        } else {
            if (i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sceneThumb";
        }
        v8ValueObjectT2.set("renderMode", str);
        v8ValueObjectT2.set("scaleVelocity", Double.valueOf(GeometryKt.getLength(GeometryKt.times(vector2D, ((Transform) objectRef2.element).getScale())) - GeometryKt.getLength(GeometryKt.times(vector2D, transform2.getScale()))));
        V8Value v8ValueInvoke = v82.getGlobalObject().invoke(QiDPjiOCZHDS.WuptSDjtwVauTfC, v8ValueObjectT2, v8ValueObjectT, userParamsAtTimeForScript(run, VisualEffectKt.paramsAtTime(keyableVisualEffectRef, f3, f4), visualEffect.getParamsById(), f3), userParamsAtTimeForScript(run, VisualEffectKt.paramsAtTime(keyableVisualEffectRef, f5, f4), visualEffect.getParamsById(), f5));
        try {
            V8ValueObject v8ValueObject = (V8ValueObject) v8ValueInvoke;
            if (v8ValueObject.has("alpha")) {
                Float f6 = v8ValueObject.getFloat("alpha");
                if (Intrinsics.areEqual(f6, ((Transform) objectRef2.element).getOpacity())) {
                    z3 = false;
                } else {
                    Transform transform3 = (Transform) objectRef2.element;
                    Intrinsics.checkNotNull(f6);
                    objectRef2.element = Transform.copy$default(transform3, null, null, null, 0.0f, 0.0f, 0.0f, f6.floatValue(), null, null, 447, null);
                    z3 = true;
                }
            }
            if (v8ValueObject.has("transform")) {
                v8Value = v8ValueObject.get("transform");
                try {
                    V8ValueObject v8ValueObject2 = (V8ValueObject) v8Value;
                    if (v8ValueObject2.has("location")) {
                        v8Value = v8ValueObject2.get("location");
                        try {
                            V8ValueObject v8ValueObject3 = (V8ValueObject) v8Value;
                            if (v8ValueObject3.has("x") && v8ValueObject3.has("y") && v8ValueObject3.has("z")) {
                                Float f7 = v8ValueObject3.getFloat("x");
                                Float f8 = v8ValueObject3.getFloat("y");
                                Float f9 = v8ValueObject3.getFloat("z");
                                if (Intrinsics.areEqual(f7, ((Transform) objectRef2.element).getLocation().getX())) {
                                    if (Intrinsics.areEqual(f8, ((Transform) objectRef2.element).getLocation().getY())) {
                                        if (!Intrinsics.areEqual(f9, ((Transform) objectRef2.element).getLocation().getZ())) {
                                        }
                                        Unit unit = Unit.INSTANCE;
                                        AutoCloseableKt.closeFinally(v8Value, null);
                                    }
                                }
                                Transform transform4 = (Transform) objectRef2.element;
                                Intrinsics.checkNotNull(f7);
                                float fFloatValue = f7.floatValue();
                                Intrinsics.checkNotNull(f8);
                                float fFloatValue2 = f8.floatValue();
                                Intrinsics.checkNotNull(f9);
                                objectRef2.element = Transform.copy$default(transform4, new Vector3D(fFloatValue, fFloatValue2, f9.floatValue()), null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 510, null);
                                z3 = true;
                                Unit unit2 = Unit.INSTANCE;
                                AutoCloseableKt.closeFinally(v8Value, null);
                            } else {
                                if (v8ValueObject3.has("x") && v8ValueObject3.has("y")) {
                                    Float f10 = v8ValueObject3.getFloat("x");
                                    Float f11 = v8ValueObject3.getFloat("y");
                                    if (!Intrinsics.areEqual(f10, ((Transform) objectRef2.element).getLocation().getX()) || !Intrinsics.areEqual(f11, ((Transform) objectRef2.element).getLocation().getY())) {
                                        Transform transform5 = (Transform) objectRef2.element;
                                        Intrinsics.checkNotNull(f10);
                                        float fFloatValue3 = f10.floatValue();
                                        Intrinsics.checkNotNull(f11);
                                        objectRef2.element = Transform.copy$default(transform5, new Vector3D(fFloatValue3, f11.floatValue(), ((Transform) objectRef2.element).getLocation().getZ()), null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 510, null);
                                        z3 = true;
                                    }
                                }
                                Unit unit22 = Unit.INSTANCE;
                                AutoCloseableKt.closeFinally(v8Value, null);
                            }
                        } finally {
                        }
                    }
                    if (v8ValueObject2.has("scale")) {
                        v8Value = v8ValueObject2.get("scale");
                        try {
                            V8ValueObject v8ValueObject4 = (V8ValueObject) v8Value;
                            if (v8ValueObject4.has("x") && v8ValueObject4.has("y")) {
                                Float f12 = v8ValueObject4.getFloat("x");
                                Float f13 = v8ValueObject4.getFloat("y");
                                if (!Intrinsics.areEqual(f12, ((Transform) objectRef2.element).getScale().getX()) || !Intrinsics.areEqual(f13, ((Transform) objectRef2.element).getScale().getY())) {
                                    Transform transform6 = (Transform) objectRef2.element;
                                    Intrinsics.checkNotNull(f12);
                                    float fFloatValue4 = f12.floatValue();
                                    Intrinsics.checkNotNull(f13);
                                    objectRef2.element = Transform.copy$default(transform6, null, null, new Vector2D(fFloatValue4, f13.floatValue()), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 507, null);
                                    z3 = true;
                                }
                            }
                            Unit unit3 = Unit.INSTANCE;
                            AutoCloseableKt.closeFinally(v8Value, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (v8ValueObject2.has("angle")) {
                        Float f14 = v8ValueObject2.getFloat("angle");
                        if (!Intrinsics.areEqual(f14, ((Transform) objectRef2.element).getRotation())) {
                            Transform transform7 = (Transform) objectRef2.element;
                            Intrinsics.checkNotNull(f14);
                            objectRef2.element = Transform.copy$default(transform7, null, null, null, 0.0f, 0.0f, f14.floatValue(), 0.0f, null, null, 479, null);
                            z3 = true;
                        }
                    }
                    Unit unit4 = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(v8Value, null);
                } finally {
                }
            }
            if (z3) {
                objectRef.element = SceneElement.copy$default((SceneElement) objectRef.element, null, 0, 0, 0L, null, null, TransformKt.asKeyable((Transform) objectRef2.element), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
            }
            if (v8ValueObject.has("fillColor")) {
                v8Value = v8ValueObject.get("fillColor");
                try {
                    V8ValueObject v8ValueObject5 = (V8ValueObject) v8Value;
                    Intrinsics.checkNotNull(v8ValueObject5);
                    SolidColor solidColorMUb = I.aC.mUb(v8ValueObject5);
                    if (!Intrinsics.areEqual(solidColorMUb, solidColor)) {
                        objectRef.element = SceneElement.copy$default((SceneElement) objectRef.element, null, 0, 0, 0L, null, null, null, KeyableKt.keyable(solidColorMUb), null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -129, 127, null);
                    }
                    Unit unit5 = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(v8Value, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (v8ValueObject.has("text")) {
                String string = v8ValueObject.getString("text");
                if (!Intrinsics.areEqual(string, ((SceneElement) objectRef.element).getText().getText())) {
                    T t3 = objectRef.element;
                    SceneElement sceneElement2 = (SceneElement) t3;
                    StyledText text = ((SceneElement) t3).getText();
                    Intrinsics.checkNotNull(string);
                    objectRef.element = SceneElement.copy$default(sceneElement2, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, StyledText.copy$default(text, string, 0.0f, null, 0, null, 30, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097153, 127, null);
                }
            }
            if (v8ValueObject.has("shaderGroups")) {
                v8Value = v8ValueObject.get("shaderGroups");
                try {
                    V8ValueArray v8ValueArray = (V8ValueArray) v8Value;
                    IntRange intRangeUntil = RangesKt.until(0, v8ValueArray.getLength());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                    Iterator<Integer> it2 = intRangeUntil.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(v8ValueArray.getInteger(Integer.valueOf(((IntIterator) it2).nextInt())));
                    }
                    AutoCloseableKt.closeFinally(v8Value, null);
                    Set setMinus = SetsKt.minus(set, (Iterable) CollectionsKt.toSet(arrayList));
                    KeyableVisualEffectRef keyableVisualEffectRef3 = ((SceneElement) objectRef.element).getVisualEffects().get(Long.valueOf(keyableVisualEffectRef.getInstanceId()));
                    if (!Intrinsics.areEqual(setMinus, keyableVisualEffectRef3 != null ? keyableVisualEffectRef3.getDisabledRenderGroups() : null)) {
                        KeyableVisualEffectRef keyableVisualEffectRef4 = ((SceneElement) objectRef.element).getVisualEffects().get(Long.valueOf(keyableVisualEffectRef.getInstanceId()));
                        Intrinsics.checkNotNull(keyableVisualEffectRef4);
                        KeyableVisualEffectRef keyableVisualEffectRefCopy$default = KeyableVisualEffectRef.copy$default(keyableVisualEffectRef4, null, 0L, null, 0, false, false, setMinus, 63, null);
                        T t4 = objectRef.element;
                        objectRef.element = SceneElement.copy$default((SceneElement) t4, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, MapsKt.plus(((SceneElement) t4).getVisualEffects(), TuplesKt.to(Long.valueOf(keyableVisualEffectRef.getInstanceId()), keyableVisualEffectRefCopy$default)), null, null, null, null, null, null, null, false, null, null, false, null, null, -33554433, 127, null);
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            Unit unit6 = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(v8ValueInvoke, null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.closeFinally(v8ValueInvoke, th2);
                throw th3;
            }
        }
    }

    public static final void executeVoidScript(V8Runtime v8Runtime, String scriptString) throws JavetException {
        Intrinsics.checkNotNullParameter(v8Runtime, "<this>");
        Intrinsics.checkNotNullParameter(scriptString, "scriptString");
        v8Runtime.execute(scriptString, new byte[0], new V8ScriptOrigin(), false);
    }

    public static final void registerAlightMotionScriptMethods(final V8Runtime v82, V8ValueObject AM, final String logtag) throws JavetException {
        Intrinsics.checkNotNullParameter(v82, "v8");
        Intrinsics.checkNotNullParameter(AM, "AM");
        Intrinsics.checkNotNullParameter(logtag, "logtag");
        AM.bind(new Object() { // from class: com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt.registerAlightMotionScriptMethods.1
            @Keep
            @V8Function
            public final V8ValueObject hsvToRgb(V8ValueObject hsv) throws JavetException {
                Intrinsics.checkNotNullParameter(hsv, "hsv");
                V8ValueObject v8ValueObjectCreateV8ValueObject = v82.createV8ValueObject();
                Intrinsics.checkNotNullExpressionValue(v8ValueObjectCreateV8ValueObject, "createV8ValueObject(...)");
                return I.aC.rl(v8ValueObjectCreateV8ValueObject, ColorKt.toRGB(I.aC.gh(hsv)));
            }

            @Keep
            @V8Function
            public final void log(V8ValueString logstr) {
                Intrinsics.checkNotNullParameter(logstr, "logstr");
                Log.i(logtag, logstr.getValue());
            }

            @Keep
            @V8Function
            public final V8ValueObject rgbToHsv(V8ValueObject rgb) throws JavetException {
                Intrinsics.checkNotNullParameter(rgb, "rgb");
                V8ValueObject v8ValueObjectCreateV8ValueObject = v82.createV8ValueObject();
                Intrinsics.checkNotNullExpressionValue(v8ValueObjectCreateV8ValueObject, "createV8ValueObject(...)");
                return I.aC.t(v8ValueObjectCreateV8ValueObject, ColorKt.toHSV(I.aC.mUb(rgb)));
            }

            @Keep
            @V8Function(name = "simplexNoise")
            public final double simplexNoiseFun(Number... params) {
                Intrinsics.checkNotNullParameter(params, "params");
                int length = params.length;
                if (length == 0) {
                    return 0.0d;
                }
                if (length == 1) {
                    return SimplexNoiseKt.simplexNoise(params[0].doubleValue(), 0.0d);
                }
                if (length == 2) {
                    return SimplexNoiseKt.simplexNoise(params[0].doubleValue(), params[1].doubleValue());
                }
                if (length == 3) {
                    return SimplexNoiseKt.simplexNoise(params[0].doubleValue(), params[1].doubleValue(), params[2].doubleValue());
                }
                if (length != 4) {
                    return 0.0d;
                }
                return SimplexNoiseKt.simplexNoise(params[0].doubleValue(), params[1].doubleValue(), params[2].doubleValue(), params[3].doubleValue());
            }

            @Keep
            @V8Function
            public final double triangle(Number x2) {
                Intrinsics.checkNotNullParameter(x2, "x");
                double d2 = 1;
                return (Math.abs(((x2.doubleValue() + 0.75d) % d2) - 0.5d) * ((double) 4)) - d2;
            }
        });
    }

    public static /* synthetic */ void registerAlightMotionScriptMethods$default(V8Runtime v8Runtime, V8ValueObject v8ValueObject, String str, int i2, Object obj) throws JavetException {
        if ((i2 & 4) != 0) {
            str = "userScript";
        }
        registerAlightMotionScriptMethods(v8Runtime, v8ValueObject, str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.alightcreative.app.motion.scene.SceneElement] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SceneElement runScriptsInternal(SceneElement sceneElement, final float f3, final int i2, final int i3, Scene scene, final Transform transform, final float f4, final RenderMode renderMode, final Integer num, final boolean z2, ScriptGroup scriptGroup) {
        final VisualEffect visualEffectVisualEffectById;
        ScriptEnv scriptEnv;
        int i5;
        T tScript_growParts;
        ?? r42 = sceneElement;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = r42;
        ScriptEnv scriptEnv2 = new ScriptEnv(scene, f3, i2, i3, transform, f4, renderMode, num, z2, scriptGroup);
        ScriptGroup scriptGroup2 = scriptGroup;
        final float endTime = (r42.getEndTime() - r42.getStartTime()) / 1000.0f;
        Iterator<KeyableVisualEffectRef> it = SceneElementKt.getVisualEffectsInOrder(r42).iterator();
        int i7 = 0;
        int i8 = 0;
        SceneElement sceneElement2 = r42;
        while (it.hasNext()) {
            KeyableVisualEffectRef next = it.next();
            int i9 = (i8 != 0 || Intrinsics.areEqual(next.getId(), "com.alightcreative.effects.repeat")) ? 1 : i7;
            if (i9 != 0 && scriptGroup2 == ScriptGroup.BeforeRepeat) {
                return (SceneElement) objectRef.element;
            }
            if ((i9 != 0 || scriptGroup2 != ScriptGroup.AfterRepeat) && !next.getHidden() && (visualEffectVisualEffectById = VisualEffectKt.visualEffectById(next.getId())) != null && !visualEffectVisualEffectById.getScripts().isEmpty() && (!visualEffectVisualEffectById.getShaderGroups().isEmpty() ? scriptGroup2 == ScriptGroup.ShaderCoop || scriptGroup2 == ScriptGroup.All : scriptGroup2 != ScriptGroup.ShaderCoop)) {
                for (ACScript aCScript : visualEffectVisualEffectById.getScripts()) {
                    int i10 = WhenMappings.$EnumSwitchMapping$0[aCScript.getType().ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String source = aCScript.getSource();
                        switch (source.hashCode()) {
                            case -2049632889:
                                if (!source.equals("com.alightcreative.script.growparts")) {
                                    throw new UnsupportedOperationException();
                                }
                                tScript_growParts = GrowPartsKt.script_growParts(sceneElement2, next, scriptEnv2);
                                break;
                                break;
                            case -1568823296:
                                if (!source.equals("com.alightcreative.script.shakeparts")) {
                                    throw new UnsupportedOperationException();
                                }
                                tScript_growParts = ShakePartsKt.script_shakeParts(sceneElement2, next, scriptEnv2);
                                break;
                                break;
                            case 1158353195:
                                if (!source.equals("com.alightcreative.script.movealongpath")) {
                                    throw new UnsupportedOperationException();
                                }
                                tScript_growParts = MoveAlongPathKt.script_moveAlongPath(sceneElement2, next, scriptEnv2);
                                break;
                                break;
                            case 1512227847:
                                if (!source.equals("com.alightcreative.script.morphpath")) {
                                    throw new UnsupportedOperationException();
                                }
                                tScript_growParts = MorphPathKt.script_morphPath(sceneElement2, next, scriptEnv2);
                                break;
                                break;
                            case 1549210727:
                                if (!source.equals("com.alightcreative.script.movealongpath2")) {
                                    throw new UnsupportedOperationException();
                                }
                                tScript_growParts = MoveAlongPathKt.script_moveAlongPath2(sceneElement2, next, scriptEnv2);
                                break;
                                break;
                            case 1549210728:
                                if (!source.equals("com.alightcreative.script.movealongpath3")) {
                                    throw new UnsupportedOperationException();
                                }
                                tScript_growParts = MoveAlongPathKt.script_moveAlongPath3(sceneElement2, next, scriptEnv2);
                                break;
                                break;
                            default:
                                throw new UnsupportedOperationException();
                        }
                        objectRef.element = tScript_growParts;
                    }
                }
                List<ACScript> scripts = visualEffectVisualEffectById.getScripts();
                if (scripts == null || !scripts.isEmpty()) {
                    Iterator<T> it2 = scripts.iterator();
                    final SceneElement sceneElement3 = sceneElement2;
                    while (it2.hasNext()) {
                        if (((ACScript) it2.next()).getType() == ACScriptType.JS) {
                            Map<String, I.Dsr> map = scriptEnvCache;
                            String id = visualEffectVisualEffectById.getId();
                            I.Dsr dsr = map.get(id);
                            if (dsr == null) {
                                dsr = new I.Dsr("effect:" + visualEffectVisualEffectById.getId());
                                I.Dsr.mUb(dsr, i7, new Function2() { // from class: com.alightcreative.app.motion.scene.scripting.C
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ScriptExecutorKt.runScriptsInternal$lambda$4$lambda$3$lambda$2(visualEffectVisualEffectById, (I.n) obj, (V8Runtime) obj2);
                                    }
                                }, 1, null);
                                map.put(id, dsr);
                            }
                            final Vector2D size = SceneElementKt.boundsInScene((SceneElement) objectRef.element, scene).getSize();
                            final Transform transformValueAtTime = ((SceneElement) objectRef.element).getTransform().valueAtTime(f3);
                            final KeyableVisualEffectRef keyableVisualEffectRef = next;
                            final VisualEffect visualEffect = visualEffectVisualEffectById;
                            scriptEnv = scriptEnv2;
                            i5 = 0;
                            I.Dsr.mUb(dsr, 0, new Function2() { // from class: com.alightcreative.app.motion.scene.scripting.o
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ScriptExecutorKt.runScriptsInternal$lambda$20(transformValueAtTime, objectRef, f3, sceneElement3, keyableVisualEffectRef, endTime, visualEffect, f4, i2, i3, transform, num, z2, renderMode, size, (I.n) obj, (V8Runtime) obj2);
                                }
                            }, 1, null);
                        } else {
                            next = next;
                            visualEffectVisualEffectById = visualEffectVisualEffectById;
                            sceneElement3 = sceneElement;
                        }
                    }
                    scriptEnv = scriptEnv2;
                    i5 = i7;
                } else {
                    scriptEnv = scriptEnv2;
                    i5 = i7;
                }
            }
            sceneElement2 = sceneElement;
            i7 = i5;
            i8 = i9;
            scriptEnv2 = scriptEnv;
            scriptGroup2 = scriptGroup;
        }
        return (SceneElement) objectRef.element;
    }

    static /* synthetic */ SceneElement runScriptsInternal$default(SceneElement sceneElement, float f3, int i2, int i3, Scene scene, Transform transform, float f4, RenderMode renderMode, Integer num, boolean z2, ScriptGroup scriptGroup, int i5, Object obj) {
        if ((i5 & 32) != 0) {
            f4 = f3;
        }
        if ((i5 & 64) != 0) {
            renderMode = null;
        }
        if ((i5 & 128) != 0) {
            num = 0;
        }
        if ((i5 & 256) != 0) {
            z2 = false;
        }
        if ((i5 & 512) != 0) {
            scriptGroup = ScriptGroup.All;
        }
        return runScriptsInternal(sceneElement, f3, i2, i3, scene, transform, f4, renderMode, num, z2, scriptGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit runScriptsInternal$lambda$20$lambda$10$lambda$8(I.n nVar, final Ref.ObjectRef objectRef, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        nVar.Uo(setObject, "location", new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.Dsr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScriptExecutorKt.runScriptsInternal$lambda$20$lambda$10$lambda$8$lambda$6(objectRef, (V8ValueObject) obj);
            }
        });
        nVar.Uo(setObject, "scale", new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScriptExecutorKt.runScriptsInternal$lambda$20$lambda$10$lambda$8$lambda$7(objectRef, (V8ValueObject) obj);
            }
        });
        setObject.set("angle", Double.valueOf(((double) ((Transform) objectRef.element).getRotation()) + 0.0d));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit runScriptsInternal$lambda$20$lambda$10$lambda$8$lambda$6(Ref.ObjectRef objectRef, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        setObject.set("x", Double.valueOf(((double) ((Transform) objectRef.element).getLocation().getX()) + 0.0d));
        setObject.set("y", Double.valueOf(((double) ((Transform) objectRef.element).getLocation().getY()) + 0.0d));
        setObject.set("z", Double.valueOf(((double) ((Transform) objectRef.element).getLocation().getZ()) + 0.0d));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit runScriptsInternal$lambda$20$lambda$10$lambda$8$lambda$7(Ref.ObjectRef objectRef, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        setObject.set("x", Double.valueOf(((double) ((Transform) objectRef.element).getScale().getX()) + 0.0d));
        setObject.set("y", Double.valueOf(((double) ((Transform) objectRef.element).getScale().getY()) + 0.0d));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runScriptsInternal$lambda$20$lambda$10$lambda$9(SolidColor solidColor, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        I.aC.rl(setObject, solidColor);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit runScriptsInternal$lambda$20$lambda$12$lambda$11(Ref.ObjectRef objectRef, Transform transform, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        Vector3D vector3DMinus = GeometryKt.minus(((Transform) objectRef.element).getLocation(), transform.getLocation());
        I.aC.nr(setObject, new Vector2D(vector3DMinus.getX(), vector3DMinus.getY()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit runScriptsInternal$lambda$4$lambda$3$lambda$2(VisualEffect visualEffect, I.n run, V8Runtime v82) throws JavetException {
        Intrinsics.checkNotNullParameter(run, "$this$run");
        Intrinsics.checkNotNullParameter(v82, "v8");
        XoT.C.nr("ScriptExecutor: Set up environment for effect '" + visualEffect.getId() + "'");
        V8ValueObject v8ValueObjectT = run.t();
        registerAlightMotionScriptMethods(v82, v8ValueObjectT, visualEffect.getId());
        v82.getGlobalObject().set("AM", v8ValueObjectT);
        for (ACScript aCScript : visualEffect.getScripts()) {
            int i2 = 1;
            if (WhenMappings.$EnumSwitchMapping$0[aCScript.getType().ordinal()] != 1) {
                throw new NotImplementedError(null, i2, 0 == true ? 1 : 0);
            }
            executeVoidScript(v82, aCScript.getSource());
        }
        return Unit.INSTANCE;
    }

    public static final V8ValueObject userParamsAtTimeForScript(I.n nVar, Map<String, UserParameterValue> parameterRefs, Map<String, ? extends UserParameter> parameters, final float f3) throws JavetException {
        Object string;
        Uri textureValue;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(parameterRefs, "parameterRefs");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        V8ValueObject v8ValueObjectT = nVar.t();
        for (Map.Entry<String, UserParameterValue> entry : parameterRefs.entrySet()) {
            String key = entry.getKey();
            final UserParameterValue value = entry.getValue();
            switch (WhenMappings.$EnumSwitchMapping$2[value.getDataType().ordinal()]) {
                case 1:
                    v8ValueObjectT.set(key, Double.valueOf(value.getFloatValue()));
                    break;
                case 2:
                    v8ValueObjectT.set(key, Integer.valueOf(value.getIntValue()));
                    break;
                case 3:
                    nVar.Uo(v8ValueObjectT, key, new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.qz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ScriptExecutorKt.userParamsAtTimeForScript$lambda$25$lambda$21(value, (V8ValueObject) obj);
                        }
                    });
                    break;
                case 4:
                    nVar.Uo(v8ValueObjectT, key, new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.Pl
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ScriptExecutorKt.userParamsAtTimeForScript$lambda$25$lambda$22(value, (V8ValueObject) obj);
                        }
                    });
                    break;
                case 5:
                    nVar.Uo(v8ValueObjectT, key, new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.Xo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ScriptExecutorKt.userParamsAtTimeForScript$lambda$25$lambda$23(value, (V8ValueObject) obj);
                        }
                    });
                    break;
                case 6:
                    nVar.Uo(v8ValueObjectT, key, new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ScriptExecutorKt.userParamsAtTimeForScript$lambda$25$lambda$24(value, (V8ValueObject) obj);
                        }
                    });
                    break;
                case 7:
                    v8ValueObjectT.set(key, Boolean.valueOf(value.getBooleanValue()));
                    break;
                case 8:
                    v8ValueObjectT.set(key, value.getTextureValue().toString());
                    break;
            }
        }
        for (Map.Entry<String, ? extends UserParameter> entry2 : parameters.entrySet()) {
            String key2 = entry2.getKey();
            UserParameter value2 = entry2.getValue();
            if (!parameterRefs.containsKey(key2)) {
                final KeyableUserParameterValue defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(value2);
                switch (WhenMappings.$EnumSwitchMapping$2[value2.getDataType().ordinal()]) {
                    case 1:
                        Intrinsics.checkNotNull(defaultKeyableUserParameterValue);
                        v8ValueObjectT.set(key2, Double.valueOf(((Number) KeyableKt.valueAtTime(defaultKeyableUserParameterValue.getFloatValue(), f3)).floatValue()));
                        break;
                    case 2:
                        Intrinsics.checkNotNull(defaultKeyableUserParameterValue);
                        v8ValueObjectT.set(key2, Integer.valueOf(defaultKeyableUserParameterValue.getIntValue()));
                        break;
                    case 3:
                        nVar.Uo(v8ValueObjectT, key2, new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.w6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ScriptExecutorKt.userParamsAtTimeForScript$lambda$30$lambda$26(defaultKeyableUserParameterValue, f3, (V8ValueObject) obj);
                            }
                        });
                        break;
                    case 4:
                        nVar.Uo(v8ValueObjectT, key2, new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.Ml
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ScriptExecutorKt.userParamsAtTimeForScript$lambda$30$lambda$27(defaultKeyableUserParameterValue, f3, (V8ValueObject) obj);
                            }
                        });
                        break;
                    case 5:
                        nVar.Uo(v8ValueObjectT, key2, new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.I28
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ScriptExecutorKt.userParamsAtTimeForScript$lambda$30$lambda$28(defaultKeyableUserParameterValue, f3, (V8ValueObject) obj);
                            }
                        });
                        break;
                    case 6:
                        nVar.Uo(v8ValueObjectT, key2, new Function1() { // from class: com.alightcreative.app.motion.scene.scripting.Wre
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ScriptExecutorKt.userParamsAtTimeForScript$lambda$30$lambda$29(defaultKeyableUserParameterValue, f3, (V8ValueObject) obj);
                            }
                        });
                        break;
                    case 7:
                        Intrinsics.checkNotNull(defaultKeyableUserParameterValue);
                        v8ValueObjectT.set(key2, Boolean.valueOf(defaultKeyableUserParameterValue.getBooleanValue()));
                        break;
                    case 8:
                        if (defaultKeyableUserParameterValue == null || (textureValue = defaultKeyableUserParameterValue.getTextureValue()) == null || (string = textureValue.toString()) == null) {
                            string = "";
                        }
                        v8ValueObjectT.set(key2, string);
                        break;
                }
            }
        }
        return v8ValueObjectT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userParamsAtTimeForScript$lambda$25$lambda$21(UserParameterValue userParameterValue, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        I.aC.rl(setObject, userParameterValue.getColorValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userParamsAtTimeForScript$lambda$25$lambda$22(UserParameterValue userParameterValue, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        I.aC.nr(setObject, userParameterValue.getVec2DValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userParamsAtTimeForScript$lambda$25$lambda$23(UserParameterValue userParameterValue, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        I.aC.O(setObject, userParameterValue.getVec3DValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userParamsAtTimeForScript$lambda$25$lambda$24(UserParameterValue userParameterValue, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        I.aC.J2(setObject, userParameterValue.getVec4DValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userParamsAtTimeForScript$lambda$30$lambda$26(KeyableUserParameterValue keyableUserParameterValue, float f3, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        Intrinsics.checkNotNull(keyableUserParameterValue);
        I.aC.rl(setObject, (SolidColor) KeyableKt.valueAtTime(keyableUserParameterValue.getColorValue(), f3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userParamsAtTimeForScript$lambda$30$lambda$27(KeyableUserParameterValue keyableUserParameterValue, float f3, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        Intrinsics.checkNotNull(keyableUserParameterValue);
        I.aC.nr(setObject, (Vector2D) KeyableKt.valueAtTime(keyableUserParameterValue.getVec2DValue(), f3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userParamsAtTimeForScript$lambda$30$lambda$28(KeyableUserParameterValue keyableUserParameterValue, float f3, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        Intrinsics.checkNotNull(keyableUserParameterValue);
        I.aC.O(setObject, (Vector3D) KeyableKt.valueAtTime(keyableUserParameterValue.getVec3DValue(), f3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userParamsAtTimeForScript$lambda$30$lambda$29(KeyableUserParameterValue keyableUserParameterValue, float f3, V8ValueObject setObject) throws JavetException {
        Intrinsics.checkNotNullParameter(setObject, "$this$setObject");
        Intrinsics.checkNotNull(keyableUserParameterValue);
        I.aC.J2(setObject, (Vector4D) KeyableKt.valueAtTime(keyableUserParameterValue.getVec4DValue(), f3));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ SceneElement runScripts$default(SceneElement sceneElement, float f3, int i2, int i3, Scene scene, Transform transform, float f4, RenderMode renderMode, Integer num, boolean z2, ScriptGroup scriptGroup, int i5, Object obj) {
        if ((i5 & 32) != 0) {
            f4 = f3;
        }
        if ((i5 & 64) != 0) {
            renderMode = null;
        }
        if ((i5 & 128) != 0) {
            num = 0;
        }
        if ((i5 & 256) != 0) {
            z2 = false;
        }
        if ((i5 & 512) != 0) {
            scriptGroup = ScriptGroup.All;
        }
        return runScripts(sceneElement, f3, i2, i3, scene, transform, f4, renderMode, num, z2, scriptGroup);
    }

    public static final SceneElement runScripts(SceneElement sceneElement, float f3, int i2, int i3, Scene scene, Transform prevFrameTf, float f4, RenderMode renderMode, Integer num, boolean z2, ScriptGroup runGroup) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(prevFrameTf, "prevFrameTf");
        Intrinsics.checkNotNullParameter(runGroup, "runGroup");
        ScriptArguments scriptArguments = new ScriptArguments(sceneElement, f3, i2, i3, scene, prevFrameTf, f4, renderMode, num, z2, runGroup);
        Map<ScriptArguments, SceneElement> map = runScriptsCache;
        SceneElement sceneElementRunScriptsInternal = map.get(scriptArguments);
        if (sceneElementRunScriptsInternal == null) {
            sceneElementRunScriptsInternal = runScriptsInternal(sceneElement, f3, i2, i3, scene, prevFrameTf, f4, renderMode, num, z2, runGroup);
            map.put(scriptArguments, sceneElementRunScriptsInternal);
        }
        SceneElement sceneElement2 = sceneElementRunScriptsInternal;
        if (map.size() > 5000) {
            map.clear();
        }
        return sceneElement2;
    }
}
