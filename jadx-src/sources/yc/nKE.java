package yc;

import com.alightcreative.app.motion.scene.Vector2D;
import com.caoccao.javet.utils.Float16;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class nKE {
    private final op HI;
    private final boolean J2;
    private final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f76061O;
    private final boolean Uo;
    private final boolean az;
    private final float gh;
    private final Vector2D mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f76062n;
    private final Vector2D nr;
    private final Vector2D qie;
    private final Vector2D rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f76063t;
    private final boolean ty;
    private final float xMQ;
    public static final j ck = new j(null);
    private static final nKE Ik = new nKE(0.0f, null, 0.0f, null, false, false, false, 0.0f, 0.0f, null, 0.0f, null, false, false, null, Float16.EXPONENT_SIGNIFICAND_MASK, null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final nKE n() {
            return nKE.Ik;
        }
    }

    public nKE(float f3, Vector2D previewPan, float f4, Vector2D prevPreviewPan, boolean z2, boolean z3, boolean z4, float f5, float f6, Vector2D cameraPreviewPan, float f7, Vector2D prevCameraPreviewPan, boolean z5, boolean z6, op selectedLayerMode) {
        Intrinsics.checkNotNullParameter(previewPan, "previewPan");
        Intrinsics.checkNotNullParameter(prevPreviewPan, "prevPreviewPan");
        Intrinsics.checkNotNullParameter(cameraPreviewPan, "cameraPreviewPan");
        Intrinsics.checkNotNullParameter(prevCameraPreviewPan, "prevCameraPreviewPan");
        Intrinsics.checkNotNullParameter(selectedLayerMode, "selectedLayerMode");
        this.f76062n = f3;
        this.rl = previewPan;
        this.f76063t = f4;
        this.nr = prevPreviewPan;
        this.f76061O = z2;
        this.J2 = z3;
        this.Uo = z4;
        this.KN = f5;
        this.xMQ = f6;
        this.mUb = cameraPreviewPan;
        this.gh = f7;
        this.qie = prevCameraPreviewPan;
        this.az = z5;
        this.ty = z6;
        this.HI = selectedLayerMode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nKE)) {
            return false;
        }
        nKE nke = (nKE) obj;
        return Float.compare(this.f76062n, nke.f76062n) == 0 && Intrinsics.areEqual(this.rl, nke.rl) && Float.compare(this.f76063t, nke.f76063t) == 0 && Intrinsics.areEqual(this.nr, nke.nr) && this.f76061O == nke.f76061O && this.J2 == nke.J2 && this.Uo == nke.Uo && Float.compare(this.KN, nke.KN) == 0 && Float.compare(this.xMQ, nke.xMQ) == 0 && Intrinsics.areEqual(this.mUb, nke.mUb) && Float.compare(this.gh, nke.gh) == 0 && Intrinsics.areEqual(this.qie, nke.qie) && this.az == nke.az && this.ty == nke.ty && this.HI == nke.HI;
    }

    public final op HI() {
        return this.HI;
    }

    public final boolean Ik() {
        return this.Uo;
    }

    public final float J2() {
        return this.xMQ;
    }

    public final boolean KN() {
        return this.f76061O;
    }

    public final Vector2D O() {
        return this.mUb;
    }

    public final float Uo() {
        return this.KN;
    }

    public final Vector2D az() {
        return this.rl;
    }

    public final boolean ck() {
        return this.J2;
    }

    public final Vector2D gh() {
        return this.nr;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Float.hashCode(this.f76062n) * 31) + this.rl.hashCode()) * 31) + Float.hashCode(this.f76063t)) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f76061O)) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo)) * 31) + Float.hashCode(this.KN)) * 31) + Float.hashCode(this.xMQ)) * 31) + this.mUb.hashCode()) * 31) + Float.hashCode(this.gh)) * 31) + this.qie.hashCode()) * 31) + Boolean.hashCode(this.az)) * 31) + Boolean.hashCode(this.ty)) * 31) + this.HI.hashCode();
    }

    public final float mUb() {
        return this.gh;
    }

    public final boolean nr() {
        return this.az;
    }

    public final float qie() {
        return this.f76063t;
    }

    public final nKE rl(float f3, Vector2D previewPan, float f4, Vector2D prevPreviewPan, boolean z2, boolean z3, boolean z4, float f5, float f6, Vector2D cameraPreviewPan, float f7, Vector2D prevCameraPreviewPan, boolean z5, boolean z6, op selectedLayerMode) {
        Intrinsics.checkNotNullParameter(previewPan, "previewPan");
        Intrinsics.checkNotNullParameter(prevPreviewPan, "prevPreviewPan");
        Intrinsics.checkNotNullParameter(cameraPreviewPan, "cameraPreviewPan");
        Intrinsics.checkNotNullParameter(prevCameraPreviewPan, "prevCameraPreviewPan");
        Intrinsics.checkNotNullParameter(selectedLayerMode, "selectedLayerMode");
        return new nKE(f3, previewPan, f4, prevPreviewPan, z2, z3, z4, f5, f6, cameraPreviewPan, f7, prevCameraPreviewPan, z5, z6, selectedLayerMode);
    }

    public String toString() {
        return "UserPreviewMode(previewScale=" + this.f76062n + ", previewPan=" + this.rl + ", prevPreviewScale=" + this.f76063t + ", prevPreviewPan=" + this.nr + ", panAndZoomMode=" + this.f76061O + ", showGrid=" + this.J2 + ", showPixels=" + this.Uo + ", gridSpacing=" + this.KN + ", cameraPreviewScale=" + this.xMQ + ", cameraPreviewPan=" + this.mUb + ", prevCameraPreviewScale=" + this.gh + ", prevCameraPreviewPan=" + this.qie + ", cameraPreview=" + this.az + ", hideEffects=" + this.ty + ", selectedLayerMode=" + this.HI + ")";
    }

    public final float ty() {
        return this.f76062n;
    }

    public final Vector2D xMQ() {
        return this.qie;
    }

    public /* synthetic */ nKE(float f3, Vector2D vector2D, float f4, Vector2D vector2D2, boolean z2, boolean z3, boolean z4, float f5, float f6, Vector2D vector2D3, float f7, Vector2D vector2D4, boolean z5, boolean z6, op opVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1.0f : f3, (i2 & 2) != 0 ? Vector2D.INSTANCE.getZERO() : vector2D, (i2 & 4) != 0 ? 1.0f : f4, (i2 & 8) != 0 ? Vector2D.INSTANCE.getZERO() : vector2D2, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4, (i2 & 128) != 0 ? 40.0f : f5, (i2 & 256) != 0 ? 1.0f : f6, (i2 & 512) != 0 ? Vector2D.INSTANCE.getZERO() : vector2D3, (i2 & 1024) == 0 ? f7 : 1.0f, (i2 & 2048) != 0 ? Vector2D.INSTANCE.getZERO() : vector2D4, (i2 & 4096) != 0 ? false : z5, (i2 & 8192) == 0 ? z6 : false, (i2 & 16384) != 0 ? op.f76083n : opVar);
    }
}
