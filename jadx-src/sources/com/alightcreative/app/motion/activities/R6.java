package com.alightcreative.app.motion.activities;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class R6 implements DialogInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dialog f44732n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SJ0.OU f44733t;

    private R6(Dialog dialog) {
        this.f44732n = dialog;
        SJ0.OU ouT = SJ0.OU.t(dialog.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ouT, "inflate(...)");
        this.f44733t = ouT;
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        dialog.setContentView(ouT.getRoot());
        LinearLayout custom4ButtonsMessagePanel = ouT.KN;
        Intrinsics.checkNotNullExpressionValue(custom4ButtonsMessagePanel, "custom4ButtonsMessagePanel");
        custom4ButtonsMessagePanel.setVisibility(8);
        Button buttonPositive = ouT.J2;
        Intrinsics.checkNotNullExpressionValue(buttonPositive, "buttonPositive");
        buttonPositive.setVisibility(8);
        Button buttonNeutral1 = ouT.f9251t;
        Intrinsics.checkNotNullExpressionValue(buttonNeutral1, "buttonNeutral1");
        buttonNeutral1.setVisibility(8);
        Button buttonNeutral2 = ouT.nr;
        Intrinsics.checkNotNullExpressionValue(buttonNeutral2, "buttonNeutral2");
        buttonNeutral2.setVisibility(8);
        Button buttonNegative = ouT.rl;
        Intrinsics.checkNotNullExpressionValue(buttonNegative, "buttonNegative");
        buttonNegative.setVisibility(8);
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        this.f44732n.cancel();
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        this.f44732n.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Function1 function1, R6 r6, View view) {
        function1.invoke(r6.f44732n);
    }

    public final R6 J2(int i2, Function1 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Button buttonNegative = this.f44733t.rl;
        Intrinsics.checkNotNullExpressionValue(buttonNegative, "buttonNegative");
        return rl(buttonNegative, i2, onClick);
    }

    public final R6 KN(DialogInterface.OnDismissListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f44732n.setOnDismissListener(listener);
        return this;
    }

    public final R6 O(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LinearLayout custom4ButtonsMessagePanel = this.f44733t.KN;
        Intrinsics.checkNotNullExpressionValue(custom4ButtonsMessagePanel, "custom4ButtonsMessagePanel");
        custom4ButtonsMessagePanel.setVisibility(0);
        this.f44733t.mUb.setText(message);
        return this;
    }

    public final R6 Uo(int i2, Function1 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Button buttonNeutral1 = this.f44733t.f9251t;
        Intrinsics.checkNotNullExpressionValue(buttonNeutral1, "buttonNeutral1");
        return rl(buttonNeutral1, i2, onClick);
    }

    public final void gh() {
        this.f44732n.show();
    }

    public final R6 mUb(int i2) {
        this.f44733t.az.setText(i2);
        return this;
    }

    public final R6 nr(int i2) {
        LinearLayout custom4ButtonsMessagePanel = this.f44733t.KN;
        Intrinsics.checkNotNullExpressionValue(custom4ButtonsMessagePanel, "custom4ButtonsMessagePanel");
        custom4ButtonsMessagePanel.setVisibility(0);
        this.f44733t.mUb.setText(i2);
        return this;
    }

    public final R6 xMQ(int i2, Function1 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Button buttonPositive = this.f44733t.J2;
        Intrinsics.checkNotNullExpressionValue(buttonPositive, "buttonPositive");
        return rl(buttonPositive, i2, onClick);
    }

    private final R6 rl(Button button, int i2, final Function1 function1) {
        button.setText(i2);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Fl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                R6.t(function1, this, view);
            }
        });
        button.setVisibility(0);
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public R6(Context context) {
        this(new Dialog(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
