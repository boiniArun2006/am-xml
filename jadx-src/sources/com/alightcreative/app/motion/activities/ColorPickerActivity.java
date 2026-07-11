package com.alightcreative.app.motion.activities;

import QmE.j;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.ColorPickerActivity;
import com.alightcreative.app.motion.activities.edit.GradientSlider;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import yc.FP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0003J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010'R\u0016\u00108\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010&R\"\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020:098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/alightcreative/app/motion/activities/ColorPickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "EWS", "How", "", "tag", "Lkotlin/Function0;", FileUploadManager.f61572j, "QZ6", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "hRu", "", "addColor", "GD", "(I)V", "tFV", "VwL", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "finish", "LSJ0/w6;", "r", "LSJ0/w6;", "binding", "LQmE/iF;", "o", "LQmE/iF;", "Po6", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "Z", "I", "rgbNewColor", "S", "wheelNewColor", "", "g", "F", "wheelHue", "", "E2", "changedColors", "e", "Ljava/lang/String;", "lensString", "X", "oldColor", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "allowAlpha", "", "", "N", "Ljava/util/Map;", "lastThrottledCall", "Landroid/view/View$OnClickListener;", "v", "Landroid/view/View$OnClickListener;", "onClickListener", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorPickerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorPickerActivity.kt\ncom/alightcreative/app/motion/activities/ColorPickerActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n1863#2,2:438\n1863#2,2:447\n381#3,7:440\n161#4,8:449\n1#5:457\n*S KotlinDebug\n*F\n+ 1 ColorPickerActivity.kt\ncom/alightcreative/app/motion/activities/ColorPickerActivity\n*L\n250#1:438,2\n305#1:447,2\n268#1:440,7\n66#1:449,8\n*E\n"})
public final class ColorPickerActivity extends AbstractActivityC1734q {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean changedColors;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int wheelNewColor;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private int oldColor;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private int rgbNewColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float wheelHue;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SJ0.w6 binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String lensString = "";

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean allowAlpha = true;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private Map lastThrottledCall = new LinkedHashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.mz
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ColorPickerActivity.RQ(this.f45548n, view);
        }
    };

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class j implements FP.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ yc.psW f44370n;
        final /* synthetic */ ColorPickerActivity rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ yc.Sw f44371t;

        j(yc.psW psw, ColorPickerActivity colorPickerActivity, yc.Sw sw) {
            this.f44370n = psw;
            this.rl = colorPickerActivity;
            this.f44371t = sw;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean nr(Ref.BooleanRef booleanRef, yc.Sw sw, ColorPickerActivity colorPickerActivity, yc.psW psw, View view, MotionEvent motionEvent) {
            if (!booleanRef.element) {
                return false;
            }
            float fFD = sw.fD();
            int action = motionEvent.getAction();
            SJ0.w6 w6Var = null;
            String str = gUxOLwRQBPPLC.MkLbjangrN;
            if (action != 1) {
                if (action == 2) {
                    SJ0.w6 w6Var2 = colorPickerActivity.binding;
                    if (w6Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        w6Var2 = null;
                    }
                    w6Var2.f9671e.setVisibility(0);
                    if (fFD < 0.0f) {
                        SJ0.w6 w6Var3 = colorPickerActivity.binding;
                        if (w6Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        } else {
                            w6Var = w6Var3;
                        }
                        w6Var.f9671e.setImageDrawable(colorPickerActivity.getResources().getDrawable(2131231617, colorPickerActivity.getTheme()));
                    } else {
                        SJ0.w6 w6Var4 = colorPickerActivity.binding;
                        if (w6Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        } else {
                            w6Var = w6Var4;
                        }
                        w6Var.f9671e.setImageDrawable(colorPickerActivity.getResources().getDrawable(2131231618, colorPickerActivity.getTheme()));
                    }
                } else if (action == 3) {
                    booleanRef.element = false;
                }
            } else {
                if (fFD < 0.0f) {
                    psw.O(sw.iF());
                    SJ0.w6 w6Var5 = colorPickerActivity.binding;
                    if (w6Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        w6Var5 = null;
                    }
                    w6Var5.f9671e.setVisibility(8);
                    booleanRef.element = false;
                    colorPickerActivity.changedColors = true;
                    SJ0.w6 w6Var6 = colorPickerActivity.binding;
                    if (w6Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        w6Var6 = null;
                    }
                    w6Var6.f9677v.setVisibility(0);
                    SJ0.w6 w6Var7 = colorPickerActivity.binding;
                    if (w6Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    } else {
                        w6Var = w6Var7;
                    }
                    w6Var.XQ.setVisibility(0);
                    return true;
                }
                SJ0.w6 w6Var8 = colorPickerActivity.binding;
                if (w6Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                } else {
                    w6Var = w6Var8;
                }
                ImageView trash = w6Var.f9671e;
                Intrinsics.checkNotNullExpressionValue(trash, "trash");
                trash.setVisibility(8);
                booleanRef.element = false;
            }
            return false;
        }

        @Override // yc.FP.j
        public void n(View view, int i2) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (i2 >= this.f44370n.getItemCount()) {
                return;
            }
            SolidColor solidColorT = HI0.qf.t(this.f44370n.Ik(i2));
            SJ0.w6 w6Var = this.rl.binding;
            SJ0.w6 w6Var2 = null;
            if (w6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var = null;
            }
            if (!w6Var.J2.isActivated()) {
                SJ0.w6 w6Var3 = this.rl.binding;
                if (w6Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    w6Var3 = null;
                }
                w6Var3.iF.setProgress((int) (((double) solidColorT.getR()) * 255.0d));
                SJ0.w6 w6Var4 = this.rl.binding;
                if (w6Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    w6Var4 = null;
                }
                w6Var4.te.setProgress((int) (((double) solidColorT.getG()) * 255.0d));
                SJ0.w6 w6Var5 = this.rl.binding;
                if (w6Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    w6Var5 = null;
                }
                w6Var5.nY.setProgress((int) (((double) solidColorT.getB()) * 255.0d));
                SJ0.w6 w6Var6 = this.rl.binding;
                if (w6Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    w6Var2 = w6Var6;
                }
                w6Var2.ViF.setProgress((int) (((double) solidColorT.getA()) * 255.0d));
                this.rl.tFV();
                return;
            }
            float[] fArr = {0.0f, 0.0f, 0.0f};
            Color.colorToHSV(ColorKt.toInt(solidColorT), fArr);
            SJ0.w6 w6Var7 = this.rl.binding;
            if (w6Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var7 = null;
            }
            w6Var7.fD.setProgress((int) (((double) fArr[1]) * 255.0d));
            SJ0.w6 w6Var8 = this.rl.binding;
            if (w6Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var8 = null;
            }
            w6Var8.f9672g.setProgress((int) (((double) fArr[2]) * 255.0d));
            SJ0.w6 w6Var9 = this.rl.binding;
            if (w6Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var9 = null;
            }
            w6Var9.f9661E.setProgress((int) (((double) solidColorT.getA()) * 255.0d));
            SJ0.w6 w6Var10 = this.rl.binding;
            if (w6Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                w6Var2 = w6Var10;
            }
            w6Var2.aYN.setAngle(fArr[0]);
            this.rl.VwL();
        }

        @Override // yc.FP.j
        public void rl(View view, int i2) {
            Intrinsics.checkNotNullParameter(view, "view");
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            SJ0.w6 w6Var = this.rl.binding;
            if (w6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var = null;
            }
            RecyclerView recyclerView = w6Var.f9674o;
            final yc.Sw sw = this.f44371t;
            final ColorPickerActivity colorPickerActivity = this.rl;
            final yc.psW psw = this.f44370n;
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.alightcreative.app.motion.activities.M5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return ColorPickerActivity.j.nr(booleanRef, sw, colorPickerActivity, psw, view2, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ER(final ColorPickerActivity colorPickerActivity, float f3) {
        colorPickerActivity.wheelHue = f3;
        colorPickerActivity.QZ6("hue", new Function0() { // from class: com.alightcreative.app.motion.activities.xZD
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ColorPickerActivity.lLA(this.f45730n);
            }
        });
        colorPickerActivity.VwL();
        return Unit.INSTANCE;
    }

    private final void EWS() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 7);
        yc.psW psw = new yc.psW(this, getResources().getDimensionPixelSize(2131165317), Po6());
        yc.xq xqVar = new yc.xq(getResources().getDimensionPixelOffset(2131165310), getResources().getDimensionPixelOffset(2131165312), getResources().getDimensionPixelOffset(2131165314), 0);
        SJ0.w6 w6Var = this.binding;
        SJ0.w6 w6Var2 = null;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var = null;
        }
        w6Var.f9674o.setLayoutManager(gridLayoutManager);
        SJ0.w6 w6Var3 = this.binding;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var3 = null;
        }
        w6Var3.f9674o.addItemDecoration(xqVar);
        SJ0.w6 w6Var4 = this.binding;
        if (w6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var4 = null;
        }
        w6Var4.f9674o.setAdapter(psw);
        yc.Sw sw = new yc.Sw(psw);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(sw);
        SJ0.w6 w6Var5 = this.binding;
        if (w6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var5 = null;
        }
        itemTouchHelper.az(w6Var5.f9674o);
        SJ0.w6 w6Var6 = this.binding;
        if (w6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var6 = null;
        }
        RecyclerView recyclerView = w6Var6.f9674o;
        SJ0.w6 w6Var7 = this.binding;
        if (w6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            w6Var2 = w6Var7;
        }
        RecyclerView recyclerView2 = w6Var2.f9674o;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        recyclerView.addOnItemTouchListener(new yc.FP(this, recyclerView2, new j(psw, this, sw)));
    }

    private final void How() {
        int i2 = this.oldColor;
        SolidColor solidColorT = HI0.qf.t(i2);
        SJ0.w6 w6Var = this.binding;
        SJ0.w6 w6Var2 = null;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var = null;
        }
        w6Var.jB.setBackgroundColor(i2);
        SJ0.w6 w6Var3 = this.binding;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var3 = null;
        }
        TextView textView = w6Var3.bzg;
        String strRl = HI0.qf.rl(i2);
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = strRl.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        textView.setText(upperCase);
        SJ0.w6 w6Var4 = this.binding;
        if (w6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var4 = null;
        }
        w6Var4.Xw.setBackground(Y3a.j.O(this, 0, 1, null));
        SJ0.w6 w6Var5 = this.binding;
        if (w6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var5 = null;
        }
        w6Var5.eF.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.fg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerActivity.tUK(this.f45239n, view);
            }
        });
        float[] fArr = {0.0f, 0.0f, 0.0f};
        Color.colorToHSV(ColorKt.toInt(solidColorT), fArr);
        SJ0.w6 w6Var6 = this.binding;
        if (w6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var6 = null;
        }
        TextView textView2 = w6Var6.wTp;
        float f3 = 100;
        String str = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(fArr[1] * f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView2.setText(str);
        SJ0.w6 w6Var7 = this.binding;
        if (w6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var7 = null;
        }
        TextView textView3 = w6Var7.f9664N;
        String str2 = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(fArr[2] * f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        textView3.setText(str2);
        SJ0.w6 w6Var8 = this.binding;
        if (w6Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var8 = null;
        }
        TextView textView4 = w6Var8.f9662FX;
        String str3 = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(solidColorT.getA() * f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        textView4.setText(str3);
        SJ0.w6 w6Var9 = this.binding;
        if (w6Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var9 = null;
        }
        w6Var9.fD.setMax(255);
        SJ0.w6 w6Var10 = this.binding;
        if (w6Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var10 = null;
        }
        w6Var10.f9672g.setMax(255);
        SJ0.w6 w6Var11 = this.binding;
        if (w6Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var11 = null;
        }
        w6Var11.f9661E.setMax(255);
        SJ0.w6 w6Var12 = this.binding;
        if (w6Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var12 = null;
        }
        w6Var12.fD.setProgress((int) (((double) fArr[1]) * 255.0d));
        SJ0.w6 w6Var13 = this.binding;
        if (w6Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var13 = null;
        }
        w6Var13.f9672g.setProgress((int) (((double) fArr[2]) * 255.0d));
        SJ0.w6 w6Var14 = this.binding;
        if (w6Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var14 = null;
        }
        w6Var14.f9661E.setProgress((int) (((double) solidColorT.getA()) * 255.0d));
        SJ0.w6 w6Var15 = this.binding;
        if (w6Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var15 = null;
        }
        w6Var15.f9661E.setTileBg(Y3a.j.O(this, 0, 1, null).getBitmap());
        SJ0.w6 w6Var16 = this.binding;
        if (w6Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var16 = null;
        }
        w6Var16.aYN.setOnAngleChangedListener(new Function1() { // from class: com.alightcreative.app.motion.activities.KH
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ColorPickerActivity.ER(this.f44598n, ((Float) obj).floatValue());
            }
        });
        SJ0.w6 w6Var17 = this.binding;
        if (w6Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var17 = null;
        }
        w6Var17.aYN.setAngle(fArr[0]);
        SJ0.w6 w6Var18 = this.binding;
        if (w6Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var18 = null;
        }
        Pair pair = TuplesKt.to(w6Var18.fD, "saturation");
        SJ0.w6 w6Var19 = this.binding;
        if (w6Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var19 = null;
        }
        Pair pair2 = TuplesKt.to(w6Var19.f9672g, "brightness");
        SJ0.w6 w6Var20 = this.binding;
        if (w6Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            w6Var2 = w6Var20;
        }
        for (Pair pair3 : CollectionsKt.listOf((Object[]) new Pair[]{pair, pair2, TuplesKt.to(w6Var2.f9661E, "alpha")})) {
            Object objComponent1 = pair3.component1();
            Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
            final String str4 = (String) pair3.component2();
            ((GradientSlider) objComponent1).setListener(new Function1() { // from class: com.alightcreative.app.motion.activities.Mf
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ColorPickerActivity.kSg(this.f44660n, str4, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RQ(ColorPickerActivity colorPickerActivity, View view) {
        SJ0.w6 w6Var = colorPickerActivity.binding;
        SJ0.w6 w6Var2 = null;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var = null;
        }
        if (view.equals(w6Var.J2)) {
            view.setActivated(true);
            SJ0.w6 w6Var3 = colorPickerActivity.binding;
            if (w6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var3 = null;
            }
            w6Var3.nr.setActivated(false);
            SJ0.w6 w6Var4 = colorPickerActivity.binding;
            if (w6Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var4 = null;
            }
            w6Var4.M7.setVisibility(0);
            SJ0.w6 w6Var5 = colorPickerActivity.binding;
            if (w6Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var5 = null;
            }
            w6Var5.f9666S.setVisibility(8);
            if (colorPickerActivity.allowAlpha) {
                return;
            }
            SJ0.w6 w6Var6 = colorPickerActivity.binding;
            if (w6Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var6 = null;
            }
            w6Var6.f9661E.setVisibility(8);
            SJ0.w6 w6Var7 = colorPickerActivity.binding;
            if (w6Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var7 = null;
            }
            w6Var7.p5.setVisibility(8);
            SJ0.w6 w6Var8 = colorPickerActivity.binding;
            if (w6Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                w6Var2 = w6Var8;
            }
            w6Var2.f9662FX.setVisibility(8);
            return;
        }
        SJ0.w6 w6Var9 = colorPickerActivity.binding;
        if (w6Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var9 = null;
        }
        if (view.equals(w6Var9.nr)) {
            view.setActivated(true);
            SJ0.w6 w6Var10 = colorPickerActivity.binding;
            if (w6Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var10 = null;
            }
            w6Var10.J2.setActivated(false);
            SJ0.w6 w6Var11 = colorPickerActivity.binding;
            if (w6Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var11 = null;
            }
            w6Var11.M7.setVisibility(8);
            SJ0.w6 w6Var12 = colorPickerActivity.binding;
            if (w6Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var12 = null;
            }
            w6Var12.f9666S.setVisibility(0);
            if (colorPickerActivity.allowAlpha) {
                return;
            }
            SJ0.w6 w6Var13 = colorPickerActivity.binding;
            if (w6Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var13 = null;
            }
            w6Var13.ViF.setVisibility(8);
            SJ0.w6 w6Var14 = colorPickerActivity.binding;
            if (w6Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var14 = null;
            }
            w6Var14.ty.setVisibility(8);
            SJ0.w6 w6Var15 = colorPickerActivity.binding;
            if (w6Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                w6Var2 = w6Var15;
            }
            w6Var2.f9669X.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UhV(ColorPickerActivity colorPickerActivity, View view) {
        SJ0.w6 w6Var = colorPickerActivity.binding;
        SJ0.w6 w6Var2 = null;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var = null;
        }
        if (!(w6Var.f9674o.getAdapter() instanceof yc.psW) || colorPickerActivity.rgbNewColor == 0) {
            return;
        }
        SJ0.w6 w6Var3 = colorPickerActivity.binding;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            w6Var2 = w6Var3;
        }
        if (w6Var2.XQ.getVisibility() != 4) {
            colorPickerActivity.GD(colorPickerActivity.rgbNewColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void VwL() {
        String str;
        SJ0.w6 w6Var;
        SJ0.w6 w6Var2 = this.binding;
        if (w6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var2 = null;
        }
        float progress = w6Var2.fD.getProgress() / 255.0f;
        SJ0.w6 w6Var3 = this.binding;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var3 = null;
        }
        float progress2 = w6Var3.f9672g.getProgress() / 255.0f;
        SJ0.w6 w6Var4 = this.binding;
        if (w6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var4 = null;
        }
        float progress3 = w6Var4.f9661E.getProgress();
        SJ0.w6 w6Var5 = this.binding;
        if (w6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var5 = null;
        }
        TextView textView = w6Var5.wTp;
        float f3 = 100;
        String str2 = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(progress * f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        textView.setText(str2);
        SJ0.w6 w6Var6 = this.binding;
        if (w6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var6 = null;
        }
        TextView textView2 = w6Var6.f9664N;
        String str3 = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(progress2 * f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        textView2.setText(str3);
        SJ0.w6 w6Var7 = this.binding;
        if (w6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var7 = null;
        }
        TextView textView3 = w6Var7.f9662FX;
        String str4 = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf((progress3 / 255.0f) * f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        textView3.setText(str4);
        int iHSVToColor = Color.HSVToColor(255, new float[]{this.wheelHue, 0.0f, Math.max(0.1f, progress2)});
        int iHSVToColor2 = Color.HSVToColor(255, new float[]{this.wheelHue, 1.0f, Math.max(0.1f, progress2)});
        SJ0.w6 w6Var8 = this.binding;
        if (w6Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var8 = null;
        }
        w6Var8.fD.setThumbColor(Color.HSVToColor(255, new float[]{this.wheelHue, progress, Math.max(0.1f, progress2)}));
        SJ0.w6 w6Var9 = this.binding;
        if (w6Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var9 = null;
        }
        w6Var9.fD.n(iHSVToColor, iHSVToColor2);
        int iHSVToColor3 = Color.HSVToColor(255, new float[]{this.wheelHue, progress, 0.0f});
        int iHSVToColor4 = Color.HSVToColor(255, new float[]{this.wheelHue, progress, 1.0f});
        SJ0.w6 w6Var10 = this.binding;
        if (w6Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var10 = null;
        }
        w6Var10.f9672g.setThumbColor(Color.HSVToColor(255, new float[]{this.wheelHue, progress, progress2}));
        SJ0.w6 w6Var11 = this.binding;
        if (w6Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var11 = null;
        }
        w6Var11.f9672g.n(iHSVToColor3, iHSVToColor4);
        int iHSVToColor5 = Color.HSVToColor(0, new float[]{this.wheelHue, progress, progress2});
        int iHSVToColor6 = Color.HSVToColor(255, new float[]{this.wheelHue, progress, progress2});
        SJ0.w6 w6Var12 = this.binding;
        if (w6Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var12 = null;
        }
        int i2 = (int) progress3;
        w6Var12.f9661E.setThumbColor(Color.HSVToColor(i2, new float[]{this.wheelHue, progress, progress2}));
        SJ0.w6 w6Var13 = this.binding;
        if (w6Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var13 = null;
        }
        w6Var13.f9661E.n(iHSVToColor5, iHSVToColor6);
        this.wheelNewColor = Color.HSVToColor(i2, new float[]{this.wheelHue, progress, progress2});
        SJ0.w6 w6Var14 = this.binding;
        if (w6Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var14 = null;
        }
        TextView textView4 = w6Var14.bzg;
        if (this.allowAlpha) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str5 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.wheelNewColor & 16777215)}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            str = str5 + " (" + ((int) ((Color.alpha(this.wheelNewColor) / 255.0f) * 100.0f)) + "%)";
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.wheelNewColor & 16777215)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        textView4.setText(str);
        SJ0.w6 w6Var15 = this.binding;
        if (w6Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var15 = null;
        }
        w6Var15.eF.setBackgroundColor(this.wheelNewColor);
        SJ0.w6 w6Var16 = this.binding;
        if (w6Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var16 = null;
        }
        if (w6Var16.f9674o.getAdapter() != null) {
            SJ0.w6 w6Var17 = this.binding;
            if (w6Var17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var17 = null;
            }
            ImageView imageView = w6Var17.f9677v;
            SJ0.w6 w6Var18 = this.binding;
            if (w6Var18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var = null;
            } else {
                w6Var = w6Var18;
            }
            RecyclerView.Adapter adapter = w6Var.f9674o.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorSelectorAdapter");
            imageView.setVisibility(((yc.psW) adapter).ck(this.wheelNewColor) ? 4 : 0);
        }
    }

    private final void hRu() {
        int i2 = this.oldColor;
        SolidColor solidColorT = HI0.qf.t(i2);
        SJ0.w6 w6Var = this.binding;
        SJ0.w6 w6Var2 = null;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var = null;
        }
        w6Var.xMQ.setBackgroundColor(i2);
        SJ0.w6 w6Var3 = this.binding;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var3 = null;
        }
        TextView textView = w6Var3.f9665O;
        String strRl = HI0.qf.rl(i2);
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = strRl.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        textView.setText(upperCase);
        SJ0.w6 w6Var4 = this.binding;
        if (w6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var4 = null;
        }
        w6Var4.KN.setBackground(Y3a.j.O(this, 0, 1, null));
        SJ0.w6 w6Var5 = this.binding;
        if (w6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var5 = null;
        }
        w6Var5.f9675r.setBackgroundColor(i2);
        SJ0.w6 w6Var6 = this.binding;
        if (w6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var6 = null;
        }
        w6Var6.f9675r.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.LEl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerActivity.UhV(this.f44616n, view);
            }
        });
        SJ0.w6 w6Var7 = this.binding;
        if (w6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var7 = null;
        }
        float f3 = 255;
        w6Var7.s7N.setText(String.valueOf(MathKt.roundToInt(solidColorT.getR() * f3)));
        SJ0.w6 w6Var8 = this.binding;
        if (w6Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var8 = null;
        }
        w6Var8.nHg.setText(String.valueOf(MathKt.roundToInt(solidColorT.getG() * f3)));
        SJ0.w6 w6Var9 = this.binding;
        if (w6Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var9 = null;
        }
        w6Var9.f9667T.setText(String.valueOf(MathKt.roundToInt(solidColorT.getB() * f3)));
        SJ0.w6 w6Var10 = this.binding;
        if (w6Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var10 = null;
        }
        w6Var10.f9669X.setText(String.valueOf(MathKt.roundToInt(solidColorT.getA() * f3)));
        SJ0.w6 w6Var11 = this.binding;
        if (w6Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var11 = null;
        }
        w6Var11.iF.setMax(255);
        SJ0.w6 w6Var12 = this.binding;
        if (w6Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var12 = null;
        }
        w6Var12.te.setMax(255);
        SJ0.w6 w6Var13 = this.binding;
        if (w6Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var13 = null;
        }
        w6Var13.nY.setMax(255);
        SJ0.w6 w6Var14 = this.binding;
        if (w6Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var14 = null;
        }
        w6Var14.ViF.setMax(255);
        SJ0.w6 w6Var15 = this.binding;
        if (w6Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var15 = null;
        }
        w6Var15.iF.setProgress((int) (((double) solidColorT.getR()) * 255.0d));
        SJ0.w6 w6Var16 = this.binding;
        if (w6Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var16 = null;
        }
        w6Var16.te.setProgress((int) (((double) solidColorT.getG()) * 255.0d));
        SJ0.w6 w6Var17 = this.binding;
        if (w6Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var17 = null;
        }
        w6Var17.nY.setProgress((int) (((double) solidColorT.getB()) * 255.0d));
        SJ0.w6 w6Var18 = this.binding;
        if (w6Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var18 = null;
        }
        w6Var18.ViF.setProgress((int) (((double) solidColorT.getA()) * 255.0d));
        SJ0.w6 w6Var19 = this.binding;
        if (w6Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var19 = null;
        }
        w6Var19.ViF.setTileBg(Y3a.j.O(this, 0, 1, null).getBitmap());
        SJ0.w6 w6Var20 = this.binding;
        if (w6Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var20 = null;
        }
        Pair pair = TuplesKt.to(w6Var20.iF, "red");
        SJ0.w6 w6Var21 = this.binding;
        if (w6Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var21 = null;
        }
        Pair pair2 = TuplesKt.to(w6Var21.te, "green");
        SJ0.w6 w6Var22 = this.binding;
        if (w6Var22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var22 = null;
        }
        Pair pair3 = TuplesKt.to(w6Var22.nY, "blue");
        SJ0.w6 w6Var23 = this.binding;
        if (w6Var23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            w6Var2 = w6Var23;
        }
        for (Pair pair4 : CollectionsKt.listOf((Object[]) new Pair[]{pair, pair2, pair3, TuplesKt.to(w6Var2.ViF, "alpha")})) {
            Object objComponent1 = pair4.component1();
            Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
            final String str = (String) pair4.component2();
            ((GradientSlider) objComponent1).setListener(new Function1() { // from class: com.alightcreative.app.motion.activities.gnv
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ColorPickerActivity.i(this.f45257n, str, ((Integer) obj).intValue());
                }
            });
        }
        tFV();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(final ColorPickerActivity colorPickerActivity, final String str, int i2) {
        colorPickerActivity.QZ6(str, new Function0() { // from class: com.alightcreative.app.motion.activities.OU
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ColorPickerActivity.K(this.f44711n, str);
            }
        });
        colorPickerActivity.tFV();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kSg(final ColorPickerActivity colorPickerActivity, final String str, int i2) {
        colorPickerActivity.QZ6(str, new Function0() { // from class: com.alightcreative.app.motion.activities.o7q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ColorPickerActivity.W(this.f45563n, str);
            }
        });
        colorPickerActivity.VwL();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tFV() {
        String str;
        SJ0.w6 w6Var = this.binding;
        SJ0.w6 w6Var2 = null;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var = null;
        }
        float progress = w6Var.iF.getProgress() / 255.0f;
        SJ0.w6 w6Var3 = this.binding;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var3 = null;
        }
        float progress2 = w6Var3.te.getProgress() / 255.0f;
        SJ0.w6 w6Var4 = this.binding;
        if (w6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var4 = null;
        }
        float progress3 = w6Var4.nY.getProgress() / 255.0f;
        SJ0.w6 w6Var5 = this.binding;
        if (w6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var5 = null;
        }
        float progress4 = w6Var5.ViF.getProgress() / 255.0f;
        SJ0.w6 w6Var6 = this.binding;
        if (w6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var6 = null;
        }
        float f3 = 255;
        w6Var6.s7N.setText(String.valueOf(MathKt.roundToInt(progress * f3)));
        SJ0.w6 w6Var7 = this.binding;
        if (w6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var7 = null;
        }
        w6Var7.nHg.setText(String.valueOf(MathKt.roundToInt(progress2 * f3)));
        SJ0.w6 w6Var8 = this.binding;
        if (w6Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var8 = null;
        }
        w6Var8.f9667T.setText(String.valueOf(MathKt.roundToInt(progress3 * f3)));
        SJ0.w6 w6Var9 = this.binding;
        if (w6Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var9 = null;
        }
        w6Var9.f9669X.setText(String.valueOf(MathKt.roundToInt(f3 * progress4)));
        int i2 = ColorKt.toInt(new SolidColor(0.0f, progress2, progress3, 1.0f));
        int i3 = ColorKt.toInt(new SolidColor(1.0f, progress2, progress3, 1.0f));
        SJ0.w6 w6Var10 = this.binding;
        if (w6Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var10 = null;
        }
        w6Var10.iF.setThumbColor(ColorKt.toInt(new SolidColor(progress, progress2, progress3, 1.0f)));
        SJ0.w6 w6Var11 = this.binding;
        if (w6Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var11 = null;
        }
        w6Var11.iF.n(i2, i3);
        int i5 = ColorKt.toInt(new SolidColor(progress, 0.0f, progress3, 1.0f));
        int i7 = ColorKt.toInt(new SolidColor(progress, 1.0f, progress3, 1.0f));
        SJ0.w6 w6Var12 = this.binding;
        if (w6Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var12 = null;
        }
        w6Var12.te.setThumbColor(ColorKt.toInt(new SolidColor(progress, progress2, progress3, 1.0f)));
        SJ0.w6 w6Var13 = this.binding;
        if (w6Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var13 = null;
        }
        w6Var13.te.n(i5, i7);
        int i8 = ColorKt.toInt(new SolidColor(progress, progress2, 0.0f, 1.0f));
        int i9 = ColorKt.toInt(new SolidColor(progress, progress2, 1.0f, 1.0f));
        SJ0.w6 w6Var14 = this.binding;
        if (w6Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var14 = null;
        }
        w6Var14.nY.setThumbColor(ColorKt.toInt(new SolidColor(progress, progress2, progress3, 1.0f)));
        SJ0.w6 w6Var15 = this.binding;
        if (w6Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var15 = null;
        }
        w6Var15.nY.n(i8, i9);
        int i10 = ColorKt.toInt(new SolidColor(progress, progress2, progress3, 0.0f));
        int i11 = ColorKt.toInt(new SolidColor(progress, progress2, progress3, 1.0f));
        SJ0.w6 w6Var16 = this.binding;
        if (w6Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var16 = null;
        }
        w6Var16.ViF.setThumbColor(ColorKt.toInt(new SolidColor(progress, progress2, progress3, progress4)));
        SJ0.w6 w6Var17 = this.binding;
        if (w6Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var17 = null;
        }
        w6Var17.ViF.n(i10, i11);
        this.rgbNewColor = ColorKt.toInt(new SolidColor(progress, progress2, progress3, progress4));
        SJ0.w6 w6Var18 = this.binding;
        if (w6Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var18 = null;
        }
        TextView textView = w6Var18.f9665O;
        if (this.allowAlpha) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.rgbNewColor & 16777215)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            str = str2 + " (" + ((int) ((Color.alpha(this.rgbNewColor) / 255.0f) * 100.0f)) + "%)";
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.rgbNewColor & 16777215)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        textView.setText(str);
        SJ0.w6 w6Var19 = this.binding;
        if (w6Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var19 = null;
        }
        w6Var19.f9675r.setBackgroundColor(this.rgbNewColor);
        SJ0.w6 w6Var20 = this.binding;
        if (w6Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var20 = null;
        }
        if (w6Var20.f9674o.getAdapter() != null) {
            SJ0.w6 w6Var21 = this.binding;
            if (w6Var21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                w6Var21 = null;
            }
            ImageView imageView = w6Var21.XQ;
            SJ0.w6 w6Var22 = this.binding;
            if (w6Var22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                w6Var2 = w6Var22;
            }
            RecyclerView.Adapter adapter = w6Var2.f9674o.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorSelectorAdapter");
            imageView.setVisibility(((yc.psW) adapter).ck(this.rgbNewColor) ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tUK(ColorPickerActivity colorPickerActivity, View view) {
        SJ0.w6 w6Var = colorPickerActivity.binding;
        SJ0.w6 w6Var2 = null;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var = null;
        }
        if (!(w6Var.f9674o.getAdapter() instanceof yc.psW) || colorPickerActivity.wheelNewColor == 0) {
            return;
        }
        SJ0.w6 w6Var3 = colorPickerActivity.binding;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            w6Var2 = w6Var3;
        }
        if (w6Var2.f9677v.getVisibility() != 4) {
            colorPickerActivity.GD(colorPickerActivity.wheelNewColor);
        }
    }

    public final QmE.iF Po6() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // android.app.Activity
    public void finish() {
        Intent intent = new Intent();
        SJ0.w6 w6Var = this.binding;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var = null;
        }
        if (w6Var.J2.isActivated()) {
            com.alightcreative.app.motion.persist.j.INSTANCE.setColorTab("wheel");
            intent.putExtra("NEW_COLOR", this.wheelNewColor);
        } else {
            com.alightcreative.app.motion.persist.j.INSTANCE.setColorTab("rgb");
            intent.putExtra("NEW_COLOR", this.rgbNewColor);
        }
        intent.putExtra("OLD_COLOR", this.oldColor);
        intent.putExtra("CHANGED_COLOR", this.changedColors);
        intent.putExtra("COLOR_LENS", this.lensString);
        setResult(-1, intent);
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(ColorPickerActivity colorPickerActivity, View view) {
        colorPickerActivity.finish();
    }

    private final void GD(int addColor) {
        yc.psW psw;
        SJ0.w6 w6Var = null;
        Po6().n(new j.fuX("palette_edit_add_color", null, 2, null));
        SJ0.w6 w6Var2 = this.binding;
        if (w6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var2 = null;
        }
        RecyclerView.Adapter adapter = w6Var2.f9674o.getAdapter();
        if (adapter instanceof yc.psW) {
            psw = (yc.psW) adapter;
        } else {
            psw = null;
        }
        if (psw == null) {
            return;
        }
        this.changedColors = true;
        psw.HI(addColor);
        SJ0.w6 w6Var3 = this.binding;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var3 = null;
        }
        w6Var3.f9674o.smoothScrollToPosition(psw.getItemCount());
        SJ0.w6 w6Var4 = this.binding;
        if (w6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var4 = null;
        }
        w6Var4.f9677v.setVisibility(4);
        SJ0.w6 w6Var5 = this.binding;
        if (w6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            w6Var = w6Var5;
        }
        w6Var.XQ.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(ColorPickerActivity colorPickerActivity, String str) {
        QmE.iF iFVarPo6 = colorPickerActivity.Po6();
        Bundle bundle = new Bundle();
        bundle.putString("control", str);
        Unit unit = Unit.INSTANCE;
        iFVarPo6.n(new j.fuX("palette_adjust_rgba", bundle));
        return Unit.INSTANCE;
    }

    private final void QZ6(String tag, Function0 action) {
        long jNanoTime = System.nanoTime();
        Map map = this.lastThrottledCall;
        Object obj = map.get(tag);
        if (obj == null) {
            obj = 0L;
            map.put(tag, obj);
        }
        if ((jNanoTime - ((Number) obj).longValue()) / 1000000 > 15000) {
            action.invoke();
        }
        this.lastThrottledCall.put(tag, Long.valueOf(jNanoTime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(ColorPickerActivity colorPickerActivity, String str) {
        QmE.iF iFVarPo6 = colorPickerActivity.Po6();
        Bundle bundle = new Bundle();
        bundle.putString("control", str);
        Unit unit = Unit.INSTANCE;
        iFVarPo6.n(new j.fuX("palette_adjust_hsva", bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat a63(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNull(view);
        view.setPadding(view.getPaddingLeft(), insetsJ2.rl, view.getPaddingRight(), insetsJ2.nr);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lLA(ColorPickerActivity colorPickerActivity) {
        QmE.iF iFVarPo6 = colorPickerActivity.Po6();
        Bundle bundle = new Bundle();
        bundle.putString("control", "hue");
        Unit unit = Unit.INSTANCE;
        iFVarPo6.n(new j.fuX("palette_adjust_hsva", bundle));
        return Unit.INSTANCE;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.alightcreative.app.motion.activities.AbstractActivityC1734q, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SJ0.w6 w6VarT = SJ0.w6.t(getLayoutInflater());
        this.binding = w6VarT;
        SJ0.w6 w6Var = null;
        if (w6VarT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6VarT = null;
        }
        setContentView(w6VarT.getRoot());
        SJ0.w6 w6Var2 = this.binding;
        if (w6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var2 = null;
        }
        ViewCompat.Org(w6Var2.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.alightcreative.app.motion.activities.p
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return ColorPickerActivity.a63(view, windowInsetsCompat);
            }
        });
        String stringExtra = getIntent().getStringExtra("COLOR_LENS");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.lensString = stringExtra;
        this.allowAlpha = getIntent().getBooleanExtra("ALLOW_ALPHA", true);
        this.oldColor = getIntent().getIntExtra("CURRENT_COLOR", 0);
        SJ0.w6 w6Var3 = this.binding;
        if (w6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var3 = null;
        }
        w6Var3.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerActivity.F(this.f44705n, view);
            }
        });
        SJ0.w6 w6Var4 = this.binding;
        if (w6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var4 = null;
        }
        w6Var4.J2.setOnClickListener(this.onClickListener);
        SJ0.w6 w6Var5 = this.binding;
        if (w6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            w6Var5 = null;
        }
        w6Var5.nr.setOnClickListener(this.onClickListener);
        if (Intrinsics.areEqual(com.alightcreative.app.motion.persist.j.INSTANCE.getColorTab(), "wheel")) {
            SJ0.w6 w6Var6 = this.binding;
            if (w6Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                w6Var = w6Var6;
            }
            w6Var.J2.callOnClick();
        } else {
            SJ0.w6 w6Var7 = this.binding;
            if (w6Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                w6Var = w6Var7;
            }
            w6Var.nr.callOnClick();
        }
        EWS();
        hRu();
        How();
    }
}
