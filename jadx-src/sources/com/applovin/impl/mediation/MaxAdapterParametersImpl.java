package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.d5;
import com.applovin.impl.k3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f49010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f49011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f49012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f49013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f49014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f49015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f49017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f49018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f49019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxAdFormat f49020l;

    private MaxAdapterParametersImpl() {
    }

    static MaxAdapterParametersImpl a(y2 y2Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((k3) y2Var);
        maxAdapterParametersImplA.f49017i = y2Var.R();
        maxAdapterParametersImplA.f49018j = y2Var.D();
        maxAdapterParametersImplA.f49019k = y2Var.C();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f49020l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f49009a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f49019k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f49018j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f49015g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f49012d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f49010b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f49011c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f49017i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean hasUserConsent() {
        return this.f49013e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isDoNotSell() {
        return this.f49014f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f49016h;
    }

    static MaxAdapterParametersImpl a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(d5Var);
        maxAdapterParametersImplA.f49009a = str;
        maxAdapterParametersImplA.f49020l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    static MaxAdapterParametersImpl a(k3 k3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f49009a = k3Var.getAdUnitId();
        maxAdapterParametersImpl.f49013e = k3Var.n();
        maxAdapterParametersImpl.f49014f = k3Var.o();
        maxAdapterParametersImpl.f49015g = k3Var.d();
        maxAdapterParametersImpl.f49010b = k3Var.i();
        maxAdapterParametersImpl.f49011c = k3Var.l();
        maxAdapterParametersImpl.f49012d = k3Var.f();
        maxAdapterParametersImpl.f49016h = k3Var.p();
        return maxAdapterParametersImpl;
    }
}
