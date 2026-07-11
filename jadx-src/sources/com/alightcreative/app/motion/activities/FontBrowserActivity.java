package com.alightcreative.app.motion.activities;

import QmE.j;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Trmy.yioUaKMByL;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.ComponentActivity;
import com.alightcreative.app.motion.fonts.AMTypefaceError;
import com.alightcreative.app.motion.persist.j;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.material.navigation.NavigationView;
import com.safedk.android.utils.Logger;
import gP.EnumC2123w6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KMutableProperty0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0003J-\u0010\u0012\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u0003J)\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0015¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0014¢\u0006\u0004\b!\u0010\u0003R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u0010068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00108R\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/alightcreative/app/motion/activities/FontBrowserActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "Landroid/net/Uri;", "uriList", "", "p0N", "(Ljava/util/List;)V", "Bu", "Lkotlin/reflect/KMutableProperty0;", "", "property", "Landroid/widget/CheckBox;", "checkBox", "LgP/w6;", "fontCategory", "NP", "(Lkotlin/reflect/KMutableProperty0;Landroid/widget/CheckBox;LgP/w6;)V", "Aum", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onResume", "LSJ0/s4;", "r", "LSJ0/s4;", "binding", "LQmE/iF;", "o", "LQmE/iF;", "X4T", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "Z", "LkgE/fuX;", "Zmq", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "", "S", "Ljava/util/Set;", "selectedCategories", "", "g", "Ljava/lang/String;", "filterString", "", "Lcom/alightcreative/app/motion/fonts/w6;", "E2", "favoriteFonts", "", "Lcom/alightcreative/app/motion/activities/FontBrowserActivity$j;", "e", "Ljava/util/List;", "fontLanguages", "LXoT/Pl;", "X", "LXoT/Pl;", "networkStateChange", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontBrowserActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontBrowserActivity.kt\ncom/alightcreative/app/motion/activities/FontBrowserActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,774:1\n1557#2:775\n1628#2,3:776\n1053#2:783\n295#2,2:784\n1863#2,2:786\n295#2,2:795\n1863#2,2:797\n11158#3:779\n11493#3,3:780\n1310#3,2:789\n1#4:788\n327#5,4:791\n*S KotlinDebug\n*F\n+ 1 FontBrowserActivity.kt\ncom/alightcreative/app/motion/activities/FontBrowserActivity\n*L\n90#1:775\n90#1:776,3\n109#1:783\n134#1:784,2\n270#1:786,2\n180#1:795,2\n174#1:797,2\n109#1:779\n109#1:780,3\n422#1:789,2\n102#1:791,4\n*E\n"})
public final class FontBrowserActivity extends rU {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final Set favoriteFonts;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final XoT.Pl networkStateChange;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List fontLanguages;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SJ0.s4 binding;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Set selectedCategories = SetsKt.emptySet();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String filterString = "";

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class CN3 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        CN3() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            FontBrowserActivity fontBrowserActivity = FontBrowserActivity.this;
            SJ0.s4 s4Var = fontBrowserActivity.binding;
            if (s4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var = null;
            }
            fontBrowserActivity.filterString = s4Var.qie.getText().toString();
            FontBrowserActivity.this.Aum();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Wre implements DrawerLayout.DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void n(View drawerView) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void rl(View drawerView) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
        }

        Wre() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void nr(View drawerView, float f3) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            FontBrowserActivity.this.Bu();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void t(int i2) {
            FontBrowserActivity.this.Bu();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f44550n;
        private final gP.Xo rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f44550n, jVar.f44550n) && this.rl == jVar.rl;
        }

        public int hashCode() {
            return (this.f44550n.hashCode() * 31) + this.rl.hashCode();
        }

        public String toString() {
            return "FontLang(label=" + this.f44550n + ", subset=" + this.rl + ")";
        }

        public j(String label, gP.Xo subset) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(subset, "subset");
            this.f44550n = label;
            this.rl = subset;
        }

        public final String n() {
            return this.f44550n;
        }

        public final gP.Xo rl() {
            return this.rl;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[j.w6.values().length];
            try {
                iArr[j.w6.f45874n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.w6.f45875t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[gP.Xo.values().length];
            try {
                iArr2[gP.Xo.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[gP.Xo.f67539Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[gP.Xo.f67535S.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[gP.Xo.E2.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[gP.Xo.f67534N.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[gP.Xo.jB.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[gP.Xo.f67531FX.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[gP.Xo.f67528B.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC2123w6.values().length];
            try {
                iArr3[EnumC2123w6.f67558O.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC2123w6.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC2123w6.f67564r.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[EnumC2123w6.f67563o.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[EnumC2123w6.f67560Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[EnumC2123w6.f67559S.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[EnumC2123w6.f67562g.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class w6 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(((j) obj).n(), ((j) obj2).n());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g6(Ref.BooleanRef booleanRef, final FontBrowserActivity fontBrowserActivity, final Function1 function1, final Result result) {
        booleanRef.element = false;
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.KN.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.cb3
            @Override // java.lang.Runnable
            public final void run() {
                FontBrowserActivity.Mh(this.f44936n, result, function1);
            }
        });
        return Unit.INSTANCE;
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xVH(boolean z2, FontBrowserActivity fontBrowserActivity) {
        SJ0.s4 s4Var = null;
        if (z2) {
            SJ0.s4 s4Var2 = fontBrowserActivity.binding;
            if (s4Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                s4Var = s4Var2;
            }
            s4Var.mUb.setVisibility(8);
            return;
        }
        SJ0.s4 s4Var3 = fontBrowserActivity.binding;
        if (s4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            s4Var = s4Var3;
        }
        s4Var.mUb.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xzo(Ref.BooleanRef booleanRef, FontBrowserActivity fontBrowserActivity, Result result, com.alightcreative.app.motion.fonts.w6 w6Var) {
        String strHI;
        booleanRef.element = false;
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.KN.setVisibility(8);
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(result.getValue());
        if (Intrinsics.areEqual(thM316exceptionOrNullimpl, AMTypefaceError.INSTANCE.KN())) {
            new AlertDialog.Builder(fontBrowserActivity).setTitle(2132019101).setMessage(2132019756).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.E60
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    FontBrowserActivity.XNZ(dialogInterface, i2);
                }
            }).show();
            return;
        }
        if (thM316exceptionOrNullimpl != null) {
            new AlertDialog.Builder(fontBrowserActivity).setTitle(2132019101).setMessage(fontBrowserActivity.getString(2132019102) + "\n\n" + thM316exceptionOrNullimpl.getMessage()).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ih
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    FontBrowserActivity.lNy(dialogInterface, i2);
                }
            }).show();
            return;
        }
        QmE.iF iFVarX4T = fontBrowserActivity.X4T();
        Bundle bundle = new Bundle();
        gP.o oVarT = w6Var.n().t();
        if (Intrinsics.areEqual(oVarT, gP.qz.f67557n)) {
            strHI = com.alightcreative.app.motion.fonts.CN3.HI(w6Var);
        } else {
            if (!(oVarT instanceof gP.Pl)) {
                throw new NoWhenBranchMatchedException();
            }
            strHI = "UserFont";
        }
        bundle.putString("font", strHI);
        bundle.putInt("weight", w6Var.rl().t());
        bundle.putBoolean(TtmlNode.ITALIC, w6Var.rl().rl());
        Unit unit = Unit.INSTANCE;
        iFVarX4T.n(new j.fuX("font_browser_select_font", bundle));
        fontBrowserActivity.setResult(-1, new Intent().putExtra("selectedFont", w6Var.toString()));
        fontBrowserActivity.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri data2;
        ClipData clipData;
        if (requestCode == 1) {
            Aum();
            return;
        }
        if (requestCode != 2) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (data == null || (clipData = data.getClipData()) == null) {
            if (data == null || (data2 = data.getData()) == null) {
                return;
            }
            p0N(CollectionsKt.mutableListOf(data2));
            return;
        }
        ArrayList arrayList = new ArrayList();
        int itemCount = clipData.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            arrayList.add(clipData.getItemAt(i2).getUri());
        }
        p0N(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Aum() {
        SJ0.s4 s4Var;
        gP.Xo xo;
        int fontLanguageFilter = com.alightcreative.app.motion.persist.j.INSTANCE.getFontLanguageFilter();
        gP.Xo[] xoArrValues = gP.Xo.values();
        int length = xoArrValues.length;
        int i2 = 0;
        while (true) {
            s4Var = null;
            if (i2 >= length) {
                xo = null;
                break;
            }
            gP.Xo xo2 = xoArrValues[i2];
            if (xo2.rl() == fontLanguageFilter) {
                xo = xo2;
                break;
            }
            i2++;
        }
        int i3 = 2132019135;
        if (this.selectedCategories.isEmpty() || this.selectedCategories.size() == EnumC2123w6.values().length) {
            SJ0.s4 s4Var2 = this.binding;
            if (s4Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var2 = null;
            }
            TextView textView = s4Var2.gh;
            switch (xo != null ? n.$EnumSwitchMapping$1[xo.ordinal()] : -1) {
                case -1:
                    i3 = 2132017238;
                    break;
                case 1:
                    i3 = 2132019458;
                    break;
                case 2:
                    i3 = 2132019346;
                    break;
                case 3:
                    i3 = 2132019374;
                    break;
                case 4:
                    i3 = 2132017643;
                    break;
                case 5:
                    i3 = 2132017276;
                    break;
                case 6:
                    i3 = 2132020321;
                    break;
                case 7:
                    i3 = 2132019448;
                    break;
                case 8:
                    i3 = 2132019445;
                    break;
            }
            textView.setText(i3);
        } else if (xo == null) {
            SJ0.s4 s4Var3 = this.binding;
            if (s4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var3 = null;
            }
            TextView textView2 = s4Var3.gh;
            EnumC2123w6 enumC2123w6 = (EnumC2123w6) CollectionsKt.singleOrNull(this.selectedCategories);
            switch (enumC2123w6 != null ? n.$EnumSwitchMapping$2[enumC2123w6.ordinal()] : -1) {
                case -1:
                    textView2.setText(i3);
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    i3 = 2132020082;
                    textView2.setText(i3);
                    break;
                case 2:
                    i3 = 2132020115;
                    textView2.setText(i3);
                    break;
                case 3:
                    i3 = 2132017692;
                    textView2.setText(i3);
                    break;
                case 4:
                    i3 = 2132019372;
                    textView2.setText(i3);
                    break;
                case 5:
                    i3 = 2132019632;
                    textView2.setText(i3);
                    break;
                case 6:
                    i3 = 2132019408;
                    textView2.setText(i3);
                    break;
                case 7:
                    i3 = 2132019072;
                    textView2.setText(i3);
                    break;
            }
        } else {
            SJ0.s4 s4Var4 = this.binding;
            if (s4Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var4 = null;
            }
            s4Var4.gh.setText(2132019135);
        }
        SJ0.s4 s4Var5 = this.binding;
        if (s4Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            s4Var = s4Var5;
        }
        RecyclerView recyclerView = s4Var.Uo;
        Set set = this.selectedCategories;
        if (set.isEmpty()) {
            set = ArraysKt.toSet(EnumC2123w6.values());
        }
        recyclerView.setAdapter(new zP(set, xo, this.filterString, this.favoriteFonts, new Function2() { // from class: com.alightcreative.app.motion.activities.oO
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FontBrowserActivity.s(this.f45566n, (com.alightcreative.app.motion.fonts.w6) obj, (Function1) obj2);
            }
        }, new Function1() { // from class: com.alightcreative.app.motion.activities.itH
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FontBrowserActivity.Toy(this.f45279n, (com.alightcreative.app.motion.fonts.w6) obj);
            }
        }, new Function1() { // from class: com.alightcreative.app.motion.activities.EkF
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FontBrowserActivity.I9f(this.f44508n, (com.alightcreative.app.motion.fonts.w6) obj);
            }
        }, X4T()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Bu() {
        SJ0.s4 s4Var = this.binding;
        SJ0.s4 s4Var2 = null;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        if (s4Var.qie.getVisibility() == 0 || this.filterString.length() > 0) {
            SJ0.s4 s4Var3 = this.binding;
            if (s4Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var3 = null;
            }
            EditText searchText = s4Var3.qie;
            Intrinsics.checkNotNullExpressionValue(searchText, "searchText");
            HI0.o7q.KN(searchText);
            SJ0.s4 s4Var4 = this.binding;
            if (s4Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var4 = null;
            }
            s4Var4.gh.setVisibility(0);
            SJ0.s4 s4Var5 = this.binding;
            if (s4Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var5 = null;
            }
            s4Var5.qie.setVisibility(4);
            SJ0.s4 s4Var6 = this.binding;
            if (s4Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var6 = null;
            }
            s4Var6.qie.setText("");
            this.filterString = "";
            SJ0.s4 s4Var7 = this.binding;
            if (s4Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var7 = null;
            }
            s4Var7.rl.setVisibility(4);
            SJ0.s4 s4Var8 = this.binding;
            if (s4Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var8 = null;
            }
            s4Var8.f9633t.setVisibility(0);
            SJ0.s4 s4Var9 = this.binding;
            if (s4Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                s4Var2 = s4Var9;
            }
            s4Var2.nr.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EF(final FontBrowserActivity fontBrowserActivity, final SJ0.U4 u4, View view) {
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(fontBrowserActivity, fontBrowserActivity.Zmq(), false, 4, null);
        com.alightcreative.widget.nKK.ty(nkk, 2132020187, 0, 0, false, null, 28, null);
        com.alightcreative.widget.nKK.ty(nkk, 2132020182, 1, 0, false, null, 28, null);
        nkk.fD(new Function1() { // from class: com.alightcreative.app.motion.activities.UF
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FontBrowserActivity.uG(u4, fontBrowserActivity, ((Integer) obj).intValue());
            }
        });
        nkk.X(view.getWidth());
        Intrinsics.checkNotNull(view);
        com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I9f(final FontBrowserActivity fontBrowserActivity, com.alightcreative.app.motion.fonts.w6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (com.alightcreative.app.motion.fonts.CN3.o() <= 1) {
            SJ0.s4 s4Var = fontBrowserActivity.binding;
            if (s4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s4Var = null;
            }
            SJ0.U4 u4N = SJ0.U4.n(s4Var.xMQ.ty(0));
            Intrinsics.checkNotNullExpressionValue(u4N, "bind(...)");
            u4N.f9358O.setVisibility(8);
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            if (jVar.getFontFilterImported()) {
                jVar.setFontFilterImported(false);
                u4N.f9358O.setChecked(false);
                u4N.f9358O.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.Lnn
                    @Override // java.lang.Runnable
                    public final void run() {
                        FontBrowserActivity.D76(this.f44625n);
                    }
                }, 15L);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JVN(final FontBrowserActivity fontBrowserActivity, final boolean z2) {
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.mUb.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.Slg
            @Override // java.lang.Runnable
            public final void run() {
                FontBrowserActivity.xVH(z2, fontBrowserActivity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lp6(FontBrowserActivity fontBrowserActivity, Ref.BooleanRef booleanRef) {
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.KN.setVisibility(booleanRef.element ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mh(FontBrowserActivity fontBrowserActivity, Result result, Function1 function1) {
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.KN.setVisibility(8);
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(result.getValue());
        if (thM316exceptionOrNullimpl == null) {
            function1.invoke(Boolean.TRUE);
            return;
        }
        new AlertDialog.Builder(fontBrowserActivity).setTitle(2132019101).setMessage(fontBrowserActivity.getString(2132019102) + "\n\n" + thM316exceptionOrNullimpl.getMessage()).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.KAB
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                FontBrowserActivity.jO(dialogInterface, i2);
            }
        }).show();
        function1.invoke(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QgZ(KMutableProperty0 kMutableProperty0, FontBrowserActivity fontBrowserActivity, EnumC2123w6 enumC2123w6, CompoundButton compoundButton, boolean z2) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        kMutableProperty0.set(Boolean.valueOf(z2));
        if (z2) {
            fontBrowserActivity.selectedCategories = SetsKt.plus((Set<? extends EnumC2123w6>) fontBrowserActivity.selectedCategories, enumC2123w6);
        } else {
            fontBrowserActivity.selectedCategories = SetsKt.minus((Set<? extends EnumC2123w6>) fontBrowserActivity.selectedCategories, enumC2123w6);
        }
        fontBrowserActivity.Aum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Qu(List list, final FontBrowserActivity fontBrowserActivity, final androidx.appcompat.app.AlertDialog alertDialog, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (list.isEmpty()) {
            alertDialog.dismiss();
            if (com.alightcreative.app.motion.fonts.CN3.o() > 0) {
                SJ0.s4 s4Var = fontBrowserActivity.binding;
                if (s4Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    s4Var = null;
                }
                SJ0.U4 u4N = SJ0.U4.n(s4Var.xMQ.ty(0));
                Intrinsics.checkNotNullExpressionValue(u4N, "bind(...)");
                u4N.f9358O.setVisibility(0);
            }
            fontBrowserActivity.Aum();
        } else {
            new AlertDialog.Builder(fontBrowserActivity).o(2132019402).KN(fontBrowserActivity.getString(2132019099) + "\n\n" + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, null, 62, null)).az(new DialogInterface.OnCancelListener() { // from class: com.alightcreative.app.motion.activities.fZc
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    FontBrowserActivity.HBN(alertDialog, fontBrowserActivity, dialogInterface);
                }
            }).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.lZ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    FontBrowserActivity.UF(alertDialog, fontBrowserActivity, dialogInterface, i2);
                }
            }).XQ();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Th(final FontBrowserActivity fontBrowserActivity, final Ref.BooleanRef booleanRef, final com.alightcreative.app.motion.fonts.w6 w6Var, final Result result) {
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.KN.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.AR
            @Override // java.lang.Runnable
            public final void run() {
                FontBrowserActivity.xzo(booleanRef, fontBrowserActivity, result, w6Var);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Toy(final FontBrowserActivity fontBrowserActivity, final com.alightcreative.app.motion.fonts.w6 amTypeface) {
        Intrinsics.checkNotNullParameter(amTypeface, "amTypeface");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.KN.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.xAK
            @Override // java.lang.Runnable
            public final void run() {
                FontBrowserActivity.wKp(this.f45724n, booleanRef);
            }
        }, 30L);
        com.alightcreative.app.motion.fonts.CN3.Z(amTypeface, new Function1() { // from class: com.alightcreative.app.motion.activities.YPr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FontBrowserActivity.Th(this.f44838n, booleanRef, amTypeface, (Result) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Vvq(final FontBrowserActivity fontBrowserActivity, final SJ0.U4 u4, View view) {
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(fontBrowserActivity, fontBrowserActivity.Zmq(), false, 4, null);
        com.alightcreative.widget.nKK.ty(nkk, 2132017239, 0, 0, false, null, 28, null);
        List<j> list = fontBrowserActivity.fontLanguages;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontLanguages");
            list = null;
        }
        for (j jVar : list) {
            com.alightcreative.widget.nKK.ty(nkk, jVar.rl().t(), jVar.rl().rl(), 0, false, null, 28, null);
        }
        nkk.fD(new Function1() { // from class: com.alightcreative.app.motion.activities.xwl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FontBrowserActivity.y(u4, fontBrowserActivity, ((Integer) obj).intValue());
            }
        });
        nkk.X(view.getWidth());
        Intrinsics.checkNotNull(view);
        com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Zn(FontBrowserActivity fontBrowserActivity, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 2131363008) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        String[] strArr = {"font/ttf", "font/otf", "application/x-font-ttf", "application/x-font-otf", "application/octet-stream", yioUaKMByL.EnWzhTjarlBWto};
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(fontBrowserActivity, intent, 2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(Exception exc) {
        return "Import Font File error : openInputStream.sha1 : " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n7b(SJ0.U4 u4) {
        u4.f9358O.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nO(FontBrowserActivity fontBrowserActivity, View view) {
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        SJ0.s4 s4Var2 = null;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.gh.setVisibility(4);
        SJ0.s4 s4Var3 = fontBrowserActivity.binding;
        if (s4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var3 = null;
        }
        s4Var3.qie.setVisibility(0);
        SJ0.s4 s4Var4 = fontBrowserActivity.binding;
        if (s4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var4 = null;
        }
        s4Var4.qie.setText("");
        SJ0.s4 s4Var5 = fontBrowserActivity.binding;
        if (s4Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var5 = null;
        }
        s4Var5.qie.requestFocus();
        SJ0.s4 s4Var6 = fontBrowserActivity.binding;
        if (s4Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var6 = null;
        }
        EditText searchText = s4Var6.qie;
        Intrinsics.checkNotNullExpressionValue(searchText, "searchText");
        HI0.o7q.ck(searchText);
        SJ0.s4 s4Var7 = fontBrowserActivity.binding;
        if (s4Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var7 = null;
        }
        s4Var7.rl.setVisibility(0);
        SJ0.s4 s4Var8 = fontBrowserActivity.binding;
        if (s4Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var8 = null;
        }
        s4Var8.f9633t.setVisibility(4);
        SJ0.s4 s4Var9 = fontBrowserActivity.binding;
        if (s4Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            s4Var2 = s4Var9;
        }
        s4Var2.nr.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o9(FontBrowserActivity fontBrowserActivity, View view) {
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.J2.s7N(8388611);
    }

    private final void p0N(List uriList) {
        ArrayList arrayList = new ArrayList();
        Iterator it = uriList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            Cursor cursorQuery = getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        arrayList.add(new Fj(cursorQuery.getLong(0), uri, cursorQuery.getString(2), cursorQuery.getString(1)));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursorQuery, th);
                        throw th2;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        final androidx.appcompat.app.AlertDialog alertDialogCreate = new AlertDialog.Builder(this).Uo(2132019411).rl(false).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        alertDialogCreate.show();
        final List list = CollectionsKt.toList(arrayList);
        final ArrayList arrayList2 = new ArrayList();
        HI0.qz.nr(null, new Function0() { // from class: com.alightcreative.app.motion.activities.eMh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FontBrowserActivity.Uf(this.f45061n, list, arrayList2);
            }
        }, 1, null).Uo(new Function1() { // from class: com.alightcreative.app.motion.activities.yU
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FontBrowserActivity.Qu(arrayList2, this, alertDialogCreate, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(final FontBrowserActivity fontBrowserActivity, com.alightcreative.app.motion.fonts.w6 amTypeface, final Function1 completion) {
        Intrinsics.checkNotNullParameter(amTypeface, "amTypeface");
        Intrinsics.checkNotNullParameter(completion, "completion");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.KN.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.hha
            @Override // java.lang.Runnable
            public final void run() {
                FontBrowserActivity.Lp6(this.f45264n, booleanRef);
            }
        }, 30L);
        com.alightcreative.app.motion.fonts.CN3.Z(amTypeface, new Function1() { // from class: com.alightcreative.app.motion.activities.Y6T
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FontBrowserActivity.g6(booleanRef, fontBrowserActivity, completion, (Result) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uG(SJ0.U4 u4, FontBrowserActivity fontBrowserActivity, int i2) {
        int i3;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        j.w6 w6Var = (i2 == 0 || i2 != 1) ? j.w6.f45875t : j.w6.f45874n;
        jVar.setFontSorting(w6Var);
        TextView textView = u4.ty;
        int i5 = n.$EnumSwitchMapping$0[jVar.getFontSorting().ordinal()];
        if (i5 == 1) {
            i3 = 2132020182;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 2132020187;
        }
        textView.setText(i3);
        fontBrowserActivity.Aum();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ub(Exception exc) {
        return "Import Font File error : " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wKp(FontBrowserActivity fontBrowserActivity, Ref.BooleanRef booleanRef) {
        SJ0.s4 s4Var = fontBrowserActivity.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        s4Var.KN.setVisibility(booleanRef.element ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(SJ0.U4 u4, FontBrowserActivity fontBrowserActivity, int i2) {
        String string;
        com.alightcreative.app.motion.persist.j.INSTANCE.setFontLanguageFilter(i2);
        TextView textView = u4.qie;
        List list = fontBrowserActivity.fontLanguages;
        Object obj = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontLanguages");
            list = null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((j) next).rl().rl() == i2) {
                obj = next;
                break;
            }
        }
        j jVar = (j) obj;
        if (jVar == null || (string = jVar.n()) == null) {
            string = fontBrowserActivity.getString(2132017239);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        textView.setText(string);
        fontBrowserActivity.Aum();
        return Unit.INSTANCE;
    }

    public final QmE.iF X4T() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final kgE.fuX Zmq() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public FontBrowserActivity() {
        Set<String> favoriteFonts = com.alightcreative.app.motion.persist.j.INSTANCE.getFavoriteFonts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(favoriteFonts, 10));
        Iterator<T> it = favoriteFonts.iterator();
        while (it.hasNext()) {
            arrayList.add(com.alightcreative.app.motion.fonts.w6.f45792t.rl((String) it.next()));
        }
        this.favoriteFonts = CollectionsKt.toMutableSet(arrayList);
        this.networkStateChange = new XoT.Pl(new Function1() { // from class: com.alightcreative.app.motion.activities.RBY
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FontBrowserActivity.JVN(this.f44734n, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D76(FontBrowserActivity fontBrowserActivity) {
        fontBrowserActivity.Aum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HBN(androidx.appcompat.app.AlertDialog alertDialog, FontBrowserActivity fontBrowserActivity, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        alertDialog.dismiss();
        fontBrowserActivity.setResult(-1);
        fontBrowserActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void NP(final KMutableProperty0 property, CheckBox checkBox, final EnumC2123w6 fontCategory) {
        checkBox.setChecked(((Boolean) property.get()).booleanValue());
        if (checkBox.isChecked()) {
            this.selectedCategories = SetsKt.plus((Set<? extends EnumC2123w6>) this.selectedCategories, fontCategory);
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.alightcreative.app.motion.activities.gU1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                FontBrowserActivity.QgZ(property, this, fontCategory, compoundButton, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UF(androidx.appcompat.app.AlertDialog alertDialog, FontBrowserActivity fontBrowserActivity, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        alertDialog.dismiss();
        fontBrowserActivity.setResult(-1);
        fontBrowserActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uf(FontBrowserActivity fontBrowserActivity, List list, List list2) {
        String name;
        File fileXMQ = HI0.afx.xMQ(fontBrowserActivity);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fj fj = (Fj) it.next();
            String path = fj.rl().getPath();
            Intrinsics.checkNotNull(path);
            File file = new File(path);
            String extension = FilesKt.getExtension(file);
            if (!Intrinsics.areEqual(extension, "ttf") && !Intrinsics.areEqual(extension, "otf")) {
                extension = "ttf";
            }
            try {
                String strN = fj.n();
                Typeface typefaceCreateFromFile = null;
                if (strN == null || (name = StringsKt.substringBeforeLast$default(strN, '.', (String) null, 2, (Object) null)) == null) {
                    InputStream inputStreamOpenInputStream = fontBrowserActivity.getContentResolver().openInputStream(fj.rl());
                    if (inputStreamOpenInputStream != null) {
                        try {
                            String strO = HI0.gnv.o(HI0.nKK.n(inputStreamOpenInputStream));
                            CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                            name = strO;
                        } finally {
                        }
                    } else {
                        name = file.getName();
                    }
                }
                File fileResolve = FilesKt.resolve(fileXMQ, name + "." + extension);
                if (!fileResolve.exists()) {
                    try {
                        InputStream inputStreamOpenInputStream2 = fontBrowserActivity.getContentResolver().openInputStream(fj.rl());
                        if (inputStreamOpenInputStream2 != null) {
                            ByteStreamsKt.copyTo$default(inputStreamOpenInputStream2, new FileOutputStream(fileResolve), 0, 2, null);
                        }
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } catch (Exception e2) {
                        XoT.C.Uo(fontBrowserActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.gI
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FontBrowserActivity.ub(e2);
                            }
                        });
                    }
                    try {
                        typefaceCreateFromFile = Typeface.createFromFile(fileResolve);
                    } catch (RuntimeException unused) {
                    }
                    if (typefaceCreateFromFile == null) {
                        fileResolve.delete();
                        list2.add(name);
                    }
                }
            } catch (Exception e3) {
                XoT.C.Uo(fontBrowserActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.p6X
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FontBrowserActivity.f(e3);
                    }
                });
            }
        }
        QmE.iF iFVarX4T = fontBrowserActivity.X4T();
        Bundle bundle = new Bundle();
        bundle.putInt(JavetError.PARAMETER_COUNT, list.size());
        Unit unit = Unit.INSTANCE;
        iFVarX4T.n(new j.fuX("font_install", bundle));
        com.alightcreative.app.motion.fonts.CN3.X();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XNZ(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jO(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lNy(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0j(FontBrowserActivity fontBrowserActivity, View view) {
        fontBrowserActivity.Bu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat vl(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNull(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = insetsJ2.rl;
            marginLayoutParams.bottomMargin = insetsJ2.nr;
            view.setLayoutParams(marginLayoutParams);
            return windowInsetsCompat;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.alightcreative.app.motion.activities.rU, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object next;
        String string;
        int i2;
        super.onCreate(savedInstanceState);
        SJ0.s4 s4VarT = SJ0.s4.t(getLayoutInflater());
        this.binding = s4VarT;
        SJ0.s4 s4Var = null;
        if (s4VarT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4VarT = null;
        }
        setContentView(s4VarT.getRoot());
        SJ0.s4 s4Var2 = this.binding;
        if (s4Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var2 = null;
        }
        ViewCompat.Org(s4Var2.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.alightcreative.app.motion.activities.jV6
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return FontBrowserActivity.vl(view, windowInsetsCompat);
            }
        });
        gP.Xo[] xoArrValues = gP.Xo.values();
        ArrayList arrayList = new ArrayList(xoArrValues.length);
        for (gP.Xo xo : xoArrValues) {
            String string2 = getString(xo.t());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new j(string2, xo));
        }
        this.fontLanguages = CollectionsKt.sortedWith(arrayList, new w6());
        SJ0.s4 s4Var3 = this.binding;
        if (s4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var3 = null;
        }
        s4Var3.Uo.setLayoutManager(new GridLayoutManager(this, 2));
        SJ0.s4 s4Var4 = this.binding;
        if (s4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var4 = null;
        }
        s4Var4.nr.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.A56
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FontBrowserActivity.o9(this.f44312n, view);
            }
        });
        SJ0.s4 s4Var5 = this.binding;
        if (s4Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var5 = null;
        }
        final SJ0.U4 u4N = SJ0.U4.n(s4Var5.xMQ.ty(0));
        Intrinsics.checkNotNullExpressionValue(u4N, "bind(...)");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(jVar) { // from class: com.alightcreative.app.motion.activities.FontBrowserActivity.fuX
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((com.alightcreative.app.motion.persist.j) this.receiver).getFontFilterSerif());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((com.alightcreative.app.motion.persist.j) this.receiver).setFontFilterSerif(((Boolean) obj).booleanValue());
            }
        };
        CheckBox checkboxSerif = u4N.KN;
        Intrinsics.checkNotNullExpressionValue(checkboxSerif, "checkboxSerif");
        NP(mutablePropertyReference0Impl, checkboxSerif, EnumC2123w6.J2);
        MutablePropertyReference0Impl mutablePropertyReference0Impl2 = new MutablePropertyReference0Impl(jVar) { // from class: com.alightcreative.app.motion.activities.FontBrowserActivity.Dsr
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((com.alightcreative.app.motion.persist.j) this.receiver).getFontFilterSansSerif());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((com.alightcreative.app.motion.persist.j) this.receiver).setFontFilterSansSerif(((Boolean) obj).booleanValue());
            }
        };
        CheckBox checkboxSansSerif = u4N.Uo;
        Intrinsics.checkNotNullExpressionValue(checkboxSansSerif, "checkboxSansSerif");
        NP(mutablePropertyReference0Impl2, checkboxSansSerif, EnumC2123w6.f67558O);
        MutablePropertyReference0Impl mutablePropertyReference0Impl3 = new MutablePropertyReference0Impl(jVar) { // from class: com.alightcreative.app.motion.activities.FontBrowserActivity.aC
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((com.alightcreative.app.motion.persist.j) this.receiver).getFontFilterDisplay());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((com.alightcreative.app.motion.persist.j) this.receiver).setFontFilterDisplay(((Boolean) obj).booleanValue());
            }
        };
        CheckBox checkboxDisplay = u4N.rl;
        Intrinsics.checkNotNullExpressionValue(checkboxDisplay, "checkboxDisplay");
        NP(mutablePropertyReference0Impl3, checkboxDisplay, EnumC2123w6.f67564r);
        MutablePropertyReference0Impl mutablePropertyReference0Impl4 = new MutablePropertyReference0Impl(jVar) { // from class: com.alightcreative.app.motion.activities.FontBrowserActivity.C
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((com.alightcreative.app.motion.persist.j) this.receiver).getFontFilterHandwriting());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((com.alightcreative.app.motion.persist.j) this.receiver).setFontFilterHandwriting(((Boolean) obj).booleanValue());
            }
        };
        CheckBox checkboxHandwriting = u4N.nr;
        Intrinsics.checkNotNullExpressionValue(checkboxHandwriting, "checkboxHandwriting");
        NP(mutablePropertyReference0Impl4, checkboxHandwriting, EnumC2123w6.f67563o);
        MutablePropertyReference0Impl mutablePropertyReference0Impl5 = new MutablePropertyReference0Impl(jVar) { // from class: com.alightcreative.app.motion.activities.FontBrowserActivity.o
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((com.alightcreative.app.motion.persist.j) this.receiver).getFontFilterMonospace());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((com.alightcreative.app.motion.persist.j) this.receiver).setFontFilterMonospace(((Boolean) obj).booleanValue());
            }
        };
        CheckBox checkboxMonospace = u4N.J2;
        Intrinsics.checkNotNullExpressionValue(checkboxMonospace, "checkboxMonospace");
        NP(mutablePropertyReference0Impl5, checkboxMonospace, EnumC2123w6.f67560Z);
        MutablePropertyReference0Impl mutablePropertyReference0Impl6 = new MutablePropertyReference0Impl(jVar) { // from class: com.alightcreative.app.motion.activities.FontBrowserActivity.Ml
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((com.alightcreative.app.motion.persist.j) this.receiver).getFontFilterImported());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((com.alightcreative.app.motion.persist.j) this.receiver).setFontFilterImported(((Boolean) obj).booleanValue());
            }
        };
        CheckBox checkboxImported = u4N.f9358O;
        Intrinsics.checkNotNullExpressionValue(checkboxImported, "checkboxImported");
        NP(mutablePropertyReference0Impl6, checkboxImported, EnumC2123w6.f67559S);
        MutablePropertyReference0Impl mutablePropertyReference0Impl7 = new MutablePropertyReference0Impl(jVar) { // from class: com.alightcreative.app.motion.activities.FontBrowserActivity.I28
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Boolean.valueOf(((com.alightcreative.app.motion.persist.j) this.receiver).getFontFilterFavorite());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((com.alightcreative.app.motion.persist.j) this.receiver).setFontFilterFavorite(((Boolean) obj).booleanValue());
            }
        };
        CheckBox checkboxFavorite = u4N.f9360t;
        Intrinsics.checkNotNullExpressionValue(checkboxFavorite, "checkboxFavorite");
        NP(mutablePropertyReference0Impl7, checkboxFavorite, EnumC2123w6.f67562g);
        if (com.alightcreative.app.motion.fonts.CN3.o() > 0) {
            u4N.f9358O.setVisibility(0);
        } else {
            u4N.f9358O.setVisibility(8);
        }
        int fontLanguageFilter = jVar.getFontLanguageFilter();
        TextView textView = u4N.qie;
        List list = this.fontLanguages;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontLanguages");
            list = null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((j) next).rl().rl() == fontLanguageFilter) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        j jVar2 = (j) next;
        if (jVar2 == null || (string = jVar2.n()) == null) {
            string = getString(2132017239);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        textView.setText(string);
        j.w6 fontSorting = com.alightcreative.app.motion.persist.j.INSTANCE.getFontSorting();
        TextView textView2 = u4N.ty;
        int i3 = n.$EnumSwitchMapping$0[fontSorting.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                i2 = 2132020187;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i2 = 2132020182;
        }
        textView2.setText(i2);
        u4N.ty.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.rrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FontBrowserActivity.EF(this.f45633n, u4N, view);
            }
        });
        u4N.qie.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FontBrowserActivity.Vvq(this.f45271n, u4N, view);
            }
        });
        SJ0.s4 s4Var6 = this.binding;
        if (s4Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var6 = null;
        }
        s4Var6.xMQ.setNavigationItemSelectedListener(new NavigationView.Ml() { // from class: com.alightcreative.app.motion.activities.LJ
            @Override // com.google.android.material.navigation.NavigationView.Ml
            public final boolean n(MenuItem menuItem) {
                return FontBrowserActivity.Zn(this.f44620n, menuItem);
            }
        });
        SJ0.s4 s4Var7 = this.binding;
        if (s4Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var7 = null;
        }
        s4Var7.J2.n(new Wre());
        SJ0.s4 s4Var8 = this.binding;
        if (s4Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var8 = null;
        }
        s4Var8.f9633t.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.qrq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FontBrowserActivity.nO(this.f45614n, view);
            }
        });
        SJ0.s4 s4Var9 = this.binding;
        if (s4Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var9 = null;
        }
        s4Var9.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.vKj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FontBrowserActivity.v0j(this.f45700n, view);
            }
        });
        SJ0.s4 s4Var10 = this.binding;
        if (s4Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            s4Var = s4Var10;
        }
        s4Var.qie.addTextChangedListener(new CN3());
        Aum();
        this.networkStateChange.n().invoke(Boolean.valueOf(XoT.fuX.Ik(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        XoT.fuX.te(this, this.networkStateChange);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        XoT.fuX.WPU(this, this.networkStateChange);
        SJ0.s4 s4Var = this.binding;
        if (s4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s4Var = null;
        }
        final SJ0.U4 u4N = SJ0.U4.n(s4Var.xMQ.ty(0));
        Intrinsics.checkNotNullExpressionValue(u4N, "bind(...)");
        if (u4N.f9358O.getVisibility() != 0 && com.alightcreative.app.motion.fonts.CN3.o() > 0) {
            u4N.f9358O.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.rL
                @Override // java.lang.Runnable
                public final void run() {
                    FontBrowserActivity.n7b(u4N);
                }
            }, 300L);
        }
    }
}
