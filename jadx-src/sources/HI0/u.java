package HI0;

import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.QuaternionKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.Vector4D;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueNull;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class u {
    public static final String n(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final String rl(Object obj) {
        if (obj == null) {
            return V8ValueNull.NULL;
        }
        if (obj instanceof Float) {
            return DAz.t(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return DAz.rl(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj instanceof Integer) {
            String str = String.format(Locale.ROOT, "%d", Arrays.copyOf(new Object[]{obj}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (obj instanceof Long) {
            String str2 = String.format(Locale.ROOT, "%d", Arrays.copyOf(new Object[]{obj}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : V8ValueBoolean.FALSE;
        }
        if (obj instanceof Unit) {
            return Unit.INSTANCE.toString();
        }
        if (obj instanceof Date) {
            return n((Date) obj);
        }
        if (obj instanceof Vector2D) {
            return ((Vector2D) obj).toString();
        }
        if (obj instanceof Vector3D) {
            return ((Vector3D) obj).toString();
        }
        if (obj instanceof Vector4D) {
            return ((Vector4D) obj).toString();
        }
        if (obj instanceof Quaternion) {
            return QuaternionKt.getVec4((Quaternion) obj).toString();
        }
        if (obj instanceof SolidColor) {
            return qf.rl(ColorKt.toInt((SolidColor) obj));
        }
        throw new UnsupportedOperationException("Can't serialize <" + obj + "> of type " + obj.getClass().getSimpleName());
    }
}
