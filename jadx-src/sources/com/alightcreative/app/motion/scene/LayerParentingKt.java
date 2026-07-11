package com.alightcreative.app.motion.scene;

import androidx.media3.database.Kr.FlTC;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.applovin.sdk.AppLovinEventParameters;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a@\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a@\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002\u001a(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\t*\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001cH\u0002\u001at\u0010\u001f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002\u001a$\u0010(\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001cH\u0002\u001aP\u0010,\u001a\u00020-2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010.\u001a\u00020*H\u0002\u001aT\u0010,\u001a\u00020-*\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002\u001a\u001c\u0010/\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001cH\u0002\u001a$\u00100\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0001H\u0002\u001a\u001a\u00102\u001a\u000203*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u001a\u00104\u001a\u00020\u0014*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00105\u001a\u000206\u001a)\u00107\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00108\u001a\u00020\t¢\u0006\u0002\u00109\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"emptyLongArray", "", "deg2rad", "", "applyLayerParenting", "Lcom/alightcreative/app/motion/scene/SceneElement;", "scene", "Lcom/alightcreative/app/motion/scene/Scene;", "time", "", "getBendSolutionHorizontal", "Lcom/alightcreative/app/motion/scene/Vector3D;", "u", "v", "r", "angleValue", "adjOffset", "bounds", "Lcom/alightcreative/app/motion/scene/Rectangle;", "flag", "", "getBendSolutionVertical", "getUpperAngle", "inAngle", "highLimit", "getLowerAngle", "lowLimit", "oppositeType", "", "localTime", "globalTime", "getBendPosRot", "originType", AppLovinEventParameters.REVENUE_AMOUNT, "offset", "parentElement", "startU", "startV", "baseU", "baseV", "getDockedInfo", "inPos", "Lcom/alightcreative/app/motion/scene/Vector2D;", "dockingTime", "getDockedUVAngle", "Lcom/alightcreative/app/motion/scene/PosPos;", "pos", "getInitialGlobalPos", "applyParentingInternal", "seenIds", "getParentTransform", "Lcom/alightcreative/app/motion/scene/Transform;", "checkParent", "parentID", "", "updateParent", "t", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/Scene;Ljava/lang/Long;F)Lcom/alightcreative/app/motion/scene/SceneElement;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayerParenting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerParenting.kt\ncom/alightcreative/app/motion/scene/LayerParentingKt\n+ 2 Geometry.kt\ncom/alightcreative/app/motion/scene/GeometryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,643:1\n114#2:644\n114#2:647\n105#2:648\n114#2:649\n114#2:652\n106#2:656\n106#2:662\n105#2:665\n105#2:678\n105#2:679\n105#2:680\n295#3,2:645\n295#3,2:653\n1755#3,3:658\n1557#3:666\n1628#3,3:667\n1557#3:670\n1628#3,3:671\n1557#3:674\n1628#3,3:675\n216#4,2:650\n216#4:655\n217#4:657\n216#4:661\n217#4:663\n1#5:664\n*S KotlinDebug\n*F\n+ 1 LayerParenting.kt\ncom/alightcreative/app/motion/scene/LayerParentingKt\n*L\n157#1:644\n158#1:647\n166#1:648\n174#1:649\n203#1:652\n404#1:656\n503#1:662\n588#1:665\n593#1:678\n600#1:679\n602#1:680\n158#1:645,2\n351#1:653,2\n421#1:658,3\n618#1:666\n618#1:667,3\n626#1:670\n626#1:671,3\n634#1:674\n634#1:675,3\n176#1:650,2\n356#1:655\n356#1:657\n433#1:661\n433#1:663\n*E\n"})
public final class LayerParentingKt {
    public static final double deg2rad = 0.017453292519943295d;
    private static final long[] emptyLongArray = new long[0];

    private static final PosPos getDockedUVAngle(SceneElement sceneElement, Scene scene, int i2, float f3, float f4, int i3, float f5, float f6, Vector2D vector2D) {
        float f7;
        float lowerAngle;
        float lowerAngle2 = f3;
        Rectangle rectangleBoundsInScene = SceneElementKt.boundsInScene(sceneElement, scene);
        double x2 = ((double) ((vector2D.getX() - rectangleBoundsInScene.getCx()) / rectangleBoundsInScene.getSize().getX())) + 0.5d;
        double cy = ((double) (((-vector2D.getY()) + rectangleBoundsInScene.getCy()) / rectangleBoundsInScene.getSize().getY())) + 0.5d;
        Vector2D vector2D2 = new Vector2D((float) x2, (float) cy);
        Vector3D vector3D = new Vector3D(vector2D2.getX(), vector2D2.getY(), 0.0f);
        if (Math.abs(lowerAngle2) >= 0.01d) {
            float f8 = 0.99f * f4;
            float x3 = rectangleBoundsInScene.getSize().getX() / rectangleBoundsInScene.getSize().getY();
            if (i2 == 0) {
                double d2 = f8;
                if (x2 >= d2) {
                    lowerAngle2 = getUpperAngle(lowerAngle2, f5, f8);
                } else if (i3 != 0 && d2 > 0.0d) {
                    lowerAngle2 = getLowerAngle(lowerAngle2, f6, f8, i3);
                }
                vector3D = getDockedUVAngle$getHorizontalUVAngle(cy, x3, x2, lowerAngle2, f8);
            } else if (i2 == 1) {
                float f9 = 1.0f - f8;
                float lowerAngle3 = -lowerAngle2;
                if (x2 <= f9) {
                    lowerAngle3 = getUpperAngle(lowerAngle3, f5, f8);
                } else if (i3 != 0 && f8 > 0.0d) {
                    lowerAngle3 = getLowerAngle(lowerAngle3, f6, f8, i3);
                }
                vector3D = getDockedUVAngle$getHorizontalUVAngle(cy, x3, x2, lowerAngle3, f9);
            } else if (i2 == 2) {
                float f10 = 1.0f - f8;
                if (cy <= f10) {
                    lowerAngle = getUpperAngle(lowerAngle2, f5, f8);
                } else if (i3 == 0 || f8 <= 0.0d) {
                    f7 = lowerAngle2;
                    vector3D = getDockedUVAngle$getVerticalUVAngle(x2, x3, cy, f7, f10);
                } else {
                    lowerAngle = getLowerAngle(lowerAngle2, f6, f8, i3);
                }
                f7 = lowerAngle;
                vector3D = getDockedUVAngle$getVerticalUVAngle(x2, x3, cy, f7, f10);
            } else if (i2 == 3) {
                float lowerAngle4 = -lowerAngle2;
                double d4 = f8;
                if (cy >= d4) {
                    lowerAngle4 = getUpperAngle(lowerAngle4, f5, f8);
                } else if (i3 != 0 && d4 > 0.0d) {
                    lowerAngle4 = getLowerAngle(lowerAngle4, f6, f8, i3);
                }
                vector3D = getDockedUVAngle$getVerticalUVAngle(x2, x3, cy, lowerAngle4, f8);
            }
        }
        return new PosPos(vector3D, vector2D2);
    }

