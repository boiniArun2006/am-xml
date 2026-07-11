package M;

import KC.FP;
import KC.g;
import QmE.j;
import SJ0.J;
import Sa.AbstractC1468n;
import android.R;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.app.motion.tutorial.CustomSwipeRefresh;
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
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.UUID;
import kP.InterfaceC2210n;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u0002:\u0001gB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR'\u0010O\u001a\u0012\u0012\u0004\u0012\u00020I0Hj\b\u0012\u0004\u0012\u00020I`J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR'\u0010S\u001a\u0012\u0012\u0004\u0012\u00020P0Hj\b\u0012\u0004\u0012\u00020P`J8\u0006¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010NR'\u0010W\u001a\u0012\u0012\u0004\u0012\u00020T0Hj\b\u0012\u0004\u0012\u00020T`J8\u0006¢\u0006\f\n\u0004\bU\u0010L\u001a\u0004\bV\u0010NR\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010!R\u0016\u0010\\\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010!R\u0016\u0010^\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010!R\u0014\u0010a\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006h"}, d2 = {"LM/xTb;", "Landroidx/fragment/app/Fragment;", "LKC/g9s;", "<init>", "()V", "", "ofS", "GR", "", "link", "Y", "(Ljava/lang/String;)V", "url", "M7", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Uo", "LSJ0/J;", "o", "LSJ0/J;", "_binding", "LQmE/iF;", "Z", "LQmE/iF;", "B", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "S", "LkgE/fuX;", "D", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LxAo/I28;", "g", "LxAo/I28;", "FX", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "E2", "LnYs/Ml;", "J", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LkP/n;", "e", "LkP/n;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "Ljava/util/ArrayList;", "Lcom/alightcreative/app/motion/tutorial/entities/TutorialInfo;", "Lkotlin/collections/ArrayList;", "X", "Ljava/util/ArrayList;", "getTutorialInfoList", "()Ljava/util/ArrayList;", "tutorialInfoList", "Lcom/alightcreative/app/motion/tutorial/entities/TipInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getTipInfoList", "tipInfoList", "Lcom/alightcreative/app/motion/tutorial/entities/SampleProjectInfo;", "N", "getSampleProjectInfoList", "sampleProjectInfoList", "", "v", "isRefreshing", "Xw", "firstRefresh", "jB", "validDataRecived", "M", "()LSJ0/J;", "binding", "Lcom/android/volley/RequestQueue;", "I", "()Lcom/android/volley/RequestQueue;", "requestQueue", "U", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class xTb extends I28 implements KC.g9s {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean validDataRecived;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private J _binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isRefreshing;
    public static final int P5 = 8;

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
            super(1, obj, xTb.class, "downloadSampleProject", "downloadSampleProject(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((xTb) this.receiver).M7(p0);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
        w6(Object obj) {
            super(1, obj, xTb.class, "onTutorialPlayClick", "onTutorialPlayClick(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((xTb) this.receiver).Y(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G7(final xTb xtb, VolleyError volleyError) {
        xtb.isRefreshing = false;
        final boolean z2 = xtb.validDataRecived;
        FragmentActivity activity = xtb.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: M.t6
                @Override // java.lang.Runnable
                public final void run() {
                    xTb.fcU(z2, xtb);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eF(xTb xtb, String str) {
        Scene sceneUnserializeScene$default;
        try {
            Intrinsics.checkNotNull(str);
            sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(str, false, false, false, 14, null);
        } catch (MalformedSceneException unused) {
            sceneUnserializeScene$default = null;
        }
        if (sceneUnserializeScene$default == null) {
            Toast.makeText(xtb.getActivity(), "Element Save Failed (" + neA.j.f71200o.rl() + ")", 1).show();
            return;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        FragmentActivity fragmentActivityRequireActivity = xtb.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Intrinsics.checkNotNull(uuidRandomUUID);
        FilesKt.writeText$default(HI0.afx.Z(fragmentActivityRequireActivity, uuidRandomUUID), SceneSerializerKt.serializeScene$default(Scene.copy$default(sceneUnserializeScene$default, null, 0, 0, 0, 0, 0, null, 0, null, null, SceneType.ELEMENT, null, null, 0, 0, 0, false, 0L, null, null, 1047551, null), false, null, false, false, null, 62, null), null, 2, null);
        Toast.makeText(xtb.getActivity(), 2132020096, 1).show();
        KeyEventDispatcher.Component activity = xtb.getActivity();
        Vi.CN3 cn3 = activity instanceof Vi.CN3 ? (Vi.CN3) activity : null;
        if (cn3 != null) {
            cn3.az();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fcU(boolean z2, xTb xtb) {
        if (!z2) {
            xtb.M().aYN.setVisibility(8);
            xtb.M().f9166r.setVisibility(8);
            xtb.M().HI.setVisibility(8);
            xtb.M().f9167t.setVisibility(8);
            Context context = xtb.getContext();
            if (!(context != null ? XoT.fuX.Ik(context) : false)) {
                xtb.M().az.setVisibility(0);
            }
        }
        xtb.M().WPU.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(final xTb xtb, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        xtb.tutorialInfoList.clear();
        JSONArray jSONArray = jSONObject.getJSONArray("tutorials");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            Intrinsics.checkNotNull(jSONObject2);
            xtb.tutorialInfoList.add(new TutorialInfo(jSONObject2));
        }
        xtb.tipInfoList.clear();
        JSONArray jSONArray2 = jSONObject.getJSONArray("tips");
        int length2 = jSONArray2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
            Intrinsics.checkNotNull(jSONObject3);
            xtb.tipInfoList.add(new TipInfo(jSONObject3));
        }
        xtb.sampleProjectInfoList.clear();
        JSONArray jSONArray3 = jSONObject.getJSONArray("sampleProjects");
        int length3 = jSONArray3.length();
        for (int i5 = 0; i5 < length3; i5++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i5);
            Intrinsics.checkNotNull(jSONObject4);
            xtb.sampleProjectInfoList.add(new SampleProjectInfo(jSONObject4));
        }
        xtb.isRefreshing = false;
        xtb.validDataRecived = true;
        FragmentActivity activity = xtb.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: M.U
                @Override // java.lang.Runnable
                public final void run() {
                    xTb.Mx(this.f6378n);
                }
            });
        }
    }

    private final void GR() {
        M().ViF.setAdapter(new Gu.SPz(this.tutorialInfoList, new w6(this)));
        M().f9165o.setAdapter(new g(this.tipInfoList));
        if (this.sampleProjectInfoList.size() >= 4) {
            RecyclerViewEx sampleProjectRecyclerView = M().ck;
            Intrinsics.checkNotNullExpressionValue(sampleProjectRecyclerView, "sampleProjectRecyclerView");
            HI0.o7q.mUb(sampleProjectRecyclerView, new Function0() { // from class: M.IE
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return xTb.Nxk(this.f6276n);
                }
            });
        }
    }

    private final J M() {
        J j2 = this._binding;
        Intrinsics.checkNotNull(j2);
        return j2;
    }

    private final void ofS() {
        if (this.isRefreshing) {
            return;
        }
        this.isRefreshing = true;
        M().WPU.setRefreshing(true);
        String str = com.alightcreative.app.motion.persist.j.INSTANCE.getStagingFeed() ? "https://alight-creative-staging.firebaseapp.com/appdata/am/tutorial-data/android.json" : "https://alightcreative.com/appdata/am/tutorial-data/android.json";
        if (!this.firstRefresh) {
            I().getCache().invalidate(str, false);
        }
        this.firstRefresh = false;
        I().add(new Ml(str, new Response.Listener() { // from class: M.l
            @Override // com.android.volley.Response.Listener
            public final void onResponse(Object obj) throws JSONException {
                xTb.C(this.f6432n, (String) obj);
            }
        }, new Response.ErrorListener() { // from class: M.W
            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                xTb.G7(this.f6381n, volleyError);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p5(xTb xtb, String projectPackageId, LM.aC projectImportResult) {
        Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
        Intrinsics.checkNotNullParameter(projectImportResult, "projectImportResult");
        KeyEventDispatcher.Component activity = xtb.getActivity();
        Vi.CN3 cn3 = activity instanceof Vi.CN3 ? (Vi.CN3) activity : null;
        if (cn3 != null) {
            cn3.WPU(projectPackageId, projectImportResult);
        }
        return Unit.INSTANCE;
    }

    public final QmE.iF B() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final kgE.fuX D() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final xAo.I28 FX() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    public final nYs.Ml J() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    public final InterfaceC2210n a() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = J.t(inflater, container, false);
        CustomSwipeRefresh customSwipeRefreshRl = M().getRoot();
        Intrinsics.checkNotNullExpressionValue(customSwipeRefreshRl, "getRoot(...)");
        return customSwipeRefreshRl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ofS();
        M().ViF.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        M().ViF.addItemDecoration(new yc.xq(0, getResources().getDimensionPixelOffset(2131166417), 0, getResources().getDimensionPixelOffset(2131166416)));
        M().f9165o.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        M().f9165o.addItemDecoration(new yc.xq(0, getResources().getDimensionPixelOffset(2131166398), 0, getResources().getDimensionPixelOffset(2131166397)));
        M().ck.setLayoutManager(new GridLayoutManager(getContext(), 2));
        M().ck.addItemDecoration(new yc.xq(0, getResources().getDimensionPixelOffset(2131166338), 0, getResources().getDimensionPixelOffset(2131166338)));
        M().KN.setOnClickListener(new View.OnClickListener() { // from class: M.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xTb.k(this.f6262n, view2);
            }
        });
        M().ty.setOnClickListener(new View.OnClickListener() { // from class: M.Sw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xTb.dR0(this.f6377n, view2);
            }
        });
        M().f9160X.setOnClickListener(new View.OnClickListener() { // from class: M.xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xTb.z(this.f6546n, view2);
            }
        });
        M().qie.setOnClickListener(new View.OnClickListener() { // from class: M.rfW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xTb.piY(this.f6517n, view2);
            }
        });
        M().E2.setOnClickListener(new View.OnClickListener() { // from class: M.tmw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xTb.ijL(this.f6527n, view2);
            }
        });
        M().nr.setOnClickListener(new View.OnClickListener() { // from class: M.tpM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xTb.m(this.f6528n, view2);
            }
        });
        M().rl.setOnClickListener(new View.OnClickListener() { // from class: M.oJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xTb.eTf(this.f6447n, view2);
            }
        });
        M().WPU.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: M.ys8
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void n() {
                xTb.xg(this.f6549n);
            }
        });
        M().f9159S.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: M.jL
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i2, int i3, int i5, int i7) {
                xTb.pJg(this.f6418n, view2, i2, i3, i5, i7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(xTb xtb, VolleyError volleyError) {
        Toast.makeText(xtb.getActivity(), "Element Download Failed (" + neA.j.f71196Z.rl() + ")", 1).show();
    }

    private final RequestQueue I() {
        return AbstractC1468n.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M7(String url) {
        String path;
        boolean z2;
        boolean z3;
        Uri uri = Uri.parse(url);
        String host = uri.getHost();
        if ((host != null && StringsKt.endsWith$default(host, ".link", false, 2, (Object) null)) || ((path = uri.getPath()) != null && StringsKt.startsWith$default(path, "/am/share/u/", false, 2, (Object) null))) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Intrinsics.checkNotNull(uri);
                nYs.j jVarInvoke = J().invoke();
                if (jVarInvoke != null && jVarInvoke.X()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                nYs.j jVarInvoke2 = J().invoke();
                if (jVarInvoke2 != null && jVarInvoke2.te()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Fg.afx.E(activity, uri, z2, z3, B(), D(), FX(), null, a(), J(), new Function2() { // from class: M.zpl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return xTb.p5(this.f6550n, (String) obj, (LM.aC) obj2);
                    }
                }, 64, null);
                return;
            }
            return;
        }
        Toast.makeText(getActivity(), 2132020100, 0).show();
        I().add(new StringRequest(0, url, new Response.Listener() { // from class: M.ibE
            @Override // com.android.volley.Response.Listener
            public final void onResponse(Object obj) {
                xTb.eF(this.f6413n, (String) obj);
            }
        }, new Response.ErrorListener() { // from class: M.DT
            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                xTb.E(this.f6264n, volleyError);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mx(xTb xtb) {
        xtb.M().WPU.setRefreshing(false);
        xtb.M().aYN.setVisibility(0);
        xtb.M().f9166r.setVisibility(0);
        xtb.M().HI.setVisibility(0);
        xtb.M().f9167t.setVisibility(0);
        xtb.M().az.setVisibility(8);
        xtb.GR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Nxk(xTb xtb) {
        xtb.M().ck.setAdapter(new FP(new ArrayList(xtb.sampleProjectInfoList.subList(0, 4)), Math.min(((xtb.M().HI.getWidth() - (xtb.getResources().getDimensionPixelOffset(2131166337) * 2)) - xtb.getResources().getDimensionPixelOffset(2131166338)) / 2, ((xtb.M().ck.getHeight() - (xtb.getResources().getDimensionPixelOffset(2131166339) * 2)) - xtb.getResources().getDimensionPixelOffset(2131166338)) / 2), new n(xtb)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(String link) {
        B().n(new j.Iuj(link));
        HI0.Ml.Uo(this, link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dR0(xTb xtb, View view) {
        xtb.B().n(j.Mo.f8429n);
        if (xtb.isAdded()) {
            FragmentTransaction fragmentTransactionO = xtb.getParentFragmentManager().o();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
            fragmentTransactionO.rl(R.id.content, new KC.ys8()).KN("GettingStarted").mUb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eTf(xTb xtb, View view) {
        xtb.B().n(j.B.f8374n);
        HI0.Ml.Uo(xtb, "https://alightcreative.com/amhelpcenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ijL(xTb xtb, View view) {
        xtb.B().n(j.Jr.f8412n);
        HI0.Ml.Uo(xtb, "https://alightcreative.com/amuserguide");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(xTb xtb, View view) {
        xtb.B().n(j.qYU.f8555n);
        if (xtb.isAdded()) {
            FragmentTransaction fragmentTransactionO = xtb.getParentFragmentManager().o();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
            fragmentTransactionO.rl(R.id.content, new KC.nKK()).KN("GettingStarted").mUb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(xTb xtb, View view) {
        xtb.B().n(j.Jr.f8412n);
        HI0.Ml.Uo(xtb, "https://alightcreative.com/amuserguide");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pJg(xTb xtb, View view, int i2, int i3, int i5, int i7) {
        KC.rrk rrkVar;
        KeyEventDispatcher.Component activity = xtb.getActivity();
        if (activity instanceof KC.rrk) {
            rrkVar = (KC.rrk) activity;
        } else {
            rrkVar = null;
        }
        if (rrkVar != null) {
            rrkVar.XQ(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void piY(xTb xtb, View view) {
        xtb.B().n(j.V.f8460n);
        HI0.Ml.Uo(xtb, "https://alightcreative.com/amsampleprojects");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xg(xTb xtb) {
        xtb.ofS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(xTb xtb, View view) {
        xtb.B().n(j.tB.f8576n);
        HI0.Ml.Uo(xtb, "https://www.youtube.com/channel/UCjObfxm37TU7zwqmuNXuamg");
    }

    @Override // KC.g9s
    public void Uo() {
        KC.rrk rrkVar;
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof KC.rrk) {
            rrkVar = (KC.rrk) activity;
        } else {
            rrkVar = null;
        }
        if (rrkVar != null) {
            rrkVar.XQ(M().f9159S.getScrollY());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
