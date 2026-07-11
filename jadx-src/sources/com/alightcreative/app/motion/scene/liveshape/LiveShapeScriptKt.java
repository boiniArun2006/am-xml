package com.alightcreative.app.motion.scene.liveshape;

import android.util.LruCache;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.CBKnot;
import com.alightcreative.app.motion.scene.CompoundCubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.ImageCacheKt;
import com.alightcreative.app.motion.scene.OptionalVector2D;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.scripting.ACScript;
import com.alightcreative.app.motion.scene.scripting.ACScriptType;
import com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetBiConsumer;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\" \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\" \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\" \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/LiveShape;", "Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "getShapeOutline", "(Lcom/alightcreative/app/motion/scene/liveshape/LiveShape;)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "", "Lcom/alightcreative/app/motion/scene/liveshape/PositionedShapeHandle;", "getDefaultHandles", "(Lcom/alightcreative/app/motion/scene/liveshape/LiveShape;)Ljava/util/List;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "", "time", "(Lcom/alightcreative/app/motion/scene/SceneElement;F)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "getShapeHandles", "(Lcom/alightcreative/app/motion/scene/SceneElement;F)Ljava/util/List;", "LI/Dsr;", "makeScriptEnv", "(Lcom/alightcreative/app/motion/scene/liveshape/LiveShape;)LI/Dsr;", "Lcom/caoccao/javet/values/reference/V8ValueArray;", "scriptResult", "compoundCubicBSplineFromScriptResult", "(Lcom/caoccao/javet/values/reference/V8ValueArray;)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "Lcom/alightcreative/app/motion/scene/CubicBSpline;", "cubicBSplineFromScriptResult", "(Lcom/caoccao/javet/values/reference/V8ValueArray;)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "", "", "scriptEnvCache", "Ljava/util/Map;", "shapeDefaultOutlineCache", "defaultHandlesCache", "Landroid/util/LruCache;", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeInstanceDesc;", "outlineCache", "Landroid/util/LruCache;", "Lcom/alightcreative/app/motion/scene/liveshape/HInfo;", "HInfoZero", "Lcom/alightcreative/app/motion/scene/liveshape/HInfo;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveShapeScript.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveShapeScript.kt\ncom/alightcreative/app/motion/scene/liveshape/LiveShapeScriptKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SceneElement.kt\ncom/alightcreative/app/motion/scene/SceneElementKt\n*L\n1#1,297:1\n381#2,3:298\n381#2,7:301\n384#2,4:308\n381#2,3:312\n381#2,7:315\n384#2,4:340\n381#2,7:345\n381#2,7:356\n1611#3,9:322\n1863#3:331\n1864#3:334\n1620#3:335\n1557#3:336\n1628#3,3:337\n1557#3:352\n1628#3,3:353\n1#4:332\n1#4:333\n804#5:344\n804#5:363\n*S KotlinDebug\n*F\n+ 1 LiveShapeScript.kt\ncom/alightcreative/app/motion/scene/liveshape/LiveShapeScriptKt\n*L\n51#1:298,3\n53#1:301,7\n51#1:308,4\n69#1:312,3\n71#1:315,7\n69#1:340,4\n170#1:345,7\n151#1:356,7\n73#1:322,9\n73#1:331\n73#1:334\n73#1:335\n116#1:336\n116#1:337,3\n207#1:352\n207#1:353,3\n73#1:333\n147#1:344\n173#1:363\n*E\n"})
public final class LiveShapeScriptKt {
    private static final HInfo HInfoZero;
    private static final Map<String, I.Dsr> scriptEnvCache = new LinkedHashMap();
    private static final Map<String, CompoundCubicBSpline> shapeDefaultOutlineCache = new LinkedHashMap();
    private static final Map<String, List<PositionedShapeHandle>> defaultHandlesCache = new LinkedHashMap();
    private static final LruCache<ShapeInstanceDesc, CompoundCubicBSpline> outlineCache = new LruCache<>(128);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShapeHandleType.values().length];
            try {
                iArr[ShapeHandleType.f46106X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeHandleType.f46107Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeHandleType.XY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeHandleType.Angle.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShapeHandleType.Radius.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShapeHandleType.Axis.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ACScriptType.values().length];
            try {
                iArr2[ACScriptType.JS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CompoundCubicBSpline getShapeOutline(final LiveShape liveShape) {
        Intrinsics.checkNotNullParameter(liveShape, "<this>");
        CompoundCubicBSpline compoundCubicBSpline = shapeDefaultOutlineCache.get(liveShape.getId());
        if (compoundCubicBSpline != null) {
            return compoundCubicBSpline;
        }
        XoT.C.Uo(liveShape, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$0();
            }
        });
        Map<String, I.Dsr> map = scriptEnvCache;
        String id = liveShape.getId();
        I.Dsr dsrMakeScriptEnv = map.get(id);
        if (dsrMakeScriptEnv == null) {
            dsrMakeScriptEnv = makeScriptEnv(liveShape);
            map.put(id, dsrMakeScriptEnv);
        }
        CompoundCubicBSpline compoundCubicBSpline2 = (CompoundCubicBSpline) dsrMakeScriptEnv.xMQ(30000, new Function2() { // from class: com.alightcreative.app.motion.scene.liveshape.Ml
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$6(liveShape, (I.n) obj, (V8Runtime) obj2);
            }
        });
        XoT.C.Uo(liveShape, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$7();
            }
        });
        return compoundCubicBSpline2;
    }

    static {
        Vector2D.Companion companion = Vector2D.INSTANCE;
        HInfoZero = new HInfo(companion.getZERO(), companion.getZERO());
    }

    private static final CompoundCubicBSpline compoundCubicBSplineFromScriptResult(V8ValueArray v8ValueArray) {
        return new CompoundCubicBSpline(CollectionsKt.listOf(cubicBSplineFromScriptResult(v8ValueArray)));
    }

    private static final CubicBSpline cubicBSplineFromScriptResult(V8ValueArray v8ValueArray) throws Throwable {
        final ArrayList arrayList = new ArrayList();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        v8ValueArray.forEach(new IJavetBiConsumer() { // from class: com.alightcreative.app.motion.scene.liveshape.UGc
            @Override // com.caoccao.javet.interfaces.IJavetBiConsumer
            public final void accept(V8Value v8Value, V8Value v8Value2) throws JavetException {
                LiveShapeScriptKt.cubicBSplineFromScriptResult$lambda$45(arrayList, booleanRef, v8Value, v8Value2);
            }
        });
        return new CubicBSpline(arrayList, booleanRef.element, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cubicBSplineFromScriptResult$lambda$45(List list, Ref.BooleanRef booleanRef, V8Value v8Value, V8Value v8Value2) throws JavetException {
        OptionalVector2D optionalVector2DQie;
        if (v8Value2 instanceof V8ValueArray) {
            V8ValueArray v8ValueArray = (V8ValueArray) v8Value2;
            if (I.aC.xMQ(v8ValueArray)) {
                list.add(new CBKnot(I.aC.qie(v8ValueArray), null, null, 6, null));
                return;
            }
            return;
        }
        if (v8Value2 instanceof V8ValueObject) {
            V8ValueObject v8ValueObject = (V8ValueObject) v8Value2;
            if (!v8ValueObject.has(TtmlNode.TAG_P) || !I.aC.Uo(v8ValueObject, TtmlNode.TAG_P)) {
                if (v8ValueObject.has("closed")) {
                    booleanRef.element = v8ValueObject.getBoolean("closed").booleanValue();
                    return;
                }
                return;
            }
            V8Value v8Value3 = v8ValueObject.get(TtmlNode.TAG_P);
            try {
                V8ValueArray v8ValueArray2 = (V8ValueArray) v8Value3;
                Intrinsics.checkNotNull(v8ValueArray2);
                if (I.aC.xMQ(v8ValueArray2)) {
                    Vector2D vector2DQie = I.aC.qie(v8ValueArray2);
                    OptionalVector2D optionalVector2DQie2 = OptionalVector2D.NONE.INSTANCE;
                    if (((V8ValueObject) v8Value2).has("in") && I.aC.Uo((V8ValueObject) v8Value2, "in")) {
                        v8Value3 = ((V8ValueObject) v8Value2).get("in");
                        try {
                            V8ValueArray v8ValueArray3 = (V8ValueArray) v8Value3;
                            Intrinsics.checkNotNull(v8ValueArray3);
                            optionalVector2DQie = I.aC.xMQ(v8ValueArray3) ? I.aC.qie(v8ValueArray3) : optionalVector2DQie2;
                            Unit unit = Unit.INSTANCE;
                            AutoCloseableKt.closeFinally(v8Value3, null);
                        } finally {
                        }
                    } else {
                        optionalVector2DQie = optionalVector2DQie2;
                    }
                    if (((V8ValueObject) v8Value2).has("out") && I.aC.Uo((V8ValueObject) v8Value2, "out")) {
                        v8Value3 = ((V8ValueObject) v8Value2).get("out");
                        try {
                            V8ValueArray v8ValueArray4 = (V8ValueArray) v8Value3;
                            Intrinsics.checkNotNull(v8ValueArray4);
                            if (I.aC.xMQ(v8ValueArray4)) {
                                optionalVector2DQie2 = I.aC.qie(v8ValueArray4);
                            }
                            Unit unit2 = Unit.INSTANCE;
                            AutoCloseableKt.closeFinally(v8Value3, null);
                        } finally {
                        }
                    }
                    list.add(new CBKnot(vector2DQie, optionalVector2DQie, optionalVector2DQie2));
                }
                Unit unit3 = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(v8Value3, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    AutoCloseableKt.closeFinally(v8Value3, th);
                }
            }
        }
    }

    public static final List<PositionedShapeHandle> getDefaultHandles(final LiveShape liveShape) {
        Vector2D vector2D;
        Intrinsics.checkNotNullParameter(liveShape, "<this>");
        List<PositionedShapeHandle> list = defaultHandlesCache.get(liveShape.getId());
        if (list != null) {
            return list;
        }
        Map<String, I.Dsr> map = scriptEnvCache;
        String id = liveShape.getId();
        I.Dsr dsrMakeScriptEnv = map.get(id);
        if (dsrMakeScriptEnv == null) {
            dsrMakeScriptEnv = makeScriptEnv(liveShape);
            map.put(id, dsrMakeScriptEnv);
        }
        I.Dsr dsr = dsrMakeScriptEnv;
        List<UserParameter> parameters = liveShape.getParameters();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = parameters.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UserParameter userParameter = (UserParameter) it.next();
            KeyableUserParameterValue defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter);
            Pair pair = defaultKeyableUserParameterValue != null ? TuplesKt.to(userParameter.getName(), defaultKeyableUserParameterValue) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        final Map map2 = MapsKt.toMap(arrayList);
        final Map map3 = (Map) I.Dsr.mUb(dsr, 0, new Function2() { // from class: com.alightcreative.app.motion.scene.liveshape.l3D
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiveShapeScriptKt.getDefaultHandles$lambda$19$lambda$15(map2, liveShape, (I.n) obj, (V8Runtime) obj2);
            }
        }, 1, null);
        List<ShapeHandle> handles = liveShape.getHandles();
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(handles, 10));
        for (ShapeHandle shapeHandle : handles) {
            HInfo hInfo = (HInfo) map3.get(shapeHandle.getId());
            if (hInfo == null) {
                hInfo = HInfoZero;
            }
            Vector2D pos = hInfo.getPos();
            switch (WhenMappings.$EnumSwitchMapping$0[shapeHandle.getType().ordinal()]) {
                case 1:
                    vector2D = new Vector2D(1.0f, 0.0f);
                    break;
                case 2:
                    vector2D = new Vector2D(0.0f, 1.0f);
                    break;
                case 3:
                    vector2D = new Vector2D(1.0f, 1.0f);
                    break;
                case 4:
                    vector2D = GeometryKt.perpCCw(GeometryKt.normalize(hInfo.getPos()));
                    break;
                case 5:
                    vector2D = GeometryKt.normalize(hInfo.getPos());
                    break;
                case 6:
                    vector2D = GeometryKt.normalize(hInfo.getAxis());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(new PositionedShapeHandle(shapeHandle, pos, vector2D));
        }
        XoT.C.Uo(liveShape, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.getDefaultHandles$lambda$19$lambda$18(map3, liveShape, arrayList2);
            }
        });
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getDefaultHandles$lambda$19$lambda$15(Map map, LiveShape liveShape, I.n run, V8Runtime it) throws JavetException {
        Intrinsics.checkNotNullParameter(run, "$this$run");
        Intrinsics.checkNotNullParameter(it, "it");
        V8Value v8ValueInvoke = run.J2().getGlobalObject().invoke("getHandles", ScriptExecutorKt.userParamsAtTimeForScript(run, UserParameterKt.atTime(map, 0.0f), liveShape.getParamsById(), 0.0f));
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            ((V8ValueObject) v8ValueInvoke).forEach(new IJavetBiConsumer() { // from class: com.alightcreative.app.motion.scene.liveshape.qz
                @Override // com.caoccao.javet.interfaces.IJavetBiConsumer
                public final void accept(V8Value v8Value, V8Value v8Value2) throws JavetException {
                    LiveShapeScriptKt.getDefaultHandles$lambda$19$lambda$15$lambda$14$lambda$13(linkedHashMap, (V8ValueString) v8Value, v8Value2);
                }
            });
            AutoCloseableKt.closeFinally(v8ValueInvoke, null);
            return linkedHashMap;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDefaultHandles$lambda$19$lambda$15$lambda$14$lambda$13(Map map, V8ValueString v8ValueString, V8Value v8Value) throws JavetException {
        Vector2D zero;
        if (v8Value instanceof V8ValueArray) {
            V8ValueArray v8ValueArray = (V8ValueArray) v8Value;
            if (v8ValueArray.getLength() == 2) {
                Float f3 = v8ValueArray.getFloat(0);
                Float f4 = v8ValueArray.getFloat(1);
                String primitive = v8ValueString.toPrimitive();
                Intrinsics.checkNotNull(f3);
                float fFloatValue = f3.floatValue();
                Intrinsics.checkNotNull(f4);
                map.put(primitive, new HInfo(new Vector2D(fFloatValue, f4.floatValue()), Vector2D.INSTANCE.getZERO()));
                return;
            }
            return;
        }
        if (v8Value instanceof V8ValueObject) {
            V8ValueObject v8ValueObject = (V8ValueObject) v8Value;
            if (v8ValueObject.has("x") && v8ValueObject.has("y")) {
                Float f5 = v8ValueObject.getFloat("x");
                Float f6 = v8ValueObject.getFloat("y");
                if (v8ValueObject.has("axis") && I.aC.Uo(v8ValueObject, "axis")) {
                    V8Value v8Value2 = v8ValueObject.get("axis");
                    try {
                        V8ValueArray v8ValueArray2 = (V8ValueArray) v8Value2;
                        if (v8ValueArray2.getLength() == 2) {
                            Float f7 = v8ValueArray2.getFloat(0);
                            Float f8 = v8ValueArray2.getFloat(1);
                            Intrinsics.checkNotNull(f7);
                            float fFloatValue2 = f7.floatValue();
                            Intrinsics.checkNotNull(f8);
                            zero = new Vector2D(fFloatValue2, f8.floatValue());
                        } else {
                            zero = Vector2D.INSTANCE.getZERO();
                        }
                        AutoCloseableKt.closeFinally(v8Value2, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AutoCloseableKt.closeFinally(v8Value2, th);
                            throw th2;
                        }
                    }
                } else {
                    zero = Vector2D.INSTANCE.getZERO();
                }
                String primitive2 = v8ValueString.toPrimitive();
                Intrinsics.checkNotNull(f5);
                float fFloatValue3 = f5.floatValue();
                Intrinsics.checkNotNull(f6);
                map.put(primitive2, new HInfo(new Vector2D(fFloatValue3, f6.floatValue()), zero));
            }
        }
    }

    public static final List<PositionedShapeHandle> getShapeHandles(final SceneElement sceneElement, final float f3) {
        Vector2D vector2D;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        if (sceneElement.getLiveShape().getId() == null) {
            return CollectionsKt.emptyList();
        }
        final LiveShape shape = LiveShapeKt.getShape(sceneElement.getLiveShape());
        if (shape == null) {
            return CollectionsKt.emptyList();
        }
        Map<String, I.Dsr> map = scriptEnvCache;
        String id = sceneElement.getLiveShape().getId();
        I.Dsr dsrMakeScriptEnv = map.get(id);
        if (dsrMakeScriptEnv == null) {
            dsrMakeScriptEnv = makeScriptEnv(shape);
            map.put(id, dsrMakeScriptEnv);
        }
        final Map map2 = (Map) I.Dsr.mUb(dsrMakeScriptEnv, 0, new Function2() { // from class: com.alightcreative.app.motion.scene.liveshape.Xo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiveShapeScriptKt.getShapeHandles$lambda$30(sceneElement, f3, shape, (I.n) obj, (V8Runtime) obj2);
            }
        }, 1, null);
        List<ShapeHandle> handles = shape.getHandles();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(handles, 10));
        for (ShapeHandle shapeHandle : handles) {
            HInfo hInfo = (HInfo) map2.get(shapeHandle.getId());
            if (hInfo == null) {
                hInfo = HInfoZero;
            }
            Vector2D pos = hInfo.getPos();
            switch (WhenMappings.$EnumSwitchMapping$0[shapeHandle.getType().ordinal()]) {
                case 1:
                    vector2D = new Vector2D(1.0f, 0.0f);
                    break;
                case 2:
                    vector2D = new Vector2D(0.0f, 1.0f);
                    break;
                case 3:
                    vector2D = new Vector2D(1.0f, 1.0f);
                    break;
                case 4:
                    vector2D = GeometryKt.perpCCw(GeometryKt.normalize(hInfo.getPos()));
                    break;
                case 5:
                    vector2D = GeometryKt.normalize(hInfo.getPos());
                    break;
                case 6:
                    vector2D = GeometryKt.normalize(hInfo.getAxis());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new PositionedShapeHandle(shapeHandle, pos, vector2D));
        }
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.eO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.getShapeHandles$lambda$33(map2, shape, arrayList);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getShapeHandles$lambda$30(SceneElement sceneElement, float f3, LiveShape liveShape, I.n run, V8Runtime it) throws JavetException {
        Intrinsics.checkNotNullParameter(run, "$this$run");
        Intrinsics.checkNotNullParameter(it, "it");
        V8Value v8ValueInvoke = run.J2().getGlobalObject().invoke("getHandles", ScriptExecutorKt.userParamsAtTimeForScript(run, UserParameterKt.atTimeAccum(sceneElement.getLiveShape().getParamValues(), f3, (sceneElement.getEndTime() - sceneElement.getStartTime()) / 1000.0f, liveShape.getParamsById()), liveShape.getParamsById(), f3));
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            ((V8ValueObject) v8ValueInvoke).forEach(new IJavetBiConsumer() { // from class: com.alightcreative.app.motion.scene.liveshape.aC
                @Override // com.caoccao.javet.interfaces.IJavetBiConsumer
                public final void accept(V8Value v8Value, V8Value v8Value2) throws JavetException {
                    LiveShapeScriptKt.getShapeHandles$lambda$30$lambda$29$lambda$28(linkedHashMap, (V8ValueString) v8Value, v8Value2);
                }
            });
            AutoCloseableKt.closeFinally(v8ValueInvoke, null);
            return linkedHashMap;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getShapeHandles$lambda$30$lambda$29$lambda$28(Map map, V8ValueString v8ValueString, V8Value v8Value) throws JavetException {
        Vector2D zero;
        if (v8Value instanceof V8ValueArray) {
            V8ValueArray v8ValueArray = (V8ValueArray) v8Value;
            if (I.aC.xMQ(v8ValueArray)) {
                map.put(v8ValueString.getValue(), new HInfo(I.aC.qie(v8ValueArray), Vector2D.INSTANCE.getZERO()));
                return;
            }
            return;
        }
        if (v8Value instanceof V8ValueObject) {
            V8ValueObject v8ValueObject = (V8ValueObject) v8Value;
            if (v8ValueObject.has("x") && v8ValueObject.has("y")) {
                Float f3 = v8ValueObject.getFloat("x");
                Float f4 = v8ValueObject.getFloat("y");
                if (v8ValueObject.has("axis") && I.aC.Uo(v8ValueObject, "axis")) {
                    V8Value v8Value2 = v8ValueObject.get("axis");
                    try {
                        V8ValueArray v8ValueArray2 = (V8ValueArray) v8Value2;
                        Intrinsics.checkNotNull(v8ValueArray2);
                        zero = I.aC.xMQ(v8ValueArray2) ? I.aC.qie(v8ValueArray2) : Vector2D.INSTANCE.getZERO();
                        AutoCloseableKt.closeFinally(v8Value2, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AutoCloseableKt.closeFinally(v8Value2, th);
                            throw th2;
                        }
                    }
                } else {
                    zero = Vector2D.INSTANCE.getZERO();
                }
                String value = v8ValueString.getValue();
                Intrinsics.checkNotNull(f3);
                float fFloatValue = f3.floatValue();
                Intrinsics.checkNotNull(f4);
                map.put(value, new HInfo(new Vector2D(fFloatValue, f4.floatValue()), zero));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompoundCubicBSpline getShapeOutline$lambda$25(SceneElement sceneElement, final LiveShape liveShape, final Map map, final float f3) {
        Map<String, I.Dsr> map2 = scriptEnvCache;
        String id = sceneElement.getLiveShape().getId();
        I.Dsr dsrMakeScriptEnv = map2.get(id);
        if (dsrMakeScriptEnv == null) {
            dsrMakeScriptEnv = makeScriptEnv(liveShape);
            map2.put(id, dsrMakeScriptEnv);
        }
        return (CompoundCubicBSpline) I.Dsr.mUb(dsrMakeScriptEnv, 0, new Function2() { // from class: com.alightcreative.app.motion.scene.liveshape.w6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiveShapeScriptKt.getShapeOutline$lambda$25$lambda$24(map, liveShape, f3, (I.n) obj, (V8Runtime) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompoundCubicBSpline getShapeOutline$lambda$25$lambda$24(Map map, LiveShape liveShape, float f3, I.n run, V8Runtime it) throws JavetException {
        Intrinsics.checkNotNullParameter(run, "$this$run");
        Intrinsics.checkNotNullParameter(it, "it");
        V8Value v8ValueInvoke = run.J2().getGlobalObject().invoke("getPath", ScriptExecutorKt.userParamsAtTimeForScript(run, map, liveShape.getParamsById(), f3));
        try {
            V8ValueArray v8ValueArray = (V8ValueArray) v8ValueInvoke;
            Intrinsics.checkNotNull(v8ValueArray);
            final CompoundCubicBSpline compoundCubicBSplineCompoundCubicBSplineFromScriptResult = compoundCubicBSplineFromScriptResult(v8ValueArray);
            XoT.C.Uo(run, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiveShapeScriptKt.getShapeOutline$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(compoundCubicBSplineCompoundCubicBSplineFromScriptResult);
                }
            });
            AutoCloseableKt.closeFinally(v8ValueInvoke, null);
            return compoundCubicBSplineCompoundCubicBSplineFromScriptResult;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getShapeOutline$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(CompoundCubicBSpline compoundCubicBSpline) {
        return "getShapeOutline >> " + compoundCubicBSpline;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getShapeOutline$lambda$8$lambda$0() {
        return "LiveShape:getShapeOutline: IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompoundCubicBSpline getShapeOutline$lambda$8$lambda$6(LiveShape liveShape, I.n run, V8Runtime it) throws JavetException {
        Intrinsics.checkNotNullParameter(run, "$this$run");
        Intrinsics.checkNotNullParameter(it, "it");
        XoT.C.Uo(run, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$6$lambda$2();
            }
        });
        V8Value v8ValueInvoke = run.J2().getGlobalObject().invoke("getPath", ScriptExecutorKt.userParamsAtTimeForScript(run, MapsKt.emptyMap(), liveShape.getParamsById(), 0.0f));
        try {
            V8ValueArray v8ValueArray = (V8ValueArray) v8ValueInvoke;
            Intrinsics.checkNotNull(v8ValueArray);
            CompoundCubicBSpline compoundCubicBSplineCompoundCubicBSplineFromScriptResult = compoundCubicBSplineFromScriptResult(v8ValueArray);
            AutoCloseableKt.closeFinally(v8ValueInvoke, null);
            XoT.C.Uo(run, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$6$lambda$5$lambda$4();
                }
            });
            return compoundCubicBSplineCompoundCubicBSplineFromScriptResult;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getShapeOutline$lambda$8$lambda$6$lambda$2() {
        return "LiveShape:getShapeOutline:Run IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getShapeOutline$lambda$8$lambda$6$lambda$5$lambda$4() {
        return "LiveShape:getShapeOutline:Run OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getShapeOutline$lambda$8$lambda$7() {
        return "LiveShape:getShapeOutline: OUT";
    }

    private static final I.Dsr makeScriptEnv(final LiveShape liveShape) {
        I.Dsr dsr = new I.Dsr("liveShape:" + liveShape.getId());
        XoT.C.Uo(liveShape, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$34(liveShape);
            }
        });
        I.Dsr.mUb(dsr, 0, new Function2() { // from class: com.alightcreative.app.motion.scene.liveshape.z
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39(liveShape, (I.n) obj, (V8Runtime) obj2);
            }
        }, 1, null);
        XoT.C.Uo(liveShape, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.QJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$40();
            }
        });
        return dsr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeScriptEnv$lambda$41$lambda$39(final LiveShape liveShape, I.n run, V8Runtime v82) throws JavetException {
        Intrinsics.checkNotNullParameter(run, "$this$run");
        Intrinsics.checkNotNullParameter(v82, "v8");
        XoT.C.Uo(run, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39$lambda$35();
            }
        });
        V8ValueObject v8ValueObjectT = run.t();
        ScriptExecutorKt.registerAlightMotionScriptMethods(v82, v8ValueObjectT, liveShape.getId());
        XoT.C.Uo(run, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39$lambda$36();
            }
        });
        v82.getGlobalObject().set("AM", v8ValueObjectT);
        XoT.C.Uo(run, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.fuX
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39$lambda$37(liveShape);
            }
        });
        for (ACScript aCScript : liveShape.getScripts()) {
            if (WhenMappings.$EnumSwitchMapping$1[aCScript.getType().ordinal()] != 1) {
                throw new NotImplementedError(null, 1, null);
            }
            ScriptExecutorKt.executeVoidScript(v82, aCScript.getSource());
        }
        XoT.C.Uo(run, new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39$lambda$38();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeScriptEnv$lambda$41$lambda$39$lambda$35() {
        return "LiveShape:makeScriptEnv:Run: IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeScriptEnv$lambda$41$lambda$39$lambda$36() {
        return "LiveShape:makeScriptEnv:Register: IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeScriptEnv$lambda$41$lambda$39$lambda$38() {
        return "LiveShape:makeScriptEnv:Run: Out";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeScriptEnv$lambda$41$lambda$40() {
        return "LiveShape:makeScriptEnv: OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDefaultHandles$lambda$19$lambda$18(Map map, LiveShape liveShape, List list) {
        return "getShapeHandles: handlePositions=" + map + " shape.handles=" + liveShape.getHandles() + " result=" + list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getShapeHandles$lambda$33(Map map, LiveShape liveShape, List list) {
        return "getShapeHandles: handlePositions=" + map + " shape.handles=" + liveShape.getHandles() + " result=" + list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeScriptEnv$lambda$41$lambda$34(LiveShape liveShape) {
        return "LiveShape:makeScriptEnv: IN (scripts=" + liveShape.getScripts() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String makeScriptEnv$lambda$41$lambda$39$lambda$37(LiveShape liveShape) {
        return "LiveShape:makeScriptEnv:ACLoadScripts scripts=" + liveShape.getScripts();
    }

    public static final CompoundCubicBSpline getShapeOutline(final SceneElement sceneElement, final float f3) {
        final LiveShape shape;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        if (sceneElement.getLiveShape().getId() != null && (shape = LiveShapeKt.getShape(sceneElement.getLiveShape())) != null) {
            final Map<String, UserParameterValue> mapAtTimeAccum = UserParameterKt.atTimeAccum(sceneElement.getLiveShape().getParamValues(), f3, (sceneElement.getEndTime() - sceneElement.getStartTime()) / 1000.0f, shape.getParamsById());
            return (CompoundCubicBSpline) ImageCacheKt.getOrPut((LruCache<ShapeInstanceDesc, VALUE>) outlineCache, new ShapeInstanceDesc(shape.getId(), mapAtTimeAccum), new Function0() { // from class: com.alightcreative.app.motion.scene.liveshape.s4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiveShapeScriptKt.getShapeOutline$lambda$25(sceneElement, shape, mapAtTimeAccum, f3);
                }
            });
        }
        return CubicBSplineKt.valueAtTime(sceneElement.getOutline(), f3);
    }
}
