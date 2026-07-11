package com.bendingspoons.crisper.internal.pico;

import AR.n;
import CZF.I28;
import androidx.annotation.Keep;
import bIo.Wre;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/bendingspoons/crisper/internal/pico/CrisperPico;", "", "LCZF/I28;", "pico", "Lcom/caoccao/javet/interop/V8Runtime;", "runtime", "<init>", "(LCZF/I28;Lcom/caoccao/javet/interop/V8Runtime;)V", "", c.f62177j, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/caoccao/javet/values/reference/V8ValueObject;", "getUserInfo", "()Lcom/caoccao/javet/values/reference/V8ValueObject;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "data", "track", "(Ljava/lang/String;Lcom/caoccao/javet/values/reference/V8ValueObject;)V", "LCZF/I28;", "rl", "Lcom/caoccao/javet/interop/V8Runtime;", "LAR/I28;", "t", "LAR/I28;", "userInfo", "Lpq/Ml;", "nr", "Lpq/Ml;", "userAdditionalInfo", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCrisperPico.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrisperPico.kt\ncom/bendingspoons/crisper/internal/pico/CrisperPico\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
public final class CrisperPico {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final I28 pico;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Ml userAdditionalInfo;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final V8Runtime runtime;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AR.I28 userInfo;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f51260O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51261n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f51262r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f51263t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51260O = obj;
            this.f51262r |= Integer.MIN_VALUE;
            return CrisperPico.this.n(this);
        }
    }

    public CrisperPico(I28 pico, V8Runtime runtime) {
        Intrinsics.checkNotNullParameter(pico, "pico");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        this.pico = pico;
        this.runtime = runtime;
    }

    @Keep
    public final V8ValueObject getUserInfo() throws JSONException, JavetException {
        V8ValueObject v8ValueObjectXMQ;
        n nVarMUb;
        V8ValueObject v8ValueObjectCreateV8ValueObject;
        AR.j jVarO;
        Map mapJ2;
        String strXMQ;
        String strKN;
        Boolean boolQie;
        Boolean boolGh;
        String strNr;
        String strT;
        String strRl;
        String strN;
        V8ValueObject v8ValueObjectCreateV8ValueObject2 = this.runtime.createV8ValueObject();
        AR.I28 i28 = this.userInfo;
        if (i28 != null && (strN = i28.n()) != null) {
            v8ValueObjectCreateV8ValueObject2.set("appLanguage", strN);
        }
        AR.I28 i282 = this.userInfo;
        if (i282 != null && (strRl = i282.rl()) != null) {
            v8ValueObjectCreateV8ValueObject2.set("appVersion", strRl);
        }
        AR.I28 i283 = this.userInfo;
        if (i283 != null && (strT = i283.t()) != null) {
            v8ValueObjectCreateV8ValueObject2.set("bundleVersion", strT);
        }
        AR.I28 i284 = this.userInfo;
        if (i284 != null && (strNr = i284.nr()) != null) {
            v8ValueObjectCreateV8ValueObject2.set("country", strNr);
        }
        AR.I28 i285 = this.userInfo;
        if (i285 != null) {
            v8ValueObjectCreateV8ValueObject2.set("installedBeforePico", Boolean.valueOf(i285.Uo()));
        }
        AR.I28 i286 = this.userInfo;
        if (i286 != null && (boolGh = i286.gh()) != null) {
            v8ValueObjectCreateV8ValueObject2.set("isBaseline", boolGh);
        }
        AR.I28 i287 = this.userInfo;
        if (i287 != null && (boolQie = i287.qie()) != null) {
            v8ValueObjectCreateV8ValueObject2.set("isFree", boolQie);
        }
        AR.I28 i288 = this.userInfo;
        if (i288 != null && (strKN = i288.KN()) != null) {
            v8ValueObjectCreateV8ValueObject2.set("language", strKN);
        }
        AR.I28 i289 = this.userInfo;
        if (i289 != null && (strXMQ = i289.xMQ()) != null) {
            v8ValueObjectCreateV8ValueObject2.set("locale", strXMQ);
        }
        AR.I28 i2810 = this.userInfo;
        if (i2810 != null && (mapJ2 = i2810.J2()) != null) {
            v8ValueObjectXMQ = Wre.xMQ(new JSONObject(mapJ2), this.runtime);
            try {
                v8ValueObjectCreateV8ValueObject2.set("experiment", v8ValueObjectXMQ);
                AutoCloseableKt.closeFinally(v8ValueObjectXMQ, null);
            } finally {
            }
        }
        AR.I28 i2811 = this.userInfo;
        if (i2811 != null && (jVarO = i2811.O()) != null) {
            v8ValueObjectCreateV8ValueObject = this.runtime.createV8ValueObject();
            v8ValueObjectCreateV8ValueObject.set("androidVersion", jVarO.nr());
            v8ValueObjectCreateV8ValueObject.set("versionRelease", jVarO.O());
            v8ValueObjectCreateV8ValueObject.set("id", jVarO.t());
            v8ValueObjectCreateV8ValueObject.set("manufacturer", jVarO.n());
            v8ValueObjectCreateV8ValueObject.set("model", jVarO.rl());
            v8ValueObjectCreateV8ValueObject.set(AppLovinBridge.f61288f, StringsKt.trim((CharSequence) (jVarO.n() + " " + jVarO.rl())).toString());
            v8ValueObjectCreateV8ValueObject.set("screenSize", Double.valueOf(jVarO.J2()));
            try {
                v8ValueObjectCreateV8ValueObject2.set("device", v8ValueObjectCreateV8ValueObject);
                AutoCloseableKt.closeFinally(v8ValueObjectCreateV8ValueObject, null);
            } finally {
            }
        }
        AR.I28 i2812 = this.userInfo;
        if (i2812 != null && (nVarMUb = i2812.mUb()) != null) {
            v8ValueObjectCreateV8ValueObject = this.runtime.createV8ValueObject();
            v8ValueObjectCreateV8ValueObject.set(AppMeasurementSdk.ConditionalUserProperty.NAME, nVarMUb.rl());
            v8ValueObjectCreateV8ValueObject.set("daylightSaving", Boolean.valueOf(nVarMUb.n()));
            v8ValueObjectCreateV8ValueObject.set("seconds", Integer.valueOf(nVarMUb.t()));
            try {
                v8ValueObjectCreateV8ValueObject2.set("timezone", v8ValueObjectCreateV8ValueObject);
                AutoCloseableKt.closeFinally(v8ValueObjectCreateV8ValueObject, null);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        Ml ml = this.userAdditionalInfo;
        if (ml != null) {
            v8ValueObjectXMQ = Wre.xMQ(new JSONObject(ml.n()), this.runtime);
            try {
                v8ValueObjectCreateV8ValueObject2.set("userAdditionalInfo", v8ValueObjectXMQ);
                Unit unit = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(v8ValueObjectXMQ, null);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(v8ValueObjectCreateV8ValueObject2, "apply(...)");
        return v8ValueObjectCreateV8ValueObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Continuation continuation) {
        j jVar;
        CrisperPico crisperPico;
        CrisperPico crisperPico2;
        CrisperPico crisperPico3;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f51262r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f51262r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objRl = jVar.f51260O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f51262r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            I28 i28 = this.pico;
            jVar.f51261n = this;
            jVar.f51263t = this;
            jVar.f51262r = 1;
            objRl = i28.rl(jVar);
            if (objRl != coroutine_suspended) {
                crisperPico = this;
                crisperPico2 = crisperPico;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            crisperPico3 = (CrisperPico) jVar.f51261n;
            ResultKt.throwOnFailure(objRl);
            crisperPico3.userAdditionalInfo = (Ml) objRl;
            return Unit.INSTANCE;
        }
        crisperPico = (CrisperPico) jVar.f51263t;
        crisperPico2 = (CrisperPico) jVar.f51261n;
        ResultKt.throwOnFailure(objRl);
        crisperPico.userInfo = (AR.I28) objRl;
        I28 i282 = crisperPico2.pico;
        jVar.f51261n = crisperPico2;
        jVar.f51263t = null;
        jVar.f51262r = 2;
        objRl = i282.KN(jVar);
        if (objRl != coroutine_suspended) {
            crisperPico3 = crisperPico2;
            crisperPico3.userAdditionalInfo = (Ml) objRl;
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Keep
    public final void track(String name, V8ValueObject data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data, "data");
        jgV.Wre.n(this.pico, name, bIo.I28.az(data));
    }
}
