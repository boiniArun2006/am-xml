package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzckh extends FrameLayout implements zzcjl {
    private final zzcjl zza;
    private final zzcft zzb;
    private final AtomicBoolean zzc;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.f63168h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzA(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzB(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebView zzD() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclg
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzat() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzcft zzdm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", com.google.android.exoplayer2.C.UTF8_NAME, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcjl
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcjl
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcjc
    public final zzfir zzC() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final List zzF() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzG() {
        this.zza.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzH(int i2) {
        this.zza.zzH(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzI() {
        this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzJ() {
        this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final Context zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcld
    public final zzclv zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final String zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final zzclj zzP() {
        return ((zzcko) this.zza).zzaS();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebViewClient zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcle
    public final zzazh zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final zzfjo zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final zzekb zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final zzejz zzV() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzW() {
        return this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzX() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzY() {
        this.zzb.zzf();
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzZ() {
        return this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        ((zzcko) this.zza).zzaP(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaA(boolean z2, int i2) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbs)).booleanValue()) {
            return false;
        }
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzcjlVar.getParent()).removeView((View) zzcjlVar);
        }
        zzcjlVar.zzaA(z2, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcks
    public final zzfiu zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaD(zzfir zzfirVar, zzfiu zzfiuVar) {
        this.zza.zzaD(zzfirVar, zzfiuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaE(boolean z2) {
        this.zza.zzaE(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final com.google.common.util.concurrent.Xo zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaG(boolean z2) {
        this.zza.zzaG(true);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z2, boolean z3, String str) {
        this.zza.zzaH(zzcVar, z2, z3, str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaI(boolean z2, int i2, boolean z3) {
        this.zza.zzaI(z2, i2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaJ(boolean z2, int i2, String str, boolean z3, boolean z4) {
        this.zza.zzaJ(z2, i2, str, z3, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaK(boolean z2, int i2, String str, String str2, boolean z3) {
        this.zza.zzaK(z2, i2, str, str2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaL(String str, String str2, int i2) {
        this.zza.zzaL(str, str2, 14);
    }

    final /* synthetic */ void zzaM(boolean z2) {
        final zzcjl zzcjlVar = this.zza;
        zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcjlVar);
        zzfynVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcjlVar.destroy();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaa() {
        return this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzab(String str, zzboh zzbohVar) {
        this.zza.zzab(str, zzbohVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzac(String str, zzboh zzbohVar) {
        this.zza.zzac(str, zzbohVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzad(String str, Predicate predicate) {
        this.zza.zzad(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzae(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaf(zzclv zzclvVar) {
        this.zza.zzaf(zzclvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzag(boolean z2) {
        this.zza.zzag(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzah() {
        this.zza.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzai(Context context) {
        this.zza.zzai(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaj(boolean z2) {
        this.zza.zzaj(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzak(zzekb zzekbVar) {
        this.zza.zzak(zzekbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzal(@Nullable zzejz zzejzVar) {
        this.zza.zzal(zzejzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzam(int i2) {
        this.zza.zzam(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzan(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzao(boolean z2) {
        this.zza.zzao(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzap() {
        this.zza.zzap();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaq(@Nullable zzbkf zzbkfVar) {
        this.zza.zzaq(zzbkfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    @Nullable
    public final zzbkf zzar() {
        return this.zza.zzar();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzas(boolean z2) {
        this.zza.zzas(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzau(String str, String str2, @Nullable String str3) {
        this.zza.zzau(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzav() {
        zzekb zzekbVarZzU;
        zzejz zzejzVarZzV;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzc();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzD());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && (zzejzVarZzV = zzV()) != null) {
            zzejzVarZzV.zzf(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue() && (zzekbVarZzU = zzU()) != null && zzekbVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzekbVarZzU.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaw(boolean z2) {
        this.zza.zzaw(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzax(zzbkc zzbkcVar) {
        this.zza.zzax(zzbkcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzay(zzber zzberVar) {
        this.zza.zzay(zzberVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final zzber zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzb(String str, JSONObject jSONObject) {
        ((zzcko) this.zza).zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzc(String str, String str2) {
        this.zza.zzc("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String str, JSONObject jSONObject) {
        this.zza.zzd(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        this.zza.zzdj(zzbddVar);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.zza.zzdl();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzdn(boolean z2) {
        this.zza.zzdn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String str, Map map) {
        this.zza.zze(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final zzckr zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzbhq zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzckx, com.google.android.gms.internal.ads.zzcge
    @Nullable
    public final Activity zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final String zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final String zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzo(int i2) {
        this.zza.zzo(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final zzbhr zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzchr zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclf, com.google.android.gms.internal.ads.zzcge
    public final VersionInfoParcel zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final void zzt(String str, zzchr zzchrVar) {
        this.zza.zzt(str, zzchrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzu(boolean z2, long j2) {
        this.zza.zzu(z2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzv(int i2) {
        this.zzb.zzg(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final void zzw(zzckr zzckrVar) {
        this.zza.zzw(zzckrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzx() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeK)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzy() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeK)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzz() {
        this.zza.zzz();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzckh(zzcjl zzcjlVar, @Nullable zzdxz zzdxzVar) {
        super(zzcjlVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcjlVar;
        this.zzb = new zzcft(zzcjlVar.zzK(), this, this, zzdxzVar);
        addView((View) zzcjlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void destroy() {
        final zzejz zzejzVarZzV;
        final zzekb zzekbVarZzU = zzU();
        if (zzekbVarZzU != null) {
            zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfynVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.zzt.zzu().zzf(zzekbVarZzU.zza());
                }
            });
            final zzcjl zzcjlVar = this.zza;
            Objects.requireNonNull(zzcjlVar);
            zzfynVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjlVar.destroy();
                }
            }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgk)).intValue());
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && (zzejzVarZzV = zzV()) != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcke
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    final zzckh zzckhVar = this.zza;
                    zzejzVarZzV.zze(new zzfsu() { // from class: com.google.android.gms.internal.ads.zzckf
                        @Override // com.google.android.gms.internal.ads.zzfsu
                        public final /* synthetic */ void zza(boolean z2) {
                            zzckhVar.zzaM(true);
                        }
                    });
                }
            });
        } else {
            this.zza.destroy();
        }
    }
}
