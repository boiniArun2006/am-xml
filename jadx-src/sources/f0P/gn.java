package f0P;

import LdY.Ml;
import QmE.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cS.Zv.SzFNXybiSxdx;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.edit.TryIcon;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.EditCategory;
import com.alightcreative.app.motion.scene.ElementTag;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.widget.QJ;
import com.alightcreative.widget.SettingEditText;
import com.alightcreative.widget.eO;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.ads.RequestConfiguration;
import f0P.gn;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001QB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0005R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010M\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lf0P/gn;", "Lf0P/wl0;", "Lyc/H;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "nr", "onPause", "onDestroyView", "LSJ0/Y5;", "o", "LSJ0/Y5;", "_binding", "LkgE/fuX;", "Z", "LkgE/fuX;", "m", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQ/fuX;", "S", "LQ/fuX;", "ijL", "()LQ/fuX;", "setFeatureUnlockManager", "(LQ/fuX;)V", "featureUnlockManager", "LQmE/iF;", "g", "LQmE/iF;", "piY", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LxAo/I28;", "E2", "LxAo/I28;", "getCrisperManager", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "e", "LnYs/Ml;", "getGetAlightSettingsUseCase", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LLdY/Ml$j;", "X", "LLdY/Ml$j;", "undoBatch", "Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "getTrackThumbnailMaker", "()Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "QZ6", "(Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;)V", "trackThumbnailMaker", "z", "()LSJ0/Y5;", "binding", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElementActionBarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementActionBarFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/ElementActionBarFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,483:1\n1#2:484\n*E\n"})
public final class gn extends bcg implements wl0, yc.H {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public Q.fuX featureUnlockManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private SceneThumbnailMaker trackThumbnailMaker;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.Y5 _binding;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private static final class j extends Drawable {
        private final Context J2;
        private final Paint KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f65595O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f65596n;
        private final int nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f65597t;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public j(int i2, int i3, float f3, int i5, int i7, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f65596n = i2;
            this.rl = i3;
            this.f65597t = f3;
            this.nr = i5;
            this.f65595O = i7;
            this.J2 = context;
            this.Uo = 255;
            this.KN = new Paint(1);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            if (this.nr != 0 || this.f65595O != 0) {
                float f3 = getBounds().left;
                float f4 = getBounds().top;
                float f5 = getBounds().right;
                float f6 = getBounds().bottom;
                float f7 = this.f65597t;
                canvas.drawRoundRect(f3, f4, f5, f6, f7, f7, this.KN);
                return;
            }
            float strokeWidth = this.KN.getStrokeWidth() + this.f65597t;
            this.KN.setColor(this.J2.getResources().getColor(2131099731, this.J2.getTheme()));
            this.KN.setStyle(Paint.Style.FILL);
            float f8 = getBounds().left;
            float f9 = getBounds().top;
            float f10 = getBounds().right;
            float f11 = getBounds().bottom;
            float f12 = this.f65597t;
            canvas.drawRoundRect(f8, f9, f10, f11, f12, f12, this.KN);
            this.KN.setColor(-1);
            this.KN.setStyle(Paint.Style.STROKE);
            canvas.drawLine(getBounds().left + strokeWidth, getBounds().top + strokeWidth, getBounds().right - strokeWidth, getBounds().bottom - strokeWidth, this.KN);
            canvas.drawLine(getBounds().right - strokeWidth, getBounds().top + strokeWidth, getBounds().left + strokeWidth, getBounds().bottom - strokeWidth, this.KN);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.rl;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f65596n;
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            super.onBoundsChange(bounds);
            if (this.nr == 0 && this.f65595O == 0) {
                this.KN.setStrokeWidth(((this.f65596n + this.rl) / 2.0f) / 20.0f);
            } else {
                this.KN.setShader(new LinearGradient(bounds.left, bounds.top, bounds.right, bounds.bottom, this.nr, this.f65595O, Shader.TileMode.CLAMP));
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
            this.Uo = i2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class n implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement rl(gn gnVar, Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "<unused var>");
            Intrinsics.checkNotNullParameter(el, "el");
            String strValueOf = String.valueOf(gnVar.z().f9395t.getText());
            if (Intrinsics.areEqual(strValueOf, el.getText().getText())) {
                strValueOf = "";
            }
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, strValueOf, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -33, 127, null);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (gn.this.undoBatch == null) {
                gn gnVar = gn.this;
                gnVar.undoBatch = HW.C.xMQ(gnVar);
            }
            final gn gnVar2 = gn.this;
            HW.C.D(gnVar2, new Function2() { // from class: f0P.Esr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return gn.n.rl(gnVar2, (Scene) obj, (SceneElement) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eWT(gn gnVar, TextView textView, int i2, KeyEvent keyEvent) {
        SettingEditText settingEditText;
        SettingEditText settingEditText2;
        if (i2 != 6) {
            return false;
        }
        Ml.j jVar = gnVar.undoBatch;
        if (jVar != null) {
            jVar.n();
        }
        gnVar.undoBatch = null;
        SJ0.Y5 y5 = gnVar._binding;
        if (y5 != null && (settingEditText2 = y5.f9395t) != null) {
            settingEditText2.clearFocus();
        }
        SJ0.Y5 y52 = gnVar._binding;
        if (y52 == null || (settingEditText = y52.f9395t) == null) {
            return false;
        }
        HI0.o7q.KN(settingEditText);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fcU(gn gnVar, View view, boolean z2) {
        if (!z2) {
            gnVar.z().f9395t.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            return;
        }
        gnVar.z().f9395t.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231696, 0);
        SettingEditText elementLabel = gnVar.z().f9395t;
        Intrinsics.checkNotNullExpressionValue(elementLabel, "elementLabel");
        HI0.o7q.ck(elementLabel);
    }

    private static final void C(final Context context, final Scene scene, final gn gnVar, SceneThumbnailMaker sceneThumbnailMaker, View view, final SceneElement sceneElement) {
        com.alightcreative.widget.V1 v1 = new com.alightcreative.widget.V1(context, false, scene, HW.C.ViF(gnVar), gnVar.piY(), sceneThumbnailMaker, 2, null);
        v1.t(gnVar.getResources().getDimensionPixelSize(2131166272));
        Intrinsics.checkNotNull(view);
        v1.nr(view, sceneElement, new Function1() { // from class: f0P.Ue
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gn.Mx(sceneElement, gnVar, context, scene, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ER(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361931);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String G7(String str, Ref.IntRef intRef) {
        return "logParentLayerSetEvent: " + str + SzFNXybiSxdx.uLzrxQMsEgO + intRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GD(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361885);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HV(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361981);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit How(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361993);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Jk(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361964);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361953);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Org(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361923);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Po6(SceneElement sceneElement, SceneElement sceneElement2, final gn gnVar, com.alightcreative.widget.QJ item) {
        SceneElementType type;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((sceneElement == null || (type = sceneElement.getType()) == null || !type.getHasVisualContent()) && !sceneElement2.getClippingMask()) {
            item.Uo();
        }
        item.t(new Function0() { // from class: f0P.df
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gn.EWS(this.f65493n);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement RQ(ElementTag elementTag, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, elementTag, null, null, null, null, null, false, null, null, false, null, null, -134217729, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Rl(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361925);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UhV(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361892);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(gn gnVar, final ElementTag elementTag) {
        HW.C.D(gnVar, new Function2() { // from class: f0P.YO
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return gn.RQ(elementTag, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a63(FragmentActivity fragmentActivity, int i2) {
        EditActivity editActivity = fragmentActivity instanceof EditActivity ? (EditActivity) fragmentActivity : null;
        if (editActivity != null) {
            editActivity.rV9(i2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement hRu(Scene scene, SceneElement clickedEl) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(clickedEl, "clickedEl");
        return SceneElement.copy$default(clickedEl, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, !clickedEl.getClippingMask(), null, null, -1, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361992);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kSg(SceneElement sceneElement, final ElementTag elementTag, int i2, float f3, Context context, final gn gnVar, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if (sceneElement.getTag() == elementTag) {
            QJ.j.n(item, null, 1, null);
        }
        item.O(new j(i2, i2, f3, ColorKt.toInt(elementTag.getColors().rl()), ColorKt.toInt(elementTag.getColors().n()), context));
        item.t(new Function0() { // from class: f0P.cCR
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gn.W(this.f65407n, elementTag);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lLA(final SceneElement sceneElement, final int i2, final float f3, final Context context, final gn gnVar, com.alightcreative.widget.eO group) {
        Intrinsics.checkNotNullParameter(group, "$this$group");
        for (final ElementTag elementTag : ElementTag.values()) {
            group.nr(new Function1() { // from class: f0P.bD
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.kSg(sceneElement, elementTag, i2, f3, context, gnVar, (com.alightcreative.widget.QJ) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mYa(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361924);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n1(boolean z2, final SceneElement sceneElement, final Context context, final gn gnVar, final SceneElement sceneElement2, final int i2, final float f3, final FragmentActivity fragmentActivity, com.alightcreative.widget.eO AlightMenu) {
        Intrinsics.checkNotNullParameter(AlightMenu, "$this$AlightMenu");
        if (!z2 && (sceneElement.getType() != SceneElementType.Scene || sceneElement.getLinkedSceneUUID() == null)) {
            AlightMenu.O(2132020092, new Function1() { // from class: f0P.hV
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.Jk((com.alightcreative.widget.QJ) obj);
                }
            });
        }
        if (sceneElement.getType().getHasTransform() && !z2) {
            AlightMenu.O(2132019092, new Function1() { // from class: f0P.po
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.Rl((com.alightcreative.widget.QJ) obj);
                }
            });
            AlightMenu.O(2132019093, new Function1() { // from class: f0P.CJc
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.qm((com.alightcreative.widget.QJ) obj);
                }
            });
            AlightMenu.O(2132019087, new Function1() { // from class: f0P.lmM
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.mYa((com.alightcreative.widget.QJ) obj);
                }
            });
            AlightMenu.O(2132019083, new Function1() { // from class: f0P.BHo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.Org((com.alightcreative.widget.QJ) obj);
                }
            });
            AlightMenu.O(2132020255, new Function1() { // from class: f0P.q5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.HV((com.alightcreative.widget.QJ) obj);
                }
            });
        }
        if (z2) {
            AlightMenu.O(2132019089, new Function1() { // from class: f0P.Ci
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.GD((com.alightcreative.widget.QJ) obj);
                }
            });
        }
        AlightMenu.Uo();
        if (sceneElement.getType().getHasVisualContent()) {
            AlightMenu.O(sceneElement.getClippingMask() ? 2132020033 : 2132017533, new Function1() { // from class: f0P.ps
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.Po6(sceneElement2, sceneElement, gnVar, (com.alightcreative.widget.QJ) obj);
                }
            });
        }
        if (sceneElement.getLiveShape().getId() != null || (sceneElement.getType() == SceneElementType.Text && com.alightcreative.app.motion.persist.j.INSTANCE.getExperimentalFeatures())) {
            AlightMenu.O(2132017503, new Function1() { // from class: f0P.fv
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.UhV((com.alightcreative.widget.QJ) obj);
                }
            });
        }
        if (sceneElement.getType() == SceneElementType.Scene) {
            if (sceneElement.getLinkedSceneUUID() == null) {
                AlightMenu.O(2132020366, new Function1() { // from class: f0P.uO
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return gn.i((com.alightcreative.widget.QJ) obj);
                    }
                });
            } else {
                if (!HI0.afx.Z(context, sceneElement.getLinkedSceneUUID()).exists()) {
                    AlightMenu.O(2132020021, new Function1() { // from class: f0P.ni
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return gn.K((com.alightcreative.widget.QJ) obj);
                        }
                    });
                }
                AlightMenu.O(2132017502, new Function1() { // from class: f0P.lI1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return gn.How((com.alightcreative.widget.QJ) obj);
                    }
                });
            }
        }
        if (SceneElementKt.hasAnyVideo(sceneElement) && SceneElementKt.hasAnyAudio(sceneElement)) {
            AlightMenu.O(2132019056, new Function1() { // from class: f0P.XOF
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.tUK((com.alightcreative.widget.QJ) obj);
                }
            });
        }
        if (sceneElement.getType() == SceneElementType.Audio || sceneElement.getFillType() == FillType.MEDIA) {
            AlightMenu.O(2132019597, new Function1() { // from class: f0P.rQ
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gn.ER((com.alightcreative.widget.QJ) obj);
                }
            });
        }
        eO.j.n(AlightMenu, true, false, false, new Function1() { // from class: f0P.yC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gn.lLA(sceneElement, i2, f3, context, gnVar, (com.alightcreative.widget.eO) obj);
            }
        }, 6, null);
        AlightMenu.rl(new Function1() { // from class: f0P.IW
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gn.a63(fragmentActivity, ((Integer) obj).intValue());
            }
        });
        AlightMenu.n(gnVar.getResources().getDimensionPixelSize(2131166272));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qm(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361926);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tUK(com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.xMQ(2131361922);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.Y5 z() {
        SJ0.Y5 y5 = this._binding;
        Intrinsics.checkNotNull(y5);
        return y5;
    }

    public final void QZ6(SceneThumbnailMaker sceneThumbnailMaker) {
        this.trackThumbnailMaker = sceneThumbnailMaker;
    }

    public final Q.fuX ijL() {
        Q.fuX fux = this.featureUnlockManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureUnlockManager");
        return null;
    }

    public final kgE.fuX m() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.Y5.t(inflater, container, false);
        LinearLayout root = z().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        Ml.j jVar = this.undoBatch;
        if (jVar != null) {
            jVar.n();
        }
        this.undoBatch = null;
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String displayLabel;
        Intrinsics.checkNotNullParameter(view, "view");
        HI0.o7q.gh(view);
        z().Uo.setOnClickListener(new View.OnClickListener() { // from class: f0P.CRI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gn.eTf(this.f64110n, view2);
            }
        });
        SettingEditText settingEditText = z().f9395t;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (displayLabel = SceneElementKt.getDisplayLabel(sceneElementNHg)) == null) {
            displayLabel = "";
        }
        settingEditText.setText(displayLabel);
        z().f9395t.setOnTouchListener(new View.OnTouchListener() { // from class: f0P.de
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return gn.xg(this.f65492n, view2, motionEvent);
            }
        });
        z().f9395t.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: f0P.LAo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z2) {
                gn.fcU(this.f64442n, view2, z2);
            }
        });
        z().f9395t.addTextChangedListener(new n());
        z().f9395t.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: f0P.XFo
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return gn.eWT(this.f65084n, textView, i2, keyEvent);
            }
        });
        boolean zContains = m().Uo().contains(kgE.K.f70073T);
        boolean zO = ijL().O();
        SceneElement sceneElementNHg2 = HW.C.nHg(this);
        Long parent = sceneElementNHg2 != null ? sceneElementNHg2.getParent() : null;
        AppCompatImageView appCompatImageView = z().f9393O;
        Resources resources = getResources();
        int i2 = parent == null ? 2131231796 : 2131231859;
        Context context = getContext();
        appCompatImageView.setImageDrawable(resources.getDrawable(i2, context != null ? context.getTheme() : null));
        z().xMQ.setVisibility((zContains || zO) ? 4 : 0);
        Context context2 = getContext();
        if (context2 != null) {
            z().J2.setImageDrawable(AppCompatResources.rl(context2, 2131231824));
        }
        z().J2.setVisibility((zContains || zO) ? 0 : 4);
        ConstraintLayout constraintLayout = z().nr;
        SceneElement sceneElementNHg3 = HW.C.nHg(this);
        constraintLayout.setVisibility((sceneElementNHg3 != null ? sceneElementNHg3.getType() : null) == SceneElementType.Audio ? 8 : 0);
        z().nr.setOnClickListener(new View.OnClickListener() { // from class: f0P.RyC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gn.pJg(this.f64661n, view2);
            }
        });
        z().KN.setOnClickListener(new View.OnClickListener() { // from class: f0P.Sp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gn.ul(this.f64719n, view2);
            }
        });
        z().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.L3d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gn.F(this.f64440n, view2);
            }
        });
    }

    public final QmE.iF piY() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EWS(gn gnVar) {
        SceneHolder sceneHolderE = HW.C.e(gnVar);
        if (sceneHolderE == null) {
            return Unit.INSTANCE;
        }
        SceneElement sceneElementNHg = HW.C.nHg(gnVar);
        if (sceneElementNHg == null) {
            return Unit.INSTANCE;
        }
        SceneHolder sceneHolderE2 = HW.C.e(gnVar);
        if (sceneHolderE2 != null) {
            sceneHolderE2.setEditCategory(new EditCategory.ClippingMask(sceneHolderE.getScene().getElements().indexOf(sceneElementNHg)));
        }
        HW.C.D(gnVar, new Function2() { // from class: f0P.p2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return gn.hRu((Scene) obj, (SceneElement) obj2);
            }
        });
        SceneHolder sceneHolderE3 = HW.C.e(gnVar);
        if (sceneHolderE3 != null) {
            sceneHolderE3.setEditCategory(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(gn gnVar, View view) {
        EditActivity editActivity;
        FragmentActivity activity = gnVar.getActivity();
        if (activity instanceof EditActivity) {
            editActivity = (EditActivity) activity;
        } else {
            editActivity = null;
        }
        if (editActivity != null) {
            editActivity.rV9(2131361898);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Mx(SceneElement sceneElement, gn gnVar, Context context, Scene scene, Long l2) {
        int i2;
        final String str;
        Long parent;
        if (!Intrinsics.areEqual(sceneElement.getParent(), l2)) {
            AppCompatImageView appCompatImageView = gnVar.z().f9393O;
            Resources resources = gnVar.getResources();
            if (l2 == null) {
                i2 = 2131231796;
            } else {
                i2 = 2131231859;
            }
            appCompatImageView.setImageDrawable(resources.getDrawable(i2, context.getTheme()));
            float fFractionalTime = SceneElementKt.fractionalTime(sceneElement, HW.C.WPU(gnVar));
            SceneHolder sceneHolderE = HW.C.e(gnVar);
            if (sceneHolderE != null) {
                sceneHolderE.update(LayerParentingKt.updateParent(sceneElement, sceneHolderE.getScene(), l2, fFractionalTime));
            }
            QmE.iF iFVarPiY = gnVar.piY();
            Bundle bundle = new Bundle();
            SceneElement sceneElementElementById = SceneKt.elementById(scene, l2);
            if (sceneElementElementById == null) {
                str = "none";
            } else if (sceneElementElementById.getType() == SceneElementType.NullObject) {
                str = V8ValueNull.NULL;
            } else if (sceneElementElementById.getType() == SceneElementType.Camera) {
                str = "camera";
            } else {
                str = "layer";
            }
            bundle.putString("type", str);
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = 1;
            while (true) {
                if (sceneElementElementById != null) {
                    parent = sceneElementElementById.getParent();
                } else {
                    parent = null;
                }
                if (parent == null) {
                    break;
                }
                intRef.element++;
                sceneElementElementById = SceneKt.elementById(scene, sceneElementElementById.getParent());
            }
            bundle.putInt("parent_depth", intRef.element);
            XoT.C.Uo(bundle, new Function0() { // from class: f0P.Vw
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return gn.G7(str, intRef);
                }
            });
            Unit unit = Unit.INSTANCE;
            iFVarPiY.n(new j.fuX("parent_layer_set", bundle));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eTf(gn gnVar, View view) {
        if (gnVar.isAdded()) {
            gnVar.getParentFragmentManager().Zmq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ofS(Context context, Scene scene, gn gnVar, SceneThumbnailMaker sceneThumbnailMaker, View view, SceneElement sceneElement) {
        C(context, scene, gnVar, sceneThumbnailMaker, view, sceneElement);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pJg(final gn gnVar, final View view) {
        final Scene sceneIF;
        final SceneElement sceneElementNHg;
        final SceneThumbnailMaker sceneThumbnailMaker;
        Long parent;
        final Context context = gnVar.getContext();
        if (context == null || (sceneIF = HW.C.iF(gnVar)) == null || (sceneElementNHg = HW.C.nHg(gnVar)) == null || (sceneThumbnailMaker = gnVar.trackThumbnailMaker) == null) {
            return;
        }
        gnVar.piY().n(new j.U4(HW.C.ViF(gnVar), rWZ.j.rl(sceneElementNHg)));
        boolean zContains = gnVar.m().Uo().contains(kgE.K.f70073T);
        SceneElement sceneElementNHg2 = HW.C.nHg(gnVar);
        if (sceneElementNHg2 != null) {
            parent = sceneElementNHg2.getParent();
        } else {
            parent = null;
        }
        if (parent == null) {
            if (!zContains && !gnVar.ijL().O()) {
                Q.fuX fuxIjL = gnVar.ijL();
                FragmentActivity fragmentActivityRequireActivity = gnVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                fuxIjL.nr(fragmentActivityRequireActivity, new Function0() { // from class: f0P.y4A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return gn.ofS(context, sceneIF, gnVar, sceneThumbnailMaker, view, sceneElementNHg);
                    }
                });
                return;
            }
            C(context, sceneIF, gnVar, sceneThumbnailMaker, view, sceneElementNHg);
            return;
        }
        C(context, sceneIF, gnVar, sceneThumbnailMaker, view, sceneElementNHg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ul(final gn gnVar, View view) {
        int iIndexOf;
        SceneElement sceneElement;
        List<SceneElement> elements;
        List<SceneElement> elements2;
        final SceneElement sceneElementNHg = HW.C.nHg(gnVar);
        if (sceneElementNHg != null) {
            Scene sceneIF = HW.C.iF(gnVar);
            if (sceneIF != null && (elements2 = sceneIF.getElements()) != null) {
                iIndexOf = elements2.indexOf(sceneElementNHg);
            } else {
                iIndexOf = -1;
            }
            Scene sceneIF2 = HW.C.iF(gnVar);
            if (sceneIF2 != null && (elements = sceneIF2.getElements()) != null) {
                sceneElement = (SceneElement) CollectionsKt.getOrNull(elements, iIndexOf - 1);
            } else {
                sceneElement = null;
            }
            final SceneElement sceneElement2 = sceneElement;
            boolean z2 = true;
            final Context context = gnVar.getContext();
            if (context != null) {
                Resources resources = context.getResources();
                final FragmentActivity activity = gnVar.getActivity();
                if (activity == null) {
                    return;
                }
                final int dimensionPixelSize = resources.getDimensionPixelSize(2131166373);
                final float dimension = resources.getDimension(2131166372);
                if (sceneElementNHg.getType() != SceneElementType.Camera) {
                    z2 = false;
                }
                final boolean z3 = z2;
                com.alightcreative.widget.Pl pl = new com.alightcreative.widget.Pl(activity, gnVar.m(), new Function1() { // from class: f0P.cE
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return gn.n1(z3, sceneElementNHg, context, gnVar, sceneElement2, dimensionPixelSize, dimension, activity, (com.alightcreative.widget.eO) obj);
                    }
                });
                Intrinsics.checkNotNull(view);
                com.alightcreative.widget.Pl.Z(pl, view, 0, 0, null, false, 30, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xg(gn gnVar, View view, MotionEvent motionEvent) {
        Editable text;
        if (motionEvent.getAction() == 1 && (view instanceof EditText)) {
            EditText editText = (EditText) view;
            if (motionEvent.getX() >= editText.getWidth() - editText.getTotalPaddingEnd() && (text = gnVar.z().f9395t.getText()) != null) {
                text.clear();
            }
        }
        return view.onTouchEvent(motionEvent);
    }

    @Override // yc.H
    public void nr() {
        int i2;
        Resources.Theme theme;
        int i3;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && getView() != null && isAdded()) {
            if (!Intrinsics.areEqual(String.valueOf(z().f9395t.getText()), SceneElementKt.getDisplayLabel(sceneElementNHg))) {
                z().f9395t.setText(SceneElementKt.getDisplayLabel(sceneElementNHg));
            }
            Long parent = sceneElementNHg.getParent();
            boolean zContains = m().Uo().contains(kgE.K.f70072S);
            Resources resources = getResources();
            if (parent == null) {
                i2 = 2131231796;
            } else {
                i2 = 2131231859;
            }
            Context context = getContext();
            if (context != null) {
                theme = context.getTheme();
            } else {
                theme = null;
            }
            z().f9393O.setImageDrawable(resources.getDrawable(i2, theme));
            boolean zO = ijL().O();
            TryIcon tryIcon = z().xMQ;
            int i5 = 4;
            if (!zContains && !zO) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            tryIcon.setVisibility(i3);
            AppCompatImageView appCompatImageView = z().J2;
            if (zContains || zO) {
                i5 = 0;
            }
            appCompatImageView.setVisibility(i5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        this._binding = null;
        super.onDestroyView();
    }
}
