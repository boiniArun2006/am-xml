package com.alightcreative.widget;

import SJ0.C1457h;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX {
    private AlertDialog J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Lazy f47397O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f47398n;
    private final Lazy nr;
    private Function1 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f47399t;

    public static final class j {
        private Boolean J2;
        private String KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Integer f47400O;
        private Boolean Uo;
        private Function1 az;
        private Function1 gh;
        private String mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f47401n;
        private Function1 nr;
        private String qie;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f47402t;
        private View ty;
        private Function1 xMQ;

        public j(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f47401n = context;
        }

        public final j J2(int i2, Function1 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.KN = this.f47401n.getString(i2);
            this.xMQ = listener;
            return this;
        }

        public final j KN(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.rl = title;
            return this;
        }

        public final j O(int i2, Function1 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.mUb = this.f47401n.getString(i2);
            this.gh = listener;
            return this;
        }

        public final j Uo(int i2) {
            this.rl = this.f47401n.getString(i2);
            return this;
        }

        public final fuX n() {
            fuX fux = new fuX(this.f47401n);
            String str = this.rl;
            if (str != null) {
                fux.X(str);
            }
            String str2 = this.f47402t;
            if (str2 != null) {
                fux.nY(str2);
            }
            View view = this.ty;
            if (view != null) {
                fux.N(view);
            }
            Boolean bool = this.Uo;
            if (bool != null) {
                fux.T(bool.booleanValue());
            }
            Integer num = this.f47400O;
            Boolean bool2 = this.J2;
            Function1 function1 = this.nr;
            if (num != null && bool2 != null && function1 != null) {
                fux.WPU(num.intValue(), bool2.booleanValue(), function1);
            }
            String str3 = this.KN;
            Function1 function12 = this.xMQ;
            if (str3 != null && function12 != null) {
                fux.E2(str3, function12);
            }
            String str4 = this.mUb;
            Function1 function13 = this.gh;
            if (str4 != null && function13 != null) {
                fux.g(str4, function13);
            }
            String str5 = this.qie;
            Function1 function14 = this.az;
            if (str5 != null && function14 != null) {
                fux.iF(str5, function14);
            }
            return fux;
        }

        public final j nr(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f47402t = message;
            return this;
        }

        public final j t(int i2) {
            this.f47402t = this.f47401n.getString(i2);
            return this;
        }

        public final j rl(int i2, boolean z2, Function1 function1) {
            this.f47400O = Integer.valueOf(i2);
            this.J2 = Boolean.valueOf(z2);
            this.nr = function1;
            return this;
        }

        public final j xMQ(boolean z2) {
            this.Uo = Boolean.valueOf(z2);
            return this;
        }
    }

    public static final class n implements TextWatcher {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ AppCompatButton f47403O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f47404n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ fuX f47405t;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s2, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(s2, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s2, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(s2, "s");
        }

        n(int i2, fuX fux, AppCompatButton appCompatButton) {
            this.f47404n = i2;
            this.f47405t = fux;
            this.f47403O = appCompatButton;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s2) {
            Intrinsics.checkNotNullParameter(s2, "s");
            if (this.f47404n == 32) {
                this.f47403O.setEnabled(this.f47405t.Z(StringsKt.trim((CharSequence) s2.toString()).toString()));
            }
        }
    }

    public fuX(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47398n = context;
        this.nr = LazyKt.lazy(new Function0() { // from class: com.alightcreative.widget.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.r(this.f47171n);
            }
        });
        this.f47397O = LazyKt.lazy(new Function0() { // from class: com.alightcreative.widget.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.Ik(this.f47131n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fuX E2(CharSequence charSequence, final Function1 function1) {
        AppCompatButton appCompatButton = this.f47399t ? XQ().Ik : XQ().mUb;
        Intrinsics.checkNotNull(appCompatButton);
        appCompatButton.setVisibility(0);
        appCompatButton.setText(charSequence);
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.Wre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fuX.e(this.f47354n, function1, view);
            }
        });
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1457h Ik(fuX fux) {
        C1457h c1457hT = C1457h.t(LayoutInflater.from(fux.f47398n));
        Intrinsics.checkNotNullExpressionValue(c1457hT, "inflate(...)");
        return c1457hT;
    }

    private final AlertDialog.Builder S() {
        Object value = this.nr.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AlertDialog.Builder) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fuX T(boolean z2) {
        this.f47399t = z2;
        XQ().J2.setVisibility(this.f47399t ? 8 : 0);
        XQ().ty.setVisibility(this.f47399t ? 0 : 8);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(fuX fux, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.getAction() == 1) {
            AppCompatEditText editText = fux.XQ().f9464O;
            Intrinsics.checkNotNullExpressionValue(editText, "editText");
            HI0.o7q.ck(editText);
        }
        if (motionEvent.getAction() == 0) {
            fux.XQ().f9464O.requestFocus();
            fux.XQ().f9464O.setSelection(fux.XQ().f9464O.length());
        }
        return Unit.INSTANCE;
    }

    private final C1457h XQ() {
        return (C1457h) this.f47397O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z(String str) {
        Pattern patternCompile = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return matcher.matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN(EditText it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getText().clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(fuX fux, Function1 function1, View view) {
        Function1 function12 = fux.rl;
        if (function12 != null) {
            function12.invoke(String.valueOf(fux.XQ().f9464O.getText()));
        }
        function1.invoke(fux);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fuX g(CharSequence charSequence, final Function1 function1) {
        AppCompatButton appCompatButton = this.f47399t ? XQ().HI : XQ().KN;
        Intrinsics.checkNotNull(appCompatButton);
        View view = this.f47399t ? XQ().qie : XQ().f9466t;
        Intrinsics.checkNotNull(view);
        appCompatButton.setVisibility(0);
        view.setVisibility(0);
        appCompatButton.setText(charSequence);
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.CN3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fuX.te(function1, this, view2);
            }
        });
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fuX iF(CharSequence charSequence, final Function1 function1) {
        AppCompatButton appCompatButton = this.f47399t ? XQ().ck : XQ().xMQ;
        Intrinsics.checkNotNull(appCompatButton);
        View view = this.f47399t ? XQ().az : XQ().nr;
        Intrinsics.checkNotNull(view);
        appCompatButton.setVisibility(0);
        view.setVisibility(0);
        appCompatButton.setText(charSequence);
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.widget.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fuX.fD(function1, this, view2);
            }
        });
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDialog.Builder r(fuX fux) {
        return new AlertDialog.Builder(fux.f47398n, 2132082690).setView(fux.XQ().getRoot());
    }

    public final void nHg() {
        Window window;
        if (this.J2 == null) {
            S().rl(false);
            this.J2 = S().create();
        }
        AlertDialog alertDialog = this.J2;
        if (alertDialog != null && (window = alertDialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(2131231157);
        }
        AlertDialog alertDialog2 = this.J2;
        if (alertDialog2 != null) {
            alertDialog2.show();
        }
    }

    public final void o() {
        AlertDialog alertDialog = this.J2;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fuX N(View view) {
        XQ().rl.setVisibility(0);
        XQ().rl.addView(view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fuX WPU(int i2, boolean z2, Function1 function1) {
        AppCompatButton appCompatButton;
        XQ().f9464O.setVisibility(0);
        XQ().f9464O.setInputType(i2);
        this.rl = function1;
        AppCompatEditText appCompatEditText = XQ().f9464O;
        Intrinsics.checkNotNull(appCompatEditText, "null cannot be cast to non-null type android.widget.EditText");
        Y.fg.rl(appCompatEditText, new Function1() { // from class: com.alightcreative.widget.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.aYN((EditText) obj);
            }
        }, new Function1() { // from class: com.alightcreative.widget.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.ViF(this.f47492n, (MotionEvent) obj);
            }
        });
        if (z2) {
            if (this.f47399t) {
                appCompatButton = XQ().Ik;
            } else {
                appCompatButton = XQ().mUb;
            }
            Intrinsics.checkNotNull(appCompatButton);
            appCompatButton.setEnabled(false);
            XQ().f9464O.addTextChangedListener(new n(i2, this, appCompatButton));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fuX X(CharSequence charSequence) {
        XQ().gh.setVisibility(0);
        XQ().gh.setText(charSequence);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fD(Function1 function1, fuX fux, View view) {
        function1.invoke(fux);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fuX nY(CharSequence charSequence) {
        XQ().Uo.setVisibility(0);
        XQ().Uo.setText(charSequence);
        AppCompatTextView title = XQ().gh;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        if (title.getVisibility() == 0) {
            return this;
        }
        XQ().Uo.setTypeface(ResourcesCompat.KN(this.f47398n, 2131296262));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void te(Function1 function1, fuX fux, View view) {
        function1.invoke(fux);
    }
}
