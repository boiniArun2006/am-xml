package com.squareup.moshi;

import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInObject;
import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Deprecated(message = "this moved to avoid a package name conflict in the Java Platform Module System.", replaceWith = @ReplaceWith(expression = "com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory", imports = {}))
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J]\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062,\u0010\b\u001a(\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\n0\n \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\n0\n\u0018\u00010\u000b0\t2\u000e\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\rH\u0097\u0001¨\u0006\u000e"}, d2 = {"Lcom/squareup/moshi/KotlinJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "()V", V8ValueBuiltInObject.FUNCTION_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "p0", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "p1", "", "", "", "p2", "Lcom/squareup/moshi/Moshi;", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KotlinJsonAdapterFactory implements JsonAdapter.Factory {
    private final /* synthetic */ com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory $$delegate_0 = new com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory();

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type p0, Set<? extends Annotation> p1, Moshi p2) {
        com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory kotlinJsonAdapterFactory = this.$$delegate_0;
        Intrinsics.checkNotNullExpressionValue(p0, "create(...)");
        Intrinsics.checkNotNullExpressionValue(p1, "create(...)");
        Intrinsics.checkNotNullExpressionValue(p2, "create(...)");
        return kotlinJsonAdapterFactory.create(p0, p1, p2);
    }
}