    private static final Vector3D getInitialGlobalPos(SceneElement sceneElement, Scene scene, int i2) {
        Object next;
        SceneElement sceneElement2;
        Vector3D vector3D;
        int i3;
        int i5;
        UserParameterValue userParameterValueValueAtTime;
        UserParameterValue userParameterValueValueAtTime2;
        UserParameterValue userParameterValueValueAtTime3;
        UserParameterValue userParameterValueValueAtTime4;
        UserParameterValue userParameterValueValueAtTime5;
        UserParameterValue userParameterValueValueAtTime6;
        UserParameterValue userParameterValueValueAtTime7;
        UserParameterValue userParameterValueValueAtTime8;
        UserParameterValue userParameterValueValueAtTime9;
        UserParameterValue userParameterValueValueAtTime10;
        UserParameterValue userParameterValueValueAtTime11;
        int i7 = i2;
        Transform transformValueAtTime = sceneElement.getTransform().valueAtTime(localTime(sceneElement, i7));
        Long parent = sceneElement.getParent();
        if (parent == null) {
            return new Vector3D(transformValueAtTime.getLocation().getX(), transformValueAtTime.getLocation().getY(), transformValueAtTime.getRotation());
        }
        long jLongValue = parent.longValue();
        Iterator<T> it = scene.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SceneElement) next).getId() == jLongValue) {
                break;
            }
        }
        SceneElement sceneElement3 = (SceneElement) next;
        if (sceneElement3 == null) {
            return new Vector3D(transformValueAtTime.getLocation().getX(), transformValueAtTime.getLocation().getY(), transformValueAtTime.getRotation());
        }
        Scene scene2 = scene;
        SceneElement sceneElementApplyParentingInternal = applyParentingInternal(ScriptExecutorKt.runScripts$default(sceneElement3, localTime(sceneElement, i7), scene, null, null, false, null, 60, null), scene2, localTime(sceneElement, i7), new long[]{sceneElement.getId()});
        int startTime = sceneElement.getStartTime();
        Vector3D vector3D2 = null;
        for (Map.Entry<Long, KeyableVisualEffectRef> entry : sceneElementApplyParentingInternal.getVisualEffects().entrySet()) {
            if (entry.getValue().getHidden()) {
                sceneElement2 = sceneElementApplyParentingInternal;
                vector3D = vector3D2;
            } else {
                if (Intrinsics.areEqual(entry.getValue().getId(), "com.alightcreative.effects.bendwarp")) {
                    KeyableUserParameterValue keyableUserParameterValue = entry.getValue().getParameters().get("originType");
                    Integer numValueOf = (keyableUserParameterValue == null || (userParameterValueValueAtTime11 = UserParameterKt.valueAtTime(keyableUserParameterValue, localTime(sceneElementApplyParentingInternal, i7))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime11.getIntValue());
                    KeyableUserParameterValue keyableUserParameterValue2 = entry.getValue().getParameters().get(AppLovinEventParameters.REVENUE_AMOUNT);
                    Float fValueOf = (keyableUserParameterValue2 == null || (userParameterValueValueAtTime10 = UserParameterKt.valueAtTime(keyableUserParameterValue2, localTime(sceneElementApplyParentingInternal, i7))) == null) ? null : Float.valueOf(userParameterValueValueAtTime10.getFloatValue());
                    KeyableUserParameterValue keyableUserParameterValue3 = entry.getValue().getParameters().get("offset");
                    Float fValueOf2 = (keyableUserParameterValue3 == null || (userParameterValueValueAtTime9 = UserParameterKt.valueAtTime(keyableUserParameterValue3, localTime(sceneElementApplyParentingInternal, i7))) == null) ? null : Float.valueOf(userParameterValueValueAtTime9.getFloatValue());
                    KeyableUserParameterValue keyableUserParameterValue4 = entry.getValue().getParameters().get("oppositeType");
                    Integer numValueOf2 = (keyableUserParameterValue4 == null || (userParameterValueValueAtTime8 = UserParameterKt.valueAtTime(keyableUserParameterValue4, localTime(sceneElementApplyParentingInternal, i7))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime8.getIntValue());
                    KeyableUserParameterValue keyableUserParameterValue5 = entry.getValue().getParameters().get("highLimit");
                    vector3D = vector3D2;
                    Float fValueOf3 = (keyableUserParameterValue5 == null || (userParameterValueValueAtTime7 = UserParameterKt.valueAtTime(keyableUserParameterValue5, localTime(sceneElementApplyParentingInternal, i7))) == null) ? null : Float.valueOf(userParameterValueValueAtTime7.getFloatValue());
                    KeyableUserParameterValue keyableUserParameterValue6 = entry.getValue().getParameters().get("lowLimit");
                    Float fValueOf4 = (keyableUserParameterValue6 == null || (userParameterValueValueAtTime6 = UserParameterKt.valueAtTime(keyableUserParameterValue6, localTime(sceneElementApplyParentingInternal, i7))) == null) ? null : Float.valueOf(userParameterValueValueAtTime6.getFloatValue());
                    if (numValueOf == null || fValueOf == null || fValueOf2 == null || numValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
                        sceneElement2 = sceneElementApplyParentingInternal;
                    } else {
                        Vector3D zero = Vector3D.INSTANCE.getZERO();
                        Vector2D zero2 = Vector2D.INSTANCE.getZERO();
                        Vector3D vector3D3 = zero;
                        KeyableUserParameterValue keyableUserParameterValue7 = entry.getValue().getParameters().get("originType");
                        Integer numValueOf3 = (keyableUserParameterValue7 == null || (userParameterValueValueAtTime5 = UserParameterKt.valueAtTime(keyableUserParameterValue7, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime5.getIntValue());
                        KeyableUserParameterValue keyableUserParameterValue8 = entry.getValue().getParameters().get("offset");
                        Float fValueOf5 = (keyableUserParameterValue8 == null || (userParameterValueValueAtTime4 = UserParameterKt.valueAtTime(keyableUserParameterValue8, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime4.getFloatValue());
                        KeyableUserParameterValue keyableUserParameterValue9 = entry.getValue().getParameters().get("oppositeType");
                        Integer numValueOf4 = (keyableUserParameterValue9 == null || (userParameterValueValueAtTime3 = UserParameterKt.valueAtTime(keyableUserParameterValue9, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime3.getIntValue());
                        KeyableUserParameterValue keyableUserParameterValue10 = entry.getValue().getParameters().get("highLimit");
                        Float fValueOf6 = (keyableUserParameterValue10 == null || (userParameterValueValueAtTime2 = UserParameterKt.valueAtTime(keyableUserParameterValue10, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime2.getFloatValue());
                        KeyableUserParameterValue keyableUserParameterValue11 = entry.getValue().getParameters().get("lowLimit");
                        Float fValueOf7 = (keyableUserParameterValue11 == null || (userParameterValueValueAtTime = UserParameterKt.valueAtTime(keyableUserParameterValue11, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime.getFloatValue());
                        if (numValueOf3 == null || fValueOf5 == null || numValueOf4 == null || fValueOf6 == null || fValueOf7 == null) {
                            i3 = startTime;
                        } else {
                            PosPos dockedUVAngle = getDockedUVAngle(sceneElement, sceneElementApplyParentingInternal, scene2, startTime, numValueOf3.intValue(), 0.0f, fValueOf5.floatValue(), numValueOf4.intValue(), fValueOf6.floatValue(), fValueOf7.floatValue());
                            i3 = startTime;
                            Vector3D rel = dockedUVAngle.getRel();
                            zero2 = dockedUVAngle.getBase();
                            vector3D3 = rel;
                        }
                        Transform transformValueAtTime2 = sceneElementApplyParentingInternal.getTransform().valueAtTime(localTime(sceneElementApplyParentingInternal, i7));
                        i5 = i2;
                        sceneElement2 = sceneElementApplyParentingInternal;
                        Vector3D bendPosRot = getBendPosRot(sceneElement, numValueOf.intValue(), fValueOf.floatValue(), fValueOf2.floatValue(), numValueOf2.intValue(), fValueOf3.floatValue(), fValueOf4.floatValue(), sceneElement2, scene, i5, vector3D3.getX(), vector3D3.getY(), zero2.getX(), zero2.getY());
                        Transform transformValueAtTime3 = sceneElement.getTransform().valueAtTime(localTime(sceneElement, i5));
                        Vector3D vector3DPlus = GeometryKt.plus(GeometryKt.minus(GeometryKt.plus(transformValueAtTime2.getLocation(), GeometryKt.rot2D(GeometryKt.times(GeometryKt.minus(new Vector3D(bendPosRot.getX(), bendPosRot.getY(), 0.0f), transformValueAtTime2.getPivot()), transformValueAtTime2.getScale()), transformValueAtTime2.getRotation())), transformValueAtTime3.getPivot()), transformValueAtTime2.getPivot());
                        vector3D2 = new Vector3D(vector3DPlus.getX(), vector3DPlus.getY(), ((transformValueAtTime2.getRotation() + transformValueAtTime3.getRotation()) + bendPosRot.getZ()) - vector3D3.getZ());
                    }
                } else {
                    sceneElement2 = sceneElementApplyParentingInternal;
                    i3 = startTime;
                    i5 = i7;
                }
                scene2 = scene;
                sceneElementApplyParentingInternal = sceneElement2;
                i7 = i5;
                startTime = i3;
            }
            i3 = startTime;
            i5 = i7;
            vector3D2 = vector3D;
            scene2 = scene;
            sceneElementApplyParentingInternal = sceneElement2;
            i7 = i5;
            startTime = i3;
        }
        SceneElement sceneElement4 = sceneElementApplyParentingInternal;
        Vector3D vector3D4 = vector3D2;
        int i8 = i7;
        if (vector3D4 != null) {
            return vector3D4;
        }
        Transform transformValueAtTime4 = sceneElement4.getTransform().valueAtTime(localTime(sceneElement4, i8));
        Vector3D vector3DPlus2 = GeometryKt.plus(GeometryKt.minus(GeometryKt.plus(transformValueAtTime4.getLocation(), GeometryKt.rot2D(GeometryKt.times(GeometryKt.minus(GeometryKt.plus(transformValueAtTime.getLocation(), transformValueAtTime.getPivot()), transformValueAtTime4.getPivot()), transformValueAtTime4.getScale()), transformValueAtTime4.getRotation())), transformValueAtTime.getPivot()), transformValueAtTime4.getPivot());
        return new Vector3D(vector3DPlus2.getX(), vector3DPlus2.getY(), transformValueAtTime4.getRotation() + transformValueAtTime.getRotation());
    }

    private static final float getUpperAngle(float f3, float f4, float f5) {
        double d2 = f3;
        double d4 = ((double) f4) * 0.99d;
        double d5 = f5;
        if (d5 >= d4) {
            d2 *= 1.0d - ((d5 - d4) / (0.99d - d4));
        }
        return (float) (((d2 * 0.017453292519943295d) * 0.5d) / Math.abs(1.0d - d5));
    }

    public static final SceneElement applyLayerParenting(SceneElement sceneElement, Scene scene, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        return applyParentingInternal(sceneElement, scene, f3, emptyLongArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0579  */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, com.alightcreative.app.motion.scene.Vector3D] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, com.alightcreative.app.motion.scene.Vector2D] */
    /* JADX WARN: Type inference failed for: r4v29, types: [T, com.alightcreative.app.motion.scene.Vector3D] */
    /* JADX WARN: Type inference failed for: r6v67, types: [T, com.alightcreative.app.motion.scene.Vector2D] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SceneElement applyParentingInternal(SceneElement sceneElement, Scene scene, float f3, long[] jArr) {
        float fFloatValue;
        float fFloatValue2;
        KeyableUserParameterValue keyableUserParameterValue;
        Keyable<Float> floatValue;
        KeyableUserParameterValue keyableUserParameterValue2;
        Keyable<Float> floatValue2;
        Keyable<Float> floatValue3;
        SceneElement sceneElement2;
        int i2;
        int i3;
        float f4;
        float f5;
        final Ref.ObjectRef objectRef;
        UserParameterValue userParameterValueValueAtTime;
        UserParameterValue userParameterValueValueAtTime2;
        UserParameterValue userParameterValueValueAtTime3;
        UserParameterValue userParameterValueValueAtTime4;
        UserParameterValue userParameterValueValueAtTime5;
        UserParameterValue userParameterValueValueAtTime6;
        UserParameterValue userParameterValueValueAtTime7;
        UserParameterValue userParameterValueValueAtTime8;
        UserParameterValue userParameterValueValueAtTime9;
        UserParameterValue userParameterValueValueAtTime10;
        UserParameterValue userParameterValueValueAtTime11;
        SceneElement sceneElement3 = sceneElement;
        float f6 = f3;
        if (sceneElement3.getParent() != null && !ArraysKt.contains(jArr, sceneElement3.getId())) {
            Collection<KeyableVisualEffectRef> collectionValues = sceneElement3.getVisualEffects().values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                for (KeyableVisualEffectRef keyableVisualEffectRef : collectionValues) {
                    if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effect.movealongpath3") && !keyableVisualEffectRef.getHidden()) {
                        return sceneElement3;
                    }
                }
            }
            SceneElement sceneElementElementById = SceneKt.elementById(scene, sceneElement3.getParent());
            if (sceneElementElementById != null) {
                int iSceneTimeFromLocalTime = KeyableKt.sceneTimeFromLocalTime(sceneElement3, f6);
                float fFractionalTime = SceneElementKt.fractionalTime(sceneElementElementById, iSceneTimeFromLocalTime);
                SceneElement sceneElementRunScripts$default = ScriptExecutorKt.runScripts$default(sceneElementElementById, fFractionalTime, scene, null, null, false, null, 60, null);
                float f7 = fFractionalTime;
                Scene scene2 = scene;
                SceneElement sceneElementApplyParentingInternal = applyParentingInternal(sceneElementRunScripts$default, scene2, f7, ArraysKt.plus(jArr, sceneElement3.getId()));
                int startTime = sceneElement3.getStartTime();
                Object obj = null;
                SceneElement sceneElementCopy$default = null;
                for (final Map.Entry<Long, KeyableVisualEffectRef> entry : sceneElementApplyParentingInternal.getVisualEffects().entrySet()) {
                    if (!entry.getValue().getHidden()) {
                        XoT.C.Uo(sceneElement3, new Function0() { // from class: com.alightcreative.app.motion.scene.afx
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LayerParentingKt.applyParentingInternal$lambda$16$lambda$9(entry);
                            }
                        });
                        if (Intrinsics.areEqual(entry.getValue().getId(), "com.alightcreative.effects.bendwarp")) {
                            XoT.C.Uo(sceneElement3, new Function0() { // from class: com.alightcreative.app.motion.scene.Z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LayerParentingKt.applyParentingInternal$lambda$16$lambda$10(entry);
                                }
                            });
                            KeyableUserParameterValue keyableUserParameterValue3 = entry.getValue().getParameters().get("originType");
                            final Integer numValueOf = (keyableUserParameterValue3 == null || (userParameterValueValueAtTime11 = UserParameterKt.valueAtTime(keyableUserParameterValue3, localTime(sceneElementApplyParentingInternal, iSceneTimeFromLocalTime))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime11.getIntValue());
                            KeyableUserParameterValue keyableUserParameterValue4 = entry.getValue().getParameters().get(AppLovinEventParameters.REVENUE_AMOUNT);
                            final Float fValueOf = (keyableUserParameterValue4 == null || (userParameterValueValueAtTime10 = UserParameterKt.valueAtTime(keyableUserParameterValue4, localTime(sceneElementApplyParentingInternal, iSceneTimeFromLocalTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime10.getFloatValue());
                            KeyableUserParameterValue keyableUserParameterValue5 = entry.getValue().getParameters().get("offset");
                            final Float fValueOf2 = (keyableUserParameterValue5 == null || (userParameterValueValueAtTime9 = UserParameterKt.valueAtTime(keyableUserParameterValue5, localTime(sceneElementApplyParentingInternal, iSceneTimeFromLocalTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime9.getFloatValue());
                            KeyableUserParameterValue keyableUserParameterValue6 = entry.getValue().getParameters().get("oppositeType");
                            final Integer numValueOf2 = (keyableUserParameterValue6 == null || (userParameterValueValueAtTime8 = UserParameterKt.valueAtTime(keyableUserParameterValue6, localTime(sceneElementApplyParentingInternal, iSceneTimeFromLocalTime))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime8.getIntValue());
                            KeyableUserParameterValue keyableUserParameterValue7 = entry.getValue().getParameters().get("highLimit");
                            final Float fValueOf3 = (keyableUserParameterValue7 == null || (userParameterValueValueAtTime7 = UserParameterKt.valueAtTime(keyableUserParameterValue7, localTime(sceneElementApplyParentingInternal, iSceneTimeFromLocalTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime7.getFloatValue());
                            KeyableUserParameterValue keyableUserParameterValue8 = entry.getValue().getParameters().get("lowLimit");
                            final Float fValueOf4 = (keyableUserParameterValue8 == null || (userParameterValueValueAtTime6 = UserParameterKt.valueAtTime(keyableUserParameterValue8, localTime(sceneElementApplyParentingInternal, iSceneTimeFromLocalTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime6.getFloatValue());
                            XoT.C.Uo(sceneElement3, new Function0() { // from class: com.alightcreative.app.motion.scene.Ew
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LayerParentingKt.applyParentingInternal$lambda$16$lambda$11(numValueOf, fValueOf, fValueOf2, numValueOf2, fValueOf3, fValueOf4);
                                }
                            });
                            if (numValueOf == null || fValueOf == null || fValueOf2 == null || numValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
                                sceneElement2 = sceneElementApplyParentingInternal;
                                i2 = startTime;
                                i3 = iSceneTimeFromLocalTime;
                                f4 = f6;
                                f5 = f7;
                            } else {
                                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                                objectRef2.element = Vector3D.INSTANCE.getZERO();
                                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                                objectRef3.element = Vector2D.INSTANCE.getZERO();
                                KeyableUserParameterValue keyableUserParameterValue9 = entry.getValue().getParameters().get("originType");
                                Integer numValueOf3 = (keyableUserParameterValue9 == null || (userParameterValueValueAtTime5 = UserParameterKt.valueAtTime(keyableUserParameterValue9, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime5.getIntValue());
                                KeyableUserParameterValue keyableUserParameterValue10 = entry.getValue().getParameters().get("offset");
                                Float fValueOf5 = (keyableUserParameterValue10 == null || (userParameterValueValueAtTime4 = UserParameterKt.valueAtTime(keyableUserParameterValue10, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime4.getFloatValue());
                                KeyableUserParameterValue keyableUserParameterValue11 = entry.getValue().getParameters().get("oppositeType");
                                Integer numValueOf4 = (keyableUserParameterValue11 == null || (userParameterValueValueAtTime3 = UserParameterKt.valueAtTime(keyableUserParameterValue11, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime3.getIntValue());
                                KeyableUserParameterValue keyableUserParameterValue12 = entry.getValue().getParameters().get("highLimit");
                                Float fValueOf6 = (keyableUserParameterValue12 == null || (userParameterValueValueAtTime2 = UserParameterKt.valueAtTime(keyableUserParameterValue12, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime2.getFloatValue());
                                KeyableUserParameterValue keyableUserParameterValue13 = entry.getValue().getParameters().get("lowLimit");
                                Float fValueOf7 = (keyableUserParameterValue13 == null || (userParameterValueValueAtTime = UserParameterKt.valueAtTime(keyableUserParameterValue13, localTime(sceneElementApplyParentingInternal, startTime))) == null) ? null : Float.valueOf(userParameterValueValueAtTime.getFloatValue());
                                if (numValueOf3 == null || fValueOf5 == null || numValueOf4 == null || fValueOf6 == null || fValueOf7 == null) {
                                    i2 = startTime;
                                    objectRef = objectRef3;
                                } else {
                                    objectRef = objectRef3;
                                    final PosPos dockedUVAngle = getDockedUVAngle(sceneElement3, sceneElementApplyParentingInternal, scene2, startTime, numValueOf3.intValue(), 0.0f, fValueOf5.floatValue(), numValueOf4.intValue(), fValueOf6.floatValue(), fValueOf7.floatValue());
                                    i2 = startTime;
                                    XoT.C.Uo(sceneElement3, new Function0() { // from class: com.alightcreative.app.motion.scene.nKK
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LayerParentingKt.applyParentingInternal$lambda$16$lambda$13$lambda$12(dockedUVAngle);
                                        }
                                    });
                                    objectRef2.element = dockedUVAngle.getRel();
                                    objectRef.element = dockedUVAngle.getBase();
                                }
                                Unit unit = Unit.INSTANCE;
                                XoT.C.Uo(sceneElement3, new Function0() { // from class: com.alightcreative.app.motion.scene.DAz
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LayerParentingKt.applyParentingInternal$lambda$16$lambda$14(objectRef2, objectRef);
                                    }
                                });
                                Transform transformValueAtTime = sceneElementApplyParentingInternal.getTransform().valueAtTime(localTime(sceneElementApplyParentingInternal, iSceneTimeFromLocalTime));
                                SceneElement sceneElement4 = sceneElementApplyParentingInternal;
                                int i5 = iSceneTimeFromLocalTime;
                                Vector3D bendPosRot = getBendPosRot(sceneElement3, numValueOf.intValue(), fValueOf.floatValue(), fValueOf2.floatValue(), numValueOf2.intValue(), fValueOf3.floatValue(), fValueOf4.floatValue(), sceneElement4, scene, i5, ((Vector3D) objectRef2.element).getX(), ((Vector3D) objectRef2.element).getY(), ((Vector2D) objectRef.element).getX(), ((Vector2D) objectRef.element).getY());
                                sceneElement2 = sceneElement4;
                                Transform transformValueAtTime2 = sceneElement3.getTransform().valueAtTime(localTime(sceneElement3, i5));
                                XoT.C.Uo(sceneElement3, new Function0() { // from class: com.alightcreative.app.motion.scene.u
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FlTC.JhdkRRoB;
                                    }
                                });
                                KeyableTransform keyableTransformAsKeyable = TransformKt.asKeyable(Transform.copy$default(transformValueAtTime2, GeometryKt.plus(GeometryKt.minus(GeometryKt.plus(transformValueAtTime.getLocation(), GeometryKt.rot2D(GeometryKt.times(GeometryKt.minus(new Vector3D(bendPosRot.getX(), bendPosRot.getY(), 0.0f), transformValueAtTime.getPivot()), transformValueAtTime.getScale()), transformValueAtTime.getRotation())), transformValueAtTime2.getPivot()), transformValueAtTime.getPivot()), null, sceneElement3.getType() == SceneElementType.Camera ? transformValueAtTime2.getScale() : GeometryKt.times(transformValueAtTime.getScale(), transformValueAtTime2.getScale()), 0.0f, 0.0f, ((transformValueAtTime.getRotation() + transformValueAtTime2.getRotation()) + bendPosRot.getZ()) - ((Vector3D) objectRef2.element).getZ(), 0.0f, null, null, 474, null));
                                f5 = f7;
                                i3 = i5;
                                SceneElement sceneElement5 = sceneElement3;
                                f4 = f3;
                                sceneElementCopy$default = SceneElement.copy$default(sceneElement5, null, 0, 0, 0L, null, null, keyableTransformAsKeyable, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
                            }
                        }
                    }
                    scene2 = scene;
                    f6 = f4;
                    startTime = i2;
                    iSceneTimeFromLocalTime = i3;
                    sceneElementApplyParentingInternal = sceneElement2;
                    f7 = f5;
                    sceneElement3 = sceneElement;
                }
                SceneElement sceneElement6 = sceneElementApplyParentingInternal;
                float f8 = f6;
                float f9 = f7;
                if (sceneElementCopy$default != null) {
                    return sceneElementCopy$default;
                }
                Iterator<T> it = sceneElement.getVisualEffects().values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    KeyableVisualEffectRef keyableVisualEffectRef2 = (KeyableVisualEffectRef) next;
                    if (Intrinsics.areEqual(keyableVisualEffectRef2.getId(), "com.alightcreative.effects.parenthelper") && !keyableVisualEffectRef2.getHidden()) {
                        obj = next;
                        break;
                    }
                }
                KeyableVisualEffectRef keyableVisualEffectRef3 = (KeyableVisualEffectRef) obj;
                float fFloatValue3 = 1.0f;
                if (keyableVisualEffectRef3 != null) {
                    KeyableUserParameterValue keyableUserParameterValue14 = keyableVisualEffectRef3.getParameters().get("autoRotate");
                    int intValue = keyableUserParameterValue14 != null ? keyableUserParameterValue14.getIntValue() : 0;
                    KeyableUserParameterValue keyableUserParameterValue15 = keyableVisualEffectRef3.getParameters().get("radiusAdjust");
                    fFloatValue2 = (keyableUserParameterValue15 == null || (floatValue3 = keyableUserParameterValue15.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue3, f8)).floatValue();
                    KeyableUserParameterValue keyableUserParameterValue16 = keyableVisualEffectRef3.getParameters().get("scaleMode");
                    int intValue2 = keyableUserParameterValue16 != null ? keyableUserParameterValue16.getIntValue() : 0;
                    KeyableUserParameterValue keyableUserParameterValue17 = keyableVisualEffectRef3.getParameters().get("rotateMode");
                    intValue = keyableUserParameterValue17 != null ? keyableUserParameterValue17.getIntValue() : 0;
                    if (intValue2 == 0) {
                        fFloatValue = 1.0f;
                        if (intValue != 0) {
                            if (intValue == 1) {
                                fFloatValue3 = 0.0f;
                            } else if (intValue == 2 && (keyableUserParameterValue = keyableVisualEffectRef3.getParameters().get("rotateWeight")) != null && (floatValue = keyableUserParameterValue.getFloatValue()) != null) {
                                fFloatValue3 = ((Number) KeyableKt.valueAtTime(floatValue, f8)).floatValue();
                            }
                        }
                        intValue = intValue;
                    } else {
                        if (intValue2 == 1) {
                            fFloatValue = 0.0f;
                        } else if (intValue2 == 2 && (keyableUserParameterValue2 = keyableVisualEffectRef3.getParameters().get("scaleWeight")) != null && (floatValue2 = keyableUserParameterValue2.getFloatValue()) != null) {
                            fFloatValue = ((Number) KeyableKt.valueAtTime(floatValue2, f8)).floatValue();
                        }
                        if (intValue != 0) {
                        }
                        intValue = intValue;
                    }
                } else {
                    fFloatValue = 1.0f;
                    fFloatValue2 = 0.0f;
                }
                Transform transformValueAtTime3 = sceneElement6.getTransform().valueAtTime(f9);
                Transform transformValueAtTime4 = sceneElement.getTransform().valueAtTime(f8);
                Transform transformCopy$default = Transform.copy$default(transformValueAtTime4, GeometryKt.plus(GeometryKt.minus(GeometryKt.plus(transformValueAtTime3.getLocation(), GeometryKt.rot2D(GeometryKt.times(GeometryKt.minus(GeometryKt.plus(transformValueAtTime4.getLocation(), transformValueAtTime4.getPivot()), transformValueAtTime3.getPivot()), transformValueAtTime3.getScale()), transformValueAtTime3.getRotation())), transformValueAtTime4.getPivot()), transformValueAtTime3.getPivot()), null, sceneElement.getType() == SceneElementType.Camera ? transformValueAtTime4.getScale() : GeometryKt.times(GeometryKt.mix(Vector2D.INSTANCE.getONE(), transformValueAtTime3.getScale(), fFloatValue), transformValueAtTime4.getScale()), 0.0f, 0.0f, (transformValueAtTime3.getRotation() * fFloatValue3) + transformValueAtTime4.getRotation(), 0.0f, null, null, 474, null);
                if (intValue != 0) {
                    Rectangle rectangleBoundsInScene = SceneElementKt.boundsInScene(sceneElement, scene);
                    transformCopy$default = Transform.copy$default(transformCopy$default, null, null, null, 0.0f, 0.0f, transformCopy$default.getRotation() + (((intValue != 1 ? intValue != 2 ? 0.0f : transformCopy$default.getLocation().getY() : transformCopy$default.getLocation().getX()) / (((Math.min(rectangleBoundsInScene.getWidth() * transformCopy$default.getScale().getX(), rectangleBoundsInScene.getHeight() * transformCopy$default.getScale().getY()) / 2) + (fFloatValue2 * Math.min(transformCopy$default.getScale().getX(), transformCopy$default.getScale().getY()))) * 6.2831855f)) * 360.0f), 0.0f, null, null, 479, null);
                }
                return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.asKeyable(transformCopy$default), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
            }
        }
        return sceneElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyParentingInternal$lambda$16$lambda$11(Integer num, Float f3, Float f4, Integer num2, Float f5, Float f6) {
        return "bendparenting originType:" + num + " amount:" + f3 + " offset:" + f4 + " oppositeType:" + num2 + " highLimit:" + f5 + " lowLimit:" + f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyParentingInternal$lambda$16$lambda$14(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        return "bendparenting check start pos - " + objectRef.element + " " + objectRef2.element;
    }

    public static final boolean checkParent(SceneElement sceneElement, Scene scene, long j2) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        if (sceneElement.getParent() == null) {
            return false;
        }
        Long parent = sceneElement.getParent();
        if (parent != null && parent.longValue() == j2) {
            return true;
        }
        SceneElement sceneElementElementById = SceneKt.elementById(scene, sceneElement.getParent());
        if (sceneElementElementById == null) {
            return false;
        }
        return checkParent(sceneElementElementById, scene, j2);
    }

    private static final Vector3D getBendPosRot(SceneElement sceneElement, int i2, float f3, float f4, int i3, float f5, float f6, SceneElement sceneElement2, Scene scene, int i5, float f7, float f8, float f9, float f10) {
        float f11;
        Rectangle rectangle;
        float f12;
        float f13 = 0.99f * f4;
        Transform transformValueAtTime = sceneElement.getTransform().valueAtTime(localTime(sceneElement, i5));
        Rectangle rectangleBoundsInScene = SceneElementKt.boundsInScene(sceneElement2, scene);
        float x2 = (float) (((((double) ((transformValueAtTime.getLocation().getX() - rectangleBoundsInScene.getCx()) / rectangleBoundsInScene.getSize().getX())) + 0.5d) - ((double) f9)) + ((double) f7));
        float cy = (float) (((((double) (((-transformValueAtTime.getLocation().getY()) + rectangleBoundsInScene.getCy()) / rectangleBoundsInScene.getSize().getY())) + 0.5d) - ((double) f10)) + ((double) f8));
        float x3 = rectangleBoundsInScene.getSize().getX() / rectangleBoundsInScene.getSize().getY();
        if (i2 == 0) {
            f11 = cy;
            rectangle = rectangleBoundsInScene;
            f12 = x2;
            if (f12 >= f13) {
                return getBendSolutionHorizontal(f12, f11, x3, getUpperAngle(f3, f5, f13), f13, rectangle, true);
            }
            if (i3 != 0 && f13 > 0.0d) {
                return getBendSolutionHorizontal(f12, f11, x3, getLowerAngle(f3, f6, f13, i3), f13, rectangle, false);
            }
        } else if (i2 == 1) {
            f11 = cy;
            rectangle = rectangleBoundsInScene;
            f12 = x2;
            float f14 = 1.0f - f13;
            if (f12 <= f14) {
                return getBendSolutionHorizontal(f12, f11, x3, getUpperAngle(-f3, f5, f13), f14, rectangle, false);
            }
            if (i3 != 0 && f13 > 0.0d) {
                return getBendSolutionHorizontal(f12, f11, x3, getLowerAngle(-f3, f6, f13, i3), f14, rectangle, true);
            }
        } else if (i2 != 2) {
            f11 = cy;
            rectangle = rectangleBoundsInScene;
            f12 = x2;
        } else {
            float f15 = 1.0f - f13;
            if (cy <= f15) {
                return getBendSolutionVertical(x2, cy, x3, getUpperAngle(f3, f5, f13), f15, rectangleBoundsInScene, false);
            }
            f11 = cy;
            rectangle = rectangleBoundsInScene;
            f12 = x2;
            if (i3 != 0 && f13 > 0.0d) {
                return getBendSolutionVertical(f12, f11, x3, getLowerAngle(f3, f6, f13, i3), f15, rectangle, true);
            }
        }
        if (i2 == 3) {
            if (f11 >= f13) {
                return getBendSolutionVertical(f12, f11, x3, getUpperAngle(-f3, f5, f13), f13, rectangle, true);
            }
            if (i3 != 0 && f13 > 0.0d) {
                return getBendSolutionVertical(f12, f11, x3, getLowerAngle(-f3, f6, f13, i3), f13, rectangle, false);
            }
        }
        return new Vector3D(rectangle.getLeft() + (rectangle.getSize().getX() * f12), ((-f11) * rectangle.getSize().getY()) + rectangle.getBottom(), x3);
    }

    private static final Vector3D getBendSolutionHorizontal(float f3, float f4, float f5, float f6, float f7, Rectangle rectangle, boolean z2) {
        if (Math.abs(f6) <= 0.01d) {
            return new Vector3D(rectangle.getLeft() + (rectangle.getWidth() * f3), rectangle.getBottom() - (f4 * rectangle.getHeight()), f6);
        }
        double d2 = 0.5d / ((double) f6);
        double dTan = Math.tan(((double) (f3 - f7)) / d2);
        double d4 = f5;
        double d5 = ((((double) f4) - 0.5d) / d4) - d2;
        double dSqrt = ((Math.sqrt(Math.pow(d5, 2.0d) / (Math.pow(dTan, 2.0d) + 1.0d)) + d2) * d4) + 0.5d;
        double d6 = (((-Math.sqrt(Math.pow(d5, 2.0d) / (Math.pow(dTan, 2.0d) + 1.0d))) + d2) * d4) + 0.5d;
        double d7 = f7;
        double d8 = ((-(((dSqrt - 0.5d) / d4) - d2)) * dTan) + d7;
        double d9 = ((-(((d6 - 0.5d) / d4) - d2)) * dTan) + d7;
        if (z2) {
            if (d8 >= d7 || d9 >= d7) {
                if (d9 >= d7) {
                    d8 = d9;
                }
                if (d9 < d7) {
                    d6 = dSqrt;
                }
                double left = ((double) rectangle.getLeft()) + (((double) rectangle.getSize().getX()) * d8);
                double y2 = ((-d6) * ((double) rectangle.getSize().getY())) + ((double) rectangle.getBottom());
                float fAbs = f6 / Math.abs(f6);
                return new Vector3D((float) left, (float) y2, (float) ((-Math.atan2(((double) fAbs) * (d8 - d7), ((double) (-fAbs)) * (((d6 - 0.5d) / d4) - d2))) / 0.017453292519943295d));
            }
        } else if (d8 < d7 || d9 < d7) {
            if (d9 < d7) {
                d8 = d9;
            }
            if (d9 >= d7) {
                d6 = dSqrt;
            }
            double left2 = ((double) rectangle.getLeft()) + (((double) rectangle.getSize().getX()) * d8);
            double y3 = ((-d6) * ((double) rectangle.getSize().getY())) + ((double) rectangle.getBottom());
            float fAbs2 = f6 / Math.abs(f6);
            return new Vector3D((float) left2, (float) y3, (float) ((-Math.atan2(((double) fAbs2) * (d8 - d7), ((double) (-fAbs2)) * (((d6 - 0.5d) / d4) - d2))) / 0.017453292519943295d));
        }
        return Vector3D.INSTANCE.getZERO();
    }

    private static final Vector3D getBendSolutionVertical(float f3, float f4, float f5, float f6, float f7, Rectangle rectangle, boolean z2) {
        if (Math.abs(f6) <= 0.01d) {
            return new Vector3D(rectangle.getLeft() + (f3 * rectangle.getWidth()), rectangle.getBottom() - (rectangle.getHeight() * f4), f6);
        }
        double d2 = 0.5d / ((double) f6);
        double dTan = Math.tan(((double) (f4 - f7)) / d2);
        double d4 = f5;
        double d5 = ((((double) f3) - 0.5d) * d4) - d2;
        double dSqrt = ((Math.sqrt(Math.pow(d5, 2.0d) / (Math.pow(dTan, 2.0d) + 1.0d)) + d2) / d4) + 0.5d;
        double d6 = (((-Math.sqrt(Math.pow(d5, 2.0d) / (Math.pow(dTan, 2.0d) + 1.0d))) + d2) / d4) + 0.5d;
        double d7 = f7;
        double d8 = ((-(((dSqrt - 0.5d) * d4) - d2)) * dTan) + d7;
        double d9 = ((-(((d6 - 0.5d) * d4) - d2)) * dTan) + d7;
        float fAbs = f6 / Math.abs(f6);
        if (z2) {
            if (d8 >= d7 || d9 >= d7) {
                if (d9 >= d7) {
                    dSqrt = d6;
                }
                if (d9 >= d7) {
                    d8 = d9;
                }
                return new Vector3D((float) (((double) rectangle.getLeft()) + (((double) rectangle.getSize().getX()) * dSqrt)), (float) (((-d8) * ((double) rectangle.getSize().getY())) + ((double) rectangle.getBottom())), (float) (Math.atan2(((double) fAbs) * (d8 - d7), ((double) (-fAbs)) * (((dSqrt - 0.5d) * d4) - d2)) / 0.017453292519943295d));
            }
        } else if (d8 < d7 || d9 < d7) {
            if (d9 < d7) {
                dSqrt = d6;
            }
            if (d9 < d7) {
                d8 = d9;
            }
            return new Vector3D((float) (((double) rectangle.getLeft()) + (((double) rectangle.getSize().getX()) * dSqrt)), (float) (((-d8) * ((double) rectangle.getSize().getY())) + ((double) rectangle.getBottom())), (float) (Math.atan2(((double) fAbs) * (d8 - d7), ((double) (-fAbs)) * (((dSqrt - 0.5d) * d4) - d2)) / 0.017453292519943295d));
        }
        return Vector3D.INSTANCE.getZERO();
    }

    private static final Vector3D getDockedInfo(SceneElement sceneElement, Scene scene, Vector2D vector2D, int i2) {
        Object next;
        UserParameterValue userParameterValueValueAtTime;
        UserParameterValue userParameterValueValueAtTime2;
        UserParameterValue userParameterValueValueAtTime3;
        UserParameterValue userParameterValueValueAtTime4;
        UserParameterValue userParameterValueValueAtTime5;
        UserParameterValue userParameterValueValueAtTime6;
        Long parent = sceneElement.getParent();
        if (parent == null) {
            return new Vector3D(vector2D.getX(), vector2D.getY(), 0.0f);
        }
        long jLongValue = parent.longValue();
        Iterator<T> it = scene.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SceneElement) next).getId() == jLongValue) {
                break;
            }
        }
        SceneElement sceneElement2 = (SceneElement) next;
        if (sceneElement2 == null) {
            return new Vector3D(vector2D.getX(), vector2D.getY(), 0.0f);
        }
        Scene scene2 = scene;
        SceneElement sceneElementRunScripts$default = ScriptExecutorKt.runScripts$default(sceneElement2, localTime(sceneElement, i2), scene2, null, null, false, null, 60, null);
        Transform parentTransform = getParentTransform(sceneElement, scene2, localTime(sceneElement, i2));
        Vector2D pivot = sceneElement.getTransform().valueAtTime(localTime(sceneElement, i2)).getPivot();
        Vector3D location = parentTransform.getLocation();
        Vector2D vector2DPlus = GeometryKt.plus(GeometryKt.minus(GeometryKt.div(GeometryKt.rot(GeometryKt.plus(GeometryKt.minus(GeometryKt.minus(vector2D, new Vector2D(location.getX(), location.getY())), parentTransform.getPivot()), pivot), -parentTransform.getRotation()), parentTransform.getScale()), pivot), parentTransform.getPivot());
        Vector3D vector3D = new Vector3D(vector2DPlus.getX(), vector2DPlus.getY(), 0.0f);
        for (Map.Entry<Long, KeyableVisualEffectRef> entry : sceneElementRunScripts$default.getVisualEffects().entrySet()) {
            if (!entry.getValue().getHidden() && Intrinsics.areEqual(entry.getValue().getId(), "com.alightcreative.effects.bendwarp")) {
                KeyableUserParameterValue keyableUserParameterValue = entry.getValue().getParameters().get("originType");
                Integer numValueOf = (keyableUserParameterValue == null || (userParameterValueValueAtTime6 = UserParameterKt.valueAtTime(keyableUserParameterValue, localTime(sceneElementRunScripts$default, i2))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime6.getIntValue());
                KeyableUserParameterValue keyableUserParameterValue2 = entry.getValue().getParameters().get(AppLovinEventParameters.REVENUE_AMOUNT);
                Float fValueOf = (keyableUserParameterValue2 == null || (userParameterValueValueAtTime5 = UserParameterKt.valueAtTime(keyableUserParameterValue2, localTime(sceneElementRunScripts$default, i2))) == null) ? null : Float.valueOf(userParameterValueValueAtTime5.getFloatValue());
                KeyableUserParameterValue keyableUserParameterValue3 = entry.getValue().getParameters().get("offset");
                Float fValueOf2 = (keyableUserParameterValue3 == null || (userParameterValueValueAtTime4 = UserParameterKt.valueAtTime(keyableUserParameterValue3, localTime(sceneElementRunScripts$default, i2))) == null) ? null : Float.valueOf(userParameterValueValueAtTime4.getFloatValue());
                KeyableUserParameterValue keyableUserParameterValue4 = entry.getValue().getParameters().get("oppositeType");
                Integer numValueOf2 = (keyableUserParameterValue4 == null || (userParameterValueValueAtTime3 = UserParameterKt.valueAtTime(keyableUserParameterValue4, localTime(sceneElementRunScripts$default, i2))) == null) ? null : Integer.valueOf(userParameterValueValueAtTime3.getIntValue());
                KeyableUserParameterValue keyableUserParameterValue5 = entry.getValue().getParameters().get("highLimit");
                Float fValueOf3 = (keyableUserParameterValue5 == null || (userParameterValueValueAtTime2 = UserParameterKt.valueAtTime(keyableUserParameterValue5, localTime(sceneElementRunScripts$default, i2))) == null) ? null : Float.valueOf(userParameterValueValueAtTime2.getFloatValue());
                KeyableUserParameterValue keyableUserParameterValue6 = entry.getValue().getParameters().get("lowLimit");
                Float fValueOf4 = (keyableUserParameterValue6 == null || (userParameterValueValueAtTime = UserParameterKt.valueAtTime(keyableUserParameterValue6, localTime(sceneElementRunScripts$default, i2))) == null) ? null : Float.valueOf(userParameterValueValueAtTime.getFloatValue());
                if (numValueOf != null && fValueOf != null && fValueOf2 != null && numValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
                    SceneElement sceneElement3 = sceneElementRunScripts$default;
                    Scene scene3 = scene2;
                    PosPos dockedUVAngle = getDockedUVAngle(sceneElement3, scene3, numValueOf.intValue(), fValueOf.floatValue(), fValueOf2.floatValue(), numValueOf2.intValue(), fValueOf3.floatValue(), fValueOf4.floatValue(), GeometryKt.plus(vector2DPlus, pivot));
                    scene2 = scene3;
                    sceneElementRunScripts$default = sceneElement3;
                    Vector3D rel = dockedUVAngle.getRel();
                    Rectangle rectangleBoundsInScene = SceneElementKt.boundsInScene(sceneElementRunScripts$default, scene2);
                    vector3D = new Vector3D(rectangleBoundsInScene.getLeft() + (rectangleBoundsInScene.getWidth() * rel.getX()), rectangleBoundsInScene.getBottom() - (rectangleBoundsInScene.getHeight() * rel.getY()), rel.getZ());
                }
            }
        }
        return vector3D;
    }

    private static final Vector3D getDockedUVAngle$getHorizontalUVAngle(double d2, float f3, double d4, float f4, float f5) {
        double d5 = 0.5d / ((double) f4);
        float fAbs = f4 / Math.abs(f4);
        double dAbs = Math.abs(d5);
        double d6 = f3;
        double d7 = ((d2 - 0.5d) / d6) - d5;
        double d8 = f5;
        double d9 = d4 - d8;
        double d10 = fAbs;
        double dSqrt = ((dAbs - Math.sqrt(Math.pow(d7, 2.0d) + Math.pow(d9, 2.0d))) * d10 * d6) + 0.5d;
        double d11 = d10 * d9;
        double d12 = ((double) (-fAbs)) * d7;
        return new Vector3D((float) ((Math.atan2(d11, d12) * d5) + d8), (float) dSqrt, (float) ((-Math.atan2(d11, d12)) / 0.017453292519943295d));
    }

    private static final Vector3D getDockedUVAngle$getHorizontalUVAngle$3(double d2, float f3, double d4, float f4, float f5) {
        double d5 = 0.5d / ((double) f4);
        float fAbs = f4 / Math.abs(f4);
        double dAbs = Math.abs(d5);
        double d6 = f3;
        double d7 = ((d2 - 0.5d) / d6) - d5;
        double d8 = f5;
        double d9 = d4 - d8;
        double d10 = fAbs;
        double dSqrt = ((dAbs - Math.sqrt(Math.pow(d7, 2.0d) + Math.pow(d9, 2.0d))) * d10 * d6) + 0.5d;
        double d11 = d10 * d9;
        double d12 = ((double) (-fAbs)) * d7;
        return new Vector3D((float) ((Math.atan2(d11, d12) * d5) + d8), (float) dSqrt, (float) ((-Math.atan2(d11, d12)) / 0.017453292519943295d));
    }

    private static final Vector3D getDockedUVAngle$getVerticalUVAngle(double d2, float f3, double d4, float f4, float f5) {
        double d5 = 0.5d / ((double) f4);
        float fAbs = f4 / Math.abs(f4);
        double dAbs = Math.abs(d5);
        double d6 = f3;
        double d7 = ((d2 - 0.5d) * d6) - d5;
        double d8 = f5;
        double d9 = d4 - d8;
        double d10 = fAbs;
        double dSqrt = (((dAbs - Math.sqrt(Math.pow(d7, 2.0d) + Math.pow(d9, 2.0d))) * d10) / d6) + 0.5d;
        double d11 = d10 * d9;
        double d12 = ((double) (-fAbs)) * d7;
        return new Vector3D((float) dSqrt, (float) ((Math.atan2(d11, d12) * d5) + d8), (float) (Math.atan2(d11, d12) / 0.017453292519943295d));
    }

    private static final Vector3D getDockedUVAngle$getVerticalUVAngle$4(double d2, float f3, double d4, float f4, float f5) {
        double d5 = 0.5d / ((double) f4);
        float fAbs = f4 / Math.abs(f4);
        double dAbs = Math.abs(d5);
        double d6 = f3;
        double d7 = ((d2 - 0.5d) * d6) - d5;
        double d8 = f5;
        double d9 = d4 - d8;
        double d10 = fAbs;
        double dSqrt = (((dAbs - Math.sqrt(Math.pow(d7, 2.0d) + Math.pow(d9, 2.0d))) * d10) / d6) + 0.5d;
        double d11 = d10 * d9;
        double d12 = ((double) (-fAbs)) * d7;
        return new Vector3D((float) dSqrt, (float) ((Math.atan2(d11, d12) * d5) + d8), (float) (Math.atan2(d11, d12) / 0.017453292519943295d));
    }

    private static final float getLowerAngle(float f3, float f4, float f5, int i2) {
        if (f5 < f4) {
            f3 *= f5 / f4;
        }
        if (i2 == 2) {
            f3 = -f3;
        }
        return (float) (((((double) f3) * 0.017453292519943295d) * 0.5d) / ((double) Math.abs(f5)));
    }

    public static final Transform getParentTransform(SceneElement sceneElement, Scene scene, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        if (sceneElement.getParent() == null) {
            return Transform.INSTANCE.getIDENTITY();
        }
        SceneElement sceneElementElementById = SceneKt.elementById(scene, sceneElement.getParent());
        if (sceneElementElementById == null) {
            return Transform.INSTANCE.getIDENTITY();
        }
        float fFractionalTime = SceneElementKt.fractionalTime(sceneElementElementById, KeyableKt.sceneTimeFromLocalTime(sceneElement, f3));
        return applyParentingInternal(sceneElementElementById, scene, fFractionalTime, new long[]{sceneElement.getId()}).getTransform().valueAtTime(fFractionalTime);
    }

    public static final SceneElement updateParent(SceneElement sceneElement, Scene scene, Long l2, float f3) {
        Keyable<Vector2D> keyableCopyWith$default;
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        int iSceneTimeFromLocalTime = KeyableKt.sceneTimeFromLocalTime(sceneElement, f3);
        Transform parentTransform = getParentTransform(sceneElement, scene, f3);
        Vector3D initialGlobalPos = getInitialGlobalPos(sceneElement, scene, iSceneTimeFromLocalTime);
        Vector3D dockedInfo = getDockedInfo(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, l2, false, null, null, -1, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null), scene, new Vector2D(initialGlobalPos.getX(), initialGlobalPos.getY()), iSceneTimeFromLocalTime);
        Vector3D vector3D = new Vector3D(dockedInfo.getX(), dockedInfo.getY(), initialGlobalPos.getZ() - dockedInfo.getZ());
        Transform parentTransform2 = getParentTransform(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, l2, false, null, null, -1, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null), scene, f3);
        SceneElement sceneElementCopy$default = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, l2, false, null, null, -1, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
        Vector3D vector3DUpdateParent$O = updateParent$O(sceneElement, 0.0f, (Vector3D) KeyableKt.valueAtTime(sceneElementCopy$default.getTransform().getLocation(), f3), parentTransform, parentTransform2);
        float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElementCopy$default.getTransform().getRotation(), f3)).floatValue();
        KeyableTransform transform = sceneElement.getTransform();
        Keyable<Vector3D> location = sceneElement.getTransform().getLocation();
        List<Keyframe<Vector3D>> keyframes = sceneElement.getTransform().getLocation().getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            Vector3D vector3DMinus = GeometryKt.minus(GeometryKt.plus(vector3D, updateParent$O(sceneElement, keyframe.getTime(), (Vector3D) keyframe.getValue(), parentTransform, parentTransform2)), vector3DUpdateParent$O);
            arrayList.add(Keyframe.copy$default(keyframe, new Vector3D(vector3DMinus.getX(), vector3DMinus.getY(), (((Vector3D) keyframe.getValue()).getZ() + parentTransform.getLocation().getZ()) - parentTransform2.getLocation().getZ()), 0.0f, null, null, 14, null));
        }
        Keyable keyableCopyWith$default2 = Keyable.DefaultImpls.copyWith$default(location, arrayList, false, null, 6, null);
        Keyable<Float> rotation = sceneElement.getTransform().getRotation();
        List<Keyframe<Float>> keyframes2 = sceneElement.getTransform().getRotation().getKeyframes();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes2, 10));
        Iterator<T> it2 = keyframes2.iterator();
        while (it2.hasNext()) {
            Keyframe keyframe2 = (Keyframe) it2.next();
            arrayList2.add(Keyframe.copy$default(keyframe2, Float.valueOf(((vector3D.getZ() + ((Number) keyframe2.getValue()).floatValue()) - fFloatValue) - parentTransform2.getRotation()), 0.0f, null, null, 14, null));
        }
        Keyable keyableCopyWith$default3 = Keyable.DefaultImpls.copyWith$default(rotation, arrayList2, false, null, 6, null);
        if (sceneElement.getType() == SceneElementType.Camera) {
            keyableCopyWith$default = sceneElement.getTransform().getScale();
        } else {
            Keyable<Vector2D> scale = sceneElement.getTransform().getScale();
            List<Keyframe<Vector2D>> keyframes3 = sceneElement.getTransform().getScale().getKeyframes();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes3, 10));
            Iterator<T> it3 = keyframes3.iterator();
            while (it3.hasNext()) {
                Keyframe keyframe3 = (Keyframe) it3.next();
                arrayList3.add(Keyframe.copy$default(keyframe3, GeometryKt.div(GeometryKt.times((Vector2D) keyframe3.getValue(), parentTransform.getScale()), parentTransform2.getScale()), 0.0f, null, null, 14, null));
            }
            keyableCopyWith$default = Keyable.DefaultImpls.copyWith$default(scale, arrayList3, false, null, 6, null);
        }
        return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, KeyableTransform.copy$default(transform, keyableCopyWith$default2, null, keyableCopyWith$default, keyableCopyWith$default3, 0.0f, 0.0f, null, null, false, 498, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, l2, false, null, null, -65, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyParentingInternal$lambda$16$lambda$10(Map.Entry entry) {
        return "do bendparenting " + ((KeyableVisualEffectRef) entry.getValue()).getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyParentingInternal$lambda$16$lambda$13$lambda$12(PosPos posPos) {
        return "bendparenting start pos - " + posPos.getRel() + " " + posPos.getBase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyParentingInternal$lambda$16$lambda$9(Map.Entry entry) {
        return "check bendparenting " + ((KeyableVisualEffectRef) entry.getValue()).getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDockedUVAngle$lambda$2(Rectangle rectangle, Transform transform) {
        return "bendparenting " + rectangle + " " + transform.getLocation();
    }

    private static final float localTime(SceneElement sceneElement, int i2) {
        return (i2 - sceneElement.getStartTime()) / (sceneElement.getEndTime() - sceneElement.getStartTime());
    }

    private static final Vector3D updateParent$O(SceneElement sceneElement, float f3, Vector3D vector3D, Transform transform, Transform transform2) {
        Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(sceneElement.getTransform().getPivot(), f3);
        Vector2D vector2DPlus = GeometryKt.plus(GeometryKt.minus(GeometryKt.rot(GeometryKt.times(GeometryKt.plus(GeometryKt.minus(new Vector2D(vector3D.getX(), vector3D.getY()), transform.getPivot()), vector2D), transform.getScale()), transform.getRotation()), vector2D), transform.getPivot());
        Vector3D location = transform.getLocation();
        Vector2D vector2DPlus2 = GeometryKt.plus(vector2DPlus, new Vector2D(location.getX(), location.getY()));
        Vector3D location2 = transform2.getLocation();
        Vector2D vector2DPlus3 = GeometryKt.plus(GeometryKt.minus(GeometryKt.div(GeometryKt.rot(GeometryKt.plus(GeometryKt.minus(GeometryKt.minus(vector2DPlus2, new Vector2D(location2.getX(), location2.getY())), transform2.getPivot()), vector2D), -transform2.getRotation()), transform2.getScale()), vector2D), transform2.getPivot());
        return new Vector3D(vector2DPlus3.getX(), vector2DPlus3.getY(), (vector3D.getZ() + transform.getLocation().getZ()) - transform2.getLocation().getZ());
    }

    private static final PosPos getDockedUVAngle(SceneElement sceneElement, SceneElement sceneElement2, Scene scene, int i2, int i3, float f3, float f4, int i5, float f5, float f6) {
        float f7;
        float lowerAngle;
        float lowerAngle2 = f3;
        final Transform transformValueAtTime = sceneElement.getTransform().valueAtTime(localTime(sceneElement, i2));
        final Rectangle rectangleBoundsInScene = SceneElementKt.boundsInScene(sceneElement2, scene);
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.qf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LayerParentingKt.getDockedUVAngle$lambda$2(rectangleBoundsInScene, transformValueAtTime);
            }
        });
        double x2 = ((double) ((transformValueAtTime.getLocation().getX() - rectangleBoundsInScene.getCx()) / rectangleBoundsInScene.getSize().getX())) + 0.5d;
        double cy = ((double) (((-transformValueAtTime.getLocation().getY()) + rectangleBoundsInScene.getCy()) / rectangleBoundsInScene.getSize().getY())) + 0.5d;
        float f8 = (float) x2;
        float f9 = (float) cy;
        Vector2D vector2D = new Vector2D(f8, f9);
        Vector3D vector3D = new Vector3D(f8, f9, 0.0f);
        if (Math.abs(lowerAngle2) >= 0.01d) {
            float f10 = 0.99f * f4;
            float x3 = rectangleBoundsInScene.getSize().getX() / rectangleBoundsInScene.getSize().getY();
            if (i3 == 0) {
                double d2 = f10;
                if (x2 >= d2) {
                    lowerAngle2 = getUpperAngle(lowerAngle2, f5, f10);
                } else if (i5 != 0 && d2 > 0.0d) {
                    lowerAngle2 = getLowerAngle(lowerAngle2, f6, f10, i5);
                }
                vector3D = getDockedUVAngle$getHorizontalUVAngle$3(cy, x3, x2, lowerAngle2, f10);
            } else if (i3 == 1) {
                float f11 = 1.0f - f10;
                float lowerAngle3 = -lowerAngle2;
                if (x2 <= f11) {
                    lowerAngle3 = getUpperAngle(lowerAngle3, f5, f10);
                } else if (i5 != 0 && f10 > 0.0d) {
                    lowerAngle3 = getLowerAngle(lowerAngle3, f6, f10, i5);
                }
                vector3D = getDockedUVAngle$getHorizontalUVAngle$3(cy, x3, x2, lowerAngle3, f11);
            } else if (i3 == 2) {
                float f12 = 1.0f - f10;
                if (cy <= f12) {
                    lowerAngle = getUpperAngle(lowerAngle2, f5, f10);
                } else if (i5 != 0 && f10 > 0.0d) {
                    lowerAngle = getLowerAngle(lowerAngle2, f6, f10, i5);
                } else {
                    f7 = lowerAngle2;
                    vector3D = getDockedUVAngle$getVerticalUVAngle$4(x2, x3, cy, f7, f12);
                }
                f7 = lowerAngle;
                vector3D = getDockedUVAngle$getVerticalUVAngle$4(x2, x3, cy, f7, f12);
            } else if (i3 == 3) {
                float lowerAngle4 = -lowerAngle2;
                double d4 = f10;
                if (cy >= d4) {
                    lowerAngle4 = getUpperAngle(lowerAngle4, f5, f10);
                } else if (i5 != 0 && d4 > 0.0d) {
                    lowerAngle4 = getLowerAngle(lowerAngle4, f6, f10, i5);
                }
                vector3D = getDockedUVAngle$getVerticalUVAngle$4(x2, x3, cy, lowerAngle4, f10);
            }
        }
        return new PosPos(vector3D, vector2D);
    }
}
