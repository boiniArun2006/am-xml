package yc;

import LdY.Ml;
import android.graphics.Matrix;
import androidx.fragment.app.Fragment;
import cS.Zv.SzFNXybiSxdx;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneSelection;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeKt;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.alightcreative.app.motion.scene.liveshape.PositionedShapeHandle;
import com.alightcreative.app.motion.scene.liveshape.ShapeHandleType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.PointType;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ji {
    private UserParameter J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Vector2D f75765O;
    private Ml.j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Fragment f75766n;
    private PositionedShapeHandle nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f75767t;
    private boolean xMQ;

    public Ji(Fragment fragment, boolean z2, Function1 function1) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f75766n = fragment;
        this.rl = z2;
        this.f75767t = function1;
        this.f75765O = Vector2D.INSTANCE.getZERO();
        this.Uo = LdY.Ml.Ik.n();
        this.xMQ = true;
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                iArr[ShapeHandleType.Axis.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShapeHandleType.Angle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShapeHandleType.Radius.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final SceneHolder J2() {
        return HW.C.e(this.f75766n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0191 A[LOOP:3: B:44:0x018b->B:46:0x0191, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SceneElement KN(oA.j jVar, boolean z2, final Vector2D vector2D, Vector2D vector2D2, Vector2D vector2D3, LiveShape liveShape, Ji ji, final float f3, final Scene updatedScene, final SceneElement selectedEl) {
        Iterator it;
        Iterator it2;
        Intrinsics.checkNotNullParameter(updatedScene, "updatedScene");
        Intrinsics.checkNotNullParameter(selectedEl, "selectedEl");
        Object objT = jVar.t(selectedEl, new Function1() { // from class: yc.Il5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ji.mUb(updatedScene, selectedEl, f3, vector2D, (Keyable) obj);
            }
        });
        if (z2) {
            Vector2D vector2DTimes = GeometryKt.times(GeometryKt.minus(vector2D, vector2D2), vector2D3);
            SceneElement sceneElement = (SceneElement) objT;
            objT = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement.getTransform(), vector2DTimes.getX(), vector2DTimes.getY()), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
        } else {
            List<UserParameter> parameters = liveShape.getParameters();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = parameters.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                UserParameter userParameter = (UserParameter) it3.next();
                UserParameter.Point point = userParameter instanceof UserParameter.Point ? (UserParameter.Point) userParameter : null;
                if (point != null) {
                    arrayList.add(point);
                }
            }
            ArrayList<UserParameter.Point> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                UserParameter.Point point2 = (UserParameter.Point) obj;
                if (point2.getPointType() != PointType.SIZE && point2.getPointType() != PointType.OFFSET) {
                    arrayList2.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
            for (UserParameter.Point point3 : arrayList2) {
                String name = point3.getName();
                KeyableUserParameterValue keyableUserParameterValue = ((SceneElement) objT).getLiveShape().getParamValues().get(point3.getName());
                if (keyableUserParameterValue == null) {
                    keyableUserParameterValue = new KeyableUserParameterValue(point3.getDefaultValue());
                }
                Pair pair = TuplesKt.to(name, keyableUserParameterValue);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            if (!selectedEl.getTransform().getLocation().getKeyed() && !arrayList2.isEmpty()) {
                Collection collectionValues = linkedHashMap.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    Collection collectionValues2 = linkedHashMap.values();
                    final ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues2, 10));
                    it = collectionValues2.iterator();
                    while (it.hasNext()) {
                    }
                    it2 = arrayList3.iterator();
                    if (it2.hasNext()) {
                    }
                } else {
                    Iterator it4 = collectionValues.iterator();
                    while (it4.hasNext()) {
                        if (((KeyableUserParameterValue) it4.next()).getVec2DValue().getKeyed()) {
                            break;
                        }
                    }
                    Collection collectionValues22 = linkedHashMap.values();
                    final ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues22, 10));
                    it = collectionValues22.iterator();
                    while (it.hasNext()) {
                        arrayList32.add((Vector2D) ((Keyframe) CollectionsKt.first((List) ((KeyableUserParameterValue) it.next()).getVec2DValue().getKeyframes())).getValue());
                    }
                    it2 = arrayList32.iterator();
                    if (it2.hasNext()) {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = GeometryKt.plus((Vector2D) next, (Vector2D) it2.next());
                    }
                    final Vector2D vector2DDiv = GeometryKt.div((Vector2D) next, arrayList32.size());
                    XoT.C.Uo(ji, new Function0() { // from class: yc.eh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Ji.xMQ(vector2DDiv, arrayList32);
                        }
                    });
                    if (!Intrinsics.areEqual(vector2DDiv, Vector2D.INSTANCE.getZERO())) {
                        SceneElement sceneElement2 = (SceneElement) objT;
                        SceneElement sceneElementCopy$default = SceneElement.copy$default(sceneElement2, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement2.getTransform(), vector2DDiv.getX(), vector2DDiv.getY()), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
                        SceneElement sceneElementCopy$default2 = sceneElementCopy$default;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            String str = (String) entry.getKey();
                            KeyableUserParameterValue keyableUserParameterValue2 = (KeyableUserParameterValue) entry.getValue();
                            sceneElementCopy$default2 = SceneElement.copy$default(sceneElementCopy$default2, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, LiveShapeRef.copy$default(sceneElementCopy$default2.getLiveShape(), null, MapsKt.plus(sceneElementCopy$default2.getLiveShape().getParamValues(), TuplesKt.to(str, KeyableUserParameterValue.copy$default(keyableUserParameterValue2, null, null, 0, null, KeyableKt.keyable(GeometryKt.minus((Vector2D) ((Keyframe) CollectionsKt.first((List) keyableUserParameterValue2.getVec2DValue().getKeyframes())).getValue(), vector2DDiv)), null, null, null, false, null, null, 2031, null))), 1, null), 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65537, 127, null);
                        }
                        objT = sceneElementCopy$default2;
                    }
                }
            }
        }
        return (SceneElement) objT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement gh(oA.j jVar, final float f3, final float f4, final Scene updatedScene, final SceneElement selectedEl) {
        Intrinsics.checkNotNullParameter(updatedScene, "updatedScene");
        Intrinsics.checkNotNullParameter(selectedEl, "selectedEl");
        return (SceneElement) jVar.t(selectedEl, new Function1() { // from class: yc.rd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ji.qie(updatedScene, selectedEl, f3, f4, (Keyable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable mUb(Scene scene, SceneElement sceneElement, float f3, Vector2D vector2D, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithValueForTime(it, scene, sceneElement, f3, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable qie(Scene scene, SceneElement sceneElement, float f3, float f4, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithValueForTime(it, scene, sceneElement, f3, Float.valueOf(f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(Vector2D vector2D, List list) {
        return "SEH centerPoint=" + vector2D + " pointLocations=" + list;
    }

    public final void HI(boolean z2) {
        this.xMQ = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Uo(a motionEvent) {
        final LiveShape shape;
        Scene scene;
        SceneHolder sceneHolderJ2;
        nKE userPreviewMode;
        UserParameter userParameter;
        SceneHolder sceneHolderJ22;
        SceneHolder sceneHolderJ23;
        SceneHolder sceneHolderJ24;
        SceneSelection selection;
        float x2;
        float x3;
        float f3;
        float x4;
        float y2;
        final float fCoerceIn;
        Vector2D vector2DPlus;
        nKE nkeN;
        Object next;
        Function1 function1;
        SceneSelection empty_scene_selection;
        SceneSelection selection2;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Vector2D vector2DRl = motionEvent.rl();
        SceneElement sceneElementNHg = HW.C.nHg(this.f75766n);
        final boolean z2 = false;
        if (sceneElementNHg == null || (shape = LiveShapeKt.getShape(sceneElementNHg.getLiveShape())) == null) {
            return false;
        }
        final float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this.f75766n));
        SceneHolder sceneHolderJ25 = J2();
        if (sceneHolderJ25 != null && (scene = sceneHolderJ25.get_scene()) != null && (sceneHolderJ2 = J2()) != null && (userPreviewMode = sceneHolderJ2.getUserPreviewMode()) != null) {
            Object obj = null;
            if (motionEvent.n().getActionMasked() == 0) {
                this.nr = null;
                SceneHolder sceneHolderJ26 = J2();
                if (sceneHolderJ26 == null || sceneHolderJ26.getEditMode() != 2131362617) {
                    return false;
                }
                SceneHolder sceneHolderJ27 = J2();
                if (sceneHolderJ27 == null || (nkeN = sceneHolderJ27.getUserPreviewMode()) == null) {
                    nkeN = nKE.ck.n();
                }
                Transform transformValueAtTime = CameraElementKt.applyCameraAndParenting(sceneElementNHg, scene, fFractionalTime, nkeN).getTransform().valueAtTime(fFractionalTime);
                Matrix matrix = transformValueAtTime.getMatrix();
                List<PositionedShapeHandle> shapeHandles = LiveShapeScriptKt.getShapeHandles(sceneElementNHg, SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this.f75766n)));
                Iterator<T> it = shapeHandles.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        float length = GeometryKt.getLength(GeometryKt.minus(GeometryKt.times(((PositionedShapeHandle) next).getPosition(), matrix), vector2DRl));
                        do {
                            Object next2 = it.next();
                            float length2 = GeometryKt.getLength(GeometryKt.minus(GeometryKt.times(((PositionedShapeHandle) next2).getPosition(), matrix), vector2DRl));
                            if (Float.compare(length, length2) > 0) {
                                next = next2;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                PositionedShapeHandle positionedShapeHandle = (PositionedShapeHandle) next;
                if (positionedShapeHandle == null) {
                    return false;
                }
                float length3 = GeometryKt.getLength(GeometryKt.minus(GeometryKt.times(positionedShapeHandle.getPosition(), matrix), vector2DRl));
                Vector3D location = transformValueAtTime.getLocation();
                if (GeometryKt.getLength(GeometryKt.minus(vector2DRl, new Vector2D(location.getX(), location.getY()))) < length3 || length3 / Math.min(scene.getWidth(), scene.getHeight()) > 0.15d) {
                    return false;
                }
                Iterator<T> it2 = shape.getParameters().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next3 = it2.next();
                    if (Intrinsics.areEqual(((UserParameter) next3).getName(), positionedShapeHandle.getParamId())) {
                        obj = next3;
                        break;
                    }
                }
                UserParameter userParameter2 = (UserParameter) obj;
                if (userParameter2 == null) {
                    return false;
                }
                this.Uo = HW.C.xMQ(this.f75766n);
                this.f75765O = vector2DRl;
                this.nr = positionedShapeHandle;
                this.J2 = userParameter2;
                SceneHolder sceneHolderJ28 = J2();
                if (sceneHolderJ28 != null) {
                    SceneHolder sceneHolderJ29 = J2();
                    if (sceneHolderJ29 == null || (selection2 = sceneHolderJ29.getSelection()) == null || (empty_scene_selection = SceneSelection.copy$default(selection2, null, null, null, Integer.valueOf(shapeHandles.indexOf(positionedShapeHandle)), null, null, null, null, false, null, null, null, 4087, null)) == null) {
                        empty_scene_selection = SceneKt.getEMPTY_SCENE_SELECTION();
                    }
                    sceneHolderJ28.setSelection(empty_scene_selection);
                    Unit unit = Unit.INSTANCE;
                }
                SceneHolder sceneHolderJ210 = J2();
                if (sceneHolderJ210 != null) {
                    sceneHolderJ210.setEditMode(2131362618);
                    Unit unit2 = Unit.INSTANCE;
                }
                if (this.rl && (function1 = this.f75767t) != null) {
                    function1.invoke(userParameter2.getName());
                    Unit unit3 = Unit.INSTANCE;
                }
                return true;
            }
            if (this.nr == null || (userParameter = this.J2) == null) {
                return false;
            }
            Transform transformValueAtTime2 = CameraElementKt.applyCameraAndParenting(sceneElementNHg, scene, fFractionalTime, userPreviewMode).getTransform().valueAtTime(fFractionalTime);
            PositionedShapeHandle positionedShapeHandle2 = this.nr;
            if (positionedShapeHandle2 == null) {
                return false;
            }
            PositionedShapeHandle positionedShapeHandleTimes = LiveShapeKt.times(positionedShapeHandle2, transformValueAtTime2);
            int actionMasked = motionEvent.n().getActionMasked();
            if (actionMasked == 1) {
                this.Uo.n();
                this.Uo = LdY.Ml.Ik.n();
                sceneHolderJ22 = J2();
                if (sceneHolderJ22 != null) {
                    sceneHolderJ22.setEditMode(2131362617);
                    Unit unit4 = Unit.INSTANCE;
                }
                if (!this.rl && (sceneHolderJ23 = J2()) != null) {
                    sceneHolderJ24 = J2();
                    if (sceneHolderJ24 != null || (selection = sceneHolderJ24.getSelection()) == null || (empty_scene_selection = SceneSelection.copy$default(selection, null, null, null, null, null, null, null, null, false, null, null, null, 4087, null)) == null) {
                        SceneSelection empty_scene_selection2 = SceneKt.getEMPTY_SCENE_SELECTION();
                    }
                    sceneHolderJ23.setSelection(empty_scene_selection2);
                    Unit unit5 = Unit.INSTANCE;
                }
                this.nr = null;
                this.J2 = null;
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return true;
                }
                this.Uo.n();
                this.Uo = LdY.Ml.Ik.n();
                sceneHolderJ22 = J2();
                if (sceneHolderJ22 != null) {
                }
                if (!this.rl) {
                    sceneHolderJ24 = J2();
                    if (sceneHolderJ24 != null) {
                        SceneSelection empty_scene_selection22 = SceneKt.getEMPTY_SCENE_SELECTION();
                        sceneHolderJ23.setSelection(empty_scene_selection22);
                        Unit unit52 = Unit.INSTANCE;
                    }
                }
                this.nr = null;
                this.J2 = null;
            } else {
                Vector2D vector2DN = LIz.n(GeometryKt.minus(vector2DRl, this.f75765O), scene, sceneElementNHg, HW.C.WPU(this.f75766n), userPreviewMode, true);
                Vector3D location2 = transformValueAtTime2.getLocation();
                Vector2D vector2DDiv = GeometryKt.div(GeometryKt.minus(vector2DRl, new Vector2D(location2.getX(), location2.getY())), transformValueAtTime2.getScale());
                Vector2D vector2D = this.f75765O;
                Vector3D location3 = transformValueAtTime2.getLocation();
                Vector2D vector2DDiv2 = GeometryKt.div(GeometryKt.minus(vector2D, new Vector2D(location3.getX(), location3.getY())), transformValueAtTime2.getScale());
                float fAtan2 = (float) ((((double) (((float) Math.atan2(vector2DDiv.getX(), vector2DDiv.getY())) - ((float) Math.atan2(vector2DDiv2.getX(), vector2DDiv2.getY())))) * 180.0d) / 3.141592653589793d);
                float length4 = GeometryKt.getLength(vector2DDiv) - GeometryKt.getLength(vector2DDiv2);
                if (fAtan2 > 180.0f) {
                    fAtan2 -= 360.0f;
                } else if (fAtan2 < -180.0f) {
                    fAtan2 += 360.0f;
                }
                this.f75765O = vector2DRl;
                Vector2D vector2D2 = (positionedShapeHandleTimes.getInvertX() && positionedShapeHandleTimes.getInvertY()) ? new Vector2D(-1.0f, -1.0f) : (!positionedShapeHandleTimes.getInvertX() || positionedShapeHandleTimes.getInvertY()) ? (positionedShapeHandleTimes.getInvertX() || !positionedShapeHandleTimes.getInvertY()) ? Vector2D.INSTANCE.getONE() : new Vector2D(1.0f, -1.0f) : new Vector2D(-1.0f, 1.0f);
                if (userParameter instanceof UserParameter.Point) {
                    n nVar = new PropertyReference1Impl() { // from class: yc.Ji.n
                        {
                            String str = SzFNXybiSxdx.wsprdazZuymBkeS;
                        }

                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((SceneElement) obj2).getLiveShape();
                        }
                    };
                    w6 w6Var = new PropertyReference1Impl() { // from class: yc.Ji.w6
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((LiveShapeRef) obj2).getParamValues();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), nVar.getReturnType(), nVar), w6Var);
                    UserParameter.Point point = (UserParameter.Point) userParameter;
                    Pair pair = TuplesKt.to(point.getName(), new KeyableUserParameterValue(point.getDefaultValue()));
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = aCVar.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                    Ml ml = new PropertyReference1Impl() { // from class: yc.Ji.Ml
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec2DValue();
                        }
                    };
                    final oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ml.getReturnType(), i28, ml);
                    final Vector2D vector2D3 = (Vector2D) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), fFractionalTime);
                    if (point.getPointType() == PointType.SIZE && LiveShapeKt.isDirectional(positionedShapeHandleTimes.getType()) && !this.KN) {
                        z2 = true;
                    }
                    float f4 = z2 ? 0.5f : 1.0f;
                    ShapeHandleType type2 = positionedShapeHandleTimes.getType();
                    int[] iArr = j.$EnumSwitchMapping$0;
                    switch (iArr[type2.ordinal()]) {
                        case 1:
                            vector2DPlus = GeometryKt.plus(vector2D3, GeometryKt.times(new Vector2D(vector2DN.getX() * f4, 0.0f), vector2D2));
                            break;
                        case 2:
                            vector2DPlus = GeometryKt.plus(vector2D3, GeometryKt.times(new Vector2D(0.0f, vector2DN.getY() * f4), vector2D2));
                            break;
                        case 3:
                            vector2DPlus = GeometryKt.plus(vector2D3, GeometryKt.times(GeometryKt.times(vector2DN, f4), vector2D2));
                            break;
                        case 4:
                            throw new NotImplementedError(null, 1, null);
                        case 5:
                            throw new NotImplementedError(null, 1, null);
                        case 6:
                            throw new NotImplementedError(null, 1, null);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    Vector2D vector2DCoerceIn = GeometryKt.coerceIn(vector2DPlus, point.getMinOffset(), point.getMaxOffset());
                    if (positionedShapeHandleTimes.getLockRatio() && this.xMQ) {
                        int i2 = iArr[positionedShapeHandleTimes.getType().ordinal()];
                        if (i2 == 1) {
                            vector2DCoerceIn = Vector2D.copy$default(vector2DCoerceIn, 0.0f, (vector2DCoerceIn.getX() * vector2D3.getY()) / vector2D3.getX(), 1, null);
                        } else if (i2 == 2) {
                            vector2DCoerceIn = Vector2D.copy$default(vector2DCoerceIn, (vector2DCoerceIn.getY() * vector2D3.getX()) / vector2D3.getY(), 0.0f, 2, null);
                        } else if (i2 == 3) {
                            vector2DCoerceIn = GeometryKt.div(GeometryKt.plus(Vector2D.copy$default(vector2DCoerceIn, (vector2DCoerceIn.getY() * vector2D3.getX()) / vector2D3.getY(), 0.0f, 2, null), Vector2D.copy$default(vector2DCoerceIn, 0.0f, (vector2DCoerceIn.getX() * vector2D3.getY()) / vector2D3.getX(), 1, null)), 2.0f);
                        }
                    }
                    if (!Intrinsics.areEqual(vector2DCoerceIn, vector2D3)) {
                        final Vector2D vector2D4 = vector2DCoerceIn;
                        final Vector2D vector2D5 = vector2D2;
                        HW.C.D(this.f75766n, new Function2() { // from class: yc.g62
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return Ji.KN(aCVar2, z2, vector2D4, vector2D3, vector2D5, shape, this, fFractionalTime, (Scene) obj2, (SceneElement) obj3);
                            }
                        });
                    }
                } else {
                    Vector2D vector2D6 = vector2D2;
                    if (userParameter instanceof UserParameter.Spinner) {
                        I28 i282 = new PropertyReference1Impl() { // from class: yc.Ji.I28
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj2) {
                                return ((SceneElement) obj2).getLiveShape();
                            }
                        };
                        Wre wre = new PropertyReference1Impl() { // from class: yc.Ji.Wre
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj2) {
                                return ((LiveShapeRef) obj2).getParamValues();
                            }
                        };
                        oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), i282.getReturnType(), i282), wre);
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        Pair pair2 = TuplesKt.to(spinner.getName(), new KeyableUserParameterValue(spinner.getDefaultValue()));
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                        KType type3 = aCVar3.nr().getArguments().get(0).getType();
                        Intrinsics.checkNotNull(type3);
                        oA.I28 i283 = new oA.I28(orCreateKotlinClass2, type3, aCVar3, pair2.getFirst(), pair2.getSecond());
                        CN3 cn3 = new PropertyReference1Impl() { // from class: yc.Ji.CN3
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj2) {
                                return ((KeyableUserParameterValue) obj2).getFloatValue();
                            }
                        };
                        final oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), i283, cn3);
                        float fFloatValue = ((Number) KeyableKt.valueAtTime((Keyable) aCVar4.get(sceneElementNHg), fFractionalTime)).floatValue();
                        switch (j.$EnumSwitchMapping$0[positionedShapeHandleTimes.getType().ordinal()]) {
                            case 1:
                                x2 = vector2DN.getX();
                                x3 = vector2D6.getX();
                                f3 = fFloatValue + (x2 * x3);
                                fCoerceIn = RangesKt.coerceIn(f3, spinner.getMinValue(), spinner.getMaxValue());
                                if (fCoerceIn != fFloatValue) {
                                    HW.C.D(this.f75766n, new Function2() { // from class: yc.b
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            return Ji.gh(aCVar4, fFractionalTime, fCoerceIn, (Scene) obj2, (SceneElement) obj3);
                                        }
                                    });
                                }
                                break;
                            case 2:
                                x2 = vector2DN.getY();
                                x3 = vector2D6.getY();
                                f3 = fFloatValue + (x2 * x3);
                                fCoerceIn = RangesKt.coerceIn(f3, spinner.getMinValue(), spinner.getMaxValue());
                                if (fCoerceIn != fFloatValue) {
                                }
                                break;
                            case 3:
                                x4 = GeometryKt.times(vector2DN, vector2D6).getX() + fFloatValue;
                                y2 = GeometryKt.times(vector2DN, vector2D6).getY();
                                f3 = x4 + y2;
                                fCoerceIn = RangesKt.coerceIn(f3, spinner.getMinValue(), spinner.getMaxValue());
                                if (fCoerceIn != fFloatValue) {
                                }
                                break;
                            case 4:
                                x4 = (GeometryKt.times(vector2DN, vector2D6).getX() * positionedShapeHandleTimes.getAxis().getX()) + fFloatValue;
                                y2 = GeometryKt.times(vector2DN, vector2D6).getY() * positionedShapeHandleTimes.getAxis().getY();
                                f3 = x4 + y2;
                                fCoerceIn = RangesKt.coerceIn(f3, spinner.getMinValue(), spinner.getMaxValue());
                                if (fCoerceIn != fFloatValue) {
                                }
                                break;
                            case 5:
                                f3 = fFloatValue + fAtan2;
                                fCoerceIn = RangesKt.coerceIn(f3, spinner.getMinValue(), spinner.getMaxValue());
                                if (fCoerceIn != fFloatValue) {
                                }
                                break;
                            case 6:
                                f3 = length4 + fFloatValue;
                                fCoerceIn = RangesKt.coerceIn(f3, spinner.getMinValue(), spinner.getMaxValue());
                                if (fCoerceIn != fFloatValue) {
                                }
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void az(String name) {
        Object next;
        SceneSelection empty_scene_selection;
        SceneSelection selection;
        Intrinsics.checkNotNullParameter(name, "name");
        SceneElement sceneElementNHg = HW.C.nHg(this.f75766n);
        if (sceneElementNHg == null) {
            return;
        }
        List<PositionedShapeHandle> shapeHandles = LiveShapeScriptKt.getShapeHandles(sceneElementNHg, SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this.f75766n)));
        Iterator<T> it = shapeHandles.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((PositionedShapeHandle) next).getParamId(), name)) {
                    break;
                }
            }
        }
        PositionedShapeHandle positionedShapeHandle = (PositionedShapeHandle) next;
        SceneHolder sceneHolderJ2 = J2();
        if (sceneHolderJ2 != null) {
            SceneHolder sceneHolderJ22 = J2();
            if (sceneHolderJ22 == null || (selection = sceneHolderJ22.getSelection()) == null) {
                empty_scene_selection = SceneKt.getEMPTY_SCENE_SELECTION();
            } else {
                empty_scene_selection = SceneSelection.copy$default(selection, null, null, null, positionedShapeHandle != null ? Integer.valueOf(shapeHandles.indexOf(positionedShapeHandle)) : null, null, null, null, null, false, null, null, null, 4087, null);
                if (empty_scene_selection == null) {
                }
            }
            sceneHolderJ2.setSelection(empty_scene_selection);
        }
    }

    public final void ty(boolean z2) {
        this.KN = z2;
    }

    public /* synthetic */ Ji(Fragment fragment, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : function1);
    }
}
