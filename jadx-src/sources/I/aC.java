package I;

import Hr.CQ.USEaHtCMH;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.SolidColorHSV;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.Vector4D;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.caoccao.javet.values.primitive.V8ValueInteger;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicInteger f4005n = new AtomicInteger(0);

    public static final V8ValueObject J2(V8ValueObject v8ValueObject, Vector4D vec) throws JavetException {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        Intrinsics.checkNotNullParameter(vec, "vec");
        v8ValueObject.set("x", Double.valueOf(vec.getX()));
        v8ValueObject.set("y", Double.valueOf(vec.getY()));
        v8ValueObject.set("z", Double.valueOf(vec.getZ()));
        v8ValueObject.set("w", Double.valueOf(vec.getW()));
        return v8ValueObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean KN(V8ValueArray v8ValueArray, int i2) throws JavetException {
        boolean z2;
        Intrinsics.checkNotNullParameter(v8ValueArray, "<this>");
        V8Value v8Value = v8ValueArray.get(i2);
        try {
            if (!(v8Value instanceof V8ValueInteger)) {
                z2 = v8Value instanceof V8ValueDouble;
            }
            AutoCloseableKt.closeFinally(v8Value, null);
            return z2;
        } finally {
        }
    }

    public static final V8ValueObject O(V8ValueObject v8ValueObject, Vector3D vec) throws JavetException {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        Intrinsics.checkNotNullParameter(vec, "vec");
        v8ValueObject.set("x", Double.valueOf(vec.getX()));
        v8ValueObject.set("y", Double.valueOf(vec.getY()));
        v8ValueObject.set("z", Double.valueOf(vec.getZ()));
        return v8ValueObject;
    }

    public static final boolean Uo(V8ValueObject v8ValueObject, String key) throws JavetException {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        V8Value v8Value = v8ValueObject.get(key);
        try {
            boolean z2 = v8Value instanceof V8ValueArray;
            AutoCloseableKt.closeFinally(v8Value, null);
            return z2;
        } finally {
        }
    }

    public static final SolidColorHSV gh(V8ValueObject v8ValueObject) throws JavetException {
        Intrinsics.checkNotNullParameter(v8ValueObject, USEaHtCMH.STe);
        boolean zHas = v8ValueObject.has(CmcdData.STREAMING_FORMAT_HLS);
        Float fValueOf = Float.valueOf(0.0f);
        Float f3 = zHas ? v8ValueObject.getFloat(CmcdData.STREAMING_FORMAT_HLS) : fValueOf;
        Intrinsics.checkNotNull(f3);
        float fFloatValue = f3.floatValue();
        Float f4 = v8ValueObject.has(CmcdData.STREAMING_FORMAT_SS) ? v8ValueObject.getFloat(CmcdData.STREAMING_FORMAT_SS) : fValueOf;
        Intrinsics.checkNotNull(f4);
        float fFloatValue2 = f4.floatValue();
        if (v8ValueObject.has("v")) {
            fValueOf = v8ValueObject.getFloat("v");
        }
        Intrinsics.checkNotNull(fValueOf);
        float fFloatValue3 = fValueOf.floatValue();
        Float f5 = v8ValueObject.has(CmcdData.OBJECT_TYPE_AUDIO_ONLY) ? v8ValueObject.getFloat(CmcdData.OBJECT_TYPE_AUDIO_ONLY) : Float.valueOf(1.0f);
        Intrinsics.checkNotNull(f5);
        return new SolidColorHSV(fFloatValue, fFloatValue2, fFloatValue3, f5.floatValue());
    }

    public static final SolidColor mUb(V8ValueObject v8ValueObject) throws JavetException {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        boolean zHas = v8ValueObject.has("r");
        Float fValueOf = Float.valueOf(0.0f);
        Float f3 = zHas ? v8ValueObject.getFloat("r") : fValueOf;
        Intrinsics.checkNotNull(f3);
        float fFloatValue = f3.floatValue();
        Float f4 = v8ValueObject.has("g") ? v8ValueObject.getFloat("g") : fValueOf;
        Intrinsics.checkNotNull(f4);
        float fFloatValue2 = f4.floatValue();
        if (v8ValueObject.has("b")) {
            fValueOf = v8ValueObject.getFloat("b");
        }
        Intrinsics.checkNotNull(fValueOf);
        float fFloatValue3 = fValueOf.floatValue();
        Float f5 = v8ValueObject.has(CmcdData.OBJECT_TYPE_AUDIO_ONLY) ? v8ValueObject.getFloat(CmcdData.OBJECT_TYPE_AUDIO_ONLY) : Float.valueOf(1.0f);
        Intrinsics.checkNotNull(f5);
        return new SolidColor(fFloatValue, fFloatValue2, fFloatValue3, f5.floatValue());
    }

    public static final V8ValueObject nr(V8ValueObject v8ValueObject, Vector2D vec) throws JavetException {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        Intrinsics.checkNotNullParameter(vec, "vec");
        v8ValueObject.set("x", Double.valueOf(vec.getX()));
        v8ValueObject.set("y", Double.valueOf(vec.getY()));
        return v8ValueObject;
    }

    public static final Vector2D qie(V8ValueArray v8ValueArray) throws JavetException {
        Intrinsics.checkNotNullParameter(v8ValueArray, "<this>");
        Float f3 = v8ValueArray.getFloat(0);
        Intrinsics.checkNotNullExpressionValue(f3, "getFloat(...)");
        float fFloatValue = f3.floatValue();
        Float f4 = v8ValueArray.getFloat(1);
        Intrinsics.checkNotNullExpressionValue(f4, "getFloat(...)");
        return new Vector2D(fFloatValue, f4.floatValue());
    }

    public static final V8ValueObject rl(V8ValueObject v8ValueObject, SolidColor color) throws JavetException {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        v8ValueObject.set("r", Double.valueOf(color.getR()));
        v8ValueObject.set("g", Double.valueOf(color.getG()));
        v8ValueObject.set("b", Double.valueOf(color.getB()));
        v8ValueObject.set(CmcdData.OBJECT_TYPE_AUDIO_ONLY, Double.valueOf(color.getA()));
        return v8ValueObject;
    }

    public static final V8ValueObject t(V8ValueObject v8ValueObject, SolidColorHSV color) throws JavetException {
        Intrinsics.checkNotNullParameter(v8ValueObject, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        v8ValueObject.set(CmcdData.STREAMING_FORMAT_HLS, Double.valueOf(color.getH()));
        v8ValueObject.set(CmcdData.STREAMING_FORMAT_SS, Double.valueOf(color.getS()));
        v8ValueObject.set("v", Double.valueOf(color.getV()));
        v8ValueObject.set(CmcdData.OBJECT_TYPE_AUDIO_ONLY, Double.valueOf(color.getA()));
        return v8ValueObject;
    }

    public static final boolean xMQ(V8ValueArray v8ValueArray) {
        Intrinsics.checkNotNullParameter(v8ValueArray, "<this>");
        return v8ValueArray.getLength() == 2 && KN(v8ValueArray, 0) && KN(v8ValueArray, 1);
    }
}
