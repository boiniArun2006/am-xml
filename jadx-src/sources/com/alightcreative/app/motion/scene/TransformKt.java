package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Parcelable;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000b\u001a\u0019\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0016\u001a9\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001e\u001a\u0019\u0010 \u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u0016\u001a\u0019\u0010\"\u001a\u00020#*\u00020!2\u0006\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010$\u001a\u0019\u0010\"\u001a\u00020#*\u00020%2\u0006\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010&\u001a\u0019\u0010\"\u001a\u00020#*\u00020'2\u0006\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010(\u001a!\u0010,\u001a\u00020+*\u00020\u00002\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010,\u001a\u00020\f*\u00020\u00002\u0006\u0010.\u001a\u00020\f¢\u0006\u0004\b,\u0010/\u001a\u0011\u00101\u001a\u000200*\u00020\u0001¢\u0006\u0004\b1\u00102\u001a\u001f\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002050403*\u00020\u0001¢\u0006\u0004\b6\u00107\u001a-\u00109\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u000205040803*\u00020\u0001¢\u0006\u0004\b9\u00107\u001a-\u0010?\u001a\u00020#*\u00020\u00012\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020:¢\u0006\u0004\b?\u0010@\u001a'\u0010E\u001a\u00020\u00012\b\u0010A\u001a\u0004\u0018\u00010:2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u000200¢\u0006\u0004\bE\u0010F\u001a\u0019\u0010G\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\bG\u0010\u0016\"\u0015\u0010J\u001a\u00020\u0000*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/alightcreative/app/motion/scene/Transform;", "Lcom/alightcreative/app/motion/scene/KeyableTransform;", "asKeyable", "(Lcom/alightcreative/app/motion/scene/Transform;)Lcom/alightcreative/app/motion/scene/KeyableTransform;", InneractiveMediationNameConsts.OTHER, "transformedBy", "(Lcom/alightcreative/app/motion/scene/Transform;Lcom/alightcreative/app/motion/scene/Transform;)Lcom/alightcreative/app/motion/scene/Transform;", "", "dx", "dy", "translatedBy", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;FF)Lcom/alightcreative/app/motion/scene/KeyableTransform;", "Lcom/alightcreative/app/motion/scene/Vector2D;", "offset", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;Lcom/alightcreative/app/motion/scene/Vector2D;)Lcom/alightcreative/app/motion/scene/KeyableTransform;", "Lcom/alightcreative/app/motion/scene/Vector3D;", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;Lcom/alightcreative/app/motion/scene/Vector3D;)Lcom/alightcreative/app/motion/scene/KeyableTransform;", "locationScaledBy", "sx", "sy", "angle", "rotatedBy", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;F)Lcom/alightcreative/app/motion/scene/KeyableTransform;", "scale", "multOpacityBy", "focusX", "focusY", "scaledBy", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;FFFF)Lcom/alightcreative/app/motion/scene/KeyableTransform;", "factor", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;Lcom/alightcreative/app/motion/scene/Vector2D;FF)Lcom/alightcreative/app/motion/scene/KeyableTransform;", "oneFrameDuration", "reverseInterpolateFirstFrame", "Landroid/graphics/Canvas;", "transform", "", "(Landroid/graphics/Canvas;Lcom/alightcreative/app/motion/scene/Transform;)V", "Landroid/graphics/Path;", "(Landroid/graphics/Path;Lcom/alightcreative/app/motion/scene/Transform;)V", "LWzY/z;", "(LWzY/z;Lcom/alightcreative/app/motion/scene/Transform;)V", "x", "y", "", "transformPoint", "(Lcom/alightcreative/app/motion/scene/Transform;FF)[F", "point", "(Lcom/alightcreative/app/motion/scene/Transform;Lcom/alightcreative/app/motion/scene/Vector2D;)Lcom/alightcreative/app/motion/scene/Vector2D;", "", "hasKeyframes", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;)Z", "", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "getKeyableProperties", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;)Ljava/util/List;", "LoA/j;", "getKeyablePropertyLenses", "", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "tag", "serialize", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;)V", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "isPackage", "keyableTransformFromXml", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/KeyableTransform;", "rotatedWithPivotBy", "getInverse", "(Lcom/alightcreative/app/motion/scene/Transform;)Lcom/alightcreative/app/motion/scene/Transform;", "inverse", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\ncom/alightcreative/app/motion/scene/TransformKt\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n+ 4 KeyableSerializer.kt\ncom/alightcreative/app/motion/scene/KeyableSerializerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n143#2:342\n143#2:343\n143#2:344\n143#2:345\n143#2:346\n143#2:347\n45#3,5:348\n50#3,7:397\n52#4,11:353\n52#4,11:364\n52#4,11:375\n52#4,11:386\n1557#5:404\n1628#5,3:405\n1557#5:408\n1628#5,3:409\n*S KotlinDebug\n*F\n+ 1 Transform.kt\ncom/alightcreative/app/motion/scene/TransformKt\n*L\n255#1:342\n256#1:343\n257#1:344\n258#1:345\n259#1:346\n260#1:347\n294#1:348,5\n294#1:397,7\n296#1:353,11\n297#1:364,11\n299#1:375,11\n300#1:386,11\n329#1:404\n329#1:405,3\n338#1:408\n338#1:409,3\n*E\n"})
public final class TransformKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03f5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KeyableTransform keyableTransformFromXml(String str, XmlPullParser parser, boolean z2) throws XmlPullParserException, IOException, MalformedSceneException {
        Float fValueOf;
        Vector2D vector2D;
        Vector2D vector2D2;
        Vector3D Vector3D;
        Float floatOrNull;
        Float floatOrNull2;
        Intrinsics.checkNotNullParameter(parser, "parser");
        int i2 = 2;
        parser.require(2, str, "transform");
        String attributeValue = parser.getAttributeValue(str, "lockAspectRatio");
        boolean z3 = attributeValue != null ? Boolean.parseBoolean(attributeValue) : true;
        String attributeValue2 = parser.getAttributeValue(str, "orientation");
        float f3 = 0.0f;
        float fFloatValue = (attributeValue2 == null || (floatOrNull2 = StringsKt.toFloatOrNull(attributeValue2)) == null) ? 0.0f : floatOrNull2.floatValue();
        String attributeValue3 = parser.getAttributeValue(str, "size");
        float f4 = 1.0f;
        float fFloatValue2 = (attributeValue3 == null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue3)) == null) ? 1.0f : floatOrNull.floatValue();
        Keyable keyable = KeyableKt.keyable(Vector3D.INSTANCE.getZERO());
        Vector2D.Companion companion = Vector2D.INSTANCE;
        KeyableVector2D keyableVector2DKeyable = KeyableKt.keyable(companion.getZERO());
        KeyableVector2D keyableVector2DKeyable2 = KeyableKt.keyable(companion.getONE());
        Keyable keyable2 = KeyableKt.keyable(companion.getZERO());
        Keyable keyableUnserializeKeyable = keyableVector2DKeyable;
        Keyable keyableUnserializeKeyable2 = keyableVector2DKeyable2;
        Keyable keyable3 = KeyableKt.keyable(0.0f);
        Keyable keyable4 = KeyableKt.keyable(1.0f);
        while (true) {
            float f5 = f3;
            if (parser.next() == 3) {
                return new KeyableTransform(keyable, keyableUnserializeKeyable, keyableUnserializeKeyable2, keyable3, fFloatValue, fFloatValue2, keyable4, keyable2, z3);
            }
            if (parser.getEventType() == i2) {
                int depth = parser.getDepth();
                String name = parser.getName();
                float f6 = f4;
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                int iHashCode = name.hashCode();
                Class cls = Double.TYPE;
                Class cls2 = Float.TYPE;
                switch (iHashCode) {
                    case -1267206133:
                        if (name.equals("opacity")) {
                            keyable4 = KeyableSerializerKt.unserializeKeyable(str, parser, name, Float.valueOf(f6), z2);
                        } else {
                            HI0.YzO.J2(parser);
                        }
                        if (parser.getEventType() == 3 && parser.getDepth() == depth) {
                            f3 = f5;
                            f4 = f6;
                            i2 = 2;
                        }
                        break;
                    case -40300674:
                        if (name.equals("rotation")) {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Float.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls2))) {
                                fValueOf = Float.valueOf(f5);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls))) {
                                fValueOf = (Float) Double.valueOf(0.0d);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                Object objVector2D = GeometryKt.Vector2D();
                                if (objVector2D == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                fValueOf = (Float) objVector2D;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                Object objVector3D = GeometryKt.Vector3D();
                                if (objVector3D == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                fValueOf = (Float) objVector3D;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                Object objVector4D = GeometryKt.Vector4D();
                                if (objVector4D == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                fValueOf = (Float) objVector4D;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                Object identity = Quaternion.INSTANCE.getIDENTITY();
                                if (identity == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                fValueOf = (Float) identity;
                            } else {
                                if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                    throw new IllegalArgumentException();
                                }
                                Object objSolidColor = ColorKt.SolidColor();
                                if (objSolidColor == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                fValueOf = (Float) objSolidColor;
                            }
                            keyable3 = KeyableSerializerKt.unserializeKeyable(str, parser, name, fValueOf, z2);
                        }
                        if (parser.getEventType() == 3) {
                        }
                        break;
                    case 3532042:
                        if (name.equals("skew")) {
                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Vector2D.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls2))) {
                                vector2D = (Vector2D) Float.valueOf(f5);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls))) {
                                vector2D = (Vector2D) Double.valueOf(0.0d);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                Vector2D Vector2D = GeometryKt.Vector2D();
                                if (Vector2D == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D = Vector2D;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                Parcelable parcelableVector3D = GeometryKt.Vector3D();
                                if (parcelableVector3D == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D = (Vector2D) parcelableVector3D;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                Parcelable parcelableVector4D = GeometryKt.Vector4D();
                                if (parcelableVector4D == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D = (Vector2D) parcelableVector4D;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                Object identity2 = Quaternion.INSTANCE.getIDENTITY();
                                if (identity2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D = (Vector2D) identity2;
                            } else {
                                if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                    throw new IllegalArgumentException();
                                }
                                Object objSolidColor2 = ColorKt.SolidColor();
                                if (objSolidColor2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D = (Vector2D) objSolidColor2;
                            }
                            keyable2 = KeyableSerializerKt.unserializeKeyable(str, parser, name, vector2D, z2);
                        }
                        if (parser.getEventType() == 3) {
                        }
                        break;
                    case 106679362:
                        if (name.equals("pivot")) {
                            KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Vector2D.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls2))) {
                                vector2D2 = (Vector2D) Float.valueOf(f5);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls))) {
                                vector2D2 = (Vector2D) Double.valueOf(0.0d);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                Vector2D Vector2D2 = GeometryKt.Vector2D();
                                if (Vector2D2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D2 = Vector2D2;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                Parcelable parcelableVector3D2 = GeometryKt.Vector3D();
                                if (parcelableVector3D2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D2 = (Vector2D) parcelableVector3D2;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                Parcelable parcelableVector4D2 = GeometryKt.Vector4D();
                                if (parcelableVector4D2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D2 = (Vector2D) parcelableVector4D2;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                Object identity3 = Quaternion.INSTANCE.getIDENTITY();
                                if (identity3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D2 = (Vector2D) identity3;
                            } else {
                                if (!Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                    throw new IllegalArgumentException();
                                }
                                Object objSolidColor3 = ColorKt.SolidColor();
                                if (objSolidColor3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                }
                                vector2D2 = (Vector2D) objSolidColor3;
                            }
                            keyableUnserializeKeyable = KeyableSerializerKt.unserializeKeyable(str, parser, name, vector2D2, z2);
                        }
                        if (parser.getEventType() == 3) {
                        }
                        break;
                    case 109250890:
                        if (name.equals("scale")) {
                            keyableUnserializeKeyable2 = KeyableSerializerKt.unserializeKeyable(str, parser, name, Vector2D.INSTANCE.getONE(), z2);
                        }
                        if (parser.getEventType() == 3) {
                        }
                        break;
                    case 1901043637:
                        if (name.equals("location")) {
                            KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Vector3D.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls2))) {
                                Vector3D = (Vector3D) Float.valueOf(f5);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls))) {
                                Vector3D = (Vector3D) Double.valueOf(0.0d);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                Parcelable parcelableVector2D = GeometryKt.Vector2D();
                                if (parcelableVector2D == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                                }
                                Vector3D = (Vector3D) parcelableVector2D;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                Vector3D = GeometryKt.Vector3D();
                                if (Vector3D == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                                }
                            } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                Parcelable parcelableVector4D3 = GeometryKt.Vector4D();
                                if (parcelableVector4D3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                                }
                                Vector3D = (Vector3D) parcelableVector4D3;
                            } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                Object identity4 = Quaternion.INSTANCE.getIDENTITY();
                                if (identity4 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                                }
                                Vector3D = (Vector3D) identity4;
                            } else {
                                if (!Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                    throw new IllegalArgumentException();
                                }
                                Object objSolidColor4 = ColorKt.SolidColor();
                                if (objSolidColor4 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                                }
                                Vector3D = (Vector3D) objSolidColor4;
                            }
                            keyable = KeyableSerializerKt.unserializeKeyable(str, parser, name, Vector3D, z2);
                        }
                        if (parser.getEventType() == 3) {
                        }
                        break;
                }
            } else {
                f3 = f5;
            }
        }
        throw new IllegalStateException("Did not consume all tag contents");
    }

    public static final KeyableTransform locationScaledBy(KeyableTransform keyableTransform, Vector2D offset) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return KeyableTransform.copy$default(keyableTransform, KeyableKt.scaledBy$default(keyableTransform.getLocation(), offset.getX(), offset.getY(), 0.0f, 0.0f, 0.0f, 0.0f, 60, null), null, null, null, 0.0f, 0.0f, null, null, false, 510, null);
    }

    public static final KeyableTransform scaledBy(KeyableTransform keyableTransform, float f3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        return KeyableTransform.copy$default(keyableTransform, null, null, KeyableKt.scaledBy(keyableTransform.getScale(), f3, f4, f5, f6), null, 0.0f, 0.0f, null, null, false, 507, null);
    }

    public static /* synthetic */ KeyableTransform scaledBy$default(KeyableTransform keyableTransform, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f4 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f6 = 0.0f;
        }
        return scaledBy(keyableTransform, f3, f4, f5, f6);
    }

    public static final void transform(Canvas canvas, Transform transform) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        canvas.translate(transform.getLocation().getX(), transform.getLocation().getY());
        canvas.translate(transform.getPivot().getX(), transform.getPivot().getY());
        canvas.rotate(transform.getRotation());
        canvas.scale(transform.getScale().getX(), transform.getScale().getY());
        canvas.skew(transform.getSkew().getX(), transform.getSkew().getY());
        canvas.translate(-transform.getPivot().getX(), -transform.getPivot().getY());
        canvas.rotate(transform.getOrientation());
        canvas.scale(transform.getSize(), transform.getSize());
    }

    public static final float[] transformPoint(Transform transform, float f3, float f4) {
        Intrinsics.checkNotNullParameter(transform, "<this>");
        float[] fArr = {f3, f4};
        transform.getMatrix().mapPoints(fArr);
        return fArr;
    }

    public static final KeyableTransform translatedBy(KeyableTransform keyableTransform, float f3, float f4) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        return KeyableTransform.copy$default(keyableTransform, KeyableKt.translatedByVector3D(keyableTransform.getLocation(), f3, f4), null, null, null, 0.0f, 0.0f, null, null, false, 510, null);
    }

    public static final KeyableTransform asKeyable(Transform transform) {
        Intrinsics.checkNotNullParameter(transform, "<this>");
        return new KeyableTransform(KeyableKt.keyable(transform.getLocation()), KeyableKt.keyable(transform.getPivot()), KeyableKt.keyable(transform.getScale()), KeyableKt.keyable(transform.getRotation()), transform.getOrientation(), transform.getSize(), KeyableKt.keyable(transform.getOpacity()), KeyableKt.keyable(transform.getSkew()), false, 256, null);
    }

    public static final Transform getInverse(Transform transform) {
        Intrinsics.checkNotNullParameter(transform, "<this>");
        return new Transform(transform.getLocation(), transform.getPivot(), GeometryKt.recip(transform.getScale()), -transform.getOrientation(), transform.getSize(), -transform.getRotation(), transform.getOpacity(), new Vector2D(-transform.getSkew().getX(), -transform.getSkew().getY()), null, 256, null);
    }

    public static final List<Keyable<? extends Object>> getKeyableProperties(KeyableTransform keyableTransform) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        return CollectionsKt.listOf((Object[]) new Keyable[]{keyableTransform.getLocation(), keyableTransform.getPivot(), keyableTransform.getScale(), keyableTransform.getRotation(), keyableTransform.getOpacity(), keyableTransform.getSkew()});
    }

    public static final List<oA.j> getKeyablePropertyLenses(KeyableTransform keyableTransform) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        AnonymousClass1 anonymousClass1 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.TransformKt.getKeyablePropertyLenses.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getLocation();
            }
        };
        oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(KeyableTransform.class), anonymousClass1.getReturnType(), anonymousClass1);
        AnonymousClass2 anonymousClass2 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.TransformKt.getKeyablePropertyLenses.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getPivot();
            }
        };
        oA.n nVar2 = new oA.n(Reflection.getOrCreateKotlinClass(KeyableTransform.class), anonymousClass2.getReturnType(), anonymousClass2);
        AnonymousClass3 anonymousClass3 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.TransformKt.getKeyablePropertyLenses.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getScale();
            }
        };
        oA.n nVar3 = new oA.n(Reflection.getOrCreateKotlinClass(KeyableTransform.class), anonymousClass3.getReturnType(), anonymousClass3);
        AnonymousClass4 anonymousClass4 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.TransformKt.getKeyablePropertyLenses.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getRotation();
            }
        };
        oA.n nVar4 = new oA.n(Reflection.getOrCreateKotlinClass(KeyableTransform.class), anonymousClass4.getReturnType(), anonymousClass4);
        AnonymousClass5 anonymousClass5 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.TransformKt.getKeyablePropertyLenses.5
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getOpacity();
            }
        };
        oA.n nVar5 = new oA.n(Reflection.getOrCreateKotlinClass(KeyableTransform.class), anonymousClass5.getReturnType(), anonymousClass5);
        AnonymousClass6 anonymousClass6 = new PropertyReference1Impl() { // from class: com.alightcreative.app.motion.scene.TransformKt.getKeyablePropertyLenses.6
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableTransform) obj).getSkew();
            }
        };
        return CollectionsKt.listOf((Object[]) new oA.j[]{nVar, nVar2, nVar3, nVar4, nVar5, new oA.n(Reflection.getOrCreateKotlinClass(KeyableTransform.class), anonymousClass6.getReturnType(), anonymousClass6)});
    }

    public static final boolean hasKeyframes(KeyableTransform keyableTransform) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        return keyableTransform.getLocation().getKeyed() || keyableTransform.getScale().getKeyed() || keyableTransform.getRotation().getKeyed();
    }

    public static final KeyableTransform locationScaledBy(KeyableTransform keyableTransform, float f3, float f4) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        return KeyableTransform.copy$default(keyableTransform, KeyableKt.scaledBy$default(keyableTransform.getLocation(), f3, f4, 0.0f, 0.0f, 0.0f, 0.0f, 60, null), null, null, null, 0.0f, 0.0f, null, null, false, 510, null);
    }

    public static final KeyableTransform multOpacityBy(KeyableTransform keyableTransform, float f3) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        return KeyableTransform.copy$default(keyableTransform, null, null, null, null, 0.0f, 0.0f, KeyableKt.scaleBy(keyableTransform.getOpacity(), f3), null, false, 447, null);
    }

    public static final KeyableTransform reverseInterpolateFirstFrame(KeyableTransform keyableTransform, float f3) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        return KeyableTransform.copy$default(keyableTransform, KeyableKt.reverseInterpolateFirstFrame(keyableTransform.getLocation(), f3), null, KeyableKt.reverseInterpolateFirstFrame(keyableTransform.getScale(), f3), KeyableKt.reverseInterpolateFirstFrame(keyableTransform.getRotation(), f3), 0.0f, 0.0f, null, null, false, 498, null);
    }

    public static final KeyableTransform rotatedBy(KeyableTransform keyableTransform, float f3) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        return KeyableTransform.copy$default(keyableTransform, null, null, null, KeyableKt.offsetBy(keyableTransform.getRotation(), f3), 0.0f, 0.0f, null, null, false, 503, null);
    }

    public static final KeyableTransform rotatedWithPivotBy(KeyableTransform keyableTransform, float f3) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        Keyable<Vector2D> pivot = keyableTransform.getPivot();
        Keyable<Vector2D> keyableRotatedBy = KeyableKt.rotatedBy(pivot, f3);
        List<Keyframe<Vector3D>> keyframes = keyableTransform.getLocation().getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            Vector2D vector2DMinus = GeometryKt.minus((Vector2D) KeyableKt.valueAtTime(keyableRotatedBy, keyframe.getTime()), (Vector2D) KeyableKt.valueAtTime(pivot, keyframe.getTime()));
            arrayList.add(Keyframe.copy$default(keyframe, new Vector3D(((Vector3D) keyframe.getValue()).getX() - vector2DMinus.getX(), ((Vector3D) keyframe.getValue()).getY() - vector2DMinus.getY(), ((Vector3D) keyframe.getValue()).getZ()), 0.0f, null, null, 14, null));
        }
        Keyable keyableCopyWith$default = Keyable.DefaultImpls.copyWith$default(keyableTransform.getLocation(), arrayList, false, null, 6, null);
        Keyable<Float> rotation = keyableTransform.getRotation();
        List<Keyframe<Float>> keyframes2 = keyableTransform.getRotation().getKeyframes();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes2, 10));
        Iterator<T> it2 = keyframes2.iterator();
        while (it2.hasNext()) {
            Keyframe keyframe2 = (Keyframe) it2.next();
            arrayList2.add(Keyframe.copy$default(keyframe2, Float.valueOf(((Number) keyframe2.getValue()).floatValue() - f3), 0.0f, null, null, 14, null));
        }
        return KeyableTransform.copy$default(keyableTransform, keyableCopyWith$default, keyableRotatedBy, null, Keyable.DefaultImpls.copyWith$default(rotation, arrayList2, false, null, 6, null), 0.0f, 0.0f, null, null, false, 500, null);
    }

    public static final KeyableTransform scaledBy(KeyableTransform keyableTransform, Vector2D factor, float f3, float f4) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        Intrinsics.checkNotNullParameter(factor, "factor");
        return KeyableTransform.copy$default(keyableTransform, null, null, KeyableKt.scaledBy(keyableTransform.getScale(), factor.getX(), factor.getY(), f3, f4), null, 0.0f, 0.0f, null, null, false, 507, null);
    }

    public static /* synthetic */ KeyableTransform scaledBy$default(KeyableTransform keyableTransform, Vector2D vector2D, float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        return scaledBy(keyableTransform, vector2D, f3, f4);
    }

    public static final void serialize(KeyableTransform keyableTransform, String str, XmlSerializer serializer, String tag) throws IOException {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(tag, "tag");
        serializer.startTag(str, tag);
        if (!keyableTransform.getLockAspectRatio()) {
            HI0.YzO.nr(serializer, str, "lockAspectRatio", keyableTransform.getLockAspectRatio());
        }
        if (keyableTransform.getOrientation() != 0.0f) {
            HI0.YzO.n(serializer, str, "orientation", keyableTransform.getOrientation());
        }
        if (keyableTransform.getSize() != 1.0f) {
            HI0.YzO.n(serializer, str, "size", keyableTransform.getSize());
        }
        KeyableSerializerKt.serialize$default(keyableTransform.getLocation(), Vector3D.INSTANCE.getZERO(), str, serializer, "location", null, 16, null);
        KeyableSerializerKt.serialize$default(keyableTransform.getPivot(), new Vector2D(0.0f, 0.0f), str, serializer, "pivot", null, 16, null);
        KeyableSerializerKt.serialize$default(keyableTransform.getScale(), new Vector2D(1.0f, 1.0f), str, serializer, "scale", null, 16, null);
        KeyableSerializerKt.serialize$default(keyableTransform.getSkew(), new Vector2D(0.0f, 0.0f), str, serializer, "skew", null, 16, null);
        KeyableSerializerKt.serialize$default(keyableTransform.getRotation(), Float.valueOf(0.0f), str, serializer, "rotation", null, 16, null);
        KeyableSerializerKt.serialize$default(keyableTransform.getOpacity(), Float.valueOf(1.0f), str, serializer, "opacity", null, 16, null);
        serializer.endTag(str, tag);
    }

    public static /* synthetic */ void serialize$default(KeyableTransform keyableTransform, String str, XmlSerializer xmlSerializer, String str2, int i2, Object obj) throws IOException {
        if ((i2 & 4) != 0) {
            str2 = "transform";
        }
        serialize(keyableTransform, str, xmlSerializer, str2);
    }

    public static final Transform transformedBy(Transform transform, Transform other) {
        Intrinsics.checkNotNullParameter(transform, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Transform(GeometryKt.plus(transform.getLocation(), other.getLocation()), GeometryKt.plus(transform.getPivot(), other.getPivot()), GeometryKt.times(transform.getScale(), other.getScale()), transform.getOrientation(), transform.getSize(), transform.getRotation() + other.getRotation(), transform.getOpacity() * other.getOpacity(), GeometryKt.plus(transform.getSkew(), other.getSkew()), null, 256, null);
    }

    public static final KeyableTransform translatedBy(KeyableTransform keyableTransform, Vector2D offset) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return KeyableTransform.copy$default(keyableTransform, KeyableKt.translatedByVector3D(keyableTransform.getLocation(), offset.getX(), offset.getY()), null, null, null, 0.0f, 0.0f, null, null, false, 510, null);
    }

    public static final Vector2D transformPoint(Transform transform, Vector2D point) {
        Intrinsics.checkNotNullParameter(transform, "<this>");
        Intrinsics.checkNotNullParameter(point, "point");
        float[] fArr = {point.getX(), point.getY()};
        transform.getMatrix().mapPoints(fArr);
        return new Vector2D(fArr[0], fArr[1]);
    }

    public static final KeyableTransform translatedBy(KeyableTransform keyableTransform, Vector3D offset) {
        Intrinsics.checkNotNullParameter(keyableTransform, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return KeyableTransform.copy$default(keyableTransform, KeyableKt.translatedBy(keyableTransform.getLocation(), offset.getX(), offset.getY(), offset.getZ()), null, null, null, 0.0f, 0.0f, null, null, false, 510, null);
    }

    public static final void transform(Path path, Transform transform) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        path.transform(transform.getMatrix());
    }

    public static final void transform(C1487z c1487z, Transform transform) {
        Intrinsics.checkNotNullParameter(c1487z, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        c1487z.Mx(transform.getMatrix());
    }
}
