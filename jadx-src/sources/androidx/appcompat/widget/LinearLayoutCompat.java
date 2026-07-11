package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class LinearLayoutCompat extends ViewGroup {
    private int[] E2;
    private int J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f14211N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f14212O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f14213S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Drawable f14214T;
    private int Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f14215e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14216g;
    private int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14218o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14219r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14220t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f14221v;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DividerMode {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14222O;
        private int Uo;
        private int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14223n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14224t;
        private int xMQ;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
            this.f14224t = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
            this.nr = propertyMapper.mapGravity("gravity", R.attr.gravity);
            this.f14222O = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new IntFunction<String>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public String apply(int i2) {
                    return i2 != 0 ? i2 != 1 ? String.valueOf(i2) : "vertical" : "horizontal";
                }
            });
            this.J2 = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
            this.Uo = propertyMapper.mapObject("divider", androidx.appcompat.R.attr.p5);
            this.KN = propertyMapper.mapInt("dividerPadding", androidx.appcompat.R.attr.eF);
            this.xMQ = propertyMapper.mapBoolean("measureWithLargestChild", androidx.appcompat.R.attr.f13431Y);
            this.mUb = propertyMapper.mapIntFlag("showDividers", androidx.appcompat.R.attr.ofS, new IntFunction<Set<String>>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.2
                @Override // java.util.function.IntFunction
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public Set apply(int i2) {
                    HashSet hashSet = new HashSet();
                    if (i2 == 0) {
                        hashSet.add("none");
                    }
                    if (i2 == 1) {
                        hashSet.add("beginning");
                    }
                    if (i2 == 2) {
                        hashSet.add("middle");
                    }
                    if (i2 == 4) {
                        hashSet.add(TtmlNode.END);
                    }
                    return hashSet;
                }
            });
            this.f14223n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(LinearLayoutCompat linearLayoutCompat, PropertyReader propertyReader) {
            if (!this.f14223n) {
                throw w6.n();
            }
            propertyReader.readBoolean(this.rl, linearLayoutCompat.XQ());
            propertyReader.readInt(this.f14224t, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.nr, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.f14222O, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.J2, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.Uo, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.KN, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.xMQ, linearLayoutCompat.S());
            propertyReader.readIntFlag(this.mUb, linearLayoutCompat.getShowDividers());
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void iF(View view, int i2, int i3, int i5, int i7) {
        view.layout(i2, i3, i5 + i2, i7 + i3);
    }

    int Ik(View view) {
        return 0;
    }

    void ViF(View view, int i2, int i3, int i5, int i7, int i8) {
        measureChildWithMargins(view, i3, i5, i7, i8);
    }

    protected boolean Z(int i2) {
        if (i2 == 0) {
            return (this.Xw & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.Xw & 4) != 0;
        }
        if ((this.Xw & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    int ck(View view, int i2) {
        return 0;
    }

    int g(int i2) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void nY(int i2, int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int iMax;
        int i11;
        int iMax2;
        int i12;
        int i13;
        int baseline;
        int i14;
        int i15;
        int i16;
        float f3;
        byte b2;
        int i17;
        boolean z2;
        int i18;
        int i19;
        int[] iArr;
        int i20;
        boolean z3;
        int[] iArr2;
        View view;
        int i21;
        boolean z4;
        boolean z5;
        int baseline2;
        this.f14218o = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (this.E2 == null || this.f14215e == null) {
            this.E2 = new int[4];
            this.f14215e = new int[4];
        }
        int[] iArr3 = this.E2;
        int[] iArr4 = this.f14215e;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z6 = this.f14217n;
        boolean z7 = this.f14216g;
        int i22 = 1073741824;
        boolean z9 = mode == 1073741824;
        boolean z10 = z7;
        int iCk = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        boolean z11 = false;
        int iCombineMeasuredStates = 0;
        boolean z12 = false;
        boolean z13 = true;
        float f4 = 0.0f;
        int iMax5 = 0;
        int iMax6 = 0;
        while (true) {
            i5 = iMax3;
            if (iCk >= virtualChildCount) {
                break;
            }
            boolean z14 = z6;
            View viewO = o(iCk);
            if (viewO == null) {
                this.f14218o += g(iCk);
            } else if (viewO.getVisibility() == 8) {
                iCk += ck(viewO, iCk);
            } else {
                if (Z(iCk)) {
                    this.f14218o += this.f14211N;
                }
                LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                float f5 = ((LinearLayout.LayoutParams) layoutParams).weight;
                float f6 = f4 + f5;
                if (mode == i22 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f5 > 0.0f) {
                    if (z9) {
                        this.f14218o += ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    } else {
                        int i23 = this.f14218o;
                        this.f14218o = Math.max(i23, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i23 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z14) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        viewO.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        i19 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i20 = i5;
                        z3 = z10;
                        view = viewO;
                    } else {
                        i19 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z11 = true;
                        i20 = i5;
                        i21 = 1073741824;
                        z3 = z10;
                        view = viewO;
                        if (mode2 == i21 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            z4 = true;
                            z12 = true;
                        } else {
                            z4 = false;
                        }
                        int i24 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        int measuredHeight = view.getMeasuredHeight() + i24;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z14 || (baseline2 = view.getBaseline()) == -1) {
                            z5 = z4;
                        } else {
                            int i25 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i25 < 0) {
                                i25 = this.f14219r;
                            }
                            int i26 = (((i25 & 112) >> 4) & (-2)) >> 1;
                            z5 = z4;
                            iArr[i26] = Math.max(iArr[i26], baseline2);
                            iArr2[i26] = Math.max(iArr2[i26], measuredHeight - baseline2);
                        }
                        iMax3 = Math.max(i20, measuredHeight);
                        z13 = !z13 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                        if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                            if (z5) {
                                measuredHeight = i24;
                            }
                            iMax6 = Math.max(iMax6, measuredHeight);
                        } else {
                            if (z5) {
                                measuredHeight = i24;
                            }
                            iMax5 = Math.max(iMax5, measuredHeight);
                        }
                        iCk += ck(view, iCk);
                        f4 = f6;
                        iCk++;
                        z10 = z3;
                        iArr4 = iArr2;
                        z6 = z14;
                        iArr3 = iArr;
                        mode = i19;
                        i22 = 1073741824;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f5 <= 0.0f) {
                        b2 = -2;
                        i17 = Integer.MIN_VALUE;
                    } else {
                        b2 = -2;
                        ((LinearLayout.LayoutParams) layoutParams).width = -2;
                        i17 = 0;
                    }
                    if (f6 == 0.0f) {
                        z2 = z10;
                        i18 = this.f14218o;
                    } else {
                        z2 = z10;
                        i18 = 0;
                    }
                    i19 = mode;
                    iArr = iArr3;
                    i20 = i5;
                    int i27 = i17;
                    z3 = z2;
                    iArr2 = iArr4;
                    ViF(viewO, iCk, i2, i18, i3, 0);
                    view = viewO;
                    if (i27 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams).width = i27;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z9) {
                        this.f14218o += ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + r(view);
                    } else {
                        int i28 = this.f14218o;
                        this.f14218o = Math.max(i28, i28 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + r(view));
                    }
                    if (z3) {
                        iMax4 = Math.max(measuredWidth, iMax4);
                    }
                }
                i21 = 1073741824;
                if (mode2 == i21) {
                    z4 = false;
                    int i242 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    int measuredHeight2 = view.getMeasuredHeight() + i242;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z14) {
                        z5 = z4;
                        iMax3 = Math.max(i20, measuredHeight2);
                        if (z13) {
                            if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                            }
                            iCk += ck(view, iCk);
                            f4 = f6;
                        }
                    }
                }
                iCk++;
                z10 = z3;
                iArr4 = iArr2;
                z6 = z14;
                iArr3 = iArr;
                mode = i19;
                i22 = 1073741824;
            }
            i19 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            iMax3 = i5;
            z3 = z10;
            iCk++;
            z10 = z3;
            iArr4 = iArr2;
            z6 = z14;
            iArr3 = iArr;
            mode = i19;
            i22 = 1073741824;
        }
        boolean z15 = z6;
        int i29 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i30 = iCombineMeasuredStates;
        boolean z16 = z10;
        if (this.f14218o > 0 && Z(virtualChildCount)) {
            this.f14218o += this.f14211N;
        }
        int i31 = iArr5[1];
        int iMax7 = (i31 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i5 : Math.max(i5, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i31, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
        if (z16) {
            i8 = i29;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                this.f14218o = 0;
                int iCk2 = 0;
                while (iCk2 < virtualChildCount) {
                    View viewO2 = o(iCk2);
                    if (viewO2 == null) {
                        this.f14218o += g(iCk2);
                    } else if (viewO2.getVisibility() == 8) {
                        iCk2 += ck(viewO2, iCk2);
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) viewO2.getLayoutParams();
                        if (z9) {
                            i16 = iMax7;
                            this.f14218o += ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax4 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + r(viewO2);
                            f3 = f4;
                            iCk2++;
                            iMax7 = i16;
                            f4 = f3;
                        } else {
                            i16 = iMax7;
                            int i32 = this.f14218o;
                            f3 = f4;
                            this.f14218o = Math.max(i32, i32 + iMax4 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + r(viewO2));
                            iCk2++;
                            iMax7 = i16;
                            f4 = f3;
                        }
                    }
                    i16 = iMax7;
                    f3 = f4;
                    iCk2++;
                    iMax7 = i16;
                    f4 = f3;
                }
            }
            i7 = iMax7;
        } else {
            i7 = iMax7;
            i8 = i29;
        }
        float f7 = f4;
        int paddingLeft = this.f14218o + getPaddingLeft() + getPaddingRight();
        this.f14218o = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, 0);
        int i33 = (16777215 & iResolveSizeAndState) - this.f14218o;
        if (z11 || (i33 != 0 && f7 > 0.0f)) {
            float f8 = this.f14213S;
            if (f8 > 0.0f) {
                f7 = f8;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.f14218o = 0;
            int iCombineMeasuredStates2 = i30;
            int iMax8 = -1;
            int i34 = 0;
            while (i34 < virtualChildCount) {
                View viewO3 = o(i34);
                if (viewO3 == null || viewO3.getVisibility() == 8) {
                    i12 = iResolveSizeAndState;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) viewO3.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f9 > 0.0f) {
                        int i35 = (int) ((i33 * f9) / f7);
                        f7 -= f9;
                        i33 -= i35;
                        i12 = iResolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i15 = 1073741824;
                            if (i8 == 1073741824) {
                                if (i35 <= 0) {
                                    i35 = 0;
                                }
                                viewO3.measure(View.MeasureSpec.makeMeasureSpec(i35, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewO3.getMeasuredState() & (-16777216));
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth2 = viewO3.getMeasuredWidth() + i35;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewO3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i15), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewO3.getMeasuredState() & (-16777216));
                    } else {
                        i12 = iResolveSizeAndState;
                    }
                    if (z9) {
                        this.f14218o += viewO3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + r(viewO3);
                    } else {
                        int i36 = this.f14218o;
                        this.f14218o = Math.max(i36, viewO3.getMeasuredWidth() + i36 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + r(viewO3));
                    }
                    boolean z17 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i37 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight3 = viewO3.getMeasuredHeight() + i37;
                    iMax8 = Math.max(iMax8, measuredHeight3);
                    if (!z17) {
                        i37 = measuredHeight3;
                    }
                    int iMax9 = Math.max(iMax5, i37);
                    if (z13) {
                        i13 = -1;
                        boolean z18 = ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                        if (z15 && (baseline = viewO3.getBaseline()) != i13) {
                            i14 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i14 < 0) {
                                i14 = this.f14219r;
                            }
                            int i38 = (((i14 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i38] = Math.max(iArr5[i38], baseline);
                            iArr6[i38] = Math.max(iArr6[i38], measuredHeight3 - baseline);
                        }
                        iMax5 = iMax9;
                        z13 = z18;
                    } else {
                        i13 = -1;
                    }
                    if (z15) {
                        i14 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i14 < 0) {
                        }
                        int i382 = (((i14 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i382] = Math.max(iArr5[i382], baseline);
                        iArr6[i382] = Math.max(iArr6[i382], measuredHeight3 - baseline);
                    }
                    iMax5 = iMax9;
                    z13 = z18;
                }
                i34++;
                iResolveSizeAndState = i12;
            }
            i9 = iResolveSizeAndState;
            i10 = -16777216;
            this.f14218o += getPaddingLeft() + getPaddingRight();
            int i39 = iArr5[1];
            iMax = (i39 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i39, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
            i11 = iCombineMeasuredStates2;
            iMax2 = iMax5;
        } else {
            iMax2 = Math.max(iMax5, iMax6);
            if (z16 && i8 != 1073741824) {
                for (int i40 = 0; i40 < virtualChildCount; i40++) {
                    View viewO4 = o(i40);
                    if (viewO4 != null && viewO4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) viewO4.getLayoutParams())).weight > 0.0f) {
                        viewO4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(viewO4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i9 = iResolveSizeAndState;
            i11 = i30;
            iMax = i7;
            i10 = -16777216;
        }
        if (!z13 && mode2 != 1073741824) {
            iMax = iMax2;
        }
        setMeasuredDimension(i9 | (i11 & i10), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i11 << 16));
        if (z12) {
            gh(virtualChildCount, i2);
        }
    }

    int r(View view) {
        return 0;
    }

    public void setWeightSum(float f3) {
        this.f14213S = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f14217n = true;
        this.f14220t = -1;
        this.f14212O = 0;
        this.f14219r = 8388659;
        int[] iArr = androidx.appcompat.R.styleable.f13523f;
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, iArr, i2, 0);
        ViewCompat.ijL(this, context, iArr, attributeSet, tintTypedArrayS.r(), i2, 0);
        int iGh = tintTypedArrayS.gh(androidx.appcompat.R.styleable.Qu, -1);
        if (iGh >= 0) {
            setOrientation(iGh);
        }
        int iGh2 = tintTypedArrayS.gh(androidx.appcompat.R.styleable.ub, -1);
        if (iGh2 >= 0) {
            setGravity(iGh2);
        }
        boolean zN = tintTypedArrayS.n(androidx.appcompat.R.styleable.HBN, true);
        if (!zN) {
            setBaselineAligned(zN);
        }
        this.f14213S = tintTypedArrayS.xMQ(androidx.appcompat.R.styleable.X4T, -1.0f);
        this.f14220t = tintTypedArrayS.gh(androidx.appcompat.R.styleable.UF, -1);
        this.f14216g = tintTypedArrayS.n(androidx.appcompat.R.styleable.xVH, false);
        setDividerDrawable(tintTypedArrayS.Uo(androidx.appcompat.R.styleable.Zmq));
        this.Xw = tintTypedArrayS.gh(androidx.appcompat.R.styleable.EF, 0);
        this.jB = tintTypedArrayS.J2(androidx.appcompat.R.styleable.JVN, 0);
        tintTypedArrayS.aYN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public boolean S() {
        return this.f14216g;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void WPU(int i2, int i3, int i5, int i7) {
        int i8;
        int i9;
        char c2;
        char c4;
        int i10;
        int iCk;
        int i11;
        int i12;
        int i13;
        int i14;
        int measuredHeight;
        boolean zRl = ViewUtils.rl(this);
        int paddingTop = getPaddingTop();
        int i15 = i7 - i3;
        int paddingBottom = i15 - getPaddingBottom();
        int paddingBottom2 = (i15 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.f14219r;
        int i17 = i16 & 112;
        boolean z2 = this.f14217n;
        int[] iArr = this.E2;
        int[] iArr2 = this.f14215e;
        int iRl = GravityCompat.rl(8388615 & i16, getLayoutDirection());
        char c5 = 2;
        char c6 = 1;
        int paddingLeft = iRl != 1 ? iRl != 5 ? getPaddingLeft() : ((getPaddingLeft() + i5) - i2) - this.f14218o : getPaddingLeft() + (((i5 - i2) - this.f14218o) / 2);
        if (zRl) {
            i8 = virtualChildCount - 1;
            i9 = -1;
        } else {
            i8 = 0;
            i9 = 1;
        }
        int i18 = 0;
        while (i18 < virtualChildCount) {
            int i19 = i8 + (i9 * i18);
            int i20 = i18;
            View viewO = o(i19);
            if (viewO == null) {
                paddingLeft += g(i19);
                iCk = i20;
                i10 = paddingTop;
                c2 = c5;
                c4 = c6;
            } else {
                c2 = c5;
                c4 = c6;
                if (viewO.getVisibility() != 8) {
                    int measuredWidth = viewO.getMeasuredWidth();
                    int measuredHeight2 = viewO.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                    int i21 = paddingLeft;
                    if (z2) {
                        i11 = measuredHeight2;
                        int baseline = ((LinearLayout.LayoutParams) layoutParams).height != -1 ? viewO.getBaseline() : -1;
                        i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i12 < 0) {
                            i12 = i17;
                        }
                        i13 = i12 & 112;
                        i10 = paddingTop;
                        if (i13 == 16) {
                            if (i13 == 48) {
                                i14 = i10 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                                if (baseline != -1) {
                                    i14 += iArr[c4] - baseline;
                                }
                            } else if (i13 != 80) {
                                i14 = i10;
                            } else {
                                i14 = (paddingBottom - i11) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c2] - (viewO.getMeasuredHeight() - baseline);
                                }
                            }
                            int i22 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + (Z(i19) ? i21 + this.f14211N : i21);
                            iF(viewO, Ik(viewO) + i22, i14, measuredWidth, i11);
                            int iR = i22 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + r(viewO);
                            iCk = ck(viewO, i19) + i20;
                            paddingLeft = iR;
                        } else {
                            i14 = i10 + ((paddingBottom2 - i11) / 2) + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        }
                        i14 -= measuredHeight;
                        int i222 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + (Z(i19) ? i21 + this.f14211N : i21);
                        iF(viewO, Ik(viewO) + i222, i14, measuredWidth, i11);
                        int iR2 = i222 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + r(viewO);
                        iCk = ck(viewO, i19) + i20;
                        paddingLeft = iR2;
                    } else {
                        i11 = measuredHeight2;
                    }
                    i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i12 < 0) {
                    }
                    i13 = i12 & 112;
                    i10 = paddingTop;
                    if (i13 == 16) {
                    }
                    i14 -= measuredHeight;
                    int i2222 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + (Z(i19) ? i21 + this.f14211N : i21);
                    iF(viewO, Ik(viewO) + i2222, i14, measuredWidth, i11);
                    int iR22 = i2222 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + r(viewO);
                    iCk = ck(viewO, i19) + i20;
                    paddingLeft = iR22;
                } else {
                    i10 = paddingTop;
                    iCk = i20;
                }
            }
            i18 = iCk + 1;
            c5 = c2;
            c6 = c4;
            paddingTop = i10;
        }
    }

    public boolean XQ() {
        return this.f14217n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i2 = this.J2;
        if (i2 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f14220t < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f14220t;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f14220t == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f14212O;
        if (this.J2 == 1 && (i2 = this.f14219r & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f14218o) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f14218o;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f14220t;
    }

    public Drawable getDividerDrawable() {
        return this.f14214T;
    }

    public int getDividerPadding() {
        return this.jB;
    }

    @RestrictTo
    public int getDividerWidth() {
        return this.f14211N;
    }

    @GravityInt
    public int getGravity() {
        return this.f14219r;
    }

    public int getOrientation() {
        return this.J2;
    }

    public int getShowDividers() {
        return this.Xw;
    }

    public float getWeightSum() {
        return this.f14213S;
    }

    void mUb(Canvas canvas, int i2) {
        this.f14214T.setBounds(i2, getPaddingTop() + this.jB, this.f14211N + i2, (getHeight() - getPaddingBottom()) - this.jB);
        this.f14214T.draw(canvas);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f14214T == null) {
            return;
        }
        if (this.J2 == 1) {
            KN(canvas);
        } else {
            Uo(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        if (this.J2 == 1) {
            aYN(i2, i3, i5, i7);
        } else {
            WPU(i2, i3, i5, i7);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.J2 == 1) {
            te(i2, i3);
        } else {
            nY(i2, i3);
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f14217n = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f14220t = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f14214T) {
            return;
        }
        this.f14214T = drawable;
        if (drawable != null) {
            this.f14211N = drawable.getIntrinsicWidth();
            this.f14221v = drawable.getIntrinsicHeight();
        } else {
            this.f14211N = 0;
            this.f14221v = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.jB = i2;
    }

    public void setGravity(@GravityInt int i2) {
        if (this.f14219r != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f14219r = i2;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f14216g = z2;
    }

    public void setOrientation(int i2) {
        if (this.J2 != i2) {
            this.J2 = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.Xw) {
            requestLayout();
        }
        this.Xw = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i5 = this.f14219r;
        if ((i5 & 112) != i3) {
            this.f14219r = i3 | (i5 & (-113));
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void te(int i2, int i3) {
        int i5;
        int iMax;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        int iMax2;
        View view;
        int iMax3;
        boolean z3;
        int iMax4;
        int i18;
        this.f14218o = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i19 = this.f14220t;
        boolean z4 = this.f14216g;
        int iCk = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int iMax5 = 0;
        boolean z5 = false;
        boolean z6 = false;
        float f3 = 0.0f;
        boolean z7 = true;
        while (true) {
            int i24 = 8;
            if (iCk >= virtualChildCount) {
                float f4 = f3;
                int i25 = i20;
                int i26 = virtualChildCount;
                int i27 = mode2;
                boolean z9 = z4;
                int i28 = i21;
                int iMax6 = i22;
                int iCombineMeasuredStates = i23;
                if (this.f14218o > 0) {
                    i5 = i26;
                    if (Z(i5)) {
                        this.f14218o += this.f14221v;
                    }
                } else {
                    i5 = i26;
                }
                int i29 = i27;
                if (z9 && (i29 == Integer.MIN_VALUE || i29 == 0)) {
                    this.f14218o = 0;
                    int iCk2 = 0;
                    while (iCk2 < i5) {
                        View viewO = o(iCk2);
                        if (viewO == null) {
                            this.f14218o += g(iCk2);
                        } else if (viewO.getVisibility() == i24) {
                            iCk2 += ck(viewO, iCk2);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                            int i30 = this.f14218o;
                            this.f14218o = Math.max(i30, i30 + i28 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + r(viewO));
                        }
                        iCk2++;
                        i24 = 8;
                    }
                }
                int paddingTop = this.f14218o + getPaddingTop() + getPaddingBottom();
                this.f14218o = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, 0);
                int i31 = (16777215 & iResolveSizeAndState) - this.f14218o;
                if (z5 || (i31 != 0 && f4 > 0.0f)) {
                    float f5 = this.f14213S;
                    if (f5 <= 0.0f) {
                        f5 = f4;
                    }
                    this.f14218o = 0;
                    float f6 = f5;
                    int i32 = i31;
                    int i33 = 0;
                    while (i33 < i5) {
                        View viewO2 = o(i33);
                        if (viewO2.getVisibility() == 8) {
                            i7 = i29;
                            i8 = i33;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) viewO2.getLayoutParams();
                            float f7 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f7 > 0.0f) {
                                i8 = i33;
                                int i34 = (int) ((i32 * f7) / f6);
                                f6 -= f7;
                                i32 -= i34;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i10 = 1073741824;
                                    if (i29 == 1073741824) {
                                        i7 = i29;
                                        viewO2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i34 > 0 ? i34 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewO2.getMeasuredState() & (-256));
                                } else {
                                    i10 = 1073741824;
                                }
                                i7 = i29;
                                int measuredHeight = viewO2.getMeasuredHeight() + i34;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewO2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i10));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewO2.getMeasuredState() & (-256));
                            } else {
                                i7 = i29;
                                i8 = i33;
                            }
                            int i35 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = viewO2.getMeasuredWidth() + i35;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i9 = -1;
                                if (((LinearLayout.LayoutParams) layoutParams2).width == -1) {
                                    measuredWidth = i35;
                                }
                            } else {
                                i9 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z10 = z7 && ((LinearLayout.LayoutParams) layoutParams2).width == i9;
                            int i36 = this.f14218o;
                            this.f14218o = Math.max(i36, i36 + viewO2.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin + r(viewO2));
                            iMax5 = iMax7;
                            z7 = z10;
                        }
                        i33 = i8 + 1;
                        i29 = i7;
                    }
                    this.f14218o += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i25);
                    if (z9 && i29 != 1073741824) {
                        for (int i37 = 0; i37 < i5; i37++) {
                            View viewO3 = o(i37);
                            if (viewO3 != null && viewO3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) viewO3.getLayoutParams())).weight > 0.0f) {
                                viewO3.measure(View.MeasureSpec.makeMeasureSpec(viewO3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
                            }
                        }
                    }
                }
                if (!z7 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates), iResolveSizeAndState);
                if (z6) {
                    qie(i5, i3);
                    return;
                }
                return;
            }
            float f8 = f3;
            View viewO4 = o(iCk);
            if (viewO4 == null) {
                this.f14218o += g(iCk);
            } else if (viewO4.getVisibility() == 8) {
                iCk += ck(viewO4, iCk);
            } else {
                if (Z(iCk)) {
                    this.f14218o += this.f14221v;
                }
                LayoutParams layoutParams3 = (LayoutParams) viewO4.getLayoutParams();
                float f9 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                float f10 = f8 + f9;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == 0 && f9 > 0.0f) {
                    int i38 = this.f14218o;
                    this.f14218o = Math.max(i38, ((LinearLayout.LayoutParams) layoutParams3).topMargin + i38 + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                    iMax2 = i20;
                    iMax3 = i21;
                    i14 = virtualChildCount;
                    i15 = mode2;
                    z5 = true;
                    view = viewO4;
                    i17 = i22;
                    i16 = i23;
                    z2 = z4;
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams3).height != 0 || f9 <= 0.0f) {
                        i11 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) layoutParams3).height = -2;
                        i11 = 0;
                    }
                    if (f10 == 0.0f) {
                        int i39 = i23;
                        i13 = this.f14218o;
                        i12 = i39;
                    } else {
                        i12 = i23;
                        i13 = 0;
                    }
                    int i40 = i21;
                    i14 = virtualChildCount;
                    i15 = mode2;
                    i16 = i12;
                    i17 = i22;
                    z2 = z4;
                    iMax2 = i20;
                    ViF(viewO4, iCk, i2, 0, i3, i13);
                    view = viewO4;
                    if (i11 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams3).height = i11;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i41 = this.f14218o;
                    this.f14218o = Math.max(i41, i41 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin + r(view));
                    iMax3 = z2 ? Math.max(measuredHeight2, i40) : i40;
                }
                if (i19 >= 0 && i19 == iCk + 1) {
                    this.f14212O = this.f14218o;
                }
                if (iCk < i19 && ((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams3).width != -1) {
                    z3 = false;
                } else {
                    z3 = true;
                    z6 = true;
                }
                int i42 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i42;
                iMax4 = Math.max(i17, measuredWidth2);
                int i43 = iMax3;
                int iCombineMeasuredStates2 = View.combineMeasuredStates(i16, view.getMeasuredState());
                if (z7) {
                    i18 = iCombineMeasuredStates2;
                    z7 = ((LinearLayout.LayoutParams) layoutParams3).width == -1;
                    if (((LinearLayout.LayoutParams) layoutParams3).weight <= 0.0f) {
                        if (!z3) {
                            i42 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i42);
                    } else {
                        if (!z3) {
                            i42 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i42);
                    }
                    iCk += ck(view, iCk);
                    f3 = f10;
                    i21 = i43;
                    i23 = i18;
                    iCk++;
                    i22 = iMax4;
                    i20 = iMax2;
                    z4 = z2;
                    mode2 = i15;
                    virtualChildCount = i14;
                } else {
                    i18 = iCombineMeasuredStates2;
                }
                if (((LinearLayout.LayoutParams) layoutParams3).weight <= 0.0f) {
                }
                iCk += ck(view, iCk);
                f3 = f10;
                i21 = i43;
                i23 = i18;
                iCk++;
                i22 = iMax4;
                i20 = iMax2;
                z4 = z2;
                mode2 = i15;
                virtualChildCount = i14;
            }
            iMax2 = i20;
            i14 = virtualChildCount;
            i15 = mode2;
            z2 = z4;
            f3 = f8;
            iMax4 = i22;
            iCk++;
            i22 = iMax4;
            i20 = iMax2;
            z4 = z2;
            mode2 = i15;
            virtualChildCount = i14;
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    void xMQ(Canvas canvas, int i2) {
        this.f14214T.setBounds(getPaddingLeft() + this.jB, i2, (getWidth() - getPaddingRight()) - this.jB, this.f14221v + i2);
        this.f14214T.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void gh(int i2, int i3) {
        int i5;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i7 = 0;
        while (i7 < i2) {
            View viewO = o(i7);
            if (viewO.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i8 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = viewO.getMeasuredWidth();
                    i5 = i3;
                    measureChildWithMargins(viewO, i5, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i8;
                } else {
                    i5 = i3;
                }
            }
            i7++;
            i3 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void qie(int i2, int i3) {
        int i5;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i7 = 0;
        while (i7 < i2) {
            View viewO = o(i7);
            if (viewO.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i8 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = viewO.getMeasuredHeight();
                    i5 = i3;
                    measureChildWithMargins(viewO, iMakeMeasureSpec, 0, i5, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i8;
                } else {
                    i5 = i3;
                }
            }
            i7++;
            i3 = i5;
        }
    }

    void KN(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewO = o(i2);
            if (viewO != null && viewO.getVisibility() != 8 && Z(i2)) {
                xMQ(canvas, (viewO.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) viewO.getLayoutParams())).topMargin) - this.f14221v);
            }
        }
        if (Z(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            if (viewO2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f14221v;
            } else {
                bottom = viewO2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) viewO2.getLayoutParams())).bottomMargin;
            }
            xMQ(canvas, bottom);
        }
    }

    void Uo(Canvas canvas) {
        int right;
        int left;
        int i2;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean zRl = ViewUtils.rl(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View viewO = o(i3);
            if (viewO != null && viewO.getVisibility() != 8 && Z(i3)) {
                LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                if (zRl) {
                    left2 = viewO.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else {
                    left2 = (viewO.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f14211N;
                }
                mUb(canvas, left2);
            }
        }
        if (Z(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            if (viewO2 == null) {
                if (zRl) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i2 = this.f14211N;
                    right = left - i2;
                }
            } else {
                LayoutParams layoutParams2 = (LayoutParams) viewO2.getLayoutParams();
                if (zRl) {
                    left = viewO2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i2 = this.f14211N;
                    right = left - i2;
                } else {
                    right = viewO2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            }
            mUb(canvas, right);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void aYN(int i2, int i3, int i5, int i7) {
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int i11 = i5 - i2;
        int paddingRight = i11 - getPaddingRight();
        int paddingRight2 = (i11 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i12 = this.f14219r;
        int i13 = i12 & 112;
        int i14 = i12 & 8388615;
        if (i13 != 16) {
            if (i13 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i7) - i3) - this.f14218o;
            }
        } else {
            paddingTop = getPaddingTop() + (((i7 - i3) - this.f14218o) / 2);
        }
        int iCk = 0;
        while (iCk < virtualChildCount) {
            View viewO = o(iCk);
            if (viewO == null) {
                paddingTop += g(iCk);
            } else {
                if (viewO.getVisibility() != 8) {
                    int measuredWidth = viewO.getMeasuredWidth();
                    int measuredHeight = viewO.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                    int i15 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i15 < 0) {
                        i15 = i14;
                    }
                    int iRl = GravityCompat.rl(i15, getLayoutDirection()) & 7;
                    if (iRl != 1) {
                        if (iRl != 5) {
                            i10 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                            int i16 = i10;
                            if (Z(iCk)) {
                                paddingTop += this.f14221v;
                            }
                            int i17 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            iF(viewO, i16, i17 + Ik(viewO), measuredWidth, measuredHeight);
                            paddingTop = i17 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + r(viewO);
                            iCk += ck(viewO, iCk);
                        } else {
                            i8 = paddingRight - measuredWidth;
                            i9 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        }
                    } else {
                        i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        i9 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    i10 = i8 - i9;
                    int i162 = i10;
                    if (Z(iCk)) {
                    }
                    int i172 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    iF(viewO, i162, i172 + Ik(viewO), measuredWidth, measuredHeight);
                    paddingTop = i172 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + r(viewO);
                    iCk += ck(viewO, iCk);
                }
                iCk++;
            }
            iCk++;
        }
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    View o(int i2) {
        return getChildAt(i2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i5 = this.f14219r;
        if ((8388615 & i5) != i3) {
            this.f14219r = i3 | ((-8388616) & i5);
            requestLayout();
        }
    }
}
