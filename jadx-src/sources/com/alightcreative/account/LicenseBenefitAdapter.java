package com.alightcreative.account;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.NoSuchElementException;
import kgE.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/account/LicenseBenefitAdapter;", "", "<init>", "()V", "LkgE/K;", "benefit", "", "toJson", "(LkgE/K;)Ljava/lang/String;", "fromJson", "(Ljava/lang/String;)LkgE/K;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIAPTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IAPTypes.kt\ncom/alightcreative/account/LicenseBenefitAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,317:1\n1137#2,2:318\n*S KotlinDebug\n*F\n+ 1 IAPTypes.kt\ncom/alightcreative/account/LicenseBenefitAdapter\n*L\n57#1:318,2\n*E\n"})
public final class LicenseBenefitAdapter {
    @FromJson
    public final K fromJson(String benefit) {
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        for (K k2 : K.values()) {
            if (Intrinsics.areEqual(k2.J2(), benefit)) {
                return k2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @ToJson
    public final String toJson(K benefit) {
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        return benefit.J2();
    }
}
