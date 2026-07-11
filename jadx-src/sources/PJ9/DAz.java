package PJ9;

import QmE.iF;
import QmE.j;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import androidx.core.os.BundleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity;
import com.alightcreative.app.motion.activities.rv6;
import com.alightcreative.app.motion.signin.SignInFailException;
import com.alightcreative.widget.fuX;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class DAz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f7667n = false;
    private static String rl = "https://alightcreative.com";

    private static final String jB(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "%25", "%", false, 4, (Object) null), "%3D", l.ae, false, 4, (Object) null), "%26", "&", false, 4, (Object) null);
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    private static final boolean te(int i2, IdpResponse idpResponse, iF iFVar) {
        if (idpResponse == null) {
            iFVar.n(j.Ji.f8411n);
            return false;
        }
        if (i2 == -1) {
            iFVar.n(new j.iy(idpResponse.getProviderType()));
            f7667n = false;
            return true;
        }
        iFVar.n(new j.J(idpResponse.getProviderType(), idpResponse.getError()));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        String string = idpResponse.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        firebaseCrashlytics.recordException(new SignInFailException(string));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ActionCodeSettings D(Activity activity, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return J(activity, str);
    }

    public static final boolean E(final Activity activity, Intent intent) {
        String email;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        FirebaseUser firebaseUserXMQ = firebaseAuth.xMQ();
        if (firebaseUserXMQ == null || (email = firebaseUserXMQ.getEmail()) == null || !AuthUI.canHandleIntent(intent)) {
            return false;
        }
        final String strValueOf = String.valueOf(intent.getData());
        AuthCredential authCredentialRl = com.google.firebase.auth.I28.rl(email, strValueOf);
        Intrinsics.checkNotNullExpressionValue(authCredentialRl, "getCredentialWithLink(...)");
        firebaseUserXMQ.UF(authCredentialRl).addOnCompleteListener(new OnCompleteListener() { // from class: PJ9.ci
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                DAz.M(strValueOf, activity, task);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: PJ9.g9s
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                DAz.FX(activity, exc);
            }
        });
        return true;
    }

    public static /* synthetic */ void E2(Activity activity, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = new Function0() { // from class: PJ9.SPz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DAz.e();
                }
            };
        }
        fD(activity, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FX(Activity activity, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fuX.j jVar = new fuX.j(activity);
        String localizedMessage = it.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        jVar.nr(localizedMessage).J2(2132017378, new Function1() { // from class: PJ9.fuX
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.B((com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    public static final void G7(Activity activity, Function0 action) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (FirebaseAuth.getInstance().xMQ() != null) {
            action.invoke();
        } else {
            fD(activity, action);
        }
    }

    public static final void GR(final Activity activity, AuthCredential credential, final Function0 listener) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(listener, "listener");
        FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ == null) {
            return;
        }
        Task taskHBN = firebaseUserXMQ.HBN(credential);
        final Function1 function1 = new Function1() { // from class: PJ9.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.Nxk(listener, (Void) obj);
            }
        };
        taskHBN.addOnSuccessListener(new OnSuccessListener() { // from class: PJ9.C
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                DAz.Y(function1, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: PJ9.o
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                DAz.k(activity, exc);
            }
        });
    }

    public static final String I(FirebaseUser firebaseUser) {
        Intrinsics.checkNotNullParameter(firebaseUser, "<this>");
        return "User_" + ((Object) firebaseUser.f().subSequence(0, 7));
    }

    public static final ActionCodeSettings J(Activity activity, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        String str3 = rl;
        if (str != null) {
            str2 = "?" + str;
        } else {
            str2 = "";
        }
        ActionCodeSettings actionCodeSettingsN = ActionCodeSettings.HBN().O(str3 + str2).t(true).nr("com.alightcreative.motion").rl(activity.getPackageName(), true, "585").n();
        Intrinsics.checkNotNullExpressionValue(actionCodeSettingsN, "build(...)");
        return actionCodeSettingsN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(String str, Activity activity, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Uri uri = Uri.parse(jB(str));
            String queryParameter = uri.getQueryParameter("mode");
            String queryParameter2 = Uri.parse(uri.getQueryParameter("continueUrl")).getQueryParameter("actions");
            if (Intrinsics.areEqual(queryParameter, "signIn") && Intrinsics.areEqual(queryParameter2, rv6.f45639t.rl())) {
                z(activity);
                return;
            }
            if (Intrinsics.areEqual(queryParameter, "signIn") && Intrinsics.areEqual(queryParameter2, "deleteAccount")) {
                Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[0], 0);
                Intent intent = new Intent(activity, (Class<?>) AgreeDeleteAccountActivity.class);
                intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intent, Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M7(Activity activity, final com.google.firebase.storage.o oVar, final Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        XoT.C.Uo(activity, new Function0() { // from class: PJ9.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DAz.p5(oVar, it);
            }
        });
    }

    public static final boolean Mx(Activity activity, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        String strValueOf = String.valueOf(intent.getData());
        if (!firebaseAuth.HI(strValueOf) || !AuthUI.canHandleIntent(intent)) {
            return false;
        }
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, ((AuthUI.SignInIntentBuilder) ((AuthUI.SignInIntentBuilder) ((AuthUI.SignInIntentBuilder) ((AuthUI.SignInIntentBuilder) AuthUI.getInstance().createSignInIntentBuilder().setCredentialManagerEnabled(!f7667n)).setLogo(2131230977)).setTheme(2132083036)).setAvailableProviders(CollectionsKt.listOf(new AuthUI.IdpConfig.EmailBuilder().setActionCodeSettings(D(activity, null, 1, null)).enableEmailLinkSignIn().build()))).setEmailLink(strValueOf).build(), 12003);
        return true;
    }

    public static final boolean N(final Activity activity, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        Uri uri = Uri.parse(jB(String.valueOf(intent.getData())));
        String queryParameter = uri.getQueryParameter("continueUrl");
        Uri uri2 = queryParameter != null ? Uri.parse(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("mode");
        String queryParameter3 = uri.getQueryParameter("oobCode");
        String queryParameter4 = uri2 != null ? uri2.getQueryParameter("actions") : null;
        String queryParameter5 = uri.getQueryParameter(Scopes.EMAIL);
        if (queryParameter3 == null || !Intrinsics.areEqual(queryParameter2, "verifyAndChangeEmail") || !Intrinsics.areEqual(queryParameter4, rv6.f45639t.rl()) || queryParameter5 == null) {
            return false;
        }
        Task taskNr = firebaseAuth.nr(queryParameter3);
        final Function1 function1 = new Function1() { // from class: PJ9.Wre
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.nHg(activity, firebaseAuth, (Void) obj);
            }
        };
        taskNr.addOnSuccessListener(new OnSuccessListener() { // from class: PJ9.z
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                DAz.rV9(function1, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: PJ9.r
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                DAz.bzg(activity, exc);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P5(boolean z2, String str, final Activity activity, Task it) {
        List<com.google.firebase.storage.o> listRl;
        Intrinsics.checkNotNullParameter(it, "it");
        if (z2) {
            listRl = ((com.google.firebase.storage.fuX) it.getResult()).rl();
            Intrinsics.checkNotNull(listRl);
        } else {
            List listRl2 = ((com.google.firebase.storage.fuX) it.getResult()).rl();
            Intrinsics.checkNotNullExpressionValue(listRl2, "getItems(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listRl2) {
                if (!Intrinsics.areEqual(((com.google.firebase.storage.o) obj).mUb(), str)) {
                    arrayList.add(obj);
                }
            }
            listRl = arrayList;
        }
        for (final com.google.firebase.storage.o oVar : listRl) {
            oVar.nr().addOnCompleteListener(new OnCompleteListener() { // from class: PJ9.UGc
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    DAz.M7(activity, oVar, task);
                }
            });
        }
    }

    public static final void T(iF eventLogger) {
        List listP0N;
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        FirebaseUser firebaseUserXMQ = firebaseAuth.xMQ();
        boolean z2 = false;
        if (firebaseUserXMQ != null && (listP0N = firebaseUserXMQ.p0N()) != null && !listP0N.isEmpty()) {
            Iterator it = listP0N.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(((com.google.firebase.auth.QJ) it.next()).n1(), "google.com")) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        try {
            FirebaseAuth.getInstance().ViF();
            if (z2) {
                GoogleSignIn.getClient(IvA.n.rl().getApplicationContext(), new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build()).signOut();
            }
            eventLogger.n(j.I.f8401n);
        } catch (Exception e2) {
            eventLogger.n(new j.dd(e2));
        }
        f7667n = true;
    }

    public static final void U(final Activity activity, final String str, final boolean z2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ == null) {
            return;
        }
        Task taskCk = com.google.firebase.storage.I28.J2().ty().rl("user").rl(TtmlNode.TAG_P).rl(firebaseUserXMQ.f()).rl("photo").ck();
        Intrinsics.checkNotNullExpressionValue(taskCk, "listAll(...)");
        taskCk.addOnCompleteListener(new OnCompleteListener() { // from class: PJ9.l3D
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                DAz.P5(z2, str, activity, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xw(com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List a(List list) {
        String strN1;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.QJ qj = (com.google.firebase.auth.QJ) it.next();
            String strN12 = qj.n1();
            int iHashCode = strN12.hashCode();
            if (iHashCode != -1536293812) {
                if (iHashCode != -364826023) {
                    if (iHashCode == 1216985755 && strN12.equals("password")) {
                        strN1 = Scopes.EMAIL;
                    } else {
                        strN1 = qj.n1();
                        Intrinsics.checkNotNullExpressionValue(strN1, "getProviderId(...)");
                    }
                } else if (strN12.equals("facebook.com")) {
                    strN1 = "facebook";
                }
            } else if (strN12.equals("google.com")) {
                strN1 = "google";
            }
            arrayList.add(strN1);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bzg(Activity activity, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fuX.j jVar = new fuX.j(activity);
        String localizedMessage = it.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        jVar.nr(localizedMessage).J2(2132017378, new Function1() { // from class: PJ9.Z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.Xw((com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dR0(com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e() {
        return Unit.INSTANCE;
    }

    public static final void fD(Activity activity, Function0 onSuccessCallback) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(onSuccessCallback, "onSuccessCallback");
        Object systemService = activity.getSystemService(LHbnkhI.rMqYQeLpe);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            new AlertDialog.Builder(activity).o(2132019733).Uo(2132019734).setPositiveButton(2132017436, new DialogInterface.OnClickListener() { // from class: PJ9.Dsr
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    DAz.X(dialogInterface, i2);
                }
            }).create().show();
        } else {
            eF(activity, onSuccessCallback);
        }
    }

    public static final boolean g(int i2, int i3, Intent intent, iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        if (i2 == 12001) {
            return te(i3, new FirebaseAuthUIActivityResultContract().parseResult(i3, intent).getIdpResponse(), eventLogger);
        }
        return false;
    }

    public static final boolean iF(FirebaseAuthUIAuthenticationResult firebaseAuthUIAuthenticationResult, iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        if (firebaseAuthUIAuthenticationResult == null) {
            return false;
        }
        Integer resultCode = firebaseAuthUIAuthenticationResult.getResultCode();
        Intrinsics.checkNotNullExpressionValue(resultCode, "getResultCode(...)");
        return te(resultCode.intValue(), firebaseAuthUIAuthenticationResult.getIdpResponse(), eventLogger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ijL(com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Activity activity, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fuX.j jVar = new fuX.j(activity);
        String localizedMessage = it.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        jVar.nr(localizedMessage).J2(2132017378, new Function1() { // from class: PJ9.qz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.dR0((com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nHg(final Activity activity, final FirebaseAuth firebaseAuth, Void r3) {
        new fuX.j(activity).t(2132017422).J2(2132017378, new Function1() { // from class: PJ9.afx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.s7N(firebaseAuth, activity, (com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ofS(Activity activity, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fuX.j jVar = new fuX.j(activity);
        String localizedMessage = it.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        jVar.nr(localizedMessage).J2(2132017378, new Function1() { // from class: PJ9.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.C((com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pJg(com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit piY(Activity activity, String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        eTf(activity, StringsKt.trim((CharSequence) email).toString(), J(activity, "actions=" + rv6.f45639t.rl() + "&email=" + StringsKt.trim((CharSequence) email).toString()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s7N(FirebaseAuth firebaseAuth, final Activity activity, com.alightcreative.widget.fuX it) {
        Task taskX4T;
        Intrinsics.checkNotNullParameter(it, "it");
        FirebaseUser firebaseUserXMQ = firebaseAuth.xMQ();
        if (firebaseUserXMQ != null && (taskX4T = firebaseUserXMQ.X4T()) != null) {
            taskX4T.addOnFailureListener(new OnFailureListener() { // from class: PJ9.Pl
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    DAz.wTp(activity, exc);
                }
            });
        }
        it.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Exception exc, Activity activity, com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (exc instanceof FirebaseAuthInvalidUserException) {
            E2(activity, null, 1, null);
        }
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wTp(final Activity activity, final Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        fuX.j jVar = new fuX.j(activity);
        String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        jVar.nr(localizedMessage).J2(2132017378, new Function1() { // from class: PJ9.QJ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.v(exception, activity, (com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xg(Activity activity, String str, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccessful()) {
            new fuX.j(activity).KN(str).t(2132017420).J2(2132017378, new Function1() { // from class: PJ9.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DAz.pJg((com.alightcreative.widget.fuX) obj);
                }
            }).n().nHg();
        }
    }

    public static final void z(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        new fuX.j(activity).Uo(2132017419).t(2132017417).rl(32, true, new Function1() { // from class: PJ9.Ew
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.piY(activity, (String) obj);
            }
        }).J2(2132020114, new Function1() { // from class: PJ9.nKK
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.ijL((com.alightcreative.widget.fuX) obj);
            }
        }).O(2132017396, new Function1() { // from class: PJ9.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DAz.m((com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Nxk(Function0 function0, Void r12) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void eF(Activity activity, Function0 function0) {
        Intent intentBuild = ((AuthUI.SignInIntentBuilder) ((AuthUI.SignInIntentBuilder) ((AuthUI.SignInIntentBuilder) ((AuthUI.SignInIntentBuilder) AuthUI.getInstance().createSignInIntentBuilder().setCredentialManagerEnabled(!f7667n)).setLogo(2131230977)).setTheme(2132083036)).setAvailableProviders(CollectionsKt.listOf((Object[]) new AuthUI.IdpConfig[]{new AuthUI.IdpConfig.EmailBuilder().setActionCodeSettings(D(activity, null, 1, null)).enableEmailLinkSignIn().build(), new AuthUI.IdpConfig.GoogleBuilder().build(), new AuthUI.IdpConfig.FacebookBuilder().build()}))).build();
        Intrinsics.checkNotNullExpressionValue(intentBuild, "build(...)");
        if (activity instanceof I28) {
            ((I28) activity).ViF().nr(intentBuild, function0);
        } else {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intentBuild, 12001);
        }
    }

    private static final void eTf(final Activity activity, final String str, ActionCodeSettings actionCodeSettings) {
        FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ == null) {
            return;
        }
        firebaseUserXMQ.EF(str, actionCodeSettings).addOnCompleteListener(new OnCompleteListener() { // from class: PJ9.Xo
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                DAz.xg(activity, str, task);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: PJ9.eO
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                DAz.ofS(activity, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p5(com.google.firebase.storage.o oVar, Task task) {
        return "TESTTEST :: delete old proflie photo :: " + oVar.mUb() + ", " + task.isSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rV9(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
