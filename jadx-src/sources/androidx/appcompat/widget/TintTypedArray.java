package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class TintTypedArray {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f14385n;
    private final TypedArray rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TypedValue f14386t;

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static int n(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        static int rl(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    public static TintTypedArray S(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public static TintTypedArray XQ(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static TintTypedArray Z(Context context, int i2, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(i2, iArr));
    }

    public String HI(int i2) {
        return this.rl.getString(i2);
    }

    public CharSequence[] Ik(int i2) {
        return this.rl.getTextArray(i2);
    }

    public int J2(int i2, int i3) {
        return this.rl.getDimensionPixelSize(i2, i3);
    }

    public Drawable KN(int i2) {
        int resourceId;
        if (!this.rl.hasValue(i2) || (resourceId = this.rl.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return AppCompatDrawableManager.rl().nr(this.f14385n, resourceId, true);
    }

    public int O(int i2, int i3) {
        return this.rl.getDimensionPixelOffset(i2, i3);
    }

    public Drawable Uo(int i2) {
        int resourceId;
        return (!this.rl.hasValue(i2) || (resourceId = this.rl.getResourceId(i2, 0)) == 0) ? this.rl.getDrawable(i2) : AppCompatResources.rl(this.f14385n, resourceId);
    }

    public TypedValue WPU(int i2) {
        return this.rl.peekValue(i2);
    }

    public void aYN() {
        this.rl.recycle();
    }

    public int az(int i2, int i3) {
        return this.rl.getLayoutDimension(i2, i3);
    }

    public CharSequence ck(int i2) {
        return this.rl.getText(i2);
    }

    public int gh(int i2, int i3) {
        return this.rl.getInt(i2, i3);
    }

    public Typeface mUb(int i2, int i3, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.rl.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f14386t == null) {
            this.f14386t = new TypedValue();
        }
        return ResourcesCompat.xMQ(this.f14385n, resourceId, this.f14386t, i3, fontCallback);
    }

    public boolean n(int i2, boolean z2) {
        return this.rl.getBoolean(i2, z2);
    }

    public float nr(int i2, float f3) {
        return this.rl.getDimension(i2, f3);
    }

    public boolean o(int i2) {
        return this.rl.hasValue(i2);
    }

    public int qie(int i2, int i3) {
        return this.rl.getInteger(i2, i3);
    }

    public TypedArray r() {
        return this.rl;
    }

    public int rl(int i2, int i3) {
        return this.rl.getColor(i2, i3);
    }

    public ColorStateList t(int i2) {
        int resourceId;
        ColorStateList colorStateListN;
        return (!this.rl.hasValue(i2) || (resourceId = this.rl.getResourceId(i2, 0)) == 0 || (colorStateListN = AppCompatResources.n(this.f14385n, resourceId)) == null) ? this.rl.getColorStateList(i2) : colorStateListN;
    }

    public int ty(int i2, int i3) {
        return this.rl.getResourceId(i2, i3);
    }

    public float xMQ(int i2, float f3) {
        return this.rl.getFloat(i2, f3);
    }

    private TintTypedArray(Context context, TypedArray typedArray) {
        this.f14385n = context;
        this.rl = typedArray;
    }
}
