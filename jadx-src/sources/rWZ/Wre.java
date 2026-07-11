package rWZ;

import JK.w6;
import UO6.iF;
import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.easing.EasingKt;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableCBKnot;
import com.alightcreative.app.motion.scene.KeyableCubicBSpline;
import com.alightcreative.app.motion.scene.KeyableVector2D;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeKt;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import kgE.K;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SceneElementType.values().length];
            try {
                iArr[SceneElementType.Shape.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SceneElementType.Drawing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SceneElementType.Text.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SceneElementType.Audio.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SceneElementType.Camera.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SceneElementType.NullObject.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SceneElementType.Scene.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DataType.values().length];
            try {
                iArr2[DataType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DataType.SOLID_COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DataType.VEC2.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DataType.VEC3.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DataType.VEC4.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DataType.QUAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[DataType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[DataType.TEXTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[DataType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[DataType.NONE.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final pq.Ml J2(SceneElement sceneElement) {
        pq.Ml ml = new pq.Ml();
        ty(ml, qie(sceneElement));
        return ml;
    }

    private static final pq.w6 KN(List list) {
        pq.w6 w6Var = new pq.w6();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EasingKt.getExportSnapshotLabel(((Keyframe) it.next()).getEasing()));
        }
        Set mutableSet = CollectionsKt.toMutableSet(arrayList);
        final Function1 function1 = new Function1() { // from class: rWZ.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Wre.xMQ((String) obj));
            }
        };
        mutableSet.removeIf(new Predicate() { // from class: rWZ.I28
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Wre.mUb(function1, obj);
            }
        });
        Iterator it2 = mutableSet.iterator();
        while (it2.hasNext()) {
            w6Var.t((String) it2.next());
        }
        return w6Var;
    }

    private static final Map az(KeyableVisualEffectRef keyableVisualEffectRef) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, KeyableUserParameterValue> entry : keyableVisualEffectRef.getParameters().entrySet()) {
            String key = entry.getKey();
            KeyableUserParameterValue value = entry.getValue();
            switch (j.$EnumSwitchMapping$1[value.getDataType().ordinal()]) {
                case 1:
                    linkedHashMap.put(key, value.getFloatValue());
                    break;
                case 2:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                case 3:
                    linkedHashMap.put(key, value.getColorValue());
                    break;
                case 4:
                    linkedHashMap.put(key, value.getVec2DValue());
                    break;
                case 5:
                    linkedHashMap.put(key, value.getVec3DValue());
                    break;
                case 6:
                    linkedHashMap.put(key, value.getVec4DValue());
                    break;
                case 7:
                    linkedHashMap.put(key, value.getQuatValue());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return linkedHashMap;
    }

    private static final long gh(int i2, UO6.w6 w6Var, Scene scene, File file) {
        long size = 0;
        switch (i2) {
            case 2131361914:
                return ((long) scene.getWidth()) * ((long) scene.getHeight());
            case 2131361915:
                if (w6Var == null) {
                    return 0L;
                }
                return (long) ((((double) (w6Var.J2() * w6Var.O())) * (((double) (iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()) / 100)) * (((double) SceneKt.getDuration(scene)) / 1000.0d))) / 3);
            case 2131361916:
                if (w6Var == null) {
                    return 0L;
                }
                int iN = iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()) / 100;
                return (long) (w6Var.t() == j.fuX.f45850n ? (((((long) (w6Var.J2() * w6Var.O())) * 4) * ((long) iN)) * (((double) SceneKt.getDuration(scene)) / 1000.0d)) / 4 : ((((((long) (w6Var.J2() * w6Var.O())) * 3) * ((long) iN)) * (((double) SceneKt.getDuration(scene)) / 1000.0d)) / ((double) (102 - w6Var.n()))) / 3);
            case 2131361919:
                if (w6Var == null) {
                    return 0L;
                }
                int iMin = Math.min(w6Var.J2(), w6Var.O());
                int iMin2 = Math.min(scene.getWidth(), scene.getHeight());
                return (long) (((((long) UO6.n.n(((scene.getWidth() * iMin) / iMin2) * ((scene.getHeight() * iMin) / iMin2), iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()) / 100, w6Var)) + (w6Var.J2() * w6Var.O() >= 840000 ? 196608L : w6Var.J2() * w6Var.O() >= 144000 ? 131072L : 24576L)) * (((double) SceneKt.getDuration(scene)) / 1000.0d)) / ((double) 8));
            case 2131361920:
                return file.length();
            case 2131361970:
                long size2 = 0;
                long size3 = 0;
                for (Map.Entry<Uri, MediaUriInfo> entry : scene.getMediaInfo().entrySet()) {
                    String mime = entry.getValue().getMime();
                    if (mime == null) {
                        mime = "";
                    }
                    if (StringsKt.startsWith$default(mime, "video", false, 2, (Object) null)) {
                        size += entry.getValue().getSize();
                    } else if (StringsKt.startsWith$default(mime, "image", false, 2, (Object) null)) {
                        size2 += entry.getValue().getSize();
                    } else if (StringsKt.startsWith$default(mime, "audio", false, 2, (Object) null)) {
                        size3 += entry.getValue().getSize();
                    }
                }
                return file.length() + size + size2 + size3;
            default:
                return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final n nr(int i2, String str, File projectFile, Scene scene, Context context, UO6.w6 w6Var, kgE.fuX iapManager, boolean z2) {
        int i3;
        Integer numValueOf;
        int i5;
        Double dValueOf;
        int i7;
        int i8;
        String str2;
        boolean z3;
        j.fuX fuxT;
        j.Pl plRl;
        int i9;
        String projectId = str;
        Scene scene2 = scene;
        int i10 = 1;
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(projectFile, "projectFile");
        Intrinsics.checkNotNullParameter(scene2, "scene");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        pq.w6 w6Var2 = new pq.w6();
        pq.w6 w6Var3 = new pq.w6();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        for (SceneElement sceneElement : scene2.getElements()) {
            CollectionsKt.emptyList();
            i11 += i10;
            w6Var3.O(Uo(sceneElement));
            switch (j.$EnumSwitchMapping$0[sceneElement.getType().ordinal()]) {
                case 1:
                    if (LiveShapeKt.getShape(sceneElement.getLiveShape()) != null) {
                        i19++;
                    } else {
                        i18++;
                    }
                    break;
                case 2:
                    i12 += i10;
                    break;
                case 3:
                    i13 += i10;
                    break;
                case 4:
                    i14 += i10;
                    break;
                case 5:
                    i15++;
                    break;
                case 6:
                    i16++;
                    break;
                case 7:
                    i17++;
                    String templatePPId = sceneElement.getTemplatePPId();
                    if (templatePPId != null) {
                        w6Var2.t(templatePPId);
                        Unit unit = Unit.INSTANCE;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (sceneElement.getType().getHasFillImage() && sceneElement.getFillImage() != null) {
                i20++;
            }
            if (sceneElement.getType().getHasFillVideo() && sceneElement.getFillVideo() != null) {
                i21++;
            }
            if (sceneElement.getSpeedMap().getKeyframes().size() > i10) {
                i22 = i10;
            }
            if (sceneElement.getType().getHasNestedScene()) {
                i9 = i10;
                arrayList.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            } else {
                i9 = i10;
            }
            i10 = i9;
        }
        int i23 = i10;
        while (true) {
            Pair pair = (Pair) XoT.qz.n(arrayList);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    Pair pair2 = pair;
                    i11++;
                    w6Var3.O(Uo(sceneElement2));
                    switch (j.$EnumSwitchMapping$0[sceneElement2.getType().ordinal()]) {
                        case 1:
                            if (LiveShapeKt.getShape(sceneElement2.getLiveShape()) != null) {
                                i19++;
                            } else {
                                i18++;
                            }
                            break;
                        case 2:
                            i12++;
                            break;
                        case 3:
                            i13++;
                            break;
                        case 4:
                            i14++;
                            break;
                        case 5:
                            i15++;
                            break;
                        case 6:
                            i16++;
                            break;
                        case 7:
                            i17++;
                            String templatePPId2 = sceneElement2.getTemplatePPId();
                            if (templatePPId2 != null) {
                                w6Var2.t(templatePPId2);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (sceneElement2.getType().getHasFillImage() && sceneElement2.getFillImage() != null) {
                        i20++;
                    }
                    if (sceneElement2.getType().getHasFillVideo() && sceneElement2.getFillVideo() != null) {
                        i21++;
                    }
                    pq.w6 w6Var4 = w6Var2;
                    int i24 = i23;
                    if (sceneElement2.getSpeedMap().getKeyframes().size() > i24) {
                        i22 = i24;
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                    i23 = i24;
                    pair = pair2;
                    w6Var2 = w6Var4;
                }
            }
            pq.w6 w6Var5 = w6Var2;
            int i25 = i23;
            int i26 = i11;
            int i27 = i12;
            int i28 = i13;
            int i29 = i14;
            int i30 = i15;
            int i31 = i16;
            int i32 = i17;
            int i33 = i18;
            int i34 = i20;
            int i35 = i21;
            boolean z4 = i22;
            if (pair == null) {
                File cacheDir = context.getCacheDir();
                Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                File fileResolve = FilesKt.resolve(cacheDir, "export");
                if (!fileResolve.exists()) {
                    fileResolve.mkdir();
                }
                StatFs statFs = new StatFs(fileResolve.getAbsolutePath());
                long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                long jGh = gh(i2, w6Var, scene2, projectFile);
                int iJ2 = w6Var != null ? w6Var.J2() : scene2.getExportWidth();
                int iO = w6Var != null ? w6Var.O() : scene2.getExportHeight();
                String string = (w6Var == null || (plRl = w6Var.rl()) == null) ? null : plRl.toString();
                String string2 = (w6Var == null || (fuxT = w6Var.t()) == null) ? null : fuxT.toString();
                if (w6Var != null) {
                    i3 = 100;
                    numValueOf = Integer.valueOf(iF.n(scene2.getFramesPerHundredSeconds(), w6Var.nr()) / 100);
                } else {
                    i3 = 100;
                    numValueOf = null;
                }
                if (w6Var != null) {
                    i5 = iJ2;
                    dValueOf = Double.valueOf(((double) w6Var.n()) / ((double) i3));
                } else {
                    i5 = iJ2;
                    dValueOf = null;
                }
                String strO = rWZ.j.O(scene.getType());
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                Double d2 = dValueOf;
                boolean zContains = jVar.getImportedProjectIds().contains(projectId);
                boolean zContains2 = jVar.getImportedXmlIds().contains(projectId);
                int duration = SceneKt.getDuration(scene);
                int width = scene.getWidth();
                int height = scene.getHeight();
                int framesPerHundredSeconds = scene.getFramesPerHundredSeconds() / 100;
                String string3 = scene.getBackground().toString();
                if (iapManager.Uo().contains(K.f70079o) || jVar.getUnlockedFeatures().contains(new w6.I28(projectId).nr())) {
                    i7 = i19;
                    i8 = framesPerHundredSeconds;
                    str2 = string3;
                    z3 = false;
                } else {
                    i7 = i19;
                    i8 = framesPerHundredSeconds;
                    str2 = string3;
                    z3 = true;
                }
                return new n(availableBlocksLong, jGh, null, i2, i5, iO, string, string2, numValueOf, d2, projectId, strO, zContains, zContains2, duration, width, height, i8, str2, z3, null, null, w6Var3, i26, i7, i33, i28, i27, i29, i30, i31, i32, i34, i35, w6Var5, z2, z4);
            }
            projectId = str;
            scene2 = scene;
            i11 = i26;
            i18 = i33;
            i13 = i28;
            i12 = i27;
            i14 = i29;
            i15 = i30;
            i16 = i31;
            i17 = i32;
            i20 = i34;
            i21 = i35;
            i22 = z4 ? 1 : 0;
            i23 = i25;
            w6Var2 = w6Var5;
        }
    }

    private static final Map qie(SceneElement sceneElement) {
        LiveShape shape;
        List<UserParameter> parameters;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (sceneElement.getType().getHasTransform()) {
            linkedHashMap.put("location", sceneElement.getTransform().getLocation());
            linkedHashMap.put("pivot", sceneElement.getTransform().getPivot());
            linkedHashMap.put("scale", sceneElement.getTransform().getScale());
            linkedHashMap.put("rotation", sceneElement.getTransform().getRotation());
            linkedHashMap.put("opacity", sceneElement.getTransform().getOpacity());
            linkedHashMap.put("skew", sceneElement.getTransform().getSkew());
        }
        if (sceneElement.getType().getHasFillColor()) {
            linkedHashMap.put("fill_color", sceneElement.getFillColor());
        }
        if (sceneElement.getType().getHasVolume()) {
            linkedHashMap.put("gain", sceneElement.getGain());
        }
        if (sceneElement.getType().getHasOutline()) {
            linkedHashMap.put("stroke_size", sceneElement.getStroke().getSize());
        }
        int i2 = 0;
        if (sceneElement.getType().getHasOutline() && sceneElement.getLiveShape().getId() == null) {
            int i3 = 0;
            for (Object obj : sceneElement.getOutline().getContours()) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int i7 = 0;
                for (Object obj2 : ((KeyableCubicBSpline) obj).getKnots()) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    KeyableCBKnot keyableCBKnot = (KeyableCBKnot) obj2;
                    if (keyableCBKnot.getP().getKeyed()) {
                        linkedHashMap.put("outline_contour_" + i3 + "_knot_" + i7 + "_p", keyableCBKnot.getP());
                    }
                    if ((keyableCBKnot.getCurveIn() instanceof KeyableVector2D) && ((KeyableVector2D) keyableCBKnot.getCurveIn()).getKeyed()) {
                        linkedHashMap.put("outline_contour_" + i3 + "_knot_" + i7 + "_curvein", keyableCBKnot.getCurveIn());
                    }
                    if ((keyableCBKnot.getCurveOut() instanceof KeyableVector2D) && ((KeyableVector2D) keyableCBKnot.getCurveOut()).getKeyed()) {
                        linkedHashMap.put("outline_contour_" + i3 + "_knot_" + i7 + "_curveout", keyableCBKnot.getCurveOut());
                    }
                    i7 = i8;
                }
                i3 = i5;
            }
        }
        if (sceneElement.getType().getHasBorderAndShadow()) {
            linkedHashMap.put("shadow_color", sceneElement.getDropShadow().getColor());
            linkedHashMap.put("shadow_size", sceneElement.getDropShadow().getSize());
            linkedHashMap.put("shadow_alpha", sceneElement.getDropShadow().getAlpha());
            linkedHashMap.put("shadow_offset", sceneElement.getDropShadow().getOffset());
            int size = sceneElement.getBorders().size();
            for (int i9 = 0; i9 < size; i9++) {
                linkedHashMap.put("border_" + i9 + "_color", sceneElement.getBorders().get(i9).getColor());
                linkedHashMap.put("border_" + i9 + "_size", sceneElement.getBorders().get(i9).getSize());
            }
        }
        if (sceneElement.getLiveShape().getId() != null && (shape = LiveShapeKt.getShape(sceneElement.getLiveShape())) != null && (parameters = shape.getParameters()) != null) {
            for (Object obj3 : parameters) {
                int i10 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                UserParameter userParameter = (UserParameter) obj3;
                String name = userParameter.getName();
                KeyableUserParameterValue keyableUserParameterValue = sceneElement.getLiveShape().getParamValues().get(name);
                if (keyableUserParameterValue != null) {
                    switch (j.$EnumSwitchMapping$1[userParameter.getDataType().ordinal()]) {
                        case 1:
                            linkedHashMap.put("liveshape_" + name, keyableUserParameterValue.getFloatValue());
                            break;
                        case 2:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            break;
                        case 3:
                            linkedHashMap.put("liveshape_" + name, keyableUserParameterValue.getColorValue());
                            break;
                        case 4:
                            linkedHashMap.put("liveshape_" + name, keyableUserParameterValue.getVec2DValue());
                            break;
                        case 5:
                            linkedHashMap.put("liveshape_" + name, keyableUserParameterValue.getVec3DValue());
                            break;
                        case 6:
                            linkedHashMap.put("liveshape_" + name, keyableUserParameterValue.getVec4DValue());
                            break;
                        case 7:
                            linkedHashMap.put("liveshape_" + name, keyableUserParameterValue.getQuatValue());
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                i2 = i10;
            }
        }
        if (sceneElement.getType() == SceneElementType.Camera) {
            linkedHashMap.put("camera_fov", sceneElement.getCameraProperties().getFov());
            linkedHashMap.put("camera_focus_distance", sceneElement.getCameraProperties().getFocusDistance());
            linkedHashMap.put("camera_focus_blur_strength", sceneElement.getCameraProperties().getFocusBlurStrength());
            linkedHashMap.put("camera_focus_depth_of_field", sceneElement.getCameraProperties().getFocusDepthOfField());
            linkedHashMap.put("camera_fog_color", sceneElement.getCameraProperties().getFogColor());
            linkedHashMap.put("camera_fog_far_z", sceneElement.getCameraProperties().getFogFarZ());
            linkedHashMap.put("camera_fog_near_z", sceneElement.getCameraProperties().getFogNearZ());
        }
        linkedHashMap.put("speed_value", sceneElement.getSpeedMap());
        return MapsKt.toMap(linkedHashMap);
    }

    private static final pq.w6 t(SceneElement sceneElement) {
        pq.w6 w6Var = new pq.w6();
        for (KeyableVisualEffectRef keyableVisualEffectRef : SceneElementKt.getVisualEffectsInOrder(sceneElement)) {
            pq.Ml ml = new pq.Ml();
            ml.O("id", keyableVisualEffectRef.getId());
            ty(ml, az(keyableVisualEffectRef));
            w6Var.O(ml);
        }
        return w6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it, "linear");
    }

    private static final pq.Ml Uo(SceneElement sceneElement) {
        LiveShape shape;
        String name = null;
        if (sceneElement.getType() == SceneElementType.Shape && (shape = LiveShapeKt.getShape(sceneElement.getLiveShape())) != null) {
            name = shape.getName();
        }
        pq.w6 w6Var = new pq.w6();
        if (sceneElement.getClippingMask()) {
            w6Var.t("clipping_mask");
        }
        if (sceneElement.getHidden()) {
            w6Var.t("hidden");
        }
        if (sceneElement.getType().getHasFillVideo() && sceneElement.getFillVideo() != null) {
            w6Var.t("video");
        }
        if (sceneElement.getType().getHasFillImage() && sceneElement.getFillImage() != null) {
            w6Var.t("image");
        }
        if (sceneElement.getParent() != null || SceneKt.getHasLayerParenting(sceneElement.getNestedScene())) {
            w6Var.t("layer_parenting");
        }
        pq.Ml ml = new pq.Ml();
        ml.O("id", String.valueOf(sceneElement.getId()));
        if (sceneElement.getParent() != null) {
            ml.O("group_id", sceneElement.getParent().toString());
        }
        if (sceneElement.getPresetId() != null) {
            ml.O("preset_id", sceneElement.getPresetId());
        }
        ml.O("type", rWZ.j.nr(sceneElement.getType()));
        if (name != null) {
            ml.O("shape_type", name);
        }
        ml.nr(TtmlNode.START, Integer.valueOf(sceneElement.getStartTime()));
        ml.nr("duration", Integer.valueOf(sceneElement.getEndTime() - sceneElement.getStartTime()));
        if (sceneElement.getBlendingMode() != BlendingMode.NORMAL) {
            ml.O("blending_mode", sceneElement.getBlendingMode().getId());
        }
        if (!w6Var.Uo().isEmpty()) {
            ml.J2("flags", w6Var);
        }
        pq.Ml mlJ2 = J2(sceneElement);
        if (!mlJ2.n().isEmpty()) {
            ml.Uo("keyframes", mlJ2);
        }
        pq.w6 w6VarT = t(sceneElement);
        if (!w6VarT.Uo().isEmpty()) {
            ml.J2("effects", w6VarT);
        }
        return ml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mUb(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final void ty(pq.Ml ml, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Keyable keyable = (Keyable) entry.getValue();
            int size = keyable.getKeyframes().size();
            if (size >= 2) {
                pq.Ml ml2 = new pq.Ml();
                ml2.nr("kf", Integer.valueOf(size));
                pq.w6 w6VarKN = KN(keyable.getKeyframes());
                if (!w6VarKN.Uo().isEmpty()) {
                    ml2.J2("easings", w6VarKN);
                }
                Unit unit = Unit.INSTANCE;
                ml.Uo(str, ml2);
            }
        }
    }
}
