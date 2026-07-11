package com.alightcreative.app.motion.scene;

import aT.dE.JLZo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.easing.Easing;
import com.alightcreative.app.motion.easing.EasingUtilsKt;
import com.alightcreative.app.motion.easing.LinearEasing;
import com.alightcreative.app.motion.scene.animators.Animator;
import com.alightcreative.app.motion.scene.animators.AnimatorSerializerKt;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aU\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\u0010\f\u001aL\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u000f\"\u000e\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\b¢\u0006\u0002\u0010\u0015\u001aO\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u0002*\u00020\u000f\"\u000e\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"serialize", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/alightcreative/app/motion/scene/Keyable;", "default", "namespace", "", "serializer", "Lorg/xmlpull/v1/XmlSerializer;", "tag", "extras", "", "(Lcom/alightcreative/app/motion/scene/Keyable;Ljava/lang/Object;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/util/Map;)V", "unserializeKeyable", "KEYABLE", "", "ns", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "isPackage", "", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Z)Lcom/alightcreative/app/motion/scene/Keyable;", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/Object;Z)Lcom/alightcreative/app/motion/scene/Keyable;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeyableSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyableSerializer.kt\ncom/alightcreative/app/motion/scene/KeyableSerializerKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n216#2,2:119\n45#3,5:121\n50#3,7:127\n1#4:126\n*S KotlinDebug\n*F\n+ 1 KeyableSerializer.kt\ncom/alightcreative/app/motion/scene/KeyableSerializerKt\n*L\n21#1:119,2\n82#1:121,5\n82#1:127,7\n*E\n"})
public final class KeyableSerializerKt {
    public static final /* synthetic */ <T, KEYABLE extends Keyable<T>> KEYABLE unserializeKeyable(String str, XmlPullParser parser, String tag, boolean z2) {
        Object objSolidColor;
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
            objSolidColor = Float.valueOf(0.0f);
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            objSolidColor = Double.valueOf(0.0d);
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
            objSolidColor = GeometryKt.Vector2D();
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
            objSolidColor = GeometryKt.Vector3D();
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
            objSolidColor = GeometryKt.Vector4D();
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
            objSolidColor = Quaternion.INSTANCE.getIDENTITY();
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        } else {
            if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                throw new IllegalArgumentException();
            }
            objSolidColor = ColorKt.SolidColor();
            Intrinsics.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        }
        return (KEYABLE) unserializeKeyable(str, parser, tag, objSolidColor, z2);
    }

    public static final <T> void serialize(Keyable<T> keyable, T t3, String str, XmlSerializer xmlSerializer, String tag, Map<String, String> extras) throws IOException {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(xmlSerializer, JLZo.DuMGWeH);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (keyable.getKeyframes().isEmpty()) {
            return;
        }
        if (!keyable.getKeyed() && Intrinsics.areEqual(keyable.getKeyframes().get(0).getValue(), t3) && keyable.getAnimators().isEmpty()) {
            return;
        }
        xmlSerializer.startTag(str, tag);
        for (Map.Entry<String, String> entry : extras.entrySet()) {
            xmlSerializer.attribute(str, entry.getKey(), entry.getValue());
        }
        if (keyable.getKeyed()) {
            Iterator<Animator<T>> it = keyable.getAnimators().iterator();
            while (it.hasNext()) {
                AnimatorSerializerKt.serialize$default(it.next(), str, xmlSerializer, null, 4, null);
            }
            for (Keyframe<T> keyframe : keyable.getKeyframes()) {
                xmlSerializer.startTag(str, "kf");
                xmlSerializer.attribute(str, "t", HI0.DAz.t(keyframe.getTime()));
                xmlSerializer.attribute(str, "v", HI0.u.rl(keyframe.getValue()));
                if (!Intrinsics.areEqual(keyframe.getEasing(), LinearEasing.INSTANCE)) {
                    xmlSerializer.attribute(str, "e", keyframe.getEasing().serializeToString());
                }
                if (keyframe.getSmoothing() != Smoothing.None) {
                    xmlSerializer.attribute(str, CmcdData.STREAMING_FORMAT_SS, keyframe.getSmoothing().serializeToString());
                }
                xmlSerializer.endTag(str, "kf");
            }
        } else {
            if (!Intrinsics.areEqual(keyable.getKeyframes().get(0).getValue(), t3) || t3 == null) {
                xmlSerializer.attribute(str, "value", HI0.u.rl(keyable.getKeyframes().get(0).getValue()));
            }
            Iterator<Animator<T>> it2 = keyable.getAnimators().iterator();
            while (it2.hasNext()) {
                AnimatorSerializerKt.serialize$default(it2.next(), str, xmlSerializer, null, 4, null);
            }
        }
        xmlSerializer.endTag(str, tag);
    }

    public static /* synthetic */ void serialize$default(Keyable keyable, Object obj, String str, XmlSerializer xmlSerializer, String str2, Map map, int i2, Object obj2) throws IOException {
        if ((i2 & 16) != 0) {
            map = MapsKt.emptyMap();
        }
        serialize(keyable, obj, str, xmlSerializer, str2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object unserializeKeyable$lambda$1(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        Float floatOrNull = StringsKt.toFloatOrNull(s2);
        if (floatOrNull != null) {
            return Float.valueOf(XoT.Xo.rl(floatOrNull.floatValue(), 0.0f));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object unserializeKeyable$lambda$2(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        return StringsKt.toDoubleOrNull(s2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object unserializeKeyable$lambda$3(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        return GeometryKt.toVector2DOrNull(s2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object unserializeKeyable$lambda$4(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        return GeometryKt.toVector3DOrNull(s2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object unserializeKeyable$lambda$5(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        return GeometryKt.toVector4DOrNull(s2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object unserializeKeyable$lambda$6(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        return QuaternionKt.toQuaternionOrNull(s2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object unserializeKeyable$lambda$7(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        return HI0.qf.t(HI0.gnv.Uo(s2));
    }

    public static final <T, KEYABLE extends Keyable<T>> KEYABLE unserializeKeyable(String str, XmlPullParser parser, String tag, T t3, boolean z2) throws XmlPullParserException, IOException, MalformedSceneException {
        Function1 function1;
        T t4;
        Object objInvoke;
        Easing easingEasingFromSerializedString;
        Smoothing smoothingSmoothingFromSerializedString;
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(t3, "default");
        boolean z3 = t3 instanceof Float;
        if (z3) {
            function1 = new Function1() { // from class: com.alightcreative.app.motion.scene.s4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KeyableSerializerKt.unserializeKeyable$lambda$1((String) obj);
                }
            };
        } else if (t3 instanceof Double) {
            function1 = new Function1() { // from class: com.alightcreative.app.motion.scene.UGc
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KeyableSerializerKt.unserializeKeyable$lambda$2((String) obj);
                }
            };
        } else if (t3 instanceof Vector2D) {
            function1 = new Function1() { // from class: com.alightcreative.app.motion.scene.Q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KeyableSerializerKt.unserializeKeyable$lambda$3((String) obj);
                }
            };
        } else if (t3 instanceof Vector3D) {
            function1 = new Function1() { // from class: com.alightcreative.app.motion.scene.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KeyableSerializerKt.unserializeKeyable$lambda$4((String) obj);
                }
            };
        } else if (t3 instanceof Vector4D) {
            function1 = new Function1() { // from class: com.alightcreative.app.motion.scene.SPz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KeyableSerializerKt.unserializeKeyable$lambda$5((String) obj);
                }
            };
        } else if (t3 instanceof Quaternion) {
            function1 = new Function1() { // from class: com.alightcreative.app.motion.scene.ci
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KeyableSerializerKt.unserializeKeyable$lambda$6((String) obj);
                }
            };
        } else {
            if (!(t3 instanceof SolidColor)) {
                throw new IllegalArgumentException();
            }
            function1 = new Function1() { // from class: com.alightcreative.app.motion.scene.g9s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KeyableSerializerKt.unserializeKeyable$lambda$7((String) obj);
                }
            };
        }
        int i2 = 2;
        parser.require(2, str, tag);
        String attributeValue = parser.getAttributeValue(str, "value");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (parser.next() != 3) {
            if (parser.getEventType() == i2) {
                int depth = parser.getDepth();
                String name = parser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, "animator")) {
                    arrayList2.add(AnimatorSerializerKt.unserializeAnimator$default(str, parser, null, 4, null));
                } else if (Intrinsics.areEqual(name, "kf")) {
                    String attributeValue2 = parser.getAttributeValue(str, "t");
                    float fRl = attributeValue2 != null ? XoT.Xo.rl(Float.parseFloat(attributeValue2), 0.0f) : 0.0f;
                    String attributeValue3 = parser.getAttributeValue(str, "v");
                    if (attributeValue3 != null && (objInvoke = function1.invoke(attributeValue3)) != null) {
                        String attributeValue4 = parser.getAttributeValue(str, "e");
                        if (attributeValue4 == null || (easingEasingFromSerializedString = EasingUtilsKt.easingFromSerializedString(attributeValue4, z2)) == null) {
                            easingEasingFromSerializedString = LinearEasing.INSTANCE;
                        }
                        String attributeValue5 = parser.getAttributeValue(str, CmcdData.STREAMING_FORMAT_SS);
                        if (attributeValue5 == null || (smoothingSmoothingFromSerializedString = KeyableKt.smoothingFromSerializedString(attributeValue5)) == null) {
                            smoothingSmoothingFromSerializedString = Smoothing.None;
                        }
                        arrayList.add(new Keyframe(objInvoke, fRl, easingEasingFromSerializedString, smoothingSmoothingFromSerializedString));
                        HI0.YzO.J2(parser);
                    } else {
                        throw new MalformedSceneException(null, null, false, 7, null);
                    }
                } else {
                    HI0.YzO.J2(parser);
                }
                if (parser.getEventType() != 3 || parser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
                i2 = 2;
            }
        }
        if (attributeValue != null) {
            if (arrayList.isEmpty()) {
                Object objInvoke2 = function1.invoke(attributeValue);
                if (objInvoke2 != null) {
                    arrayList.add(new Keyframe(objInvoke2, 0.0f, null, null, 14, null));
                } else {
                    throw new MalformedSceneException(null, null, false, 7, null);
                }
            } else {
                throw new MalformedSceneException(null, null, false, 7, null);
            }
        }
        boolean z4 = attributeValue == null && !arrayList.isEmpty();
        if (arrayList.isEmpty()) {
            t4 = t3;
            arrayList.add(new Keyframe(t4, 0.0f, null, null, 14, null));
        } else {
            t4 = t3;
        }
        if (z3) {
            return new KeyableFloat(z4, arrayList, arrayList2);
        }
        if (t4 instanceof Double) {
            return new KeyableDouble(z4, arrayList, arrayList2);
        }
        if (t4 instanceof Vector2D) {
            return new KeyableVector2D(z4, arrayList, arrayList2);
        }
        if (t4 instanceof Vector3D) {
            return new KeyableVector3D(z4, arrayList, arrayList2);
        }
        if (t4 instanceof Vector4D) {
            return new KeyableVector4D(z4, arrayList, arrayList2);
        }
        if (t4 instanceof SolidColor) {
            return new KeyableSolidColor(z4, arrayList, arrayList2);
        }
        if (t4 instanceof Quaternion) {
            return new KeyableQuaternion(z4, arrayList, arrayList2);
        }
        throw new IllegalStateException();
    }
}
