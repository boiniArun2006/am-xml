package com.bendingspoons.crisper.internal.spidersense;

import ajd.j;
import androidx.annotation.Keep;
import bIo.I28;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rB.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ!\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u001cJ!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001f\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/bendingspoons/crisper/internal/spidersense/CrisperSpiderSense;", "", "LrB/Ml;", "spiderSense", "Lcom/caoccao/javet/interop/V8Runtime;", "runtime", "<init>", "(LrB/Ml;Lcom/caoccao/javet/interop/V8Runtime;)V", "Lcom/caoccao/javet/values/reference/V8ValueObject;", "v8Object", "Lajd/j;", c.f62177j, "(Lcom/caoccao/javet/values/reference/V8ValueObject;)Lajd/j;", "debugEventV8", "", "track", "(Lcom/caoccao/javet/values/reference/V8ValueObject;)V", "Lcom/caoccao/javet/values/reference/V8ValueArray;", "category", "", "severity", "description", "errorCode", "info", "trackDebugEvent", "(Lcom/caoccao/javet/values/reference/V8ValueArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/caoccao/javet/values/reference/V8ValueObject;)V", "id", "trackFailableOperationStarted", "(Lcom/caoccao/javet/values/reference/V8ValueObject;Ljava/lang/String;)V", "trackFailableOperationCompleted", "trackFailableOperationCanceled", "trackFailableOperationFailed", "LrB/Ml;", "rl", "Lcom/caoccao/javet/interop/V8Runtime;", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCrisperSpiderSense.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrisperSpiderSense.kt\ncom/bendingspoons/crisper/internal/spidersense/CrisperSpiderSense\n+ 2 JavetExtensions.kt\ncom/bendingspoons/crisper/extensions/JavetExtensionsKt\n*L\n1#1,109:1\n77#2,11:110\n77#2,11:121\n*S KotlinDebug\n*F\n+ 1 CrisperSpiderSense.kt\ncom/bendingspoons/crisper/internal/spidersense/CrisperSpiderSense\n*L\n44#1:110,11\n102#1:121,11\n*E\n"})
public final class CrisperSpiderSense {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Ml spiderSense;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final V8Runtime runtime;

    public CrisperSpiderSense(Ml spiderSense, V8Runtime runtime) {
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        this.spiderSense = spiderSense;
        this.runtime = runtime;
    }

    private final j n(V8ValueObject v8Object) throws JavetException {
        pq.Ml ml;
        V8Value v8Value = v8Object.get("category");
        Intrinsics.checkNotNullExpressionValue(v8Value, "get(...)");
        V8ValueArray v8ValueArray = (V8ValueArray) v8Value;
        ArrayList arrayList = new ArrayList();
        int length = v8ValueArray.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Object object = v8ValueArray.getObject(Integer.valueOf(i2));
            if (object instanceof String) {
                arrayList.add(object);
            }
            if (object instanceof IJavetClosable) {
                ((IJavetClosable) object).close();
            }
        }
        String string = v8Object.getString("severity");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        j.EnumC0481j enumC0481jValueOf = j.EnumC0481j.valueOf(upperCase);
        String strJ2 = I28.J2(v8Object, "description");
        String strJ22 = I28.J2(v8Object, "errorCode");
        V8ValueObject v8ValueObject = (V8ValueObject) v8Object.get("info");
        if (v8ValueObject == null || (ml = I28.az(v8ValueObject)) == null) {
            ml = new pq.Ml();
        }
        return new j(arrayList, enumC0481jValueOf, strJ2, strJ22, ml);
    }

    @Keep
    public final void track(V8ValueObject debugEventV8) {
        Intrinsics.checkNotNullParameter(debugEventV8, "debugEventV8");
        this.spiderSense.t(n(debugEventV8));
    }

    @Keep
    public final void trackDebugEvent(V8ValueArray category, String severity, String description, String errorCode, V8ValueObject info) throws JavetException {
        j.EnumC0481j enumC0481jValueOf;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(info, "info");
        try {
            String upperCase = severity.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            enumC0481jValueOf = j.EnumC0481j.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            enumC0481jValueOf = j.EnumC0481j.f13105t;
        }
        j.EnumC0481j enumC0481j = enumC0481jValueOf;
        Ml ml = this.spiderSense;
        ArrayList arrayList = new ArrayList();
        int length = category.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Object object = category.getObject(Integer.valueOf(i2));
            if (object instanceof String) {
                arrayList.add(object);
            }
            if (object instanceof IJavetClosable) {
                ((IJavetClosable) object).close();
            }
        }
        rB.I28.n(ml, arrayList, enumC0481j, description, errorCode, I28.az(info));
    }

    @Keep
    public final void trackFailableOperationCanceled(V8ValueObject debugEventV8, String id) {
        Intrinsics.checkNotNullParameter(debugEventV8, "debugEventV8");
        this.spiderSense.O().O(n(debugEventV8), id);
    }

    @Keep
    public final void trackFailableOperationCompleted(V8ValueObject debugEventV8, String id) {
        Intrinsics.checkNotNullParameter(debugEventV8, "debugEventV8");
        this.spiderSense.O().t(n(debugEventV8), id);
    }

    @Keep
    public final void trackFailableOperationFailed(V8ValueObject debugEventV8, String id) {
        Intrinsics.checkNotNullParameter(debugEventV8, "debugEventV8");
        this.spiderSense.O().nr(n(debugEventV8), id);
    }

    @Keep
    public final void trackFailableOperationStarted(V8ValueObject debugEventV8, String id) {
        Intrinsics.checkNotNullParameter(debugEventV8, "debugEventV8");
        this.spiderSense.O().rl(n(debugEventV8), id);
    }
}
