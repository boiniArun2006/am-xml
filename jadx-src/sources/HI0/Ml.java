package HI0;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.safedk.android.utils.Logger;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3824O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3825n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3826t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3826t = obj;
            this.f3824O |= Integer.MIN_VALUE;
            return Ml.ck(null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HI(Activity activity, String permission, boolean z2) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return XoT.fuX.Z(activity, permission);
    }

    public static final void J2(Activity activity, String link) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(link, "link");
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new Intent("android.intent.action.VIEW", Uri.parse(link)));
    }

    public static final void KN(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (activity.getWindow() != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            if (O(window, 128)) {
                return;
            }
            activity.getWindow().addFlags(128);
        }
    }

    public static final void Uo(Fragment fragment, String link) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(link, "link");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            J2(activity, link);
        }
    }

    public static final void az(final Activity activity, CHm.j permissions, int i2, Integer num, Function0 operation) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (CHm.n.n(permissions, new Function2() { // from class: HI0.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(Ml.HI(activity, (String) obj, ((Boolean) obj2).booleanValue()));
            }
        })) {
            operation.invoke();
        } else if (num != null) {
            mUb(activity, permissions, i2, num.intValue());
        } else {
            xMQ(activity, permissions, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object ck(Activity activity, Function1 function1, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f3824O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f3824O = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objInvoke = jVar.f3826t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f3824O;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                KN(activity);
                jVar.f3825n = activity;
                jVar.f3824O = 1;
                objInvoke = function1.invoke(jVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activity = (Activity) jVar.f3825n;
                ResultKt.throwOnFailure(objInvoke);
            }
            return objInvoke;
        } finally {
            nr(activity);
        }
    }

    public static final void nr(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (activity.getWindow() != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            if (O(window, 128)) {
                activity.getWindow().clearFlags(128);
            }
        }
    }

    public static /* synthetic */ void ty(Activity activity, CHm.j jVar, int i2, Integer num, Function0 function0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        az(activity, jVar, i2, num, function0);
    }

    private static final boolean O(Window window, int i2) {
        if ((window.getAttributes().flags & i2) == i2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private static final void mUb(final Activity activity, CHm.j jVar, int i2, int i3) {
        if (jVar.J2() && com.alightcreative.app.motion.persist.j.INSTANCE.isFirstMediaAccessRequest()) {
            xMQ(activity, jVar, i2);
        } else {
            new AlertDialog.Builder(activity).o(2132020233).Uo(i3).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: HI0.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    Ml.gh(dialogInterface, i5);
                }
            }).setPositiveButton(2132017199, new DialogInterface.OnClickListener() { // from class: HI0.w6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    Ml.qie(activity, dialogInterface, i5);
                }
            }).create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(Activity activity, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
    }

    private static final void xMQ(Activity activity, CHm.j jVar, int i2) {
        if (jVar.J2()) {
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar2.setMediaAccessRequestNumber(jVar2.getMediaAccessRequestNumber() + 1);
        }
        ActivityCompat.J2(activity, (String[]) jVar.O().keySet().toArray(new String[0]), i2);
    }
}
