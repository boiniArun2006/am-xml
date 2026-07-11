package com.bendingspoons.oracle.secretmenu;

import GJW.RzR;
import GJW.vd;
import GJW.yg;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import qu.C;
import qu.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(DialogInterface dialogInterface, int i2) {
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ InputMethodManager f51473O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51474n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f51475t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Ref.ObjectRef objectRef, InputMethodManager inputMethodManager, Continuation continuation) {
            super(2, continuation);
            this.f51475t = objectRef;
            this.f51473O = inputMethodManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f51475t, this.f51473O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51474n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f51474n = 1;
                if (yg.rl(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ((TextInputEditText) this.f51475t.element).setFocusableInTouchMode(true);
            ((TextInputEditText) this.f51475t.element).requestFocus();
            InputMethodManager inputMethodManager = this.f51473O;
            if (inputMethodManager != null) {
                Boxing.boxBoolean(inputMethodManager.showSoftInput((View) this.f51475t.element, 1));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, android.widget.TextView, com.google.android.material.textfield.TextInputEditText] */
    public static final Dialog O(final FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, final NUH.j jVar, String str5, DialogInterface.OnClickListener onClickListener, String str6, DialogInterface.OnClickListener onClickListener2, boolean z2) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        nv.n nVar = new nv.n(fragmentActivity);
        nVar.rl(z2);
        nVar.KN(str2);
        nVar.setTitle(str);
        View viewInflate = fragmentActivity.getLayoutInflater().inflate(o.f72496n, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(C.f72479n);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputEditText");
        ?? r52 = (TextInputEditText) viewFindViewById;
        objectRef.element = r52;
        r52.setHint(str3);
        nVar.setView(viewInflate);
        ((TextInputEditText) objectRef.element).setFocusableInTouchMode(true);
        ((TextInputEditText) objectRef.element).requestFocus();
        nVar.ck(str4, new DialogInterface.OnClickListener() { // from class: NUH.Ml
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                com.bendingspoons.oracle.secretmenu.w6.KN(dialogInterface, i2);
            }
        });
        if (str5 != null && onClickListener != null) {
            nVar.mUb(str5, onClickListener);
        } else if (str5 != null) {
            nVar.mUb(str5, new DialogInterface.OnClickListener() { // from class: NUH.I28
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    com.bendingspoons.oracle.secretmenu.w6.xMQ(dialogInterface, i2);
                }
            });
        }
        if (str6 != null && onClickListener2 != null) {
            nVar.s7N(str6, onClickListener2);
        } else if (str6 != null) {
            nVar.s7N(str6, new DialogInterface.OnClickListener() { // from class: NUH.Wre
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    com.bendingspoons.oracle.secretmenu.w6.mUb(dialogInterface, i2);
                }
            });
        }
        final AlertDialog alertDialogCreate = nVar.create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        alertDialogCreate.show();
        alertDialogCreate.xMQ(-1).setOnClickListener(new View.OnClickListener() { // from class: NUH.CN3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.bendingspoons.oracle.secretmenu.w6.gh(jVar, objectRef, alertDialogCreate, fragmentActivity, view);
            }
        });
        GJW.C.nr(RzR.f3449n, null, null, new j(objectRef, (InputMethodManager) fragmentActivity.getApplicationContext().getSystemService("input_method"), null), 3, null);
        return alertDialogCreate;
    }

    private static final void Uo(FragmentActivity fragmentActivity, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) fragmentActivity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void gh(NUH.j jVar, Ref.ObjectRef objectRef, AlertDialog alertDialog, FragmentActivity fragmentActivity, View view) {
        if (jVar != null) {
            Uo(fragmentActivity, (View) objectRef.element);
            jVar.n(alertDialog, -1, String.valueOf(((TextInputEditText) objectRef.element).getText()));
        } else {
            Uo(fragmentActivity, (View) objectRef.element);
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }
}
