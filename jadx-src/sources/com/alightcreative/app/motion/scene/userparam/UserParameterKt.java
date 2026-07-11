package com.alightcreative.app.motion.scene.userparam;

import HI0.YzO;
import XoT.C;
import android.net.Uri;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableQuaternion;
import com.alightcreative.app.motion.scene.KeyableSerializerKt;
import com.alightcreative.app.motion.scene.KeyableSolidColor;
import com.alightcreative.app.motion.scene.KeyableVector2D;
import com.alightcreative.app.motion.scene.KeyableVector3D;
import com.alightcreative.app.motion.scene.KeyableVector4D;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.Vector4D;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KClass;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import r.C2348n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\n\u0010\b\u001a1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006*\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\f\u0010\b\u001a1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006*\b\u0012\u0004\u0012\u00020\r0\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u000e\u0010\b\u001a1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006*\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0010\u0010\b\u001a1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006*\b\u0012\u0004\u0012\u00020\u00110\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0012\u0010\b\u001a%\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0005\u001a1\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00170\u0014*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00000\u00142\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aM\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00170\u0014*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00000\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001b0\u0014¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010\"\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010&\u001a\u00020\u0002*\u00020$2\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010(\u001a\u00020\u0002*\u00020$2\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b(\u0010'\u001a\u0019\u0010)\u001a\u00020\u0015*\u00020$2\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*\u001aL\u00104\u001a\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`3\"\u0006\b\u0000\u0010+\u0018\u0001*\u00020\u001b2\u0006\u0010,\u001a\u00028\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150-2\b\b\u0002\u00100\u001a\u00020/H\u0086\b¢\u0006\u0004\b4\u00105\u001a+\u0010;\u001a\u00020:*\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u00152\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b;\u0010<\u001a3\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00000B2\b\u0010=\u001a\u0004\u0018\u00010\u00152\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bC\u0010D\u001a\u0019\u0010G\u001a\u00020@*\u00020\u001b2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010H\"\u0015\u0010I\u001a\u00020@*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bI\u0010J\"\u0015\u0010K\u001a\u00020@*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bK\u0010J\"\u0015\u0010L\u001a\u00020@*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bL\u0010J\"\u0017\u0010O\u001a\u0004\u0018\u00010\u0000*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bM\u0010N\"\u0015\u0010Q\u001a\u00020@*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bP\u0010J\"\u001f\u0010U\u001a\f\u0012\u0006\b\u0001\u0012\u00020R\u0018\u00010\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u0015\u0010X\u001a\u00020\u0015*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "Lkotlin/Function1;", "", "mapper", "copyAdjustingTime", "(Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;Lkotlin/jvm/functions/Function1;)Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "Lcom/alightcreative/app/motion/scene/Keyable;", "copyAdjustingFloatValue", "(Lcom/alightcreative/app/motion/scene/Keyable;Lkotlin/jvm/functions/Function1;)Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/Vector2D;", "copyAdjustingVector2DValue", "Lcom/alightcreative/app/motion/scene/Vector3D;", "copyAdjustingVector3DValue", "Lcom/alightcreative/app/motion/scene/Vector4D;", "copyAdjustingVector4DValue", "Lcom/alightcreative/app/motion/scene/Quaternion;", "copyAdjustingVectorQuatValue", "Lcom/alightcreative/app/motion/scene/SolidColor;", "copyAdjustingVectorColorValue", "copyAdjustingValue", "", "", "time", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "atTime", "(Ljava/util/Map;F)Ljava/util/Map;", "durationSeconds", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "defs", "atTimeAccum", "(Ljava/util/Map;FFLjava/util/Map;)Ljava/util/Map;", "valueAtTime", "(Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;F)Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "param", "valueAtTimeAccum", "(Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;FFLcom/alightcreative/app/motion/scene/userparam/UserParameter;)Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "Lcom/alightcreative/app/motion/scene/userparam/SliderType;", "value", "calcSliderTypeValueForViewing", "(Lcom/alightcreative/app/motion/scene/userparam/SliderType;F)F", "calcSliderTypeValueForSaving", "format", "(Lcom/alightcreative/app/motion/scene/userparam/SliderType;F)Ljava/lang/String;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "currentV", "", "labelList", "", "focusFieldNumber", "Ljava/util/ArrayList;", "Lr/n;", "Lkotlin/collections/ArrayList;", "getInputFieldInfoList", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;Ljava/lang/Object;Ljava/util/List;I)Ljava/util/ArrayList;", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "key", "", "serialize", "(Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;)V", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "isPackage", "Lkotlin/Pair;", "unserializeUserParameterValue", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lkotlin/Pair;", "Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "effectRef", "isEnabledByEffectSetting", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;)Z", "isDraggable", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)Z", "isSection", "isEditFirstHintedSection", "getDefaultKeyableUserParameterValue", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "defaultKeyableUserParameterValue", "getHasUI", "hasUI", "", "getKeyable", "(Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;)Lcom/alightcreative/app/motion/scene/Keyable;", "keyable", "getGlslType", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)Ljava/lang/String;", "glslType", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserParameter.kt\ncom/alightcreative/app/motion/scene/userparam/UserParameterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 KeyableSerializer.kt\ncom/alightcreative/app/motion/scene/KeyableSerializerKt\n*L\n1#1,762:1\n1#2:763\n1557#3:764\n1628#3,3:765\n1557#3:768\n1628#3,3:769\n1557#3:772\n1628#3,3:773\n1557#3:776\n1628#3,3:777\n1557#3:780\n1628#3,3:781\n1557#3:784\n1628#3,3:785\n1246#3,4:790\n1246#3,4:796\n230#3,2:866\n1755#3,3:868\n462#4:788\n412#4:789\n462#4:794\n412#4:795\n52#5,11:800\n52#5,11:811\n52#5,11:822\n52#5,11:833\n52#5,11:844\n52#5,11:855\n*S KotlinDebug\n*F\n+ 1 UserParameter.kt\ncom/alightcreative/app/motion/scene/userparam/UserParameterKt\n*L\n311#1:764\n311#1:765,3\n312#1:768\n312#1:769,3\n313#1:772\n313#1:773,3\n314#1:776\n314#1:777,3\n315#1:780\n315#1:781,3\n316#1:784\n316#1:785,3\n333#1:790,4\n336#1:796,4\n746#1:866,2\n753#1:868,3\n333#1:788\n333#1:789\n336#1:794\n336#1:795\n715#1:800,11\n717#1:811,11\n720#1:822,11\n721#1:833,11\n722#1:844,11\n723#1:855,11\n*E\n"})
public final class UserParameterKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DataType.values().length];
            try {
                iArr[DataType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataType.SOLID_COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataType.VEC2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataType.VEC3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataType.VEC4.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataType.BOOLEAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataType.TEXTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DataType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DataType.QUAT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DataType.NONE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SliderType.values().length];
            try {
                iArr2[SliderType.PERCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[SliderType.RELATIVE_PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[SliderType.KELVIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[SliderType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[SliderType.RELATIVE_FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[SliderType.ANGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[SliderType.ANGLE_RANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[SliderType.RPM.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[SliderType.f46339HZ.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[SliderType.INTEGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[SliderType.SECONDS.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[SliderType.FRAMES.ordinal()] = 12;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Pair<String, KeyableUserParameterValue> unserializeUserParameterValue(String str, XmlPullParser parser, boolean z2) {
        KeyableUserParameterValue keyableUserParameterValue;
        Quaternion identity;
        Vector2D Vector2D;
        Vector3D Vector3D;
        Vector4D Vector4D;
        SolidColor SolidColor;
        Float fValueOf;
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, str, "property");
        String attributeValue = parser.getAttributeValue(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (attributeValue == null) {
            throw new XmlPullParserException("id name: " + parser.getPositionDescription());
        }
        String attributeValue2 = parser.getAttributeValue(str, "type");
        if (attributeValue2 == null) {
            throw new XmlPullParserException("id name: " + parser.getPositionDescription());
        }
        int iHashCode = attributeValue2.hashCode();
        Class cls = Double.TYPE;
        Class cls2 = Float.TYPE;
        switch (iHashCode) {
            case -891985903:
                if (attributeValue2.equals("string")) {
                    keyableUserParameterValue = new KeyableUserParameterValue(YzO.O(parser));
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            case 104431:
                if (attributeValue2.equals(l.f62668w)) {
                    String attributeValue3 = parser.getAttributeValue(str, "value");
                    Intrinsics.checkNotNullExpressionValue(attributeValue3, "getAttributeValue(...)");
                    keyableUserParameterValue = new KeyableUserParameterValue(Integer.parseInt(attributeValue3));
                    YzO.J2(parser);
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            case 116076:
                if (attributeValue2.equals("uri")) {
                    Uri uri = Uri.parse(parser.getAttributeValue(str, "value"));
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                    keyableUserParameterValue = new KeyableUserParameterValue(uri);
                    YzO.J2(parser);
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            case 3029738:
                if (attributeValue2.equals("bool")) {
                    keyableUserParameterValue = new KeyableUserParameterValue(Intrinsics.areEqual(parser.getAttributeValue(str, "value"), "true"));
                    YzO.J2(parser);
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            case 3481943:
                if (attributeValue2.equals("quat")) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Quaternion.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls2))) {
                        identity = (Quaternion) Float.valueOf(0.0f);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls))) {
                        identity = (Quaternion) Double.valueOf(0.0d);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                        Object objVector2D = GeometryKt.Vector2D();
                        if (objVector2D == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Quaternion");
                        }
                        identity = (Quaternion) objVector2D;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                        Object objVector3D = GeometryKt.Vector3D();
                        if (objVector3D == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Quaternion");
                        }
                        identity = (Quaternion) objVector3D;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                        Object objVector4D = GeometryKt.Vector4D();
                        if (objVector4D == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Quaternion");
                        }
                        identity = (Quaternion) objVector4D;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                        identity = Quaternion.INSTANCE.getIDENTITY();
                        if (identity == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Quaternion");
                        }
                    } else {
                        if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                            throw new IllegalArgumentException();
                        }
                        Object objSolidColor = ColorKt.SolidColor();
                        if (objSolidColor == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Quaternion");
                        }
                        identity = (Quaternion) objSolidColor;
                    }
                    keyableUserParameterValue = new KeyableUserParameterValue((KeyableQuaternion) KeyableSerializerKt.unserializeKeyable(str, parser, "property", identity, z2));
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            case 3615518:
                if (attributeValue2.equals("vec2")) {
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Vector2D.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls2))) {
                        Vector2D = (Vector2D) Float.valueOf(0.0f);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls))) {
                        Vector2D = (Vector2D) Double.valueOf(0.0d);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                        Vector2D = GeometryKt.Vector2D();
                        if (Vector2D == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                        Parcelable parcelableVector3D = GeometryKt.Vector3D();
                        if (parcelableVector3D == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        Vector2D = (Vector2D) parcelableVector3D;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                        Parcelable parcelableVector4D = GeometryKt.Vector4D();
                        if (parcelableVector4D == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        Vector2D = (Vector2D) parcelableVector4D;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                        Object identity2 = Quaternion.INSTANCE.getIDENTITY();
                        if (identity2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        Vector2D = (Vector2D) identity2;
                    } else {
                        if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                            throw new IllegalArgumentException();
                        }
                        Object objSolidColor2 = ColorKt.SolidColor();
                        if (objSolidColor2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        Vector2D = (Vector2D) objSolidColor2;
                    }
                    keyableUserParameterValue = new KeyableUserParameterValue((KeyableVector2D) KeyableSerializerKt.unserializeKeyable(str, parser, "property", Vector2D, z2));
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            case 3615519:
                if (attributeValue2.equals("vec3")) {
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Vector3D.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls2))) {
                        Vector3D = (Vector3D) Float.valueOf(0.0f);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls))) {
                        Vector3D = (Vector3D) Double.valueOf(0.0d);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                        Parcelable parcelableVector2D = GeometryKt.Vector2D();
                        if (parcelableVector2D == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                        }
                        Vector3D = (Vector3D) parcelableVector2D;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                        Vector3D = GeometryKt.Vector3D();
                        if (Vector3D == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                        Parcelable parcelableVector4D2 = GeometryKt.Vector4D();
                        if (parcelableVector4D2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                        }
                        Vector3D = (Vector3D) parcelableVector4D2;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                        Object identity3 = Quaternion.INSTANCE.getIDENTITY();
                        if (identity3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                        }
                        Vector3D = (Vector3D) identity3;
                    } else {
                        if (!Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                            throw new IllegalArgumentException();
                        }
                        Object objSolidColor3 = ColorKt.SolidColor();
                        if (objSolidColor3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                        }
                        Vector3D = (Vector3D) objSolidColor3;
                    }
                    keyableUserParameterValue = new KeyableUserParameterValue((KeyableVector3D) KeyableSerializerKt.unserializeKeyable(str, parser, "property", Vector3D, z2));
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            case 3615520:
                if (attributeValue2.equals("vec4")) {
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Vector4D.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls2))) {
                        Vector4D = (Vector4D) Float.valueOf(0.0f);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls))) {
                        Vector4D = (Vector4D) Double.valueOf(0.0d);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                        Parcelable parcelableVector2D2 = GeometryKt.Vector2D();
                        if (parcelableVector2D2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector4D");
                        }
                        Vector4D = (Vector4D) parcelableVector2D2;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                        Parcelable parcelableVector3D2 = GeometryKt.Vector3D();
                        if (parcelableVector3D2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector4D");
                        }
                        Vector4D = (Vector4D) parcelableVector3D2;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                        Vector4D = GeometryKt.Vector4D();
                        if (Vector4D == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector4D");
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                        Object identity4 = Quaternion.INSTANCE.getIDENTITY();
                        if (identity4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector4D");
                        }
                        Vector4D = (Vector4D) identity4;
                    } else {
                        if (!Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                            throw new IllegalArgumentException();
                        }
                        Object objSolidColor4 = ColorKt.SolidColor();
                        if (objSolidColor4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector4D");
                        }
                        Vector4D = (Vector4D) objSolidColor4;
                    }
                    keyableUserParameterValue = new KeyableUserParameterValue((KeyableVector4D) KeyableSerializerKt.unserializeKeyable(str, parser, "property", Vector4D, z2));
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            case 94842723:
                if (attributeValue2.equals(TtmlNode.ATTR_TTS_COLOR)) {
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(SolidColor.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls2))) {
                        SolidColor = (SolidColor) Float.valueOf(0.0f);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls))) {
                        SolidColor = (SolidColor) Double.valueOf(0.0d);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                        Object objVector2D2 = GeometryKt.Vector2D();
                        if (objVector2D2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.SolidColor");
                        }
                        SolidColor = (SolidColor) objVector2D2;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                        Object objVector3D2 = GeometryKt.Vector3D();
                        if (objVector3D2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.SolidColor");
                        }
                        SolidColor = (SolidColor) objVector3D2;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                        Object objVector4D2 = GeometryKt.Vector4D();
                        if (objVector4D2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.SolidColor");
                        }
                        SolidColor = (SolidColor) objVector4D2;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                        Object identity5 = Quaternion.INSTANCE.getIDENTITY();
                        if (identity5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.SolidColor");
                        }
                        SolidColor = (SolidColor) identity5;
                    } else {
                        if (!Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                            throw new IllegalArgumentException();
                        }
                        SolidColor = ColorKt.SolidColor();
                        if (SolidColor == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.SolidColor");
                        }
                    }
                    keyableUserParameterValue = new KeyableUserParameterValue((KeyableSolidColor) KeyableSerializerKt.unserializeKeyable(str, parser, "property", SolidColor, z2));
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            case 97526364:
                if (attributeValue2.equals("float")) {
                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Float.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(cls2))) {
                        fValueOf = Float.valueOf(0.0f);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(cls))) {
                        fValueOf = (Float) Double.valueOf(0.0d);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                        Object objVector2D3 = GeometryKt.Vector2D();
                        if (objVector2D3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) objVector2D3;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                        Object objVector3D3 = GeometryKt.Vector3D();
                        if (objVector3D3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) objVector3D3;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                        Object objVector4D3 = GeometryKt.Vector4D();
                        if (objVector4D3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) objVector4D3;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                        Object identity6 = Quaternion.INSTANCE.getIDENTITY();
                        if (identity6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) identity6;
                    } else {
                        if (!Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                            throw new IllegalArgumentException();
                        }
                        Object objSolidColor5 = ColorKt.SolidColor();
                        if (objSolidColor5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) objSolidColor5;
                    }
                    keyableUserParameterValue = new KeyableUserParameterValue((KeyableFloat) KeyableSerializerKt.unserializeKeyable(str, parser, "property", fValueOf, z2));
                    return new Pair<>(attributeValue, keyableUserParameterValue);
                }
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
            default:
                throw new XmlPullParserException("invalid type '" + attributeValue2 + "': " + parser.getPositionDescription());
        }
    }

    public static final Map<String, UserParameterValue> atTime(Map<String, KeyableUserParameterValue> map, float f3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), valueAtTime((KeyableUserParameterValue) entry.getValue(), f3));
        }
        return linkedHashMap;
    }

    public static final Map<String, UserParameterValue> atTimeAccum(Map<String, KeyableUserParameterValue> map, float f3, float f4, Map<String, ? extends UserParameter> defs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defs, "defs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), valueAtTimeAccum((KeyableUserParameterValue) entry.getValue(), f3, f4, defs.get((String) entry.getKey())));
        }
        return linkedHashMap;
    }

    public static final float calcSliderTypeValueForSaving(SliderType sliderType, float f3) {
        float f4;
        Intrinsics.checkNotNullParameter(sliderType, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$1[sliderType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            f4 = 100.0f;
        } else {
            if (i2 != 3) {
                return f3;
            }
            f4 = 1000.0f;
        }
        return f3 / f4;
    }

    public static final float calcSliderTypeValueForViewing(SliderType sliderType, float f3) {
        float f4;
        Intrinsics.checkNotNullParameter(sliderType, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$1[sliderType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            f4 = 100.0f;
        } else {
            if (i2 != 3) {
                return f3;
            }
            f4 = 1000.0f;
        }
        return f3 * f4;
    }

    public static final Keyable<Float> copyAdjustingFloatValue(Keyable<Float> keyable, Function1<? super Float, Float> mapper) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        List<Keyframe<Float>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, Float.valueOf(((Number) keyframe.getValue()).floatValue() * mapper.invoke(Float.valueOf(keyframe.getTime())).floatValue()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final KeyableUserParameterValue copyAdjustingTime(KeyableUserParameterValue keyableUserParameterValue, Function1<? super Float, Float> mapper) {
        Intrinsics.checkNotNullParameter(keyableUserParameterValue, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        switch (WhenMappings.$EnumSwitchMapping$0[keyableUserParameterValue.getDataType().ordinal()]) {
            case 1:
                return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, KeyableKt.copyAdjustingTime(keyableUserParameterValue.getFloatValue(), mapper), 0, null, null, null, null, null, false, null, null, 2045, null);
            case 2:
            case 7:
            case 8:
            case 9:
            case 11:
                return keyableUserParameterValue;
            case 3:
                return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, KeyableKt.copyAdjustingTime(keyableUserParameterValue.getColorValue(), mapper), null, null, null, null, false, null, null, 2039, null);
            case 4:
                return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, null, KeyableKt.copyAdjustingTime(keyableUserParameterValue.getVec2DValue(), mapper), null, null, null, false, null, null, 2031, null);
            case 5:
                return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, null, null, KeyableKt.copyAdjustingTime(keyableUserParameterValue.getVec3DValue(), mapper), null, null, false, null, null, 2015, null);
            case 6:
                return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, null, null, null, KeyableKt.copyAdjustingTime(keyableUserParameterValue.getVec4DValue(), mapper), null, false, null, null, 1983, null);
            case 10:
                return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, null, null, null, null, KeyableKt.copyAdjustingTime(keyableUserParameterValue.getQuatValue(), mapper), false, null, null, 1919, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final KeyableUserParameterValue copyAdjustingValue(KeyableUserParameterValue keyableUserParameterValue, Function1<? super Float, Float> mapper) {
        Intrinsics.checkNotNullParameter(keyableUserParameterValue, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        switch (WhenMappings.$EnumSwitchMapping$0[keyableUserParameterValue.getDataType().ordinal()]) {
            case 1:
                if (keyableUserParameterValue.getFloatValue().getKeyed()) {
                    return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, copyAdjustingFloatValue(keyableUserParameterValue.getFloatValue(), mapper), 0, null, null, null, null, null, false, null, null, 2045, null);
                }
                return keyableUserParameterValue;
            case 2:
            case 7:
            case 8:
            case 9:
            case 11:
                return keyableUserParameterValue;
            case 3:
                if (keyableUserParameterValue.getColorValue().getKeyed()) {
                    return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, copyAdjustingVectorColorValue(keyableUserParameterValue.getColorValue(), mapper), null, null, null, null, false, null, null, 2039, null);
                }
                return keyableUserParameterValue;
            case 4:
                if (keyableUserParameterValue.getVec2DValue().getKeyed()) {
                    return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, null, copyAdjustingVector2DValue(keyableUserParameterValue.getVec2DValue(), mapper), null, null, null, false, null, null, 2031, null);
                }
                return keyableUserParameterValue;
            case 5:
                if (keyableUserParameterValue.getVec3DValue().getKeyed()) {
                    return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, null, null, copyAdjustingVector3DValue(keyableUserParameterValue.getVec3DValue(), mapper), null, null, false, null, null, 2015, null);
                }
                return keyableUserParameterValue;
            case 6:
                if (keyableUserParameterValue.getVec4DValue().getKeyed()) {
                    return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, null, null, null, copyAdjustingVector4DValue(keyableUserParameterValue.getVec4DValue(), mapper), null, false, null, null, 1983, null);
                }
                return keyableUserParameterValue;
            case 10:
                if (keyableUserParameterValue.getQuatValue().getKeyed()) {
                    return KeyableUserParameterValue.copy$default(keyableUserParameterValue, null, null, 0, null, null, null, null, copyAdjustingVectorQuatValue(keyableUserParameterValue.getQuatValue(), mapper), false, null, null, 1919, null);
                }
                return keyableUserParameterValue;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Keyable<Vector2D> copyAdjustingVector2DValue(Keyable<Vector2D> keyable, Function1<? super Float, Float> mapper) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        List<Keyframe<Vector2D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, GeometryKt.times((Vector2D) keyframe.getValue(), mapper.invoke(Float.valueOf(keyframe.getTime())).floatValue()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final Keyable<Vector3D> copyAdjustingVector3DValue(Keyable<Vector3D> keyable, Function1<? super Float, Float> mapper) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        List<Keyframe<Vector3D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, GeometryKt.times((Vector3D) keyframe.getValue(), mapper.invoke(Float.valueOf(keyframe.getTime())).floatValue()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final Keyable<Vector4D> copyAdjustingVector4DValue(Keyable<Vector4D> keyable, Function1<? super Float, Float> mapper) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        List<Keyframe<Vector4D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, GeometryKt.times((Vector4D) keyframe.getValue(), mapper.invoke(Float.valueOf(keyframe.getTime())).floatValue()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final Keyable<SolidColor> copyAdjustingVectorColorValue(Keyable<SolidColor> keyable, Function1<? super Float, Float> mapper) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        List<Keyframe<SolidColor>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, ColorKt.times((SolidColor) keyframe.getValue(), mapper.invoke(Float.valueOf(keyframe.getTime())).floatValue()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final Keyable<Quaternion> copyAdjustingVectorQuatValue(Keyable<Quaternion> keyable, Function1<? super Float, Float> mapper) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        List<Keyframe<Quaternion>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, ((Quaternion) keyframe.getValue()).times(mapper.invoke(Float.valueOf(keyframe.getTime())).floatValue()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final String format(SliderType sliderType, float f3) {
        Intrinsics.checkNotNullParameter(sliderType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[sliderType.ordinal()]) {
            case 1:
                return MathKt.roundToInt(f3 * 100.0f) + "%";
            case 2:
                return (f3 >= 0.0f ? "+" : "") + MathKt.roundToInt(f3 * 100.0f) + "%";
            case 3:
                return MathKt.roundToInt(f3 * 1000.0f) + "K";
            case 4:
                String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            case 5:
                String str2 = String.format((f3 >= 0.0f ? "+" : "") + "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return str2;
            case 6:
                String str3 = String.format("%.2fº", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                return str3;
            case 7:
                String str4 = String.format("±%.2fº", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                return str4;
            case 8:
                return String.valueOf(MathKt.roundToInt(f3));
            case 9:
                String str5 = String.format("%.2fHz", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                return str5;
            case 10:
                return String.valueOf(MathKt.roundToInt(f3));
            case 11:
                String str6 = String.format("%.2fs", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                return str6;
            case 12:
                throw new NotImplementedError(null, 1, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final KeyableUserParameterValue getDefaultKeyableUserParameterValue(UserParameter userParameter) {
        Intrinsics.checkNotNullParameter(userParameter, "<this>");
        if (userParameter instanceof UserParameter.Slider) {
            return new KeyableUserParameterValue(((UserParameter.Slider) userParameter).getDefaultValue());
        }
        if (userParameter instanceof UserParameter.Spinner) {
            return new KeyableUserParameterValue(((UserParameter.Spinner) userParameter).getDefaultValue());
        }
        if (userParameter instanceof UserParameter.Angle) {
            return new KeyableUserParameterValue(((UserParameter.Angle) userParameter).getDefaultValue());
        }
        if (userParameter instanceof UserParameter.HueRing) {
            return new KeyableUserParameterValue(((UserParameter.HueRing) userParameter).getDefaultValue());
        }
        if (userParameter instanceof UserParameter.HueDisc) {
            return new KeyableUserParameterValue(((UserParameter.HueDisc) userParameter).getDefaultValue());
        }
        if (userParameter instanceof UserParameter.Color) {
            return new KeyableUserParameterValue(((UserParameter.Color) userParameter).getDefaultValue());
        }
        if (userParameter instanceof UserParameter.XYZ) {
            return new KeyableUserParameterValue(((UserParameter.XYZ) userParameter).getDefaultValue());
        }
        if (userParameter instanceof UserParameter.Orientation) {
            return new KeyableUserParameterValue(((UserParameter.Orientation) userParameter).getDefaultValue());
        }
        if ((userParameter instanceof UserParameter.Texture) || (userParameter instanceof UserParameter.StaticText)) {
            return null;
        }
        if (userParameter instanceof UserParameter.Switch) {
            return new KeyableUserParameterValue(((UserParameter.Switch) userParameter).getDefaultValue());
        }
        if (userParameter instanceof UserParameter.Point) {
            return new KeyableUserParameterValue(((UserParameter.Point) userParameter).getDefaultValue());
        }
        if (userParameter instanceof UserParameter.Selector) {
            return new KeyableUserParameterValue(((UserParameter.Selector) userParameter).getDefaultChoice());
        }
        if (userParameter instanceof UserParameter.FloatValue) {
            return new KeyableUserParameterValue(((UserParameter.FloatValue) userParameter).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getGlslType(UserParameter userParameter) {
        Intrinsics.checkNotNullParameter(userParameter, "<this>");
        return userParameter.getDataType().getGlslType();
    }

    public static final boolean getHasUI(UserParameter userParameter) {
        Intrinsics.checkNotNullParameter(userParameter, "<this>");
        return (!(userParameter instanceof UserParameter.Texture) || ((UserParameter.Texture) userParameter).getSrcType() == TextureSrcType.USER) && !(userParameter instanceof UserParameter.FloatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> ArrayList<C2348n> getInputFieldInfoList(UserParameter userParameter, T t3, List<String> labelList, int i2) {
        Intrinsics.checkNotNullParameter(userParameter, "<this>");
        Intrinsics.checkNotNullParameter(labelList, "labelList");
        ArrayList<C2348n> arrayList = new ArrayList<>();
        if (userParameter instanceof UserParameter.FloatValue) {
            Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type kotlin.Float");
            arrayList.add(new C2348n(((Float) t3).floatValue(), ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, labelList.isEmpty() ? "" : labelList.get(0), i2 == 1));
            return arrayList;
        }
        if (userParameter instanceof UserParameter.Angle) {
            Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type kotlin.Float");
            UserParameter.Angle angle = (UserParameter.Angle) userParameter;
            arrayList.add(new C2348n(((Float) t3).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), labelList.isEmpty() ? "" : labelList.get(0), i2 == 1));
            return arrayList;
        }
        if (userParameter instanceof UserParameter.Point) {
            if (t3 instanceof Vector2D) {
                Vector2D vector2D = (Vector2D) t3;
                UserParameter.Point point = (UserParameter.Point) userParameter;
                arrayList.add(new C2348n(vector2D.getX(), point.getDefaultValue().getX(), point.getMinOffset().getX(), point.getMaxOffset().getX(), labelList.isEmpty() ? "X" : labelList.get(0), i2 == 1));
                arrayList.add(new C2348n(vector2D.getY(), point.getDefaultValue().getY(), point.getMinOffset().getY(), point.getMaxOffset().getY(), labelList.size() >= 2 ? labelList.get(1) : "Y", i2 == 2));
                return arrayList;
            }
        } else if (userParameter instanceof UserParameter.Orientation) {
            if (t3 instanceof Quaternion) {
                Quaternion quaternion = (Quaternion) t3;
                UserParameter.Orientation orientation = (UserParameter.Orientation) userParameter;
                arrayList.add(new C2348n((float) quaternion.getPitch(), (float) orientation.getDefaultValue().getPitch(), -1.0f, -1.0f, labelList.isEmpty() ? "" : labelList.get(0), i2 == 1));
                arrayList.add(new C2348n((float) quaternion.getYaw(), (float) orientation.getDefaultValue().getYaw(), -1.0f, -1.0f, labelList.size() < 2 ? "" : labelList.get(1), i2 == 2));
                arrayList.add(new C2348n((float) quaternion.getRoll(), (float) orientation.getDefaultValue().getRoll(), -1.0f, -1.0f, labelList.size() >= 3 ? labelList.get(2) : "", i2 == 3));
                return arrayList;
            }
        } else if (userParameter instanceof UserParameter.XYZ) {
            if (t3 instanceof Vector3D) {
                Vector3D vector3D = (Vector3D) t3;
                UserParameter.XYZ xyz = (UserParameter.XYZ) userParameter;
                arrayList.add(new C2348n(vector3D.getX(), xyz.getDefaultValue().getX(), xyz.getMinOffset().getX(), xyz.getMaxOffset().getX(), labelList.isEmpty() ? "X" : labelList.get(0), i2 == 1));
                arrayList.add(new C2348n(vector3D.getY(), xyz.getDefaultValue().getY(), xyz.getMinOffset().getY(), xyz.getMaxOffset().getY(), labelList.size() >= 2 ? labelList.get(1) : "Y", i2 == 2));
                arrayList.add(new C2348n(vector3D.getZ(), xyz.getDefaultValue().getZ(), xyz.getMinOffset().getZ(), xyz.getMaxOffset().getZ(), labelList.size() < 3 ? "Z" : labelList.get(2), i2 == 3));
                return arrayList;
            }
        } else if (userParameter instanceof UserParameter.Spinner) {
            if (t3 instanceof Float) {
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                float fFloatValue = ((Number) t3).floatValue() * spinner.getMultiplier();
                SliderType sliderType = spinner.getSliderType();
                arrayList.add(new C2348n(calcSliderTypeValueForViewing(sliderType, fFloatValue), calcSliderTypeValueForViewing(sliderType, spinner.getDefaultValue() * spinner.getMultiplier()), calcSliderTypeValueForViewing(sliderType, spinner.getMinValue() * spinner.getMultiplier()), calcSliderTypeValueForViewing(sliderType, spinner.getMaxValue() * spinner.getMultiplier()), labelList.isEmpty() ? spinner.getLabel() : labelList.get(0), i2 == 1));
                return arrayList;
            }
        } else if ((userParameter instanceof UserParameter.Slider) && (t3 instanceof Float)) {
            UserParameter.Slider slider = (UserParameter.Slider) userParameter;
            arrayList.add(new C2348n(calcSliderTypeValueForViewing(slider.getSliderType(), ((Number) t3).floatValue()), calcSliderTypeValueForViewing(slider.getSliderType(), slider.getDefaultValue()), calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMinValue()), calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMaxValue()), labelList.isEmpty() ? slider.getLabel() : labelList.get(0), i2 == 1));
        }
        return arrayList;
    }

    public static /* synthetic */ ArrayList getInputFieldInfoList$default(UserParameter userParameter, Object obj, List labelList, int i2, int i3, Object obj2) {
        int i5 = (i3 & 4) != 0 ? 1 : i2;
        Intrinsics.checkNotNullParameter(userParameter, "<this>");
        Intrinsics.checkNotNullParameter(labelList, "labelList");
        ArrayList arrayList = new ArrayList();
        if (userParameter instanceof UserParameter.FloatValue) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            arrayList.add(new C2348n(((Float) obj).floatValue(), ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, labelList.isEmpty() ? "" : (String) labelList.get(0), i5 == 1));
            return arrayList;
        }
        if (userParameter instanceof UserParameter.Angle) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            UserParameter.Angle angle = (UserParameter.Angle) userParameter;
            arrayList.add(new C2348n(((Float) obj).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), labelList.isEmpty() ? "" : (String) labelList.get(0), i5 == 1));
            return arrayList;
        }
        if (userParameter instanceof UserParameter.Point) {
            if (obj instanceof Vector2D) {
                Vector2D vector2D = (Vector2D) obj;
                UserParameter.Point point = (UserParameter.Point) userParameter;
                arrayList.add(new C2348n(vector2D.getX(), point.getDefaultValue().getX(), point.getMinOffset().getX(), point.getMaxOffset().getX(), labelList.isEmpty() ? "X" : (String) labelList.get(0), i5 == 1));
                arrayList.add(new C2348n(vector2D.getY(), point.getDefaultValue().getY(), point.getMinOffset().getY(), point.getMaxOffset().getY(), labelList.size() >= 2 ? (String) labelList.get(1) : "Y", i5 == 2));
                return arrayList;
            }
        } else if (userParameter instanceof UserParameter.Orientation) {
            if (obj instanceof Quaternion) {
                Quaternion quaternion = (Quaternion) obj;
                UserParameter.Orientation orientation = (UserParameter.Orientation) userParameter;
                arrayList.add(new C2348n((float) quaternion.getPitch(), (float) orientation.getDefaultValue().getPitch(), -1.0f, -1.0f, labelList.isEmpty() ? "" : (String) labelList.get(0), i5 == 1));
                arrayList.add(new C2348n((float) quaternion.getYaw(), (float) orientation.getDefaultValue().getYaw(), -1.0f, -1.0f, labelList.size() < 2 ? "" : (String) labelList.get(1), i5 == 2));
                arrayList.add(new C2348n((float) quaternion.getRoll(), (float) orientation.getDefaultValue().getRoll(), -1.0f, -1.0f, labelList.size() >= 3 ? (String) labelList.get(2) : "", i5 == 3));
                return arrayList;
            }
        } else if (userParameter instanceof UserParameter.XYZ) {
            if (obj instanceof Vector3D) {
                Vector3D vector3D = (Vector3D) obj;
                UserParameter.XYZ xyz = (UserParameter.XYZ) userParameter;
                arrayList.add(new C2348n(vector3D.getX(), xyz.getDefaultValue().getX(), xyz.getMinOffset().getX(), xyz.getMaxOffset().getX(), labelList.isEmpty() ? "X" : (String) labelList.get(0), i5 == 1));
                arrayList.add(new C2348n(vector3D.getY(), xyz.getDefaultValue().getY(), xyz.getMinOffset().getY(), xyz.getMaxOffset().getY(), labelList.size() >= 2 ? (String) labelList.get(1) : "Y", i5 == 2));
                arrayList.add(new C2348n(vector3D.getZ(), xyz.getDefaultValue().getZ(), xyz.getMinOffset().getZ(), xyz.getMaxOffset().getZ(), labelList.size() < 3 ? "Z" : (String) labelList.get(2), i5 == 3));
                return arrayList;
            }
        } else if (userParameter instanceof UserParameter.Spinner) {
            if (obj instanceof Float) {
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                float fFloatValue = ((Number) obj).floatValue() * spinner.getMultiplier();
                SliderType sliderType = spinner.getSliderType();
                arrayList.add(new C2348n(calcSliderTypeValueForViewing(sliderType, fFloatValue), calcSliderTypeValueForViewing(sliderType, spinner.getDefaultValue() * spinner.getMultiplier()), calcSliderTypeValueForViewing(sliderType, spinner.getMinValue() * spinner.getMultiplier()), calcSliderTypeValueForViewing(sliderType, spinner.getMaxValue() * spinner.getMultiplier()), labelList.isEmpty() ? spinner.getLabel() : (String) labelList.get(0), i5 == 1));
                return arrayList;
            }
        } else if ((userParameter instanceof UserParameter.Slider) && (obj instanceof Float)) {
            UserParameter.Slider slider = (UserParameter.Slider) userParameter;
            arrayList.add(new C2348n(calcSliderTypeValueForViewing(slider.getSliderType(), ((Number) obj).floatValue()), calcSliderTypeValueForViewing(slider.getSliderType(), slider.getDefaultValue()), calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMinValue()), calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMaxValue()), labelList.isEmpty() ? slider.getLabel() : (String) labelList.get(0), i5 == 1));
        }
        return arrayList;
    }

    public static final Keyable<? extends Object> getKeyable(KeyableUserParameterValue keyableUserParameterValue) {
        Intrinsics.checkNotNullParameter(keyableUserParameterValue, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[keyableUserParameterValue.getDataType().ordinal()]) {
            case 1:
                return keyableUserParameterValue.getFloatValue();
            case 2:
                return null;
            case 3:
                return keyableUserParameterValue.getColorValue();
            case 4:
                return keyableUserParameterValue.getVec2DValue();
            case 5:
                return keyableUserParameterValue.getVec3DValue();
            case 6:
                return keyableUserParameterValue.getVec4DValue();
            case 7:
            case 8:
            case 9:
                return null;
            case 10:
                return keyableUserParameterValue.getQuatValue();
            case 11:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean isDraggable(UserParameter userParameter) {
        Intrinsics.checkNotNullParameter(userParameter, "<this>");
        return (userParameter instanceof UserParameter.Point) || (userParameter instanceof UserParameter.Orientation);
    }

    public static final boolean isEditFirstHintedSection(UserParameter userParameter) {
        Intrinsics.checkNotNullParameter(userParameter, "<this>");
        UserParameter.StaticText staticText = userParameter instanceof UserParameter.StaticText ? (UserParameter.StaticText) userParameter : null;
        return staticText != null && isSection(staticText) && staticText.getHintType() == HintType.EDITFIRST;
    }

    public static final boolean isEnabledByEffectSetting(UserParameter userParameter, KeyableVisualEffectRef effectRef) {
        Intrinsics.checkNotNullParameter(userParameter, "<this>");
        Intrinsics.checkNotNullParameter(effectRef, "effectRef");
        VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(effectRef.getId());
        if (visualEffectVisualEffectById == null) {
            return false;
        }
        return isEnabledByEffectSetting$calculateIsEnabledByEffectSetting(userParameter, new LinkedHashMap(), visualEffectVisualEffectById, effectRef);
    }

    private static final boolean isEnabledByEffectSetting$calculateIsEnabledByEffectSetting$isImplicitlyEnabled(UserParameter userParameter, KeyableVisualEffectRef keyableVisualEffectRef, String str) {
        if (userParameter instanceof UserParameter.Switch) {
            UserParameter.Switch r42 = (UserParameter.Switch) userParameter;
            if (r42.getEnableTargets().contains(str)) {
                KeyableUserParameterValue keyableUserParameterValue = keyableVisualEffectRef.getParameters().get(r42.getName());
                if (keyableUserParameterValue != null ? keyableUserParameterValue.getBooleanValue() : r42.getDefaultValue()) {
                    return true;
                }
            }
            return false;
        }
        if (!(userParameter instanceof UserParameter.Selector)) {
            return false;
        }
        UserParameter.Selector selector = (UserParameter.Selector) userParameter;
        KeyableUserParameterValue keyableUserParameterValue2 = keyableVisualEffectRef.getParameters().get(selector.getName());
        int intValue = keyableUserParameterValue2 != null ? keyableUserParameterValue2.getIntValue() : selector.getDefaultChoice();
        for (ChoiceInfo choiceInfo : selector.getChoices()) {
            if (choiceInfo.getValue() == intValue) {
                return choiceInfo.getEnableTargets().contains(str);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean isSection(UserParameter userParameter) {
        Intrinsics.checkNotNullParameter(userParameter, "<this>");
        return (userParameter instanceof UserParameter.StaticText) && ((UserParameter.StaticText) userParameter).getStyle() == StaticTextStyle.SECTION;
    }

    public static final void serialize(KeyableUserParameterValue keyableUserParameterValue, String str, XmlSerializer serializer, String key) {
        Intrinsics.checkNotNullParameter(keyableUserParameterValue, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(key, "key");
        switch (WhenMappings.$EnumSwitchMapping$0[keyableUserParameterValue.getDataType().ordinal()]) {
            case 1:
                KeyableSerializerKt.serialize(keyableUserParameterValue.getFloatValue(), null, str, serializer, "property", MapsKt.mapOf(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, key), TuplesKt.to("type", "float")));
                break;
            case 2:
                serializer.startTag(str, "property");
                serializer.attribute(str, AppMeasurementSdk.ConditionalUserProperty.NAME, key);
                serializer.attribute(str, "type", l.f62668w);
                YzO.rl(serializer, str, "value", keyableUserParameterValue.getIntValue());
                serializer.endTag(str, "property");
                break;
            case 3:
                KeyableSerializerKt.serialize(keyableUserParameterValue.getColorValue(), null, str, serializer, "property", MapsKt.mapOf(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, key), TuplesKt.to("type", TtmlNode.ATTR_TTS_COLOR)));
                break;
            case 4:
                KeyableSerializerKt.serialize(keyableUserParameterValue.getVec2DValue(), GeometryKt.Vector2D(), str, serializer, "property", MapsKt.mapOf(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, key), TuplesKt.to("type", "vec2")));
                break;
            case 5:
                KeyableSerializerKt.serialize(keyableUserParameterValue.getVec3DValue(), GeometryKt.Vector3D(), str, serializer, "property", MapsKt.mapOf(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, key), TuplesKt.to("type", "vec3")));
                break;
            case 6:
                KeyableSerializerKt.serialize(keyableUserParameterValue.getVec4DValue(), GeometryKt.Vector4D(), str, serializer, "property", MapsKt.mapOf(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, key), TuplesKt.to("type", "vec4")));
                break;
            case 7:
                serializer.startTag(str, "property");
                serializer.attribute(str, AppMeasurementSdk.ConditionalUserProperty.NAME, key);
                serializer.attribute(str, "type", "bool");
                YzO.nr(serializer, str, "value", keyableUserParameterValue.getBooleanValue());
                serializer.endTag(str, "property");
                break;
            case 8:
                serializer.startTag(str, "property");
                serializer.attribute(str, AppMeasurementSdk.ConditionalUserProperty.NAME, key);
                serializer.attribute(str, "type", "uri");
                serializer.attribute(str, "value", keyableUserParameterValue.getTextureValue().toString());
                serializer.endTag(str, "property");
                break;
            case 9:
                serializer.startTag(str, "property");
                serializer.attribute(str, AppMeasurementSdk.ConditionalUserProperty.NAME, key);
                serializer.attribute(str, "type", "string");
                serializer.text(keyableUserParameterValue.getStringValue());
                serializer.endTag(str, "property");
                break;
            case 10:
                KeyableSerializerKt.serialize(keyableUserParameterValue.getQuatValue(), Quaternion.INSTANCE.getIDENTITY(), str, serializer, "property", MapsKt.mapOf(TuplesKt.to(AppMeasurementSdk.ConditionalUserProperty.NAME, key), TuplesKt.to("type", "quat")));
                break;
        }
    }

    public static final UserParameterValue valueAtTime(KeyableUserParameterValue keyableUserParameterValue, float f3) {
        Intrinsics.checkNotNullParameter(keyableUserParameterValue, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[keyableUserParameterValue.getDataType().ordinal()]) {
            case 1:
                return new UserParameterValue(((Number) KeyableKt.valueAtTime(keyableUserParameterValue.getFloatValue(), f3)).floatValue());
            case 2:
                return new UserParameterValue(keyableUserParameterValue.getIntValue());
            case 3:
                return new UserParameterValue((SolidColor) KeyableKt.valueAtTime(keyableUserParameterValue.getColorValue(), f3));
            case 4:
                return new UserParameterValue((Vector2D) KeyableKt.valueAtTime(keyableUserParameterValue.getVec2DValue(), f3));
            case 5:
                return new UserParameterValue((Vector3D) KeyableKt.valueAtTime(keyableUserParameterValue.getVec3DValue(), f3));
            case 6:
                return new UserParameterValue((Vector4D) KeyableKt.valueAtTime(keyableUserParameterValue.getVec4DValue(), f3));
            case 7:
                return new UserParameterValue(keyableUserParameterValue.getBooleanValue());
            case 8:
                return new UserParameterValue(keyableUserParameterValue.getTextureValue());
            case 9:
                return new UserParameterValue(keyableUserParameterValue.getStringValue());
            case 10:
                return new UserParameterValue((Quaternion) KeyableKt.valueAtTime(keyableUserParameterValue.getQuatValue(), f3));
            case 11:
                return UserParameterValue.INSTANCE.getNONE();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final UserParameterValue valueAtTimeAccum(KeyableUserParameterValue keyableUserParameterValue, final float f3, final float f4, UserParameter userParameter) {
        Intrinsics.checkNotNullParameter(keyableUserParameterValue, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[keyableUserParameterValue.getDataType().ordinal()]) {
            case 1:
                boolean z2 = userParameter instanceof UserParameter.Spinner;
                UserParameter.Spinner spinner = z2 ? (UserParameter.Spinner) userParameter : null;
                int i2 = 0;
                if ((spinner != null ? spinner.getSliderType() : null) == SliderType.RPM) {
                    final float f5 = f4 * f3;
                    if (!keyableUserParameterValue.getFloatValue().getKeyed()) {
                        final float fFloatValue = ((Number) ((Keyframe) CollectionsKt.first((List) keyableUserParameterValue.getFloatValue().getKeyframes())).getValue()).floatValue() * f5 * 6.0f;
                        C.Uo(keyableUserParameterValue, new Function0() { // from class: UOb.w6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UserParameterKt.valueAtTimeAccum$lambda$10(fFloatValue, f4, f5, f3);
                            }
                        });
                        return new UserParameterValue(fFloatValue);
                    }
                    float f6 = b.f61769v;
                    final float fRoundToInt = MathKt.roundToInt(f4 * f6);
                    final int iRoundToInt = MathKt.roundToInt(f6 * f5);
                    final Ref.DoubleRef doubleRef = new Ref.DoubleRef();
                    if (iRoundToInt >= 0) {
                        while (true) {
                            doubleRef.element += ((double) ((Number) KeyableKt.valueAtTime(keyableUserParameterValue.getFloatValue(), i2 / fRoundToInt)).floatValue()) / 20.0d;
                            if (i2 != iRoundToInt) {
                                i2++;
                            }
                        }
                    }
                    C.Uo(keyableUserParameterValue, new Function0() { // from class: UOb.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserParameterKt.valueAtTimeAccum$lambda$9(doubleRef, f4, f5, f3, fRoundToInt, iRoundToInt);
                        }
                    });
                    return new UserParameterValue((float) doubleRef.element);
                }
                UserParameter.Spinner spinner2 = z2 ? (UserParameter.Spinner) userParameter : null;
                if ((spinner2 != null ? spinner2.getSliderType() : null) != SliderType.f46339HZ) {
                    return new UserParameterValue(((Number) KeyableKt.valueAtTime(keyableUserParameterValue.getFloatValue(), f3)).floatValue());
                }
                final float f7 = f4 * f3;
                if (!keyableUserParameterValue.getFloatValue().getKeyed()) {
                    final float fFloatValue2 = ((Number) ((Keyframe) CollectionsKt.first((List) keyableUserParameterValue.getFloatValue().getKeyframes())).getValue()).floatValue() * f7;
                    C.Uo(keyableUserParameterValue, new Function0() { // from class: UOb.I28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserParameterKt.valueAtTimeAccum$lambda$12(fFloatValue2, f4, f7, f3);
                        }
                    });
                    return new UserParameterValue(fFloatValue2);
                }
                float f8 = b.f61769v;
                final float fRoundToInt2 = MathKt.roundToInt(f4 * f8);
                final int iRoundToInt2 = MathKt.roundToInt(f8 * f7);
                final Ref.DoubleRef doubleRef2 = new Ref.DoubleRef();
                if (iRoundToInt2 >= 0) {
                    while (true) {
                        doubleRef2.element += ((double) ((Number) KeyableKt.valueAtTime(keyableUserParameterValue.getFloatValue(), i2 / fRoundToInt2)).floatValue()) / 120.0d;
                        if (i2 != iRoundToInt2) {
                            i2++;
                        }
                    }
                }
                C.Uo(keyableUserParameterValue, new Function0() { // from class: UOb.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserParameterKt.valueAtTimeAccum$lambda$11(doubleRef2, f4, f7, f3, fRoundToInt2, iRoundToInt2);
                    }
                });
                return new UserParameterValue((float) doubleRef2.element);
            case 2:
                return new UserParameterValue(keyableUserParameterValue.getIntValue());
            case 3:
                return new UserParameterValue((SolidColor) KeyableKt.valueAtTime(keyableUserParameterValue.getColorValue(), f3));
            case 4:
                return new UserParameterValue((Vector2D) KeyableKt.valueAtTime(keyableUserParameterValue.getVec2DValue(), f3));
            case 5:
                return new UserParameterValue((Vector3D) KeyableKt.valueAtTime(keyableUserParameterValue.getVec3DValue(), f3));
            case 6:
                return new UserParameterValue((Vector4D) KeyableKt.valueAtTime(keyableUserParameterValue.getVec4DValue(), f3));
            case 7:
                return new UserParameterValue(keyableUserParameterValue.getBooleanValue());
            case 8:
                return new UserParameterValue(keyableUserParameterValue.getTextureValue());
            case 9:
                return new UserParameterValue(keyableUserParameterValue.getStringValue());
            case 10:
                return new UserParameterValue((Quaternion) KeyableKt.valueAtTime(keyableUserParameterValue.getQuatValue(), f3));
            case 11:
                return UserParameterValue.INSTANCE.getNONE();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String valueAtTimeAccum$lambda$10(float f3, float f4, float f5, float f6) {
        return "RPM: a=" + f3 + " d=" + f4 + " e=" + f5 + " t=" + f6 + " (NON-KEYED)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String valueAtTimeAccum$lambda$11(Ref.DoubleRef doubleRef, float f3, float f4, float f5, float f6, int i2) {
        return "HZ: a=" + doubleRef.element + " d=" + f3 + " e=" + f4 + " t=" + f5 + " totalSteps=" + f6 + " curSteps=" + i2 + " (KEYED)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String valueAtTimeAccum$lambda$12(float f3, float f4, float f5, float f6) {
        return "HZ: a=" + f3 + " d=" + f4 + " e=" + f5 + " t=" + f6 + " (NON-KEYED)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String valueAtTimeAccum$lambda$9(Ref.DoubleRef doubleRef, float f3, float f4, float f5, float f6, int i2) {
        return "RPM: a=" + doubleRef.element + " d=" + f3 + " e=" + f4 + " t=" + f5 + " totalSteps=" + f6 + " curSteps=" + i2 + " (KEYED)";
    }

    private static final boolean isEnabledByEffectSetting$calculateIsEnabledByEffectSetting(UserParameter userParameter, Map<String, Boolean> map, VisualEffect visualEffect, KeyableVisualEffectRef keyableVisualEffectRef) {
        boolean z2;
        Boolean bool = map.get(userParameter.getName());
        if (bool != null) {
            return bool.booleanValue();
        }
        map.put(userParameter.getName(), Boolean.FALSE);
        if (!userParameter.getEnabledByDefault()) {
            List<UserParameter> parameters = visualEffect.getParameters();
            if (parameters == null || !parameters.isEmpty()) {
                for (UserParameter userParameter2 : parameters) {
                    if (isEnabledByEffectSetting$calculateIsEnabledByEffectSetting(userParameter2, map, visualEffect, keyableVisualEffectRef) && isEnabledByEffectSetting$calculateIsEnabledByEffectSetting$isImplicitlyEnabled(userParameter2, keyableVisualEffectRef, userParameter.getName())) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = true;
            break;
        }
        map.put(userParameter.getName(), Boolean.valueOf(z2));
        return z2;
    }
}
