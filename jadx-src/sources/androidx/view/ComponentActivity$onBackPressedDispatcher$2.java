package androidx.view;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "t", "()Landroidx/activity/OnBackPressedDispatcher;"}, k = 3, mv = {1, 8, 0})
final class ComponentActivity$onBackPressedDispatcher$2 extends Lambda implements Function0<OnBackPressedDispatcher> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f13197n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComponentActivity$onBackPressedDispatcher$2(ComponentActivity componentActivity) {
        super(0);
        this.f13197n = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final OnBackPressedDispatcher invoke() {
        final ComponentActivity componentActivity = this.f13197n;
        final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.aC
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity$onBackPressedDispatcher$2.nr(componentActivity);
            }
        });
        final ComponentActivity componentActivity2 = this.f13197n;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity$onBackPressedDispatcher$2.O(componentActivity2, onBackPressedDispatcher);
                    }
                });
                return onBackPressedDispatcher;
            }
            componentActivity2.B(onBackPressedDispatcher);
        }
        return onBackPressedDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
        componentActivity.B(onBackPressedDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(ComponentActivity componentActivity) {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e2) {
            if (Intrinsics.areEqual(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e2;
            }
        } catch (NullPointerException e3) {
            if (!Intrinsics.areEqual(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e3;
            }
        }
    }
}
