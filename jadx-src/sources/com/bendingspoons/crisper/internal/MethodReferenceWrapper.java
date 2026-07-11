package com.bendingspoons.crisper.internal;

import MK.j;
import androidx.annotation.Keep;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kuA.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/bendingspoons/crisper/internal/MethodReferenceWrapper;", "", "", "Lcom/caoccao/javet/values/V8Value;", "parameters", "invoke", "([Lcom/caoccao/javet/values/V8Value;)Lcom/caoccao/javet/values/V8Value;", "Lcom/caoccao/javet/interop/V8Runtime;", c.f62177j, "Lcom/caoccao/javet/interop/V8Runtime;", "runtime", "rl", "Ljava/lang/Object;", "receiver", "Lkotlin/reflect/KFunction;", "t", "Lkotlin/reflect/KFunction;", "method", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MethodReferenceWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final V8Runtime runtime;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object receiver;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final KFunction method;

    @Keep
    public final V8Value invoke(V8Value... parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return j.J2(this.method.callBy(Wre.rl(this.receiver, this.method, parameters)), this.runtime);
    }
}
