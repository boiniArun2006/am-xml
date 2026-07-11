package com.alightcreative.app.motion.scene;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0013\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u00020\u0014\u001a\n\u0010\u0015\u001a\u00020\u0016*\u00020\u0003\u001a\n\u0010\u0017\u001a\u00020\u0016*\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u0016*\u00020\u0003\u001a\n\u0010\u001a\u001a\u00020\u0003*\u00020\u0003\u001a\n\u0010\u001b\u001a\u00020\t*\u00020\u0003\u001a\u0015\u0010\u001c\u001a\u00020\t*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0003H\u0086\u0002\u001a\u0012\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0003\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0003\u001a\u001e\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001\u001a\u001e\u0010\u001f\u001a\u00020#2\u0006\u0010 \u001a\u00020#2\u0006\u0010!\u001a\u00020#2\u0006\u0010\"\u001a\u00020#\u001a\u001e\u0010$\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u0015\u0010\b\u001a\u00020\t*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0015\u0010\f\u001a\u00020\r*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006&"}, d2 = {"epsilonF", "", "Quaternion", "Lcom/alightcreative/app/motion/scene/Quaternion;", "x", "y", "z", "w", "vec3", "Lcom/alightcreative/app/motion/scene/Vector3D;", "getVec3", "(Lcom/alightcreative/app/motion/scene/Quaternion;)Lcom/alightcreative/app/motion/scene/Vector3D;", "vec4", "Lcom/alightcreative/app/motion/scene/Vector4D;", "getVec4", "(Lcom/alightcreative/app/motion/scene/Quaternion;)Lcom/alightcreative/app/motion/scene/Vector4D;", "cross", "q1", "q2", "toQuaternionOrNull", "", "toMat3", "", "toFloatArray", "", "toMat4", "inverse", "eulerAngles", "times", "q", "rotate", "mix", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", TtmlNode.TAG_P, "", "slerp", "interp", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/alightcreative/app/motion/scene/QuaternionKt\n+ 2 Geometry.kt\ncom/alightcreative/app/motion/scene/GeometryKt\n*L\n1#1,326:1\n84#2:327\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/alightcreative/app/motion/scene/QuaternionKt\n*L\n278#1:327\n*E\n"})
public final class QuaternionKt {
    private static final float epsilonF = 1.1920929E-7f;

    public static final double mix(double d2, double d4, double d5) {
        return (d2 * (1.0d - d5)) + (d4 * d5);
    }

