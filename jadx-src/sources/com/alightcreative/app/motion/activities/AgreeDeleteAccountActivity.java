package com.alightcreative.app.motion.activities;

import QmE.j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.widget.fuX;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.safedk.android.utils.Logger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0016\u0010$\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006'"}, d2 = {"Lcom/alightcreative/app/motion/activities/AgreeDeleteAccountActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "How", "K", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "LSJ0/afx;", "r", "LSJ0/afx;", "binding", "LkgE/fuX;", "o", "LkgE/fuX;", "mYa", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQmE/iF;", "Z", "LQmE/iF;", "qm", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "", "S", "isLoading", "g", "deleteInProgressing", "E2", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAgreeDeleteAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgreeDeleteAccountActivity.kt\ncom/alightcreative/app/motion/activities/AgreeDeleteAccountActivity\n+ 2 ViewUtils.kt\ncom/alightcreative/ext/ViewUtilsKt\n*L\n1#1,194:1\n24#2:195\n24#2:196\n24#2:197\n*S KotlinDebug\n*F\n+ 1 AgreeDeleteAccountActivity.kt\ncom/alightcreative/app/motion/activities/AgreeDeleteAccountActivity\n*L\n177#1:195\n178#1:196\n141#1:197\n*E\n"})
public final class AgreeDeleteAccountActivity extends HJh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44331e = 8;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean deleteInProgressing;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SJ0.afx binding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GD(final AgreeDeleteAccountActivity agreeDeleteAccountActivity, View view) {
        if (agreeDeleteAccountActivity.isLoading) {
            return;
        }
        SJ0.afx afxVar = agreeDeleteAccountActivity.binding;
        SJ0.afx afxVar2 = null;
        if (afxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar = null;
        }
        AppCompatImageView appCompatImageView = afxVar.HI;
        SJ0.afx afxVar3 = agreeDeleteAccountActivity.binding;
        if (afxVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar3 = null;
        }
        for (Object obj : CollectionsKt.listOf((Object[]) new ImageView[]{appCompatImageView, afxVar3.gh})) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            ((ImageView) obj).setActivated(true);
        }
        SJ0.afx afxVar4 = agreeDeleteAccountActivity.binding;
        if (afxVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar4 = null;
        }
        afxVar4.xMQ.setBackgroundColor(agreeDeleteAccountActivity.getColor(2131099673));
        SJ0.afx afxVar5 = agreeDeleteAccountActivity.binding;
        if (afxVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            afxVar2 = afxVar5;
        }
        afxVar2.xMQ.setVisibility(0);
        agreeDeleteAccountActivity.deleteInProgressing = true;
        com.google.firebase.functions.n.mUb.t().ck("deleteAccount").n().addOnCompleteListener(new OnCompleteListener() { // from class: com.alightcreative.app.motion.activities.m
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AgreeDeleteAccountActivity.Po6(this.f45326n, task);
            }
        });
    }

    private final void How() {
        this.isLoading = true;
        SJ0.afx afxVar = this.binding;
        SJ0.afx afxVar2 = null;
        if (afxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar = null;
        }
        afxVar.xMQ.setVisibility(0);
        SJ0.afx afxVar3 = this.binding;
        if (afxVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar3 = null;
        }
        afxVar3.qie.setVisibility(8);
        SJ0.afx afxVar4 = this.binding;
        if (afxVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar4 = null;
        }
        afxVar4.ty.setVisibility(8);
        SJ0.afx afxVar5 = this.binding;
        if (afxVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar5 = null;
        }
        afxVar5.f9412t.setVisibility(8);
        SJ0.afx afxVar6 = this.binding;
        if (afxVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            afxVar2 = afxVar6;
        }
        afxVar2.f9410O.setVisibility(8);
        com.google.firebase.functions.n.mUb.t().ck("getUploadedPackagesCount").n().addOnCompleteListener(new OnCompleteListener() { // from class: com.alightcreative.app.motion.activities.Md
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AgreeDeleteAccountActivity.ER(this.f44659n, task);
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: com.alightcreative.app.motion.activities.Zs
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                AgreeDeleteAccountActivity.lLA(this.f44857n);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.alightcreative.app.motion.activities.P
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                AgreeDeleteAccountActivity.tUK(this.f44715n, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lLA(AgreeDeleteAccountActivity agreeDeleteAccountActivity) {
        agreeDeleteAccountActivity.isLoading = false;
        kSg(agreeDeleteAccountActivity);
        SJ0.afx afxVar = agreeDeleteAccountActivity.binding;
        if (afxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar = null;
        }
        afxVar.xMQ.setVisibility(8);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ER(AgreeDeleteAccountActivity agreeDeleteAccountActivity, Task it) {
        Object obj;
        Intrinsics.checkNotNullParameter(it, "it");
        agreeDeleteAccountActivity.isLoading = false;
        mCM.l3D l3d = (mCM.l3D) it.getResult();
        SJ0.afx afxVar = null;
        Map mapNr = (l3d == null || (obj = l3d.f70669n) == null) ? null : Ge.j.nr(obj);
        if (mapNr != null) {
            szu szuVar = new szu(new JSONObject(mapNr));
            if (Intrinsics.areEqual(szuVar.rl(), "success")) {
                SJ0.afx afxVar2 = agreeDeleteAccountActivity.binding;
                if (afxVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    afxVar2 = null;
                }
                afxVar2.qie.setVisibility(szuVar.n() > 0 ? 0 : 8);
                String quantityString = agreeDeleteAccountActivity.getResources().getQuantityString(2131886086, szuVar.n(), Integer.valueOf(szuVar.n()));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(quantityString, "[", "<", false, 4, (Object) null), "]", ">", false, 4, (Object) null);
                SJ0.afx afxVar3 = agreeDeleteAccountActivity.binding;
                if (afxVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    afxVar3 = null;
                }
                afxVar3.az.setText(Html.fromHtml(strReplace$default, 0));
            }
        }
        kSg(agreeDeleteAccountActivity);
        SJ0.afx afxVar4 = agreeDeleteAccountActivity.binding;
        if (afxVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            afxVar = afxVar4;
        }
        afxVar.xMQ.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EWS(AgreeDeleteAccountActivity agreeDeleteAccountActivity, com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(agreeDeleteAccountActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://alightcreative.com/privacy/")));
        return Unit.INSTANCE;
    }

    private final void K() {
        SJ0.afx afxVar = this.binding;
        SJ0.afx afxVar2 = null;
        if (afxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar = null;
        }
        AppCompatButton appCompatButton = afxVar.nr;
        SJ0.afx afxVar3 = this.binding;
        if (afxVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar3 = null;
        }
        LinearLayoutCompat willBeDeleteProjectHolder = afxVar3.qie;
        Intrinsics.checkNotNullExpressionValue(willBeDeleteProjectHolder, "willBeDeleteProjectHolder");
        boolean z2 = false;
        boolean z3 = willBeDeleteProjectHolder.getVisibility() == 0;
        SJ0.afx afxVar4 = this.binding;
        if (afxVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar4 = null;
        }
        if (!(z3 ^ afxVar4.gh.isActivated())) {
            SJ0.afx afxVar5 = this.binding;
            if (afxVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                afxVar5 = null;
            }
            LinearLayoutCompat willNotCancelHolder = afxVar5.ty;
            Intrinsics.checkNotNullExpressionValue(willNotCancelHolder, "willNotCancelHolder");
            boolean z4 = willNotCancelHolder.getVisibility() == 0;
            SJ0.afx afxVar6 = this.binding;
            if (afxVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                afxVar2 = afxVar6;
            }
            if (!(afxVar2.HI.isActivated() ^ z4)) {
                z2 = true;
            }
        }
        appCompatButton.setEnabled(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Po6(final AgreeDeleteAccountActivity agreeDeleteAccountActivity, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SJ0.afx afxVar = agreeDeleteAccountActivity.binding;
        if (afxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar = null;
        }
        afxVar.xMQ.setVisibility(8);
        agreeDeleteAccountActivity.deleteInProgressing = false;
        Map mapNr = Ge.j.nr(((mCM.l3D) it.getResult()).f70669n);
        Object obj = mapNr.get("status");
        if (Intrinsics.areEqual(obj != null ? obj.toString() : null, "success")) {
            agreeDeleteAccountActivity.qm().n(j.C1443n.f8533n);
            PJ9.DAz.T(agreeDeleteAccountActivity.qm());
            new fuX.j(agreeDeleteAccountActivity).Uo(2132017668).t(2132017669).O(2132019937, new Function1() { // from class: com.alightcreative.app.motion.activities.iF
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AgreeDeleteAccountActivity.EWS(this.f45274n, (com.alightcreative.widget.fuX) obj2);
                }
            }).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.yg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AgreeDeleteAccountActivity.hRu(this.f45749n, (com.alightcreative.widget.fuX) obj2);
                }
            }).n().nHg();
            return;
        }
        Object obj2 = mapNr.get("errorMessage");
        String string = obj2 != null ? obj2.toString() : null;
        agreeDeleteAccountActivity.qm().n(new j.w6(new Exception(string)));
        fuX.j jVarUo = new fuX.j(agreeDeleteAccountActivity).Uo(2132017655);
        if (string == null) {
            string = agreeDeleteAccountActivity.getString(2132017654);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        jVarUo.nr(string).J2(2132017378, new Function1() { // from class: com.alightcreative.app.motion.activities.Lu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return AgreeDeleteAccountActivity.UhV(this.f44626n, (com.alightcreative.widget.fuX) obj3);
            }
        }).n().nHg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UhV(AgreeDeleteAccountActivity agreeDeleteAccountActivity, com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        agreeDeleteAccountActivity.setResult(0);
        agreeDeleteAccountActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hRu(AgreeDeleteAccountActivity agreeDeleteAccountActivity, com.alightcreative.widget.fuX dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.o();
        agreeDeleteAccountActivity.setResult(-1);
        agreeDeleteAccountActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AgreeDeleteAccountActivity agreeDeleteAccountActivity, View view) {
        if (agreeDeleteAccountActivity.isLoading) {
            return;
        }
        agreeDeleteAccountActivity.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void kSg(AgreeDeleteAccountActivity agreeDeleteAccountActivity) {
        SJ0.afx afxVar = agreeDeleteAccountActivity.binding;
        SJ0.afx afxVar2 = null;
        if (afxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar = null;
        }
        afxVar.f9410O.setVisibility(0);
        SJ0.afx afxVar3 = agreeDeleteAccountActivity.binding;
        if (afxVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar3 = null;
        }
        afxVar3.ty.setVisibility(agreeDeleteAccountActivity.mYa().Uo().contains(kgE.K.f70079o) ? 0 : 8);
        SJ0.afx afxVar4 = agreeDeleteAccountActivity.binding;
        if (afxVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar4 = null;
        }
        LinearLayoutCompat willNotCancelHolder = afxVar4.ty;
        Intrinsics.checkNotNullExpressionValue(willNotCancelHolder, "willNotCancelHolder");
        if (willNotCancelHolder.getVisibility() != 0) {
            SJ0.afx afxVar5 = agreeDeleteAccountActivity.binding;
            if (afxVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                afxVar5 = null;
            }
            LinearLayoutCompat willBeDeleteProjectHolder = afxVar5.qie;
            Intrinsics.checkNotNullExpressionValue(willBeDeleteProjectHolder, "willBeDeleteProjectHolder");
            if (willBeDeleteProjectHolder.getVisibility() == 0) {
                SJ0.afx afxVar6 = agreeDeleteAccountActivity.binding;
                if (afxVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    afxVar2 = afxVar6;
                }
                afxVar2.f9412t.setVisibility(0);
            }
        }
        agreeDeleteAccountActivity.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tUK(AgreeDeleteAccountActivity agreeDeleteAccountActivity, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        agreeDeleteAccountActivity.isLoading = false;
        kSg(agreeDeleteAccountActivity);
        SJ0.afx afxVar = agreeDeleteAccountActivity.binding;
        if (afxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar = null;
        }
        afxVar.xMQ.setVisibility(8);
    }

    public final kgE.fuX mYa() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.isLoading || this.deleteInProgressing) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.alightcreative.app.motion.activities.HJh, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SJ0.afx afxVarT = SJ0.afx.t(getLayoutInflater());
        this.binding = afxVarT;
        SJ0.afx afxVar = null;
        if (afxVarT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVarT = null;
        }
        setContentView(afxVarT.getRoot());
        How();
        SJ0.afx afxVar2 = this.binding;
        if (afxVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar2 = null;
        }
        afxVar2.f9410O.setMovementMethod(LinkMovementMethod.getInstance());
        String string = getString(2132017657);
        String string2 = getString(2132017653);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str = string + StringsKt.replace$default(StringsKt.replace$default(string2, "[", "<", false, 4, (Object) null), "]", ">", false, 4, (Object) null);
        SJ0.afx afxVar3 = this.binding;
        if (afxVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar3 = null;
        }
        afxVar3.f9410O.setText(Html.fromHtml(str, 0));
        SJ0.afx afxVar4 = this.binding;
        if (afxVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar4 = null;
        }
        afxVar4.gh.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.vd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AgreeDeleteAccountActivity.Org(this.f45701n, view);
            }
        });
        SJ0.afx afxVar5 = this.binding;
        if (afxVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar5 = null;
        }
        afxVar5.HI.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AgreeDeleteAccountActivity.HV(this.f45259n, view);
            }
        });
        SJ0.afx afxVar6 = this.binding;
        if (afxVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar6 = null;
        }
        afxVar6.nr.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AgreeDeleteAccountActivity.GD(this.f44595n, view);
            }
        });
        SJ0.afx afxVar7 = this.binding;
        if (afxVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            afxVar7 = null;
        }
        afxVar7.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.psW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AgreeDeleteAccountActivity.i(this.f45594n, view);
            }
        });
        SJ0.afx afxVar8 = this.binding;
        if (afxVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            afxVar = afxVar8;
        }
        afxVar.nr.setEnabled(false);
    }

    public final QmE.iF qm() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HV(AgreeDeleteAccountActivity agreeDeleteAccountActivity, View view) {
        view.setActivated(!view.isActivated());
        agreeDeleteAccountActivity.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Org(AgreeDeleteAccountActivity agreeDeleteAccountActivity, View view) {
        view.setActivated(!view.isActivated());
        agreeDeleteAccountActivity.K();
    }
}
