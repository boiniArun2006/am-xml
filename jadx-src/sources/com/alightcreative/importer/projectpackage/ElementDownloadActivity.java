package com.alightcreative.importer.projectpackage;

import Fg.afx;
import LM.aC;
import QmE.iF;
import QmE.j;
import SJ0.qz;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.importer.projectpackage.ElementDownloadActivity;
import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.UUID;
import kP.InterfaceC2210n;
import kgE.fuX;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nYs.Ml;
import xAo.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\b\u0005*\u00026:\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/alightcreative/importer/projectpackage/ElementDownloadActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "LSJ0/qz;", "r", "LSJ0/qz;", "binding", "LQmE/iF;", "o", "LQmE/iF;", "G7", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "Z", "LkgE/fuX;", "eWT", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LxAo/I28;", "S", "LxAo/I28;", "Mx", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "g", "LnYs/Ml;", "fcU", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LkP/n;", "E2", "LkP/n;", "ul", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "com/alightcreative/importer/projectpackage/ElementDownloadActivity$j", "e", "Lcom/alightcreative/importer/projectpackage/ElementDownloadActivity$j;", "webChromeClient", "com/alightcreative/importer/projectpackage/ElementDownloadActivity$n", "X", "Lcom/alightcreative/importer/projectpackage/ElementDownloadActivity$n;", "webViewClient", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElementDownloadActivity extends com.alightcreative.importer.projectpackage.j {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public I28 crisperManager;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public fuX iapManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private qz binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j webChromeClient = new j();

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final n webViewClient = new n();

    public static final class j extends WebChromeClient {
        j() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
            qz qzVar = ElementDownloadActivity.this.binding;
            qz qzVar2 = null;
            if (qzVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qzVar = null;
            }
            qzVar.KN.setRefreshing(false);
            qz qzVar3 = ElementDownloadActivity.this.binding;
            if (qzVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qzVar3 = null;
            }
            qzVar3.nr.setMax(100);
            qz qzVar4 = ElementDownloadActivity.this.binding;
            if (qzVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qzVar4 = null;
            }
            qzVar4.nr.setProgress(i2);
            qz qzVar5 = ElementDownloadActivity.this.binding;
            if (qzVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qzVar2 = qzVar5;
            }
            qzVar2.nr.setVisibility(i2 >= 100 ? 4 : 0);
            super.onProgressChanged(webView, i2);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            qz qzVar = ElementDownloadActivity.this.binding;
            qz qzVar2 = null;
            if (qzVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qzVar = null;
            }
            qzVar.KN.setRefreshing(false);
            qz qzVar3 = ElementDownloadActivity.this.binding;
            if (qzVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qzVar2 = qzVar3;
            }
            qzVar2.Uo.setText(str);
            super.onReceivedTitle(webView, str);
        }
    }

    public static final class n extends WebViewClient {
        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(ElementDownloadActivity elementDownloadActivity, String projectPackageId, aC projectImportResult) {
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            Intrinsics.checkNotNullParameter(projectImportResult, "projectImportResult");
            for (UUID uuid : projectImportResult.t()) {
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                jVar.setImportedProjectIds(SetsKt.plus(jVar.getImportedProjectIds(), uuid.toString()));
                iF iFVarG7 = elementDownloadActivity.G7();
                String string = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                iFVarG7.n(new j.ya(string, projectPackageId, SceneType.ELEMENT));
            }
            elementDownloadActivity.setResult(2);
            new AlertDialog.Builder(elementDownloadActivity).o(2132019401).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.Ml
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ElementDownloadActivity.n.nr(dialogInterface, i2);
                }
            }).create().show();
            return Unit.INSTANCE;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String url) throws UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(url, "url");
            if (!StringsKt.contains$default((CharSequence) url, (CharSequence) "/am/share/u/", false, 2, (Object) null)) {
                return false;
            }
            String strDecode = "http://alightcreative.com/am/share/u/" + StringsKt.substringBefore$default(StringsKt.substringAfter$default(url, "/am/share/u/", (String) null, 2, (Object) null), ";", (String) null, 2, (Object) null);
            try {
                strDecode = URLDecoder.decode(strDecode, C.UTF8_NAME);
            } catch (IllegalArgumentException unused) {
            }
            Uri uri = Uri.parse(strDecode);
            iF iFVarG7 = ElementDownloadActivity.this.G7();
            Bundle bundle = new Bundle();
            bundle.putString("url", url);
            Unit unit = Unit.INSTANCE;
            iFVarG7.n(new j.fuX("download_am_element", bundle));
            ElementDownloadActivity elementDownloadActivity = ElementDownloadActivity.this;
            Intrinsics.checkNotNull(uri);
            nYs.j jVarInvoke = ElementDownloadActivity.this.fcU().invoke();
            boolean z2 = jVarInvoke != null && jVarInvoke.X();
            nYs.j jVarInvoke2 = ElementDownloadActivity.this.fcU().invoke();
            boolean z3 = jVarInvoke2 != null && jVarInvoke2.te();
            iF iFVarG72 = ElementDownloadActivity.this.G7();
            fuX fuxEWT = ElementDownloadActivity.this.eWT();
            I28 i28Mx = ElementDownloadActivity.this.Mx();
            InterfaceC2210n interfaceC2210nUl = ElementDownloadActivity.this.ul();
            Ml mlFcU = ElementDownloadActivity.this.fcU();
            final ElementDownloadActivity elementDownloadActivity2 = ElementDownloadActivity.this;
            afx.E(elementDownloadActivity, uri, z2, z3, iFVarG72, fuxEWT, i28Mx, null, interfaceC2210nUl, mlFcU, new Function2() { // from class: Fg.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ElementDownloadActivity.n.t(elementDownloadActivity2, (String) obj, (LM.aC) obj2);
                }
            }, 64, null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void nr(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jk(ElementDownloadActivity elementDownloadActivity) {
        qz qzVar = elementDownloadActivity.binding;
        if (qzVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qzVar = null;
        }
        qzVar.f9607t.reload();
    }

    public final iF G7() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final I28 Mx() {
        I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    public final fuX eWT() {
        fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final Ml fcU() {
        Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        qz qzVar = this.binding;
        qz qzVar2 = null;
        if (qzVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qzVar = null;
        }
        if (!qzVar.f9607t.canGoBack()) {
            super.onBackPressed();
            return;
        }
        qz qzVar3 = this.binding;
        if (qzVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            qzVar2 = qzVar3;
        }
        qzVar2.f9607t.goBack();
    }

    public final InterfaceC2210n ul() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(ElementDownloadActivity elementDownloadActivity, View view) {
        elementDownloadActivity.finish();
    }

    @Override // com.alightcreative.importer.projectpackage.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        qz qzVarT = qz.t(getLayoutInflater());
        this.binding = qzVarT;
        qz qzVar = null;
        if (qzVarT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qzVarT = null;
        }
        setContentView(qzVarT.getRoot());
        qz qzVar2 = this.binding;
        if (qzVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qzVar2 = null;
        }
        qzVar2.f9607t.getSettings().setJavaScriptEnabled(true);
        qz qzVar3 = this.binding;
        if (qzVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qzVar3 = null;
        }
        qzVar3.f9607t.setWebChromeClient(this.webChromeClient);
        qz qzVar4 = this.binding;
        if (qzVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qzVar4 = null;
        }
        qzVar4.f9607t.setWebViewClient(this.webViewClient);
        qz qzVar5 = this.binding;
        if (qzVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qzVar5 = null;
        }
        qzVar5.KN.setRefreshing(true);
        if (com.alightcreative.app.motion.persist.j.INSTANCE.getStagingFeed()) {
            qz qzVar6 = this.binding;
            if (qzVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qzVar6 = null;
            }
            qzVar6.f9607t.loadUrl("https://alight-creative-staging.firebaseapp.com/elements?embed=true");
        } else {
            qz qzVar7 = this.binding;
            if (qzVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qzVar7 = null;
            }
            qzVar7.f9607t.loadUrl("https://alightcreative.com/elements?embed=true");
        }
        qz qzVar8 = this.binding;
        if (qzVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qzVar8 = null;
        }
        qzVar8.nr.setIndeterminate(false);
        qz qzVar9 = this.binding;
        if (qzVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qzVar9 = null;
        }
        qzVar9.f9605O.setOnClickListener(new View.OnClickListener() { // from class: Fg.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ElementDownloadActivity.n1(this.f2945n, view);
            }
        });
        qz qzVar10 = this.binding;
        if (qzVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            qzVar = qzVar10;
        }
        qzVar.KN.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: Fg.n
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void n() {
                ElementDownloadActivity.Jk(this.f2962n);
            }
        });
    }
}
