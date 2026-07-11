package yc;

import android.view.View;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.Vector2D;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class RP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f75843n;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f75844t;

    static {
        float[] fArr = {0.01f, 0.05f, 0.1f, 0.25f, 0.5f, 1.0f, 1.5f, 2.0f, 3.0f, 4.0f, 8.0f, 16.0f, 32.0f, 64.0f};
        f75843n = fArr;
        rl = ArraysKt.first(fArr);
        f75844t = ArraysKt.last(fArr);
    }

    public static final float J2() {
        return f75844t;
    }

    public static final float KN(nKE nke) {
        Intrinsics.checkNotNullParameter(nke, "<this>");
        return nke.nr() ? nke.J2() : nke.ty();
    }

    public static final float[] O() {
        return f75843n;
    }

    public static final float Uo() {
        return rl;
    }

    public static final nKE gh(nKE nke, Vector2D pan, float f3) {
        int i2;
        Object obj;
        float f4;
        Vector2D vector2D;
        boolean z2;
        boolean z3;
        boolean z4;
        float f5;
        float f6;
        Vector2D vector2D2;
        float f7;
        Vector2D vector2D3;
        boolean z5;
        boolean z6;
        op opVar;
        Vector2D vector2D4;
        float f8;
        nKE nke2 = nke;
        Intrinsics.checkNotNullParameter(nke2, "<this>");
        Intrinsics.checkNotNullParameter(pan, "pan");
        if (nke2.nr()) {
            i2 = 31999;
            obj = null;
            f8 = 0.0f;
            vector2D4 = null;
            f4 = 0.0f;
            vector2D = null;
            z2 = false;
            z3 = false;
            z4 = false;
            f5 = 0.0f;
            f7 = 0.0f;
            vector2D3 = null;
            z5 = false;
            z6 = false;
            opVar = null;
            vector2D2 = pan;
            f6 = f3;
        } else {
            i2 = 32764;
            obj = null;
            f4 = 0.0f;
            vector2D = null;
            z2 = false;
            z3 = false;
            z4 = false;
            f5 = 0.0f;
            f6 = 0.0f;
            vector2D2 = null;
            f7 = 0.0f;
            vector2D3 = null;
            z5 = false;
            z6 = false;
            opVar = null;
            nke2 = nke;
            vector2D4 = pan;
            f8 = f3;
        }
        return nke2.rl((32703 & 1) != 0 ? nke2.f76062n : f8, (32703 & 2) != 0 ? nke2.rl : vector2D4, (32703 & 4) != 0 ? nke2.f76063t : f4, (32703 & 8) != 0 ? nke2.nr : vector2D, (32703 & 16) != 0 ? nke2.f76061O : z2, (32703 & 32) != 0 ? nke2.J2 : z3, (32703 & 64) != 0 ? nke2.Uo : z4, (32703 & 128) != 0 ? nke2.KN : f5, (32703 & 256) != 0 ? nke2.xMQ : f6, (32703 & 512) != 0 ? nke2.mUb : vector2D2, (32703 & 1024) != 0 ? nke2.gh : f7, (32703 & 2048) != 0 ? nke2.qie : vector2D3, (32703 & 4096) != 0 ? nke2.az : z5, (32703 & 8192) != 0 ? nke2.ty : z6, (32703 & 16384) != 0 ? nke2.HI : opVar);
    }

    public static final nKE mUb(nKE nke, Vector2D value) {
        int i2;
        Object obj;
        float f3;
        float f4;
        Vector2D vector2D;
        boolean z2;
        boolean z3;
        boolean z4;
        float f5;
        float f6;
        Vector2D vector2D2;
        float f7;
        Vector2D vector2D3;
        boolean z5;
        boolean z6;
        op opVar;
        Vector2D vector2D4;
        nKE nke2 = nke;
        Intrinsics.checkNotNullParameter(nke2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        if (nke2.nr()) {
            i2 = 32255;
            obj = null;
            f3 = 0.0f;
            vector2D4 = null;
            f4 = 0.0f;
            vector2D = null;
            z2 = false;
            z3 = false;
            z4 = false;
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
            vector2D3 = null;
            z5 = false;
            z6 = false;
            opVar = null;
            vector2D2 = value;
        } else {
            i2 = 32765;
            obj = null;
            f3 = 0.0f;
            f4 = 0.0f;
            vector2D = null;
            z2 = false;
            z3 = false;
            z4 = false;
            f5 = 0.0f;
            f6 = 0.0f;
            vector2D2 = null;
            f7 = 0.0f;
            vector2D3 = null;
            z5 = false;
            z6 = false;
            opVar = null;
            nke2 = nke;
            vector2D4 = value;
        }
        return nke2.rl((32703 & 1) != 0 ? nke2.f76062n : f3, (32703 & 2) != 0 ? nke2.rl : vector2D4, (32703 & 4) != 0 ? nke2.f76063t : f4, (32703 & 8) != 0 ? nke2.nr : vector2D, (32703 & 16) != 0 ? nke2.f76061O : z2, (32703 & 32) != 0 ? nke2.J2 : z3, (32703 & 64) != 0 ? nke2.Uo : z4, (32703 & 128) != 0 ? nke2.KN : f5, (32703 & 256) != 0 ? nke2.xMQ : f6, (32703 & 512) != 0 ? nke2.mUb : vector2D2, (32703 & 1024) != 0 ? nke2.gh : f7, (32703 & 2048) != 0 ? nke2.qie : vector2D3, (32703 & 4096) != 0 ? nke2.az : z5, (32703 & 8192) != 0 ? nke2.ty : z6, (32703 & 16384) != 0 ? nke2.HI : opVar);
    }

    public static final nKE n(nKE nke) {
        Intrinsics.checkNotNullParameter(nke, "<this>");
        return nke.nr() ? nke.rl((32703 & 1) != 0 ? nke.f76062n : 0.0f, (32703 & 2) != 0 ? nke.rl : null, (32703 & 4) != 0 ? nke.f76063t : 0.0f, (32703 & 8) != 0 ? nke.nr : null, (32703 & 16) != 0 ? nke.f76061O : false, (32703 & 32) != 0 ? nke.J2 : false, (32703 & 64) != 0 ? nke.Uo : false, (32703 & 128) != 0 ? nke.KN : 0.0f, (32703 & 256) != 0 ? nke.xMQ : 0.0f, (32703 & 512) != 0 ? nke.mUb : null, (32703 & 1024) != 0 ? nke.gh : nke.J2(), (32703 & 2048) != 0 ? nke.qie : nke.O(), (32703 & 4096) != 0 ? nke.az : false, (32703 & 8192) != 0 ? nke.ty : false, (32703 & 16384) != 0 ? nke.HI : null) : nke.rl((32703 & 1) != 0 ? nke.f76062n : 0.0f, (32703 & 2) != 0 ? nke.rl : null, (32703 & 4) != 0 ? nke.f76063t : nke.ty(), (32703 & 8) != 0 ? nke.nr : nke.az(), (32703 & 16) != 0 ? nke.f76061O : false, (32703 & 32) != 0 ? nke.J2 : false, (32703 & 64) != 0 ? nke.Uo : false, (32703 & 128) != 0 ? nke.KN : 0.0f, (32703 & 256) != 0 ? nke.xMQ : 0.0f, (32703 & 512) != 0 ? nke.mUb : null, (32703 & 1024) != 0 ? nke.gh : 0.0f, (32703 & 2048) != 0 ? nke.qie : null, (32703 & 4096) != 0 ? nke.az : false, (32703 & 8192) != 0 ? nke.ty : false, (32703 & 16384) != 0 ? nke.HI : null);
    }

    public static final Vector2D nr(SceneHolder sceneHolder, float f3, float f4, View previewView) {
        Intrinsics.checkNotNullParameter(sceneHolder, "<this>");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        float width = previewView.getWidth();
        float height = previewView.getHeight();
        float width2 = sceneHolder.getScene().getWidth();
        float height2 = sceneHolder.getScene().getHeight();
        float f5 = width / height;
        float f6 = width2 / height2;
        float f7 = ((f5 > f6 ? height2 * f5 : width2) - width2) * 0.5f;
        float f8 = ((f5 > f6 ? height2 : width2 / f5) - height2) * 0.5f;
        Rectangle rectangleOffset = GeometryKt.offset(GeometryKt.scaleAroundCenter(new Rectangle(-f7, -f8, width2 + f7, height2 + f8), 1.0f / KN(sceneHolder.getUserPreviewMode())), GeometryKt.unaryMinus(rl(sceneHolder.getUserPreviewMode())));
        return new Vector2D(((f3 / previewView.getWidth()) * rectangleOffset.getWidth()) + rectangleOffset.getLeft(), ((f4 / previewView.getHeight()) * rectangleOffset.getHeight()) + rectangleOffset.getTop());
    }

    public static final nKE qie(nKE nke, float f3) {
        int i2;
        Object obj;
        Vector2D vector2D;
        float f4;
        Vector2D vector2D2;
        boolean z2;
        boolean z3;
        boolean z4;
        float f5;
        float f6;
        Vector2D vector2D3;
        float f7;
        Vector2D vector2D4;
        boolean z5;
        boolean z6;
        op opVar;
        float f8;
        nKE nke2 = nke;
        Intrinsics.checkNotNullParameter(nke2, "<this>");
        if (nke2.nr()) {
            i2 = 32511;
            obj = null;
            f8 = 0.0f;
            vector2D = null;
            f4 = 0.0f;
            vector2D2 = null;
            z2 = false;
            z3 = false;
            z4 = false;
            f5 = 0.0f;
            vector2D3 = null;
            f7 = 0.0f;
            vector2D4 = null;
            z5 = false;
            z6 = false;
            opVar = null;
            f6 = f3;
        } else {
            i2 = 32766;
            obj = null;
            vector2D = null;
            f4 = 0.0f;
            vector2D2 = null;
            z2 = false;
            z3 = false;
            z4 = false;
            f5 = 0.0f;
            f6 = 0.0f;
            vector2D3 = null;
            f7 = 0.0f;
            vector2D4 = null;
            z5 = false;
            z6 = false;
            opVar = null;
            nke2 = nke;
            f8 = f3;
        }
        return nke2.rl((32703 & 1) != 0 ? nke2.f76062n : f8, (32703 & 2) != 0 ? nke2.rl : vector2D, (32703 & 4) != 0 ? nke2.f76063t : f4, (32703 & 8) != 0 ? nke2.nr : vector2D2, (32703 & 16) != 0 ? nke2.f76061O : z2, (32703 & 32) != 0 ? nke2.J2 : z3, (32703 & 64) != 0 ? nke2.Uo : z4, (32703 & 128) != 0 ? nke2.KN : f5, (32703 & 256) != 0 ? nke2.xMQ : f6, (32703 & 512) != 0 ? nke2.mUb : vector2D3, (32703 & 1024) != 0 ? nke2.gh : f7, (32703 & 2048) != 0 ? nke2.qie : vector2D4, (32703 & 4096) != 0 ? nke2.az : z5, (32703 & 8192) != 0 ? nke2.ty : z6, (32703 & 16384) != 0 ? nke2.HI : opVar);
    }

    public static final Vector2D rl(nKE nke) {
        Intrinsics.checkNotNullParameter(nke, "<this>");
        return nke.nr() ? nke.O() : nke.az();
    }

    public static final Vector2D t(SceneHolder sceneHolder, float f3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(sceneHolder, "<this>");
        float width = sceneHolder.getScene().getWidth();
        float height = sceneHolder.getScene().getHeight();
        float f7 = f5 / f6;
        float f8 = width / height;
        float f9 = ((f7 > f8 ? height * f7 : width) - width) * 0.5f;
        float f10 = ((f7 > f8 ? height : width / f7) - height) * 0.5f;
        Rectangle rectangleOffset = GeometryKt.offset(GeometryKt.scaleAroundCenter(new Rectangle(-f9, -f10, width + f9, height + f10), 1.0f / KN(sceneHolder.getUserPreviewMode())), GeometryKt.unaryMinus(rl(sceneHolder.getUserPreviewMode())));
        return new Vector2D(((f3 / f5) * rectangleOffset.getWidth()) + rectangleOffset.getLeft(), ((f4 / f6) * rectangleOffset.getHeight()) + rectangleOffset.getTop());
    }

    public static final nKE xMQ(nKE nke) {
        Intrinsics.checkNotNullParameter(nke, "<this>");
        return nke.nr() ? nke.rl((32703 & 1) != 0 ? nke.f76062n : 0.0f, (32703 & 2) != 0 ? nke.rl : null, (32703 & 4) != 0 ? nke.f76063t : 0.0f, (32703 & 8) != 0 ? nke.nr : null, (32703 & 16) != 0 ? nke.f76061O : false, (32703 & 32) != 0 ? nke.J2 : false, (32703 & 64) != 0 ? nke.Uo : false, (32703 & 128) != 0 ? nke.KN : 0.0f, (32703 & 256) != 0 ? nke.xMQ : nke.mUb(), (32703 & 512) != 0 ? nke.mUb : nke.xMQ(), (32703 & 1024) != 0 ? nke.gh : 0.0f, (32703 & 2048) != 0 ? nke.qie : null, (32703 & 4096) != 0 ? nke.az : false, (32703 & 8192) != 0 ? nke.ty : false, (32703 & 16384) != 0 ? nke.HI : null) : nke.rl((32703 & 1) != 0 ? nke.f76062n : nke.qie(), (32703 & 2) != 0 ? nke.rl : nke.gh(), (32703 & 4) != 0 ? nke.f76063t : 0.0f, (32703 & 8) != 0 ? nke.nr : null, (32703 & 16) != 0 ? nke.f76061O : false, (32703 & 32) != 0 ? nke.J2 : false, (32703 & 64) != 0 ? nke.Uo : false, (32703 & 128) != 0 ? nke.KN : 0.0f, (32703 & 256) != 0 ? nke.xMQ : 0.0f, (32703 & 512) != 0 ? nke.mUb : null, (32703 & 1024) != 0 ? nke.gh : 0.0f, (32703 & 2048) != 0 ? nke.qie : null, (32703 & 4096) != 0 ? nke.az : false, (32703 & 8192) != 0 ? nke.ty : false, (32703 & 16384) != 0 ? nke.HI : null);
    }
}
