package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import com.caoccao.javet.exceptions.JavetError;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final PorterDuff.Mode f42316e = PorterDuff.Mode.SRC_IN;
    private final Rect E2;
    private ColorFilter J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private PorterDuffColorFilter f42317O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final float[] f42318S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Drawable.ConstantState f42319Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f42320g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42321o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f42322r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private VectorDrawableCompatState f42323t;

    private static class VClipPath extends VPath {
        VClipPath() {
        }

        private void J2(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.rl = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f42328n = PathParser.nr(string2);
            }
            this.f42329t = TypedArrayUtils.gh(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean t() {
            return true;
        }

        VClipPath(VClipPath vClipPath) {
            super(vClipPath);
        }

        public void O(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (TypedArrayUtils.ck(xmlPullParser, "pathData")) {
                TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, AndroidResources.nr);
                J2(typedArrayIk, xmlPullParser);
                typedArrayIk.recycle();
            }
        }
    }

    private static class VFullPath extends VPath {
        Paint.Join HI;
        ComplexColorCompat J2;
        ComplexColorCompat KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int[] f42324O;
        float Uo;
        float az;
        float ck;
        float gh;
        float mUb;
        float qie;
        Paint.Cap ty;
        float xMQ;

        VFullPath() {
            this.Uo = 0.0f;
            this.xMQ = 1.0f;
            this.mUb = 1.0f;
            this.gh = 0.0f;
            this.qie = 1.0f;
            this.az = 0.0f;
            this.ty = Paint.Cap.BUTT;
            this.HI = Paint.Join.MITER;
            this.ck = 4.0f;
        }

        private void KN(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f42324O = null;
            if (TypedArrayUtils.ck(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.rl = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f42328n = PathParser.nr(string2);
                }
                this.KN = TypedArrayUtils.xMQ(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.mUb = TypedArrayUtils.mUb(typedArray, xmlPullParser, "fillAlpha", 12, this.mUb);
                this.ty = O(TypedArrayUtils.gh(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.ty);
                this.HI = J2(TypedArrayUtils.gh(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.HI);
                this.ck = TypedArrayUtils.mUb(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.ck);
                this.J2 = TypedArrayUtils.xMQ(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.xMQ = TypedArrayUtils.mUb(typedArray, xmlPullParser, "strokeAlpha", 11, this.xMQ);
                this.Uo = TypedArrayUtils.mUb(typedArray, xmlPullParser, "strokeWidth", 4, this.Uo);
                this.qie = TypedArrayUtils.mUb(typedArray, xmlPullParser, "trimPathEnd", 6, this.qie);
                this.az = TypedArrayUtils.mUb(typedArray, xmlPullParser, "trimPathOffset", 7, this.az);
                this.gh = TypedArrayUtils.mUb(typedArray, xmlPullParser, "trimPathStart", 5, this.gh);
                this.f42329t = TypedArrayUtils.gh(typedArray, xmlPullParser, "fillType", 13, this.f42329t);
            }
        }

        private Paint.Join J2(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private Paint.Cap O(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public void Uo(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, AndroidResources.f42297t);
            KN(typedArrayIk, xmlPullParser, theme);
            typedArrayIk.recycle();
        }

        float getFillAlpha() {
            return this.mUb;
        }

        @ColorInt
        int getFillColor() {
            return this.KN.O();
        }

        float getStrokeAlpha() {
            return this.xMQ;
        }

        @ColorInt
        int getStrokeColor() {
            return this.J2.O();
        }

        float getStrokeWidth() {
            return this.Uo;
        }

        float getTrimPathEnd() {
            return this.qie;
        }

        float getTrimPathOffset() {
            return this.az;
        }

        float getTrimPathStart() {
            return this.gh;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean n() {
            return this.KN.xMQ() || this.J2.xMQ();
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean rl(int[] iArr) {
            return this.J2.mUb(iArr) | this.KN.mUb(iArr);
        }

        void setFillAlpha(float f3) {
            this.mUb = f3;
        }

        void setFillColor(int i2) {
            this.KN.gh(i2);
        }

        void setStrokeAlpha(float f3) {
            this.xMQ = f3;
        }

        void setStrokeColor(int i2) {
            this.J2.gh(i2);
        }

        void setStrokeWidth(float f3) {
            this.Uo = f3;
        }

        void setTrimPathEnd(float f3) {
            this.qie = f3;
        }

        void setTrimPathOffset(float f3) {
            this.az = f3;
        }

        void setTrimPathStart(float f3) {
            this.gh = f3;
        }

        VFullPath(VFullPath vFullPath) {
            super(vFullPath);
            this.Uo = 0.0f;
            this.xMQ = 1.0f;
            this.mUb = 1.0f;
            this.gh = 0.0f;
            this.qie = 1.0f;
            this.az = 0.0f;
            this.ty = Paint.Cap.BUTT;
            this.HI = Paint.Join.MITER;
            this.ck = 4.0f;
            this.f42324O = vFullPath.f42324O;
            this.J2 = vFullPath.J2;
            this.Uo = vFullPath.Uo;
            this.xMQ = vFullPath.xMQ;
            this.KN = vFullPath.KN;
            this.f42329t = vFullPath.f42329t;
            this.mUb = vFullPath.mUb;
            this.gh = vFullPath.gh;
            this.qie = vFullPath.qie;
            this.az = vFullPath.az;
            this.ty = vFullPath.ty;
            this.HI = vFullPath.HI;
            this.ck = vFullPath.ck;
        }
    }

    private static class VGroup extends VObject {
        private float J2;
        private float KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private float f42325O;
        private float Uo;
        private String az;
        int gh;
        final Matrix mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Matrix f42326n;
        private float nr;
        private int[] qie;
        final ArrayList rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f42327t;
        private float xMQ;

        public VGroup(VGroup vGroup, ArrayMap arrayMap) {
            VPath vClipPath;
            super();
            this.f42326n = new Matrix();
            this.rl = new ArrayList();
            this.f42327t = 0.0f;
            this.nr = 0.0f;
            this.f42325O = 0.0f;
            this.J2 = 1.0f;
            this.Uo = 1.0f;
            this.KN = 0.0f;
            this.xMQ = 0.0f;
            Matrix matrix = new Matrix();
            this.mUb = matrix;
            this.az = null;
            this.f42327t = vGroup.f42327t;
            this.nr = vGroup.nr;
            this.f42325O = vGroup.f42325O;
            this.J2 = vGroup.J2;
            this.Uo = vGroup.Uo;
            this.KN = vGroup.KN;
            this.xMQ = vGroup.xMQ;
            this.qie = vGroup.qie;
            String str = vGroup.az;
            this.az = str;
            this.gh = vGroup.gh;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.mUb);
            ArrayList arrayList = vGroup.rl;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                if (obj instanceof VGroup) {
                    this.rl.add(new VGroup((VGroup) obj, arrayMap));
                } else {
                    if (obj instanceof VFullPath) {
                        vClipPath = new VFullPath((VFullPath) obj);
                    } else {
                        if (!(obj instanceof VClipPath)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        vClipPath = new VClipPath((VClipPath) obj);
                    }
                    this.rl.add(vClipPath);
                    Object obj2 = vClipPath.rl;
                    if (obj2 != null) {
                        arrayMap.put(obj2, vClipPath);
                    }
                }
            }
        }

        private void O(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.qie = null;
            this.f42327t = TypedArrayUtils.mUb(typedArray, xmlPullParser, "rotation", 5, this.f42327t);
            this.nr = typedArray.getFloat(1, this.nr);
            this.f42325O = typedArray.getFloat(2, this.f42325O);
            this.J2 = TypedArrayUtils.mUb(typedArray, xmlPullParser, "scaleX", 3, this.J2);
            this.Uo = TypedArrayUtils.mUb(typedArray, xmlPullParser, "scaleY", 4, this.Uo);
            this.KN = TypedArrayUtils.mUb(typedArray, xmlPullParser, "translateX", 6, this.KN);
            this.xMQ = TypedArrayUtils.mUb(typedArray, xmlPullParser, "translateY", 7, this.xMQ);
            String string = typedArray.getString(0);
            if (string != null) {
                this.az = string;
            }
            nr();
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean n() {
            for (int i2 = 0; i2 < this.rl.size(); i2++) {
                if (((VObject) this.rl.get(i2)).n()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean rl(int[] iArr) {
            boolean zRl = false;
            for (int i2 = 0; i2 < this.rl.size(); i2++) {
                zRl |= ((VObject) this.rl.get(i2)).rl(iArr);
            }
            return zRl;
        }

        private void nr() {
            this.mUb.reset();
            this.mUb.postTranslate(-this.nr, -this.f42325O);
            this.mUb.postScale(this.J2, this.Uo);
            this.mUb.postRotate(this.f42327t, 0.0f, 0.0f);
            this.mUb.postTranslate(this.KN + this.nr, this.xMQ + this.f42325O);
        }

        public String getGroupName() {
            return this.az;
        }

        public Matrix getLocalMatrix() {
            return this.mUb;
        }

        public float getPivotX() {
            return this.nr;
        }

        public float getPivotY() {
            return this.f42325O;
        }

        public float getRotation() {
            return this.f42327t;
        }

        public float getScaleX() {
            return this.J2;
        }

        public float getScaleY() {
            return this.Uo;
        }

        public float getTranslateX() {
            return this.KN;
        }

        public float getTranslateY() {
            return this.xMQ;
        }

        public void setPivotX(float f3) {
            if (f3 != this.nr) {
                this.nr = f3;
                nr();
            }
        }

        public void setPivotY(float f3) {
            if (f3 != this.f42325O) {
                this.f42325O = f3;
                nr();
            }
        }

        public void setRotation(float f3) {
            if (f3 != this.f42327t) {
                this.f42327t = f3;
                nr();
            }
        }

        public void setScaleX(float f3) {
            if (f3 != this.J2) {
                this.J2 = f3;
                nr();
            }
        }

        public void setScaleY(float f3) {
            if (f3 != this.Uo) {
                this.Uo = f3;
                nr();
            }
        }

        public void setTranslateX(float f3) {
            if (f3 != this.KN) {
                this.KN = f3;
                nr();
            }
        }

        public void setTranslateY(float f3) {
            if (f3 != this.xMQ) {
                this.xMQ = f3;
                nr();
            }
        }

        public void t(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, AndroidResources.rl);
            O(typedArrayIk, xmlPullParser);
            typedArrayIk.recycle();
        }

        public VGroup() {
            super();
            this.f42326n = new Matrix();
            this.rl = new ArrayList();
            this.f42327t = 0.0f;
            this.nr = 0.0f;
            this.f42325O = 0.0f;
            this.J2 = 1.0f;
            this.Uo = 1.0f;
            this.KN = 0.0f;
            this.xMQ = 0.0f;
            this.mUb = new Matrix();
            this.az = null;
        }
    }

    private static abstract class VObject {
        private VObject() {
        }

        public boolean n() {
            return false;
        }

        public boolean rl(int[] iArr) {
            return false;
        }
    }

    private static abstract class VPath extends VObject {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected PathParser.PathDataNode[] f42328n;
        int nr;
        String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f42329t;

        public VPath() {
            super();
            this.f42328n = null;
            this.f42329t = 0;
        }

        public boolean t() {
            return false;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f42328n;
        }

        public String getPathName() {
            return this.rl;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (PathParser.rl(this.f42328n, pathDataNodeArr)) {
                PathParser.gh(this.f42328n, pathDataNodeArr);
            } else {
                this.f42328n = PathParser.J2(pathDataNodeArr);
            }
        }

        public void nr(Path path) {
            path.reset();
            PathParser.PathDataNode[] pathDataNodeArr = this.f42328n;
            if (pathDataNodeArr != null) {
                PathParser.PathDataNode.xMQ(pathDataNodeArr, path);
            }
        }

        public VPath(VPath vPath) {
            super();
            this.f42328n = null;
            this.f42329t = 0;
            this.rl = vPath.rl;
            this.nr = vPath.nr;
            this.f42328n = PathParser.J2(vPath.f42328n);
        }
    }

    private static class VPathRenderer {
        private static final Matrix Ik = new Matrix();
        Boolean HI;
        private PathMeasure J2;
        final VGroup KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Paint f42330O;
        private int Uo;
        int az;
        final ArrayMap ck;
        float gh;
        float mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Path f42331n;
        Paint nr;
        float qie;
        private final Path rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Matrix f42332t;
        String ty;
        float xMQ;

        public VPathRenderer() {
            this.f42332t = new Matrix();
            this.xMQ = 0.0f;
            this.mUb = 0.0f;
            this.gh = 0.0f;
            this.qie = 0.0f;
            this.az = 255;
            this.ty = null;
            this.HI = null;
            this.ck = new ArrayMap();
            this.KN = new VGroup();
            this.f42331n = new Path();
            this.rl = new Path();
        }

        private float O(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fN = n(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fN) / fMax;
            }
            return 0.0f;
        }

        private static float n(float f3, float f4, float f5, float f6) {
            return (f3 * f6) - (f4 * f5);
        }

        private void nr(VGroup vGroup, VPath vPath, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f3 = i2 / this.gh;
            float f4 = i3 / this.qie;
            float fMin = Math.min(f3, f4);
            Matrix matrix = vGroup.f42326n;
            this.f42332t.set(matrix);
            this.f42332t.postScale(f3, f4);
            float fO = O(matrix);
            if (fO == 0.0f) {
                return;
            }
            vPath.nr(this.f42331n);
            Path path = this.f42331n;
            this.rl.reset();
            if (vPath.t()) {
                this.rl.setFillType(vPath.f42329t == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.rl.addPath(path, this.f42332t);
                canvas.clipPath(this.rl);
                return;
            }
            VFullPath vFullPath = (VFullPath) vPath;
            float f5 = vFullPath.gh;
            if (f5 != 0.0f || vFullPath.qie != 1.0f) {
                float f6 = vFullPath.az;
                float f7 = (f5 + f6) % 1.0f;
                float f8 = (vFullPath.qie + f6) % 1.0f;
                if (this.J2 == null) {
                    this.J2 = new PathMeasure();
                }
                this.J2.setPath(this.f42331n, false);
                float length = this.J2.getLength();
                float f9 = f7 * length;
                float f10 = f8 * length;
                path.reset();
                if (f9 > f10) {
                    this.J2.getSegment(f9, length, path, true);
                    this.J2.getSegment(0.0f, f10, path, true);
                } else {
                    this.J2.getSegment(f9, f10, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.rl.addPath(path, this.f42332t);
            if (vFullPath.KN.qie()) {
                ComplexColorCompat complexColorCompat = vFullPath.KN;
                if (this.f42330O == null) {
                    Paint paint = new Paint(1);
                    this.f42330O = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f42330O;
                if (complexColorCompat.KN()) {
                    Shader shaderJ2 = complexColorCompat.J2();
                    shaderJ2.setLocalMatrix(this.f42332t);
                    paint2.setShader(shaderJ2);
                    paint2.setAlpha(Math.round(vFullPath.mUb * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(VectorDrawableCompat.n(complexColorCompat.O(), vFullPath.mUb));
                }
                paint2.setColorFilter(colorFilter);
                this.rl.setFillType(vFullPath.f42329t == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.rl, paint2);
            }
            if (vFullPath.J2.qie()) {
                ComplexColorCompat complexColorCompat2 = vFullPath.J2;
                if (this.nr == null) {
                    Paint paint3 = new Paint(1);
                    this.nr = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.nr;
                Paint.Join join = vFullPath.HI;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = vFullPath.ty;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(vFullPath.ck);
                if (complexColorCompat2.KN()) {
                    Shader shaderJ22 = complexColorCompat2.J2();
                    shaderJ22.setLocalMatrix(this.f42332t);
                    paint4.setShader(shaderJ22);
                    paint4.setAlpha(Math.round(vFullPath.xMQ * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(VectorDrawableCompat.n(complexColorCompat2.O(), vFullPath.xMQ));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(vFullPath.Uo * fMin * fO);
                canvas.drawPath(this.rl, paint4);
            }
        }

        private void t(VGroup vGroup, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            VGroup vGroup2 = vGroup;
            vGroup2.f42326n.set(matrix);
            vGroup2.f42326n.preConcat(vGroup2.mUb);
            canvas.save();
            int i5 = 0;
            while (i5 < vGroup2.rl.size()) {
                VObject vObject = (VObject) vGroup2.rl.get(i5);
                if (vObject instanceof VGroup) {
                    t((VGroup) vObject, vGroup2.f42326n, canvas, i2, i3, colorFilter);
                } else if (vObject instanceof VPath) {
                    nr(vGroup2, (VPath) vObject, canvas, i2, i3, colorFilter);
                }
                i5++;
                vGroup2 = vGroup;
            }
            canvas.restore();
        }

        public boolean J2() {
            if (this.HI == null) {
                this.HI = Boolean.valueOf(this.KN.n());
            }
            return this.HI.booleanValue();
        }

        public boolean Uo(int[] iArr) {
            return this.KN.rl(iArr);
        }

        public int getRootAlpha() {
            return this.az;
        }

        public void rl(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            t(this.KN, Ik, canvas, i2, i3, colorFilter);
        }

        public void setAlpha(float f3) {
            setRootAlpha((int) (f3 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.az = i2;
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public VPathRenderer(VPathRenderer vPathRenderer) {
            this.f42332t = new Matrix();
            this.xMQ = 0.0f;
            this.mUb = 0.0f;
            this.gh = 0.0f;
            this.qie = 0.0f;
            this.az = 255;
            this.ty = null;
            this.HI = null;
            ArrayMap arrayMap = new ArrayMap();
            this.ck = arrayMap;
            this.KN = new VGroup(vPathRenderer.KN, arrayMap);
            this.f42331n = new Path(vPathRenderer.f42331n);
            this.rl = new Path(vPathRenderer.rl);
            this.xMQ = vPathRenderer.xMQ;
            this.mUb = vPathRenderer.mUb;
            this.gh = vPathRenderer.gh;
            this.qie = vPathRenderer.qie;
            this.Uo = vPathRenderer.Uo;
            this.az = vPathRenderer.az;
            this.ty = vPathRenderer.ty;
            String str = vPathRenderer.ty;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.HI = vPathRenderer.HI;
        }
    }

    private static class VectorDrawableCompatState extends Drawable.ConstantState {
        Bitmap J2;
        PorterDuff.Mode KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f42333O;
        ColorStateList Uo;
        boolean gh;
        boolean mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f42334n;
        PorterDuff.Mode nr;
        Paint qie;
        VPathRenderer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        ColorStateList f42335t;
        int xMQ;

        public VectorDrawableCompatState(VectorDrawableCompatState vectorDrawableCompatState) {
            this.f42335t = null;
            this.nr = VectorDrawableCompat.f42316e;
            if (vectorDrawableCompatState != null) {
                this.f42334n = vectorDrawableCompatState.f42334n;
                VPathRenderer vPathRenderer = new VPathRenderer(vectorDrawableCompatState.rl);
                this.rl = vPathRenderer;
                if (vectorDrawableCompatState.rl.f42330O != null) {
                    vPathRenderer.f42330O = new Paint(vectorDrawableCompatState.rl.f42330O);
                }
                if (vectorDrawableCompatState.rl.nr != null) {
                    this.rl.nr = new Paint(vectorDrawableCompatState.rl.nr);
                }
                this.f42335t = vectorDrawableCompatState.f42335t;
                this.nr = vectorDrawableCompatState.nr;
                this.f42333O = vectorDrawableCompatState.f42333O;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        public boolean J2() {
            return this.rl.getRootAlpha() < 255;
        }

        public boolean KN(int[] iArr) {
            boolean zUo = this.rl.Uo(iArr);
            this.gh |= zUo;
            return zUo;
        }

        public boolean Uo() {
            return this.rl.J2();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f42334n;
        }

        public void mUb(int i2, int i3) {
            this.J2.eraseColor(0);
            this.rl.rl(new Canvas(this.J2), i2, i3, null);
        }

        public boolean n(int i2, int i3) {
            return i2 == this.J2.getWidth() && i3 == this.J2.getHeight();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        public boolean rl() {
            return !this.gh && this.Uo == this.f42335t && this.KN == this.nr && this.mUb == this.f42333O && this.xMQ == this.rl.getRootAlpha();
        }

        public void t(int i2, int i3) {
            if (this.J2 == null || !n(i2, i3)) {
                this.J2 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.gh = true;
            }
        }

        public void xMQ() {
            this.Uo = this.f42335t;
            this.KN = this.nr;
            this.xMQ = this.rl.getRootAlpha();
            this.mUb = this.f42333O;
            this.gh = false;
        }

        public Paint O(ColorFilter colorFilter) {
            if (!J2() && colorFilter == null) {
                return null;
            }
            if (this.qie == null) {
                Paint paint = new Paint();
                this.qie = paint;
                paint.setFilterBitmap(true);
            }
            this.qie.setAlpha(this.rl.getRootAlpha());
            this.qie.setColorFilter(colorFilter);
            return this.qie;
        }

        public void nr(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.J2, (Rect) null, rect, O(colorFilter));
        }

        public VectorDrawableCompatState() {
            this.f42335t = null;
            this.nr = VectorDrawableCompat.f42316e;
            this.rl = new VPathRenderer();
        }
    }

    @RequiresApi
    private static class VectorDrawableDelegateState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Drawable.ConstantState f42336n;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f42315n = (VectorDrawable) this.f42336n.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f42336n.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f42336n.getChangingConfigurations();
        }

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f42336n = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f42315n = (VectorDrawable) this.f42336n.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f42315n = (VectorDrawable) this.f42336n.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    VectorDrawableCompat() {
        this.f42321o = true;
        this.f42318S = new float[9];
        this.f42320g = new Matrix();
        this.E2 = new Rect();
        this.f42323t = new VectorDrawableCompatState();
    }

    private static PorterDuff.Mode Uo(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    private void O(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompatState vectorDrawableCompatState = this.f42323t;
        VPathRenderer vPathRenderer = vectorDrawableCompatState.rl;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(vPathRenderer.KN);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                VGroup vGroup = (VGroup) arrayDeque.peek();
                if (JavetError.PARAMETER_PATH.equals(name)) {
                    VFullPath vFullPath = new VFullPath();
                    vFullPath.Uo(resources, attributeSet, theme, xmlPullParser);
                    vGroup.rl.add(vFullPath);
                    if (vFullPath.getPathName() != null) {
                        vPathRenderer.ck.put(vFullPath.getPathName(), vFullPath);
                    }
                    vectorDrawableCompatState.f42334n = vFullPath.nr | vectorDrawableCompatState.f42334n;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    VClipPath vClipPath = new VClipPath();
                    vClipPath.O(resources, attributeSet, theme, xmlPullParser);
                    vGroup.rl.add(vClipPath);
                    if (vClipPath.getPathName() != null) {
                        vPathRenderer.ck.put(vClipPath.getPathName(), vClipPath);
                    }
                    vectorDrawableCompatState.f42334n = vClipPath.nr | vectorDrawableCompatState.f42334n;
                } else if ("group".equals(name)) {
                    VGroup vGroup2 = new VGroup();
                    vGroup2.t(resources, attributeSet, theme, xmlPullParser);
                    vGroup.rl.add(vGroup2);
                    arrayDeque.push(vGroup2);
                    if (vGroup2.getGroupName() != null) {
                        vPathRenderer.ck.put(vGroup2.getGroupName(), vGroup2);
                    }
                    vectorDrawableCompatState.f42334n = vGroup2.gh | vectorDrawableCompatState.f42334n;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public static VectorDrawableCompat rl(Resources resources, int i2, Resources.Theme theme) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.f42315n = ResourcesCompat.J2(resources, i2, theme);
        vectorDrawableCompat.f42319Z = new VectorDrawableDelegateState(vectorDrawableCompat.f42315n.getConstantState());
        return vectorDrawableCompat;
    }

    public static VectorDrawableCompat t(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    private void xMQ(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        VectorDrawableCompatState vectorDrawableCompatState = this.f42323t;
        VPathRenderer vPathRenderer = vectorDrawableCompatState.rl;
        vectorDrawableCompatState.nr = Uo(TypedArrayUtils.gh(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListUo = TypedArrayUtils.Uo(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListUo != null) {
            vectorDrawableCompatState.f42335t = colorStateListUo;
        }
        vectorDrawableCompatState.f42333O = TypedArrayUtils.O(typedArray, xmlPullParser, "autoMirrored", 5, vectorDrawableCompatState.f42333O);
        vPathRenderer.gh = TypedArrayUtils.mUb(typedArray, xmlPullParser, "viewportWidth", 7, vPathRenderer.gh);
        float fMUb = TypedArrayUtils.mUb(typedArray, xmlPullParser, "viewportHeight", 8, vPathRenderer.qie);
        vPathRenderer.qie = fMUb;
        if (vPathRenderer.gh <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fMUb <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        vPathRenderer.xMQ = typedArray.getDimension(3, vPathRenderer.xMQ);
        float dimension = typedArray.getDimension(2, vPathRenderer.mUb);
        vPathRenderer.mUb = dimension;
        if (vPathRenderer.xMQ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        vPathRenderer.setAlpha(TypedArrayUtils.mUb(typedArray, xmlPullParser, "alpha", 4, vPathRenderer.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            vPathRenderer.ty = string;
            vPathRenderer.ck.put(string, vPathRenderer);
        }
    }

    void KN(boolean z2) {
        this.f42321o = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f42315n;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.rl(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.E2);
        if (this.E2.width() <= 0 || this.E2.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.J2;
        if (colorFilter == null) {
            colorFilter = this.f42317O;
        }
        canvas.getMatrix(this.f42320g);
        this.f42320g.getValues(this.f42318S);
        float fAbs = Math.abs(this.f42318S[0]);
        float fAbs2 = Math.abs(this.f42318S[4]);
        float fAbs3 = Math.abs(this.f42318S[1]);
        float fAbs4 = Math.abs(this.f42318S[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.E2.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.E2.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.E2;
        canvas.translate(rect.left, rect.top);
        if (J2()) {
            canvas.translate(this.E2.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.E2.offsetTo(0, 0);
        this.f42323t.t(iMin, iMin2);
        if (!this.f42321o) {
            this.f42323t.mUb(iMin, iMin2);
        } else if (!this.f42323t.rl()) {
            this.f42323t.mUb(iMin, iMin2);
            this.f42323t.xMQ();
        }
        this.f42323t.nr(canvas, colorFilter, this.E2);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f42315n;
        return drawable != null ? DrawableCompat.nr(drawable) : this.f42323t.rl.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f42323t.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f42315n;
        return drawable != null ? DrawableCompat.O(drawable) : this.J2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f42315n != null) {
            return new VectorDrawableDelegateState(this.f42315n.getConstantState());
        }
        this.f42323t.f42334n = getChangingConfigurations();
        return this.f42323t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f42323t.rl.mUb;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f42323t.rl.xMQ;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f42315n;
        return drawable != null ? DrawableCompat.KN(drawable) : this.f42323t.f42333O;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f42323t;
        if (vectorDrawableCompatState == null) {
            return false;
        }
        if (vectorDrawableCompatState.Uo()) {
            return true;
        }
        ColorStateList colorStateList = this.f42323t.f42335t;
        return colorStateList != null && colorStateList.isStateful();
    }

    PorterDuffColorFilter mUb(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f42322r && super.mutate() == this) {
            this.f42323t = new VectorDrawableCompatState(this.f42323t);
            this.f42322r = true;
        }
        return this;
    }

    Object nr(String str) {
        return this.f42323t.rl.ck.get(str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f42323t;
        ColorStateList colorStateList = vectorDrawableCompatState.f42335t;
        if (colorStateList == null || (mode = vectorDrawableCompatState.nr) == null) {
            z2 = false;
        } else {
            this.f42317O = mUb(this.f42317O, colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        if (!vectorDrawableCompatState.Uo() || !vectorDrawableCompatState.KN(iArr)) {
            return z2;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f42323t.rl.getRootAlpha() != i2) {
            this.f42323t.rl.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.mUb(drawable, z2);
        } else {
            this.f42323t.f42333O = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.J2 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.ty(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.HI(drawable, colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f42323t;
        if (vectorDrawableCompatState.f42335t != colorStateList) {
            vectorDrawableCompatState.f42335t = colorStateList;
            this.f42317O = mUb(this.f42317O, colorStateList, vectorDrawableCompatState.nr);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.ck(drawable, mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f42323t;
        if (vectorDrawableCompatState.nr != mode) {
            vectorDrawableCompatState.nr = mode;
            this.f42317O = mUb(this.f42317O, vectorDrawableCompatState.f42335t, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f42315n;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private boolean J2() {
        if (isAutoMirrored() && DrawableCompat.J2(this) == 1) {
            return true;
        }
        return false;
    }

    static int n(int i2, float f3) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f3)) << 24);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f3, float f4) {
        super.setHotspot(f3, f4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i5, int i7) {
        super.setHotspotBounds(i2, i3, i5, i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f42315n;
        if (drawable != null) {
            DrawableCompat.Uo(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f42323t;
        vectorDrawableCompatState.rl = new VPathRenderer();
        TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, AndroidResources.f42296n);
        xMQ(typedArrayIk, xmlPullParser, theme);
        typedArrayIk.recycle();
        vectorDrawableCompatState.f42334n = getChangingConfigurations();
        vectorDrawableCompatState.gh = true;
        O(resources, xmlPullParser, attributeSet, theme);
        this.f42317O = mUb(this.f42317O, vectorDrawableCompatState.f42335t, vectorDrawableCompatState.nr);
    }

    VectorDrawableCompat(VectorDrawableCompatState vectorDrawableCompatState) {
        this.f42321o = true;
        this.f42318S = new float[9];
        this.f42320g = new Matrix();
        this.E2 = new Rect();
        this.f42323t = vectorDrawableCompatState;
        this.f42317O = mUb(this.f42317O, vectorDrawableCompatState.f42335t, vectorDrawableCompatState.nr);
    }
}
