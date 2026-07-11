package com.alightcreative.app.motion.activities;

import GJW.xuv;
import HI0.AbstractC1370c;
import QmE.j;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.alightcreative.app.motion.activities.ManageAccountActivity;
import com.alightcreative.widget.SettingEditText;
import com.alightcreative.widget.fuX;
import com.facebook.AccessToken;
import com.facebook.Dsr;
import com.facebook.FacebookException;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.login.LoginManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001e\u0010\u0003J\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0015¢\u0006\u0004\b!\u0010\"J)\u0010(\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010&H\u0015¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0017¢\u0006\u0004\b*\u0010\u0003R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR&\u0010S\u001a\u0012\u0012\u0004\u0012\u00020\u00040Oj\b\u0012\u0004\u0012\u00020\u0004`P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u00108¨\u0006V"}, d2 = {"Lcom/alightcreative/app/motion/activities/ManageAccountActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "provider", "Lcom/alightcreative/app/motion/activities/rv6;", FileUploadManager.f61572j, "", "EF", "(Ljava/lang/String;Lcom/alightcreative/app/motion/activities/rv6;)V", "Lcom/google/firebase/auth/FirebaseAuth;", "auth", "n7b", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "v0j", "vl", "I4p", "providerId", "tEO", "(Ljava/lang/String;)V", "", "o9", "()Z", "Landroid/net/Uri;", "uri", "iV", "(Landroid/net/Uri;)V", "bZm", "onStart", "onStop", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "LSJ0/Q;", "r", "LSJ0/Q;", "binding", "LQmE/iF;", "o", "LQmE/iF;", "Aum", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "Z", "LkgE/fuX;", CmcdData.STREAMING_FORMAT_SS, "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LGJW/xuv;", "S", "LGJW/xuv;", "scopeJob", "Lcom/facebook/Dsr;", "g", "Lcom/facebook/Dsr;", "callbackManager", "E2", "Ljava/lang/String;", "originalUserName", "e", "Landroid/net/Uri;", "originalProfilePhoto", "X", "newProfilePhotoUri", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/ArrayList;", "providerIds", "N", "uploadingProfile", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nManageAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageAccountActivity.kt\ncom/alightcreative/app/motion/activities/ManageAccountActivity\n+ 2 ContextUtil.kt\ncom/alightcreative/ext/ContextUtilKt\n+ 3 ViewUtils.kt\ncom/alightcreative/ext/ViewUtilsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,709:1\n98#2:710\n93#2,7:711\n24#3:718\n24#3:723\n327#4,4:719\n*S KotlinDebug\n*F\n+ 1 ManageAccountActivity.kt\ncom/alightcreative/app/motion/activities/ManageAccountActivity\n*L\n420#1:710\n420#1:711,7\n663#1:718\n302#1:723\n156#1:719,4\n*E\n"})
public final class ManageAccountActivity extends Zgp {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private String originalUserName;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean uploadingProfile;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private GJW.xuv scopeJob;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private ArrayList providerIds = new ArrayList();

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private Uri newProfilePhotoUri;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Uri originalProfilePhoto;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private com.facebook.Dsr callbackManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SJ0.Q binding;

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function1 {
        I28(Object obj) {
            super(1, obj, ManageAccountActivity.class, "unlinkProvider", "unlinkProvider(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ManageAccountActivity) this.receiver).tEO(p0);
        }
    }

    public static final class Ml implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s2, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(s2, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s2, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(s2, "s");
        }

        Ml() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s2) {
            Intrinsics.checkNotNullParameter(s2, "s");
            SJ0.Q q2 = ManageAccountActivity.this.binding;
            if (q2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                q2 = null;
            }
            q2.az.setEnabled(ManageAccountActivity.this.o9());
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
        Wre(Object obj) {
            super(1, obj, ManageAccountActivity.class, "unlinkProvider", "unlinkProvider(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ManageAccountActivity) this.receiver).tEO(p0);
        }
    }

    public static final class j implements com.facebook.aC {
        final /* synthetic */ rv6 rl;

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.ManageAccountActivity$j$j, reason: collision with other inner class name */
        /* synthetic */ class C0620j extends FunctionReferenceImpl implements Function0 {
            C0620j(Object obj) {
                super(0, obj, ManageAccountActivity.class, "afterReAuthenticationForDeleteAccount", "afterReAuthenticationForDeleteAccount()V", 0);
            }

            public final void n() {
                ((ManageAccountActivity) this.receiver).v0j();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
            n(Object obj) {
                super(0, obj, ManageAccountActivity.class, "afterReAuthenticationForChangeEmail", "afterReAuthenticationForChangeEmail()V", 0);
            }

            public final void n() {
                ((ManageAccountActivity) this.receiver).vl();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        @Override // com.facebook.aC
        public void onCancel() {
        }

        j(rv6 rv6Var) {
            this.rl = rv6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit rl(com.alightcreative.widget.fuX it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.o();
            return Unit.INSTANCE;
        }

        @Override // com.facebook.aC
        public void onError(FacebookException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            fuX.j jVar = new fuX.j(ManageAccountActivity.this);
            String localizedMessage = error.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            jVar.nr(localizedMessage).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.y4A
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManageAccountActivity.j.rl((com.alightcreative.widget.fuX) obj);
                }
            }).n().nHg();
        }

        @Override // com.facebook.aC
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.login.Q result) {
            Intrinsics.checkNotNullParameter(result, "result");
            AccessToken accessTokenN = result.n();
            ManageAccountActivity manageAccountActivity = ManageAccountActivity.this;
            AuthCredential authCredentialN = com.google.firebase.auth.Wre.n(accessTokenN.getToken());
            Intrinsics.checkNotNullExpressionValue(authCredentialN, "getCredential(...)");
            PJ9.DAz.GR(manageAccountActivity, authCredentialN, this.rl == rv6.f45635O ? new C0620j(ManageAccountActivity.this) : new n(ManageAccountActivity.this));
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
        n(Object obj) {
            super(0, obj, ManageAccountActivity.class, "afterReAuthenticationForDeleteAccount", "afterReAuthenticationForDeleteAccount()V", 0);
        }

        public final void n() {
            ((ManageAccountActivity) this.receiver).v0j();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
        w6(Object obj) {
            super(0, obj, ManageAccountActivity.class, "afterReAuthenticationForChangeEmail", "afterReAuthenticationForChangeEmail()V", 0);
        }

        public final void n() {
            ((ManageAccountActivity) this.receiver).vl();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Co(ManageAccountActivity manageAccountActivity) {
        manageAccountActivity.uploadingProfile = false;
        SJ0.Q q2 = manageAccountActivity.binding;
        SJ0.Q q3 = null;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        q2.az.setEnabled(manageAccountActivity.o9());
        SJ0.Q q4 = manageAccountActivity.binding;
        if (q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q3 = q4;
        }
        q3.gh.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ro(ManageAccountActivity manageAccountActivity, TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 6) {
            return true;
        }
        SJ0.Q q2 = manageAccountActivity.binding;
        SJ0.Q q3 = null;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        SettingEditText userNameEditText = q2.WPU;
        Intrinsics.checkNotNullExpressionValue(userNameEditText, "userNameEditText");
        HI0.o7q.KN(userNameEditText);
        SJ0.Q q4 = manageAccountActivity.binding;
        if (q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q3 = q4;
        }
        q3.WPU.clearFocus();
        return true;
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    static final class CN3 extends SuspendLambda implements Function2 {
        final /* synthetic */ byte[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.storage.o f44646O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ String f44647S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ ManageAccountActivity f44648Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44649n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ FirebaseUser f44650o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ UserProfileChangeRequest.j f44651r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f44652t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(com.google.firebase.storage.o oVar, byte[] bArr, UserProfileChangeRequest.j jVar, FirebaseUser firebaseUser, ManageAccountActivity manageAccountActivity, String str, Continuation continuation) {
            super(2, continuation);
            this.f44646O = oVar;
            this.J2 = bArr;
            this.f44651r = jVar;
            this.f44650o = firebaseUser;
            this.f44648Z = manageAccountActivity;
            this.f44647S = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            CN3 cn3 = new CN3(this.f44646O, this.J2, this.f44651r, this.f44650o, this.f44648Z, this.f44647S, continuation);
            cn3.f44652t = obj;
            return cn3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(com.alightcreative.widget.fuX fux) {
            fux.o();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GJW.vd vdVar;
            Object objRl;
            Throwable thM316exceptionOrNullimpl;
            Object objN;
            Throwable thM316exceptionOrNullimpl2;
            Object objT;
            GJW.vd vdVar2;
            Throwable thM316exceptionOrNullimpl3;
            String string;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44649n;
            String string2 = null;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            vdVar2 = (GJW.vd) this.f44652t;
                            ResultKt.throwOnFailure(obj);
                            objT = ((Result) obj).getValue();
                            if (!Result.m320isSuccessimpl(objT) && GJW.Lu.KN(vdVar2)) {
                                PJ9.DAz.U(this.f44648Z, this.f44647S, false);
                                ManageAccountActivity manageAccountActivity = this.f44648Z;
                                manageAccountActivity.originalProfilePhoto = manageAccountActivity.newProfilePhotoUri;
                                ManageAccountActivity manageAccountActivity2 = this.f44648Z;
                                SJ0.Q q2 = manageAccountActivity2.binding;
                                if (q2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    q2 = null;
                                }
                                Editable text = q2.WPU.getText();
                                if (text != null) {
                                    string = text.toString();
                                } else {
                                    string = null;
                                }
                                manageAccountActivity2.originalUserName = string;
                            } else if (GJW.Lu.KN(vdVar2) && ((thM316exceptionOrNullimpl3 = Result.m316exceptionOrNullimpl(objT)) == null || (string2 = thM316exceptionOrNullimpl3.getLocalizedMessage()) == null)) {
                                string2 = this.f44648Z.getString(2132019063);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            }
                            ManageAccountActivity.Co(this.f44648Z);
                            if (string2 != null) {
                                new fuX.j(this.f44648Z).nr(string2).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.hV
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return ManageAccountActivity.CN3.O((com.alightcreative.widget.fuX) obj2);
                                    }
                                }).n().nHg();
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vdVar = (GJW.vd) this.f44652t;
                    ResultKt.throwOnFailure(obj);
                    objN = ((Result) obj).getValue();
                    if (!Result.m320isSuccessimpl(objN) && GJW.Lu.KN(vdVar)) {
                        UserProfileChangeRequest.j jVar = this.f44651r;
                        if (Result.m319isFailureimpl(objN)) {
                            objN = null;
                        }
                        jVar.t((Uri) objN);
                        UserProfileChangeRequest userProfileChangeRequestN = this.f44651r.n();
                        Intrinsics.checkNotNullExpressionValue(userProfileChangeRequestN, "build(...)");
                        FirebaseUser firebaseUser = this.f44650o;
                        this.f44652t = vdVar;
                        this.f44649n = 3;
                        objT = Esr.t(firebaseUser, userProfileChangeRequestN, this);
                        if (objT != coroutine_suspended) {
                            vdVar2 = vdVar;
                            if (!Result.m320isSuccessimpl(objT)) {
                                if (GJW.Lu.KN(vdVar2)) {
                                    string2 = this.f44648Z.getString(2132019063);
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                }
                            }
                            ManageAccountActivity.Co(this.f44648Z);
                            if (string2 != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    if (GJW.Lu.KN(vdVar) && ((thM316exceptionOrNullimpl2 = Result.m316exceptionOrNullimpl(objN)) == null || (string2 = thM316exceptionOrNullimpl2.getLocalizedMessage()) == null)) {
                        string2 = this.f44648Z.getString(2132019063);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    }
                    ManageAccountActivity.Co(this.f44648Z);
                    if (string2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                vdVar = (GJW.vd) this.f44652t;
                ResultKt.throwOnFailure(obj);
                objRl = ((Result) obj).getValue();
            } else {
                ResultKt.throwOnFailure(obj);
                vdVar = (GJW.vd) this.f44652t;
                com.google.firebase.storage.o oVar = this.f44646O;
                byte[] bArr = this.J2;
                Intrinsics.checkNotNull(bArr);
                this.f44652t = vdVar;
                this.f44649n = 1;
                objRl = Esr.rl(oVar, bArr, this);
                if (objRl != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (Result.m320isSuccessimpl(objRl) && GJW.Lu.KN(vdVar)) {
                com.google.firebase.storage.o oVar2 = this.f44646O;
                this.f44652t = vdVar;
                this.f44649n = 2;
                objN = Esr.n(oVar2, this);
                if (objN != coroutine_suspended) {
                    if (!Result.m320isSuccessimpl(objN)) {
                    }
                    if (GJW.Lu.KN(vdVar)) {
                        string2 = this.f44648Z.getString(2132019063);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    }
                    ManageAccountActivity.Co(this.f44648Z);
                    if (string2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            if (GJW.Lu.KN(vdVar) && ((thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objRl)) == null || (string2 = thM316exceptionOrNullimpl.getLocalizedMessage()) == null)) {
                string2 = this.f44648Z.getString(2132019063);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
            ManageAccountActivity.Co(this.f44648Z);
            if (string2 != null) {
            }
            return Unit.INSTANCE;
        }
    }

    static final class fuX extends SuspendLambda implements Function2 {
        final /* synthetic */ UserProfileChangeRequest.j J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44655n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ FirebaseUser f44656r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f44657t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(UserProfileChangeRequest.j jVar, FirebaseUser firebaseUser, Continuation continuation) {
            super(2, continuation);
            this.J2 = jVar;
            this.f44656r = firebaseUser;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            fuX fux = ManageAccountActivity.this.new fuX(this.J2, this.f44656r, continuation);
            fux.f44657t = obj;
            return fux;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(com.alightcreative.widget.fuX fux) {
            fux.o();
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GJW.vd vdVar;
            Object value;
            String string;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44655n;
            String string2 = null;
            if (i2 != 0) {
                if (i2 == 1) {
                    vdVar = (GJW.vd) this.f44657t;
                    ResultKt.throwOnFailure(obj);
                    value = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                GJW.vd vdVar2 = (GJW.vd) this.f44657t;
                if (ManageAccountActivity.this.originalProfilePhoto != null && ManageAccountActivity.this.newProfilePhotoUri == null) {
                    this.J2.t(null);
                }
                UserProfileChangeRequest userProfileChangeRequestN = this.J2.n();
                Intrinsics.checkNotNullExpressionValue(userProfileChangeRequestN, "build(...)");
                FirebaseUser firebaseUser = this.f44656r;
                this.f44657t = vdVar2;
                this.f44655n = 1;
                Object objT = Esr.t(firebaseUser, userProfileChangeRequestN, this);
                if (objT == coroutine_suspended) {
                    return coroutine_suspended;
                }
                vdVar = vdVar2;
                value = objT;
            }
            if (Result.m320isSuccessimpl(value) && GJW.Lu.KN(vdVar)) {
                if (ManageAccountActivity.this.originalProfilePhoto != null && ManageAccountActivity.this.newProfilePhotoUri == null) {
                    PJ9.DAz.U(ManageAccountActivity.this, null, true);
                }
                ManageAccountActivity manageAccountActivity = ManageAccountActivity.this;
                manageAccountActivity.originalProfilePhoto = manageAccountActivity.newProfilePhotoUri;
                ManageAccountActivity manageAccountActivity2 = ManageAccountActivity.this;
                SJ0.Q q2 = manageAccountActivity2.binding;
                if (q2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    q2 = null;
                }
                Editable text = q2.WPU.getText();
                if (text != null) {
                    string2 = text.toString();
                }
                manageAccountActivity2.originalUserName = string2;
            } else if (GJW.Lu.KN(vdVar)) {
                Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(value);
                if (thM316exceptionOrNullimpl == null || (string = thM316exceptionOrNullimpl.getLocalizedMessage()) == null) {
                    string = ManageAccountActivity.this.getString(2132019063);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                new fuX.j(ManageAccountActivity.this).nr(string).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.gn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ManageAccountActivity.fuX.O((com.alightcreative.widget.fuX) obj2);
                    }
                }).n().nHg();
            }
            ManageAccountActivity.Co(ManageAccountActivity.this);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D76(final ManageAccountActivity manageAccountActivity, View view) {
        new fuX.j(manageAccountActivity).Uo(2132017416).t(2132017418).J2(2132020019, new Function1() { // from class: com.alightcreative.app.motion.activities.po
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.NP(this.f45587n, (com.alightcreative.widget.fuX) obj);
            }
        }).O(2132017396, new Function1() { // from class: com.alightcreative.app.motion.activities.CJc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.QgZ((com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    private final void EF(String provider, rv6 action) {
        final String email;
        if (provider == null) {
            return;
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        FirebaseUser firebaseUserXMQ = firebaseAuth.xMQ();
        if (firebaseUserXMQ == null) {
            return;
        }
        int iHashCode = provider.hashCode();
        if (iHashCode == -1536293812) {
            if (provider.equals("google.com")) {
                GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken("414370328124-4uocihe36cclhhtm4nr62trnd223ekr0.apps.googleusercontent.com").requestEmail().build();
                Intrinsics.checkNotNullExpressionValue(googleSignInOptionsBuild, "build(...)");
                GoogleSignInClient client = GoogleSignIn.getClient((Activity) this, googleSignInOptionsBuild);
                Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
                Intent signInIntent = client.getSignInIntent();
                Intrinsics.checkNotNullExpressionValue(signInIntent, "getSignInIntent(...)");
                signInIntent.putExtra("accountManagerAction", action.rl());
                safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, signInIntent, action == rv6.f45635O ? 13001 : 13002);
                return;
            }
            return;
        }
        if (iHashCode == -364826023) {
            if (provider.equals("facebook.com")) {
                this.callbackManager = Dsr.j.n();
                LoginManager.Companion companion = LoginManager.INSTANCE;
                companion.t().qie(this, CollectionsKt.listOf((Object[]) new String[]{Scopes.EMAIL, "public_profile"}));
                companion.t().ck(this.callbackManager, new j(action));
                return;
            }
            return;
        }
        if (iHashCode == 1216985755 && provider.equals("password") && (email = firebaseUserXMQ.getEmail()) != null) {
            Task taskO = FirebaseAuth.getInstance().o(email, PJ9.DAz.J(this, "actions=" + action.rl()));
            final Function1 function1 = new Function1() { // from class: com.alightcreative.app.motion.activities.q5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManageAccountActivity.uG(this.f45600n, email, (Void) obj);
                }
            };
            taskO.addOnSuccessListener(new OnSuccessListener() { // from class: com.alightcreative.app.motion.activities.Ci
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ManageAccountActivity.y(function1, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.alightcreative.app.motion.activities.fv
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ManageAccountActivity.Zn(this.f45244n, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EN(ManageAccountActivity manageAccountActivity, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        SJ0.Q q2 = null;
        if (motionEvent.getAction() == 1) {
            SJ0.Q q3 = manageAccountActivity.binding;
            if (q3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                q3 = null;
            }
            SettingEditText userNameEditText = q3.WPU;
            Intrinsics.checkNotNullExpressionValue(userNameEditText, "userNameEditText");
            HI0.o7q.ck(userNameEditText);
        }
        if (motionEvent.getAction() == 0) {
            SJ0.Q q4 = manageAccountActivity.binding;
            if (q4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                q4 = null;
            }
            q4.WPU.requestFocus();
            SJ0.Q q5 = manageAccountActivity.binding;
            if (q5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                q5 = null;
            }
            SettingEditText settingEditText = q5.WPU;
            SJ0.Q q6 = manageAccountActivity.binding;
            if (q6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                q2 = q6;
            }
            settingEditText.setSelection(q2.WPU.length());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Fp(ManageAccountActivity manageAccountActivity, View view) throws FileNotFoundException {
        SJ0.Q q2 = manageAccountActivity.binding;
        SJ0.Q q3 = null;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        SettingEditText userNameEditText = q2.WPU;
        Intrinsics.checkNotNullExpressionValue(userNameEditText, "userNameEditText");
        HI0.o7q.KN(userNameEditText);
        SJ0.Q q4 = manageAccountActivity.binding;
        if (q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q4 = null;
        }
        q4.WPU.clearFocus();
        SJ0.Q q5 = manageAccountActivity.binding;
        if (q5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q3 = q5;
        }
        q3.gh.setVisibility(0);
        manageAccountActivity.bZm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I9f(ManageAccountActivity manageAccountActivity, View view) {
        SJ0.Q q2 = manageAccountActivity.binding;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        ConstraintLayout progressBarHolder = q2.gh;
        Intrinsics.checkNotNullExpressionValue(progressBarHolder, "progressBarHolder");
        if (progressBarHolder.getVisibility() == 0) {
            return;
        }
        PJ9.DAz.T(manageAccountActivity.Aum());
        manageAccountActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LPV(ManageAccountActivity manageAccountActivity, com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        manageAccountActivity.finish();
        it.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Lp6(com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NP(ManageAccountActivity manageAccountActivity, com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = "google.com";
        if (!manageAccountActivity.providerIds.contains("google.com")) {
            str = "facebook.com";
            if (!manageAccountActivity.providerIds.contains("facebook.com")) {
                str = "password";
            }
        }
        manageAccountActivity.EF(str, rv6.f45639t);
        it.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QgZ(com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SR(ManageAccountActivity manageAccountActivity, EditText it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getText().clear();
        SJ0.Q q2 = manageAccountActivity.binding;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        SettingEditText userNameEditText = q2.WPU;
        Intrinsics.checkNotNullExpressionValue(userNameEditText, "userNameEditText");
        HI0.o7q.ck(userNameEditText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Th(ManageAccountActivity manageAccountActivity, com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        String str = "google.com";
        if (!manageAccountActivity.providerIds.contains("google.com")) {
            str = "facebook.com";
            if (!manageAccountActivity.providerIds.contains("facebook.com")) {
                str = "password";
            }
        }
        manageAccountActivity.EF(str, rv6.f45635O);
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Vvq(com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XNZ(final ManageAccountActivity manageAccountActivity, final ActivityResultLauncher activityResultLauncher, View view) {
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(manageAccountActivity, manageAccountActivity.s(), false);
        com.alightcreative.widget.nKK.ty(nkk, 2132017421, 2131361887, 0, false, null, 28, null);
        com.alightcreative.widget.nKK.ty(nkk, 2132020035, 2131361955, 0, false, null, 28, null);
        nkk.fD(new Function1() { // from class: com.alightcreative.app.motion.activities.CRI
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.lNy(activityResultLauncher, manageAccountActivity, ((Integer) obj).intValue());
            }
        });
        nkk.X(manageAccountActivity.getResources().getDimensionPixelSize(2131166272));
        SJ0.Q q2 = manageAccountActivity.binding;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        CardView profileImageHolder = q2.KN;
        Intrinsics.checkNotNullExpressionValue(profileImageHolder, "profileImageHolder");
        com.alightcreative.widget.nKK.N(nkk, profileImageHolder, 0, 0, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zn(ManageAccountActivity manageAccountActivity, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fuX.j jVar = new fuX.j(manageAccountActivity);
        String localizedMessage = it.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        jVar.nr(localizedMessage).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.bD
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.nO((com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g6(com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    private final void iV(Uri uri) {
        this.newProfilePhotoUri = uri;
        SJ0.Q q2 = this.binding;
        SJ0.Q q3 = null;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        q2.ViF.gh(this.newProfilePhotoUri, null);
        SJ0.Q q4 = this.binding;
        if (q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q3 = q4;
        }
        q3.az.setEnabled(o9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ManageAccountActivity manageAccountActivity, View view) {
        GJW.xuv xuvVar = manageAccountActivity.scopeJob;
        SJ0.Q q2 = null;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        manageAccountActivity.uploadingProfile = false;
        SJ0.Q q3 = manageAccountActivity.binding;
        if (q3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q3 = null;
        }
        q3.az.setEnabled(manageAccountActivity.o9());
        SJ0.Q q4 = manageAccountActivity.binding;
        if (q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q2 = q4;
        }
        q2.gh.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jO(final ManageAccountActivity manageAccountActivity, View view) {
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(manageAccountActivity, manageAccountActivity.s(), false);
        com.alightcreative.widget.nKK.ty(nkk, 2132017651, 2131361897, 0, false, null, 28, null);
        nkk.fD(new Function1() { // from class: com.alightcreative.app.motion.activities.lmM
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.Toy(this.f45324n, ((Integer) obj).intValue());
            }
        });
        nkk.X(manageAccountActivity.getResources().getDimensionPixelSize(2131166272));
        SJ0.Q q2 = manageAccountActivity.binding;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        ImageButton overflowButton = q2.Uo;
        Intrinsics.checkNotNullExpressionValue(overflowButton, "overflowButton");
        com.alightcreative.widget.nKK.N(nkk, overflowButton, 0, 0, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(final FirebaseUser firebaseUser, String str, final ManageAccountActivity manageAccountActivity, com.alightcreative.widget.fuX dialog) {
        Task taskJVN;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (firebaseUser != null && (taskJVN = firebaseUser.JVN(str)) != null) {
            final Function1 function1 = new Function1() { // from class: com.alightcreative.app.motion.activities.uO
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManageAccountActivity.eo(this.f45690n, firebaseUser, (AuthResult) obj);
                }
            };
            Task taskAddOnSuccessListener = taskJVN.addOnSuccessListener(new OnSuccessListener() { // from class: com.alightcreative.app.motion.activities.Ue
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ManageAccountActivity.wKY(function1, obj);
                }
            });
            if (taskAddOnSuccessListener != null) {
                taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.alightcreative.app.motion.activities.Vw
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        ManageAccountActivity.mx(this.f44805n, exc);
                    }
                });
            }
        }
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lS(com.alightcreative.widget.fuX failureDialog) {
        Intrinsics.checkNotNullParameter(failureDialog, "failureDialog");
        failureDialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mx(ManageAccountActivity manageAccountActivity, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        manageAccountActivity.Aum().n(new j.tUY(it));
        fuX.j jVar = new fuX.j(manageAccountActivity);
        String localizedMessage = it.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        jVar.nr(localizedMessage).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.LAo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.lS((com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nO(com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o9() {
        String str = this.originalUserName;
        SJ0.Q q2 = this.binding;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        Editable text = q2.WPU.getText();
        return (Intrinsics.areEqual(str, text != null ? text.toString() : null) && Intrinsics.areEqual(this.originalProfilePhoto, this.newProfilePhotoUri)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pS(ManageAccountActivity manageAccountActivity, View view, boolean z2) {
        SJ0.Q q2 = manageAccountActivity.binding;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        q2.WPU.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, z2 ? AppCompatResources.rl(manageAccountActivity, 2131231696) : null, (Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rxp(com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uG(ManageAccountActivity manageAccountActivity, String str, Void r2) {
        new fuX.j(manageAccountActivity).KN(str).t(2132020176).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.cCR
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.Vvq((com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uQ(ManageAccountActivity manageAccountActivity, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        manageAccountActivity.I4p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wKp(com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xzo(ManageAccountActivity manageAccountActivity, ActivityResult result) {
        Intent data;
        Uri data2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() != -1 || (data = result.getData()) == null || (data2 = data.getData()) == null) {
            return;
        }
        manageAccountActivity.iV(data2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit yAc(com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    public final QmE.iF Aum() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        SJ0.Q q2 = this.binding;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        ConstraintLayout progressBarHolder = q2.gh;
        Intrinsics.checkNotNullExpressionValue(progressBarHolder, "progressBarHolder");
        if (progressBarHolder.getVisibility() == 0 || this.uploadingProfile) {
            return;
        }
        super.onBackPressed();
    }

    public final kgE.fuX s() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    private final void I4p() {
        String displayName;
        Uri photoUrl;
        String string;
        int i2;
        FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ == null || (displayName = firebaseUserXMQ.getDisplayName()) == null) {
            displayName = "";
        }
        SJ0.Q q2 = this.binding;
        SJ0.Q q3 = null;
        if (q2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q2 = null;
        }
        SimpleDraweeView simpleDraweeView = q2.ViF;
        if (firebaseUserXMQ != null) {
            photoUrl = firebaseUserXMQ.getPhotoUrl();
        } else {
            photoUrl = null;
        }
        simpleDraweeView.gh(photoUrl, null);
        SJ0.Q q4 = this.binding;
        if (q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q4 = null;
        }
        q4.WPU.setText(displayName);
        SJ0.Q q5 = this.binding;
        if (q5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q5 = null;
        }
        AppCompatTextView appCompatTextView = q5.f9274S;
        if (firebaseUserXMQ == null || (string = firebaseUserXMQ.getEmail()) == null) {
            string = getString(2132019746);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        appCompatTextView.setText(string);
        SJ0.Q q6 = this.binding;
        if (q6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6 = null;
        }
        AppCompatTextView appCompatTextView2 = q6.XQ;
        if (firebaseUserXMQ != null && firebaseUserXMQ.rl()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        appCompatTextView2.setVisibility(i2);
        this.providerIds.clear();
        ArrayList arrayList = new ArrayList();
        if (firebaseUserXMQ != null) {
            com.google.firebase.auth.QJ qj = null;
            for (com.google.firebase.auth.QJ qj2 : firebaseUserXMQ.p0N()) {
                this.providerIds.add(qj2.n1());
                String strN1 = qj2.n1();
                int iHashCode = strN1.hashCode();
                if (iHashCode != -1536293812) {
                    if (iHashCode != -364826023) {
                        if (iHashCode == 1216985755 && strN1.equals("password")) {
                            qj = qj2;
                        }
                    } else if (strN1.equals("facebook.com")) {
                        arrayList.add(qj2);
                    }
                } else if (strN1.equals("google.com")) {
                    arrayList.add(qj2);
                }
            }
            if (!arrayList.isEmpty()) {
                SJ0.Q q7 = this.binding;
                if (q7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    q7 = null;
                }
                q7.f9278r.setVisibility(0);
                SJ0.Q q8 = this.binding;
                if (q8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    q3 = q8;
                }
                q3.ck.setAdapter(new GX(arrayList, new I28(this)));
                return;
            }
            if (qj != null) {
                SJ0.Q q9 = this.binding;
                if (q9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    q9 = null;
                }
                q9.f9278r.setVisibility(0);
                SJ0.Q q10 = this.binding;
                if (q10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    q3 = q10;
                }
                q3.ck.setAdapter(new GX(CollectionsKt.listOf(qj), new Wre(this)));
                return;
            }
            SJ0.Q q11 = this.binding;
            if (q11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                q3 = q11;
            }
            q3.f9278r.setVisibility(8);
            return;
        }
        SJ0.Q q12 = this.binding;
        if (q12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q3 = q12;
        }
        q3.f9278r.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat Mh(View view, WindowInsetsCompat windowInsetsCompat) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Toy(final ManageAccountActivity manageAccountActivity, int i2) {
        if (i2 == 2131361897) {
            new fuX.j(manageAccountActivity).Uo(2132017651).t(2132017656).O(2132017396, new Function1() { // from class: com.alightcreative.app.motion.activities.BHo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManageAccountActivity.wKp((com.alightcreative.widget.fuX) obj);
                }
            }).J2(2132020019, new Function1() { // from class: com.alightcreative.app.motion.activities.de
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManageAccountActivity.Th(this.f45052n, (com.alightcreative.widget.fuX) obj);
                }
            }).n().nHg();
        }
        return Unit.INSTANCE;
    }

    private final void bZm() throws FileNotFoundException {
        String string;
        Uri uri;
        String string2;
        if (o9()) {
            this.uploadingProfile = true;
            FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
            if (firebaseUserXMQ != null) {
                com.google.firebase.storage.I28 i28J2 = com.google.firebase.storage.I28.J2();
                Intrinsics.checkNotNullExpressionValue(i28J2, "getInstance(...)");
                UserProfileChangeRequest.j jVar = new UserProfileChangeRequest.j();
                String str = this.originalUserName;
                SJ0.Q q2 = this.binding;
                InputStream inputStreamOpenInputStream = null;
                if (q2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    q2 = null;
                }
                Editable text = q2.WPU.getText();
                if (text != null) {
                    string = text.toString();
                } else {
                    string = null;
                }
                if (!Intrinsics.areEqual(str, string)) {
                    SJ0.Q q3 = this.binding;
                    if (q3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        q3 = null;
                    }
                    Editable text2 = q3.WPU.getText();
                    if (text2 != null) {
                        string2 = text2.toString();
                    } else {
                        string2 = null;
                    }
                    jVar.rl(string2);
                }
                if (!Intrinsics.areEqual(this.originalProfilePhoto, this.newProfilePhotoUri) && (uri = this.newProfilePhotoUri) != null) {
                    if (uri == null) {
                        return;
                    }
                    ContentResolver contentResolver = getContentResolver();
                    if (contentResolver != null) {
                        inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    }
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    int iMax = Math.max(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                    float f3 = 512.0f / iMax;
                    if (iMax > 512) {
                        Intrinsics.checkNotNull(bitmapDecodeStream);
                        bitmapDecodeStream = AbstractC1370c.t(bitmapDecodeStream, (int) (bitmapDecodeStream.getWidth() * f3), (int) (bitmapDecodeStream.getHeight() * f3));
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    String str2 = System.currentTimeMillis() + ".jpg";
                    com.google.firebase.storage.o oVarRl = i28J2.ty().rl("user").rl(TtmlNode.TAG_P).rl(firebaseUserXMQ.f()).rl("photo").rl(str2);
                    Intrinsics.checkNotNullExpressionValue(oVarRl, "child(...)");
                    this.scopeJob = GJW.C.nr(LifecycleKt.n(getLifecycleRegistry()), null, null, new CN3(oVarRl, byteArray, jVar, firebaseUserXMQ, this, str2, null), 3, null);
                    return;
                }
                this.scopeJob = GJW.C.nr(LifecycleKt.n(getLifecycleRegistry()), null, null, new fuX(jVar, firebaseUserXMQ, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eo(final ManageAccountActivity manageAccountActivity, FirebaseUser firebaseUser, AuthResult authResult) {
        manageAccountActivity.Aum().n(j.J2L.f8410n);
        firebaseUser.X4T().addOnCompleteListener(new OnCompleteListener() { // from class: com.alightcreative.app.motion.activities.df
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ManageAccountActivity.uQ(this.f45053n, task);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lNy(ActivityResultLauncher activityResultLauncher, ManageAccountActivity manageAccountActivity, int i2) {
        if (i2 != 2131361887) {
            if (i2 == 2131361955) {
                manageAccountActivity.iV(null);
            }
        } else {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.setType("image/*");
            activityResultLauncher.n(intent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n7b(FirebaseAuth auth) {
        if (auth.xMQ() == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tEO(final String providerId) {
        String string;
        final FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ != null && !firebaseUserXMQ.rl()) {
            new fuX.j(this).Uo(2132020374).t(2132020373).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.ni
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManageAccountActivity.yAc((com.alightcreative.widget.fuX) obj);
                }
            }).n().nHg();
            return;
        }
        if (Intrinsics.areEqual(providerId, "google.com")) {
            string = "Google";
        } else if (Intrinsics.areEqual(providerId, "facebook.com")) {
            string = "Facebook";
        } else {
            string = getString(2132018947);
            Intrinsics.checkNotNull(string);
        }
        new fuX.j(this).KN(string).t(2132020372).O(2132017396, new Function1() { // from class: com.alightcreative.app.motion.activities.lI1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.h((com.alightcreative.widget.fuX) obj);
            }
        }).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.rQ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.l(firebaseUserXMQ, providerId, this, (com.alightcreative.widget.fuX) obj);
            }
        }).n().nHg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0j() {
        Toast.makeText(this, 2132020418, 0).show();
        Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[0], 0);
        Intent intent = new Intent(this, (Class<?>) AgreeDeleteAccountActivity.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vl() {
        Toast.makeText(this, 2132020418, 0).show();
        PJ9.DAz.z(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wKY(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waP(final ManageAccountActivity manageAccountActivity, View view) {
        if (manageAccountActivity.o9()) {
            new fuX.j(manageAccountActivity).Uo(2132020377).t(2132020376).xMQ(true).J2(2132020375, new Function1() { // from class: com.alightcreative.app.motion.activities.yC
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManageAccountActivity.LPV(this.f45743n, (com.alightcreative.widget.fuX) obj);
                }
            }).O(2132017396, new Function1() { // from class: com.alightcreative.app.motion.activities.IW
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ManageAccountActivity.rxp((com.alightcreative.widget.fuX) obj);
                }
            }).n().nHg();
        } else {
            manageAccountActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) throws Throwable {
        boolean zOnActivityResult;
        super.onActivityResult(requestCode, resultCode, data);
        if (!PJ9.DAz.g(requestCode, resultCode, data, Aum())) {
            com.facebook.Dsr dsr = this.callbackManager;
            if (dsr != null) {
                zOnActivityResult = dsr.onActivityResult(requestCode, resultCode, data);
            } else {
                zOnActivityResult = false;
            }
            if (!zOnActivityResult) {
                String str = "";
                if (requestCode != 13001) {
                    if (requestCode == 13002) {
                        Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(data);
                        Intrinsics.checkNotNullExpressionValue(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
                        try {
                            GoogleSignInAccount result = signedInAccountFromIntent.getResult(ApiException.class);
                            Intrinsics.checkNotNull(result);
                            AuthCredential authCredentialN = com.google.firebase.auth.aC.n(result.getIdToken(), null);
                            Intrinsics.checkNotNullExpressionValue(authCredentialN, "getCredential(...)");
                            PJ9.DAz.GR(this, authCredentialN, new w6(this));
                            return;
                        } catch (ApiException e2) {
                            fuX.j jVar = new fuX.j(this);
                            String localizedMessage = e2.getLocalizedMessage();
                            if (localizedMessage != null) {
                                str = localizedMessage;
                            }
                            jVar.nr(str).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.bQd
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ManageAccountActivity.g6((com.alightcreative.widget.fuX) obj);
                                }
                            }).n().nHg();
                            return;
                        }
                    }
                    return;
                }
                Task<GoogleSignInAccount> signedInAccountFromIntent2 = GoogleSignIn.getSignedInAccountFromIntent(data);
                Intrinsics.checkNotNullExpressionValue(signedInAccountFromIntent2, "getSignedInAccountFromIntent(...)");
                try {
                    GoogleSignInAccount result2 = signedInAccountFromIntent2.getResult(ApiException.class);
                    Intrinsics.checkNotNull(result2);
                    AuthCredential authCredentialN2 = com.google.firebase.auth.aC.n(result2.getIdToken(), null);
                    Intrinsics.checkNotNullExpressionValue(authCredentialN2, "getCredential(...)");
                    PJ9.DAz.GR(this, authCredentialN2, new n(this));
                } catch (ApiException e3) {
                    fuX.j jVar2 = new fuX.j(this);
                    String localizedMessage2 = e3.getLocalizedMessage();
                    if (localizedMessage2 != null) {
                        str = localizedMessage2;
                    }
                    jVar2.nr(str).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.GFb
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ManageAccountActivity.Lp6((com.alightcreative.widget.fuX) obj);
                        }
                    }).n().nHg();
                }
            }
        }
    }

    @Override // com.alightcreative.app.motion.activities.Zgp, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String displayName;
        Uri photoUrl;
        Uri photoUrl2;
        String strI;
        super.onCreate(savedInstanceState);
        SJ0.Q qT = SJ0.Q.t(getLayoutInflater());
        this.binding = qT;
        SJ0.Q q2 = null;
        if (qT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qT = null;
        }
        setContentView(qT.getRoot());
        SJ0.Q q3 = this.binding;
        if (q3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q3 = null;
        }
        ViewCompat.Org(q3.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.alightcreative.app.motion.activities.XOF
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return ManageAccountActivity.Mh(view, windowInsetsCompat);
            }
        });
        FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ != null) {
            displayName = firebaseUserXMQ.getDisplayName();
        } else {
            displayName = null;
        }
        this.originalUserName = displayName;
        FirebaseUser firebaseUserXMQ2 = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ2 != null) {
            photoUrl = firebaseUserXMQ2.getPhotoUrl();
        } else {
            photoUrl = null;
        }
        this.originalProfilePhoto = photoUrl;
        FirebaseUser firebaseUserXMQ3 = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ3 != null) {
            photoUrl2 = firebaseUserXMQ3.getPhotoUrl();
        } else {
            photoUrl2 = null;
        }
        this.newProfilePhotoUri = photoUrl2;
        SJ0.Q q4 = this.binding;
        if (q4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q4 = null;
        }
        SettingEditText settingEditText = q4.WPU;
        FirebaseUser firebaseUserXMQ4 = FirebaseAuth.getInstance().xMQ();
        if (firebaseUserXMQ4 == null || (strI = PJ9.DAz.I(firebaseUserXMQ4)) == null) {
            strI = "";
        }
        settingEditText.setHint(strI);
        I4p();
        SJ0.Q q5 = this.binding;
        if (q5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q5 = null;
        }
        q5.ck.setLayoutManager(new LinearLayoutManager(this, 1, false));
        SJ0.Q q6 = this.binding;
        if (q6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q6 = null;
        }
        q6.f9279t.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.RyC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageAccountActivity.waP(this.f44741n, view);
            }
        });
        SJ0.Q q7 = this.binding;
        if (q7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q7 = null;
        }
        q7.az.setEnabled(false);
        SJ0.Q q8 = this.binding;
        if (q8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q8 = null;
        }
        q8.az.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Sp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws FileNotFoundException {
                ManageAccountActivity.Fp(this.f44768n, view);
            }
        });
        SJ0.Q q9 = this.binding;
        if (q9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q9 = null;
        }
        q9.WPU.addTextChangedListener(new Ml());
        SJ0.Q q10 = this.binding;
        if (q10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q10 = null;
        }
        q10.WPU.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.alightcreative.app.motion.activities.L3d
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return ManageAccountActivity.Ro(this.f44607n, textView, i2, keyEvent);
            }
        });
        SJ0.Q q11 = this.binding;
        if (q11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q11 = null;
        }
        SettingEditText userNameEditText = q11.WPU;
        Intrinsics.checkNotNullExpressionValue(userNameEditText, "userNameEditText");
        Y.fg.rl(userNameEditText, new Function1() { // from class: com.alightcreative.app.motion.activities.cE
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.SR(this.f44926n, (EditText) obj);
            }
        }, new Function1() { // from class: com.alightcreative.app.motion.activities.zM
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManageAccountActivity.EN(this.f45757n, (MotionEvent) obj);
            }
        });
        SJ0.Q q12 = this.binding;
        if (q12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q12 = null;
        }
        q12.WPU.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alightcreative.app.motion.activities.SA
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                ManageAccountActivity.pS(this.f44744n, view, z2);
            }
        });
        SJ0.Q q13 = this.binding;
        if (q13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q13 = null;
        }
        q13.Uo.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.yE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageAccountActivity.jO(this.f45744n, view);
            }
        });
        final ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.alightcreative.app.motion.activities.cI
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                ManageAccountActivity.xzo(this.f44928n, (ActivityResult) obj);
            }
        });
        SJ0.Q q14 = this.binding;
        if (q14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q14 = null;
        }
        q14.KN.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.kW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageAccountActivity.XNZ(this.f45312n, activityResultLauncherRegisterForActivityResult, view);
            }
        });
        SJ0.Q q15 = this.binding;
        if (q15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q15 = null;
        }
        q15.HI.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageAccountActivity.I9f(this.f45593n, view);
            }
        });
        SJ0.Q q16 = this.binding;
        if (q16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q16 = null;
        }
        q16.f9273O.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageAccountActivity.D76(this.f45569n, view);
            }
        });
        SJ0.Q q17 = this.binding;
        if (q17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q17 = null;
        }
        q17.qie.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.YO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageAccountActivity.j(this.f44836n, view);
            }
        });
        SJ0.Q q18 = this.binding;
        if (q18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q2 = q18;
        }
        q2.xMQ.setOnTouchListener(new View.OnTouchListener() { // from class: com.alightcreative.app.motion.activities.XFo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ManageAccountActivity.H(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        FirebaseAuth.getInstance().t(new G6(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        FirebaseAuth.getInstance().ck(new G6(this));
        super.onStop();
    }
}
