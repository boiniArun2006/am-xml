package com.alightcreative.app.motion.tutorial;

import Gu.SPz;
import HI0.afx;
import HI0.o7q;
import KC.FP;
import KC.g;
import KC.nKK;
import KC.ys8;
import LM.aC;
import PJ9.I28;
import QmE.iF;
import QmE.j;
import SJ0.g9s;
import Sa.AbstractC1468n;
import android.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.app.motion.tutorial.TutorialActivity;
import com.alightcreative.app.motion.tutorial.entities.SampleProjectInfo;
import com.alightcreative.app.motion.tutorial.entities.TipInfo;
import com.alightcreative.app.motion.tutorial.entities.TutorialInfo;
import com.alightcreative.widget.RecyclerViewEx;
import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.UUID;
import kP.InterfaceC2210n;
import kgE.fuX;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yc.xq;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER'\u0010N\u001a\u0012\u0012\u0004\u0012\u00020H0Gj\b\u0012\u0004\u0012\u00020H`I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR'\u0010R\u001a\u0012\u0012\u0004\u0012\u00020O0Gj\b\u0012\u0004\u0012\u00020O`I8\u0006¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010MR'\u0010V\u001a\u0012\u0012\u0004\u0012\u00020S0Gj\b\u0012\u0004\u0012\u00020S`I8\u0006¢\u0006\f\n\u0004\bT\u0010K\u001a\u0004\bU\u0010MR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010 R\u0016\u0010[\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010 R\u0016\u0010]\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010 R\u0014\u0010a\u001a\u00020^8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lcom/alightcreative/app/motion/tutorial/TutorialActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LPJ9/I28;", "<init>", "()V", "", InneractiveMediationDefs.GENDER_FEMALE, "RQ", "", "link", "Uf", "(Ljava/lang/String;)V", "url", "hRu", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "LSJ0/g9s;", "r", "LSJ0/g9s;", "binding", "LQmE/iF;", "o", "LQmE/iF;", "tUK", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "Z", "LkgE/fuX;", "lLA", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LxAo/I28;", "S", "LxAo/I28;", "How", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "g", "LnYs/Ml;", "ER", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LkP/n;", "E2", "LkP/n;", "kSg", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "LPJ9/Ml;", "e", "LPJ9/Ml;", "ViF", "()LPJ9/Ml;", "X4T", "(LPJ9/Ml;)V", "signInLauncher", "Ljava/util/ArrayList;", "Lcom/alightcreative/app/motion/tutorial/entities/TutorialInfo;", "Lkotlin/collections/ArrayList;", "X", "Ljava/util/ArrayList;", "getTutorialInfoList", "()Ljava/util/ArrayList;", "tutorialInfoList", "Lcom/alightcreative/app/motion/tutorial/entities/TipInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getTipInfoList", "tipInfoList", "Lcom/alightcreative/app/motion/tutorial/entities/SampleProjectInfo;", "N", "getSampleProjectInfoList", "sampleProjectInfoList", "", "v", "isRefreshing", "Xw", "firstRefresh", "jB", "validDataRecived", "Lcom/android/volley/RequestQueue;", "W", "()Lcom/android/volley/RequestQueue;", "requestQueue", "U", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TutorialActivity extends j implements I28 {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public fuX iapManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public PJ9.Ml signInLauncher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean validDataRecived;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private g9s binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isRefreshing;
    public static final int P5 = 8;
    private static final String M7 = "https://alight-creative-staging.firebaseapp.com/appdata/am/tutorial-data/android.json";
    private static final String p5 = "https://alightcreative.com/appdata/am/tutorial-data/android.json";
    private static final String eF = "https://www.youtube.com/channel/UCjObfxm37TU7zwqmuNXuamg";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f46421E = "https://alightcreative.com/amhelpcenter";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String f46423M = "https://alightcreative.com/amuserguide";

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static final String f46422FX = "https://alightcreative.com/amsampleprojects";

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final ArrayList tutorialInfoList = new ArrayList();

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final ArrayList tipInfoList = new ArrayList();

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final ArrayList sampleProjectInfoList = new ArrayList();

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean firstRefresh = true;

    public static final class Ml extends StringRequest {
        Ml(String str, Response.Listener listener, Response.ErrorListener errorListener) {
            super(0, str, listener, errorListener);
        }

        @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
        protected Response<String> parseNetworkResponse(NetworkResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            byte[] data = response.data;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            Response<String> responseSuccess = Response.success(new String(data, Charsets.UTF_8), HttpHeaderParser.parseCacheHeaders(response));
            Intrinsics.checkNotNullExpressionValue(responseSuccess, "success(...)");
            return responseSuccess;
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
        n(Object obj) {
            super(1, obj, TutorialActivity.class, "downloadSampleProject", "downloadSampleProject(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TutorialActivity) this.receiver).hRu(p0);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
        w6(Object obj) {
            super(1, obj, TutorialActivity.class, "onTutorialPlayClick", "onTutorialPlayClick(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TutorialActivity) this.receiver).Uf(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ub(final TutorialActivity tutorialActivity, VolleyError volleyError) {
        tutorialActivity.isRefreshing = false;
        final boolean z2 = tutorialActivity.validDataRecived;
        tutorialActivity.runOnUiThread(new Runnable() { // from class: Gu.n
            @Override // java.lang.Runnable
            public final void run() {
                TutorialActivity.Qu(z2, tutorialActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HBN(final TutorialActivity tutorialActivity, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        tutorialActivity.tutorialInfoList.clear();
        JSONArray jSONArray = jSONObject.getJSONArray("tutorials");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            Intrinsics.checkNotNull(jSONObject2);
            tutorialActivity.tutorialInfoList.add(new TutorialInfo(jSONObject2));
        }
        tutorialActivity.tipInfoList.clear();
        JSONArray jSONArray2 = jSONObject.getJSONArray("tips");
        int length2 = jSONArray2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
            Intrinsics.checkNotNull(jSONObject3);
            tutorialActivity.tipInfoList.add(new TipInfo(jSONObject3));
        }
        tutorialActivity.sampleProjectInfoList.clear();
        JSONArray jSONArray3 = jSONObject.getJSONArray("sampleProjects");
        int length3 = jSONArray3.length();
        for (int i5 = 0; i5 < length3; i5++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i5);
            Intrinsics.checkNotNull(jSONObject4);
            tutorialActivity.sampleProjectInfoList.add(new SampleProjectInfo(jSONObject4));
        }
        tutorialActivity.isRefreshing = false;
        tutorialActivity.validDataRecived = true;
        tutorialActivity.runOnUiThread(new Runnable() { // from class: Gu.w6
            @Override // java.lang.Runnable
            public final void run() {
                TutorialActivity.UF(this.f3785n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(TutorialActivity tutorialActivity, VolleyError volleyError) {
        Toast.makeText(tutorialActivity, "Element Download Failed (" + neA.j.f71196Z.rl() + ")", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qu(boolean z2, TutorialActivity tutorialActivity) {
        if (z2) {
            return;
        }
        g9s g9sVar = tutorialActivity.binding;
        g9s g9sVar2 = null;
        if (g9sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar = null;
        }
        g9sVar.aYN.setVisibility(8);
        g9s g9sVar3 = tutorialActivity.binding;
        if (g9sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar3 = null;
        }
        g9sVar3.f9455o.setVisibility(8);
        g9s g9sVar4 = tutorialActivity.binding;
        if (g9sVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar4 = null;
        }
        g9sVar4.ck.setVisibility(8);
        g9s g9sVar5 = tutorialActivity.binding;
        if (g9sVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar5 = null;
        }
        g9sVar5.f9457t.setVisibility(8);
        if (XoT.fuX.Ik(tutorialActivity)) {
            return;
        }
        g9s g9sVar6 = tutorialActivity.binding;
        if (g9sVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g9sVar2 = g9sVar6;
        }
        g9sVar2.ty.setVisibility(0);
    }

    private final void RQ() {
        SPz sPz = new SPz(this.tutorialInfoList, new w6(this));
        g9s g9sVar = this.binding;
        g9s g9sVar2 = null;
        if (g9sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar = null;
        }
        g9sVar.ViF.setAdapter(sPz);
        g gVar = new g(this.tipInfoList);
        g9s g9sVar3 = this.binding;
        if (g9sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar3 = null;
        }
        g9sVar3.f9452Z.setAdapter(gVar);
        if (this.sampleProjectInfoList.size() >= 4) {
            g9s g9sVar4 = this.binding;
            if (g9sVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                g9sVar2 = g9sVar4;
            }
            RecyclerViewEx sampleProjectRecyclerView = g9sVar2.Ik;
            Intrinsics.checkNotNullExpressionValue(sampleProjectRecyclerView, "sampleProjectRecyclerView");
            o7q.mUb(sampleProjectRecyclerView, new Function0() { // from class: Gu.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TutorialActivity.a63(this.f3764n);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UF(TutorialActivity tutorialActivity) {
        g9s g9sVar = tutorialActivity.binding;
        g9s g9sVar2 = null;
        if (g9sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar = null;
        }
        g9sVar.aYN.setVisibility(0);
        g9s g9sVar3 = tutorialActivity.binding;
        if (g9sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar3 = null;
        }
        g9sVar3.f9455o.setVisibility(0);
        g9s g9sVar4 = tutorialActivity.binding;
        if (g9sVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar4 = null;
        }
        g9sVar4.ck.setVisibility(0);
        g9s g9sVar5 = tutorialActivity.binding;
        if (g9sVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar5 = null;
        }
        g9sVar5.f9457t.setVisibility(0);
        g9s g9sVar6 = tutorialActivity.binding;
        if (g9sVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g9sVar2 = g9sVar6;
        }
        g9sVar2.ty.setVisibility(8);
        tutorialActivity.RQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UhV(TutorialActivity tutorialActivity, String str, aC aCVar) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(aCVar, "<unused var>");
        tutorialActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a63(TutorialActivity tutorialActivity) {
        g9s g9sVar = tutorialActivity.binding;
        g9s g9sVar2 = null;
        if (g9sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar = null;
        }
        int width = ((g9sVar.ck.getWidth() - (tutorialActivity.getResources().getDimensionPixelOffset(2131166337) * 2)) - tutorialActivity.getResources().getDimensionPixelOffset(2131166338)) / 2;
        g9s g9sVar3 = tutorialActivity.binding;
        if (g9sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar3 = null;
        }
        FP fp = new FP(new ArrayList(tutorialActivity.sampleProjectInfoList.subList(0, 4)), Math.min(width, ((g9sVar3.Ik.getHeight() - (tutorialActivity.getResources().getDimensionPixelOffset(2131166339) * 2)) - tutorialActivity.getResources().getDimensionPixelOffset(2131166338)) / 2), new n(tutorialActivity));
        g9s g9sVar4 = tutorialActivity.binding;
        if (g9sVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g9sVar2 = g9sVar4;
        }
        g9sVar2.Ik.setAdapter(fp);
        return Unit.INSTANCE;
    }

    private final void f() {
        if (this.isRefreshing) {
            return;
        }
        this.isRefreshing = true;
        String str = com.alightcreative.app.motion.persist.j.INSTANCE.getStagingFeed() ? M7 : p5;
        if (!this.firstRefresh) {
            W().getCache().invalidate(str, false);
        }
        this.firstRefresh = false;
        W().add(new Ml(str, new Response.Listener() { // from class: Gu.Xo
            @Override // com.android.volley.Response.Listener
            public final void onResponse(Object obj) throws JSONException {
                TutorialActivity.HBN(this.f3771n, (String) obj);
            }
        }, new Response.ErrorListener() { // from class: Gu.eO
            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                TutorialActivity.ub(this.f3774n, volleyError);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(TutorialActivity tutorialActivity, String str) {
        Scene sceneUnserializeScene$default;
        try {
            Intrinsics.checkNotNull(str);
            sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(str, false, false, false, 14, null);
        } catch (MalformedSceneException unused) {
            sceneUnserializeScene$default = null;
        }
        if (sceneUnserializeScene$default != null) {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNull(uuidRandomUUID);
            FilesKt.writeText$default(afx.Z(tutorialActivity, uuidRandomUUID), SceneSerializerKt.serializeScene$default(Scene.copy$default(sceneUnserializeScene$default, null, 0, 0, 0, 0, 0, null, 0, null, null, SceneType.ELEMENT, null, null, 0, 0, 0, false, 0L, null, null, 1047551, null), false, null, false, false, null, 62, null), null, 2, null);
            Toast.makeText(tutorialActivity, 2132020096, 1).show();
            tutorialActivity.finish();
            return;
        }
        Toast.makeText(tutorialActivity, "Element Save Failed (" + neA.j.f71200o.rl() + ")", 1).show();
    }

    public final nYs.Ml ER() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    public final xAo.I28 How() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    @Override // PJ9.I28
    public PJ9.Ml ViF() {
        PJ9.Ml ml = this.signInLauncher;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signInLauncher");
        return null;
    }

    public void X4T(PJ9.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<set-?>");
        this.signInLauncher = ml;
    }

    public final InterfaceC2210n kSg() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    public final fuX lLA() {
        fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final iF tUK() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bu(TutorialActivity tutorialActivity, View view) {
        tutorialActivity.tUK().n(j.B.f8374n);
        HI0.Ml.J2(tutorialActivity, f46421E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(TutorialActivity tutorialActivity, View view) {
        tutorialActivity.tUK().n(j.qYU.f8555n);
        FragmentTransaction fragmentTransactionO = tutorialActivity.getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        fragmentTransactionO.rl(R.id.content, new nKK()).KN("GettingStarted").mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QZ6(TutorialActivity tutorialActivity, View view) {
        tutorialActivity.tUK().n(j.Mo.f8429n);
        FragmentTransaction fragmentTransactionO = tutorialActivity.getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        fragmentTransactionO.rl(R.id.content, new ys8()).KN("GettingStarted").mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3L(TutorialActivity tutorialActivity, View view) {
        tutorialActivity.tUK().n(j.Jr.f8412n);
        HI0.Ml.J2(tutorialActivity, f46423M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uf(String link) {
        tUK().n(new j.Iuj(link));
        HI0.Ml.J2(this, link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VwL(TutorialActivity tutorialActivity, View view) {
        tutorialActivity.tUK().n(j.V.f8460n);
        HI0.Ml.J2(tutorialActivity, f46422FX);
    }

    private final RequestQueue W() {
        return AbstractC1468n.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hRu(String url) {
        String path;
        boolean z2;
        boolean z3;
        Uri uri = Uri.parse(url);
        String host = uri.getHost();
        if ((host != null && StringsKt.endsWith$default(host, ".link", false, 2, (Object) null)) || ((path = uri.getPath()) != null && StringsKt.startsWith$default(path, "/am/share/u/", false, 2, (Object) null))) {
            Intrinsics.checkNotNull(uri);
            nYs.j jVarInvoke = ER().invoke();
            if (jVarInvoke != null && jVarInvoke.X()) {
                z2 = true;
            } else {
                z2 = false;
            }
            nYs.j jVarInvoke2 = ER().invoke();
            if (jVarInvoke2 != null && jVarInvoke2.te()) {
                z3 = true;
            } else {
                z3 = false;
            }
            Fg.afx.E(this, uri, z2, z3, tUK(), lLA(), How(), null, kSg(), ER(), new Function2() { // from class: Gu.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TutorialActivity.UhV(this.f3763n, (String) obj, (LM.aC) obj2);
                }
            }, 64, null);
            return;
        }
        Toast.makeText(this, 2132020100, 0).show();
        W().add(new StringRequest(0, url, new Response.Listener() { // from class: Gu.Wre
            @Override // com.android.volley.Response.Listener
            public final void onResponse(Object obj) {
                TutorialActivity.i(this.f3770n, (String) obj);
            }
        }, new Response.ErrorListener() { // from class: Gu.CN3
            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                TutorialActivity.K(this.f3761n, volleyError);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mI(TutorialActivity tutorialActivity, View view) {
        tutorialActivity.tUK().n(j.Jr.f8412n);
        HI0.Ml.J2(tutorialActivity, f46423M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0N(TutorialActivity tutorialActivity, View view) {
        tutorialActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tFV(TutorialActivity tutorialActivity, View view) {
        tutorialActivity.tUK().n(j.tB.f8576n);
        HI0.Ml.J2(tutorialActivity, eF);
    }

    @Override // com.alightcreative.app.motion.tutorial.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        X4T(new PJ9.Ml(this, tUK()));
        g9s g9sVarT = g9s.t(getLayoutInflater());
        this.binding = g9sVarT;
        g9s g9sVar = null;
        if (g9sVarT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVarT = null;
        }
        setContentView(g9sVarT.getRoot());
        f();
        g9s g9sVar2 = this.binding;
        if (g9sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar2 = null;
        }
        g9sVar2.ViF.setLayoutManager(new LinearLayoutManager(this, 0, false));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166417);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131166416);
        g9s g9sVar3 = this.binding;
        if (g9sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar3 = null;
        }
        g9sVar3.ViF.addItemDecoration(new xq(0, dimensionPixelOffset, 0, dimensionPixelOffset2));
        g9s g9sVar4 = this.binding;
        if (g9sVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar4 = null;
        }
        g9sVar4.f9452Z.setLayoutManager(new LinearLayoutManager(this, 0, false));
        g9s g9sVar5 = this.binding;
        if (g9sVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar5 = null;
        }
        g9sVar5.f9452Z.addItemDecoration(new xq(0, getResources().getDimensionPixelOffset(2131166398), 0, getResources().getDimensionPixelOffset(2131166397)));
        g9s g9sVar6 = this.binding;
        if (g9sVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar6 = null;
        }
        g9sVar6.Ik.setLayoutManager(new GridLayoutManager(this, 2));
        g9s g9sVar7 = this.binding;
        if (g9sVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar7 = null;
        }
        g9sVar7.Ik.addItemDecoration(new xq(0, getResources().getDimensionPixelOffset(2131166338), 0, getResources().getDimensionPixelOffset(2131166338)));
        g9s g9sVar8 = this.binding;
        if (g9sVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar8 = null;
        }
        g9sVar8.xMQ.setOnClickListener(new View.OnClickListener() { // from class: Gu.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialActivity.F(this.f3776n, view);
            }
        });
        g9s g9sVar9 = this.binding;
        if (g9sVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar9 = null;
        }
        g9sVar9.HI.setOnClickListener(new View.OnClickListener() { // from class: Gu.fuX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialActivity.QZ6(this.f3775n, view);
            }
        });
        g9s g9sVar10 = this.binding;
        if (g9sVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar10 = null;
        }
        g9sVar10.E2.setOnClickListener(new View.OnClickListener() { // from class: Gu.Dsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialActivity.tFV(this.f3762n, view);
            }
        });
        g9s g9sVar11 = this.binding;
        if (g9sVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar11 = null;
        }
        g9sVar11.az.setOnClickListener(new View.OnClickListener() { // from class: Gu.aC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialActivity.VwL(this.f3772n, view);
            }
        });
        g9s g9sVar12 = this.binding;
        if (g9sVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar12 = null;
        }
        g9sVar12.iF.setOnClickListener(new View.OnClickListener() { // from class: Gu.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialActivity.mI(this.f3760n, view);
            }
        });
        g9s g9sVar13 = this.binding;
        if (g9sVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar13 = null;
        }
        g9sVar13.nr.setOnClickListener(new View.OnClickListener() { // from class: Gu.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialActivity.T3L(this.f3782n, view);
            }
        });
        g9s g9sVar14 = this.binding;
        if (g9sVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g9sVar14 = null;
        }
        g9sVar14.rl.setOnClickListener(new View.OnClickListener() { // from class: Gu.qz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialActivity.Bu(this.f3783n, view);
            }
        });
        g9s g9sVar15 = this.binding;
        if (g9sVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g9sVar = g9sVar15;
        }
        g9sVar.f9450O.setOnClickListener(new View.OnClickListener() { // from class: Gu.Pl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialActivity.p0N(this.f3765n, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        HI0.Ml.nr(this);
        super.onPause();
    }
}
