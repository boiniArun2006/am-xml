package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public final class AppCompatDrawableManager {
    private static final PorterDuff.Mode rl = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static AppCompatDrawableManager f14070t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ResourceManagerInternal f14071n;

    synchronized ColorStateList J2(Context context, int i2) {
        return this.f14071n.qie(context, i2);
    }

    public synchronized void Uo(Context context) {
        this.f14071n.r(context);
    }

    synchronized Drawable nr(Context context, int i2, boolean z2) {
        return this.f14071n.mUb(context, i2, z2);
    }

    public synchronized Drawable t(Context context, int i2) {
        return this.f14071n.xMQ(context, i2);
    }

    public static synchronized void KN() {
        if (f14070t == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            f14070t = appCompatDrawableManager;
            appCompatDrawableManager.f14071n = ResourceManagerInternal.Uo();
            f14070t.f14071n.Z(new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final int[] f14073n = {R.drawable.f13456U, R.drawable.Xw, R.drawable.f13461n};
                private final int[] rl = {R.drawable.HI, R.drawable.te, R.drawable.f13458Z, R.drawable.ck, R.drawable.Ik, R.drawable.f13462o, R.drawable.f13463r};

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private final int[] f14074t = {R.drawable.bzg, R.drawable.jB, R.drawable.gh, R.drawable.s7N, R.drawable.wTp, R.drawable.f13465v, R.drawable.rV9};
                private final int[] nr = {R.drawable.WPU, R.drawable.xMQ, R.drawable.f13454S};

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final int[] f14072O = {R.drawable.nHg, R.drawable.P5};
                private final int[] J2 = {R.drawable.f13464t, R.drawable.Uo, R.drawable.nr, R.drawable.KN};

                private boolean J2(int[] iArr, int i2) {
                    for (int i3 : iArr) {
                        if (i3 == i2) {
                            return true;
                        }
                    }
                    return false;
                }

                private ColorStateList KN(Context context, int i2) {
                    int iT = ThemeUtils.t(context, R.attr.nHg);
                    return new ColorStateList(new int[][]{ThemeUtils.rl, ThemeUtils.f14378O, ThemeUtils.f14380t, ThemeUtils.xMQ}, new int[]{ThemeUtils.rl(context, R.attr.f13428T), ColorUtils.gh(iT, i2), ColorUtils.gh(iT, i2), i2});
                }

                private ColorStateList Uo(Context context) {
                    return KN(context, 0);
                }

                private ColorStateList gh(Context context) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    int i2 = R.attr.f13443v;
                    ColorStateList colorStateListO = ThemeUtils.O(context, i2);
                    if (colorStateListO == null || !colorStateListO.isStateful()) {
                        iArr[0] = ThemeUtils.rl;
                        iArr2[0] = ThemeUtils.rl(context, i2);
                        iArr[1] = ThemeUtils.J2;
                        iArr2[1] = ThemeUtils.t(context, R.attr.f13425N);
                        iArr[2] = ThemeUtils.xMQ;
                        iArr2[2] = ThemeUtils.t(context, i2);
                    } else {
                        int[] iArr3 = ThemeUtils.rl;
                        iArr[0] = iArr3;
                        iArr2[0] = colorStateListO.getColorForState(iArr3, 0);
                        iArr[1] = ThemeUtils.J2;
                        iArr2[1] = ThemeUtils.t(context, R.attr.f13425N);
                        iArr[2] = ThemeUtils.xMQ;
                        iArr2[2] = colorStateListO.getDefaultColor();
                    }
                    return new ColorStateList(iArr, iArr2);
                }

                private LayerDrawable qie(ResourceManagerInternal resourceManagerInternal, Context context, int i2) {
                    BitmapDrawable bitmapDrawable;
                    BitmapDrawable bitmapDrawable2;
                    BitmapDrawable bitmapDrawable3;
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                    Drawable drawableXMQ = resourceManagerInternal.xMQ(context, R.drawable.f13459e);
                    Drawable drawableXMQ2 = resourceManagerInternal.xMQ(context, R.drawable.f13457X);
                    if ((drawableXMQ instanceof BitmapDrawable) && drawableXMQ.getIntrinsicWidth() == dimensionPixelSize && drawableXMQ.getIntrinsicHeight() == dimensionPixelSize) {
                        bitmapDrawable = (BitmapDrawable) drawableXMQ;
                        bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawableXMQ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawableXMQ.draw(canvas);
                        bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                        bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                    }
                    bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                    if ((drawableXMQ2 instanceof BitmapDrawable) && drawableXMQ2.getIntrinsicWidth() == dimensionPixelSize && drawableXMQ2.getIntrinsicHeight() == dimensionPixelSize) {
                        bitmapDrawable3 = (BitmapDrawable) drawableXMQ2;
                    } else {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                        drawableXMQ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawableXMQ2.draw(canvas2);
                        bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
                    }
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                    layerDrawable.setId(0, android.R.id.background);
                    layerDrawable.setId(1, android.R.id.secondaryProgress);
                    layerDrawable.setId(2, android.R.id.progress);
                    return layerDrawable;
                }

                private ColorStateList mUb(Context context) {
                    return KN(context, ThemeUtils.t(context, R.attr.f13428T));
                }

                private ColorStateList xMQ(Context context) {
                    return KN(context, ThemeUtils.t(context, R.attr.f13430X));
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public boolean O(Context context, int i2, Drawable drawable) {
                    if (i2 == R.drawable.iF) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawable;
                        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                        int i3 = R.attr.s7N;
                        az(drawableFindDrawableByLayerId, ThemeUtils.t(context, i3), AppCompatDrawableManager.rl);
                        az(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.t(context, i3), AppCompatDrawableManager.rl);
                        az(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.t(context, R.attr.f13425N), AppCompatDrawableManager.rl);
                        return true;
                    }
                    if (i2 != R.drawable.ViF && i2 != R.drawable.aYN && i2 != R.drawable.nY) {
                        return false;
                    }
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    az(layerDrawable2.findDrawableByLayerId(android.R.id.background), ThemeUtils.rl(context, R.attr.s7N), AppCompatDrawableManager.rl);
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress);
                    int i5 = R.attr.f13425N;
                    az(drawableFindDrawableByLayerId2, ThemeUtils.t(context, i5), AppCompatDrawableManager.rl);
                    az(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.t(context, i5), AppCompatDrawableManager.rl);
                    return true;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public Drawable n(ResourceManagerInternal resourceManagerInternal, Context context, int i2) {
                    if (i2 == R.drawable.mUb) {
                        return new LayerDrawable(new Drawable[]{resourceManagerInternal.xMQ(context, R.drawable.xMQ), resourceManagerInternal.xMQ(context, R.drawable.gh)});
                    }
                    if (i2 == R.drawable.ViF) {
                        return qie(resourceManagerInternal, context, R.dimen.xMQ);
                    }
                    if (i2 == R.drawable.aYN) {
                        return qie(resourceManagerInternal, context, R.dimen.mUb);
                    }
                    if (i2 == R.drawable.nY) {
                        return qie(resourceManagerInternal, context, R.dimen.gh);
                    }
                    return null;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public PorterDuff.Mode nr(int i2) {
                    if (i2 == R.drawable.f13455T) {
                        return PorterDuff.Mode.MULTIPLY;
                    }
                    return null;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public ColorStateList rl(Context context, int i2) {
                    if (i2 == R.drawable.az) {
                        return AppCompatResources.n(context, R.color.f13446O);
                    }
                    if (i2 == R.drawable.f13452N) {
                        return AppCompatResources.n(context, R.color.KN);
                    }
                    if (i2 == R.drawable.f13455T) {
                        return gh(context);
                    }
                    if (i2 == R.drawable.J2) {
                        return mUb(context);
                    }
                    if (i2 == R.drawable.rl) {
                        return Uo(context);
                    }
                    if (i2 == R.drawable.f13453O) {
                        return xMQ(context);
                    }
                    if (i2 == R.drawable.fD || i2 == R.drawable.E2) {
                        return AppCompatResources.n(context, R.color.Uo);
                    }
                    if (J2(this.rl, i2)) {
                        return ThemeUtils.O(context, R.attr.s7N);
                    }
                    if (J2(this.f14072O, i2)) {
                        return AppCompatResources.n(context, R.color.nr);
                    }
                    if (J2(this.J2, i2)) {
                        return AppCompatResources.n(context, R.color.f13448t);
                    }
                    if (i2 == R.drawable.f13460g) {
                        return AppCompatResources.n(context, R.color.J2);
                    }
                    return null;
                }

                private void az(Drawable drawable, int i2, PorterDuff.Mode mode) {
                    Drawable drawableMutate = drawable.mutate();
                    if (mode == null) {
                        mode = AppCompatDrawableManager.rl;
                    }
                    drawableMutate.setColorFilter(AppCompatDrawableManager.O(i2, mode));
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean t(Context context, int i2, Drawable drawable) {
                    PorterDuff.Mode mode;
                    int i3;
                    boolean z2;
                    int iRound;
                    PorterDuff.Mode mode2 = AppCompatDrawableManager.rl;
                    if (J2(this.f14073n, i2)) {
                        i3 = R.attr.s7N;
                    } else if (J2(this.f14074t, i2)) {
                        i3 = R.attr.f13425N;
                    } else {
                        if (J2(this.nr, i2)) {
                            mode2 = PorterDuff.Mode.MULTIPLY;
                        } else {
                            if (i2 == R.drawable.XQ) {
                                iRound = Math.round(40.8f);
                                i3 = 16842800;
                                mode = mode2;
                                z2 = true;
                                if (z2) {
                                    return false;
                                }
                                Drawable drawableMutate = drawable.mutate();
                                drawableMutate.setColorFilter(AppCompatDrawableManager.O(ThemeUtils.t(context, i3), mode));
                                if (iRound != -1) {
                                    drawableMutate.setAlpha(iRound);
                                }
                                return true;
                            }
                            if (i2 != R.drawable.qie) {
                                mode = mode2;
                                i3 = 0;
                                z2 = false;
                                iRound = -1;
                                if (z2) {
                                }
                            }
                        }
                        mode = mode2;
                        iRound = -1;
                        i3 = 16842801;
                        z2 = true;
                        if (z2) {
                        }
                    }
                    mode = mode2;
                    z2 = true;
                    iRound = -1;
                    if (z2) {
                    }
                }
            });
        }
    }

    public static synchronized PorterDuffColorFilter O(int i2, PorterDuff.Mode mode) {
        return ResourceManagerInternal.gh(i2, mode);
    }

    public static synchronized AppCompatDrawableManager rl() {
        try {
            if (f14070t == null) {
                KN();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14070t;
    }

    static void xMQ(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.S(drawable, tintInfo, iArr);
    }
}
