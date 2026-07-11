package com.alightcreative.share;

import XoT.C;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.share.ChooserResultReceiver;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/alightcreative/share/ChooserResultReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "", "message", "", "rl", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareHelper.kt\ncom/alightcreative/share/ChooserResultReceiver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,351:1\n1#2:352\n*E\n"})
public final class ChooserResultReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(String str, String str2, String str3) {
        return "Selected Application Name : packageName=" + str + " nonLocalizedLabel=" + str2 + " componentName=" + str3;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Set<String> setKeySet;
        ComponentName componentName;
        Object objM313constructorimpl;
        Function1 function1;
        if (context == null || intent == null || intent.getExtras() == null) {
            rl("Malformed intent or missing context");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        Bundle extras = intent.getExtras();
        if (extras != null && (setKeySet = extras.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    componentName = null;
                    break;
                }
                String str = (String) it.next();
                Bundle extras2 = intent.getExtras();
                Object obj = extras2 != null ? extras2.get(str) : null;
                componentName = obj instanceof ComponentName ? (ComponentName) obj : null;
                if (componentName != null) {
                    break;
                }
            }
            if (componentName != null) {
                final String packageName = componentName.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                final String strFlattenToShortString = componentName.flattenToShortString();
                Intrinsics.checkNotNullExpressionValue(strFlattenToShortString, "flattenToShortString(...)");
                try {
                    Result.Companion companion = Result.INSTANCE;
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(componentName.getPackageName(), 128);
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
                    Configuration configuration = new Configuration();
                    configuration.setLocale(Locale.ENGLISH);
                    Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
                    Intrinsics.checkNotNullExpressionValue(resourcesForApplication, "getResourcesForApplication(...)");
                    resourcesForApplication.updateConfiguration(configuration, context.getResources().getDisplayMetrics());
                    objM313constructorimpl = Result.m313constructorimpl(resourcesForApplication.getString(applicationInfo.labelRes));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
                final String str2 = (String) (Result.m319isFailureimpl(objM313constructorimpl) ? null : objM313constructorimpl);
                if (str2 == null) {
                    str2 = "";
                }
                C.Uo(this, new Function0() { // from class: Ken.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChooserResultReceiver.t(packageName, str2, strFlattenToShortString);
                    }
                });
                WeakReference weakReference = j.f46899n;
                if (weakReference == null || (function1 = (Function1) weakReference.get()) == null) {
                    return;
                }
                return;
            }
        }
        rl("Could not resolve the app component name");
    }

    private final void rl(String message) {
        Function1 function1;
        WeakReference weakReference = j.f46899n;
        if (weakReference != null && (function1 = (Function1) weakReference.get()) != null) {
        }
    }
}
