package androidx.compose.foundation.text;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", f = "BasicTextField.kt", i = {0}, l = {Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE}, m = "showTextToolbar", n = {"$this$showTextToolbar_u24lambda_u245"}, s = {"L$1"})
final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f19337O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 f19338S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    /* synthetic */ Object f19339Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f19340g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f19341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f19342o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f19343r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f19344t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, Continuation continuation) {
        super(continuation);
        this.f19338S = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19339Z = obj;
        this.f19340g |= Integer.MIN_VALUE;
        return this.f19338S.n(null, null, this);
    }
}
