package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.Motion;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 \u0087\u00012\u00020\u0001:\u0002\u0088\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010#JG\u0010'\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010(R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010*\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R$\u0010@\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010I\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\"\u0010L\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER\"\u0010P\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010A\u001a\u0004\bN\u0010C\"\u0004\bO\u0010ER\"\u0010T\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010C\"\u0004\bS\u0010ER\u0014\u0010V\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010*R\u001a\u0010[\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010^\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\\\u0010X\u001a\u0004\b]\u0010ZR\u001a\u0010a\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\b`\u0010ZR\u001a\u0010d\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bb\u0010X\u001a\u0004\bc\u0010ZR\u001a\u0010g\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\be\u0010X\u001a\u0004\bf\u0010ZR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010t\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010X\u001a\u0004\bq\u0010Z\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R&\u0010\u0083\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R%\u0010\u0086\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b~\u0010X\u001a\u0005\b\u0084\u0001\u0010Z\"\u0005\b\u0085\u0001\u0010s¨\u0006\u0089\u0001"}, d2 = {"Landroidx/constraintlayout/compose/MotionRenderDebug;", "", "", "textSize", "<init>", "(F)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/constraintlayout/core/motion/Motion;", "motionController", "", "duration", "layoutWidth", "layoutHeight", "", "drawPath", "drawTicks", "", c.f62177j, "(Landroid/graphics/Canvas;Landroidx/constraintlayout/core/motion/Motion;IIIZZ)V", "", "text", "Landroid/graphics/Paint;", "paint", "Uo", "(Ljava/lang/String;Landroid/graphics/Paint;)V", "rl", "(Landroid/graphics/Canvas;)V", "mode", "keyFrames", "J2", "(Landroid/graphics/Canvas;IILandroidx/constraintlayout/core/motion/Motion;II)V", "x", "y", "nr", "(Landroid/graphics/Canvas;FF)V", "t", "viewWidth", "viewHeight", "O", "(Landroid/graphics/Canvas;FFIIII)V", "", "[F", "getMPoints", "()[F", "setMPoints", "([F)V", "mPoints", "", "[I", "getMPathMode", "()[I", "setMPathMode", "([I)V", "mPathMode", "getMKeyFramePoints", "setMKeyFramePoints", "mKeyFramePoints", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "getMPath", "()Landroid/graphics/Path;", "setMPath", "(Landroid/graphics/Path;)V", "mPath", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "setMPaint", "(Landroid/graphics/Paint;)V", "mPaint", "getMPaintKeyframes", "setMPaintKeyframes", "mPaintKeyframes", "getMPaintGraph", "setMPaintGraph", "mPaintGraph", "KN", "getMTextPaint", "setMTextPaint", "mTextPaint", "xMQ", "getMFillPaint", "setMFillPaint", "mFillPaint", "mUb", "mRectangle", "gh", "I", "getMRedColor", "()I", "mRedColor", "qie", "getMKeyframeColor", "mKeyframeColor", "az", "getMGraphColor", "mGraphColor", "ty", "getMShadowColor", "mShadowColor", "HI", "getMDiamondSize", "mDiamondSize", "Landroid/graphics/DashPathEffect;", "ck", "Landroid/graphics/DashPathEffect;", "getMDashPathEffect", "()Landroid/graphics/DashPathEffect;", "setMDashPathEffect", "(Landroid/graphics/DashPathEffect;)V", "mDashPathEffect", "Ik", "getMKeyFrameCount", "setMKeyFrameCount", "(I)V", "mKeyFrameCount", "Landroid/graphics/Rect;", "r", "Landroid/graphics/Rect;", "getMBounds", "()Landroid/graphics/Rect;", "setMBounds", "(Landroid/graphics/Rect;)V", "mBounds", "o", "Z", "getMPresentationMode", "()Z", "setMPresentationMode", "(Z)V", "mPresentationMode", "getMShadowTranslate", "setMShadowTranslate", "mShadowTranslate", "XQ", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MotionRenderDebug {

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private int mKeyFrameCount;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Paint mPaintKeyframes;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Paint mTextPaint;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Paint mPaint;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private Paint mPaintGraph;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private int mShadowTranslate;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private DashPathEffect mDashPathEffect;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final float[] mRectangle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float[] mPoints;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Path mPath;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean mPresentationMode;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int[] mPathMode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float[] mKeyFramePoints;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Paint mFillPaint;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f34812S = 8;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final int mRedColor = -21965;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final int mKeyframeColor = -2067046;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final int mGraphColor = -13391360;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final int mShadowColor = 1996488704;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final int mDiamondSize = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Rect mBounds = new Rect();

    private final void J2(Canvas canvas, int mode, int keyFrames, Motion motionController, int layoutWidth, int layoutHeight) {
        int iTe;
        int iGh;
        if (motionController.r() != null) {
            iTe = motionController.r().te();
            iGh = motionController.r().gh();
        } else {
            iTe = 0;
            iGh = 0;
        }
        int i2 = keyFrames - 1;
        for (int i3 = 1; i3 < i2; i3++) {
            if (mode != 4 || this.mPathMode[i3 - 1] != 0) {
                float[] fArr = this.mKeyFramePoints;
                int i5 = i3 * 2;
                float f3 = fArr[i5];
                float f4 = fArr[i5 + 1];
                Path path = this.mPath;
                Intrinsics.checkNotNull(path);
                path.reset();
                Path path2 = this.mPath;
                Intrinsics.checkNotNull(path2);
                path2.moveTo(f3, this.mDiamondSize + f4);
                Path path3 = this.mPath;
                Intrinsics.checkNotNull(path3);
                path3.lineTo(this.mDiamondSize + f3, f4);
                Path path4 = this.mPath;
                Intrinsics.checkNotNull(path4);
                path4.lineTo(f3, f4 - this.mDiamondSize);
                Path path5 = this.mPath;
                Intrinsics.checkNotNull(path5);
                path5.lineTo(f3 - this.mDiamondSize, f4);
                Path path6 = this.mPath;
                Intrinsics.checkNotNull(path6);
                path6.close();
                if (mode == 4) {
                    int i7 = this.mPathMode[i3 - 1];
                    if (i7 == 1) {
                        nr(canvas, f3 - 0.0f, f4 - 0.0f);
                    } else if (i7 == 0) {
                        t(canvas, f3 - 0.0f, f4 - 0.0f);
                    } else if (i7 == 2) {
                        O(canvas, f3 - 0.0f, f4 - 0.0f, iTe, iGh, layoutWidth, layoutHeight);
                    }
                    Path path7 = this.mPath;
                    Intrinsics.checkNotNull(path7);
                    canvas.drawPath(path7, this.mFillPaint);
                }
                if (mode == 2) {
                    nr(canvas, f3 - 0.0f, f4 - 0.0f);
                }
                if (mode == 3) {
                    t(canvas, f3 - 0.0f, f4 - 0.0f);
                }
                if (mode == 6) {
                    O(canvas, f3 - 0.0f, f4 - 0.0f, iTe, iGh, layoutWidth, layoutHeight);
                }
                Path path8 = this.mPath;
                Intrinsics.checkNotNull(path8);
                canvas.drawPath(path8, this.mFillPaint);
            }
        }
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        if (fArr2.length > 1) {
            float[] fArr3 = this.mPoints;
            Intrinsics.checkNotNull(fArr3);
            float f5 = fArr3[0];
            float[] fArr4 = this.mPoints;
            Intrinsics.checkNotNull(fArr4);
            canvas.drawCircle(f5, fArr4[1], 8.0f, this.mPaintKeyframes);
            float[] fArr5 = this.mPoints;
            Intrinsics.checkNotNull(fArr5);
            float[] fArr6 = this.mPoints;
            Intrinsics.checkNotNull(fArr6);
            float f6 = fArr5[fArr6.length - 2];
            float[] fArr7 = this.mPoints;
            Intrinsics.checkNotNull(fArr7);
            float[] fArr8 = this.mPoints;
            Intrinsics.checkNotNull(fArr8);
            canvas.drawCircle(f6, fArr7[fArr8.length - 1], 8.0f, this.mPaintKeyframes);
        }
    }

    private final void O(Canvas canvas, float x2, float y2, int viewWidth, int viewHeight, int layoutWidth, int layoutHeight) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        float f3 = 100;
        sb.append(((int) (((double) (((x2 - (viewWidth / 2)) * f3) / (layoutWidth - viewWidth))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        Uo(string, this.mTextPaint);
        float f4 = 2;
        canvas.drawText(string, ((x2 / f4) - (this.mBounds.width() / 2)) + 0.0f, y2 - 20, this.mTextPaint);
        canvas.drawLine(x2, y2, Math.min(0.0f, 1.0f), y2, this.mPaintGraph);
        String str = "" + (((int) (((double) ((f3 * (y2 - (viewHeight / 2))) / (layoutHeight - viewHeight))) + 0.5d)) / 100.0f);
        Uo(str, this.mTextPaint);
        canvas.drawText(str, x2 + 5, 0.0f - ((y2 / f4) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x2, y2, x2, Math.max(0.0f, 1.0f), this.mPaintGraph);
    }

    private final void nr(Canvas canvas, float x2, float y2) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        float f3 = fArr[0];
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        float f4 = fArr2[1];
        float[] fArr3 = this.mPoints;
        Intrinsics.checkNotNull(fArr3);
        float[] fArr4 = this.mPoints;
        Intrinsics.checkNotNull(fArr4);
        float f5 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.mPoints;
        Intrinsics.checkNotNull(fArr5);
        float[] fArr6 = this.mPoints;
        Intrinsics.checkNotNull(fArr6);
        float f6 = fArr5[fArr6.length - 1];
        float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((x2 - f3) * f7) + ((y2 - f4) * f8)) / (fHypot * fHypot);
        float f10 = f3 + (f7 * f9);
        float f11 = f4 + (f9 * f8);
        Path path = new Path();
        path.moveTo(x2, y2);
        path.lineTo(f10, f11);
        float fHypot2 = (float) Math.hypot(f10 - x2, f11 - y2);
        String str = "" + (((int) ((100 * fHypot2) / fHypot)) / 100.0f);
        Uo(str, this.mTextPaint);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
        canvas.drawLine(x2, y2, f10, f11, this.mPaintGraph);
    }

    private final void rl(Canvas canvas) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        canvas.drawLines(fArr, this.mPaint);
    }

    private final void t(Canvas canvas, float x2, float y2) {
        float[] fArr = this.mPoints;
        Intrinsics.checkNotNull(fArr);
        float f3 = fArr[0];
        float[] fArr2 = this.mPoints;
        Intrinsics.checkNotNull(fArr2);
        float f4 = fArr2[1];
        float[] fArr3 = this.mPoints;
        Intrinsics.checkNotNull(fArr3);
        float[] fArr4 = this.mPoints;
        Intrinsics.checkNotNull(fArr4);
        float f5 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.mPoints;
        Intrinsics.checkNotNull(fArr5);
        float[] fArr6 = this.mPoints;
        Intrinsics.checkNotNull(fArr6);
        float f6 = fArr5[fArr6.length - 1];
        float fMin = Math.min(f3, f5);
        float fMax = Math.max(f4, f6);
        float fMin2 = x2 - Math.min(f3, f5);
        float fMax2 = Math.max(f4, f6) - y2;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        float f7 = 100;
        sb.append(((int) (((double) ((f7 * fMin2) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        Uo(string, this.mTextPaint);
        float f8 = 2;
        canvas.drawText(string, ((fMin2 / f8) - (this.mBounds.width() / 2)) + fMin, y2 - 20, this.mTextPaint);
        canvas.drawLine(x2, y2, Math.min(f3, f5), y2, this.mPaintGraph);
        String str = "" + (((int) (((double) ((f7 * fMax2) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
        Uo(str, this.mTextPaint);
        canvas.drawText(str, x2 + 5, fMax - ((fMax2 / f8) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x2, y2, x2, Math.max(f4, f6), this.mPaintGraph);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Canvas canvas, Motion motionController, int duration, int layoutWidth, int layoutHeight, boolean drawPath, boolean drawTicks) {
        MotionRenderDebug motionRenderDebug;
        Canvas canvas2;
        Motion motion;
        int i2;
        int i3;
        this.mKeyFrameCount = motionController.Uo(this.mKeyFramePoints, this.mPathMode, null);
        int i5 = duration / 16;
        float[] fArr = this.mPoints;
        if (fArr != null) {
            Intrinsics.checkNotNull(fArr);
            if (fArr.length != i5 * 2) {
                this.mPoints = new float[i5 * 2];
                this.mPath = new Path();
            }
        }
        int i7 = this.mShadowTranslate;
        canvas.translate(i7, i7);
        this.mPaint.setColor(this.mShadowColor);
        this.mFillPaint.setColor(this.mShadowColor);
        this.mPaintKeyframes.setColor(this.mShadowColor);
        this.mPaintGraph.setColor(this.mShadowColor);
        motionController.KN(this.mPoints, i5);
        if (drawPath) {
            rl(canvas);
        }
        if (drawTicks) {
            motionRenderDebug = this;
            canvas2 = canvas;
            motion = motionController;
            i2 = layoutWidth;
            i3 = layoutHeight;
            motionRenderDebug.J2(canvas2, 1, this.mKeyFrameCount, motion, i2, i3);
        } else {
            motionRenderDebug = this;
            canvas2 = canvas;
            motion = motionController;
            i2 = layoutWidth;
            i3 = layoutHeight;
        }
        motionRenderDebug.mPaint.setColor(motionRenderDebug.mRedColor);
        motionRenderDebug.mPaintKeyframes.setColor(motionRenderDebug.mKeyframeColor);
        motionRenderDebug.mFillPaint.setColor(motionRenderDebug.mKeyframeColor);
        motionRenderDebug.mPaintGraph.setColor(motionRenderDebug.mGraphColor);
        int i8 = motionRenderDebug.mShadowTranslate;
        canvas2.translate(-i8, -i8);
        if (drawPath) {
            rl(canvas2);
        }
        if (drawTicks) {
            motionRenderDebug.J2(canvas2, 1, motionRenderDebug.mKeyFrameCount, motion, i2, i3);
        }
    }

    public MotionRenderDebug(float f3) {
        this.mShadowTranslate = 1;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-21965);
        this.mPaint.setStrokeWidth(2.0f);
        Paint paint2 = this.mPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.mPaintKeyframes = paint3;
        paint3.setAntiAlias(true);
        this.mPaintKeyframes.setColor(-2067046);
        this.mPaintKeyframes.setStrokeWidth(2.0f);
        this.mPaintKeyframes.setStyle(style);
        Paint paint4 = new Paint();
        this.mPaintGraph = paint4;
        paint4.setAntiAlias(true);
        this.mPaintGraph.setColor(-13391360);
        this.mPaintGraph.setStrokeWidth(2.0f);
        this.mPaintGraph.setStyle(style);
        Paint paint5 = new Paint();
        this.mTextPaint = paint5;
        paint5.setAntiAlias(true);
        this.mTextPaint.setColor(-13391360);
        this.mTextPaint.setTextSize(f3);
        this.mRectangle = new float[8];
        Paint paint6 = new Paint();
        this.mFillPaint = paint6;
        paint6.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.mDashPathEffect = dashPathEffect;
        this.mPaintGraph.setPathEffect(dashPathEffect);
        this.mKeyFramePoints = new float[100];
        this.mPathMode = new int[50];
        if (this.mPresentationMode) {
            this.mPaint.setStrokeWidth(8.0f);
            this.mFillPaint.setStrokeWidth(8.0f);
            this.mPaintKeyframes.setStrokeWidth(8.0f);
            this.mShadowTranslate = 4;
        }
    }

    public final void Uo(String text, Paint paint) {
        paint.getTextBounds(text, 0, text.length(), this.mBounds);
    }
}
