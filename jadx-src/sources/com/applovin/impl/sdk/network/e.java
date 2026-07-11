package com.applovin.impl.sdk.network;

import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.x4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f50439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f50440t;

    public static class a extends a.C0712a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f50441r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f50442s;

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f50383c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i2) {
            this.f50390j = i2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f50382b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f50381a = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f50384d = map;
            return this;
        }

        public a e(String str) {
            this.f50441r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i2) {
            this.f50389i = i2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z2) {
            this.f50394n = z2;
            return this;
        }

        public a h(boolean z2) {
            this.f50442s = z2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z2) {
            this.f50396p = z2;
            return this;
        }

        public a(C1802k c1802k) {
            super(c1802k);
            this.f50388h = ((Integer) c1802k.a(x4.H2)).intValue();
            this.f50389i = ((Integer) c1802k.a(x4.G2)).intValue();
            this.f50390j = ((Integer) c1802k.a(x4.f50791S2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f50385e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i2) {
            this.f50388h = i2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f50386f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f50387g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(AbstractC1810u4.a aVar) {
            this.f50397q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0712a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public static a b(C1802k c1802k) {
        return new a(c1802k);
    }

    public String s() {
        return this.f50439s;
    }

    public boolean t() {
        return this.f50439s != null;
    }

    public boolean u() {
        return this.f50440t;
    }

    protected e(a aVar) {
        super(aVar);
        this.f50439s = aVar.f50441r;
        this.f50440t = aVar.f50442s;
    }
}
