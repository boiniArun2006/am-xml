package com.alightcreative.app.motion.activities.effectbrowser;

import HI0.Ew;
import KC.rrk;
import Q.fuX;
import QmE.iF;
import QmE.j;
import SJ0.Mf;
import XoT.C;
import Y.LEl;
import Y.Ml;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alightcreative.app.motion.activities.effectbrowser.EffectBrowserActivity;
import com.alightcreative.app.motion.scene.visualeffect.EffectPreset;
import com.alightcreative.app.motion.scene.visualeffect.EffectType;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kgE.K;
import kgE.Md;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import xAo.I28;
import yc.DT;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u00112\b\u0010!\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010*¨\u0006\\"}, d2 = {"Lcom/alightcreative/app/motion/activities/effectbrowser/EffectBrowserActivity;", "Landroidx/fragment/app/FragmentActivity;", "LY/Ml;", "LKC/rrk;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "effect", "Lkotlin/Function0;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "QZ6", "(Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;Lkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "title", "VwL", "(Ljava/lang/String;)V", "Landroidx/fragment/app/Fragment;", "frag", "tag", "F", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V", "RQ", "(Landroidx/fragment/app/Fragment;)V", "a63", "LY/LEl;", "HV", "()LY/LEl;", "effectId", "presetCode", "source", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "scrollY", "XQ", "(I)V", "Po6", "()Ljava/lang/String;", "LSJ0/Mf;", "r", "LSJ0/Mf;", "binding", "", "o", "Z", "showedTrialPopup", "LkgE/fuX;", "LkgE/fuX;", "UhV", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQ/fuX;", "S", "LQ/fuX;", "hRu", "()LQ/fuX;", "setFeatureUnlockManager", "(LQ/fuX;)V", "featureUnlockManager", "LQmE/iF;", "g", "LQmE/iF;", "EWS", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LxAo/I28;", "E2", "LxAo/I28;", "GD", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "e", "LnYs/Ml;", "getGetAlightSettingsUseCase", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "Uo", "projectId", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEffectBrowserActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EffectBrowserActivity.kt\ncom/alightcreative/app/motion/activities/effectbrowser/EffectBrowserActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,297:1\n11476#2,9:298\n13402#2:307\n13403#2:309\n11485#2:310\n1#3:308\n1#3:311\n161#4,8:312\n*S KotlinDebug\n*F\n+ 1 EffectBrowserActivity.kt\ncom/alightcreative/app/motion/activities/effectbrowser/EffectBrowserActivity\n*L\n84#1:298,9\n84#1:307\n84#1:309\n84#1:310\n84#1:308\n71#1:312,8\n*E\n"})
public final class EffectBrowserActivity extends n implements Ml, rrk {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public I28 crisperManager;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public fuX featureUnlockManager;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean showedTrialPopup;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Mf binding;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // KC.rrk
    public void XQ(int scrollY) {
        Mf mf = null;
        if (scrollY != 0) {
            Mf mf2 = this.binding;
            if (mf2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mf = mf2;
            }
            mf.KN.setVisibility(0);
            return;
        }
        Mf mf3 = this.binding;
        if (mf3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mf = mf3;
        }
        mf.KN.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(DialogInterface dialogInterface) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setShowed36EffectBrowserPopup(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kSg(EffectBrowserActivity effectBrowserActivity, DialogInterface dialogInterface, int i2) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setShowed36EffectBrowserPopup(true);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(effectBrowserActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://alightcreative.com/am36effectbrowser")));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lLA(DialogInterface dialogInterface, int i2) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setShowed36EffectBrowserPopup(true);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mYa(String str) {
        return "Add Effect: " + str;
    }

    private static final Intent qm(String str, EffectBrowserActivity effectBrowserActivity) {
        Intent intent = new Intent();
        if (str != null) {
            intent.putExtra("addEffectId", str);
            intent.putExtra("showedTrialPopup", effectBrowserActivity.showedTrialPopup);
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setRecentlyUsedEffects(com.alightcreative.app.motion.persist.n.J2(jVar.getRecentlyUsedEffects(), str));
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tFV(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final iF EWS() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void F(Fragment frag, String tag, String title) {
        Intrinsics.checkNotNullParameter(frag, "frag");
        Intrinsics.checkNotNullParameter(tag, "tag");
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        Fragment fragmentPJg = getSupportFragmentManager().pJg(tag);
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        Mf mf = null;
        if (title != null) {
            Mf mf2 = this.binding;
            if (mf2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mf2 = null;
            }
            mf2.f9227t.setText(title);
            Mf mf3 = this.binding;
            if (mf3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mf3 = null;
            }
            mf3.rl.setVisibility(0);
            Mf mf4 = this.binding;
            if (mf4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mf4 = null;
            }
            mf4.nr.setVisibility(4);
            Mf mf5 = this.binding;
            if (mf5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mf5 = null;
            }
            mf5.xMQ.setVisibility(4);
        }
        FragmentTransaction fragmentTransactionRl = L.j.rl(fragmentTransactionO);
        Mf mf6 = this.binding;
        if (mf6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mf = mf6;
        }
        fragmentTransactionRl.t(mf.f9225O.getId(), frag, tag).KN(tag).mUb();
    }

    public final I28 GD() {
        I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    public final void RQ(Fragment frag) {
        Intrinsics.checkNotNullParameter(frag, "frag");
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        Fragment fragmentPJg = getSupportFragmentManager().pJg("EffectDetailPager");
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        Mf mf = this.binding;
        if (mf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mf = null;
        }
        fragmentTransactionO.Z(mf.J2.getId(), frag, "EffectDetailPager").KN("EffectDetailPager").mUb();
    }

    public final kgE.fuX UhV() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final void VwL(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Mf mf = this.binding;
        if (mf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mf = null;
        }
        mf.f9227t.setText(title);
    }

    public final void a63(Fragment frag) {
        Intrinsics.checkNotNullParameter(frag, "frag");
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        Fragment fragmentPJg = getSupportFragmentManager().pJg("EffectSearch");
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        FragmentTransaction fragmentTransactionRl = L.j.rl(fragmentTransactionO);
        Mf mf = this.binding;
        if (mf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mf = null;
        }
        fragmentTransactionRl.t(mf.J2.getId(), frag, "EffectSearch").KN("EffectSearch").mUb();
    }

    public final fuX hRu() {
        fuX fux = this.featureUnlockManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureUnlockManager");
        return null;
    }

    @Override // Y.Ml
    public void t(final String effectId, final String presetCode, final String source) {
        Object next;
        EffectPreset effectPreset;
        String strRl;
        String label;
        String label2;
        Object next2;
        Intrinsics.checkNotNullParameter(source, "source");
        C.Uo(this, new Function0() { // from class: Y.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EffectBrowserActivity.mYa(effectId);
            }
        });
        String strSubstringBeforeLast$default = effectId != null ? StringsKt.substringBeforeLast$default(effectId, "/", (String) null, 2, (Object) null) : null;
        Iterator<T> it = VisualEffectKt.getVisualEffects().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            VisualEffect visualEffect = (VisualEffect) next;
            if (Intrinsics.areEqual(visualEffect.getId(), strSubstringBeforeLast$default) && !visualEffect.getInternal() && !visualEffect.getDeprecated() && (!visualEffect.getExperimental() || com.alightcreative.app.motion.persist.j.INSTANCE.getExperimentalEffects())) {
                break;
            }
        }
        final VisualEffect visualEffect2 = (VisualEffect) next;
        if (visualEffect2 == null) {
            return;
        }
        if (presetCode != null) {
            Iterator<T> it2 = VisualEffectKt.getPresets(visualEffect2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (Intrinsics.areEqual(((EffectPreset) next2).getShortCode(), presetCode)) {
                        break;
                    }
                }
            }
            effectPreset = (EffectPreset) next2;
        } else {
            effectPreset = null;
        }
        if (CollectionsKt.contains(Md.n(), effectId != null ? StringsKt.substringBeforeLast$default(effectId, "/", (String) null, 2, (Object) null) : null) && !this.showedTrialPopup && !UhV().Uo().contains(K.f70072S) && !hRu().t(visualEffect2.getId())) {
            final EffectPreset effectPreset2 = effectPreset;
            QZ6(visualEffect2, new Function0() { // from class: Y.Xo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EffectBrowserActivity.Org(this.f11928n, visualEffect2, presetCode, effectPreset2, source, effectId);
                }
            });
            return;
        }
        EffectPreset effectPreset3 = effectPreset;
        String str = (this.showedTrialPopup && CollectionsKt.contains(Md.n(), strSubstringBeforeLast$default)) ? "premium-try" : CollectionsKt.contains(Md.n(), strSubstringBeforeLast$default) ? "premium-member" : "free";
        iF iFVarEWS = EWS();
        Bundle bundle = new Bundle();
        bundle.putString("effect_id", visualEffect2.getId());
        bundle.putString("effect_name", Iy.w6.n(visualEffect2.getLocalizedStrings(), this, visualEffect2.getName()));
        Iy.n localizedStrings = visualEffect2.getLocalizedStrings();
        Context contextAz = XoT.fuX.az(this);
        Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
        bundle.putString("effect_name", Iy.w6.n(localizedStrings, contextAz, visualEffect2.getName()));
        if (presetCode == null) {
            presetCode = "default";
        }
        bundle.putString("preset_id", presetCode);
        String str2 = "";
        if (effectPreset3 == null || (label2 = effectPreset3.getLabel()) == null || (strRl = Iy.w6.rl(label2, this)) == null) {
            strRl = "";
        }
        bundle.putString("preset_name", strRl);
        if (effectPreset3 != null && (label = effectPreset3.getLabel()) != null) {
            Context contextAz2 = XoT.fuX.az(this);
            Intrinsics.checkNotNullExpressionValue(contextAz2, "getEnglishContext(...)");
            String strRl2 = Iy.w6.rl(label, contextAz2);
            if (strRl2 != null) {
                str2 = strRl2;
            }
        }
        bundle.putString("preset_name_en", str2);
        bundle.putString("access", str);
        bundle.putString("source", source);
        Unit unit = Unit.INSTANCE;
        iFVarEWS.n(new j.fuX("add_effect", bundle));
        setResult(-1, qm(effectId, this));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ER(EffectBrowserActivity effectBrowserActivity, View view) {
        effectBrowserActivity.EWS().n(new j.Zs(effectBrowserActivity.Uo()));
        LEl lEl = new LEl();
        effectBrowserActivity.EWS().n(new j.fuX("effect_search", null));
        effectBrowserActivity.a63(lEl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void How(EffectBrowserActivity effectBrowserActivity, View view) {
        effectBrowserActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(EffectBrowserActivity effectBrowserActivity) {
        if (effectBrowserActivity.getSupportFragmentManager().Jk() == 0) {
            String string = effectBrowserActivity.getResources().getString(2132017791);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            effectBrowserActivity.VwL(string);
            Mf mf = effectBrowserActivity.binding;
            Mf mf2 = null;
            if (mf == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mf = null;
            }
            mf.nr.setVisibility(0);
            Mf mf3 = effectBrowserActivity.binding;
            if (mf3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mf3 = null;
            }
            mf3.rl.setVisibility(4);
            Mf mf4 = effectBrowserActivity.binding;
            if (mf4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mf4 = null;
            }
            mf4.xMQ.setVisibility(0);
            Mf mf5 = effectBrowserActivity.binding;
            if (mf5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                mf2 = mf5;
            }
            mf2.KN.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Org(EffectBrowserActivity effectBrowserActivity, VisualEffect visualEffect, String str, EffectPreset effectPreset, String str2, String str3) {
        String strRl;
        String label;
        String label2;
        iF iFVarEWS = effectBrowserActivity.EWS();
        Bundle bundle = new Bundle();
        bundle.putString("effect_id", visualEffect.getId());
        bundle.putString("effect_name", Iy.w6.n(visualEffect.getLocalizedStrings(), effectBrowserActivity, visualEffect.getName()));
        Iy.n localizedStrings = visualEffect.getLocalizedStrings();
        Context contextAz = XoT.fuX.az(effectBrowserActivity);
        Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
        bundle.putString("effect_name", Iy.w6.n(localizedStrings, contextAz, visualEffect.getName()));
        if (str == null) {
            str = "default";
        }
        bundle.putString("preset_id", str);
        String str4 = "";
        if (effectPreset == null || (label2 = effectPreset.getLabel()) == null || (strRl = Iy.w6.rl(label2, effectBrowserActivity)) == null) {
            strRl = "";
        }
        bundle.putString("preset_name", strRl);
        if (effectPreset != null && (label = effectPreset.getLabel()) != null) {
            Context contextAz2 = XoT.fuX.az(effectBrowserActivity);
            Intrinsics.checkNotNullExpressionValue(contextAz2, "getEnglishContext(...)");
            String strRl2 = Iy.w6.rl(label, contextAz2);
            if (strRl2 != null) {
                str4 = strRl2;
            }
        }
        bundle.putString("preset_name_en", str4);
        bundle.putString("source", str2);
        Unit unit = Unit.INSTANCE;
        iFVarEWS.n(new j.fuX("add_effect", bundle));
        effectBrowserActivity.setResult(-1, qm(str3, effectBrowserActivity));
        effectBrowserActivity.finish();
        return Unit.INSTANCE;
    }

    private final void QZ6(VisualEffect effect, final Function0 listener) {
        hRu().mUb(this, effect.getId(), new Function0() { // from class: Y.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EffectBrowserActivity.tFV(listener);
            }
        });
    }

    private final String Uo() {
        String stringExtra = getIntent().getStringExtra("projectId");
        if (stringExtra == null) {
            return "";
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat i(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNull(view);
        view.setPadding(view.getPaddingLeft(), insetsJ2.rl, view.getPaddingRight(), insetsJ2.nr);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tUK(EffectBrowserActivity effectBrowserActivity, View view) {
        effectBrowserActivity.getSupportFragmentManager().Zmq();
    }

    public final LEl HV() {
        Fragment fragmentPJg = getSupportFragmentManager().pJg("EffectSearch");
        if (fragmentPJg instanceof LEl) {
            return (LEl) fragmentPJg;
        }
        return null;
    }

    public final String Po6() {
        return Uo();
    }

    @Override // com.alightcreative.app.motion.activities.effectbrowser.n, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        List listListOf;
        List listSubList;
        super.onCreate(savedInstanceState);
        Mf mfT = Mf.t(getLayoutInflater());
        this.binding = mfT;
        Mf mf = null;
        if (mfT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mfT = null;
        }
        setContentView(mfT.getRoot());
        Mf mf2 = this.binding;
        if (mf2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mf2 = null;
        }
        ViewCompat.Org(mf2.getRoot(), new OnApplyWindowInsetsListener() { // from class: Y.I28
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return EffectBrowserActivity.i(view, windowInsetsCompat);
            }
        });
        hRu().rl(this, Uo());
        while (getSupportFragmentManager().Jk() > 0) {
            getSupportFragmentManager().uG();
        }
        this.showedTrialPopup = getIntent().getBooleanExtra("showedTrialPopup", false);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("effectTypes");
        if (stringArrayExtra != null) {
            listListOf = new ArrayList();
            for (String str : stringArrayExtra) {
                EffectType[] effectTypeArrValues = EffectType.values();
                Intrinsics.checkNotNull(str);
                EffectType effectType = (EffectType) Ew.n(effectTypeArrValues, str);
                if (effectType != null) {
                    listListOf.add(effectType);
                }
            }
        } else {
            listListOf = CollectionsKt.listOf(EffectType.SHADER);
        }
        String[] stringArrayExtra2 = getIntent().getStringArrayExtra("recommendList");
        if (stringArrayExtra2 == null || (listSubList = ArraysKt.toList(stringArrayExtra2)) == null) {
            listSubList = DT.e().subList(0, 6);
        }
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        Mf mf3 = this.binding;
        if (mf3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mf3 = null;
        }
        fragmentTransactionO.t(mf3.f9225O.getId(), j.INSTANCE.n(listListOf, listSubList), "EffectBrowser").mUb();
        getSupportFragmentManager().ty(new FragmentManager.OnBackStackChangedListener() { // from class: Y.CN3
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void O() {
                EffectBrowserActivity.K(this.f11842n);
            }
        });
        Mf mf4 = this.binding;
        if (mf4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mf4 = null;
        }
        mf4.nr.setOnClickListener(new View.OnClickListener() { // from class: Y.fuX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EffectBrowserActivity.How(this.f11945n, view);
            }
        });
        Mf mf5 = this.binding;
        if (mf5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mf5 = null;
        }
        mf5.rl.setOnClickListener(new View.OnClickListener() { // from class: Y.Dsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EffectBrowserActivity.tUK(this.f11844n, view);
            }
        });
        Mf mf6 = this.binding;
        if (mf6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mf = mf6;
        }
        mf.xMQ.setOnClickListener(new View.OnClickListener() { // from class: Y.aC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EffectBrowserActivity.ER(this.f11937n, view);
            }
        });
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getInstalledAppVersions().contains("3.5") && !jVar.getShowed36EffectBrowserPopup()) {
            new AlertDialog.Builder(this).setTitle(2132017246).setMessage(2132017245).setNegativeButton(2132017436, new DialogInterface.OnClickListener() { // from class: Y.C
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    EffectBrowserActivity.lLA(dialogInterface, i2);
                }
            }).setPositiveButton(2132019460, new DialogInterface.OnClickListener() { // from class: Y.o
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    EffectBrowserActivity.kSg(this.f11971n, dialogInterface, i2);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Y.qz
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    EffectBrowserActivity.W(dialogInterface);
                }
            }).create().show();
        }
        GD().Ik(this);
    }
}
