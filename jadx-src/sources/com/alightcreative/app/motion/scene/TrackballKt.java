package com.alightcreative.app.motion.scene;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TRACKBALLSIZE", "", "trackball_3d", "Lcom/alightcreative/app/motion/scene/Quaternion;", "p1", "Lcom/alightcreative/app/motion/scene/Vector2D;", "p2", "axisToQuat", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Lcom/alightcreative/app/motion/scene/Vector3D;", "phi", "projectToSphere", "r", TtmlNode.TAG_P, "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TrackballKt {
    private static final float TRACKBALLSIZE = 0.8f;

    public static final Quaternion trackball_3d(Vector2D p1, Vector2D p2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        if (Intrinsics.areEqual(p1, p2)) {
            return Quaternion.INSTANCE.getIDENTITY();
        }
        Vector3D vector3DProjectToSphere = projectToSphere(TRACKBALLSIZE, p1);
        return axisToQuat(GeometryKt.normalize(GeometryKt.cross(projectToSphere(TRACKBALLSIZE, p2), vector3DProjectToSphere)), ((float) Math.asin(RangesKt.coerceIn(GeometryKt.getLength(GeometryKt.div(GeometryKt.minus(vector3DProjectToSphere, r3), 1.6f)), -1.0f, 1.0f))) * 2.0f).normalize();
    }

    private static final Quaternion axisToQuat(Vector3D vector3D, float f3) {
        double d2 = f3 / 2.0f;
        Vector3D vector3DTimes = GeometryKt.times(GeometryKt.normalize(vector3D), (float) Math.sin(d2));
        return QuaternionKt.Quaternion(vector3DTimes.getX(), vector3DTimes.getY(), vector3DTimes.getZ(), (float) Math.cos(d2));
    }

    private static final Vector3D projectToSphere(float f3, Vector2D vector2D) {
        float fSqrt;
        float length = GeometryKt.getLength(vector2D);
        if (length < 0.70710677f * f3) {
            fSqrt = (float) Math.sqrt((f3 * f3) - (length * length));
        } else {
            float f4 = f3 / 1.4142135f;
            fSqrt = (f4 * f4) / length;
        }
        return new Vector3D(vector2D.getX(), vector2D.getY(), fSqrt);
    }
}
