package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.facebook.FacebookException;
import com.facebook.internal.Md;
import com.facebook.internal.qz;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0003R$\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/facebook/internal/Dsr;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", IV8ValueMap.FUNCTION_VALUES, "Lcom/facebook/FacebookException;", MRAIDPresenter.ERROR, "", "fD", "(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "E2", "(Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "g", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onDestroyView", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "e", "(Landroid/app/Dialog;)V", "innerDialog", "t", "j", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Dsr extends DialogFragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Dialog innerDialog;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iF(Dsr this$0, Bundle bundle, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E2(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void te(Dsr this$0, Bundle bundle, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fD(bundle, facebookException);
    }

    public final void e(Dialog dialog) {
        this.innerDialog = dialog;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g() {
        FragmentActivity activity;
        Md mdN;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Bundle bundleXQ = nKK.XQ(intent);
            if (bundleXQ != null ? bundleXQ.getBoolean("is_fallback", false) : false) {
                String string = bundleXQ != null ? bundleXQ.getString("url") : null;
                if (vd.I(string)) {
                    vd.piY("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{com.facebook.s4.az()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                qz.j jVar = qz.jB;
                Intrinsics.checkNotNull(string, "null cannot be cast to non-null type kotlin.String");
                mdN = jVar.n(activity, string, str);
                mdN.te(new Md.Ml() { // from class: com.facebook.internal.fuX
                    @Override // com.facebook.internal.Md.Ml
                    public final void n(Bundle bundle, FacebookException facebookException) {
                        Dsr.iF(this.f52792n, bundle, facebookException);
                    }
                });
            } else {
                String string2 = bundleXQ != null ? bundleXQ.getString(FileUploadManager.f61572j) : null;
                Bundle bundle = bundleXQ != null ? bundleXQ.getBundle("params") : null;
                if (vd.I(string2)) {
                    vd.piY("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type kotlin.String");
                    mdN = new Md.j(activity, string2, bundle).KN(new Md.Ml() { // from class: com.facebook.internal.CN3
                        @Override // com.facebook.internal.Md.Ml
                        public final void n(Bundle bundle2, FacebookException facebookException) {
                            Dsr.te(this.f52661n, bundle2, facebookException);
                        }
                    }).n();
                }
            }
            this.innerDialog = mdN;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.innerDialog instanceof Md) && isResumed()) {
            Dialog dialog = this.innerDialog;
            Intrinsics.checkNotNull(dialog, wDgKoYAES.SZTajRBWpvNS);
            ((Md) dialog).aYN();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = this.innerDialog;
        if (dialog != null) {
            Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type android.app.Dialog");
            return dialog;
        }
        fD(null, null);
        setShowsDialog(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return dialogOnCreateDialog;
    }

    private final void E2(Bundle values) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (values == null) {
            values = new Bundle();
        }
        intent.putExtras(values);
        activity.setResult(-1, intent);
        activity.finish();
    }

    private final void fD(Bundle values, FacebookException error) {
        int i2;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        Intent intentAz = nKK.az(intent, values, error);
        if (error == null) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        activity.setResult(i2, intentAz);
        activity.finish();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof Md) {
            Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((Md) dialog).aYN();
        }
    }
}
