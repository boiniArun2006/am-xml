package x0;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.PaintCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Xo {
    private static final Matrix te = new Matrix();
    private H.j HI;
    float[] Ik;
    private Rect J2;
    private RectF KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private RectF f75152O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private H.j f75153S;
    private RectF Uo;
    private RenderNode ViF;
    private BlurMaskFilter WPU;
    private Canvas XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Canvas f75154Z;
    private float aYN = 0.0f;
    private Canvas az;
    Matrix ck;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Ml f75155g;
    private Paint gh;
    private RectF mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Canvas f75156n;
    private RenderNode nY;
    private RectF nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Bitmap f75157o;
    private Bitmap qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Bitmap f75158r;
    private j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private n f75159t;
    private Rect ty;
    private Rect xMQ;

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f75160n;
        public Ml nr;
        public BlendModeCompat rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ColorFilter f75161t;

        public void J2() {
            this.f75160n = 255;
            this.rl = null;
            this.f75161t = null;
            this.nr = null;
        }

        public boolean O() {
            return this.f75160n < 255;
        }

        public boolean n() {
            BlendModeCompat blendModeCompat = this.rl;
            return (blendModeCompat == null || blendModeCompat == BlendModeCompat.SRC_OVER) ? false : true;
        }

        public boolean rl() {
            return this.f75161t != null;
        }

        public boolean t() {
            return this.nr != null;
        }

        public j() {
            J2();
        }

        public boolean nr() {
            if (!O() && !n() && !t() && !rl()) {
                return true;
            }
            return false;
        }
    }

    protected enum n {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    private boolean J2(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    private void KN(Canvas canvas, Ml ml) {
        if (this.ViF == null || this.nY == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.Ik;
        float f3 = fArr != null ? fArr[0] : 1.0f;
        float f4 = fArr != null ? fArr[4] : 1.0f;
        Ml ml2 = this.f75155g;
        if (ml2 == null || !ml.mUb(ml2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(ml.O(), PorterDuff.Mode.SRC_IN));
            if (ml.KN() > 0.0f) {
                float fKN = (ml.KN() * (f3 + f4)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fKN, fKN, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.nY.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.f75155g = ml;
        }
        RectF rectFRl = rl(this.nr, ml);
        RectF rectF = new RectF(rectFRl.left * f3, rectFRl.top * f4, rectFRl.right * f3, rectFRl.bottom * f4);
        this.nY.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.nY.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (ml.J2() * f3), (-rectF.top) + (ml.Uo() * f4));
        recordingCanvasBeginRecording.drawRenderNode(this.ViF);
        this.nY.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.nY);
        canvas.restore();
    }

    private void Uo(Canvas canvas, Ml ml) {
        H.j jVar;
        RectF rectF = this.nr;
        if (rectF == null || this.qie == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFRl = rl(rectF, ml);
        if (this.J2 == null) {
            this.J2 = new Rect();
        }
        this.J2.set((int) Math.floor(rectFRl.left), (int) Math.floor(rectFRl.top), (int) Math.ceil(rectFRl.right), (int) Math.ceil(rectFRl.bottom));
        float[] fArr = this.Ik;
        float f3 = fArr != null ? fArr[0] : 1.0f;
        float f4 = fArr != null ? fArr[4] : 1.0f;
        if (this.KN == null) {
            this.KN = new RectF();
        }
        this.KN.set(rectFRl.left * f3, rectFRl.top * f4, rectFRl.right * f3, rectFRl.bottom * f4);
        if (this.xMQ == null) {
            this.xMQ = new Rect();
        }
        this.xMQ.set(0, 0, Math.round(this.KN.width()), Math.round(this.KN.height()));
        if (J2(this.f75158r, this.KN)) {
            Bitmap bitmap = this.f75158r;
            if (bitmap != null) {
                nr(bitmap);
            }
            Bitmap bitmap2 = this.f75157o;
            if (bitmap2 != null) {
                nr(bitmap2);
            }
            this.f75158r = n(this.KN, Bitmap.Config.ARGB_8888);
            this.f75157o = n(this.KN, Bitmap.Config.ALPHA_8);
            this.f75154Z = new Canvas(this.f75158r);
            this.XQ = new Canvas(this.f75157o);
        } else {
            Canvas canvas2 = this.f75154Z;
            if (canvas2 == null || this.XQ == null || (jVar = this.HI) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.xMQ, jVar);
            this.XQ.drawRect(this.xMQ, this.HI);
        }
        if (this.f75157o == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f75153S == null) {
            this.f75153S = new H.j(1);
        }
        RectF rectF2 = this.nr;
        this.XQ.drawBitmap(this.qie, Math.round((rectF2.left - rectFRl.left) * f3), Math.round((rectF2.top - rectFRl.top) * f4), (Paint) null);
        if (this.WPU == null || this.aYN != ml.KN()) {
            float fKN = (ml.KN() * (f3 + f4)) / 2.0f;
            if (fKN > 0.0f) {
                this.WPU = new BlurMaskFilter(fKN, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.WPU = null;
            }
            this.aYN = ml.KN();
        }
        this.f75153S.setColor(ml.O());
        if (ml.KN() > 0.0f) {
            this.f75153S.setMaskFilter(this.WPU);
        } else {
            this.f75153S.setMaskFilter(null);
        }
        this.f75153S.setFilterBitmap(true);
        this.f75154Z.drawBitmap(this.f75157o, Math.round(ml.J2() * f3), Math.round(ml.Uo() * f4), this.f75153S);
        canvas.drawBitmap(this.f75158r, this.xMQ, this.J2, this.gh);
    }

    private RectF rl(RectF rectF, Ml ml) {
        if (this.f75152O == null) {
            this.f75152O = new RectF();
        }
        if (this.Uo == null) {
            this.Uo = new RectF();
        }
        this.f75152O.set(rectF);
        this.f75152O.offsetTo(rectF.left + ml.J2(), rectF.top + ml.Uo());
        this.f75152O.inset(-ml.KN(), -ml.KN());
        this.Uo.set(rectF);
        this.f75152O.union(this.Uo);
        return this.f75152O;
    }

    public void O() {
        if (this.f75156n == null || this.rl == null || this.Ik == null || this.nr == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f75159t.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f75156n.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.ViF == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f75156n.save();
                Canvas canvas = this.f75156n;
                float[] fArr = this.Ik;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.ViF.endRecording();
                if (this.rl.t()) {
                    KN(this.f75156n, this.rl.nr);
                }
                this.f75156n.drawRenderNode(this.ViF);
                this.f75156n.restore();
            }
        } else {
            if (this.qie == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.rl.t()) {
                Uo(this.f75156n, this.rl.nr);
            }
            if (this.ty == null) {
                this.ty = new Rect();
            }
            this.ty.set(0, 0, (int) (this.nr.width() * this.Ik[0]), (int) (this.nr.height() * this.Ik[4]));
            this.f75156n.drawBitmap(this.qie, this.ty, this.nr, this.gh);
        }
        this.f75156n = null;
    }

    public Canvas xMQ(Canvas canvas, RectF rectF, j jVar) {
        if (this.f75156n != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.Ik == null) {
            this.Ik = new float[9];
        }
        if (this.ck == null) {
            this.ck = new Matrix();
        }
        canvas.getMatrix(this.ck);
        this.ck.getValues(this.Ik);
        float[] fArr = this.Ik;
        float f3 = fArr[0];
        float f4 = fArr[4];
        if (this.mUb == null) {
            this.mUb = new RectF();
        }
        this.mUb.set(rectF.left * f3, rectF.top * f4, rectF.right * f3, rectF.bottom * f4);
        this.f75156n = canvas;
        this.rl = jVar;
        this.f75159t = t(canvas, jVar);
        if (this.nr == null) {
            this.nr = new RectF();
        }
        this.nr.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.gh == null) {
            this.gh = new H.j();
        }
        this.gh.reset();
        int iOrdinal = this.f75159t.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.gh.setAlpha(jVar.f75160n);
            this.gh.setColorFilter(jVar.f75161t);
            if (jVar.n()) {
                PaintCompat.rl(this.gh, jVar.rl);
            }
            eO.ty(canvas, rectF, this.gh);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.HI == null) {
                H.j jVar2 = new H.j();
                this.HI = jVar2;
                jVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (J2(this.qie, this.mUb)) {
                Bitmap bitmap = this.qie;
                if (bitmap != null) {
                    nr(bitmap);
                }
                this.qie = n(this.mUb, Bitmap.Config.ARGB_8888);
                this.az = new Canvas(this.qie);
            } else {
                Canvas canvas2 = this.az;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(te);
                this.az.drawRect(-1.0f, -1.0f, this.mUb.width() + 1.0f, this.mUb.height() + 1.0f, this.HI);
            }
            PaintCompat.rl(this.gh, jVar.rl);
            this.gh.setColorFilter(jVar.f75161t);
            this.gh.setAlpha(jVar.f75160n);
            Canvas canvas3 = this.az;
            canvas3.scale(f3, f4);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.ViF == null) {
            this.ViF = androidx.compose.foundation.aC.n("OffscreenLayer.main");
        }
        if (jVar.t() && this.nY == null) {
            this.nY = androidx.compose.foundation.aC.n("OffscreenLayer.shadow");
            this.f75155g = null;
        }
        if (jVar.n() || jVar.rl()) {
            if (this.gh == null) {
                this.gh = new H.j();
            }
            this.gh.reset();
            PaintCompat.rl(this.gh, jVar.rl);
            this.gh.setColorFilter(jVar.f75161t);
            this.ViF.setUseCompositingLayer(true, this.gh);
            if (jVar.t()) {
                RenderNode renderNode = this.nY;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.gh);
            }
        }
        this.ViF.setAlpha(jVar.f75160n / 255.0f);
        if (jVar.t()) {
            RenderNode renderNode2 = this.nY;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(jVar.f75160n / 255.0f);
        }
        this.ViF.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.ViF;
        RectF rectF2 = this.mUb;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.ViF.beginRecording((int) this.mUb.width(), (int) this.mUb.height());
        recordingCanvasBeginRecording.setMatrix(te);
        recordingCanvasBeginRecording.scale(f3, f4);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }

    private Bitmap n(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap((int) Math.ceil(((double) rectF.width()) * 1.05d), (int) Math.ceil(((double) rectF.height()) * 1.05d), config);
    }

    private void nr(Bitmap bitmap) {
        bitmap.recycle();
    }

    private n t(Canvas canvas, j jVar) {
        if (jVar.nr()) {
            return n.DIRECT;
        }
        if (!jVar.t()) {
            return n.SAVE_LAYER;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && canvas.isHardwareAccelerated()) {
            if (i2 <= 31) {
                return n.BITMAP;
            }
            return n.RENDER_NODE;
        }
        return n.BITMAP;
    }
}
