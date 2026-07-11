package com.bendingspoons.crisper.internal;

import Pb7.C;
import Pb7.Pl;
import Pb7.Xo;
import Pb7.qz;
import androidx.annotation.Keep;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.ReflectJvmMapping;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0007\"\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/bendingspoons/crisper/internal/MethodWrapper;", "", "Lcom/caoccao/javet/interop/V8Runtime;", "runtime", "", "argsCount", "Lkotlin/Function1;", "", "LPb7/Pl;", "block", "<init>", "(Lcom/caoccao/javet/interop/V8Runtime;ILkotlin/jvm/functions/Function1;)V", "Lcom/caoccao/javet/values/V8Value;", "parameters", "invoke", "([Lcom/caoccao/javet/values/V8Value;)Lcom/caoccao/javet/values/V8Value;", c.f62177j, "Lcom/caoccao/javet/interop/V8Runtime;", "rl", "I", "t", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/reflect/Method;", "nr", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "invokeMethod", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMethodWrappers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodWrappers.kt\ncom/bendingspoons/crisper/internal/MethodWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 CrisperValue.kt\ncom/bendingspoons/crisper/types/CrisperValueKt\n*L\n1#1,198:1\n1557#2:199\n1628#2,3:200\n37#3:203\n36#3,3:204\n25#4,7:207\n*S KotlinDebug\n*F\n+ 1 MethodWrappers.kt\ncom/bendingspoons/crisper/internal/MethodWrapper\n*L\n37#1:199\n37#1:200,3\n39#1:203\n39#1:204,3\n41#1:207,7\n*E\n"})
public final class MethodWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final V8Runtime runtime;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Method invokeMethod;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int argsCount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function1 block;

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        j(Object obj) {
            super(1, obj, MethodWrapper.class, "invoke", "invoke([Lcom/caoccao/javet/values/V8Value;)Lcom/caoccao/javet/values/V8Value;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final V8Value invoke(V8Value[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((MethodWrapper) this.receiver).invoke(p0);
        }
    }

    public MethodWrapper(V8Runtime runtime, int i2, Function1 block) {
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(block, "block");
        this.runtime = runtime;
        this.argsCount = i2;
        this.block = block;
        Method javaMethod = ReflectJvmMapping.getJavaMethod(new j(this));
        Intrinsics.checkNotNull(javaMethod);
        this.invokeMethod = javaMethod;
    }

    @Keep
    public final V8Value invoke(V8Value... parameters) {
        Pl plNr;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        int length = parameters.length;
        int i2 = this.argsCount;
        if (length > i2) {
            throw new IllegalArgumentException(("JS injected method invoked with wrong number of arguments.\nExpected: <= " + i2 + ",\nReceived " + parameters.length).toString());
        }
        IntRange intRangeUntil = RangesKt.until(0, i2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            V8Value v8Value = (V8Value) ArraysKt.getOrNull(parameters, ((IntIterator) it).nextInt());
            if (v8Value == null || (plNr = MK.j.nr(v8Value)) == null) {
                plNr = qz.f7710n;
            }
            arrayList.add(plNr);
        }
        Pl pl = (Pl) this.block.invoke((Pl[]) arrayList.toArray(new Pl[0]));
        try {
            return Xo.n(pl, this.runtime);
        } finally {
            if (pl instanceof C) {
                ((C) pl).release();
            }
        }
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Method getInvokeMethod() {
        return this.invokeMethod;
    }
}
