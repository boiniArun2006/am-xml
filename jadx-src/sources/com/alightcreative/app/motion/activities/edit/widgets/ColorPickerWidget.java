package com.alightcreative.app.motion.activities.edit.widgets;

import HI0.o7q;
import HI0.qf;
import HW.C;
import LdY.Ml;
import QmE.iF;
import QmE.j;
import SJ0.Su;
import aT.dE.JLZo;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.ImageViewCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.SolidColorHSV;
import com.alightcreative.app.motion.scene.SpoidEnv;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.widget.Md;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.RedirectEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import yc.DAz;
import yc.RP;
import yc.iy;
import yc.psW;
import yc.xq;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005\u0091\u0001*\u0092\u0001B+\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001bJ\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u001c¢\u0006\u0004\b\u0018\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J7\u0010*\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010\u001fJ\u000f\u0010-\u001a\u00020\u0014H\u0002¢\u0006\u0004\b-\u0010\u001fJ\u0013\u0010.\u001a\u00020\t*\u00020\u0012H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00142\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b4\u00103J\u001f\u00106\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u00105\u001a\u00020 H\u0002¢\u0006\u0004\b6\u00107R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010E\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010BR$\u0010O\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010W\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010_\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010g\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010m\u001a\u00020 2\u0006\u0010@\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010\"\"\u0004\bk\u0010lR$\u0010u\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010iR\u0016\u0010y\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010iR\u0017\u0010\u007f\u001a\u00020z8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0018\u0010\u0081\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010iR\u0019\u0010\u0084\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010\u0083\u0001R\u0017\u0010\u0086\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010iR\u001b\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u0088\u0001R*\u0010\u008c\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0087\u0001\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010\u008b\u0001R\"\u0010\u0090\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget;", "Landroid/widget/RelativeLayout;", "Lyc/iy;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Lyc/DAz;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "key", "", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", TtmlNode.ATTR_TTS_COLOR, "setColor", "(I)V", "Lcom/alightcreative/app/motion/scene/SolidColor;", "(Lcom/alightcreative/app/motion/scene/SolidColor;)V", "Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "(Lcom/alightcreative/app/motion/scene/SolidColorHSV;)V", "M7", "()V", "", "onBackPressed", "()Z", "Landroid/view/MotionEvent;", "motionEvent", "", "sceneX", "sceneY", "previewW", "previewH", c.f62177j, "(Landroid/view/MotionEvent;FFFF)Z", "D", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "P5", "(Ljava/lang/String;)I", "Landroid/view/View;", "view", "eF", "(Landroid/view/View;)V", "M", RedirectEvent.f62801i, "p5", "(Lcom/alightcreative/app/motion/scene/SolidColorHSV;Z)V", "LQmE/iF;", "O", "LQmE/iF;", "getEventLogger", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "value", "J2", "Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "getSelectedColor", "()Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "selectedColor", "r", "notifiedColor", "Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$j;", "o", "Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$j;", "getOnColorChangeListener", "()Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$j;", "setOnColorChangeListener", "(Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$j;)V", "onColorChangeListener", "Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$w6;", "S", "Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$w6;", "getSpoidEventListener", "()Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$w6;", "setSpoidEventListener", "(Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$w6;)V", "spoidEventListener", "Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$n;", "g", "Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$n;", "getPalletteClickListener", "()Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$n;", "setPalletteClickListener", "(Lcom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget$n;)V", "palletteClickListener", "Lcom/alightcreative/app/motion/scene/SceneHolder;", "E2", "Lcom/alightcreative/app/motion/scene/SceneHolder;", "getSceneHolder", "()Lcom/alightcreative/app/motion/scene/SceneHolder;", "setSceneHolder", "(Lcom/alightcreative/app/motion/scene/SceneHolder;)V", "sceneHolder", "e", "Z", "getAllowAlpha", "setAllowAlpha", "(Z)V", "allowAlpha", "LLdY/Ml$j;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LLdY/Ml$j;", "getUndoBatch", "()LLdY/Ml$j;", "setUndoBatch", "(LLdY/Ml$j;)V", "undoBatch", "N", "miniPickerShown", "v", "alphaShown", "LSJ0/Su;", "Xw", "LSJ0/Su;", "getBinding", "()LSJ0/Su;", "binding", "jB", "isAnimRunning", "U", "F", "dragStartX", "dragStartY", "dragging", "Lcom/alightcreative/app/motion/scene/Vector2D;", "Lcom/alightcreative/app/motion/scene/Vector2D;", "requestCbLocation", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "spoidCallback", "Lkotlin/Function0;", "E", "Lkotlin/jvm/functions/Function0;", "processDragEnd", "j", "w6", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorPickerWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorPickerWidget.kt\ncom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,508:1\n434#2:509\n507#2,5:510\n1863#3,2:515\n1863#3,2:517\n1#4:519\n*S KotlinDebug\n*F\n+ 1 ColorPickerWidget.kt\ncom/alightcreative/app/motion/activities/edit/widgets/ColorPickerWidget\n*L\n333#1:509\n333#1:510,5\n417#1:515,2\n418#1:517,2\n*E\n"})
public final class ColorPickerWidget extends com.alightcreative.app.motion.activities.edit.widgets.j implements iy, SharedPreferences.OnSharedPreferenceChangeListener, DAz {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Function0 processDragEnd;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private SceneHolder sceneHolder;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private SolidColorHSV selectedColor;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean dragging;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean miniPickerShown;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private float dragStartY;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private w6 spoidEventListener;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private float dragStartX;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final Su binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean allowAlpha;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final Function2 spoidCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private n palletteClickListener;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isAnimRunning;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private j onColorChangeListener;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private Vector2D requestCbLocation;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SolidColorHSV notifiedColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean alphaShown;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class I28 implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        I28() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ColorPickerWidget.this.isAnimRunning = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ColorPickerWidget.this.isAnimRunning = false;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public /* synthetic */ class Ml {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Md.values().length];
            try {
                iArr[Md.f47166n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Md.f47169t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Md.f47165O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Md.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface j {
        void n(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface n {
        void n(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface w6 {
        void n();

        void nr();

        void rl();

        void t();
    }

    public ColorPickerWidget(final Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        SolidColorHSV.Companion companion = SolidColorHSV.INSTANCE;
        this.selectedColor = companion.getBLACK();
        this.notifiedColor = companion.getBLACK();
        this.allowAlpha = true;
        C.E(this);
        Su suT = Su.t(LayoutInflater.from(context), this, true);
        this.binding = suT;
        if (!(context instanceof EditActivity)) {
            suT.mUb.setVisibility(8);
            suT.KN.setBackground(ResourcesCompat.J2(getResources(), 2131231264, null));
        }
        suT.xMQ.setLayoutManager(new GridLayoutManager(context, 7));
        suT.xMQ.addItemDecoration(new xq(getResources().getDimensionPixelOffset(2131165309), getResources().getDimensionPixelOffset(2131165311), getResources().getDimensionPixelOffset(2131165313), 0));
        psW psw = new psW(context, getEventLogger());
        suT.xMQ.setAdapter(psw);
        RecyclerView.Adapter adapter = suT.xMQ.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorSelectorAdapter");
        ((psW) adapter).nY(new Function1() { // from class: yU.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ColorPickerWidget.te(this.f75605n, ((Integer) obj).intValue());
            }
        });
        setColor(psw.Ik(0));
        suT.KN.setOnClickListener(new View.OnClickListener() { // from class: yU.UGc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerWidget.iF(this.f75628n, view);
            }
        });
        suT.mUb.setOnClickListener(new View.OnClickListener() { // from class: yU.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerWidget.nHg(context, this, view);
            }
        });
        suT.Uo.setOnClickListener(new View.OnClickListener() { // from class: yU.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerWidget.s7N(this.f75665n, view);
            }
        });
        ConstraintLayout colorMiniPickerHolder = suT.J2;
        Intrinsics.checkNotNullExpressionValue(colorMiniPickerHolder, "colorMiniPickerHolder");
        o7q.gh(colorMiniPickerHolder);
        suT.gh.setBackground(Y3a.j.J2(this, 0, 1, null));
        suT.te.setBackground(Y3a.j.J2(this, 0, 1, null));
        suT.rl.setOnClickListener(new View.OnClickListener() { // from class: yU.SPz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerWidget.wTp(this.f75626n, view);
            }
        });
        suT.fD.setOnLongClickListener(new View.OnLongClickListener() { // from class: yU.ci
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ColorPickerWidget.v(this.f75639n, context, view);
            }
        });
        suT.HI.setOnClickListener(new View.OnClickListener() { // from class: yU.Wre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerWidget.rV9(context, this, view);
            }
        });
        suT.ViF.setOnClickListener(new View.OnClickListener() { // from class: yU.CN3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerWidget.fD(context, this, view);
            }
        });
        suT.ty.setOnClickListener(new View.OnClickListener() { // from class: yU.fuX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColorPickerWidget.E2(this.f75642n, view);
            }
        });
        if (this.allowAlpha) {
            suT.f9330t.setOnClickListener(new View.OnClickListener() { // from class: yU.Dsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ColorPickerWidget.e(this.f75604n, view);
                }
            });
        } else {
            suT.f9330t.setVisibility(8);
        }
        this.alphaShown = com.alightcreative.app.motion.persist.j.INSTANCE.getMiniColorPickerExpandAlpha();
        a();
        suT.iF.setColorChangeListener(bzg(this, new Function1() { // from class: yU.eO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ColorPickerWidget.X(this.f75641n, (SolidColorHSV) obj);
            }
        }));
        suT.ck.setColorChangeListener(bzg(this, new Function1() { // from class: yU.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ColorPickerWidget.T(this.f75649n, (SolidColorHSV) obj);
            }
        }));
        suT.nr.setColorChangeListener(bzg(this, new Function1() { // from class: yU.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ColorPickerWidget.N(this.f75638n, (SolidColorHSV) obj);
            }
        }));
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(this);
        this.spoidCallback = new Function2() { // from class: yU.s4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ColorPickerWidget.B(this.f75667n, (Vector2D) obj, (SolidColor) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(ColorPickerWidget colorPickerWidget) {
        colorPickerWidget.dragging = false;
        if (!Intrinsics.areEqual(colorPickerWidget.notifiedColor, colorPickerWidget.selectedColor)) {
            SolidColorHSV solidColorHSV = colorPickerWidget.selectedColor;
            colorPickerWidget.notifiedColor = solidColorHSV;
            j jVar = colorPickerWidget.onColorChangeListener;
            if (jVar != null) {
                jVar.n(ColorKt.toInt(solidColorHSV));
            }
        }
        w6 w6Var = colorPickerWidget.spoidEventListener;
        if (w6Var != null) {
            w6Var.n();
        }
        colorPickerWidget.processDragEnd = null;
        return Unit.INSTANCE;
    }

    private final void p5(SolidColorHSV color, boolean internal) {
        if (Intrinsics.areEqual(this.selectedColor, color)) {
            return;
        }
        this.selectedColor = color;
        if (!internal) {
            this.notifiedColor = color;
        }
        this.binding.fD.setText(ColorKt.toHexColorRef$default(color, this.allowAlpha, false, 2, (Object) null));
        this.binding.f9329r.setText(ColorKt.toHexColorRef(this.selectedColor, this.allowAlpha, true));
        this.binding.gh.setImageDrawable(new ColorDrawable(ColorKt.toInt(color)));
        int i2 = (ColorKt.getY(ColorKt.toRGB(color)) > 0.5f || color.getA() < 0.5f) ? -16777216 : -1;
        Su su = this.binding;
        Iterator it = CollectionsKt.listOf((Object[]) new TextView[]{su.fD, su.f9329r, su.f9324S, su.f9325Z, su.aYN, su.f9328o}).iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setTextColor(i2);
        }
        Su su2 = this.binding;
        Iterator it2 = CollectionsKt.listOf((Object[]) new AppCompatImageView[]{su2.XQ, su2.WPU}).iterator();
        while (it2.hasNext()) {
            ImageViewCompat.t((AppCompatImageView) it2.next(), ColorStateList.valueOf(i2));
        }
        if (this.binding.xMQ.getAdapter() != null) {
            Su su3 = this.binding;
            ImageView imageView = su3.rl;
            RecyclerView.Adapter adapter = su3.xMQ.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorSelectorAdapter");
            imageView.setVisibility(((psW) adapter).ck(ColorKt.toInt(this.selectedColor)) ? 4 : 0);
        }
        this.binding.iF.setSelectedColor(this.selectedColor);
        this.binding.ck.setSelectedColor(this.selectedColor);
        this.binding.nr.setSelectedColor(this.selectedColor);
    }

    public final void setColor(int color) {
        p5(qf.nr(color), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(final ColorPickerWidget colorPickerWidget, final Vector2D location, final SolidColor color) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(color, "color");
        colorPickerWidget.binding.fD.post(new Runnable() { // from class: yU.Pl
            @Override // java.lang.Runnable
            public final void run() {
                ColorPickerWidget.J(this.f75621n, location, color);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void D() {
        boolean z2 = this.miniPickerShown;
        this.miniPickerShown = !z2;
        this.binding.J2.setVisibility(!z2 ? 0 : 8);
        this.binding.Uo.setActivated(this.miniPickerShown);
        if (this.miniPickerShown) {
            getEventLogger().n(new j.fuX("colorpicker_button_mini", null, 2, 0 == true ? 1 : 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(View view, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        view.setClipBounds(new Rect(0, 0, view.getWidth(), iIntValue));
        if (view.getVisibility() != 4 || iIntValue <= 0) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(ColorPickerWidget colorPickerWidget, View view) {
        RelativeLayout copyPasteHolder = colorPickerWidget.binding.az;
        Intrinsics.checkNotNullExpressionValue(copyPasteHolder, "copyPasteHolder");
        colorPickerWidget.M(copyPasteHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FX(ColorPickerWidget colorPickerWidget, View view, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        colorPickerWidget.isAnimRunning = true;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        view.setClipBounds(new Rect(0, 0, view.getWidth(), iIntValue));
        if (iIntValue <= 2) {
            view.setVisibility(4);
        }
    }

    public static String HI(NotImplementedError notImplementedError) {
        return "Error - paste color code : " + notImplementedError;
    }

    public static String Ik(IllegalStateException illegalStateException) {
        return "Error - paste color code : " + illegalStateException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(ColorPickerWidget colorPickerWidget, Vector2D vector2D, SolidColor solidColor) {
        Function0 function0;
        if (colorPickerWidget.dragging) {
            if (colorPickerWidget.processDragEnd == null || Intrinsics.areEqual(colorPickerWidget.requestCbLocation, vector2D)) {
                colorPickerWidget.p5(ColorKt.toHSV(solidColor), true);
            }
            if (!Intrinsics.areEqual(colorPickerWidget.requestCbLocation, vector2D) || (function0 = colorPickerWidget.processDragEnd) == null) {
                return;
            }
            function0.invoke();
        }
    }

    private final void M(final View view) {
        if (this.isAnimRunning) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getHeight(), 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yU.qz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ColorPickerWidget.FX(this.f75664n, view, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new I28());
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(ColorPickerWidget colorPickerWidget, SolidColorHSV it) {
        Intrinsics.checkNotNullParameter(it, "it");
        colorPickerWidget.binding.f9329r.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(ColorPickerWidget colorPickerWidget, SolidColorHSV it) {
        Intrinsics.checkNotNullParameter(it, "it");
        colorPickerWidget.binding.f9328o.setVisibility(0);
        colorPickerWidget.binding.f9325Z.setVisibility(0);
        AppCompatTextView appCompatTextView = colorPickerWidget.binding.f9325Z;
        String str = String.format("%.0fº", Arrays.copyOf(new Object[]{Float.valueOf(it.getH())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        appCompatTextView.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(ColorPickerWidget colorPickerWidget, SolidColorHSV it) {
        Intrinsics.checkNotNullParameter(it, "it");
        colorPickerWidget.binding.XQ.setVisibility(0);
        colorPickerWidget.binding.WPU.setVisibility(0);
        colorPickerWidget.binding.f9324S.setVisibility(0);
        colorPickerWidget.binding.aYN.setVisibility(0);
        AppCompatTextView appCompatTextView = colorPickerWidget.binding.f9324S;
        String str = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(it.getS() * 100.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        appCompatTextView.setText(StringsKt.padEnd(str, 4, (char) 8199));
        AppCompatTextView appCompatTextView2 = colorPickerWidget.binding.aYN;
        String str2 = String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(it.getV() * 100.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        appCompatTextView2.setText(StringsKt.padEnd(str2, 4, (char) 8199));
        return Unit.INSTANCE;
    }

    private final void a() {
        this.binding.f9330t.setRotation(this.alphaShown ? 0.0f : 180.0f);
        this.binding.f9330t.setVisibility(this.allowAlpha ? 0 : 4);
        this.binding.nr.setVisibility((this.allowAlpha && this.alphaShown) ? 0 : 8);
    }

    private static final Function2 bzg(final ColorPickerWidget colorPickerWidget, final Function1 function1) {
        return new Function2() { // from class: yU.Xo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ColorPickerWidget.jB(this.f75631n, function1, (SolidColorHSV) obj, (com.alightcreative.widget.Md) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(ColorPickerWidget colorPickerWidget, View view) {
        colorPickerWidget.alphaShown = !colorPickerWidget.alphaShown;
        colorPickerWidget.getEventLogger().n(new j.fuX("colorpicker_toggle_alpha", null, 2, 0 == true ? 1 : 0));
        com.alightcreative.app.motion.persist.j.INSTANCE.setMiniColorPickerExpandAlpha(colorPickerWidget.alphaShown);
        colorPickerWidget.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fD(Context context, ColorPickerWidget colorPickerWidget, View view) {
        CharSequence text;
        if (context != null) {
            Object systemService = context.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            ClipData.Item itemAt = primaryClip != null ? primaryClip.getItemAt(0) : null;
            if (itemAt == null || (text = itemAt.getText()) == null) {
                text = JLZo.FKm;
            }
            try {
                SolidColorHSV solidColorHSVNr = qf.nr(colorPickerWidget.P5(text.toString()));
                if (!Intrinsics.areEqual(solidColorHSVNr, colorPickerWidget.notifiedColor)) {
                    iF eventLogger = colorPickerWidget.getEventLogger();
                    Bundle bundle = new Bundle();
                    bundle.putString(FileUploadManager.f61572j, "paste");
                    Unit unit = Unit.INSTANCE;
                    eventLogger.n(new j.fuX("colorpicker_copypaste", bundle));
                    colorPickerWidget.setColor(solidColorHSVNr);
                    colorPickerWidget.notifiedColor = solidColorHSVNr;
                    j jVar = colorPickerWidget.onColorChangeListener;
                    if (jVar != null) {
                        jVar.n(ColorKt.toInt(solidColorHSVNr));
                    }
                }
            } catch (IllegalStateException e2) {
                XoT.C.mUb(colorPickerWidget, new Function0() { // from class: yU.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ColorPickerWidget.Ik(e2);
                    }
                });
            } catch (NumberFormatException e3) {
                XoT.C.mUb(colorPickerWidget, new Function0() { // from class: yU.aC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ColorPickerWidget.qie(e3);
                    }
                });
            } catch (NotImplementedError e4) {
                XoT.C.mUb(colorPickerWidget, new Function0() { // from class: yU.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ColorPickerWidget.HI(e4);
                    }
                });
            }
            RelativeLayout copyPasteHolder = colorPickerWidget.binding.az;
            Intrinsics.checkNotNullExpressionValue(copyPasteHolder, "copyPasteHolder");
            colorPickerWidget.M(copyPasteHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void iF(ColorPickerWidget colorPickerWidget, View view) {
        n nVar = colorPickerWidget.palletteClickListener;
        if (nVar != null) {
            nVar.n(ColorKt.toInt(colorPickerWidget.selectedColor));
        }
        colorPickerWidget.getEventLogger().n(new j.fuX("colorpicker_button_palette", null, 2, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jB(ColorPickerWidget colorPickerWidget, Function1 function1, SolidColorHSV color, Md state) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(state, "state");
        int i2 = Ml.$EnumSwitchMapping$0[state.ordinal()];
        if (i2 == 1 || i2 == 2) {
            colorPickerWidget.binding.f9329r.setVisibility(4);
            function1.invoke(color);
            if (colorPickerWidget.undoBatch == null) {
                colorPickerWidget.undoBatch = C.KN(colorPickerWidget);
            }
            if (!Intrinsics.areEqual(color, colorPickerWidget.notifiedColor)) {
                colorPickerWidget.notifiedColor = color;
                j jVar = colorPickerWidget.onColorChangeListener;
                if (jVar != null) {
                    jVar.n(ColorKt.toInt(color));
                }
            }
            colorPickerWidget.p5(color, true);
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            colorPickerWidget.binding.f9329r.setVisibility(0);
            colorPickerWidget.binding.f9328o.setVisibility(4);
            colorPickerWidget.binding.f9325Z.setVisibility(4);
            colorPickerWidget.binding.XQ.setVisibility(4);
            colorPickerWidget.binding.WPU.setVisibility(4);
            colorPickerWidget.binding.f9324S.setVisibility(4);
            colorPickerWidget.binding.aYN.setVisibility(4);
            Ml.j jVar2 = colorPickerWidget.undoBatch;
            if (jVar2 != null) {
                jVar2.n();
            }
            colorPickerWidget.undoBatch = null;
        }
        return Unit.INSTANCE;
    }

    public static String qie(NumberFormatException numberFormatException) {
        return "Error - paste color code : " + numberFormatException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rV9(Context context, ColorPickerWidget colorPickerWidget, View view) {
        if (context != null) {
            iF eventLogger = colorPickerWidget.getEventLogger();
            Bundle bundle = new Bundle();
            bundle.putString(FileUploadManager.f61572j, "copy");
            Unit unit = Unit.INSTANCE;
            eventLogger.n(new j.fuX("colorpicker_copypaste", bundle));
            Object systemService = context.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("AM_Color_Code", colorPickerWidget.binding.fD.getText().toString()));
            RelativeLayout copyPasteHolder = colorPickerWidget.binding.az;
            Intrinsics.checkNotNullExpressionValue(copyPasteHolder, "copyPasteHolder");
            colorPickerWidget.M(copyPasteHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void wTp(ColorPickerWidget colorPickerWidget, View view) {
        if (colorPickerWidget.binding.xMQ.getAdapter() != null) {
            colorPickerWidget.getEventLogger().n(new j.fuX("colorpicker_addcolor", null, 2, 0 == true ? 1 : 0));
            RecyclerView.Adapter adapter = colorPickerWidget.binding.xMQ.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorSelectorAdapter");
            ((psW) adapter).HI(ColorKt.toInt(colorPickerWidget.selectedColor));
            view.setVisibility(4);
        }
    }

    public final void M7() {
        RecyclerView.Adapter adapter = this.binding.xMQ.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorSelectorAdapter");
        ((psW) adapter).S();
        this.binding.xMQ.scrollToPosition(r0.getItemCount() - 1);
    }

    public final boolean getAllowAlpha() {
        return this.allowAlpha;
    }

    public final Su getBinding() {
        return this.binding;
    }

    public final iF getEventLogger() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final j getOnColorChangeListener() {
        return this.onColorChangeListener;
    }

    public final n getPalletteClickListener() {
        return this.palletteClickListener;
    }

    public final SceneHolder getSceneHolder() {
        return this.sceneHolder;
    }

    public final SolidColorHSV getSelectedColor() {
        return this.selectedColor;
    }

    public final w6 getSpoidEventListener() {
        return this.spoidEventListener;
    }

    public final Ml.j getUndoBatch() {
        return this.undoBatch;
    }

    @Override // yc.iy
    public boolean n(MotionEvent motionEvent, float sceneX, float sceneY, float previewW, float previewH) {
        Pair pair;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        SceneHolder sceneHolder = this.sceneHolder;
        if (sceneHolder == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.dragStartX = sceneX;
            this.dragStartY = sceneY;
            this.dragging = true;
            this.processDragEnd = null;
            w6 w6Var = this.spoidEventListener;
            if (w6Var != null) {
                w6Var.t();
            }
        } else if (actionMasked == 1) {
            Function0 function0 = new Function0() { // from class: yU.QJ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ColorPickerWidget.U(this.f75625n);
                }
            };
            this.processDragEnd = function0;
            if (this.requestCbLocation == null) {
                function0.invoke();
            }
        } else if (actionMasked == 2) {
            float f3 = sceneX - this.dragStartX;
            float f4 = sceneY - this.dragStartY;
            this.dragStartX = sceneX;
            this.dragStartY = sceneY;
            Vector2D location = sceneHolder.getSpoidEnv().getLocation();
            if (location == null || (pair = TuplesKt.to(Float.valueOf(location.getX() + f3), Float.valueOf(location.getY() + f4))) == null) {
                pair = TuplesKt.to(Float.valueOf((previewW / 2.0f) + f3), Float.valueOf((previewH / 2.0f) + f4));
            }
            Vector2D vector2D = new Vector2D(((Number) pair.component1()).floatValue(), ((Number) pair.component2()).floatValue());
            this.requestCbLocation = vector2D;
            sceneHolder.setSpoidEnv(new SpoidEnv(vector2D, new Vector2D(previewW, previewH), RP.t(sceneHolder, vector2D.getX(), vector2D.getY(), previewW, previewH), this.spoidCallback));
        }
        return true;
    }

    @Override // yc.DAz
    public boolean onBackPressed() {
        if (this.binding.az.getVisibility() != 0) {
            return false;
        }
        this.binding.az.setVisibility(8);
        return true;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (key == null) {
            key = "";
        }
        if (StringsKt.endsWith$default(key, "colorSelector", false, 2, (Object) null)) {
            M7();
        }
    }

    public final void setAllowAlpha(boolean z2) {
        if (this.allowAlpha != z2) {
            this.allowAlpha = z2;
            this.binding.fD.setText(ColorKt.toHexColorRef$default(this.selectedColor, z2, false, 2, (Object) null));
            this.binding.f9329r.setText(ColorKt.toHexColorRef(this.selectedColor, this.allowAlpha, true));
            RecyclerView.Adapter adapter = this.binding.xMQ.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorSelectorAdapter");
            ((psW) adapter).ViF(z2);
            a();
        }
    }

    public final void setColor(SolidColor color) {
        Intrinsics.checkNotNullParameter(color, "color");
        p5(ColorKt.toHSV(color), false);
    }

    public final void setEventLogger(iF iFVar) {
        Intrinsics.checkNotNullParameter(iFVar, "<set-?>");
        this.eventLogger = iFVar;
    }

    public final void setOnColorChangeListener(j jVar) {
        this.onColorChangeListener = jVar;
    }

    public final void setPalletteClickListener(n nVar) {
        this.palletteClickListener = nVar;
    }

    public final void setSceneHolder(SceneHolder sceneHolder) {
        this.sceneHolder = sceneHolder;
    }

    public final void setSpoidEventListener(w6 w6Var) {
        this.spoidEventListener = w6Var;
    }

    public final void setUndoBatch(Ml.j jVar) {
        this.undoBatch = jVar;
    }

    private final int P5(String str) throws IOException {
        int iIntValue;
        String string = StringsKt.trim((CharSequence) str).toString();
        StringBuilder sb = new StringBuilder();
        int length = string.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = string.charAt(i2);
            if (!StringsKt.contains$default((CharSequence) "#()%", cCharAt, false, 2, (Object) null)) {
                sb.append(cCharAt);
            }
        }
        String string2 = StringsKt.trim((CharSequence) StringsKt.replace$default(sb.toString(), "0x", "", false, 4, (Object) null)).toString();
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.substringBefore$default(string2, " ", (String) null, 2, (Object) null), 16);
        Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.substringAfter$default(string2, " ", (String) null, 2, (Object) null), 10);
        if (intOrNull2 != null) {
            iIntValue = intOrNull2.intValue();
        } else {
            iIntValue = 100;
        }
        if (intOrNull != null) {
            return ColorUtils.ck(intOrNull.intValue(), (iIntValue * 255) / 100);
        }
        Integer intOrNull3 = StringsKt.toIntOrNull(string2, 16);
        if (intOrNull3 == null) {
            return 0;
        }
        return intOrNull3.intValue();
    }

    private final void eF(final View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, view.getHeight());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yU.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ColorPickerWidget.E(view, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void nHg(Context context, ColorPickerWidget colorPickerWidget, View view) {
        view.setActivated(!view.isActivated());
        if (context instanceof EditActivity) {
            Bundle bundle = null;
            Object[] objArr = 0;
            if (view.isActivated()) {
                colorPickerWidget.getEventLogger().n(new j.fuX("colorpicker_button_eyedropper", bundle, 2, objArr == true ? 1 : 0));
                SceneHolder sceneHolder = colorPickerWidget.sceneHolder;
                if (sceneHolder != null) {
                    sceneHolder.setEditMode(2131362629);
                }
                ((EditActivity) context).rnX(colorPickerWidget);
                w6 w6Var = colorPickerWidget.spoidEventListener;
                if (w6Var != null) {
                    w6Var.rl();
                    return;
                }
                return;
            }
            SceneHolder sceneHolder2 = colorPickerWidget.sceneHolder;
            if (sceneHolder2 != null) {
                sceneHolder2.setEditMode(0);
            }
            ((EditActivity) context).rnX(null);
            w6 w6Var2 = colorPickerWidget.spoidEventListener;
            if (w6Var2 != null) {
                w6Var2.nr();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s7N(ColorPickerWidget colorPickerWidget, View view) {
        colorPickerWidget.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(ColorPickerWidget colorPickerWidget, int i2) {
        SolidColorHSV solidColorHSVNr = qf.nr(i2);
        if (!colorPickerWidget.allowAlpha && Color.alpha(i2) < 255) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(solidColorHSVNr, colorPickerWidget.notifiedColor)) {
            colorPickerWidget.notifiedColor = solidColorHSVNr;
            j jVar = colorPickerWidget.onColorChangeListener;
            if (jVar != null) {
                jVar.n(i2);
            }
        }
        colorPickerWidget.setColor(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(ColorPickerWidget colorPickerWidget, Context context, View view) throws IOException {
        ClipDescription primaryClipDescription;
        ClipData.Item itemAt;
        CharSequence text;
        iF eventLogger = colorPickerWidget.getEventLogger();
        Bundle bundle = new Bundle();
        bundle.putString(FileUploadManager.f61572j, "menu");
        Unit unit = Unit.INSTANCE;
        eventLogger.n(new j.fuX("colorpicker_copypaste", bundle));
        RelativeLayout copyPasteHolder = colorPickerWidget.binding.az;
        Intrinsics.checkNotNullExpressionValue(copyPasteHolder, "copyPasteHolder");
        colorPickerWidget.eF(copyPasteHolder);
        if (context != null) {
            Object systemService = context.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/plain")) {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip != null) {
                    itemAt = primaryClip.getItemAt(0);
                } else {
                    itemAt = null;
                }
                if (itemAt == null || (text = itemAt.getText()) == null) {
                    text = "";
                }
                int iP5 = colorPickerWidget.P5(text.toString());
                if (iP5 != 0) {
                    colorPickerWidget.binding.ViF.setEnabled(true);
                    colorPickerWidget.binding.nY.setTextColor(-1);
                    colorPickerWidget.binding.f9326g.setImageDrawable(new ColorDrawable(iP5));
                    colorPickerWidget.binding.te.setVisibility(0);
                } else {
                    colorPickerWidget.binding.ViF.setEnabled(false);
                    colorPickerWidget.binding.nY.setTextColor(colorPickerWidget.getResources().getColor(2131099818, null));
                    colorPickerWidget.binding.te.setVisibility(8);
                }
            } else {
                colorPickerWidget.binding.ViF.setEnabled(false);
                colorPickerWidget.binding.nY.setTextColor(colorPickerWidget.getResources().getColor(2131099818, null));
                colorPickerWidget.binding.te.setVisibility(8);
            }
        }
        return true;
    }

    public final void setColor(SolidColorHSV color) {
        Intrinsics.checkNotNullParameter(color, "color");
        p5(color, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ColorPickerWidget(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Activity activityN = HW.j.n(context);
        this(activityN != null ? activityN : context, attributeSet, 0, 0);
    }
}
