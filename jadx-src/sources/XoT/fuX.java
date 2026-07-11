package XoT;

import CHm.j;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.safedk.android.utils.Logger;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final WeakHashMap f11839n = new WeakHashMap();

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static final boolean HI(final Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return CHm.n.n(j.Ml.KN, new Function2() { // from class: XoT.Ml
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(fuX.KN(context, (String) obj, ((Boolean) obj2).booleanValue()));
            }
        });
    }

    public static final boolean Ik(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        NetworkInfo activeNetworkInfo = qie(context).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean KN(Context context, String permission, boolean z2) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return Z(context, permission);
    }

    public static final void S(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(url)));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uo(Context context, String permission, boolean z2) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return Z(context, permission);
    }

    public static final void ViF(Context context, Function1 callback) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        aYN(context, new Pl(callback).rl());
    }

    public static final void WPU(Context context, Pl cb2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(cb2, "cb");
        aYN(context, cb2.rl());
    }

    public static final boolean XQ(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final boolean Z(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public static final void aYN(Context context, ConnectivityManager.NetworkCallback ncb) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(ncb, "ncb");
        qie(context).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), ncb);
    }

    public static final Context az(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        WeakHashMap weakHashMap = f11839n;
        Object objCreateConfigurationContext = weakHashMap.get(context);
        if (objCreateConfigurationContext == null) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(Locale.ENGLISH);
            objCreateConfigurationContext = context.createConfigurationContext(configuration);
            weakHashMap.put(context, objCreateConfigurationContext);
        }
        return (Context) objCreateConfigurationContext;
    }

    public static final boolean ck(final Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return CHm.n.n(j.Ml.KN, new Function2() { // from class: XoT.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(fuX.xMQ(context, (String) obj, ((Boolean) obj2).booleanValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gh(Context context, String permission, boolean z2) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return Z(context, permission);
    }

    public static final void iF(Context context, ConnectivityManager.NetworkCallback ncb) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(ncb, "ncb");
        qie(context).unregisterNetworkCallback(ncb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mUb(Context context, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, PtsLKY.ueu);
        return Z(context, str);
    }

    public static final void nY(Activity activity, Function0 operation) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (Ik(activity)) {
            operation.invoke();
        } else {
            new AlertDialog.Builder(activity).o(2132019733).setNegativeButton(2132017378, new DialogInterface.OnClickListener() { // from class: XoT.I28
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    fuX.g(dialogInterface, i2);
                }
            }).create().show();
        }
    }

    public static final boolean o(final Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return CHm.n.n(j.I28.KN, new Function2() { // from class: XoT.CN3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(fuX.gh(context, (String) obj, ((Boolean) obj2).booleanValue()));
            }
        });
    }

    public static final ConnectivityManager qie(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    public static final boolean r(final Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return CHm.n.n(j.w6.KN, new Function2() { // from class: XoT.Wre
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(fuX.mUb(context, (String) obj, ((Boolean) obj2).booleanValue()));
            }
        });
    }

    public static final void te(Context context, Pl cb2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(cb2, "cb");
        iF(context, cb2.rl());
    }

    public static final boolean ty(final Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return CHm.n.n(j.n.KN, new Function2() { // from class: XoT.w6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(fuX.Uo(context, (String) obj, ((Boolean) obj2).booleanValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(Context context, String permission, boolean z2) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return !z2 || Z(context, permission);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }
}
