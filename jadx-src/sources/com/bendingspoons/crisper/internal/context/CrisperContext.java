package com.bendingspoons.crisper.internal.context;

import androidx.annotation.Keep;
import bIo.Wre;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/crisper/internal/context/CrisperContext;", "", "Lcom/caoccao/javet/interop/V8Runtime;", "runtime", "Lorg/json/JSONObject;", "appInfo", "<init>", "(Lcom/caoccao/javet/interop/V8Runtime;Lorg/json/JSONObject;)V", "Lcom/caoccao/javet/values/reference/V8ValueObject;", "getAppInfo", "()Lcom/caoccao/javet/values/reference/V8ValueObject;", c.f62177j, "Lcom/caoccao/javet/interop/V8Runtime;", "rl", "Lorg/json/JSONObject;", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CrisperContext {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final V8Runtime runtime;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final JSONObject appInfo;

    public CrisperContext(V8Runtime runtime, JSONObject appInfo) {
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        this.runtime = runtime;
        this.appInfo = appInfo;
    }

    @Keep
    public final V8ValueObject getAppInfo() {
        return Wre.xMQ(this.appInfo, this.runtime);
    }
}