    public static final Vector3D rotate(Vector3D vector3D, Quaternion q2) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(q2, "q");
        return q2.times(vector3D);
    }

    public static final Quaternion Quaternion(float f3, float f4, float f5, float f6) {
        return new Quaternion(f3, f4, f5, f6);
    }

    public static final Vector3D cross(Quaternion q1, Quaternion q2) {
        Intrinsics.checkNotNullParameter(q1, "q1");
        Intrinsics.checkNotNullParameter(q2, "q2");
        return GeometryKt.cross(new Vector3D((float) q1.getX(), (float) q1.getY(), (float) q1.getZ()), new Vector3D((float) q2.getX(), (float) q2.getY(), (float) q2.getZ()));
    }

    public static final Vector3D eulerAngles(Quaternion quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "<this>");
        return new Vector3D((float) quaternion.getPitch(), (float) quaternion.getYaw(), (float) quaternion.getRoll());
    }

    public static final Vector3D getVec3(Quaternion quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "<this>");
        return new Vector3D((float) quaternion.getX(), (float) quaternion.getY(), (float) quaternion.getZ());
    }

    public static final Vector4D getVec4(Quaternion quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "<this>");
        return new Vector4D((float) quaternion.getX(), (float) quaternion.getY(), (float) quaternion.getZ(), (float) quaternion.getW());
    }

    public static final Quaternion inverse(Quaternion quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "<this>");
        return new Quaternion(-quaternion.getX(), -quaternion.getY(), -quaternion.getZ(), quaternion.getW());
    }

    public static final float mix(float f3, float f4, float f5) {
        return (f3 * (1.0f - f5)) + (f4 * f5);
    }

    public static final Vector4D rotate(Vector4D vector4D, Quaternion q2) {
        Intrinsics.checkNotNullParameter(vector4D, "<this>");
        Intrinsics.checkNotNullParameter(q2, "q");
        return GeometryKt.Vector4D(q2.times(new Vector3D(vector4D.getX(), vector4D.getY(), vector4D.getZ())), 1.0f);
    }

    public static final Quaternion slerp(Quaternion a2, Quaternion b2, float f3) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        double w2 = b2.getW();
        double x2 = b2.getX();
        double y2 = b2.getY();
        double z2 = b2.getZ();
        double dDot = a2.dot(b2);
        if (dDot < 0.0d) {
            w2 = -b2.getW();
            x2 = -b2.getX();
            y2 = -b2.getY();
            z2 = -b2.getZ();
            dDot = -dDot;
        }
        if (dDot > 1.0f - epsilonF) {
            return new Quaternion(HI0.vd.n(a2.getX(), x2, f3), HI0.vd.n(a2.getY(), y2, f3), HI0.vd.n(a2.getZ(), z2, f3), HI0.vd.n(a2.getW(), w2, f3));
        }
        double dAcos = Math.acos(dDot);
        double dSin = Math.sin(((double) (1.0f - f3)) * dAcos);
        double dSin2 = Math.sin(((double) f3) * dAcos);
        double dSin3 = Math.sin(dAcos);
        return new Quaternion(((a2.getX() * dSin) + (x2 * dSin2)) / dSin3, ((a2.getY() * dSin) + (y2 * dSin2)) / dSin3, ((a2.getZ() * dSin) + (z2 * dSin2)) / dSin3, ((dSin * a2.getW()) + (dSin2 * w2)) / dSin3);
    }

    public static final Vector3D times(Vector3D vector3D, Quaternion q2) {
        Intrinsics.checkNotNullParameter(vector3D, "<this>");
        Intrinsics.checkNotNullParameter(q2, "q");
        double dDot = GeometryKt.dot(vector3D, vector3D);
        double w2 = q2.getW() / dDot;
        double d2 = (-q2.getX()) / dDot;
        double d4 = (-q2.getY()) / dDot;
        double d5 = (-q2.getZ()) / dDot;
        double z2 = (((double) vector3D.getZ()) * d4) - (((double) vector3D.getY()) * d5);
        double x2 = (((double) vector3D.getX()) * d5) - (((double) vector3D.getZ()) * d2);
        double y2 = (((double) vector3D.getY()) * d2) - (((double) vector3D.getX()) * d4);
        return new Vector3D((float) (((double) vector3D.getX()) + (((z2 * w2) + ((d4 * y2) - (x2 * d5))) * 2.0d)), (float) (((double) vector3D.getY()) + (((x2 * w2) + ((d5 * z2) - (y2 * d2))) * 2.0d)), (float) (((double) vector3D.getZ()) + (((y2 * w2) + ((d2 * x2) - (d4 * z2))) * 2.0d)));
    }

    public static final float[] toFloatArray(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        float[] fArr = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr[i2] = (float) dArr[i2];
        }
        return fArr;
    }

    public static final float[] toMat3(Quaternion quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "<this>");
        double x2 = quaternion.getX() * quaternion.getX();
        double y2 = quaternion.getY() * quaternion.getY();
        double z2 = quaternion.getZ() * quaternion.getZ();
        double x3 = quaternion.getX() * quaternion.getZ();
        double x4 = quaternion.getX() * quaternion.getY();
        double y3 = quaternion.getY() * quaternion.getZ();
        double w2 = quaternion.getW() * quaternion.getX();
        double w3 = quaternion.getW() * quaternion.getY();
        double w4 = quaternion.getW() * quaternion.getZ();
        return toFloatArray(new double[]{1.0d - ((y2 + z2) * 2.0d), (x4 + w4) * 2.0d, (x3 - w3) * 2.0d, (x4 - w4) * 2.0d, 1.0d - ((z2 + x2) * 2.0d), (y3 + w2) * 2.0d, (x3 + w3) * 2.0d, (y3 - w2) * 2.0d, 1.0d - ((x2 + y2) * 2.0d)});
    }

    public static final float[] toMat4(Quaternion quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "<this>");
        double x2 = quaternion.getX() * quaternion.getX();
        double y2 = quaternion.getY() * quaternion.getY();
        double z2 = quaternion.getZ() * quaternion.getZ();
        double x3 = quaternion.getX() * quaternion.getZ();
        double x4 = quaternion.getX() * quaternion.getY();
        double y3 = quaternion.getY() * quaternion.getZ();
        double w2 = quaternion.getW() * quaternion.getX();
        double w3 = quaternion.getW() * quaternion.getY();
        double w4 = quaternion.getW() * quaternion.getZ();
        return toFloatArray(new double[]{1.0d - ((y2 + z2) * 2.0d), (x4 + w4) * 2.0d, (x3 - w3) * 2.0d, 0.0d, (x4 - w4) * 2.0d, 1.0d - ((z2 + x2) * 2.0d), (y3 + w2) * 2.0d, 0.0d, (x3 + w3) * 2.0d, (y3 - w2) * 2.0d, 1.0d - ((x2 + y2) * 2.0d), 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
    }

    public static final Quaternion toQuaternionOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ',', 0, false, 6, (Object) null);
        int i2 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ',', i2, false, 4, (Object) null);
        int i3 = iIndexOf$default2 + 1;
        int iIndexOf$default3 = StringsKt.indexOf$default((CharSequence) str, ',', i3, false, 4, (Object) null);
        int i5 = iIndexOf$default3 + 1;
        int iIndexOf$default4 = StringsKt.indexOf$default((CharSequence) str, ',', i5, false, 4, (Object) null);
        if (iIndexOf$default < 0 || iIndexOf$default2 < 0 || iIndexOf$default3 < 0 || iIndexOf$default4 >= 0) {
            return null;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Double doubleOrNull = StringsKt.toDoubleOrNull(strSubstring);
        String strSubstring2 = str.substring(i2, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        Double doubleOrNull2 = StringsKt.toDoubleOrNull(strSubstring2);
        String strSubstring3 = str.substring(i3, iIndexOf$default3);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        Double doubleOrNull3 = StringsKt.toDoubleOrNull(strSubstring3);
        String strSubstring4 = str.substring(i5, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        Double doubleOrNull4 = StringsKt.toDoubleOrNull(strSubstring4);
        if (doubleOrNull == null || doubleOrNull2 == null || doubleOrNull3 == null || doubleOrNull4 == null) {
            return null;
        }
        return new Quaternion(doubleOrNull.doubleValue(), doubleOrNull2.doubleValue(), doubleOrNull3.doubleValue(), doubleOrNull4.doubleValue());
    }
}
